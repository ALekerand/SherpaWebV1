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
public class AffilieListeAffiliePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_AFFILIE")
    private String codeAffilie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_AFFILIE")
    private String codeListeAffilie;

    public AffilieListeAffiliePK() {
    }

    public AffilieListeAffiliePK(String codeAffilie, String codeListeAffilie) {
        this.codeAffilie = codeAffilie;
        this.codeListeAffilie = codeListeAffilie;
    }

    public String getCodeAffilie() {
        return codeAffilie;
    }

    public void setCodeAffilie(String codeAffilie) {
        this.codeAffilie = codeAffilie;
    }

    public String getCodeListeAffilie() {
        return codeListeAffilie;
    }

    public void setCodeListeAffilie(String codeListeAffilie) {
        this.codeListeAffilie = codeListeAffilie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAffilie != null ? codeAffilie.hashCode() : 0);
        hash += (codeListeAffilie != null ? codeListeAffilie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AffilieListeAffiliePK)) {
            return false;
        }
        AffilieListeAffiliePK other = (AffilieListeAffiliePK) object;
        if ((this.codeAffilie == null && other.codeAffilie != null) || (this.codeAffilie != null && !this.codeAffilie.equals(other.codeAffilie))) {
            return false;
        }
        if ((this.codeListeAffilie == null && other.codeListeAffilie != null) || (this.codeListeAffilie != null && !this.codeListeAffilie.equals(other.codeListeAffilie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AffilieListeAffiliePK[ codeAffilie=" + codeAffilie + ", codeListeAffilie=" + codeListeAffilie + " ]";
    }
    
}
