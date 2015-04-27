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
public class CoassuranceCompagniePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_COASSURANCE")
    private String codeCoassurance;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_COMPAGNIE")
    private String codeCompagnie;

    public CoassuranceCompagniePK() {
    }

    public CoassuranceCompagniePK(String codeCoassurance, String codeCompagnie) {
        this.codeCoassurance = codeCoassurance;
        this.codeCompagnie = codeCompagnie;
    }

    public String getCodeCoassurance() {
        return codeCoassurance;
    }

    public void setCodeCoassurance(String codeCoassurance) {
        this.codeCoassurance = codeCoassurance;
    }

    public String getCodeCompagnie() {
        return codeCompagnie;
    }

    public void setCodeCompagnie(String codeCompagnie) {
        this.codeCompagnie = codeCompagnie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCoassurance != null ? codeCoassurance.hashCode() : 0);
        hash += (codeCompagnie != null ? codeCompagnie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoassuranceCompagniePK)) {
            return false;
        }
        CoassuranceCompagniePK other = (CoassuranceCompagniePK) object;
        if ((this.codeCoassurance == null && other.codeCoassurance != null) || (this.codeCoassurance != null && !this.codeCoassurance.equals(other.codeCoassurance))) {
            return false;
        }
        if ((this.codeCompagnie == null && other.codeCompagnie != null) || (this.codeCompagnie != null && !this.codeCompagnie.equals(other.codeCompagnie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CoassuranceCompagniePK[ codeCoassurance=" + codeCoassurance + ", codeCompagnie=" + codeCompagnie + " ]";
    }
    
}
