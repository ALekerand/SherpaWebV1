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
@Table(name = "apporteur_corps_engin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurCorpsEngin.findAll", query = "SELECT a FROM ApporteurCorpsEngin a"),
    @NamedQuery(name = "ApporteurCorpsEngin.findByCodeApporteur", query = "SELECT a FROM ApporteurCorpsEngin a WHERE a.apporteurCorpsEnginPK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurCorpsEngin.findByCodeEngin", query = "SELECT a FROM ApporteurCorpsEngin a WHERE a.apporteurCorpsEnginPK.codeEngin = :codeEngin"),
    @NamedQuery(name = "ApporteurCorpsEngin.findByDateApporteurCorpsEngin", query = "SELECT a FROM ApporteurCorpsEngin a WHERE a.dateApporteurCorpsEngin = :dateApporteurCorpsEngin"),
    @NamedQuery(name = "ApporteurCorpsEngin.findByTauxComApporteurCorpsEngin", query = "SELECT a FROM ApporteurCorpsEngin a WHERE a.tauxComApporteurCorpsEngin = :tauxComApporteurCorpsEngin"),
    @NamedQuery(name = "ApporteurCorpsEngin.findByMontantComApporteurComEngin", query = "SELECT a FROM ApporteurCorpsEngin a WHERE a.montantComApporteurComEngin = :montantComApporteurComEngin")})
public class ApporteurCorpsEngin implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurCorpsEnginPK apporteurCorpsEnginPK;
    @Column(name = "DATE_APPORTEUR_CORPS_ENGIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurCorpsEngin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_CORPS_ENGIN")
    private BigDecimal tauxComApporteurCorpsEngin;
    @Column(name = "MONTANT_COM_APPORTEUR_COM_ENGIN")
    private BigDecimal montantComApporteurComEngin;
    @JoinColumn(name = "CODE_ENGIN", referencedColumnName = "CODE_ENGIN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CorpsEngin corpsEngin;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurCorpsEngin() {
    }

    public ApporteurCorpsEngin(ApporteurCorpsEnginPK apporteurCorpsEnginPK) {
        this.apporteurCorpsEnginPK = apporteurCorpsEnginPK;
    }

    public ApporteurCorpsEngin(String codeApporteur, String codeEngin) {
        this.apporteurCorpsEnginPK = new ApporteurCorpsEnginPK(codeApporteur, codeEngin);
    }

    public ApporteurCorpsEnginPK getApporteurCorpsEnginPK() {
        return apporteurCorpsEnginPK;
    }

    public void setApporteurCorpsEnginPK(ApporteurCorpsEnginPK apporteurCorpsEnginPK) {
        this.apporteurCorpsEnginPK = apporteurCorpsEnginPK;
    }

    public Date getDateApporteurCorpsEngin() {
        return dateApporteurCorpsEngin;
    }

    public void setDateApporteurCorpsEngin(Date dateApporteurCorpsEngin) {
        this.dateApporteurCorpsEngin = dateApporteurCorpsEngin;
    }

    public BigDecimal getTauxComApporteurCorpsEngin() {
        return tauxComApporteurCorpsEngin;
    }

    public void setTauxComApporteurCorpsEngin(BigDecimal tauxComApporteurCorpsEngin) {
        this.tauxComApporteurCorpsEngin = tauxComApporteurCorpsEngin;
    }

    public BigDecimal getMontantComApporteurComEngin() {
        return montantComApporteurComEngin;
    }

    public void setMontantComApporteurComEngin(BigDecimal montantComApporteurComEngin) {
        this.montantComApporteurComEngin = montantComApporteurComEngin;
    }

    public CorpsEngin getCorpsEngin() {
        return corpsEngin;
    }

    public void setCorpsEngin(CorpsEngin corpsEngin) {
        this.corpsEngin = corpsEngin;
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
        hash += (apporteurCorpsEnginPK != null ? apporteurCorpsEnginPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurCorpsEngin)) {
            return false;
        }
        ApporteurCorpsEngin other = (ApporteurCorpsEngin) object;
        if ((this.apporteurCorpsEnginPK == null && other.apporteurCorpsEnginPK != null) || (this.apporteurCorpsEnginPK != null && !this.apporteurCorpsEnginPK.equals(other.apporteurCorpsEnginPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurCorpsEngin[ apporteurCorpsEnginPK=" + apporteurCorpsEnginPK + " ]";
    }
    
}
