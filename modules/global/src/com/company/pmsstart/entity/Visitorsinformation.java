package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|name")
@Table(name = "PMSSTART_VISITORSINFORMATION")
@Entity(name = "pmsstart$Visitorsinformation")
public class Visitorsinformation extends StandardEntity {
    private static final long serialVersionUID = 2321004414343862249L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @NotNull
    @Column(name = "RELATIONSHIPWITHINMATE", nullable = false)
    protected String relationshipwithinmate;

    @Column(name = "TELEPHONENUMBER")
    protected String telephonenumber;

    @Column(name = "ADDRESS")
    protected String address;

    public void setRelationshipwithinmate(Relationshipwithinmate relationshipwithinmate) {
        this.relationshipwithinmate = relationshipwithinmate == null ? null : relationshipwithinmate.getId();
    }

    public Relationshipwithinmate getRelationshipwithinmate() {
        return relationshipwithinmate == null ? null : Relationshipwithinmate.fromId(relationshipwithinmate);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTelephonenumber(String telephonenumber) {
        this.telephonenumber = telephonenumber;
    }

    public String getTelephonenumber() {
        return telephonenumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }


}