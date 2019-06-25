package com.company.pmsstart.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;

@NamePattern("%s|fullname")
@Table(name = "PMSSTART_PRISONERDETAILS")
@Entity(name = "pmsstart$Prisonerdetails")
public class Prisonerdetails extends StandardEntity {
    private static final long serialVersionUID = -5913866529557178681L;

    @NotNull
    @Column(name = "FULLNAME", nullable = false)
    protected String fullname;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prisonerdetails")
    protected List<Foreignaddress> foreignaddress;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prisonerdetails")
    protected List<Nextofkin> nextofkin;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prisonerdetails")
    protected List<Sentencedetails> sentencedetails;

    @NotNull
    @Column(name = "GENDER", nullable = false)
    protected String gender;

    @NotNull
    @Column(name = "COUNTY", nullable = false)
    protected String county;

    @NotNull
    @Column(name = "NATIONALITY", nullable = false)
    protected String nationality;

    @NotNull
    @Column(name = "EMPLOYMENTTYPE", nullable = false)
    protected String employmenttype;

    @NotNull
    @Column(name = "CONSTITUENCY", nullable = false)
    protected String constituency;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATEOFBIRTH", nullable = false)
    protected Date dateofbirth;

    @NotNull
    @Column(name = "IDNUMBER_PASSPORTNUMBER", nullable = false)
    protected String idnumber_passportnumber;

    @NotNull
    @Column(name = "PHONENUMBER", nullable = false)
    protected Integer phonenumber;



    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "prisonerdetails")
    protected List<Biometric> biometric;

    public void setBiometric(List<Biometric> biometric) {
        this.biometric = biometric;
    }

    public List<Biometric> getBiometric() {
        return biometric;
    }


    public void setForeignaddress(List<Foreignaddress> foreignaddress) {
        this.foreignaddress = foreignaddress;
    }

    public List<Foreignaddress> getForeignaddress() {
        return foreignaddress;
    }


    public void setSentencedetails(List<Sentencedetails> sentencedetails) {
        this.sentencedetails = sentencedetails;
    }

    public List<Sentencedetails> getSentencedetails() {
        return sentencedetails;
    }


    public void setNextofkin(List<Nextofkin> nextofkin) {
        this.nextofkin = nextofkin;
    }

    public List<Nextofkin> getNextofkin() {
        return nextofkin;
    }


    public void setGender(Gender gender) {
        this.gender = gender == null ? null : gender.getId();
    }

    public Gender getGender() {
        return gender == null ? null : Gender.fromId(gender);
    }

    public void setCounty(County county) {
        this.county = county == null ? null : county.getId();
    }

    public County getCounty() {
        return county == null ? null : County.fromId(county);
    }

    public void setNationality(Nationality nationality) {
        this.nationality = nationality == null ? null : nationality.getId();
    }

    public Nationality getNationality() {
        return nationality == null ? null : Nationality.fromId(nationality);
    }

    public void setEmploymenttype(Employmenttype employmenttype) {
        this.employmenttype = employmenttype == null ? null : employmenttype.getId();
    }

    public Employmenttype getEmploymenttype() {
        return employmenttype == null ? null : Employmenttype.fromId(employmenttype);
    }

    public void setConstituency(Constittuency constituency) {
        this.constituency = constituency == null ? null : constituency.getId();
    }

    public Constittuency getConstituency() {
        return constituency == null ? null : Constittuency.fromId(constituency);
    }

    public void setDateofbirth(Date dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public Date getDateofbirth() {
        return dateofbirth;
    }

    public void setIdnumber_passportnumber(String idnumber_passportnumber) {
        this.idnumber_passportnumber = idnumber_passportnumber;
    }

    public String getIdnumber_passportnumber() {
        return idnumber_passportnumber;
    }


    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getFullname() {
        return fullname;
    }

    public void setPhonenumber(Integer phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Integer getPhonenumber() {
        return phonenumber;
    }


}