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
public class ApporteurAlimentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_ALIMENT")
    private String codeAliment;

    public ApporteurAlimentPK() {
    }

    public ApporteurAlimentPK(String codeApporteur, String codeAliment) {
        this.codeApporteur = codeApporteur;
        this.codeAliment = codeAliment;
    }

    public String getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getCodeAliment() {
        return codeAliment;
    }

    public void setCodeAliment(String codeAliment) {
        this.codeAliment = codeAliment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeApporteur != null ? codeApporteur.hashCode() : 0);
        hash += (codeAliment != null ? codeAliment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurAlimentPK)) {
            return false;
        }
        ApporteurAlimentPK other = (ApporteurAlimentPK) object;
        if ((this.codeApporteur == null && other.codeApporteur != null) || (this.codeApporteur != null && !this.codeApporteur.equals(other.codeApporteur))) {
            return false;
        }
        if ((this.codeAliment == null && other.codeAliment != null) || (this.codeAliment != null && !this.codeAliment.equals(other.codeAliment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurAlimentPK[ codeApporteur=" + codeApporteur + ", codeAliment=" + codeAliment + " ]";
    }
    
}
