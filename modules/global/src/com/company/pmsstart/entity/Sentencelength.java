package com.company.pmsstart.entity;

import com.haulmont.chile.core.datatypes.impl.EnumClass;

import javax.annotation.Nullable;


public enum Sentencelength implements EnumClass<String> {

    sentenceunder2years("sentenceunder2years"),
    sentenceover2years("sentenceover2years"),
    extendedsentences("extendedsentences"),
    lifesentences("lifesentences");

    private String id;

    Sentencelength(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static Sentencelength fromId(String id) {
        for (Sentencelength at : Sentencelength.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}