package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Relationship implements EnumClass<String> {

    Father("Father"),
    Mother("Mother"),
    Husband("Husband"),
    Wife("Wife"),
    Others("Others");

    private String id;

    Relationship(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Relationship fromId(String id) {
        for (Relationship at : Relationship.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}