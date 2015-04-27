/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "garantie_garantie_choisie_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieIa.findAll", query = "SELECT g FROM GarantieGarantieChoisieIa g"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.garantieGarantieChoisieIaPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByCodeGrtieChoisieIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.garantieGarantieChoisieIaPK.codeGrtieChoisieIa = :codeGrtieChoisieIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByPrimeAnnuelleIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.primeAnnuelleIa = :primeAnnuelleIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByNatureIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.natureIa = :natureIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxIa = :tauxIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByMaximumIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.maximumIa = :maximumIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByMinimumIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.minimumIa = :minimumIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByPrimeNetteIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.primeNetteIa = :primeNetteIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxFranchiseIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxFranchiseIa = :tauxFranchiseIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByReductionIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.reductionIa = :reductionIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findBySmpIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.smpIa = :smpIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxPrimeIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxPrimeIa = :tauxPrimeIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxLciIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxLciIa = :tauxLciIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxRedIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxRedIa = :tauxRedIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxGesIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxGesIa = :tauxGesIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxComIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxComIa = :tauxComIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxintermIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxintermIa = :tauxintermIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxConsIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxConsIa = :tauxConsIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxredfranchIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxredfranchIa = :tauxredfranchIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByTauxcouvIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.tauxcouvIa = :tauxcouvIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByObservationIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.observationIa = :observationIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByDateGarantieGarantieChoisieIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.dateGarantieGarantieChoisieIa = :dateGarantieGarantieChoisieIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByFacteurIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.facteurIa = :facteurIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByFranchiseIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.franchiseIa = :franchiseIa"),
    @NamedQuery(name = "GarantieGarantieChoisieIa.findByCapitalIa", query = "SELECT g FROM GarantieGarantieChoisieIa g WHERE g.capitalIa = :capitalIa")})
public class GarantieGarantieChoisieIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieIaPK garantieGarantieChoisieIaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_ANNUELLE_IA")
    private BigDecimal primeAnnuelleIa;
    @Size(max = 50)
    @Column(name = "NATURE_IA")
    private String natureIa;
    @Column(name = "TAUX_IA")
    private BigDecimal tauxIa;
    @Column(name = "MAXIMUM_IA")
    private BigDecimal maximumIa;
    @Column(name = "MINIMUM_IA")
    private BigDecimal minimumIa;
    @Column(name = "PRIME_NETTE_IA")
    private BigDecimal primeNetteIa;
    @Column(name = "TAUX_FRANCHISE_IA")
    private BigDecimal tauxFranchiseIa;
    @Column(name = "REDUCTION_IA")
    private BigDecimal reductionIa;
    @Size(max = 30)
    @Column(name = "SMP_IA")
    private String smpIa;
    @Column(name = "TAUX_PRIME_IA")
    private BigDecimal tauxPrimeIa;
    @Column(name = "TAUX_LCI_IA")
    private BigDecimal tauxLciIa;
    @Column(name = "TAUX_RED_IA")
    private BigDecimal tauxRedIa;
    @Column(name = "TAUX_GES_IA")
    private BigDecimal tauxGesIa;
    @Column(name = "TAUX_COM_IA")
    private BigDecimal tauxComIa;
    @Column(name = "TAUXINTERM_IA")
    private BigDecimal tauxintermIa;
    @Column(name = "TAUX_CONS_IA")
    private BigDecimal tauxConsIa;
    @Column(name = "TAUXREDFRANCH_IA")
    private BigDecimal tauxredfranchIa;
    @Column(name = "TAUXCOUV_IA")
    private BigDecimal tauxcouvIa;
    @Size(max = 50)
    @Column(name = "OBSERVATION_IA")
    private String observationIa;
    @Column(name = "DATE_GARANTIE_GARANTIE_CHOISIE_IA")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieGarantieChoisieIa;
    @Column(name = "FACTEUR_IA")
    private BigDecimal facteurIa;
    @Column(name = "FRANCHISE_IA")
    private BigDecimal franchiseIa;
    @Column(name = "CAPITAL_IA")
    private BigDecimal capitalIa;
    @JoinColumn(name = "CODE_GRTIE_CHOISIE_IA", referencedColumnName = "CODE_GRTIE_CHOISIE_IA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieIa garantieChoisieIa;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;

    public GarantieGarantieChoisieIa() {
    }

    public GarantieGarantieChoisieIa(GarantieGarantieChoisieIaPK garantieGarantieChoisieIaPK) {
        this.garantieGarantieChoisieIaPK = garantieGarantieChoisieIaPK;
    }

    public GarantieGarantieChoisieIa(String codeGarantie, String codeGrtieChoisieIa) {
        this.garantieGarantieChoisieIaPK = new GarantieGarantieChoisieIaPK(codeGarantie, codeGrtieChoisieIa);
    }

    public GarantieGarantieChoisieIaPK getGarantieGarantieChoisieIaPK() {
        return garantieGarantieChoisieIaPK;
    }

    public void setGarantieGarantieChoisieIaPK(GarantieGarantieChoisieIaPK garantieGarantieChoisieIaPK) {
        this.garantieGarantieChoisieIaPK = garantieGarantieChoisieIaPK;
    }

    public BigDecimal getPrimeAnnuelleIa() {
        return primeAnnuelleIa;
    }

    public void setPrimeAnnuelleIa(BigDecimal primeAnnuelleIa) {
        this.primeAnnuelleIa = primeAnnuelleIa;
    }

    public String getNatureIa() {
        return natureIa;
    }

    public void setNatureIa(String natureIa) {
        this.natureIa = natureIa;
    }

    public BigDecimal getTauxIa() {
        return tauxIa;
    }

    public void setTauxIa(BigDecimal tauxIa) {
        this.tauxIa = tauxIa;
    }

    public BigDecimal getMaximumIa() {
        return maximumIa;
    }

    public void setMaximumIa(BigDecimal maximumIa) {
        this.maximumIa = maximumIa;
    }

    public BigDecimal getMinimumIa() {
        return minimumIa;
    }

    public void setMinimumIa(BigDecimal minimumIa) {
        this.minimumIa = minimumIa;
    }

    public BigDecimal getPrimeNetteIa() {
        return primeNetteIa;
    }

    public void setPrimeNetteIa(BigDecimal primeNetteIa) {
        this.primeNetteIa = primeNetteIa;
    }

    public BigDecimal getTauxFranchiseIa() {
        return tauxFranchiseIa;
    }

    public void setTauxFranchiseIa(BigDecimal tauxFranchiseIa) {
        this.tauxFranchiseIa = tauxFranchiseIa;
    }

    public BigDecimal getReductionIa() {
        return reductionIa;
    }

    public void setReductionIa(BigDecimal reductionIa) {
        this.reductionIa = reductionIa;
    }

    public String getSmpIa() {
        return smpIa;
    }

    public void setSmpIa(String smpIa) {
        this.smpIa = smpIa;
    }

    public BigDecimal getTauxPrimeIa() {
        return tauxPrimeIa;
    }

    public void setTauxPrimeIa(BigDecimal tauxPrimeIa) {
        this.tauxPrimeIa = tauxPrimeIa;
    }

    public BigDecimal getTauxLciIa() {
        return tauxLciIa;
    }

    public void setTauxLciIa(BigDecimal tauxLciIa) {
        this.tauxLciIa = tauxLciIa;
    }

    public BigDecimal getTauxRedIa() {
        return tauxRedIa;
    }

    public void setTauxRedIa(BigDecimal tauxRedIa) {
        this.tauxRedIa = tauxRedIa;
    }

    public BigDecimal getTauxGesIa() {
        return tauxGesIa;
    }

    public void setTauxGesIa(BigDecimal tauxGesIa) {
        this.tauxGesIa = tauxGesIa;
    }

    public BigDecimal getTauxComIa() {
        return tauxComIa;
    }

    public void setTauxComIa(BigDecimal tauxComIa) {
        this.tauxComIa = tauxComIa;
    }

    public BigDecimal getTauxintermIa() {
        return tauxintermIa;
    }

    public void setTauxintermIa(BigDecimal tauxintermIa) {
        this.tauxintermIa = tauxintermIa;
    }

    public BigDecimal getTauxConsIa() {
        return tauxConsIa;
    }

    public void setTauxConsIa(BigDecimal tauxConsIa) {
        this.tauxConsIa = tauxConsIa;
    }

    public BigDecimal getTauxredfranchIa() {
        return tauxredfranchIa;
    }

    public void setTauxredfranchIa(BigDecimal tauxredfranchIa) {
        this.tauxredfranchIa = tauxredfranchIa;
    }

    public BigDecimal getTauxcouvIa() {
        return tauxcouvIa;
    }

    public void setTauxcouvIa(BigDecimal tauxcouvIa) {
        this.tauxcouvIa = tauxcouvIa;
    }

    public String getObservationIa() {
        return observationIa;
    }

    public void setObservationIa(String observationIa) {
        this.observationIa = observationIa;
    }

    public Date getDateGarantieGarantieChoisieIa() {
        return dateGarantieGarantieChoisieIa;
    }

    public void setDateGarantieGarantieChoisieIa(Date dateGarantieGarantieChoisieIa) {
        this.dateGarantieGarantieChoisieIa = dateGarantieGarantieChoisieIa;
    }

    public BigDecimal getFacteurIa() {
        return facteurIa;
    }

    public void setFacteurIa(BigDecimal facteurIa) {
        this.facteurIa = facteurIa;
    }

    public BigDecimal getFranchiseIa() {
        return franchiseIa;
    }

    public void setFranchiseIa(BigDecimal franchiseIa) {
        this.franchiseIa = franchiseIa;
    }

    public BigDecimal getCapitalIa() {
        return capitalIa;
    }

    public void setCapitalIa(BigDecimal capitalIa) {
        this.capitalIa = capitalIa;
    }

    public GarantieChoisieIa getGarantieChoisieIa() {
        return garantieChoisieIa;
    }

    public void setGarantieChoisieIa(GarantieChoisieIa garantieChoisieIa) {
        this.garantieChoisieIa = garantieChoisieIa;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieGarantieChoisieIaPK != null ? garantieGarantieChoisieIaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieIa)) {
            return false;
        }
        GarantieGarantieChoisieIa other = (GarantieGarantieChoisieIa) object;
        if ((this.garantieGarantieChoisieIaPK == null && other.garantieGarantieChoisieIaPK != null) || (this.garantieGarantieChoisieIaPK != null && !this.garantieGarantieChoisieIaPK.equals(other.garantieGarantieChoisieIaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieIa[ garantieGarantieChoisieIaPK=" + garantieGarantieChoisieIaPK + " ]";
    }
    
}
