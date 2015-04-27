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
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "facture")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Facture.findAll", query = "SELECT f FROM Facture f"),
    @NamedQuery(name = "Facture.findByCodeFacture", query = "SELECT f FROM Facture f WHERE f.codeFacture = :codeFacture"),
    @NamedQuery(name = "Facture.findByDateEmissionFact", query = "SELECT f FROM Facture f WHERE f.dateEmissionFact = :dateEmissionFact"),
    @NamedQuery(name = "Facture.findByMontantHtFact", query = "SELECT f FROM Facture f WHERE f.montantHtFact = :montantHtFact"),
    @NamedQuery(name = "Facture.findByTvaFact", query = "SELECT f FROM Facture f WHERE f.tvaFact = :tvaFact"),
    @NamedQuery(name = "Facture.findByMontantTtcFact", query = "SELECT f FROM Facture f WHERE f.montantTtcFact = :montantTtcFact"),
    @NamedQuery(name = "Facture.findByObservation", query = "SELECT f FROM Facture f WHERE f.observation = :observation"),
    @NamedQuery(name = "Facture.findByEtatFacture", query = "SELECT f FROM Facture f WHERE f.etatFacture = :etatFacture")})
public class Facture implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_FACTURE")
    private String codeFacture;
    @Column(name = "DATE_EMISSION_FACT")
    @Temporal(TemporalType.DATE)
    private Date dateEmissionFact;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_HT_FACT")
    private BigDecimal montantHtFact;
    @Column(name = "TVA_FACT")
    private BigDecimal tvaFact;
    @Column(name = "MONTANT_TTC_FACT")
    private BigDecimal montantTtcFact;
    @Size(max = 50)
    @Column(name = "OBSERVATION")
    private String observation;
    @Size(max = 50)
    @Column(name = "ETAT_FACTURE")
    private String etatFacture;
    @OneToMany(mappedBy = "codeFacture")
    private List<Expertise> expertiseList;
    @OneToMany(mappedBy = "codeFacture")
    private List<ReglementSinistre> reglementSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeFacture")
    private List<ActeMedical> acteMedicalList;

    public Facture() {
    }

    public Facture(String codeFacture) {
        this.codeFacture = codeFacture;
    }

    public String getCodeFacture() {
        return codeFacture;
    }

    public void setCodeFacture(String codeFacture) {
        this.codeFacture = codeFacture;
    }

    public Date getDateEmissionFact() {
        return dateEmissionFact;
    }

    public void setDateEmissionFact(Date dateEmissionFact) {
        this.dateEmissionFact = dateEmissionFact;
    }

    public BigDecimal getMontantHtFact() {
        return montantHtFact;
    }

    public void setMontantHtFact(BigDecimal montantHtFact) {
        this.montantHtFact = montantHtFact;
    }

    public BigDecimal getTvaFact() {
        return tvaFact;
    }

    public void setTvaFact(BigDecimal tvaFact) {
        this.tvaFact = tvaFact;
    }

    public BigDecimal getMontantTtcFact() {
        return montantTtcFact;
    }

    public void setMontantTtcFact(BigDecimal montantTtcFact) {
        this.montantTtcFact = montantTtcFact;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public String getEtatFacture() {
        return etatFacture;
    }

    public void setEtatFacture(String etatFacture) {
        this.etatFacture = etatFacture;
    }

    @XmlTransient
    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public void setExpertiseList(List<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }

    @XmlTransient
    public List<ReglementSinistre> getReglementSinistreList() {
        return reglementSinistreList;
    }

    public void setReglementSinistreList(List<ReglementSinistre> reglementSinistreList) {
        this.reglementSinistreList = reglementSinistreList;
    }

    @XmlTransient
    public List<ActeMedical> getActeMedicalList() {
        return acteMedicalList;
    }

    public void setActeMedicalList(List<ActeMedical> acteMedicalList) {
        this.acteMedicalList = acteMedicalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeFacture != null ? codeFacture.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Facture)) {
            return false;
        }
        Facture other = (Facture) object;
        if ((this.codeFacture == null && other.codeFacture != null) || (this.codeFacture != null && !this.codeFacture.equals(other.codeFacture))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Facture[ codeFacture=" + codeFacture + " ]";
    }
    
}
