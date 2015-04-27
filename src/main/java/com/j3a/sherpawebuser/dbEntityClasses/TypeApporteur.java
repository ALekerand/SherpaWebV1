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
@Table(name = "type_apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeApporteur.findAll", query = "SELECT t FROM TypeApporteur t"),
    @NamedQuery(name = "TypeApporteur.findByIdType", query = "SELECT t FROM TypeApporteur t WHERE t.idType = :idType"),
    @NamedQuery(name = "TypeApporteur.findByLibelle", query = "SELECT t FROM TypeApporteur t WHERE t.libelle = :libelle")})
public class TypeApporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_TYPE")
    private String idType;
    @Size(max = 50)
    @Column(name = "LIBELLE")
    private String libelle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idType")
    private List<Apporteur> apporteurList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "typeApporteur")
    private List<TypeApporteurCategorie> typeApporteurCategorieList;

    public TypeApporteur() {
    }

    public TypeApporteur(String idType) {
        this.idType = idType;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    @XmlTransient
    public List<Apporteur> getApporteurList() {
        return apporteurList;
    }

    public void setApporteurList(List<Apporteur> apporteurList) {
        this.apporteurList = apporteurList;
    }

    @XmlTransient
    public List<TypeApporteurCategorie> getTypeApporteurCategorieList() {
        return typeApporteurCategorieList;
    }

    public void setTypeApporteurCategorieList(List<TypeApporteurCategorie> typeApporteurCategorieList) {
        this.typeApporteurCategorieList = typeApporteurCategorieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeApporteur)) {
            return false;
        }
        TypeApporteur other = (TypeApporteur) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.TypeApporteur[ idType=" + idType + " ]";
    }
    
}
