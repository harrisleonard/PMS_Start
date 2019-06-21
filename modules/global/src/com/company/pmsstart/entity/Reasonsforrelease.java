package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Reasonsforrelease implements EnumClass<String> {

    Homedetentioncurfew("Homedetentioncurfew"),
    Releaseonlicense("Releaseonlicense"),
    Parole("Parole"),
    Recalltoprison("Recalltoprison"),
    Rehabilitationofoffendersact("Rehabilitationofoffendersact"),
    releaseontemporarylicense("releaseontemporarylicense"),
    death("death");

    private String id;

    Reasonsforrelease(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Reasonsforrelease fromId(String id) {
        for (Reasonsforrelease at : Reasonsforrelease.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}