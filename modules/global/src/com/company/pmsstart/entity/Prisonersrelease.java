package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s|reasonsforrelease")
@Table(name = "PMSSTART_PRISONERSRELEASE")
@Entity(name = "pmsstart$Prisonersrelease")
public class Prisonersrelease extends StandardEntity {
    private static final long serialVersionUID = -8176657393396365401L;

    @NotNull
    @Column(name = "REASONSFORRELEASE", nullable = false)
    protected String reasonsforrelease;

    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    @Column(name = "RELEASEDATE", nullable = false)
    protected Date releasedate;

    public void setReasonsforrelease(Reasonsforrelease reasonsforrelease) {
        this.reasonsforrelease = reasonsforrelease == null ? null : reasonsforrelease.getId();
    }

    public Reasonsforrelease getReasonsforrelease() {
        return reasonsforrelease == null ? null : Reasonsforrelease.fromId(reasonsforrelease);
    }

    public void setReleasedate(Date releasedate) {
        this.releasedate = releasedate;
    }

    public Date getReleasedate() {
        return releasedate;
    }


}