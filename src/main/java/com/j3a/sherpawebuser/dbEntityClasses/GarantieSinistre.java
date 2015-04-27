/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
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
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "garantie_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieSinistre.findAll", query = "SELECT g FROM GarantieSinistre g"),
    @NamedQuery(name = "GarantieSinistre.findByCodeSinistre", query = "SELECT g FROM GarantieSinistre g WHERE g.garantieSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "GarantieSinistre.findByCodeGarantie", query = "SELECT g FROM GarantieSinistre g WHERE g.garantieSinistrePK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieSinistre.findByDateGarantieSinistre", query = "SELECT g FROM GarantieSinistre g WHERE g.dateGarantieSinistre = :dateGarantieSinistre"),
    @NamedQuery(name = "GarantieSinistre.findByPrimeGarantieSinistre", query = "SELECT g FROM GarantieSinistre g WHERE g.primeGarantieSinistre = :primeGarantieSinistre"),
    @NamedQuery(name = "GarantieSinistre.findByMontantEvaluationSin", query = "SELECT g FROM GarantieSinistre g WHERE g.montantEvaluationSin = :montantEvaluationSin"),
    @NamedQuery(name = "GarantieSinistre.findByAutresFraisEvaluation", query = "SELECT g FROM GarantieSinistre g WHERE g.autresFraisEvaluation = :autresFraisEvaluation")})
public class GarantieSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieSinistrePK garantieSinistrePK;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DATE_GARANTIE_SINISTRE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieSinistre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_GARANTIE_SINISTRE")
    private BigDecimal primeGarantieSinistre;
    @Column(name = "MONTANT_EVALUATION_SIN")
    private BigDecimal montantEvaluationSin;
    @Column(name = "AUTRES_FRAIS_EVALUATION")
    private BigDecimal autresFraisEvaluation;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public GarantieSinistre() {
    }

    public GarantieSinistre(GarantieSinistrePK garantieSinistrePK) {
        this.garantieSinistrePK = garantieSinistrePK;
    }

    public GarantieSinistre(GarantieSinistrePK garantieSinistrePK, Date dateGarantieSinistre) {
        this.garantieSinistrePK = garantieSinistrePK;
        this.dateGarantieSinistre = dateGarantieSinistre;
    }

    public GarantieSinistre(String codeSinistre, String codeGarantie) {
        this.garantieSinistrePK = new GarantieSinistrePK(codeSinistre, codeGarantie);
    }

    public GarantieSinistrePK getGarantieSinistrePK() {
        return garantieSinistrePK;
    }

    public void setGarantieSinistrePK(GarantieSinistrePK garantieSinistrePK) {
        this.garantieSinistrePK = garantieSinistrePK;
    }

    public Date getDateGarantieSinistre() {
        return dateGarantieSinistre;
    }

    public void setDateGarantieSinistre(Date dateGarantieSinistre) {
        this.dateGarantieSinistre = dateGarantieSinistre;
    }

    public BigDecimal getPrimeGarantieSinistre() {
        return primeGarantieSinistre;
    }

    public void setPrimeGarantieSinistre(BigDecimal primeGarantieSinistre) {
        this.primeGarantieSinistre = primeGarantieSinistre;
    }

    public BigDecimal getMontantEvaluationSin() {
        return montantEvaluationSin;
    }

    public void setMontantEvaluationSin(BigDecimal montantEvaluationSin) {
        this.montantEvaluationSin = montantEvaluationSin;
    }

    public BigDecimal getAutresFraisEvaluation() {
        return autresFraisEvaluation;
    }

    public void setAutresFraisEvaluation(BigDecimal autresFraisEvaluation) {
        this.autresFraisEvaluation = autresFraisEvaluation;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieSinistrePK != null ? garantieSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieSinistre)) {
            return false;
        }
        GarantieSinistre other = (GarantieSinistre) object;
        if ((this.garantieSinistrePK == null && other.garantieSinistrePK != null) || (this.garantieSinistrePK != null && !this.garantieSinistrePK.equals(other.garantieSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieSinistre[ garantieSinistrePK=" + garantieSinistrePK + " ]";
    }
    
}
