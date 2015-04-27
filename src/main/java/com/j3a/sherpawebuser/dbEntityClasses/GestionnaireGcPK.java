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
public class GestionnaireGcPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_GESTION_CONFIE")
    private String codeGestionConfie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_GESTIONNAIRE")
    private String codeGestionnaire;

    public GestionnaireGcPK() {
    }

    public GestionnaireGcPK(String codeGestionConfie, String codeGestionnaire) {
        this.codeGestionConfie = codeGestionConfie;
        this.codeGestionnaire = codeGestionnaire;
    }

    public String getCodeGestionConfie() {
        return codeGestionConfie;
    }

    public void setCodeGestionConfie(String codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
    }

    public String getCodeGestionnaire() {
        return codeGestionnaire;
    }

    public void setCodeGestionnaire(String codeGestionnaire) {
        this.codeGestionnaire = codeGestionnaire;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGestionConfie != null ? codeGestionConfie.hashCode() : 0);
        hash += (codeGestionnaire != null ? codeGestionnaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionnaireGcPK)) {
            return false;
        }
        GestionnaireGcPK other = (GestionnaireGcPK) object;
        if ((this.codeGestionConfie == null && other.codeGestionConfie != null) || (this.codeGestionConfie != null && !this.codeGestionConfie.equals(other.codeGestionConfie))) {
            return false;
        }
        if ((this.codeGestionnaire == null && other.codeGestionnaire != null) || (this.codeGestionnaire != null && !this.codeGestionnaire.equals(other.codeGestionnaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionnaireGcPK[ codeGestionConfie=" + codeGestionConfie + ", codeGestionnaire=" + codeGestionnaire + " ]";
    }
    
}
