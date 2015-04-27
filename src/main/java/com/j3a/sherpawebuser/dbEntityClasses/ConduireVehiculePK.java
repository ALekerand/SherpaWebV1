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
public class ConduireVehiculePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_VEHICULE")
    private String codeVehicule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_COND")
    private String numCond;

    public ConduireVehiculePK() {
    }

    public ConduireVehiculePK(String codeVehicule, String numCond) {
        this.codeVehicule = codeVehicule;
        this.numCond = numCond;
    }

    public String getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(String codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    public String getNumCond() {
        return numCond;
    }

    public void setNumCond(String numCond) {
        this.numCond = numCond;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeVehicule != null ? codeVehicule.hashCode() : 0);
        hash += (numCond != null ? numCond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConduireVehiculePK)) {
            return false;
        }
        ConduireVehiculePK other = (ConduireVehiculePK) object;
        if ((this.codeVehicule == null && other.codeVehicule != null) || (this.codeVehicule != null && !this.codeVehicule.equals(other.codeVehicule))) {
            return false;
        }
        if ((this.numCond == null && other.numCond != null) || (this.numCond != null && !this.numCond.equals(other.numCond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ConduireVehiculePK[ codeVehicule=" + codeVehicule + ", numCond=" + numCond + " ]";
    }
    
}
