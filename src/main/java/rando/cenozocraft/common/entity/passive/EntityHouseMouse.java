package rando.cenozocraft.common.entity.passive;

import net.minecraft.entity.IEntityLivingData;
import net.minecraft.init.Items;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;
import rando.cenozocraft.common.entity.CenozocraftEntityBase;

public class EntityHouseMouse extends CenozocraftEntityBase {

    private static final DataParameter<Integer> VARIANT = EntityDataManager.createKey(EntityHouseMouse.class, DataSerializers.VARINT);

    public EntityHouseMouse(World worldIn) {
        super(worldIn);
        this.setTamable(Items.BEETROOT_SEEDS, Items.MELON_SEEDS, Items.PUMPKIN_SEEDS, Items.WHEAT_SEEDS);
    }

    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, IEntityLivingData livingData){
        this.setVariant(this.rand.nextInt(3));
        return super.onInitialSpawn(difficulty, livingData);
    }

    public void entityInit(){
        this.dataManager.register(VARIANT, 0);
        super.entityInit();
    }

    private void setVariant(int value){
        this.dataManager.set(VARIANT, value);
    }

    public int getVariant(){
        return this.dataManager.get(VARIANT);
    }

    public void writeEntityToNBT(NBTTagCompound compound)
    {
        compound.setInteger("variant", getVariant());
        super.writeEntityToNBT(compound);
    }

    public void readEntityFromNBT(NBTTagCompound compound) {
        this.setVariant(compound.getInteger("variant"));
        super.readEntityFromNBT(compound);
    }
}
