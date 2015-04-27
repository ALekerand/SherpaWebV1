/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "options_garantie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "OptionsGarantie.findAll", query = "SELECT o FROM OptionsGarantie o"),
    @NamedQuery(name = "OptionsGarantie.findByCodeOptionsGarantie", query = "SELECT o FROM OptionsGarantie o WHERE o.codeOptionsGarantie = :codeOptionsGarantie"),
    @NamedQuery(name = "OptionsGarantie.findByLibelleOptionsGarantie", query = "SELECT o FROM OptionsGarantie o WHERE o.libelleOptionsGarantie = :libelleOptionsGarantie")})
public class OptionsGarantie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_OPTIONS_GARANTIE")
    private String codeOptionsGarantie;
    @Size(max = 80)
    @Column(name = "LIBELLE_OPTIONS_GARANTIE")
    private String libelleOptionsGarantie;

    public OptionsGarantie() {
    }

    public OptionsGarantie(String codeOptionsGarantie) {
        this.codeOptionsGarantie = codeOptionsGarantie;
    }

    public String getCodeOptionsGarantie() {
        return codeOptionsGarantie;
    }

    public void setCodeOptionsGarantie(String codeOptionsGarantie) {
        this.codeOptionsGarantie = codeOptionsGarantie;
    }

    public String getLibelleOptionsGarantie() {
        return libelleOptionsGarantie;
    }

    public void setLibelleOptionsGarantie(String libelleOptionsGarantie) {
        this.libelleOptionsGarantie = libelleOptionsGarantie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeOptionsGarantie != null ? codeOptionsGarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof OptionsGarantie)) {
            return false;
        }
        OptionsGarantie other = (OptionsGarantie) object;
        if ((this.codeOptionsGarantie == null && other.codeOptionsGarantie != null) || (this.codeOptionsGarantie != null && !this.codeOptionsGarantie.equals(other.codeOptionsGarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.OptionsGarantie[ codeOptionsGarantie=" + codeOptionsGarantie + " ]";
    }
    
}
