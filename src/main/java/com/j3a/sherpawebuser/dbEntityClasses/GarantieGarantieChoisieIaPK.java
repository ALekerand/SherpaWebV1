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
public class GarantieGarantieChoisieIaPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE_GRTIE_CHOISIE_IA")
    private String codeGrtieChoisieIa;

    public GarantieGarantieChoisieIaPK() {
    }

    public GarantieGarantieChoisieIaPK(String codeGarantie, String codeGrtieChoisieIa) {
        this.codeGarantie = codeGarantie;
        this.codeGrtieChoisieIa = codeGrtieChoisieIa;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGrtieChoisieIa() {
        return codeGrtieChoisieIa;
    }

    public void setCodeGrtieChoisieIa(String codeGrtieChoisieIa) {
        this.codeGrtieChoisieIa = codeGrtieChoisieIa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        hash += (codeGrtieChoisieIa != null ? codeGrtieChoisieIa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieIaPK)) {
            return false;
        }
        GarantieGarantieChoisieIaPK other = (GarantieGarantieChoisieIaPK) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        if ((this.codeGrtieChoisieIa == null && other.codeGrtieChoisieIa != null) || (this.codeGrtieChoisieIa != null && !this.codeGrtieChoisieIa.equals(other.codeGrtieChoisieIa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieIaPK[ codeGarantie=" + codeGarantie + ", codeGrtieChoisieIa=" + codeGrtieChoisieIa + " ]";
    }
    
}
