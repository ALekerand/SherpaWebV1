/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author J3A-AFRIQUE
 */
@Embeddable
public class PersonneNationalitePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NATIONALITE")
    private int codeNationalite;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_SOUSCRIPTEUR")
    private String numSouscripteur;

    public PersonneNationalitePK() {
    }

    public PersonneNationalitePK(int codeNationalite, String numSouscripteur) {
        this.codeNationalite = codeNationalite;
        this.numSouscripteur = numSouscripteur;
    }

    public int getCodeNationalite() {
        return codeNationalite;
    }

    public void setCodeNationalite(int codeNationalite) {
        this.codeNationalite = codeNationalite;
    }

    public String getNumSouscripteur() {
        return numSouscripteur;
    }

    public void setNumSouscripteur(String numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeNationalite;
        hash += (numSouscripteur != null ? numSouscripteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonneNationalitePK)) {
            return false;
        }
        PersonneNationalitePK other = (PersonneNationalitePK) object;
        if (this.codeNationalite != other.codeNationalite) {
            return false;
        }
        if ((this.numSouscripteur == null && other.numSouscripteur != null) || (this.numSouscripteur != null && !this.numSouscripteur.equals(other.numSouscripteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PersonneNationalitePK[ codeNationalite=" + codeNationalite + ", numSouscripteur=" + numSouscripteur + " ]";
    }
    
}
