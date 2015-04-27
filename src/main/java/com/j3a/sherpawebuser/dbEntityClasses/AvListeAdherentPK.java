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
public class AvListeAdherentPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_ADHERENT")
    private String codeListeAdherent;

    public AvListeAdherentPK() {
    }

    public AvListeAdherentPK(String numAvenant, String codeListeAdherent) {
        this.numAvenant = numAvenant;
        this.codeListeAdherent = codeListeAdherent;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public String getCodeListeAdherent() {
        return codeListeAdherent;
    }

    public void setCodeListeAdherent(String codeListeAdherent) {
        this.codeListeAdherent = codeListeAdherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        hash += (codeListeAdherent != null ? codeListeAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeAdherentPK)) {
            return false;
        }
        AvListeAdherentPK other = (AvListeAdherentPK) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        if ((this.codeListeAdherent == null && other.codeListeAdherent != null) || (this.codeListeAdherent != null && !this.codeListeAdherent.equals(other.codeListeAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeAdherentPK[ numAvenant=" + numAvenant + ", codeListeAdherent=" + codeListeAdherent + " ]";
    }
    
}
