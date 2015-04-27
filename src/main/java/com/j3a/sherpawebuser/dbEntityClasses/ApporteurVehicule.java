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
@Table(name = "apporteur_vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurVehicule.findAll", query = "SELECT a FROM ApporteurVehicule a"),
    @NamedQuery(name = "ApporteurVehicule.findByCodeApporteur", query = "SELECT a FROM ApporteurVehicule a WHERE a.apporteurVehiculePK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurVehicule.findByCodeVehicule", query = "SELECT a FROM ApporteurVehicule a WHERE a.apporteurVehiculePK.codeVehicule = :codeVehicule"),
    @NamedQuery(name = "ApporteurVehicule.findByDateApporteurVehicule", query = "SELECT a FROM ApporteurVehicule a WHERE a.dateApporteurVehicule = :dateApporteurVehicule"),
    @NamedQuery(name = "ApporteurVehicule.findByTauxComApporteur", query = "SELECT a FROM ApporteurVehicule a WHERE a.tauxComApporteur = :tauxComApporteur"),
    @NamedQuery(name = "ApporteurVehicule.findByMontantComApporteur", query = "SELECT a FROM ApporteurVehicule a WHERE a.montantComApporteur = :montantComApporteur")})
public class ApporteurVehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurVehiculePK apporteurVehiculePK;
    @Column(name = "DATE_APPORTEUR_VEHICULE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurVehicule;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR")
    private BigDecimal tauxComApporteur;
    @Column(name = "MONTANT_COM_APPORTEUR")
    private BigDecimal montantComApporteur;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehicule vehicule;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurVehicule() {
    }

    public ApporteurVehicule(ApporteurVehiculePK apporteurVehiculePK) {
        this.apporteurVehiculePK = apporteurVehiculePK;
    }

    public ApporteurVehicule(String codeApporteur, String codeVehicule) {
        this.apporteurVehiculePK = new ApporteurVehiculePK(codeApporteur, codeVehicule);
    }

    public ApporteurVehiculePK getApporteurVehiculePK() {
        return apporteurVehiculePK;
    }

    public void setApporteurVehiculePK(ApporteurVehiculePK apporteurVehiculePK) {
        this.apporteurVehiculePK = apporteurVehiculePK;
    }

    public Date getDateApporteurVehicule() {
        return dateApporteurVehicule;
    }

    public void setDateApporteurVehicule(Date dateApporteurVehicule) {
        this.dateApporteurVehicule = dateApporteurVehicule;
    }

    public BigDecimal getTauxComApporteur() {
        return tauxComApporteur;
    }

    public void setTauxComApporteur(BigDecimal tauxComApporteur) {
        this.tauxComApporteur = tauxComApporteur;
    }

    public BigDecimal getMontantComApporteur() {
        return montantComApporteur;
    }

    public void setMontantComApporteur(BigDecimal montantComApporteur) {
        this.montantComApporteur = montantComApporteur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
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
        hash += (apporteurVehiculePK != null ? apporteurVehiculePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurVehicule)) {
            return false;
        }
        ApporteurVehicule other = (ApporteurVehicule) object;
        if ((this.apporteurVehiculePK == null && other.apporteurVehiculePK != null) || (this.apporteurVehiculePK != null && !this.apporteurVehiculePK.equals(other.apporteurVehiculePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurVehicule[ apporteurVehiculePK=" + apporteurVehiculePK + " ]";
    }
    
}
