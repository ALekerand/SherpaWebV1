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
public class GarantieFormuleGcPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_FORMULE_GC")
    private String codeFormuleGc;

    public GarantieFormuleGcPK() {
    }

    public GarantieFormuleGcPK(String codeGarantie, String codeFormuleGc) {
        this.codeGarantie = codeGarantie;
        this.codeFormuleGc = codeFormuleGc;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeFormuleGc() {
        return codeFormuleGc;
    }

    public void setCodeFormuleGc(String codeFormuleGc) {
        this.codeFormuleGc = codeFormuleGc;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        hash += (codeFormuleGc != null ? codeFormuleGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieFormuleGcPK)) {
            return false;
        }
        GarantieFormuleGcPK other = (GarantieFormuleGcPK) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        if ((this.codeFormuleGc == null && other.codeFormuleGc != null) || (this.codeFormuleGc != null && !this.codeFormuleGc.equals(other.codeFormuleGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieFormuleGcPK[ codeGarantie=" + codeGarantie + ", codeFormuleGc=" + codeFormuleGc + " ]";
    }
    
}
