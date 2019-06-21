package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|country")
@Table(name = "PMSSTART_FOREIGNADDRESS")
@Entity(name = "pmsstart$Foreignaddress")
public class Foreignaddress extends StandardEntity {
    private static final long serialVersionUID = 7862679134303587117L;

    @NotNull
    @Column(name = "COUNTRY", nullable = false)
    protected String country;

    @NotNull
    @Column(name = "TOWN", nullable = false)
    protected String town;

    public void setTown(Town town) {
        this.town = town == null ? null : town.getId();
    }

    public Town getTown() {
        return town == null ? null : Town.fromId(town);
    }


    public void setCountry(Country country) {
        this.country = country == null ? null : country.getId();
    }

    public Country getCountry() {
        return country == null ? null : Country.fromId(country);
    }


}