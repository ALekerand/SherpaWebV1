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
public class ApporteurNtaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_RISQUENTA")
    private String codeRisquenta;

    public ApporteurNtaPK() {
    }

    public ApporteurNtaPK(String codeApporteur, String codeRisquenta) {
        this.codeApporteur = codeApporteur;
        this.codeRisquenta = codeRisquenta;
    }

    public String getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getCodeRisquenta() {
        return codeRisquenta;
    }

    public void setCodeRisquenta(String codeRisquenta) {
        this.codeRisquenta = codeRisquenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeApporteur != null ? codeApporteur.hashCode() : 0);
        hash += (codeRisquenta != null ? codeRisquenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurNtaPK)) {
            return false;
        }
        ApporteurNtaPK other = (ApporteurNtaPK) object;
        if ((this.codeApporteur == null && other.codeApporteur != null) || (this.codeApporteur != null && !this.codeApporteur.equals(other.codeApporteur))) {
            return false;
        }
        if ((this.codeRisquenta == null && other.codeRisquenta != null) || (this.codeRisquenta != null && !this.codeRisquenta.equals(other.codeRisquenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurNtaPK[ codeApporteur=" + codeApporteur + ", codeRisquenta=" + codeRisquenta + " ]";
    }
    
}
