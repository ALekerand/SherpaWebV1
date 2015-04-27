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
public class AvTraficPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_TRAFIC")
    private String codeListeTrafic;

    public AvTraficPK() {
    }

    public AvTraficPK(String numAvenant, String codeListeTrafic) {
        this.numAvenant = numAvenant;
        this.codeListeTrafic = codeListeTrafic;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public String getCodeListeTrafic() {
        return codeListeTrafic;
    }

    public void setCodeListeTrafic(String codeListeTrafic) {
        this.codeListeTrafic = codeListeTrafic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        hash += (codeListeTrafic != null ? codeListeTrafic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvTraficPK)) {
            return false;
        }
        AvTraficPK other = (AvTraficPK) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        if ((this.codeListeTrafic == null && other.codeListeTrafic != null) || (this.codeListeTrafic != null && !this.codeListeTrafic.equals(other.codeListeTrafic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvTraficPK[ numAvenant=" + numAvenant + ", codeListeTrafic=" + codeListeTrafic + " ]";
    }
    
}
