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
public class HabitationSinistrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_HABITATION")
    private String codeHabitation;

    public HabitationSinistrePK() {
    }

    public HabitationSinistrePK(String codeSinistre, String codeHabitation) {
        this.codeSinistre = codeSinistre;
        this.codeHabitation = codeHabitation;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public String getCodeHabitation() {
        return codeHabitation;
    }

    public void setCodeHabitation(String codeHabitation) {
        this.codeHabitation = codeHabitation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        hash += (codeHabitation != null ? codeHabitation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HabitationSinistrePK)) {
            return false;
        }
        HabitationSinistrePK other = (HabitationSinistrePK) object;
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        if ((this.codeHabitation == null && other.codeHabitation != null) || (this.codeHabitation != null && !this.codeHabitation.equals(other.codeHabitation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.HabitationSinistrePK[ codeSinistre=" + codeSinistre + ", codeHabitation=" + codeHabitation + " ]";
    }
    
}
