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
@Table(name = "formule_gc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FormuleGc.findAll", query = "SELECT f FROM FormuleGc f"),
    @NamedQuery(name = "FormuleGc.findByCodeFormuleGc", query = "SELECT f FROM FormuleGc f WHERE f.codeFormuleGc = :codeFormuleGc"),
    @NamedQuery(name = "FormuleGc.findByLibelleFormuleGc", query = "SELECT f FROM FormuleGc f WHERE f.libelleFormuleGc = :libelleFormuleGc"),
    @NamedQuery(name = "FormuleGc.findByCouvertureFormule", query = "SELECT f FROM FormuleGc f WHERE f.couvertureFormule = :couvertureFormule")})
public class FormuleGc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_FORMULE_GC")
    private String codeFormuleGc;
    @Size(max = 200)
    @Column(name = "LIBELLE_FORMULE_GC")
    private String libelleFormuleGc;
    @Size(max = 10)
    @Column(name = "COUVERTURE_FORMULE")
    private String couvertureFormule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formuleGc")
    private List<GarantieFormuleGc> garantieFormuleGcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "formuleGc")
    private List<GestionConfieFormule> gestionConfieFormuleList;

    public FormuleGc() {
    }

    public FormuleGc(String codeFormuleGc) {
        this.codeFormuleGc = codeFormuleGc;
    }

    public String getCodeFormuleGc() {
        return codeFormuleGc;
    }

    public void setCodeFormuleGc(String codeFormuleGc) {
        this.codeFormuleGc = codeFormuleGc;
    }

    public String getLibelleFormuleGc() {
        return libelleFormuleGc;
    }

    public void setLibelleFormuleGc(String libelleFormuleGc) {
        this.libelleFormuleGc = libelleFormuleGc;
    }

    public String getCouvertureFormule() {
        return couvertureFormule;
    }

    public void setCouvertureFormule(String couvertureFormule) {
        this.couvertureFormule = couvertureFormule;
    }

    @XmlTransient
    public List<GarantieFormuleGc> getGarantieFormuleGcList() {
        return garantieFormuleGcList;
    }

    public void setGarantieFormuleGcList(List<GarantieFormuleGc> garantieFormuleGcList) {
        this.garantieFormuleGcList = garantieFormuleGcList;
    }

    @XmlTransient
    public List<GestionConfieFormule> getGestionConfieFormuleList() {
        return gestionConfieFormuleList;
    }

    public void setGestionConfieFormuleList(List<GestionConfieFormule> gestionConfieFormuleList) {
        this.gestionConfieFormuleList = gestionConfieFormuleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeFormuleGc != null ? codeFormuleGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FormuleGc)) {
            return false;
        }
        FormuleGc other = (FormuleGc) object;
        if ((this.codeFormuleGc == null && other.codeFormuleGc != null) || (this.codeFormuleGc != null && !this.codeFormuleGc.equals(other.codeFormuleGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.FormuleGc[ codeFormuleGc=" + codeFormuleGc + " ]";
    }
    
}
