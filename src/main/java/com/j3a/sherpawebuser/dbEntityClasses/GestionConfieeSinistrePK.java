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
public class GestionConfieeSinistrePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_GESTION_CONFIE")
    private String codeGestionConfie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;

    public GestionConfieeSinistrePK() {
    }

    public GestionConfieeSinistrePK(String codeGestionConfie, String codeSinistre) {
        this.codeGestionConfie = codeGestionConfie;
        this.codeSinistre = codeSinistre;
    }

    public String getCodeGestionConfie() {
        return codeGestionConfie;
    }

    public void setCodeGestionConfie(String codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
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
        hash += (codeGestionConfie != null ? codeGestionConfie.hashCode() : 0);
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionConfieeSinistrePK)) {
            return false;
        }
        GestionConfieeSinistrePK other = (GestionConfieeSinistrePK) object;
        if ((this.codeGestionConfie == null && other.codeGestionConfie != null) || (this.codeGestionConfie != null && !this.codeGestionConfie.equals(other.codeGestionConfie))) {
            return false;
        }
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionConfieeSinistrePK[ codeGestionConfie=" + codeGestionConfie + ", codeSinistre=" + codeSinistre + " ]";
    }
    
}
