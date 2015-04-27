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
@Table(name = "categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Categorie.findAll", query = "SELECT c FROM Categorie c"),
    @NamedQuery(name = "Categorie.findByCodeCategorie", query = "SELECT c FROM Categorie c WHERE c.codeCategorie = :codeCategorie"),
    @NamedQuery(name = "Categorie.findByLibelleCategorie", query = "SELECT c FROM Categorie c WHERE c.libelleCategorie = :libelleCategorie")})
public class Categorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_CATEGORIE")
    private String codeCategorie;
    @Size(max = 30)
    @Column(name = "LIBELLE_CATEGORIE")
    private String libelleCategorie;
    @OneToMany(mappedBy = "codeCategorie")
    private List<AdherentsSante> adherentsSanteList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<GestionConfiee> gestionConfieeList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<RisqueNta> risqueNtaList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<SousCatVehicule> sousCatVehiculeList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<AssureIa> assureIaList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<Habitation> habitationList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<CorpsEngin> corpsEnginList;
    @OneToMany(mappedBy = "codeCategorie")
    private List<Aliment> alimentList;
    @JoinColumn(name = "CODE_RISQUE", referencedColumnName = "CODE_RISQUE")
    @ManyToOne
    private Risque codeRisque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "categorie")
    private List<TypeApporteurCategorie> typeApporteurCategorieList;

    public Categorie() {
    }

    public Categorie(String codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public String getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public String getLibelleCategorie() {
        return libelleCategorie;
    }

    public void setLibelleCategorie(String libelleCategorie) {
        this.libelleCategorie = libelleCategorie;
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

    @XmlTransient
    public List<RisqueNta> getRisqueNtaList() {
        return risqueNtaList;
    }

    public void setRisqueNtaList(List<RisqueNta> risqueNtaList) {
        this.risqueNtaList = risqueNtaList;
    }

    @XmlTransient
    public List<SousCatVehicule> getSousCatVehiculeList() {
        return sousCatVehiculeList;
    }

    public void setSousCatVehiculeList(List<SousCatVehicule> sousCatVehiculeList) {
        this.sousCatVehiculeList = sousCatVehiculeList;
    }

    @XmlTransient
    public List<AssureIa> getAssureIaList() {
        return assureIaList;
    }

    public void setAssureIaList(List<AssureIa> assureIaList) {
        this.assureIaList = assureIaList;
    }

    @XmlTransient
    public List<Habitation> getHabitationList() {
        return habitationList;
    }

    public void setHabitationList(List<Habitation> habitationList) {
        this.habitationList = habitationList;
    }

    @XmlTransient
    public List<CorpsEngin> getCorpsEnginList() {
        return corpsEnginList;
    }

    public void setCorpsEnginList(List<CorpsEngin> corpsEnginList) {
        this.corpsEnginList = corpsEnginList;
    }

    @XmlTransient
    public List<Aliment> getAlimentList() {
        return alimentList;
    }

    public void setAlimentList(List<Aliment> alimentList) {
        this.alimentList = alimentList;
    }

    public Risque getCodeRisque() {
        return codeRisque;
    }

    public void setCodeRisque(Risque codeRisque) {
        this.codeRisque = codeRisque;
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
        hash += (codeCategorie != null ? codeCategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Categorie)) {
            return false;
        }
        Categorie other = (Categorie) object;
        if ((this.codeCategorie == null && other.codeCategorie != null) || (this.codeCategorie != null && !this.codeCategorie.equals(other.codeCategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Categorie[ codeCategorie=" + codeCategorie + " ]";
    }
    
}
