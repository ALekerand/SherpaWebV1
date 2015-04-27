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
@Table(name = "categorie_cima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CategorieCima.findAll", query = "SELECT c FROM CategorieCima c"),
    @NamedQuery(name = "CategorieCima.findByCodecategoriecima", query = "SELECT c FROM CategorieCima c WHERE c.codecategoriecima = :codecategoriecima"),
    @NamedQuery(name = "CategorieCima.findByLibellecatecima", query = "SELECT c FROM CategorieCima c WHERE c.libellecatecima = :libellecatecima")})
public class CategorieCima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODECATEGORIECIMA")
    private String codecategoriecima;
    @Size(max = 100)
    @Column(name = "LIBELLECATECIMA")
    private String libellecatecima;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorieCima")
    private List<Etatc10aCategorie> etatc10aCategorieList;
    @OneToMany(mappedBy = "codecategoriecima")
    private List<Lgc1credit> lgc1creditList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codecategoriecima")
    private List<Etatc10bCategorie> etatc10bCategorieList;
    @OneToMany(mappedBy = "codecategoriecima")
    private List<Lgc1debit> lgc1debitList;
    @OneToMany(mappedBy = "codecategoriecima")
    private List<Etatc9Categorie> etatc9CategorieList;
    @OneToMany(mappedBy = "codecategoriecima")
    private List<Etatc10TabB> etatc10TabBList;
    @OneToMany(mappedBy = "codecategoriecima")
    private List<Etatc10TabA> etatc10TabAList;

    public CategorieCima() {
    }

    public CategorieCima(String codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    public String getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(String codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    public String getLibellecatecima() {
        return libellecatecima;
    }

    public void setLibellecatecima(String libellecatecima) {
        this.libellecatecima = libellecatecima;
    }

    @XmlTransient
    public List<Etatc10aCategorie> getEtatc10aCategorieList() {
        return etatc10aCategorieList;
    }

    public void setEtatc10aCategorieList(List<Etatc10aCategorie> etatc10aCategorieList) {
        this.etatc10aCategorieList = etatc10aCategorieList;
    }

    @XmlTransient
    public List<Lgc1credit> getLgc1creditList() {
        return lgc1creditList;
    }

    public void setLgc1creditList(List<Lgc1credit> lgc1creditList) {
        this.lgc1creditList = lgc1creditList;
    }

    @XmlTransient
    public List<Etatc10bCategorie> getEtatc10bCategorieList() {
        return etatc10bCategorieList;
    }

    public void setEtatc10bCategorieList(List<Etatc10bCategorie> etatc10bCategorieList) {
        this.etatc10bCategorieList = etatc10bCategorieList;
    }

    @XmlTransient
    public List<Lgc1debit> getLgc1debitList() {
        return lgc1debitList;
    }

    public void setLgc1debitList(List<Lgc1debit> lgc1debitList) {
        this.lgc1debitList = lgc1debitList;
    }

    @XmlTransient
    public List<Etatc9Categorie> getEtatc9CategorieList() {
        return etatc9CategorieList;
    }

    public void setEtatc9CategorieList(List<Etatc9Categorie> etatc9CategorieList) {
        this.etatc9CategorieList = etatc9CategorieList;
    }

    @XmlTransient
    public List<Etatc10TabB> getEtatc10TabBList() {
        return etatc10TabBList;
    }

    public void setEtatc10TabBList(List<Etatc10TabB> etatc10TabBList) {
        this.etatc10TabBList = etatc10TabBList;
    }

    @XmlTransient
    public List<Etatc10TabA> getEtatc10TabAList() {
        return etatc10TabAList;
    }

    public void setEtatc10TabAList(List<Etatc10TabA> etatc10TabAList) {
        this.etatc10TabAList = etatc10TabAList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codecategoriecima != null ? codecategoriecima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CategorieCima)) {
            return false;
        }
        CategorieCima other = (CategorieCima) object;
        if ((this.codecategoriecima == null && other.codecategoriecima != null) || (this.codecategoriecima != null && !this.codecategoriecima.equals(other.codecategoriecima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CategorieCima[ codecategoriecima=" + codecategoriecima + " ]";
    }
    
}
