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
public class AvListeCorpsEnginPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_CORPS_ENGIN")
    private String codeListeCorpsEngin;

    public AvListeCorpsEnginPK() {
    }

    public AvListeCorpsEnginPK(String numAvenant, String codeListeCorpsEngin) {
        this.numAvenant = numAvenant;
        this.codeListeCorpsEngin = codeListeCorpsEngin;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public String getCodeListeCorpsEngin() {
        return codeListeCorpsEngin;
    }

    public void setCodeListeCorpsEngin(String codeListeCorpsEngin) {
        this.codeListeCorpsEngin = codeListeCorpsEngin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        hash += (codeListeCorpsEngin != null ? codeListeCorpsEngin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeCorpsEnginPK)) {
            return false;
        }
        AvListeCorpsEnginPK other = (AvListeCorpsEnginPK) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        if ((this.codeListeCorpsEngin == null && other.codeListeCorpsEngin != null) || (this.codeListeCorpsEngin != null && !this.codeListeCorpsEngin.equals(other.codeListeCorpsEngin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeCorpsEnginPK[ numAvenant=" + numAvenant + ", codeListeCorpsEngin=" + codeListeCorpsEngin + " ]";
    }
    
}
