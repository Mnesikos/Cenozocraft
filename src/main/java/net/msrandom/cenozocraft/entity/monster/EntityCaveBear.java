package net.msrandom.cenozocraft.entity.monster;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.World;

public class EntityCaveBear extends CenozocraftMonsterBase {

    private static final DataParameter<Boolean> STANDING = EntityDataManager.createKey(EntityCaveBear.class, DataSerializers.BOOLEAN);

    public EntityCaveBear(World worldIn) {
        super(worldIn);
        this.setSize(1.5f, 1);
        this.setTameDifficulty(1.6f);
        this.setHostileChance(0.5f);
    }

    @Override
    public void entityInit() {
        super.entityInit();
        this.dataManager.register(STANDING, false);
    }

    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("standing", isStanding());
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setStanding(compound.getBoolean("standing"));
    }

    @Override
    public int getVariantNumber() {
        return super.getVariantNumber() / 2;
    }

    private void setStanding(boolean standing) {
        this.dataManager.set(STANDING, standing);
    }

    public boolean isStanding(){
        return this.dataManager.get(STANDING);
    }
}
