package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Relationshipwithinmate implements EnumClass<String> {

    Father("father"),
    Mother("mother"),
    Husband("husband"),
    Wife("wife"),
    Others("others");

    private String id;

    Relationshipwithinmate(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Relationshipwithinmate fromId(String id) {
        for (Relationshipwithinmate at : Relationshipwithinmate.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}