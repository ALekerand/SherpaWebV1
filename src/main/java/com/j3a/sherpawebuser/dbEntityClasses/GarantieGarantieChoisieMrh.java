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
@Table(name = "garantie_garantie_choisie_mrh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findAll", query = "SELECT g FROM GarantieGarantieChoisieMrh g"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.garantieGarantieChoisieMrhPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByCodeGarantieChoisiemrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.garantieGarantieChoisieMrhPK.codeGarantieChoisiemrh = :codeGarantieChoisiemrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByPrimeannuelleMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.primeannuelleMrh = :primeannuelleMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByNatureMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.natureMrh = :natureMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxMrh = :tauxMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByMinimumMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.minimumMrh = :minimumMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByMaximumMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.maximumMrh = :maximumMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByPrimeNetteMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.primeNetteMrh = :primeNetteMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxFranchiseMr", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxFranchiseMr = :tauxFranchiseMr"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByReductionMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.reductionMrh = :reductionMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findBySmpMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.smpMrh = :smpMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxPrimeMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxPrimeMrh = :tauxPrimeMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxLciMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxLciMrh = :tauxLciMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxRedMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxRedMrh = :tauxRedMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxGesMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxGesMrh = :tauxGesMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxComMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxComMrh = :tauxComMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxintermMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxintermMrh = :tauxintermMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxConsMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxConsMrh = :tauxConsMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxredfranchMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxredfranchMrh = :tauxredfranchMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByTauxcouvMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.tauxcouvMrh = :tauxcouvMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByObservationMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.observationMrh = :observationMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByDateGarantieGarantieChoisieMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.dateGarantieGarantieChoisieMrh = :dateGarantieGarantieChoisieMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByFacteurMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.facteurMrh = :facteurMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByFranchiseMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.franchiseMrh = :franchiseMrh"),
    @NamedQuery(name = "GarantieGarantieChoisieMrh.findByCapitalMrh", query = "SELECT g FROM GarantieGarantieChoisieMrh g WHERE g.capitalMrh = :capitalMrh")})
public class GarantieGarantieChoisieMrh implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieMrhPK garantieGarantieChoisieMrhPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIMEANNUELLE_MRH")
    private BigDecimal primeannuelleMrh;
    @Size(max = 50)
    @Column(name = "NATURE_MRH")
    private String natureMrh;
    @Column(name = "TAUX_MRH")
    private BigDecimal tauxMrh;
    @Column(name = "MINIMUM_MRH")
    private BigDecimal minimumMrh;
    @Column(name = "MAXIMUM_MRH")
    private BigDecimal maximumMrh;
    @Column(name = "PRIME_NETTE_MRH")
    private BigDecimal primeNetteMrh;
    @Column(name = "TAUX_FRANCHISE_MR")
    private BigDecimal tauxFranchiseMr;
    @Column(name = "REDUCTION_MRH")
    private BigDecimal reductionMrh;
    @Size(max = 30)
    @Column(name = "SMP_MRH")
    private String smpMrh;
    @Column(name = "TAUX_PRIME_MRH")
    private BigDecimal tauxPrimeMrh;
    @Column(name = "TAUX_LCI_MRH")
    private BigDecimal tauxLciMrh;
    @Column(name = "TAUX_RED_MRH")
    private BigDecimal tauxRedMrh;
    @Column(name = "TAUX_GES_MRH")
    private BigDecimal tauxGesMrh;
    @Column(name = "TAUX_COM_MRH")
    private BigDecimal tauxComMrh;
    @Column(name = "TAUXINTERM_MRH")
    private BigDecimal tauxintermMrh;
    @Column(name = "TAUX_CONS_MRH")
    private BigDecimal tauxConsMrh;
    @Column(name = "TAUXREDFRANCH_MRH")
    private BigDecimal tauxredfranchMrh;
    @Column(name = "TAUXCOUV_MRH")
    private BigDecimal tauxcouvMrh;
    @Size(max = 50)
    @Column(name = "OBSERVATION_MRH")
    private String observationMrh;
    @Column(name = "DATE_GARANTIE_GARANTIE_CHOISIE_MRH")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieGarantieChoisieMrh;
    @Column(name = "FACTEUR_MRH")
    private BigDecimal facteurMrh;
    @Column(name = "FRANCHISE_MRH")
    private BigDecimal franchiseMrh;
    @Column(name = "CAPITAL_MRH")
    private BigDecimal capitalMrh;
    @JoinColumn(name = "CODE_GARANTIE_CHOISIEMRH", referencedColumnName = "CODE_GARANTIE_CHOISIEMRH", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieMrh garantieChoisieMrh;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;

    public GarantieGarantieChoisieMrh() {
    }

    public GarantieGarantieChoisieMrh(GarantieGarantieChoisieMrhPK garantieGarantieChoisieMrhPK) {
        this.garantieGarantieChoisieMrhPK = garantieGarantieChoisieMrhPK;
    }

    public GarantieGarantieChoisieMrh(String codeGarantie, String codeGarantieChoisiemrh) {
        this.garantieGarantieChoisieMrhPK = new GarantieGarantieChoisieMrhPK(codeGarantie, codeGarantieChoisiemrh);
    }

    public GarantieGarantieChoisieMrhPK getGarantieGarantieChoisieMrhPK() {
        return garantieGarantieChoisieMrhPK;
    }

    public void setGarantieGarantieChoisieMrhPK(GarantieGarantieChoisieMrhPK garantieGarantieChoisieMrhPK) {
        this.garantieGarantieChoisieMrhPK = garantieGarantieChoisieMrhPK;
    }

    public BigDecimal getPrimeannuelleMrh() {
        return primeannuelleMrh;
    }

    public void setPrimeannuelleMrh(BigDecimal primeannuelleMrh) {
        this.primeannuelleMrh = primeannuelleMrh;
    }

    public String getNatureMrh() {
        return natureMrh;
    }

    public void setNatureMrh(String natureMrh) {
        this.natureMrh = natureMrh;
    }

    public BigDecimal getTauxMrh() {
        return tauxMrh;
    }

    public void setTauxMrh(BigDecimal tauxMrh) {
        this.tauxMrh = tauxMrh;
    }

    public BigDecimal getMinimumMrh() {
        return minimumMrh;
    }

    public void setMinimumMrh(BigDecimal minimumMrh) {
        this.minimumMrh = minimumMrh;
    }

    public BigDecimal getMaximumMrh() {
        return maximumMrh;
    }

    public void setMaximumMrh(BigDecimal maximumMrh) {
        this.maximumMrh = maximumMrh;
    }

    public BigDecimal getPrimeNetteMrh() {
        return primeNetteMrh;
    }

    public void setPrimeNetteMrh(BigDecimal primeNetteMrh) {
        this.primeNetteMrh = primeNetteMrh;
    }

    public BigDecimal getTauxFranchiseMr() {
        return tauxFranchiseMr;
    }

    public void setTauxFranchiseMr(BigDecimal tauxFranchiseMr) {
        this.tauxFranchiseMr = tauxFranchiseMr;
    }

    public BigDecimal getReductionMrh() {
        return reductionMrh;
    }

    public void setReductionMrh(BigDecimal reductionMrh) {
        this.reductionMrh = reductionMrh;
    }

    public String getSmpMrh() {
        return smpMrh;
    }

    public void setSmpMrh(String smpMrh) {
        this.smpMrh = smpMrh;
    }

    public BigDecimal getTauxPrimeMrh() {
        return tauxPrimeMrh;
    }

    public void setTauxPrimeMrh(BigDecimal tauxPrimeMrh) {
        this.tauxPrimeMrh = tauxPrimeMrh;
    }

    public BigDecimal getTauxLciMrh() {
        return tauxLciMrh;
    }

    public void setTauxLciMrh(BigDecimal tauxLciMrh) {
        this.tauxLciMrh = tauxLciMrh;
    }

    public BigDecimal getTauxRedMrh() {
        return tauxRedMrh;
    }

    public void setTauxRedMrh(BigDecimal tauxRedMrh) {
        this.tauxRedMrh = tauxRedMrh;
    }

    public BigDecimal getTauxGesMrh() {
        return tauxGesMrh;
    }

    public void setTauxGesMrh(BigDecimal tauxGesMrh) {
        this.tauxGesMrh = tauxGesMrh;
    }

    public BigDecimal getTauxComMrh() {
        return tauxComMrh;
    }

    public void setTauxComMrh(BigDecimal tauxComMrh) {
        this.tauxComMrh = tauxComMrh;
    }

    public BigDecimal getTauxintermMrh() {
        return tauxintermMrh;
    }

    public void setTauxintermMrh(BigDecimal tauxintermMrh) {
        this.tauxintermMrh = tauxintermMrh;
    }

    public BigDecimal getTauxConsMrh() {
        return tauxConsMrh;
    }

    public void setTauxConsMrh(BigDecimal tauxConsMrh) {
        this.tauxConsMrh = tauxConsMrh;
    }

    public BigDecimal getTauxredfranchMrh() {
        return tauxredfranchMrh;
    }

    public void setTauxredfranchMrh(BigDecimal tauxredfranchMrh) {
        this.tauxredfranchMrh = tauxredfranchMrh;
    }

    public BigDecimal getTauxcouvMrh() {
        return tauxcouvMrh;
    }

    public void setTauxcouvMrh(BigDecimal tauxcouvMrh) {
        this.tauxcouvMrh = tauxcouvMrh;
    }

    public String getObservationMrh() {
        return observationMrh;
    }

    public void setObservationMrh(String observationMrh) {
        this.observationMrh = observationMrh;
    }

    public Date getDateGarantieGarantieChoisieMrh() {
        return dateGarantieGarantieChoisieMrh;
    }

    public void setDateGarantieGarantieChoisieMrh(Date dateGarantieGarantieChoisieMrh) {
        this.dateGarantieGarantieChoisieMrh = dateGarantieGarantieChoisieMrh;
    }

    public BigDecimal getFacteurMrh() {
        return facteurMrh;
    }

    public void setFacteurMrh(BigDecimal facteurMrh) {
        this.facteurMrh = facteurMrh;
    }

    public BigDecimal getFranchiseMrh() {
        return franchiseMrh;
    }

    public void setFranchiseMrh(BigDecimal franchiseMrh) {
        this.franchiseMrh = franchiseMrh;
    }

    public BigDecimal getCapitalMrh() {
        return capitalMrh;
    }

    public void setCapitalMrh(BigDecimal capitalMrh) {
        this.capitalMrh = capitalMrh;
    }

    public GarantieChoisieMrh getGarantieChoisieMrh() {
        return garantieChoisieMrh;
    }

    public void setGarantieChoisieMrh(GarantieChoisieMrh garantieChoisieMrh) {
        this.garantieChoisieMrh = garantieChoisieMrh;
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
        hash += (garantieGarantieChoisieMrhPK != null ? garantieGarantieChoisieMrhPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieMrh)) {
            return false;
        }
        GarantieGarantieChoisieMrh other = (GarantieGarantieChoisieMrh) object;
        if ((this.garantieGarantieChoisieMrhPK == null && other.garantieGarantieChoisieMrhPK != null) || (this.garantieGarantieChoisieMrhPK != null && !this.garantieGarantieChoisieMrhPK.equals(other.garantieGarantieChoisieMrhPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieMrh[ garantieGarantieChoisieMrhPK=" + garantieGarantieChoisieMrhPK + " ]";
    }
    
}
