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
public class AvListeHabitationPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_HABITATION")
    private String codeListeHabitation;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;

    public AvListeHabitationPK() {
    }

    public AvListeHabitationPK(String codeListeHabitation, String numAvenant) {
        this.codeListeHabitation = codeListeHabitation;
        this.numAvenant = numAvenant;
    }

    public String getCodeListeHabitation() {
        return codeListeHabitation;
    }

    public void setCodeListeHabitation(String codeListeHabitation) {
        this.codeListeHabitation = codeListeHabitation;
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
        hash += (codeListeHabitation != null ? codeListeHabitation.hashCode() : 0);
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeHabitationPK)) {
            return false;
        }
        AvListeHabitationPK other = (AvListeHabitationPK) object;
        if ((this.codeListeHabitation == null && other.codeListeHabitation != null) || (this.codeListeHabitation != null && !this.codeListeHabitation.equals(other.codeListeHabitation))) {
            return false;
        }
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeHabitationPK[ codeListeHabitation=" + codeListeHabitation + ", numAvenant=" + numAvenant + " ]";
    }
    
}
