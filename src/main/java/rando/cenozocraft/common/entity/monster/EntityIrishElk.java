package rando.cenozocraft.common.entity.monster;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import rando.cenozocraft.common.entity.IGender;

import javax.annotation.Nonnull;

public class EntityIrishElk extends CenozocraftMonsterBase implements IGender {

    public EntityIrishElk(World worldIn) {
        super(worldIn);
        this.setSize(1, 0.5f);
        this.setTameDifficulty(1f);
        this.setHostileChance(0.25f);
    }

    @Override
    public void entityInit() {
        super.entityInit();
        this.dataManager.register(GENDER, false);
    }

    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingData) {
        livingData = super.onInitialSpawn(difficulty, livingData);
        this.setGender(EnumGender.getFromBoolean(rand.nextBoolean()));
        return livingData;
    }

    @Override
    public boolean canMateWith(@Nonnull EntityAnimal otherAnimal) {
        return otherAnimal instanceof EntityIrishElk && ((EntityIrishElk) otherAnimal).getGender() != this.getGender() && super.canMateWith(otherAnimal);
    }

    @Override
    public void writeEntityToNBT(NBTTagCompound compound) {
        super.writeEntityToNBT(compound);
        compound.setBoolean("gender", EnumGender.getFromGender(this.getGender()));
    }

    @Override
    public void readEntityFromNBT(NBTTagCompound compound) {
        super.readEntityFromNBT(compound);
        this.setGender(EnumGender.getFromBoolean(compound.getBoolean("gender")));
    }
}
