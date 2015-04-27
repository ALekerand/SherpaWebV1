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
@Table(name = "apporteur_aliment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurAliment.findAll", query = "SELECT a FROM ApporteurAliment a"),
    @NamedQuery(name = "ApporteurAliment.findByCodeApporteur", query = "SELECT a FROM ApporteurAliment a WHERE a.apporteurAlimentPK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurAliment.findByCodeAliment", query = "SELECT a FROM ApporteurAliment a WHERE a.apporteurAlimentPK.codeAliment = :codeAliment"),
    @NamedQuery(name = "ApporteurAliment.findByDateApporteurAliment", query = "SELECT a FROM ApporteurAliment a WHERE a.dateApporteurAliment = :dateApporteurAliment"),
    @NamedQuery(name = "ApporteurAliment.findByTauxComApporteurAliment", query = "SELECT a FROM ApporteurAliment a WHERE a.tauxComApporteurAliment = :tauxComApporteurAliment"),
    @NamedQuery(name = "ApporteurAliment.findByMontantComApporteurAliment", query = "SELECT a FROM ApporteurAliment a WHERE a.montantComApporteurAliment = :montantComApporteurAliment")})
public class ApporteurAliment implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurAlimentPK apporteurAlimentPK;
    @Column(name = "DATE_APPORTEUR_ALIMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurAliment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_ALIMENT")
    private BigDecimal tauxComApporteurAliment;
    @Column(name = "MONTANT_COM_APPORTEUR_ALIMENT")
    private BigDecimal montantComApporteurAliment;
    @JoinColumn(name = "CODE_ALIMENT", referencedColumnName = "CODE_ALIMENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Aliment aliment;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurAliment() {
    }

    public ApporteurAliment(ApporteurAlimentPK apporteurAlimentPK) {
        this.apporteurAlimentPK = apporteurAlimentPK;
    }

    public ApporteurAliment(String codeApporteur, String codeAliment) {
        this.apporteurAlimentPK = new ApporteurAlimentPK(codeApporteur, codeAliment);
    }

    public ApporteurAlimentPK getApporteurAlimentPK() {
        return apporteurAlimentPK;
    }

    public void setApporteurAlimentPK(ApporteurAlimentPK apporteurAlimentPK) {
        this.apporteurAlimentPK = apporteurAlimentPK;
    }

    public Date getDateApporteurAliment() {
        return dateApporteurAliment;
    }

    public void setDateApporteurAliment(Date dateApporteurAliment) {
        this.dateApporteurAliment = dateApporteurAliment;
    }

    public BigDecimal getTauxComApporteurAliment() {
        return tauxComApporteurAliment;
    }

    public void setTauxComApporteurAliment(BigDecimal tauxComApporteurAliment) {
        this.tauxComApporteurAliment = tauxComApporteurAliment;
    }

    public BigDecimal getMontantComApporteurAliment() {
        return montantComApporteurAliment;
    }

    public void setMontantComApporteurAliment(BigDecimal montantComApporteurAliment) {
        this.montantComApporteurAliment = montantComApporteurAliment;
    }

    public Aliment getAliment() {
        return aliment;
    }

    public void setAliment(Aliment aliment) {
        this.aliment = aliment;
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
        hash += (apporteurAlimentPK != null ? apporteurAlimentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurAliment)) {
            return false;
        }
        ApporteurAliment other = (ApporteurAliment) object;
        if ((this.apporteurAlimentPK == null && other.apporteurAlimentPK != null) || (this.apporteurAlimentPK != null && !this.apporteurAlimentPK.equals(other.apporteurAlimentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurAliment[ apporteurAlimentPK=" + apporteurAlimentPK + " ]";
    }
    
}
