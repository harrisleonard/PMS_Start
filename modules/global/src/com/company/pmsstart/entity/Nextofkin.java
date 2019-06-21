package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|nextofkinname")
@Table(name = "PMSSTART_NEXTOFKIN")
@Entity(name = "pmsstart$Nextofkin")
public class Nextofkin extends StandardEntity {
    private static final long serialVersionUID = -831597826137969756L;

    @NotNull
    @Column(name = "NEXTOFKINNAME", nullable = false)
    protected String nextofkinname;

    @Column(name = "PHONENUMBER")
    protected Integer phonenumber;

    @NotNull
    @Column(name = "RELATIONSHIP", nullable = false)
    protected String relationship;

    public void setNextofkinname(String nextofkinname) {
        this.nextofkinname = nextofkinname;
    }

    public String getNextofkinname() {
        return nextofkinname;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship == null ? null : relationship.getId();
    }

    public Relationship getRelationship() {
        return relationship == null ? null : Relationship.fromId(relationship);
    }


}