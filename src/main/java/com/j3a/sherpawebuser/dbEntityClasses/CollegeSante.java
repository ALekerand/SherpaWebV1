/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "college_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CollegeSante.findAll", query = "SELECT c FROM CollegeSante c"),
    @NamedQuery(name = "CollegeSante.findByCodeCollege", query = "SELECT c FROM CollegeSante c WHERE c.codeCollege = :codeCollege"),
    @NamedQuery(name = "CollegeSante.findByLibelleCollege", query = "SELECT c FROM CollegeSante c WHERE c.libelleCollege = :libelleCollege"),
    @NamedQuery(name = "CollegeSante.findByTarifSante", query = "SELECT c FROM CollegeSante c WHERE c.tarifSante = :tarifSante")})
public class CollegeSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE_COLLEGE")
    private String codeCollege;
    @Size(max = 60)
    @Column(name = "LIBELLE_COLLEGE")
    private String libelleCollege;
    @Size(max = 60)
    @Column(name = "TARIF_SANTE")
    private String tarifSante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeCollege")
    private List<AdherentsSante> adherentsSanteList;
    @OneToMany(mappedBy = "codeCollege")
    private List<GestionConfiee> gestionConfieeList;

    public CollegeSante() {
    }

    public CollegeSante(String codeCollege) {
        this.codeCollege = codeCollege;
    }

    public String getCodeCollege() {
        return codeCollege;
    }

    public void setCodeCollege(String codeCollege) {
        this.codeCollege = codeCollege;
    }

    public String getLibelleCollege() {
        return libelleCollege;
    }

    public void setLibelleCollege(String libelleCollege) {
        this.libelleCollege = libelleCollege;
    }

    public String getTarifSante() {
        return tarifSante;
    }

    public void setTarifSante(String tarifSante) {
        this.tarifSante = tarifSante;
    }

    @XmlTransient
    public List<AdherentsSante> getAdherentsSanteList() {
        return adherentsSanteList;
    }

    public void setAdherentsSanteList(List<AdherentsSante> adherentsSanteList) {
        this.adherentsSanteList = adherentsSanteList;
    }

    @XmlTransient
    public List<GestionConfiee> getGestionConfieeList() {
        return gestionConfieeList;
    }

    public void setGestionConfieeList(List<GestionConfiee> gestionConfieeList) {
        this.gestionConfieeList = gestionConfieeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCollege != null ? codeCollege.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CollegeSante)) {
            return false;
        }
        CollegeSante other = (CollegeSante) object;
        if ((this.codeCollege == null && other.codeCollege != null) || (this.codeCollege != null && !this.codeCollege.equals(other.codeCollege))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CollegeSante[ codeCollege=" + codeCollege + " ]";
    }
    
}
