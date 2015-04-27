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
public class GarantieGarantieChoisieMrhPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIEMRH")
    private String codeGarantieChoisiemrh;

    public GarantieGarantieChoisieMrhPK() {
    }

    public GarantieGarantieChoisieMrhPK(String codeGarantie, String codeGarantieChoisiemrh) {
        this.codeGarantie = codeGarantie;
        this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantieChoisiemrh() {
        return codeGarantieChoisiemrh;
    }

    public void setCodeGarantieChoisiemrh(String codeGarantieChoisiemrh) {
        this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        hash += (codeGarantieChoisiemrh != null ? codeGarantieChoisiemrh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieMrhPK)) {
            return false;
        }
        GarantieGarantieChoisieMrhPK other = (GarantieGarantieChoisieMrhPK) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        if ((this.codeGarantieChoisiemrh == null && other.codeGarantieChoisiemrh != null) || (this.codeGarantieChoisiemrh != null && !this.codeGarantieChoisiemrh.equals(other.codeGarantieChoisiemrh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieMrhPK[ codeGarantie=" + codeGarantie + ", codeGarantieChoisiemrh=" + codeGarantieChoisiemrh + " ]";
    }
    
}
