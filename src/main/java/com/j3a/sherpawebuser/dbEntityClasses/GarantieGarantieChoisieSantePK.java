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
public class GarantieGarantieChoisieSantePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIESANTE")
    private String codeGarantieChoisiesante;

    public GarantieGarantieChoisieSantePK() {
    }

    public GarantieGarantieChoisieSantePK(String codeGarantie, String codeGarantieChoisiesante) {
        this.codeGarantie = codeGarantie;
        this.codeGarantieChoisiesante = codeGarantieChoisiesante;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantieChoisiesante() {
        return codeGarantieChoisiesante;
    }

    public void setCodeGarantieChoisiesante(String codeGarantieChoisiesante) {
        this.codeGarantieChoisiesante = codeGarantieChoisiesante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        hash += (codeGarantieChoisiesante != null ? codeGarantieChoisiesante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieSantePK)) {
            return false;
        }
        GarantieGarantieChoisieSantePK other = (GarantieGarantieChoisieSantePK) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        if ((this.codeGarantieChoisiesante == null && other.codeGarantieChoisiesante != null) || (this.codeGarantieChoisiesante != null && !this.codeGarantieChoisiesante.equals(other.codeGarantieChoisiesante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieSantePK[ codeGarantie=" + codeGarantie + ", codeGarantieChoisiesante=" + codeGarantieChoisiesante + " ]";
    }
    
}
