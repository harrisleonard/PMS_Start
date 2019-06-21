package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Constittuency implements EnumClass<String> {

    Kasarani("Kasarani"),
    Thika("Thika"),
    Kisauni("Kisauni"),
    Mathira("Mathira");

    private String id;

    Constittuency(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Constittuency fromId(String id) {
        for (Constittuency at : Constittuency.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}