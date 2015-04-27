/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "garantie_choisie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisie.findAll", query = "SELECT g FROM GarantieChoisie g"),
    @NamedQuery(name = "GarantieChoisie.findByCodeGarantieChoisie", query = "SELECT g FROM GarantieChoisie g WHERE g.codeGarantieChoisie = :codeGarantieChoisie"),
    @NamedQuery(name = "GarantieChoisie.findByLibelleGarantieChosie", query = "SELECT g FROM GarantieChoisie g WHERE g.libelleGarantieChosie = :libelleGarantieChosie"),
    @NamedQuery(name = "GarantieChoisie.findByDateGarantieChoisie", query = "SELECT g FROM GarantieChoisie g WHERE g.dateGarantieChoisie = :dateGarantieChoisie"),
    @NamedQuery(name = "GarantieChoisie.findByPrimeNetteAnnuelle", query = "SELECT g FROM GarantieChoisie g WHERE g.primeNetteAnnuelle = :primeNetteAnnuelle"),
    @NamedQuery(name = "GarantieChoisie.findByPrimeAnnuelle", query = "SELECT g FROM GarantieChoisie g WHERE g.primeAnnuelle = :primeAnnuelle"),
    @NamedQuery(name = "GarantieChoisie.findByPrimeNetteProrata", query = "SELECT g FROM GarantieChoisie g WHERE g.primeNetteProrata = :primeNetteProrata"),
    @NamedQuery(name = "GarantieChoisie.findByBonus", query = "SELECT g FROM GarantieChoisie g WHERE g.bonus = :bonus"),
    @NamedQuery(name = "GarantieChoisie.findByMalus", query = "SELECT g FROM GarantieChoisie g WHERE g.malus = :malus"),
    @NamedQuery(name = "GarantieChoisie.findByReductionSocioProf", query = "SELECT g FROM GarantieChoisie g WHERE g.reductionSocioProf = :reductionSocioProf"),
    @NamedQuery(name = "GarantieChoisie.findByReductionPermis", query = "SELECT g FROM GarantieChoisie g WHERE g.reductionPermis = :reductionPermis"),
    @NamedQuery(name = "GarantieChoisie.findByReductionCommercial", query = "SELECT g FROM GarantieChoisie g WHERE g.reductionCommercial = :reductionCommercial"),
    @NamedQuery(name = "GarantieChoisie.findByAutre", query = "SELECT g FROM GarantieChoisie g WHERE g.autre = :autre"),
    @NamedQuery(name = "GarantieChoisie.findByMontantReduction", query = "SELECT g FROM GarantieChoisie g WHERE g.montantReduction = :montantReduction"),
    @NamedQuery(name = "GarantieChoisie.findByAccessoireauto", query = "SELECT g FROM GarantieChoisie g WHERE g.accessoireauto = :accessoireauto"),
    @NamedQuery(name = "GarantieChoisie.findByCodeAvenantAuto", query = "SELECT g FROM GarantieChoisie g WHERE g.codeAvenantAuto = :codeAvenantAuto"),
    @NamedQuery(name = "GarantieChoisie.findBySurprime", query = "SELECT g FROM GarantieChoisie g WHERE g.surprime = :surprime")})
public class GarantieChoisie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_GARANTIE_CHOISIE")
    private String codeGarantieChoisie;
    @Size(max = 70)
    @Column(name = "LIBELLE_GARANTIE_CHOSIE")
    private String libelleGarantieChosie;
    @Column(name = "DATE_GARANTIE_CHOISIE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTE_ANNUELLE")
    private BigDecimal primeNetteAnnuelle;
    @Column(name = "PRIME_ANNUELLE")
    private BigDecimal primeAnnuelle;
    @Column(name = "PRIME_NETTE_PRORATA")
    private BigDecimal primeNetteProrata;
    @Column(name = "BONUS")
    private BigDecimal bonus;
    @Column(name = "MALUS")
    private BigDecimal malus;
    @Column(name = "REDUCTION_SOCIO_PROF")
    private BigDecimal reductionSocioProf;
    @Column(name = "REDUCTION_PERMIS")
    private BigDecimal reductionPermis;
    @Column(name = "REDUCTION_COMMERCIAL")
    private BigDecimal reductionCommercial;
    @Column(name = "AUTRE")
    private BigDecimal autre;
    @Column(name = "MONTANT_REDUCTION")
    private BigDecimal montantReduction;
    @Column(name = "ACCESSOIREAUTO")
    private BigDecimal accessoireauto;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_AUTO")
    private String codeAvenantAuto;
    @Column(name = "SURPRIME")
    private BigDecimal surprime;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE")
    @ManyToOne(optional = false)
    private Vehicule codeVehicule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisie")
    private List<GarantieGarantieChoisie> garantieGarantieChoisieList;

    public GarantieChoisie() {
    }

    public GarantieChoisie(String codeGarantieChoisie) {
        this.codeGarantieChoisie = codeGarantieChoisie;
    }

    public String getCodeGarantieChoisie() {
        return codeGarantieChoisie;
    }

    public void setCodeGarantieChoisie(String codeGarantieChoisie) {
        this.codeGarantieChoisie = codeGarantieChoisie;
    }

    public String getLibelleGarantieChosie() {
        return libelleGarantieChosie;
    }

    public void setLibelleGarantieChosie(String libelleGarantieChosie) {
        this.libelleGarantieChosie = libelleGarantieChosie;
    }

    public Date getDateGarantieChoisie() {
        return dateGarantieChoisie;
    }

    public void setDateGarantieChoisie(Date dateGarantieChoisie) {
        this.dateGarantieChoisie = dateGarantieChoisie;
    }

    public BigDecimal getPrimeNetteAnnuelle() {
        return primeNetteAnnuelle;
    }

    public void setPrimeNetteAnnuelle(BigDecimal primeNetteAnnuelle) {
        this.primeNetteAnnuelle = primeNetteAnnuelle;
    }

    public BigDecimal getPrimeAnnuelle() {
        return primeAnnuelle;
    }

    public void setPrimeAnnuelle(BigDecimal primeAnnuelle) {
        this.primeAnnuelle = primeAnnuelle;
    }

    public BigDecimal getPrimeNetteProrata() {
        return primeNetteProrata;
    }

    public void setPrimeNetteProrata(BigDecimal primeNetteProrata) {
        this.primeNetteProrata = primeNetteProrata;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getMalus() {
        return malus;
    }

    public void setMalus(BigDecimal malus) {
        this.malus = malus;
    }

    public BigDecimal getReductionSocioProf() {
        return reductionSocioProf;
    }

    public void setReductionSocioProf(BigDecimal reductionSocioProf) {
        this.reductionSocioProf = reductionSocioProf;
    }

    public BigDecimal getReductionPermis() {
        return reductionPermis;
    }

    public void setReductionPermis(BigDecimal reductionPermis) {
        this.reductionPermis = reductionPermis;
    }

    public BigDecimal getReductionCommercial() {
        return reductionCommercial;
    }

    public void setReductionCommercial(BigDecimal reductionCommercial) {
        this.reductionCommercial = reductionCommercial;
    }

    public BigDecimal getAutre() {
        return autre;
    }

    public void setAutre(BigDecimal autre) {
        this.autre = autre;
    }

    public BigDecimal getMontantReduction() {
        return montantReduction;
    }

    public void setMontantReduction(BigDecimal montantReduction) {
        this.montantReduction = montantReduction;
    }

    public BigDecimal getAccessoireauto() {
        return accessoireauto;
    }

    public void setAccessoireauto(BigDecimal accessoireauto) {
        this.accessoireauto = accessoireauto;
    }

    public String getCodeAvenantAuto() {
        return codeAvenantAuto;
    }

    public void setCodeAvenantAuto(String codeAvenantAuto) {
        this.codeAvenantAuto = codeAvenantAuto;
    }

    public BigDecimal getSurprime() {
        return surprime;
    }

    public void setSurprime(BigDecimal surprime) {
        this.surprime = surprime;
    }

    public Vehicule getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(Vehicule codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    @XmlTransient
    public List<GarantieGarantieChoisie> getGarantieGarantieChoisieList() {
        return garantieGarantieChoisieList;
    }

    public void setGarantieGarantieChoisieList(List<GarantieGarantieChoisie> garantieGarantieChoisieList) {
        this.garantieGarantieChoisieList = garantieGarantieChoisieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisie != null ? codeGarantieChoisie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisie)) {
            return false;
        }
        GarantieChoisie other = (GarantieChoisie) object;
        if ((this.codeGarantieChoisie == null && other.codeGarantieChoisie != null) || (this.codeGarantieChoisie != null && !this.codeGarantieChoisie.equals(other.codeGarantieChoisie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisie[ codeGarantieChoisie=" + codeGarantieChoisie + " ]";
    }
    
}
