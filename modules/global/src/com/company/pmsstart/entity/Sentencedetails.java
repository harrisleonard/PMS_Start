package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.Column;
import javax.persistence.Lob;
import javax.validation.constraints.NotNull;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Table(name = "PMSSTART_SENTENCEDETAILS")
@Entity(name = "pmsstart$Sentencedetails")
public class Sentencedetails extends StandardEntity {
    private static final long serialVersionUID = -3937370992233533718L;
    @NotNull
    @Column(name = "SENTENCELENGHTH", nullable = false)
    protected String sentencelenghth;

    @NotNull
    @Column(name = "OFFENCETYPE", nullable = false)
    protected String offencetype;

    @Lob
    @Column(name = "REMARKS")
    protected String remarks;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRISONERDETAILS_ID")
    protected Prisonerdetails prisonerdetails;

    public void setPrisonerdetails(Prisonerdetails prisonerdetails) {
        this.prisonerdetails = prisonerdetails;
    }

    public Prisonerdetails getPrisonerdetails() {
        return prisonerdetails;
    }


    public Offencetype getOffencetype() {
        return offencetype == null ? null : Offencetype.fromId(offencetype);
    }

    public void setOffencetype(Offencetype offencetype) {
        this.offencetype = offencetype == null ? null : offencetype.getId();
    }


    public Sentencelength getSentencelenghth() {
        return sentencelenghth == null ? null : Sentencelength.fromId(sentencelenghth);
    }

    public void setSentencelenghth(Sentencelength sentencelenghth) {
        this.sentencelenghth = sentencelenghth == null ? null : sentencelenghth.getId();
    }


    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }



}