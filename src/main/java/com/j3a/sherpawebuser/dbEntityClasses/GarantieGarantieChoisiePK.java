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
public class GarantieGarantieChoisiePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_GARANTIE_CHOISIE")
    private String codeGarantieChoisie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;

    public GarantieGarantieChoisiePK() {
    }

    public GarantieGarantieChoisiePK(String codeGarantieChoisie, String codeGarantie) {
        this.codeGarantieChoisie = codeGarantieChoisie;
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantieChoisie() {
        return codeGarantieChoisie;
    }

    public void setCodeGarantieChoisie(String codeGarantieChoisie) {
        this.codeGarantieChoisie = codeGarantieChoisie;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisie != null ? codeGarantieChoisie.hashCode() : 0);
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisiePK)) {
            return false;
        }
        GarantieGarantieChoisiePK other = (GarantieGarantieChoisiePK) object;
        if ((this.codeGarantieChoisie == null && other.codeGarantieChoisie != null) || (this.codeGarantieChoisie != null && !this.codeGarantieChoisie.equals(other.codeGarantieChoisie))) {
            return false;
        }
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisiePK[ codeGarantieChoisie=" + codeGarantieChoisie + ", codeGarantie=" + codeGarantie + " ]";
    }

}
