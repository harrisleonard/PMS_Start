package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@NamePattern("%s|temperature")
@Table(name = "PMSSTART_MEDICALINFORMATION")
@Entity(name = "pmsstart$Medicalinformation")
public class Medicalinformation extends StandardEntity {
    private static final long serialVersionUID = 2429618997550660598L;

    @NotNull
    @Column(name = "HEIGHT", nullable = false)
    protected Integer height;

    @NotNull
    @Column(name = "WEIGHT", nullable = false)
    protected Integer weight;

    @NotNull
    @Column(name = "BLOODPRESSURE", nullable = false)
    protected Integer bloodpressure;

    @Column(name = "TEMPERATURE")
    protected Integer temperature;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BIOMETRIC_ID")
    protected Biometric biometric;

    public void setBiometric(Biometric biometric) {
        this.biometric = biometric;
    }

    public Biometric getBiometric() {
        return biometric;
    }



    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getHeight() {
        return height;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setBloodpressure(Integer bloodpressure) {
        this.bloodpressure = bloodpressure;
    }

    public Integer getBloodpressure() {
        return bloodpressure;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }

    public Integer getTemperature() {
        return temperature;
    }


}