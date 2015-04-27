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
public class GestionConfieFormulePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_GESTION_CONFIE")
    private String codeGestionConfie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_FORMULE_GC")
    private String codeFormuleGc;

    public GestionConfieFormulePK() {
    }

    public GestionConfieFormulePK(String codeGestionConfie, String codeFormuleGc) {
        this.codeGestionConfie = codeGestionConfie;
        this.codeFormuleGc = codeFormuleGc;
    }

    public String getCodeGestionConfie() {
        return codeGestionConfie;
    }

    public void setCodeGestionConfie(String codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
    }

    public String getCodeFormuleGc() {
        return codeFormuleGc;
    }

    public void setCodeFormuleGc(String codeFormuleGc) {
        this.codeFormuleGc = codeFormuleGc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGestionConfie != null ? codeGestionConfie.hashCode() : 0);
        hash += (codeFormuleGc != null ? codeFormuleGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionConfieFormulePK)) {
            return false;
        }
        GestionConfieFormulePK other = (GestionConfieFormulePK) object;
        if ((this.codeGestionConfie == null && other.codeGestionConfie != null) || (this.codeGestionConfie != null && !this.codeGestionConfie.equals(other.codeGestionConfie))) {
            return false;
        }
        if ((this.codeFormuleGc == null && other.codeFormuleGc != null) || (this.codeFormuleGc != null && !this.codeFormuleGc.equals(other.codeFormuleGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionConfieFormulePK[ codeGestionConfie=" + codeGestionConfie + ", codeFormuleGc=" + codeFormuleGc + " ]";
    }
    
}
