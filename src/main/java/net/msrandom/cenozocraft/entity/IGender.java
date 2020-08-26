package net.msrandom.cenozocraft.entity;

import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

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
