/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "exercice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Exercice.findAll", query = "SELECT e FROM Exercice e"),
    @NamedQuery(name = "Exercice.findByCodeexercice", query = "SELECT e FROM Exercice e WHERE e.codeexercice = :codeexercice"),
    @NamedQuery(name = "Exercice.findByLibelleExercice", query = "SELECT e FROM Exercice e WHERE e.libelleExercice = :libelleExercice"),
    @NamedQuery(name = "Exercice.findByChiffreAffExo", query = "SELECT e FROM Exercice e WHERE e.chiffreAffExo = :chiffreAffExo"),
    @NamedQuery(name = "Exercice.findByPrimeExercice", query = "SELECT e FROM Exercice e WHERE e.primeExercice = :primeExercice"),
    @NamedQuery(name = "Exercice.findByPrimeAReporterExo", query = "SELECT e FROM Exercice e WHERE e.primeAReporterExo = :primeAReporterExo"),
    @NamedQuery(name = "Exercice.findByPrecExo", query = "SELECT e FROM Exercice e WHERE e.precExo = :precExo"),
    @NamedQuery(name = "Exercice.findByEtatExercice", query = "SELECT e FROM Exercice e WHERE e.etatExercice = :etatExercice")})
public class Exercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEEXERCICE")
    private Integer codeexercice;
    @Size(max = 6)
    @Column(name = "LIBELLE_EXERCICE")
    private String libelleExercice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CHIFFRE_AFF_EXO")
    private BigDecimal chiffreAffExo;
    @Column(name = "PRIME_EXERCICE")
    private BigDecimal primeExercice;
    @Column(name = "PRIME_A_REPORTER_EXO")
    private BigDecimal primeAReporterExo;
    @Column(name = "PREC_EXO")
    private BigDecimal precExo;
    @Size(max = 20)
    @Column(name = "ETAT_EXERCICE")
    private String etatExercice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeexercice")
    private List<Portefeuilles> portefeuillesList;
    @OneToMany(mappedBy = "codeexercice")
    private List<Achat> achatList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exercice")
    private List<Etatc10tabbExercice> etatc10tabbExerciceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeexercice")
    private List<ModifiCapital> modifiCapitalList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exercice")
    private List<Etatc10tabaExercice> etatc10tabaExerciceList;
    @OneToMany(mappedBy = "codeexercice")
    private List<Avenant> avenantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeexercice")
    private List<ObligationEmprunt> obligationEmpruntList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exercice")
    private List<C10Exercice> c10ExerciceList;
    @OneToMany(mappedBy = "codeexercice")
    private List<Vente> venteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "exercice")
    private List<C9Exercice> c9ExerciceList;

    public Exercice() {
    }

    public Exercice(Integer codeexercice) {
        this.codeexercice = codeexercice;
    }

    public Integer getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(Integer codeexercice) {
        this.codeexercice = codeexercice;
    }

    public String getLibelleExercice() {
        return libelleExercice;
    }

    public void setLibelleExercice(String libelleExercice) {
        this.libelleExercice = libelleExercice;
    }

    public BigDecimal getChiffreAffExo() {
        return chiffreAffExo;
    }

    public void setChiffreAffExo(BigDecimal chiffreAffExo) {
        this.chiffreAffExo = chiffreAffExo;
    }

    public BigDecimal getPrimeExercice() {
        return primeExercice;
    }

    public void setPrimeExercice(BigDecimal primeExercice) {
        this.primeExercice = primeExercice;
    }

    public BigDecimal getPrimeAReporterExo() {
        return primeAReporterExo;
    }

    public void setPrimeAReporterExo(BigDecimal primeAReporterExo) {
        this.primeAReporterExo = primeAReporterExo;
    }

    public BigDecimal getPrecExo() {
        return precExo;
    }

    public void setPrecExo(BigDecimal precExo) {
        this.precExo = precExo;
    }

    public String getEtatExercice() {
        return etatExercice;
    }

    public void setEtatExercice(String etatExercice) {
        this.etatExercice = etatExercice;
    }

    @XmlTransient
    public List<Portefeuilles> getPortefeuillesList() {
        return portefeuillesList;
    }

    public void setPortefeuillesList(List<Portefeuilles> portefeuillesList) {
        this.portefeuillesList = portefeuillesList;
    }

    @XmlTransient
    public List<Achat> getAchatList() {
        return achatList;
    }

    public void setAchatList(List<Achat> achatList) {
        this.achatList = achatList;
    }

    @XmlTransient
    public List<Etatc10tabbExercice> getEtatc10tabbExerciceList() {
        return etatc10tabbExerciceList;
    }

    public void setEtatc10tabbExerciceList(List<Etatc10tabbExercice> etatc10tabbExerciceList) {
        this.etatc10tabbExerciceList = etatc10tabbExerciceList;
    }

    @XmlTransient
    public List<ModifiCapital> getModifiCapitalList() {
        return modifiCapitalList;
    }

    public void setModifiCapitalList(List<ModifiCapital> modifiCapitalList) {
        this.modifiCapitalList = modifiCapitalList;
    }

    @XmlTransient
    public List<Etatc10tabaExercice> getEtatc10tabaExerciceList() {
        return etatc10tabaExerciceList;
    }

    public void setEtatc10tabaExerciceList(List<Etatc10tabaExercice> etatc10tabaExerciceList) {
        this.etatc10tabaExerciceList = etatc10tabaExerciceList;
    }

    @XmlTransient
    public List<Avenant> getAvenantList() {
        return avenantList;
    }

    public void setAvenantList(List<Avenant> avenantList) {
        this.avenantList = avenantList;
    }

    @XmlTransient
    public List<ObligationEmprunt> getObligationEmpruntList() {
        return obligationEmpruntList;
    }

    public void setObligationEmpruntList(List<ObligationEmprunt> obligationEmpruntList) {
        this.obligationEmpruntList = obligationEmpruntList;
    }

    @XmlTransient
    public List<C10Exercice> getC10ExerciceList() {
        return c10ExerciceList;
    }

    public void setC10ExerciceList(List<C10Exercice> c10ExerciceList) {
        this.c10ExerciceList = c10ExerciceList;
    }

    @XmlTransient
    public List<Vente> getVenteList() {
        return venteList;
    }

    public void setVenteList(List<Vente> venteList) {
        this.venteList = venteList;
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
        hash += (codeexercice != null ? codeexercice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Exercice)) {
            return false;
        }
        Exercice other = (Exercice) object;
        if ((this.codeexercice == null && other.codeexercice != null) || (this.codeexercice != null && !this.codeexercice.equals(other.codeexercice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Exercice[ codeexercice=" + codeexercice + " ]";
    }
    
}
