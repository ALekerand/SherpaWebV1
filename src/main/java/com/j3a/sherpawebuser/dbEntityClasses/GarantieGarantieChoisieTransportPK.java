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
public class GarantieGarantieChoisieTransportPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_GARANTIE_CHOISIE_TRANSPORT")
    private String codeGarantieChoisieTransport;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;

    public GarantieGarantieChoisieTransportPK() {
    }

    public GarantieGarantieChoisieTransportPK(String codeGarantieChoisieTransport, String codeGarantie) {
        this.codeGarantieChoisieTransport = codeGarantieChoisieTransport;
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantieChoisieTransport() {
        return codeGarantieChoisieTransport;
    }

    public void setCodeGarantieChoisieTransport(String codeGarantieChoisieTransport) {
        this.codeGarantieChoisieTransport = codeGarantieChoisieTransport;
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
        hash += (codeGarantieChoisieTransport != null ? codeGarantieChoisieTransport.hashCode() : 0);
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieTransportPK)) {
            return false;
        }
        GarantieGarantieChoisieTransportPK other = (GarantieGarantieChoisieTransportPK) object;
        if ((this.codeGarantieChoisieTransport == null && other.codeGarantieChoisieTransport != null) || (this.codeGarantieChoisieTransport != null && !this.codeGarantieChoisieTransport.equals(other.codeGarantieChoisieTransport))) {
            return false;
        }
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieTransportPK[ codeGarantieChoisieTransport=" + codeGarantieChoisieTransport + ", codeGarantie=" + codeGarantie + " ]";
    }
    
}
