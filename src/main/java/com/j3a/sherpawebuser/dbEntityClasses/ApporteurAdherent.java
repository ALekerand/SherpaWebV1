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
@Table(name = "apporteur_adherent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurAdherent.findAll", query = "SELECT a FROM ApporteurAdherent a"),
    @NamedQuery(name = "ApporteurAdherent.findByCodeApporteur", query = "SELECT a FROM ApporteurAdherent a WHERE a.apporteurAdherentPK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurAdherent.findByCodeAdherent", query = "SELECT a FROM ApporteurAdherent a WHERE a.apporteurAdherentPK.codeAdherent = :codeAdherent"),
    @NamedQuery(name = "ApporteurAdherent.findByDateApporteurAdherent", query = "SELECT a FROM ApporteurAdherent a WHERE a.dateApporteurAdherent = :dateApporteurAdherent"),
    @NamedQuery(name = "ApporteurAdherent.findByTauxComApporteurAdherent", query = "SELECT a FROM ApporteurAdherent a WHERE a.tauxComApporteurAdherent = :tauxComApporteurAdherent"),
    @NamedQuery(name = "ApporteurAdherent.findByMontantComApporteurAdherent", query = "SELECT a FROM ApporteurAdherent a WHERE a.montantComApporteurAdherent = :montantComApporteurAdherent")})
public class ApporteurAdherent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurAdherentPK apporteurAdherentPK;
    @Column(name = "DATE_APPORTEUR_ADHERENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurAdherent;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_ADHERENT")
    private BigDecimal tauxComApporteurAdherent;
    @Column(name = "MONTANT_COM_APPORTEUR_ADHERENT")
    private BigDecimal montantComApporteurAdherent;
    @JoinColumn(name = "CODE_ADHERENT", referencedColumnName = "CODE_ADHERENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AdherentsSante adherentsSante;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurAdherent() {
    }

    public ApporteurAdherent(ApporteurAdherentPK apporteurAdherentPK) {
        this.apporteurAdherentPK = apporteurAdherentPK;
    }

    public ApporteurAdherent(String codeApporteur, String codeAdherent) {
        this.apporteurAdherentPK = new ApporteurAdherentPK(codeApporteur, codeAdherent);
    }

    public ApporteurAdherentPK getApporteurAdherentPK() {
        return apporteurAdherentPK;
    }

    public void setApporteurAdherentPK(ApporteurAdherentPK apporteurAdherentPK) {
        this.apporteurAdherentPK = apporteurAdherentPK;
    }

    public Date getDateApporteurAdherent() {
        return dateApporteurAdherent;
    }

    public void setDateApporteurAdherent(Date dateApporteurAdherent) {
        this.dateApporteurAdherent = dateApporteurAdherent;
    }

    public BigDecimal getTauxComApporteurAdherent() {
        return tauxComApporteurAdherent;
    }

    public void setTauxComApporteurAdherent(BigDecimal tauxComApporteurAdherent) {
        this.tauxComApporteurAdherent = tauxComApporteurAdherent;
    }

    public BigDecimal getMontantComApporteurAdherent() {
        return montantComApporteurAdherent;
    }

    public void setMontantComApporteurAdherent(BigDecimal montantComApporteurAdherent) {
        this.montantComApporteurAdherent = montantComApporteurAdherent;
    }

    public AdherentsSante getAdherentsSante() {
        return adherentsSante;
    }

    public void setAdherentsSante(AdherentsSante adherentsSante) {
        this.adherentsSante = adherentsSante;
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
        hash += (apporteurAdherentPK != null ? apporteurAdherentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurAdherent)) {
            return false;
        }
        ApporteurAdherent other = (ApporteurAdherent) object;
        if ((this.apporteurAdherentPK == null && other.apporteurAdherentPK != null) || (this.apporteurAdherentPK != null && !this.apporteurAdherentPK.equals(other.apporteurAdherentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurAdherent[ apporteurAdherentPK=" + apporteurAdherentPK + " ]";
    }
    
}
