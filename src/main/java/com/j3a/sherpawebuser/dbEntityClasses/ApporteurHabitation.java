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
@Table(name = "apporteur_habitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ApporteurHabitation.findAll", query = "SELECT a FROM ApporteurHabitation a"),
    @NamedQuery(name = "ApporteurHabitation.findByCodeApporteur", query = "SELECT a FROM ApporteurHabitation a WHERE a.apporteurHabitationPK.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "ApporteurHabitation.findByCodeHabitation", query = "SELECT a FROM ApporteurHabitation a WHERE a.apporteurHabitationPK.codeHabitation = :codeHabitation"),
    @NamedQuery(name = "ApporteurHabitation.findByDateApporteurHabitation", query = "SELECT a FROM ApporteurHabitation a WHERE a.dateApporteurHabitation = :dateApporteurHabitation"),
    @NamedQuery(name = "ApporteurHabitation.findByTauxComApporteurHabitation", query = "SELECT a FROM ApporteurHabitation a WHERE a.tauxComApporteurHabitation = :tauxComApporteurHabitation"),
    @NamedQuery(name = "ApporteurHabitation.findByMontantComApporteurHabitation", query = "SELECT a FROM ApporteurHabitation a WHERE a.montantComApporteurHabitation = :montantComApporteurHabitation")})
public class ApporteurHabitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ApporteurHabitationPK apporteurHabitationPK;
    @Column(name = "DATE_APPORTEUR_HABITATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurHabitation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_HABITATION")
    private BigDecimal tauxComApporteurHabitation;
    @Column(name = "MONTANT_COM_APPORTEUR_HABITATION")
    private BigDecimal montantComApporteurHabitation;
    @JoinColumn(name = "CODE_HABITATION", referencedColumnName = "CODE_HABITATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Habitation habitation;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Apporteur apporteur;

    public ApporteurHabitation() {
    }

    public ApporteurHabitation(ApporteurHabitationPK apporteurHabitationPK) {
        this.apporteurHabitationPK = apporteurHabitationPK;
    }

    public ApporteurHabitation(String codeApporteur, String codeHabitation) {
        this.apporteurHabitationPK = new ApporteurHabitationPK(codeApporteur, codeHabitation);
    }

    public ApporteurHabitationPK getApporteurHabitationPK() {
        return apporteurHabitationPK;
    }

    public void setApporteurHabitationPK(ApporteurHabitationPK apporteurHabitationPK) {
        this.apporteurHabitationPK = apporteurHabitationPK;
    }

    public Date getDateApporteurHabitation() {
        return dateApporteurHabitation;
    }

    public void setDateApporteurHabitation(Date dateApporteurHabitation) {
        this.dateApporteurHabitation = dateApporteurHabitation;
    }

    public BigDecimal getTauxComApporteurHabitation() {
        return tauxComApporteurHabitation;
    }

    public void setTauxComApporteurHabitation(BigDecimal tauxComApporteurHabitation) {
        this.tauxComApporteurHabitation = tauxComApporteurHabitation;
    }

    public BigDecimal getMontantComApporteurHabitation() {
        return montantComApporteurHabitation;
    }

    public void setMontantComApporteurHabitation(BigDecimal montantComApporteurHabitation) {
        this.montantComApporteurHabitation = montantComApporteurHabitation;
    }

    public Habitation getHabitation() {
        return habitation;
    }

    public void setHabitation(Habitation habitation) {
        this.habitation = habitation;
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
        hash += (apporteurHabitationPK != null ? apporteurHabitationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ApporteurHabitation)) {
            return false;
        }
        ApporteurHabitation other = (ApporteurHabitation) object;
        if ((this.apporteurHabitationPK == null && other.apporteurHabitationPK != null) || (this.apporteurHabitationPK != null && !this.apporteurHabitationPK.equals(other.apporteurHabitationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ApporteurHabitation[ apporteurHabitationPK=" + apporteurHabitationPK + " ]";
    }
    
}
