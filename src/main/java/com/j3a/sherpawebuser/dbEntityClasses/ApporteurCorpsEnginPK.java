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
public class ApporteurCorpsEnginPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_ENGIN")
    private String codeEngin;

    public ApporteurCorpsEnginPK() {
    }

    public ApporteurCorpsEnginPK(String codeApporteur, String codeEngin) {
        this.codeApporteur = codeApporteur;
        this.codeEngin = codeEngin;
    }

    public String getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getCodeEngin() {
        return codeEngin;
    }

    public void setCodeEngin(String codeEngin) {
        this.codeEngin = codeEngin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeApporteur != null ? codeApporteur.hashCode() : 0);
        hash += (codeEngin != null ? codeEngin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurCorpsEnginPK)) {
            return false;
        }
        ApporteurCorpsEnginPK other = (ApporteurCorpsEnginPK) object;
        if ((this.codeApporteur == null && other.codeApporteur != null) || (this.codeApporteur != null && !this.codeApporteur.equals(other.codeApporteur))) {
            return false;
        }
        if ((this.codeEngin == null && other.codeEngin != null) || (this.codeEngin != null && !this.codeEngin.equals(other.codeEngin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurCorpsEnginPK[ codeApporteur=" + codeApporteur + ", codeEngin=" + codeEngin + " ]";
    }
    
}
