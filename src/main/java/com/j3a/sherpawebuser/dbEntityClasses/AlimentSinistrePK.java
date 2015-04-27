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
public class AlimentSinistrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_ALIMENT")
    private String codeAliment;

    public AlimentSinistrePK() {
    }

    public AlimentSinistrePK(String codeSinistre, String codeAliment) {
        this.codeSinistre = codeSinistre;
        this.codeAliment = codeAliment;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public String getCodeAliment() {
        return codeAliment;
    }

    public void setCodeAliment(String codeAliment) {
        this.codeAliment = codeAliment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        hash += (codeAliment != null ? codeAliment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlimentSinistrePK)) {
            return false;
        }
        AlimentSinistrePK other = (AlimentSinistrePK) object;
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        if ((this.codeAliment == null && other.codeAliment != null) || (this.codeAliment != null && !this.codeAliment.equals(other.codeAliment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AlimentSinistrePK[ codeSinistre=" + codeSinistre + ", codeAliment=" + codeAliment + " ]";
    }
    
}
