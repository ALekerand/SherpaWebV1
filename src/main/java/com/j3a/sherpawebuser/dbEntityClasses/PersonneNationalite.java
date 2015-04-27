/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "personne_nationalite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonneNationalite.findAll", query = "SELECT p FROM PersonneNationalite p"),
    @NamedQuery(name = "PersonneNationalite.findByCodeNationalite", query = "SELECT p FROM PersonneNationalite p WHERE p.personneNationalitePK.codeNationalite = :codeNationalite"),
    @NamedQuery(name = "PersonneNationalite.findByNumSouscripteur", query = "SELECT p FROM PersonneNationalite p WHERE p.personneNationalitePK.numSouscripteur = :numSouscripteur"),
    @NamedQuery(name = "PersonneNationalite.findByDateNationalite", query = "SELECT p FROM PersonneNationalite p WHERE p.dateNationalite = :dateNationalite")})
public class PersonneNationalite implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected PersonneNationalitePK personneNationalitePK;
    @Column(name = "DATE_NATIONALITE")
    @Temporal(TemporalType.DATE)
    private Date dateNationalite;
    @JoinColumn(name = "NUM_SOUSCRIPTEUR", referencedColumnName = "NUM_SOUSCRIPTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personne personne;
    @JoinColumn(name = "CODE_NATIONALITE", referencedColumnName = "CODE_NATIONALITE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Nationalite nationalite;

    public PersonneNationalite() {
    }

    public PersonneNationalite(PersonneNationalitePK personneNationalitePK) {
        this.personneNationalitePK = personneNationalitePK;
    }

    public PersonneNationalite(int codeNationalite, String numSouscripteur) {
        this.personneNationalitePK = new PersonneNationalitePK(codeNationalite, numSouscripteur);
    }

    public PersonneNationalitePK getPersonneNationalitePK() {
        return personneNationalitePK;
    }

    public void setPersonneNationalitePK(PersonneNationalitePK personneNationalitePK) {
        this.personneNationalitePK = personneNationalitePK;
    }

    public Date getDateNationalite() {
        return dateNationalite;
    }

    public void setDateNationalite(Date dateNationalite) {
        this.dateNationalite = dateNationalite;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    public Nationalite getNationalite() {
        return nationalite;
    }

    public void setNationalite(Nationalite nationalite) {
        this.nationalite = nationalite;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (personneNationalitePK != null ? personneNationalitePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonneNationalite)) {
            return false;
        }
        PersonneNationalite other = (PersonneNationalite) object;
        if ((this.personneNationalitePK == null && other.personneNationalitePK != null) || (this.personneNationalitePK != null && !this.personneNationalitePK.equals(other.personneNationalitePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PersonneNationalite[ personneNationalitePK=" + personneNationalitePK + " ]";
    }
    
}
