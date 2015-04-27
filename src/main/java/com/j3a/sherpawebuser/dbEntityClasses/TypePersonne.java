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
import javax.persistence.Lob;
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
@Table(name = "type_personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypePersonne.findAll", query = "SELECT t FROM TypePersonne t"),
    @NamedQuery(name = "TypePersonne.findByCodeTypePers", query = "SELECT t FROM TypePersonne t WHERE t.codeTypePers = :codeTypePers")})
public class TypePersonne implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_TYPE_PERS")
    private Integer codeTypePers;
    @Lob
    @Size(max = 65535)
    @Column(name = "LIBELLE_TYPE_PERS")
    private String libelleTypePers;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typePersonne")
    private List<Etre> etreList;

    public TypePersonne() {
    }

    public TypePersonne(Integer codeTypePers) {
        this.codeTypePers = codeTypePers;
    }

    public Integer getCodeTypePers() {
        return codeTypePers;
    }

    public void setCodeTypePers(Integer codeTypePers) {
        this.codeTypePers = codeTypePers;
    }

    public String getLibelleTypePers() {
        return libelleTypePers;
    }

    public void setLibelleTypePers(String libelleTypePers) {
        this.libelleTypePers = libelleTypePers;
    }

    @XmlTransient
    public List<Etre> getEtreList() {
        return etreList;
    }

    public void setEtreList(List<Etre> etreList) {
        this.etreList = etreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTypePers != null ? codeTypePers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypePersonne)) {
            return false;
        }
        TypePersonne other = (TypePersonne) object;
        if ((this.codeTypePers == null && other.codeTypePers != null) || (this.codeTypePers != null && !this.codeTypePers.equals(other.codeTypePers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.TypePersonne[ codeTypePers=" + codeTypePers + " ]";
    }
    
}
