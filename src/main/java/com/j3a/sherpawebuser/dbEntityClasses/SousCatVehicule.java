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
@Table(name = "sous_cat_vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SousCatVehicule.findAll", query = "SELECT s FROM SousCatVehicule s"),
    @NamedQuery(name = "SousCatVehicule.findByCodeSousCatVehicule", query = "SELECT s FROM SousCatVehicule s WHERE s.codeSousCatVehicule = :codeSousCatVehicule"),
    @NamedQuery(name = "SousCatVehicule.findByLibelleSousCatVehicule", query = "SELECT s FROM SousCatVehicule s WHERE s.libelleSousCatVehicule = :libelleSousCatVehicule"),
    @NamedQuery(name = "SousCatVehicule.findByTarif", query = "SELECT s FROM SousCatVehicule s WHERE s.tarif = :tarif")})
public class SousCatVehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_SOUS_CAT_VEHICULE")
    private String codeSousCatVehicule;
    @Size(max = 40)
    @Column(name = "LIBELLE_SOUS_CAT_VEHICULE")
    private String libelleSousCatVehicule;
    @Size(max = 10)
    @Column(name = "TARIF")
    private String tarif;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSousCatVehicule")
    private List<Vehicule> vehiculeList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;

    public SousCatVehicule() {
    }

    public SousCatVehicule(String codeSousCatVehicule) {
        this.codeSousCatVehicule = codeSousCatVehicule;
    }

    public String getCodeSousCatVehicule() {
        return codeSousCatVehicule;
    }

    public void setCodeSousCatVehicule(String codeSousCatVehicule) {
        this.codeSousCatVehicule = codeSousCatVehicule;
    }

    public String getLibelleSousCatVehicule() {
        return libelleSousCatVehicule;
    }

    public void setLibelleSousCatVehicule(String libelleSousCatVehicule) {
        this.libelleSousCatVehicule = libelleSousCatVehicule;
    }

    public String getTarif() {
        return tarif;
    }

    public void setTarif(String tarif) {
        this.tarif = tarif;
    }

    @XmlTransient
    public List<Vehicule> getVehiculeList() {
        return vehiculeList;
    }

    public void setVehiculeList(List<Vehicule> vehiculeList) {
        this.vehiculeList = vehiculeList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSousCatVehicule != null ? codeSousCatVehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SousCatVehicule)) {
            return false;
        }
        SousCatVehicule other = (SousCatVehicule) object;
        if ((this.codeSousCatVehicule == null && other.codeSousCatVehicule != null) || (this.codeSousCatVehicule != null && !this.codeSousCatVehicule.equals(other.codeSousCatVehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.SousCatVehicule[ codeSousCatVehicule=" + codeSousCatVehicule + " ]";
    }
    
}
