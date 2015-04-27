/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "recours")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Recours.findAll", query = "SELECT r FROM Recours r"),
    @NamedQuery(name = "Recours.findByReferenceTiers", query = "SELECT r FROM Recours r WHERE r.referenceTiers = :referenceTiers"),
    @NamedQuery(name = "Recours.findByRaisonSocial", query = "SELECT r FROM Recours r WHERE r.raisonSocial = :raisonSocial"),
    @NamedQuery(name = "Recours.findByMontant", query = "SELECT r FROM Recours r WHERE r.montant = :montant"),
    @NamedQuery(name = "Recours.findByEtat", query = "SELECT r FROM Recours r WHERE r.etat = :etat")})
public class Recours implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "REFERENCE_TIERS")
    private String referenceTiers;
    @Size(max = 50)
    @Column(name = "RAISON_SOCIAL")
    private String raisonSocial;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Size(max = 50)
    @Column(name = "ETAT")
    private String etat;
    @OneToMany(mappedBy = "referenceTiers")
    private List<Victime> victimeList;

    public Recours() {
    }

    public Recours(String referenceTiers) {
        this.referenceTiers = referenceTiers;
    }

    public String getReferenceTiers() {
        return referenceTiers;
    }

    public void setReferenceTiers(String referenceTiers) {
        this.referenceTiers = referenceTiers;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public void setRaisonSocial(String raisonSocial) {
        this.raisonSocial = raisonSocial;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @XmlTransient
    public List<Victime> getVictimeList() {
        return victimeList;
    }

    public void setVictimeList(List<Victime> victimeList) {
        this.victimeList = victimeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceTiers != null ? referenceTiers.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Recours)) {
            return false;
        }
        Recours other = (Recours) object;
        if ((this.referenceTiers == null && other.referenceTiers != null) || (this.referenceTiers != null && !this.referenceTiers.equals(other.referenceTiers))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Recours[ referenceTiers=" + referenceTiers + " ]";
    }
    
}
