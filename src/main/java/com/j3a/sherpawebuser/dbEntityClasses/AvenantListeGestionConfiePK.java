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
public class AvenantListeGestionConfiePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_GESTION_CONFIE")
    private String codeListeGestionConfie;

    public AvenantListeGestionConfiePK() {
    }

    public AvenantListeGestionConfiePK(String numAvenant, String codeListeGestionConfie) {
        this.numAvenant = numAvenant;
        this.codeListeGestionConfie = codeListeGestionConfie;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public String getCodeListeGestionConfie() {
        return codeListeGestionConfie;
    }

    public void setCodeListeGestionConfie(String codeListeGestionConfie) {
        this.codeListeGestionConfie = codeListeGestionConfie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        hash += (codeListeGestionConfie != null ? codeListeGestionConfie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvenantListeGestionConfiePK)) {
            return false;
        }
        AvenantListeGestionConfiePK other = (AvenantListeGestionConfiePK) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        if ((this.codeListeGestionConfie == null && other.codeListeGestionConfie != null) || (this.codeListeGestionConfie != null && !this.codeListeGestionConfie.equals(other.codeListeGestionConfie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvenantListeGestionConfiePK[ numAvenant=" + numAvenant + ", codeListeGestionConfie=" + codeListeGestionConfie + " ]";
    }
    
}
