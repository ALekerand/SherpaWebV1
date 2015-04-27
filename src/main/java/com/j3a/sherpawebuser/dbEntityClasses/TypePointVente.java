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
@Table(name = "type_point_vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypePointVente.findAll", query = "SELECT t FROM TypePointVente t"),
    @NamedQuery(name = "TypePointVente.findByCodeTypePointVente", query = "SELECT t FROM TypePointVente t WHERE t.codeTypePointVente = :codeTypePointVente"),
    @NamedQuery(name = "TypePointVente.findByLibelleTypePointVente", query = "SELECT t FROM TypePointVente t WHERE t.libelleTypePointVente = :libelleTypePointVente")})
public class TypePointVente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_POINT_VENTE")
    private Integer codeTypePointVente;
    @Size(max = 20)
    @Column(name = "LIBELLE_TYPE_POINT_VENTE")
    private String libelleTypePointVente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeTypePointVente")
    private List<PointVente> pointVenteList;

    public TypePointVente() {
    }

    public TypePointVente(Integer codeTypePointVente) {
        this.codeTypePointVente = codeTypePointVente;
    }

    public Integer getCodeTypePointVente() {
        return codeTypePointVente;
    }

    public void setCodeTypePointVente(Integer codeTypePointVente) {
        this.codeTypePointVente = codeTypePointVente;
    }

    public String getLibelleTypePointVente() {
        return libelleTypePointVente;
    }

    public void setLibelleTypePointVente(String libelleTypePointVente) {
        this.libelleTypePointVente = libelleTypePointVente;
    }

    @XmlTransient
    public List<PointVente> getPointVenteList() {
        return pointVenteList;
    }

    public void setPointVenteList(List<PointVente> pointVenteList) {
        this.pointVenteList = pointVenteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypePointVente != null ? codeTypePointVente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypePointVente)) {
            return false;
        }
        TypePointVente other = (TypePointVente) object;
        if ((this.codeTypePointVente == null && other.codeTypePointVente != null) || (this.codeTypePointVente != null && !this.codeTypePointVente.equals(other.codeTypePointVente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.TypePointVente[ codeTypePointVente=" + codeTypePointVente + " ]";
    }
    
}
