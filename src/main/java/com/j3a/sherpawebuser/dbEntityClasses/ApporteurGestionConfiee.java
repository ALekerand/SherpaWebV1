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
@Table(name = "apporteur_gestion_confiee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurGestionConfiee.findAll", query = "SELECT a FROM ApporteurGestionConfiee a"),
    @NamedQuery(name = "ApporteurGestionConfiee.findByCodeApporteur", query = "SELECT a FROM ApporteurGestionConfiee a WHERE a.apporteurGestionConfieePK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurGestionConfiee.findByCodeGestionConfie", query = "SELECT a FROM ApporteurGestionConfiee a WHERE a.apporteurGestionConfieePK.codeGestionConfie = :codeGestionConfie"),
    @NamedQuery(name = "ApporteurGestionConfiee.findByDateApporteurGc", query = "SELECT a FROM ApporteurGestionConfiee a WHERE a.dateApporteurGc = :dateApporteurGc"),
    @NamedQuery(name = "ApporteurGestionConfiee.findByTauxComApporteurGc", query = "SELECT a FROM ApporteurGestionConfiee a WHERE a.tauxComApporteurGc = :tauxComApporteurGc"),
    @NamedQuery(name = "ApporteurGestionConfiee.findByMontantComApporteurGc", query = "SELECT a FROM ApporteurGestionConfiee a WHERE a.montantComApporteurGc = :montantComApporteurGc")})
public class ApporteurGestionConfiee implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurGestionConfieePK apporteurGestionConfieePK;
    @Column(name = "DATE_APPORTEUR_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurGc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_GC")
    private BigDecimal tauxComApporteurGc;
    @Column(name = "MONTANT_COM_APPORTEUR_GC")
    private BigDecimal montantComApporteurGc;
    @JoinColumn(name = "CODE_GESTION_CONFIE", referencedColumnName = "CODE_GESTION_CONFIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GestionConfiee gestionConfiee;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurGestionConfiee() {
    }

    public ApporteurGestionConfiee(ApporteurGestionConfieePK apporteurGestionConfieePK) {
        this.apporteurGestionConfieePK = apporteurGestionConfieePK;
    }

    public ApporteurGestionConfiee(String codeApporteur, String codeGestionConfie) {
        this.apporteurGestionConfieePK = new ApporteurGestionConfieePK(codeApporteur, codeGestionConfie);
    }

    public ApporteurGestionConfieePK getApporteurGestionConfieePK() {
        return apporteurGestionConfieePK;
    }

    public void setApporteurGestionConfieePK(ApporteurGestionConfieePK apporteurGestionConfieePK) {
        this.apporteurGestionConfieePK = apporteurGestionConfieePK;
    }

    public Date getDateApporteurGc() {
        return dateApporteurGc;
    }

    public void setDateApporteurGc(Date dateApporteurGc) {
        this.dateApporteurGc = dateApporteurGc;
    }

    public BigDecimal getTauxComApporteurGc() {
        return tauxComApporteurGc;
    }

    public void setTauxComApporteurGc(BigDecimal tauxComApporteurGc) {
        this.tauxComApporteurGc = tauxComApporteurGc;
    }

    public BigDecimal getMontantComApporteurGc() {
        return montantComApporteurGc;
    }

    public void setMontantComApporteurGc(BigDecimal montantComApporteurGc) {
        this.montantComApporteurGc = montantComApporteurGc;
    }

    public GestionConfiee getGestionConfiee() {
        return gestionConfiee;
    }

    public void setGestionConfiee(GestionConfiee gestionConfiee) {
        this.gestionConfiee = gestionConfiee;
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
        hash += (apporteurGestionConfieePK != null ? apporteurGestionConfieePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurGestionConfiee)) {
            return false;
        }
        ApporteurGestionConfiee other = (ApporteurGestionConfiee) object;
        if ((this.apporteurGestionConfieePK == null && other.apporteurGestionConfieePK != null) || (this.apporteurGestionConfieePK != null && !this.apporteurGestionConfieePK.equals(other.apporteurGestionConfieePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurGestionConfiee[ apporteurGestionConfieePK=" + apporteurGestionConfieePK + " ]";
    }
    
}
