package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Offencetype implements EnumClass<String> {
    bankingandinsurancecounterfeitEmbezzlement("bankingandinsurancecounterfeitEmbezzlement"),
    courtsorcorrections("courtsorcorrections"),
    drugOffenses("drugOffenses"),
    extortionfraudbribery("extortionfraudbribery	"),
    homicideaggravatedassaultandkidnappingoffenses("homicideaggravatedassaultandkidnappingoffenses"),
    immigration("immigration"),
    miscellaneous("miscellaneous"),
    nationalsecurity("nationalsecurity"),
    sexoffenses("sexoffenses"),
    weaponsexplosivesarson("weaponsexplosivesarson"),
    others("others");

    private String id;

    Offencetype(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Offencetype fromId(String id) {
        for (Offencetype at : Offencetype.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}