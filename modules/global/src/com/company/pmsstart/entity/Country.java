package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Country implements EnumClass<String> {

    Tanzania("Tanzania"),
    Uganda("Uganda"),
    Nigeria("Nigeria"),
    Congo("Congo");

    private String id;

    Country(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Country fromId(String id) {
        for (Country at : Country.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}