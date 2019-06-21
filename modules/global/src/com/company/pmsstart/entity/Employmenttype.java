package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Employmenttype implements EnumClass<String> {

    Employed("Employed"),
    Selfemployed("Selfemployed"),
    Others("Others");

    private String id;

    Employmenttype(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Employmenttype fromId(String id) {
        for (Employmenttype at : Employmenttype.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}