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
public class AvListeAssureIaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_LISTE_ASSURE_IA")
    private String codeListeAssureIa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;

    public AvListeAssureIaPK() {
    }

    public AvListeAssureIaPK(String codeListeAssureIa, String numAvenant) {
        this.codeListeAssureIa = codeListeAssureIa;
        this.numAvenant = numAvenant;
    }

    public String getCodeListeAssureIa() {
        return codeListeAssureIa;
    }

    public void setCodeListeAssureIa(String codeListeAssureIa) {
        this.codeListeAssureIa = codeListeAssureIa;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeAssureIa != null ? codeListeAssureIa.hashCode() : 0);
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeAssureIaPK)) {
            return false;
        }
        AvListeAssureIaPK other = (AvListeAssureIaPK) object;
        if ((this.codeListeAssureIa == null && other.codeListeAssureIa != null) || (this.codeListeAssureIa != null && !this.codeListeAssureIa.equals(other.codeListeAssureIa))) {
            return false;
        }
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeAssureIaPK[ codeListeAssureIa=" + codeListeAssureIa + ", numAvenant=" + numAvenant + " ]";
    }
    
}
