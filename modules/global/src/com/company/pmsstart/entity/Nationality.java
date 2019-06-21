package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Nationality implements EnumClass<String> {

    Kenya("Kenya"),
    Others("Others");

    private String id;

    Nationality(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Nationality fromId(String id) {
        for (Nationality at : Nationality.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}