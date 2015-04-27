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
@Table(name = "garantie_garantie_choisie_corps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findAll", query = "SELECT g FROM GarantieGarantieChoisieCorps g"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByCodeGrtieChoisieTrspCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.garantieGarantieChoisieCorpsPK.codeGrtieChoisieTrspCorps = :codeGrtieChoisieTrspCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.garantieGarantieChoisieCorpsPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByNatureCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.natureCorps = :natureCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxCorps = :tauxCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByMinimumCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.minimumCorps = :minimumCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByMaximumCrops", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.maximumCrops = :maximumCrops"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByDateGarantieChoisieCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.dateGarantieChoisieCorps = :dateGarantieChoisieCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByMontantGarantieCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.montantGarantieCorps = :montantGarantieCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxFranchiseCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxFranchiseCorps = :tauxFranchiseCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByPrimeAnnuelleCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.primeAnnuelleCorps = :primeAnnuelleCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByPrimeNetteAnnuelleCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.primeNetteAnnuelleCorps = :primeNetteAnnuelleCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByReductionCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.reductionCorps = :reductionCorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findBySmp", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.smp = :smp"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxPrime", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxPrime = :tauxPrime"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxLci", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxLci = :tauxLci"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxRedcorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxRedcorps = :tauxRedcorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxGescorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxGescorps = :tauxGescorps"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxComcoass", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxComcoass = :tauxComcoass"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxinterm", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxinterm = :tauxinterm"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxcons", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxcons = :tauxcons"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxredfranch", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxredfranch = :tauxredfranch"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByTauxcouv", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.tauxcouv = :tauxcouv"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByObservation", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.observation = :observation"),
    @NamedQuery(name = "GarantieGarantieChoisieCorps.findByCapitalCorps", query = "SELECT g FROM GarantieGarantieChoisieCorps g WHERE g.capitalCorps = :capitalCorps")})
public class GarantieGarantieChoisieCorps implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieCorpsPK garantieGarantieChoisieCorpsPK;
    @Size(max = 30)
    @Column(name = "NATURE_CORPS")
    private String natureCorps;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_CORPS")
    private BigDecimal tauxCorps;
    @Column(name = "MINIMUM_CORPS")
    private BigDecimal minimumCorps;
    @Column(name = "MAXIMUM_CROPS")
    private BigDecimal maximumCrops;
    @Column(name = "DATE_GARANTIE_CHOISIE_CORPS")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisieCorps;
    @Column(name = "MONTANT_GARANTIE_CORPS")
    private BigDecimal montantGarantieCorps;
    @Column(name = "TAUX_FRANCHISE_CORPS")
    private BigDecimal tauxFranchiseCorps;
    @Column(name = "PRIME_ANNUELLE_CORPS")
    private BigDecimal primeAnnuelleCorps;
    @Column(name = "PRIME_NETTE_ANNUELLE_CORPS")
    private BigDecimal primeNetteAnnuelleCorps;
    @Column(name = "REDUCTION_CORPS")
    private BigDecimal reductionCorps;
    @Size(max = 50)
    @Column(name = "SMP")
    private String smp;
    @Column(name = "TAUX_PRIME")
    private BigDecimal tauxPrime;
    @Column(name = "TAUX_LCI")
    private BigDecimal tauxLci;
    @Column(name = "TAUX_REDCORPS")
    private BigDecimal tauxRedcorps;
    @Column(name = "TAUX_GESCORPS")
    private BigDecimal tauxGescorps;
    @Column(name = "TAUX_COMCOASS")
    private BigDecimal tauxComcoass;
    @Column(name = "TAUXINTERM")
    private BigDecimal tauxinterm;
    @Column(name = "TAUXCONS")
    private BigDecimal tauxcons;
    @Column(name = "TAUXREDFRANCH")
    private BigDecimal tauxredfranch;
    @Column(name = "TAUXCOUV")
    private BigDecimal tauxcouv;
    @Size(max = 50)
    @Column(name = "OBSERVATION")
    private String observation;
    @Column(name = "CAPITAL_CORPS")
    private BigDecimal capitalCorps;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;
    @JoinColumn(name = "CODE_GRTIE_CHOISIE_TRSP_CORPS", referencedColumnName = "CODE_GRTIE_CHOISIE_TRSP_CORPS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieTransportCorps garantieChoisieTransportCorps;

    public GarantieGarantieChoisieCorps() {
    }

    public GarantieGarantieChoisieCorps(GarantieGarantieChoisieCorpsPK garantieGarantieChoisieCorpsPK) {
        this.garantieGarantieChoisieCorpsPK = garantieGarantieChoisieCorpsPK;
    }

    public GarantieGarantieChoisieCorps(String codeGrtieChoisieTrspCorps, String codeGarantie) {
        this.garantieGarantieChoisieCorpsPK = new GarantieGarantieChoisieCorpsPK(codeGrtieChoisieTrspCorps, codeGarantie);
    }

    public GarantieGarantieChoisieCorpsPK getGarantieGarantieChoisieCorpsPK() {
        return garantieGarantieChoisieCorpsPK;
    }

    public void setGarantieGarantieChoisieCorpsPK(GarantieGarantieChoisieCorpsPK garantieGarantieChoisieCorpsPK) {
        this.garantieGarantieChoisieCorpsPK = garantieGarantieChoisieCorpsPK;
    }

    public String getNatureCorps() {
        return natureCorps;
    }

    public void setNatureCorps(String natureCorps) {
        this.natureCorps = natureCorps;
    }

    public BigDecimal getTauxCorps() {
        return tauxCorps;
    }

    public void setTauxCorps(BigDecimal tauxCorps) {
        this.tauxCorps = tauxCorps;
    }

    public BigDecimal getMinimumCorps() {
        return minimumCorps;
    }

    public void setMinimumCorps(BigDecimal minimumCorps) {
        this.minimumCorps = minimumCorps;
    }

    public BigDecimal getMaximumCrops() {
        return maximumCrops;
    }

    public void setMaximumCrops(BigDecimal maximumCrops) {
        this.maximumCrops = maximumCrops;
    }

    public Date getDateGarantieChoisieCorps() {
        return dateGarantieChoisieCorps;
    }

    public void setDateGarantieChoisieCorps(Date dateGarantieChoisieCorps) {
        this.dateGarantieChoisieCorps = dateGarantieChoisieCorps;
    }

    public BigDecimal getMontantGarantieCorps() {
        return montantGarantieCorps;
    }

    public void setMontantGarantieCorps(BigDecimal montantGarantieCorps) {
        this.montantGarantieCorps = montantGarantieCorps;
    }

    public BigDecimal getTauxFranchiseCorps() {
        return tauxFranchiseCorps;
    }

    public void setTauxFranchiseCorps(BigDecimal tauxFranchiseCorps) {
        this.tauxFranchiseCorps = tauxFranchiseCorps;
    }

    public BigDecimal getPrimeAnnuelleCorps() {
        return primeAnnuelleCorps;
    }

    public void setPrimeAnnuelleCorps(BigDecimal primeAnnuelleCorps) {
        this.primeAnnuelleCorps = primeAnnuelleCorps;
    }

    public BigDecimal getPrimeNetteAnnuelleCorps() {
        return primeNetteAnnuelleCorps;
    }

    public void setPrimeNetteAnnuelleCorps(BigDecimal primeNetteAnnuelleCorps) {
        this.primeNetteAnnuelleCorps = primeNetteAnnuelleCorps;
    }

    public BigDecimal getReductionCorps() {
        return reductionCorps;
    }

    public void setReductionCorps(BigDecimal reductionCorps) {
        this.reductionCorps = reductionCorps;
    }

    public String getSmp() {
        return smp;
    }

    public void setSmp(String smp) {
        this.smp = smp;
    }

    public BigDecimal getTauxPrime() {
        return tauxPrime;
    }

    public void setTauxPrime(BigDecimal tauxPrime) {
        this.tauxPrime = tauxPrime;
    }

    public BigDecimal getTauxLci() {
        return tauxLci;
    }

    public void setTauxLci(BigDecimal tauxLci) {
        this.tauxLci = tauxLci;
    }

    public BigDecimal getTauxRedcorps() {
        return tauxRedcorps;
    }

    public void setTauxRedcorps(BigDecimal tauxRedcorps) {
        this.tauxRedcorps = tauxRedcorps;
    }

    public BigDecimal getTauxGescorps() {
        return tauxGescorps;
    }

    public void setTauxGescorps(BigDecimal tauxGescorps) {
        this.tauxGescorps = tauxGescorps;
    }

    public BigDecimal getTauxComcoass() {
        return tauxComcoass;
    }

    public void setTauxComcoass(BigDecimal tauxComcoass) {
        this.tauxComcoass = tauxComcoass;
    }

    public BigDecimal getTauxinterm() {
        return tauxinterm;
    }

    public void setTauxinterm(BigDecimal tauxinterm) {
        this.tauxinterm = tauxinterm;
    }

    public BigDecimal getTauxcons() {
        return tauxcons;
    }

    public void setTauxcons(BigDecimal tauxcons) {
        this.tauxcons = tauxcons;
    }

    public BigDecimal getTauxredfranch() {
        return tauxredfranch;
    }

    public void setTauxredfranch(BigDecimal tauxredfranch) {
        this.tauxredfranch = tauxredfranch;
    }

    public BigDecimal getTauxcouv() {
        return tauxcouv;
    }

    public void setTauxcouv(BigDecimal tauxcouv) {
        this.tauxcouv = tauxcouv;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public BigDecimal getCapitalCorps() {
        return capitalCorps;
    }

    public void setCapitalCorps(BigDecimal capitalCorps) {
        this.capitalCorps = capitalCorps;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public GarantieChoisieTransportCorps getGarantieChoisieTransportCorps() {
        return garantieChoisieTransportCorps;
    }

    public void setGarantieChoisieTransportCorps(GarantieChoisieTransportCorps garantieChoisieTransportCorps) {
        this.garantieChoisieTransportCorps = garantieChoisieTransportCorps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieGarantieChoisieCorpsPK != null ? garantieGarantieChoisieCorpsPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieCorps)) {
            return false;
        }
        GarantieGarantieChoisieCorps other = (GarantieGarantieChoisieCorps) object;
        if ((this.garantieGarantieChoisieCorpsPK == null && other.garantieGarantieChoisieCorpsPK != null) || (this.garantieGarantieChoisieCorpsPK != null && !this.garantieGarantieChoisieCorpsPK.equals(other.garantieGarantieChoisieCorpsPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieCorps[ garantieGarantieChoisieCorpsPK=" + garantieGarantieChoisieCorpsPK + " ]";
    }
    
}
