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
public class EngagementsActifrepPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEENGAGEMENTS")
    private String codeengagements;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEACTIFREP")
    private String codeactifrep;

    public EngagementsActifrepPK() {
    }

    public EngagementsActifrepPK(String codeengagements, String codeactifrep) {
        this.codeengagements = codeengagements;
        this.codeactifrep = codeactifrep;
    }

    public String getCodeengagements() {
        return codeengagements;
    }

    public void setCodeengagements(String codeengagements) {
        this.codeengagements = codeengagements;
    }

    public String getCodeactifrep() {
        return codeactifrep;
    }

    public void setCodeactifrep(String codeactifrep) {
        this.codeactifrep = codeactifrep;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeengagements != null ? codeengagements.hashCode() : 0);
        hash += (codeactifrep != null ? codeactifrep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EngagementsActifrepPK)) {
            return false;
        }
        EngagementsActifrepPK other = (EngagementsActifrepPK) object;
        if ((this.codeengagements == null && other.codeengagements != null) || (this.codeengagements != null && !this.codeengagements.equals(other.codeengagements))) {
            return false;
        }
        if ((this.codeactifrep == null && other.codeactifrep != null) || (this.codeactifrep != null && !this.codeactifrep.equals(other.codeactifrep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EngagementsActifrepPK[ codeengagements=" + codeengagements + ", codeactifrep=" + codeactifrep + " ]";
    }
    
}
