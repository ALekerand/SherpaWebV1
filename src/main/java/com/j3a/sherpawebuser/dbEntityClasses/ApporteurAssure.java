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
@Table(name = "apporteur_assure")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurAssure.findAll", query = "SELECT a FROM ApporteurAssure a"),
    @NamedQuery(name = "ApporteurAssure.findByCodeApporteur", query = "SELECT a FROM ApporteurAssure a WHERE a.apporteurAssurePK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurAssure.findByNumIdentification", query = "SELECT a FROM ApporteurAssure a WHERE a.apporteurAssurePK.numIdentification = :numIdentification"),
    @NamedQuery(name = "ApporteurAssure.findByDateApporteurAssure", query = "SELECT a FROM ApporteurAssure a WHERE a.dateApporteurAssure = :dateApporteurAssure"),
    @NamedQuery(name = "ApporteurAssure.findByTauxComApporteurAssure", query = "SELECT a FROM ApporteurAssure a WHERE a.tauxComApporteurAssure = :tauxComApporteurAssure"),
    @NamedQuery(name = "ApporteurAssure.findByMontantComApporteurAssure", query = "SELECT a FROM ApporteurAssure a WHERE a.montantComApporteurAssure = :montantComApporteurAssure")})
public class ApporteurAssure implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurAssurePK apporteurAssurePK;
    @Column(name = "DATE_APPORTEUR_ASSURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurAssure;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_ASSURE")
    private BigDecimal tauxComApporteurAssure;
    @Column(name = "MONTANT_COM_APPORTEUR_ASSURE")
    private BigDecimal montantComApporteurAssure;
    @JoinColumn(name = "NUM_IDENTIFICATION", referencedColumnName = "NUM_IDENTIFICATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AssureIa assureIa;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurAssure() {
    }

    public ApporteurAssure(ApporteurAssurePK apporteurAssurePK) {
        this.apporteurAssurePK = apporteurAssurePK;
    }

    public ApporteurAssure(String codeApporteur, String numIdentification) {
        this.apporteurAssurePK = new ApporteurAssurePK(codeApporteur, numIdentification);
    }

    public ApporteurAssurePK getApporteurAssurePK() {
        return apporteurAssurePK;
    }

    public void setApporteurAssurePK(ApporteurAssurePK apporteurAssurePK) {
        this.apporteurAssurePK = apporteurAssurePK;
    }

    public Date getDateApporteurAssure() {
        return dateApporteurAssure;
    }

    public void setDateApporteurAssure(Date dateApporteurAssure) {
        this.dateApporteurAssure = dateApporteurAssure;
    }

    public BigDecimal getTauxComApporteurAssure() {
        return tauxComApporteurAssure;
    }

    public void setTauxComApporteurAssure(BigDecimal tauxComApporteurAssure) {
        this.tauxComApporteurAssure = tauxComApporteurAssure;
    }

    public BigDecimal getMontantComApporteurAssure() {
        return montantComApporteurAssure;
    }

    public void setMontantComApporteurAssure(BigDecimal montantComApporteurAssure) {
        this.montantComApporteurAssure = montantComApporteurAssure;
    }

    public AssureIa getAssureIa() {
        return assureIa;
    }

    public void setAssureIa(AssureIa assureIa) {
        this.assureIa = assureIa;
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
        hash += (apporteurAssurePK != null ? apporteurAssurePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurAssure)) {
            return false;
        }
        ApporteurAssure other = (ApporteurAssure) object;
        if ((this.apporteurAssurePK == null && other.apporteurAssurePK != null) || (this.apporteurAssurePK != null && !this.apporteurAssurePK.equals(other.apporteurAssurePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurAssure[ apporteurAssurePK=" + apporteurAssurePK + " ]";
    }
    
}
