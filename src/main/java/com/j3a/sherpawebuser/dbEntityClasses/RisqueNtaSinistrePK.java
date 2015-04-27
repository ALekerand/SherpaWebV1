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
public class RisqueNtaSinistrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_RISQUENTA")
    private String codeRisquenta;

    public RisqueNtaSinistrePK() {
    }

    public RisqueNtaSinistrePK(String codeSinistre, String codeRisquenta) {
        this.codeSinistre = codeSinistre;
        this.codeRisquenta = codeRisquenta;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public String getCodeRisquenta() {
        return codeRisquenta;
    }

    public void setCodeRisquenta(String codeRisquenta) {
        this.codeRisquenta = codeRisquenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        hash += (codeRisquenta != null ? codeRisquenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisqueNtaSinistrePK)) {
            return false;
        }
        RisqueNtaSinistrePK other = (RisqueNtaSinistrePK) object;
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        if ((this.codeRisquenta == null && other.codeRisquenta != null) || (this.codeRisquenta != null && !this.codeRisquenta.equals(other.codeRisquenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.RisqueNtaSinistrePK[ codeSinistre=" + codeSinistre + ", codeRisquenta=" + codeRisquenta + " ]";
    }
    
}
