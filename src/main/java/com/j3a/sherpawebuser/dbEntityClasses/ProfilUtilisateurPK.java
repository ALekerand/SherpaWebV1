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
public class ProfilUtilisateurPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_UTILISATEUR")
    private String codeUtilisateur;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_PROFIL")
    private String codeProfil;

    public ProfilUtilisateurPK() {
    }

    public ProfilUtilisateurPK(String codeUtilisateur, String codeProfil) {
        this.codeUtilisateur = codeUtilisateur;
        this.codeProfil = codeProfil;
    }

    public String getCodeUtilisateur() {
        return codeUtilisateur;
    }

    public void setCodeUtilisateur(String codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public String getCodeProfil() {
        return codeProfil;
    }

    public void setCodeProfil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeUtilisateur != null ? codeUtilisateur.hashCode() : 0);
        hash += (codeProfil != null ? codeProfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfilUtilisateurPK)) {
            return false;
        }
        ProfilUtilisateurPK other = (ProfilUtilisateurPK) object;
        if ((this.codeUtilisateur == null && other.codeUtilisateur != null) || (this.codeUtilisateur != null && !this.codeUtilisateur.equals(other.codeUtilisateur))) {
            return false;
        }
        if ((this.codeProfil == null && other.codeProfil != null) || (this.codeProfil != null && !this.codeProfil.equals(other.codeProfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ProfilUtilisateurPK[ codeUtilisateur=" + codeUtilisateur + ", codeProfil=" + codeProfil + " ]";
    }
    
}
