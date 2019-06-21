package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|description,natureofproperty")
@Table(name = "PMSSTART_PRISONERPROPERTY")
@Entity(name = "pmsstart$Prisonerproperty")
public class Prisonerproperty extends StandardEntity {
    private static final long serialVersionUID = 7888942758042069014L;

    @NotNull
    @Column(name = "NATUREOFPROPERTY", nullable = false)
    protected String natureofproperty;

    @Column(name = "SERIALNUMBER")
    protected String serialnumber;

    @Column(name = "DESCRIPTION")
    protected String description;

    @Column(name = "REMARKS")
    protected String remarks;

    public void setNatureofproperty(String natureofproperty) {
        this.natureofproperty = natureofproperty;
    }

    public String getNatureofproperty() {
        return natureofproperty;
    }

    public void setSerialnumber(String serialnumber) {
        this.serialnumber = serialnumber;
    }

    public String getSerialnumber() {
        return serialnumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }


}