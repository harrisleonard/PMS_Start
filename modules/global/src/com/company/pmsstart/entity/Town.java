package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Town implements EnumClass<String> {

    Abuja("Abuja"),
    Kampala("Kampala"),
    Dodoma("Dodoma");

    private String id;

    Town(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Town fromId(String id) {
        for (Town at : Town.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}