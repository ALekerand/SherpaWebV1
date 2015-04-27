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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "etatc9_categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc9Categorie.findAll", query = "SELECT e FROM Etatc9Categorie e"),
    @NamedQuery(name = "Etatc9Categorie.findByCodec9categorie", query = "SELECT e FROM Etatc9Categorie e WHERE e.codec9categorie = :codec9categorie"),
    @NamedQuery(name = "Etatc9Categorie.findByLibelleetatc9cate", query = "SELECT e FROM Etatc9Categorie e WHERE e.libelleetatc9cate = :libelleetatc9cate")})
public class Etatc9Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEC9CATEGORIE")
    private String codec9categorie;
    @Size(max = 100)
    @Column(name = "LIBELLEETATC9CATE")
    private String libelleetatc9cate;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne
    private CategorieCima codecategoriecima;
    @JoinColumn(name = "CODEETATC9", referencedColumnName = "CODEETATC9")
    @ManyToOne(optional = false)
    private Etatc9 codeetatc9;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatc9Categorie")
    private List<C9Exercice> c9ExerciceList;

    public Etatc9Categorie() {
    }

    public Etatc9Categorie(String codec9categorie) {
        this.codec9categorie = codec9categorie;
    }

    public String getCodec9categorie() {
        return codec9categorie;
    }

    public void setCodec9categorie(String codec9categorie) {
        this.codec9categorie = codec9categorie;
    }

    public String getLibelleetatc9cate() {
        return libelleetatc9cate;
    }

    public void setLibelleetatc9cate(String libelleetatc9cate) {
        this.libelleetatc9cate = libelleetatc9cate;
    }

    public CategorieCima getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(CategorieCima codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    public Etatc9 getCodeetatc9() {
        return codeetatc9;
    }

    public void setCodeetatc9(Etatc9 codeetatc9) {
        this.codeetatc9 = codeetatc9;
    }

    @XmlTransient
    public List<C9Exercice> getC9ExerciceList() {
        return c9ExerciceList;
    }

    public void setC9ExerciceList(List<C9Exercice> c9ExerciceList) {
        this.c9ExerciceList = c9ExerciceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codec9categorie != null ? codec9categorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc9Categorie)) {
            return false;
        }
        Etatc9Categorie other = (Etatc9Categorie) object;
        if ((this.codec9categorie == null && other.codec9categorie != null) || (this.codec9categorie != null && !this.codec9categorie.equals(other.codec9categorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc9Categorie[ codec9categorie=" + codec9categorie + " ]";
    }
    
}
