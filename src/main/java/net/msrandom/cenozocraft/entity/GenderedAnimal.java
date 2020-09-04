package net.msrandom.cenozocraft.entity;

import net.minecraft.entity.data.DataTracker;
import net.minecraft.entity.data.TrackedData;
import net.minecraft.entity.data.TrackedDataHandlerRegistry;

@SuppressWarnings("unused")
public interface GenderedAnimal {
    TrackedData<Boolean> GENDER = DataTracker.registerData(CenozoCraftEntityBase.class, TrackedDataHandlerRegistry.BOOLEAN);

    default CenozoCraftGender getGender() {
        if (this instanceof CenozoCraftEntityBase) return CenozoCraftGender.getFromBoolean(((CenozoCraftEntityBase) this).getDataTracker().get(GENDER));
        return CenozoCraftGender.FEMALE;
    }

    default void setGender(CenozoCraftGender gender) {
        if (this instanceof CenozoCraftEntityBase) ((CenozoCraftEntityBase) this).getDataTracker().set(GENDER, CenozoCraftGender.getFromGender(gender));
    }

    enum CenozoCraftGender {
        MALE,
        FEMALE;

        public static CenozoCraftGender getFromBoolean(boolean gender) {
            return gender ? FEMALE : MALE;
        }

        public static boolean getFromGender(CenozoCraftGender gender) {
            return gender == FEMALE;
        }
    }
}
