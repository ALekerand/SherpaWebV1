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
public class SinistreConducteurPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_CONDUCTEUR_SINISTRE")
    private String codeConducteurSinistre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;

    public SinistreConducteurPK() {
    }

    public SinistreConducteurPK(String codeConducteurSinistre, String codeSinistre) {
        this.codeConducteurSinistre = codeConducteurSinistre;
        this.codeSinistre = codeSinistre;
    }

    public String getCodeConducteurSinistre() {
        return codeConducteurSinistre;
    }

    public void setCodeConducteurSinistre(String codeConducteurSinistre) {
        this.codeConducteurSinistre = codeConducteurSinistre;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeConducteurSinistre != null ? codeConducteurSinistre.hashCode() : 0);
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SinistreConducteurPK)) {
            return false;
        }
        SinistreConducteurPK other = (SinistreConducteurPK) object;
        if ((this.codeConducteurSinistre == null && other.codeConducteurSinistre != null) || (this.codeConducteurSinistre != null && !this.codeConducteurSinistre.equals(other.codeConducteurSinistre))) {
            return false;
        }
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.SinistreConducteurPK[ codeConducteurSinistre=" + codeConducteurSinistre + ", codeSinistre=" + codeSinistre + " ]";
    }
    
}
