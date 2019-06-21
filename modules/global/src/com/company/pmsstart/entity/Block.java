package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Block implements EnumClass<String> {

    Blocka("Blocka"),
    Blockb("Blockb"),
    Blockc("Blockc"),
    Blockd("Blockd");

    private String id;

    Block(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Block fromId(String id) {
        for (Block at : Block.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}