/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "intervention")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Intervention.findAll", query = "SELECT i FROM Intervention i"),
    @NamedQuery(name = "Intervention.findByRefIntervention", query = "SELECT i FROM Intervention i WHERE i.refIntervention = :refIntervention"),
    @NamedQuery(name = "Intervention.findByLibelleIntervention", query = "SELECT i FROM Intervention i WHERE i.libelleIntervention = :libelleIntervention"),
    @NamedQuery(name = "Intervention.findByDateIntervention", query = "SELECT i FROM Intervention i WHERE i.dateIntervention = :dateIntervention"),
    @NamedQuery(name = "Intervention.findByRapport", query = "SELECT i FROM Intervention i WHERE i.rapport = :rapport"),
    @NamedQuery(name = "Intervention.findByTypeRapport", query = "SELECT i FROM Intervention i WHERE i.typeRapport = :typeRapport"),
    @NamedQuery(name = "Intervention.findByChargesIntervention", query = "SELECT i FROM Intervention i WHERE i.chargesIntervention = :chargesIntervention"),
    @NamedQuery(name = "Intervention.findByTaxe", query = "SELECT i FROM Intervention i WHERE i.taxe = :taxe"),
    @NamedQuery(name = "Intervention.findByFraisAnnexe", query = "SELECT i FROM Intervention i WHERE i.fraisAnnexe = :fraisAnnexe"),
    @NamedQuery(name = "Intervention.findByMontantTtc", query = "SELECT i FROM Intervention i WHERE i.montantTtc = :montantTtc"),
    @NamedQuery(name = "Intervention.findByEtat", query = "SELECT i FROM Intervention i WHERE i.etat = :etat"),
    @NamedQuery(name = "Intervention.findBySousGarantieSupportInt", query = "SELECT i FROM Intervention i WHERE i.sousGarantieSupportInt = :sousGarantieSupportInt")})
public class Intervention implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "REF_INTERVENTION")
    private String refIntervention;
    @Size(max = 100)
    @Column(name = "LIBELLE_INTERVENTION")
    private String libelleIntervention;
    @Column(name = "DATE_INTERVENTION")
    @Temporal(TemporalType.DATE)
    private Date dateIntervention;
    @Size(max = 150)
    @Column(name = "RAPPORT")
    private String rapport;
    @Size(max = 150)
    @Column(name = "TYPE_RAPPORT")
    private String typeRapport;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CHARGES_INTERVENTION")
    private BigDecimal chargesIntervention;
    @Column(name = "TAXE")
    private BigDecimal taxe;
    @Column(name = "FRAIS_ANNEXE")
    private BigDecimal fraisAnnexe;
    @Column(name = "MONTANT_TTC")
    private BigDecimal montantTtc;
    @Size(max = 50)
    @Column(name = "ETAT")
    private String etat;
    @Size(max = 100)
    @Column(name = "SOUS_GARANTIE_SUPPORT_INT")
    private String sousGarantieSupportInt;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE")
    @ManyToOne
    private Sinistre codeSinistre;
    @JoinColumn(name = "CODE_INTERVENANT", referencedColumnName = "CODE_INTERVENANT")
    @ManyToOne(optional = false)
    private Intervenant codeIntervenant;
    @OneToMany(mappedBy = "refIntervention")
    private List<ReglementSinistre> reglementSinistreList;

    public Intervention() {
    }

    public Intervention(String refIntervention) {
        this.refIntervention = refIntervention;
    }

    public String getRefIntervention() {
        return refIntervention;
    }

    public void setRefIntervention(String refIntervention) {
        this.refIntervention = refIntervention;
    }

    public String getLibelleIntervention() {
        return libelleIntervention;
    }

    public void setLibelleIntervention(String libelleIntervention) {
        this.libelleIntervention = libelleIntervention;
    }

    public Date getDateIntervention() {
        return dateIntervention;
    }

    public void setDateIntervention(Date dateIntervention) {
        this.dateIntervention = dateIntervention;
    }

    public String getRapport() {
        return rapport;
    }

    public void setRapport(String rapport) {
        this.rapport = rapport;
    }

    public String getTypeRapport() {
        return typeRapport;
    }

    public void setTypeRapport(String typeRapport) {
        this.typeRapport = typeRapport;
    }

    public BigDecimal getChargesIntervention() {
        return chargesIntervention;
    }

    public void setChargesIntervention(BigDecimal chargesIntervention) {
        this.chargesIntervention = chargesIntervention;
    }

    public BigDecimal getTaxe() {
        return taxe;
    }

    public void setTaxe(BigDecimal taxe) {
        this.taxe = taxe;
    }

    public BigDecimal getFraisAnnexe() {
        return fraisAnnexe;
    }

    public void setFraisAnnexe(BigDecimal fraisAnnexe) {
        this.fraisAnnexe = fraisAnnexe;
    }

    public BigDecimal getMontantTtc() {
        return montantTtc;
    }

    public void setMontantTtc(BigDecimal montantTtc) {
        this.montantTtc = montantTtc;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public String getSousGarantieSupportInt() {
        return sousGarantieSupportInt;
    }

    public void setSousGarantieSupportInt(String sousGarantieSupportInt) {
        this.sousGarantieSupportInt = sousGarantieSupportInt;
    }

    public Sinistre getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(Sinistre codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public Intervenant getCodeIntervenant() {
        return codeIntervenant;
    }

    public void setCodeIntervenant(Intervenant codeIntervenant) {
        this.codeIntervenant = codeIntervenant;
    }

    @XmlTransient
    public List<ReglementSinistre> getReglementSinistreList() {
        return reglementSinistreList;
    }

    public void setReglementSinistreList(List<ReglementSinistre> reglementSinistreList) {
        this.reglementSinistreList = reglementSinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refIntervention != null ? refIntervention.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervention)) {
            return false;
        }
        Intervention other = (Intervention) object;
        if ((this.refIntervention == null && other.refIntervention != null) || (this.refIntervention != null && !this.refIntervention.equals(other.refIntervention))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Intervention[ refIntervention=" + refIntervention + " ]";
    }
    
}
