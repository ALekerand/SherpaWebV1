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
@Table(name = "garantie_garantie_choisie_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieSante.findAll", query = "SELECT g FROM GarantieGarantieChoisieSante g"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.garantieGarantieChoisieSantePK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByCodeGarantieChoisiesante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.garantieGarantieChoisieSantePK.codeGarantieChoisiesante = :codeGarantieChoisiesante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByPrimeNetteSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.primeNetteSante = :primeNetteSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByReductionSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.reductionSante = :reductionSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxPrimeSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxPrimeSante = :tauxPrimeSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxRedSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxRedSante = :tauxRedSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxGesSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxGesSante = :tauxGesSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxComSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxComSante = :tauxComSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxintermSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxintermSante = :tauxintermSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxConsSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxConsSante = :tauxConsSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByDateGarantieGarantieChoisieSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.dateGarantieGarantieChoisieSante = :dateGarantieGarantieChoisieSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByCapitalSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.capitalSante = :capitalSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByDelaiCarence", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.delaiCarence = :delaiCarence"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByObservationSante", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.observationSante = :observationSante"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByTauxFacteurMajoration", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.tauxFacteurMajoration = :tauxFacteurMajoration"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findBySurprimeFacteurMajoration", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.surprimeFacteurMajoration = :surprimeFacteurMajoration"),
    @NamedQuery(name = "GarantieGarantieChoisieSante.findByObservationFacteurMajoration", query = "SELECT g FROM GarantieGarantieChoisieSante g WHERE g.observationFacteurMajoration = :observationFacteurMajoration")})
public class GarantieGarantieChoisieSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieSantePK garantieGarantieChoisieSantePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTE_SANTE")
    private BigDecimal primeNetteSante;
    @Column(name = "REDUCTION_SANTE")
    private BigDecimal reductionSante;
    @Column(name = "TAUX_PRIME_SANTE")
    private BigDecimal tauxPrimeSante;
    @Column(name = "TAUX_RED_SANTE")
    private BigDecimal tauxRedSante;
    @Column(name = "TAUX_GES_SANTE")
    private BigDecimal tauxGesSante;
    @Column(name = "TAUX_COM_SANTE")
    private BigDecimal tauxComSante;
    @Column(name = "TAUXINTERM_SANTE")
    private BigDecimal tauxintermSante;
    @Column(name = "TAUX_CONS_SANTE")
    private BigDecimal tauxConsSante;
    @Column(name = "DATE_GARANTIE_GARANTIE_CHOISIE_SANTE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieGarantieChoisieSante;
    @Column(name = "CAPITAL_SANTE")
    private BigDecimal capitalSante;
    @Column(name = "DELAI_CARENCE")
    private Integer delaiCarence;
    @Size(max = 50)
    @Column(name = "OBSERVATION_SANTE")
    private String observationSante;
    @Column(name = "TAUX_FACTEUR_MAJORATION")
    private BigDecimal tauxFacteurMajoration;
    @Column(name = "SURPRIME_FACTEUR_MAJORATION")
    private BigDecimal surprimeFacteurMajoration;
    @Size(max = 60)
    @Column(name = "OBSERVATION_FACTEUR_MAJORATION")
    private String observationFacteurMajoration;
    @JoinColumn(name = "CODE_GARANTIE_CHOISIESANTE", referencedColumnName = "CODE_GARANTIE_CHOISIESANTE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieSante garantieChoisieSante;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;

    public GarantieGarantieChoisieSante() {
    }

    public GarantieGarantieChoisieSante(GarantieGarantieChoisieSantePK garantieGarantieChoisieSantePK) {
        this.garantieGarantieChoisieSantePK = garantieGarantieChoisieSantePK;
    }

    public GarantieGarantieChoisieSante(String codeGarantie, String codeGarantieChoisiesante) {
        this.garantieGarantieChoisieSantePK = new GarantieGarantieChoisieSantePK(codeGarantie, codeGarantieChoisiesante);
    }

    public GarantieGarantieChoisieSantePK getGarantieGarantieChoisieSantePK() {
        return garantieGarantieChoisieSantePK;
    }

    public void setGarantieGarantieChoisieSantePK(GarantieGarantieChoisieSantePK garantieGarantieChoisieSantePK) {
        this.garantieGarantieChoisieSantePK = garantieGarantieChoisieSantePK;
    }

    public BigDecimal getPrimeNetteSante() {
        return primeNetteSante;
    }

    public void setPrimeNetteSante(BigDecimal primeNetteSante) {
        this.primeNetteSante = primeNetteSante;
    }

    public BigDecimal getReductionSante() {
        return reductionSante;
    }

    public void setReductionSante(BigDecimal reductionSante) {
        this.reductionSante = reductionSante;
    }

    public BigDecimal getTauxPrimeSante() {
        return tauxPrimeSante;
    }

    public void setTauxPrimeSante(BigDecimal tauxPrimeSante) {
        this.tauxPrimeSante = tauxPrimeSante;
    }

    public BigDecimal getTauxRedSante() {
        return tauxRedSante;
    }

    public void setTauxRedSante(BigDecimal tauxRedSante) {
        this.tauxRedSante = tauxRedSante;
    }

    public BigDecimal getTauxGesSante() {
        return tauxGesSante;
    }

    public void setTauxGesSante(BigDecimal tauxGesSante) {
        this.tauxGesSante = tauxGesSante;
    }

    public BigDecimal getTauxComSante() {
        return tauxComSante;
    }

    public void setTauxComSante(BigDecimal tauxComSante) {
        this.tauxComSante = tauxComSante;
    }

    public BigDecimal getTauxintermSante() {
        return tauxintermSante;
    }

    public void setTauxintermSante(BigDecimal tauxintermSante) {
        this.tauxintermSante = tauxintermSante;
    }

    public BigDecimal getTauxConsSante() {
        return tauxConsSante;
    }

    public void setTauxConsSante(BigDecimal tauxConsSante) {
        this.tauxConsSante = tauxConsSante;
    }

    public Date getDateGarantieGarantieChoisieSante() {
        return dateGarantieGarantieChoisieSante;
    }

    public void setDateGarantieGarantieChoisieSante(Date dateGarantieGarantieChoisieSante) {
        this.dateGarantieGarantieChoisieSante = dateGarantieGarantieChoisieSante;
    }

    public BigDecimal getCapitalSante() {
        return capitalSante;
    }

    public void setCapitalSante(BigDecimal capitalSante) {
        this.capitalSante = capitalSante;
    }

    public Integer getDelaiCarence() {
        return delaiCarence;
    }

    public void setDelaiCarence(Integer delaiCarence) {
        this.delaiCarence = delaiCarence;
    }

    public String getObservationSante() {
        return observationSante;
    }

    public void setObservationSante(String observationSante) {
        this.observationSante = observationSante;
    }

    public BigDecimal getTauxFacteurMajoration() {
        return tauxFacteurMajoration;
    }

    public void setTauxFacteurMajoration(BigDecimal tauxFacteurMajoration) {
        this.tauxFacteurMajoration = tauxFacteurMajoration;
    }

    public BigDecimal getSurprimeFacteurMajoration() {
        return surprimeFacteurMajoration;
    }

    public void setSurprimeFacteurMajoration(BigDecimal surprimeFacteurMajoration) {
        this.surprimeFacteurMajoration = surprimeFacteurMajoration;
    }

    public String getObservationFacteurMajoration() {
        return observationFacteurMajoration;
    }

    public void setObservationFacteurMajoration(String observationFacteurMajoration) {
        this.observationFacteurMajoration = observationFacteurMajoration;
    }

    public GarantieChoisieSante getGarantieChoisieSante() {
        return garantieChoisieSante;
    }

    public void setGarantieChoisieSante(GarantieChoisieSante garantieChoisieSante) {
        this.garantieChoisieSante = garantieChoisieSante;
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
        hash += (garantieGarantieChoisieSantePK != null ? garantieGarantieChoisieSantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieSante)) {
            return false;
        }
        GarantieGarantieChoisieSante other = (GarantieGarantieChoisieSante) object;
        if ((this.garantieGarantieChoisieSantePK == null && other.garantieGarantieChoisieSantePK != null) || (this.garantieGarantieChoisieSantePK != null && !this.garantieGarantieChoisieSantePK.equals(other.garantieGarantieChoisieSantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieSante[ garantieGarantieChoisieSantePK=" + garantieGarantieChoisieSantePK + " ]";
    }
    
}
