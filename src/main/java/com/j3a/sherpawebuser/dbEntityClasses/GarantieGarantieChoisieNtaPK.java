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
public class GarantieGarantieChoisieNtaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIENTA")
    private String codeGarantieChoisienta;

    public GarantieGarantieChoisieNtaPK() {
    }

    public GarantieGarantieChoisieNtaPK(String codeGarantie, String codeGarantieChoisienta) {
        this.codeGarantie = codeGarantie;
        this.codeGarantieChoisienta = codeGarantieChoisienta;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantieChoisienta() {
        return codeGarantieChoisienta;
    }

    public void setCodeGarantieChoisienta(String codeGarantieChoisienta) {
        this.codeGarantieChoisienta = codeGarantieChoisienta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        hash += (codeGarantieChoisienta != null ? codeGarantieChoisienta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieNtaPK)) {
            return false;
        }
        GarantieGarantieChoisieNtaPK other = (GarantieGarantieChoisieNtaPK) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        if ((this.codeGarantieChoisienta == null && other.codeGarantieChoisienta != null) || (this.codeGarantieChoisienta != null && !this.codeGarantieChoisienta.equals(other.codeGarantieChoisienta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieNtaPK[ codeGarantie=" + codeGarantie + ", codeGarantieChoisienta=" + codeGarantieChoisienta + " ]";
    }
    
}
