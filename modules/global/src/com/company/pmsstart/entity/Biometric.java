package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|medicalinformation")
@Table(name = "PMSSTART_BIOMETRIC")
@Entity(name = "pmsstart$Biometric")
public class Biometric extends StandardEntity {
    private static final long serialVersionUID = 7622413041883989044L;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "biometric")
    protected List<Medicalinformation> medicalinformation;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRISONERDETAILS_ID")
    protected Prisonerdetails prisonerdetails;

    public void setPrisonerdetails(Prisonerdetails prisonerdetails) {
        this.prisonerdetails = prisonerdetails;
    }

    public Prisonerdetails getPrisonerdetails() {
        return prisonerdetails;
    }


    public void setMedicalinformation(List<Medicalinformation> medicalinformation) {
        this.medicalinformation = medicalinformation;
    }

    public List<Medicalinformation> getMedicalinformation() {
        return medicalinformation;
    }


}