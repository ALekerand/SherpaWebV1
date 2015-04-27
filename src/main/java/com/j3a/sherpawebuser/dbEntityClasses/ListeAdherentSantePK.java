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
public class ListeAdherentSantePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_ADHERENT")
    private String codeListeAdherent;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_ADHERENT")
    private String codeAdherent;

    public ListeAdherentSantePK() {
    }

    public ListeAdherentSantePK(String codeListeAdherent, String codeAdherent) {
        this.codeListeAdherent = codeListeAdherent;
        this.codeAdherent = codeAdherent;
    }

    public String getCodeListeAdherent() {
        return codeListeAdherent;
    }

    public void setCodeListeAdherent(String codeListeAdherent) {
        this.codeListeAdherent = codeListeAdherent;
    }

    public String getCodeAdherent() {
        return codeAdherent;
    }

    public void setCodeAdherent(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeAdherent != null ? codeListeAdherent.hashCode() : 0);
        hash += (codeAdherent != null ? codeAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeAdherentSantePK)) {
            return false;
        }
        ListeAdherentSantePK other = (ListeAdherentSantePK) object;
        if ((this.codeListeAdherent == null && other.codeListeAdherent != null) || (this.codeListeAdherent != null && !this.codeListeAdherent.equals(other.codeListeAdherent))) {
            return false;
        }
        if ((this.codeAdherent == null && other.codeAdherent != null) || (this.codeAdherent != null && !this.codeAdherent.equals(other.codeAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeAdherentSantePK[ codeListeAdherent=" + codeListeAdherent + ", codeAdherent=" + codeAdherent + " ]";
    }
    
}
