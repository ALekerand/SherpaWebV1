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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "apporteur_nta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurNta.findAll", query = "SELECT a FROM ApporteurNta a"),
    @NamedQuery(name = "ApporteurNta.findByCodeApporteur", query = "SELECT a FROM ApporteurNta a WHERE a.apporteurNtaPK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurNta.findByCodeRisquenta", query = "SELECT a FROM ApporteurNta a WHERE a.apporteurNtaPK.codeRisquenta = :codeRisquenta"),
    @NamedQuery(name = "ApporteurNta.findByDateApporteurNta", query = "SELECT a FROM ApporteurNta a WHERE a.dateApporteurNta = :dateApporteurNta"),
    @NamedQuery(name = "ApporteurNta.findByTauxComApporteurNta", query = "SELECT a FROM ApporteurNta a WHERE a.tauxComApporteurNta = :tauxComApporteurNta"),
    @NamedQuery(name = "ApporteurNta.findByMontantComApporteurNta", query = "SELECT a FROM ApporteurNta a WHERE a.montantComApporteurNta = :montantComApporteurNta")})
public class ApporteurNta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurNtaPK apporteurNtaPK;
    @Column(name = "DATE_APPORTEUR_NTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurNta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_NTA")
    private BigDecimal tauxComApporteurNta;
    @Column(name = "MONTANT_COM_APPORTEUR_NTA")
    private BigDecimal montantComApporteurNta;
    @JoinColumn(name = "CODE_RISQUENTA", referencedColumnName = "CODE_RISQUENTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RisqueNta risqueNta;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurNta() {
    }

    public ApporteurNta(ApporteurNtaPK apporteurNtaPK) {
        this.apporteurNtaPK = apporteurNtaPK;
    }

    public ApporteurNta(String codeApporteur, String codeRisquenta) {
        this.apporteurNtaPK = new ApporteurNtaPK(codeApporteur, codeRisquenta);
    }

    public ApporteurNtaPK getApporteurNtaPK() {
        return apporteurNtaPK;
    }

    public void setApporteurNtaPK(ApporteurNtaPK apporteurNtaPK) {
        this.apporteurNtaPK = apporteurNtaPK;
    }

    public Date getDateApporteurNta() {
        return dateApporteurNta;
    }

    public void setDateApporteurNta(Date dateApporteurNta) {
        this.dateApporteurNta = dateApporteurNta;
    }

    public BigDecimal getTauxComApporteurNta() {
        return tauxComApporteurNta;
    }

    public void setTauxComApporteurNta(BigDecimal tauxComApporteurNta) {
        this.tauxComApporteurNta = tauxComApporteurNta;
    }

    public BigDecimal getMontantComApporteurNta() {
        return montantComApporteurNta;
    }

    public void setMontantComApporteurNta(BigDecimal montantComApporteurNta) {
        this.montantComApporteurNta = montantComApporteurNta;
    }

    public RisqueNta getRisqueNta() {
        return risqueNta;
    }

    public void setRisqueNta(RisqueNta risqueNta) {
        this.risqueNta = risqueNta;
    }

    public Apporteur getApporteur() {
        return apporteur;
    }

    public void setApporteur(Apporteur apporteur) {
        this.apporteur = apporteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (apporteurNtaPK != null ? apporteurNtaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurNta)) {
            return false;
        }
        ApporteurNta other = (ApporteurNta) object;
        if ((this.apporteurNtaPK == null && other.apporteurNtaPK != null) || (this.apporteurNtaPK != null && !this.apporteurNtaPK.equals(other.apporteurNtaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurNta[ apporteurNtaPK=" + apporteurNtaPK + " ]";
    }
    
}
