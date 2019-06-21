package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Cellnumber implements EnumClass<String> {

    cell1("cell1"),
    cell2("cell2"),
    cell3("cell3");

    private String id;

    Cellnumber(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Cellnumber fromId(String id) {
        for (Cellnumber at : Cellnumber.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}