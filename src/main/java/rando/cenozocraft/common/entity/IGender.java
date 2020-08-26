package rando.cenozocraft.common.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.world.DifficultyInstance;
import net.minecraftforge.fml.relauncher.ReflectionHelper;
import rando.cenozocraft.common.main.CenozocraftMain;

import javax.annotation.Nonnull;
import java.lang.reflect.Method;
import java.util.Random;

@SuppressWarnings("unused")
public interface IGender {

    DataParameter<Boolean> GENDER = EntityDataManager.createKey(CenozocraftEntityBase.class, DataSerializers.BOOLEAN);

    default EnumGender getGender() {
        if (this instanceof CenozocraftEntityBase) return EnumGender.getFromBoolean(((CenozocraftEntityBase) this).getDataManager().get(GENDER));
        return EnumGender.FEMALE;
    }

    default void setGender(EnumGender gender) {
        if (this instanceof CenozocraftEntityBase) ((CenozocraftEntityBase) this).getDataManager().set(GENDER, EnumGender.getFromGender(gender));
    }

    enum EnumGender {
        MALE,
        FEMALE;

        public static EnumGender getFromBoolean(boolean gender) {
            return gender ? FEMALE : MALE;
        }

        public static boolean getFromGender(EnumGender gender) {
            return gender == FEMALE;
        }
    }
}
