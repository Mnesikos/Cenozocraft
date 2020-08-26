package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.ai.EntityAITargetNonTamed;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import net.msrandom.cenozocraft.entity.CenozocraftEntityBase;

import javax.annotation.Nonnull;
import java.util.*;
import java.util.function.Predicate;

public abstract class CenozocraftMonsterBase extends CenozocraftEntityBase implements IMob {

    private static final DataParameter<Byte> TYPE = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.BYTE);
    public Map<UUID, Integer> friends = new HashMap<>();
    private int hostileChance = 0;

    CenozocraftMonsterBase(World worldIn) {
        super(worldIn);
        this.setTameDifficulty(1);
    }

    public void entityInit(){
        super.entityInit();
        this.dataManager.register(TYPE, (byte)0);
    }

    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingData){
        livingData = super.onInitialSpawn(difficulty, livingData);
        this.setType(this.rand.nextInt(hostileChance)==0?(this.rand.nextBoolean()? EnumType.HOSTILE: EnumType.NEUTRAL): EnumType.PASSIVE);
        return livingData;
    }

    @Override
    protected void applyEntityAI() {
        super.applyEntityAI();
        this.targetTasks.addTask(0, new AIAttack<>(this, EntityPlayer.class));
        this.targetTasks.addTask(0, new AIAttack<>(this, CenozocraftEntityBase.class, input -> !(input instanceof CenozocraftMonsterBase)));
    }

    @Override
    public boolean attackEntityFrom(@Nonnull DamageSource source, float amount) {
        if(getType() != EnumType.PASSIVE && source.getTrueSource() instanceof  EntityLivingBase) this.setRevengeTarget((EntityLivingBase) source.getTrueSource());
        return super.attackEntityFrom(source, amount);
    }

    @Override
    public void onLivingUpdate() {
        for(Map.Entry<UUID, Integer> set : friends.entrySet()) {
            if(set.getValue() > 1000) friends.remove(set.getKey());
            else friends.replace(set.getKey(), set.getValue()+1);
        }
        super.onLivingUpdate();
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setInteger("type", getType().ordinal());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setType(EnumType.values()[compound.getInteger("type")]);
    }

    private void setType(EnumType type) {
        this.dataManager.set(TYPE, (byte) type.ordinal());
    }

    private EnumType getType(){
        return EnumType.values()[this.dataManager.get(TYPE)];
    }

    void setHostileChance(float chance){
        hostileChance = chance==0?0:Math.round(1 / chance);
    }

    protected static class AIAttack<T extends EntityLivingBase> extends EntityAITargetNonTamed<T>{

        private final CenozocraftMonsterBase entity;

        AIAttack(CenozocraftMonsterBase entity, Class<T> classTarget, Predicate<? super T > targetSelector) {
            super(entity, classTarget, true, input -> (targetSelector != null && !targetSelector.test(input)) || (entity.getType() == EnumType.NEUTRAL && input != entity.getRevengeTarget()) && (!(input instanceof EntityPlayer) || !entity.friends.containsKey(input.getUniqueID())));
            this.entity = entity;
        }

        AIAttack(CenozocraftMonsterBase entity, Class<T> target) {
            this(entity, target, null);
        }

        @Override
        public boolean shouldExecute() {
            return entity.getType() != EnumType.PASSIVE && (entity.getType() != EnumType.NEUTRAL || entity.getRevengeTarget() != null);
        }
    }

    public enum EnumType {
        HOSTILE,
        PASSIVE,
        NEUTRAL
    }
}
