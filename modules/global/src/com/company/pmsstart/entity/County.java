package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum County implements EnumClass<String> {

    Kiambu("kiambu"),
    Nairobi("Nairobi"),
    Machakos("Machakos"),
    Nakuru("Nakuru");

    private String id;

    County(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static County fromId(String id) {
        for (County at : County.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}