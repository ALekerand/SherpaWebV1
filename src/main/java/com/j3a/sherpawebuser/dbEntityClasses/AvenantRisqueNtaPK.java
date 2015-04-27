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
public class AvenantRisqueNtaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_RISQUENTA")
    private String codeRisquenta;

    public AvenantRisqueNtaPK() {
    }

    public AvenantRisqueNtaPK(String numAvenant, String codeRisquenta) {
        this.numAvenant = numAvenant;
        this.codeRisquenta = codeRisquenta;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
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
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        hash += (codeRisquenta != null ? codeRisquenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvenantRisqueNtaPK)) {
            return false;
        }
        AvenantRisqueNtaPK other = (AvenantRisqueNtaPK) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        if ((this.codeRisquenta == null && other.codeRisquenta != null) || (this.codeRisquenta != null && !this.codeRisquenta.equals(other.codeRisquenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvenantRisqueNtaPK[ numAvenant=" + numAvenant + ", codeRisquenta=" + codeRisquenta + " ]";
    }
    
}
