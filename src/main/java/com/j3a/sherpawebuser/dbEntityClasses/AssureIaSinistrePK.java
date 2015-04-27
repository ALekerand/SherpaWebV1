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
public class AssureIaSinistrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_IDENTIFICATION")
    private String numIdentification;

    public AssureIaSinistrePK() {
    }

    public AssureIaSinistrePK(String codeSinistre, String numIdentification) {
        this.codeSinistre = codeSinistre;
        this.numIdentification = numIdentification;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public String getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(String numIdentification) {
        this.numIdentification = numIdentification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        hash += (numIdentification != null ? numIdentification.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssureIaSinistrePK)) {
            return false;
        }
        AssureIaSinistrePK other = (AssureIaSinistrePK) object;
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        if ((this.numIdentification == null && other.numIdentification != null) || (this.numIdentification != null && !this.numIdentification.equals(other.numIdentification))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AssureIaSinistrePK[ codeSinistre=" + codeSinistre + ", numIdentification=" + numIdentification + " ]";
    }
    
}
