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
public class EtrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_SOUSCRIPTEUR")
    private String numSouscripteur;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_PERS")
    private int codeTypePers;

    public EtrePK() {
    }

    public EtrePK(String numSouscripteur, int codeTypePers) {
        this.numSouscripteur = numSouscripteur;
        this.codeTypePers = codeTypePers;
    }

    public String getNumSouscripteur() {
        return numSouscripteur;
    }

    public void setNumSouscripteur(String numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    public int getCodeTypePers() {
        return codeTypePers;
    }

    public void setCodeTypePers(int codeTypePers) {
        this.codeTypePers = codeTypePers;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSouscripteur != null ? numSouscripteur.hashCode() : 0);
        hash += (int) codeTypePers;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtrePK)) {
            return false;
        }
        EtrePK other = (EtrePK) object;
        if ((this.numSouscripteur == null && other.numSouscripteur != null) || (this.numSouscripteur != null && !this.numSouscripteur.equals(other.numSouscripteur))) {
            return false;
        }
        if (this.codeTypePers != other.codeTypePers) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EtrePK[ numSouscripteur=" + numSouscripteur + ", codeTypePers=" + codeTypePers + " ]";
    }
    
}
