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
public class GarantieGarantieChoisieCorpsPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GRTIE_CHOISIE_TRSP_CORPS")
    private String codeGrtieChoisieTrspCorps;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;

    public GarantieGarantieChoisieCorpsPK() {
    }

    public GarantieGarantieChoisieCorpsPK(String codeGrtieChoisieTrspCorps, String codeGarantie) {
        this.codeGrtieChoisieTrspCorps = codeGrtieChoisieTrspCorps;
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGrtieChoisieTrspCorps() {
        return codeGrtieChoisieTrspCorps;
    }

    public void setCodeGrtieChoisieTrspCorps(String codeGrtieChoisieTrspCorps) {
        this.codeGrtieChoisieTrspCorps = codeGrtieChoisieTrspCorps;
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
        hash += (codeGrtieChoisieTrspCorps != null ? codeGrtieChoisieTrspCorps.hashCode() : 0);
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieCorpsPK)) {
            return false;
        }
        GarantieGarantieChoisieCorpsPK other = (GarantieGarantieChoisieCorpsPK) object;
        if ((this.codeGrtieChoisieTrspCorps == null && other.codeGrtieChoisieTrspCorps != null) || (this.codeGrtieChoisieTrspCorps != null && !this.codeGrtieChoisieTrspCorps.equals(other.codeGrtieChoisieTrspCorps))) {
            return false;
        }
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieCorpsPK[ codeGrtieChoisieTrspCorps=" + codeGrtieChoisieTrspCorps + ", codeGarantie=" + codeGarantie + " ]";
    }
    
}
