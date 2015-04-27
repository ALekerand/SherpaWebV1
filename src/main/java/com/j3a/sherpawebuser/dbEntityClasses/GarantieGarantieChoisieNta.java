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
@Table(name = "garantie_garantie_choisie_nta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieNta.findAll", query = "SELECT g FROM GarantieGarantieChoisieNta g"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.garantieGarantieChoisieNtaPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByCodeGarantieChoisienta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.garantieGarantieChoisieNtaPK.codeGarantieChoisienta = :codeGarantieChoisienta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByPrimeAnnuelleNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.primeAnnuelleNta = :primeAnnuelleNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByNatureNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.natureNta = :natureNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxNta = :tauxNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByMaximumNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.maximumNta = :maximumNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByMinimumNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.minimumNta = :minimumNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByPrimeNetteNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.primeNetteNta = :primeNetteNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxFranchiseNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxFranchiseNta = :tauxFranchiseNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByReductionNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.reductionNta = :reductionNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findBySmpNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.smpNta = :smpNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxPrimeNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxPrimeNta = :tauxPrimeNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxLciNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxLciNta = :tauxLciNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxRedNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxRedNta = :tauxRedNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxGesNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxGesNta = :tauxGesNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxComNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxComNta = :tauxComNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxintermNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxintermNta = :tauxintermNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxConsNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxConsNta = :tauxConsNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxredfranchNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxredfranchNta = :tauxredfranchNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByTauxcouvNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.tauxcouvNta = :tauxcouvNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByObservationNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.observationNta = :observationNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByDateGarantieGarantieChoisieNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.dateGarantieGarantieChoisieNta = :dateGarantieGarantieChoisieNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByFacteurNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.facteurNta = :facteurNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByFranchiseNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.franchiseNta = :franchiseNta"),
    @NamedQuery(name = "GarantieGarantieChoisieNta.findByCapitalNta", query = "SELECT g FROM GarantieGarantieChoisieNta g WHERE g.capitalNta = :capitalNta")})
public class GarantieGarantieChoisieNta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieNtaPK garantieGarantieChoisieNtaPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_ANNUELLE_NTA")
    private BigDecimal primeAnnuelleNta;
    @Size(max = 50)
    @Column(name = "NATURE_NTA")
    private String natureNta;
    @Column(name = "TAUX_NTA")
    private BigDecimal tauxNta;
    @Column(name = "MAXIMUM_NTA")
    private BigDecimal maximumNta;
    @Column(name = "MINIMUM_NTA")
    private BigDecimal minimumNta;
    @Column(name = "PRIME_NETTE_NTA")
    private BigDecimal primeNetteNta;
    @Column(name = "TAUX_FRANCHISE_NTA")
    private BigDecimal tauxFranchiseNta;
    @Column(name = "REDUCTION_NTA")
    private BigDecimal reductionNta;
    @Size(max = 30)
    @Column(name = "SMP_NTA")
    private String smpNta;
    @Column(name = "TAUX_PRIME_NTA")
    private BigDecimal tauxPrimeNta;
    @Column(name = "TAUX_LCI_NTA")
    private BigDecimal tauxLciNta;
    @Column(name = "TAUX_RED_NTA")
    private BigDecimal tauxRedNta;
    @Column(name = "TAUX_GES_NTA")
    private BigDecimal tauxGesNta;
    @Column(name = "TAUX_COM_NTA")
    private BigDecimal tauxComNta;
    @Column(name = "TAUXINTERM_NTA")
    private BigDecimal tauxintermNta;
    @Column(name = "TAUX_CONS_NTA")
    private BigDecimal tauxConsNta;
    @Column(name = "TAUXREDFRANCH_NTA")
    private BigDecimal tauxredfranchNta;
    @Column(name = "TAUXCOUV_NTA")
    private BigDecimal tauxcouvNta;
    @Size(max = 50)
    @Column(name = "OBSERVATION_NTA")
    private String observationNta;
    @Column(name = "DATE_GARANTIE_GARANTIE_CHOISIE_NTA")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieGarantieChoisieNta;
    @Column(name = "FACTEUR_NTA")
    private BigDecimal facteurNta;
    @Column(name = "FRANCHISE_NTA")
    private BigDecimal franchiseNta;
    @Column(name = "CAPITAL_NTA")
    private BigDecimal capitalNta;
    @JoinColumn(name = "CODE_GARANTIE_CHOISIENTA", referencedColumnName = "CODE_GARANTIE_CHOISIENTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieNta garantieChoisieNta;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;

    public GarantieGarantieChoisieNta() {
    }

    public GarantieGarantieChoisieNta(GarantieGarantieChoisieNtaPK garantieGarantieChoisieNtaPK) {
        this.garantieGarantieChoisieNtaPK = garantieGarantieChoisieNtaPK;
    }

    public GarantieGarantieChoisieNta(String codeGarantie, String codeGarantieChoisienta) {
        this.garantieGarantieChoisieNtaPK = new GarantieGarantieChoisieNtaPK(codeGarantie, codeGarantieChoisienta);
    }

    public GarantieGarantieChoisieNtaPK getGarantieGarantieChoisieNtaPK() {
        return garantieGarantieChoisieNtaPK;
    }

    public void setGarantieGarantieChoisieNtaPK(GarantieGarantieChoisieNtaPK garantieGarantieChoisieNtaPK) {
        this.garantieGarantieChoisieNtaPK = garantieGarantieChoisieNtaPK;
    }

    public BigDecimal getPrimeAnnuelleNta() {
        return primeAnnuelleNta;
    }

    public void setPrimeAnnuelleNta(BigDecimal primeAnnuelleNta) {
        this.primeAnnuelleNta = primeAnnuelleNta;
    }

    public String getNatureNta() {
        return natureNta;
    }

    public void setNatureNta(String natureNta) {
        this.natureNta = natureNta;
    }

    public BigDecimal getTauxNta() {
        return tauxNta;
    }

    public void setTauxNta(BigDecimal tauxNta) {
        this.tauxNta = tauxNta;
    }

    public BigDecimal getMaximumNta() {
        return maximumNta;
    }

    public void setMaximumNta(BigDecimal maximumNta) {
        this.maximumNta = maximumNta;
    }

    public BigDecimal getMinimumNta() {
        return minimumNta;
    }

    public void setMinimumNta(BigDecimal minimumNta) {
        this.minimumNta = minimumNta;
    }

    public BigDecimal getPrimeNetteNta() {
        return primeNetteNta;
    }

    public void setPrimeNetteNta(BigDecimal primeNetteNta) {
        this.primeNetteNta = primeNetteNta;
    }

    public BigDecimal getTauxFranchiseNta() {
        return tauxFranchiseNta;
    }

    public void setTauxFranchiseNta(BigDecimal tauxFranchiseNta) {
        this.tauxFranchiseNta = tauxFranchiseNta;
    }

    public BigDecimal getReductionNta() {
        return reductionNta;
    }

    public void setReductionNta(BigDecimal reductionNta) {
        this.reductionNta = reductionNta;
    }

    public String getSmpNta() {
        return smpNta;
    }

    public void setSmpNta(String smpNta) {
        this.smpNta = smpNta;
    }

    public BigDecimal getTauxPrimeNta() {
        return tauxPrimeNta;
    }

    public void setTauxPrimeNta(BigDecimal tauxPrimeNta) {
        this.tauxPrimeNta = tauxPrimeNta;
    }

    public BigDecimal getTauxLciNta() {
        return tauxLciNta;
    }

    public void setTauxLciNta(BigDecimal tauxLciNta) {
        this.tauxLciNta = tauxLciNta;
    }

    public BigDecimal getTauxRedNta() {
        return tauxRedNta;
    }

    public void setTauxRedNta(BigDecimal tauxRedNta) {
        this.tauxRedNta = tauxRedNta;
    }

    public BigDecimal getTauxGesNta() {
        return tauxGesNta;
    }

    public void setTauxGesNta(BigDecimal tauxGesNta) {
        this.tauxGesNta = tauxGesNta;
    }

    public BigDecimal getTauxComNta() {
        return tauxComNta;
    }

    public void setTauxComNta(BigDecimal tauxComNta) {
        this.tauxComNta = tauxComNta;
    }

    public BigDecimal getTauxintermNta() {
        return tauxintermNta;
    }

    public void setTauxintermNta(BigDecimal tauxintermNta) {
        this.tauxintermNta = tauxintermNta;
    }

    public BigDecimal getTauxConsNta() {
        return tauxConsNta;
    }

    public void setTauxConsNta(BigDecimal tauxConsNta) {
        this.tauxConsNta = tauxConsNta;
    }

    public BigDecimal getTauxredfranchNta() {
        return tauxredfranchNta;
    }

    public void setTauxredfranchNta(BigDecimal tauxredfranchNta) {
        this.tauxredfranchNta = tauxredfranchNta;
    }

    public BigDecimal getTauxcouvNta() {
        return tauxcouvNta;
    }

    public void setTauxcouvNta(BigDecimal tauxcouvNta) {
        this.tauxcouvNta = tauxcouvNta;
    }

    public String getObservationNta() {
        return observationNta;
    }

    public void setObservationNta(String observationNta) {
        this.observationNta = observationNta;
    }

    public Date getDateGarantieGarantieChoisieNta() {
        return dateGarantieGarantieChoisieNta;
    }

    public void setDateGarantieGarantieChoisieNta(Date dateGarantieGarantieChoisieNta) {
        this.dateGarantieGarantieChoisieNta = dateGarantieGarantieChoisieNta;
    }

    public BigDecimal getFacteurNta() {
        return facteurNta;
    }

    public void setFacteurNta(BigDecimal facteurNta) {
        this.facteurNta = facteurNta;
    }

    public BigDecimal getFranchiseNta() {
        return franchiseNta;
    }

    public void setFranchiseNta(BigDecimal franchiseNta) {
        this.franchiseNta = franchiseNta;
    }

    public BigDecimal getCapitalNta() {
        return capitalNta;
    }

    public void setCapitalNta(BigDecimal capitalNta) {
        this.capitalNta = capitalNta;
    }

    public GarantieChoisieNta getGarantieChoisieNta() {
        return garantieChoisieNta;
    }

    public void setGarantieChoisieNta(GarantieChoisieNta garantieChoisieNta) {
        this.garantieChoisieNta = garantieChoisieNta;
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
        hash += (garantieGarantieChoisieNtaPK != null ? garantieGarantieChoisieNtaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieNta)) {
            return false;
        }
        GarantieGarantieChoisieNta other = (GarantieGarantieChoisieNta) object;
        if ((this.garantieGarantieChoisieNtaPK == null && other.garantieGarantieChoisieNtaPK != null) || (this.garantieGarantieChoisieNtaPK != null && !this.garantieGarantieChoisieNtaPK.equals(other.garantieGarantieChoisieNtaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieNta[ garantieGarantieChoisieNtaPK=" + garantieGarantieChoisieNtaPK + " ]";
    }
    
}
