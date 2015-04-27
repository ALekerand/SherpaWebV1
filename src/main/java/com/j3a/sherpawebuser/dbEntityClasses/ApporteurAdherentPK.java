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
public class ApporteurAdherentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_ADHERENT")
    private String codeAdherent;

    public ApporteurAdherentPK() {
    }

    public ApporteurAdherentPK(String codeApporteur, String codeAdherent) {
        this.codeApporteur = codeApporteur;
        this.codeAdherent = codeAdherent;
    }

    public String getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getCodeAdherent() {
        return codeAdherent;
    }

    public void setCodeAdherent(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeApporteur != null ? codeApporteur.hashCode() : 0);
        hash += (codeAdherent != null ? codeAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurAdherentPK)) {
            return false;
        }
        ApporteurAdherentPK other = (ApporteurAdherentPK) object;
        if ((this.codeApporteur == null && other.codeApporteur != null) || (this.codeApporteur != null && !this.codeApporteur.equals(other.codeApporteur))) {
            return false;
        }
        if ((this.codeAdherent == null && other.codeAdherent != null) || (this.codeAdherent != null && !this.codeAdherent.equals(other.codeAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurAdherentPK[ codeApporteur=" + codeApporteur + ", codeAdherent=" + codeAdherent + " ]";
    }
    
}
