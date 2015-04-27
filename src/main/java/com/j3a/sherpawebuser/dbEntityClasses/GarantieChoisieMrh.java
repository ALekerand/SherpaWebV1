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
@Table(name = "garantie_choisie_mrh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieMrh.findAll", query = "SELECT g FROM GarantieChoisieMrh g"),
    @NamedQuery(name = "GarantieChoisieMrh.findByCodeGarantieChoisiemrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.codeGarantieChoisiemrh = :codeGarantieChoisiemrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByLibelleGarantieChoisiemrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.libelleGarantieChoisiemrh = :libelleGarantieChoisiemrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByDateGarantieChoisiemrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.dateGarantieChoisiemrh = :dateGarantieChoisiemrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByPrimeNettemrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.primeNettemrh = :primeNettemrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByComgesmrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.comgesmrh = :comgesmrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByComintermrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.comintermrh = :comintermrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByComconsmrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.comconsmrh = :comconsmrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByTaxemrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.taxemrh = :taxemrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByReductionmrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.reductionmrh = :reductionmrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByComaperMrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.comaperMrh = :comaperMrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByComcoassmrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.comcoassmrh = :comcoassmrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByAccessoiremrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.accessoiremrh = :accessoiremrh"),
    @NamedQuery(name = "GarantieChoisieMrh.findByCodeAvenantMrh", query = "SELECT g FROM GarantieChoisieMrh g WHERE g.codeAvenantMrh = :codeAvenantMrh")})
public class GarantieChoisieMrh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIEMRH")
    private String codeGarantieChoisiemrh;
    @Size(max = 50)
    @Column(name = "LIBELLE_GARANTIE_CHOISIEMRH")
    private String libelleGarantieChoisiemrh;
    @Column(name = "DATE_GARANTIE_CHOISIEMRH")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisiemrh;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTEMRH")
    private BigDecimal primeNettemrh;
    @Column(name = "COMGESMRH")
    private BigDecimal comgesmrh;
    @Column(name = "COMINTERMRH")
    private BigDecimal comintermrh;
    @Column(name = "COMCONSMRH")
    private BigDecimal comconsmrh;
    @Column(name = "TAXEMRH")
    private BigDecimal taxemrh;
    @Column(name = "REDUCTIONMRH")
    private BigDecimal reductionmrh;
    @Column(name = "COMAPER_MRH")
    private BigDecimal comaperMrh;
    @Column(name = "COMCOASSMRH")
    private BigDecimal comcoassmrh;
    @Column(name = "ACCESSOIREMRH")
    private BigDecimal accessoiremrh;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_MRH")
    private String codeAvenantMrh;
    @JoinColumn(name = "CODE_HABITATION", referencedColumnName = "CODE_HABITATION")
    @ManyToOne
    private Habitation codeHabitation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieMrh")
    private List<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhList;

    public GarantieChoisieMrh() {
    }

    public GarantieChoisieMrh(String codeGarantieChoisiemrh) {
        this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
    }

    public String getCodeGarantieChoisiemrh() {
        return codeGarantieChoisiemrh;
    }

    public void setCodeGarantieChoisiemrh(String codeGarantieChoisiemrh) {
        this.codeGarantieChoisiemrh = codeGarantieChoisiemrh;
    }

    public String getLibelleGarantieChoisiemrh() {
        return libelleGarantieChoisiemrh;
    }

    public void setLibelleGarantieChoisiemrh(String libelleGarantieChoisiemrh) {
        this.libelleGarantieChoisiemrh = libelleGarantieChoisiemrh;
    }

    public Date getDateGarantieChoisiemrh() {
        return dateGarantieChoisiemrh;
    }

    public void setDateGarantieChoisiemrh(Date dateGarantieChoisiemrh) {
        this.dateGarantieChoisiemrh = dateGarantieChoisiemrh;
    }

    public BigDecimal getPrimeNettemrh() {
        return primeNettemrh;
    }

    public void setPrimeNettemrh(BigDecimal primeNettemrh) {
        this.primeNettemrh = primeNettemrh;
    }

    public BigDecimal getComgesmrh() {
        return comgesmrh;
    }

    public void setComgesmrh(BigDecimal comgesmrh) {
        this.comgesmrh = comgesmrh;
    }

    public BigDecimal getComintermrh() {
        return comintermrh;
    }

    public void setComintermrh(BigDecimal comintermrh) {
        this.comintermrh = comintermrh;
    }

    public BigDecimal getComconsmrh() {
        return comconsmrh;
    }

    public void setComconsmrh(BigDecimal comconsmrh) {
        this.comconsmrh = comconsmrh;
    }

    public BigDecimal getTaxemrh() {
        return taxemrh;
    }

    public void setTaxemrh(BigDecimal taxemrh) {
        this.taxemrh = taxemrh;
    }

    public BigDecimal getReductionmrh() {
        return reductionmrh;
    }

    public void setReductionmrh(BigDecimal reductionmrh) {
        this.reductionmrh = reductionmrh;
    }

    public BigDecimal getComaperMrh() {
        return comaperMrh;
    }

    public void setComaperMrh(BigDecimal comaperMrh) {
        this.comaperMrh = comaperMrh;
    }

    public BigDecimal getComcoassmrh() {
        return comcoassmrh;
    }

    public void setComcoassmrh(BigDecimal comcoassmrh) {
        this.comcoassmrh = comcoassmrh;
    }

    public BigDecimal getAccessoiremrh() {
        return accessoiremrh;
    }

    public void setAccessoiremrh(BigDecimal accessoiremrh) {
        this.accessoiremrh = accessoiremrh;
    }

    public String getCodeAvenantMrh() {
        return codeAvenantMrh;
    }

    public void setCodeAvenantMrh(String codeAvenantMrh) {
        this.codeAvenantMrh = codeAvenantMrh;
    }

    public Habitation getCodeHabitation() {
        return codeHabitation;
    }

    public void setCodeHabitation(Habitation codeHabitation) {
        this.codeHabitation = codeHabitation;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieMrh> getGarantieGarantieChoisieMrhList() {
        return garantieGarantieChoisieMrhList;
    }

    public void setGarantieGarantieChoisieMrhList(List<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhList) {
        this.garantieGarantieChoisieMrhList = garantieGarantieChoisieMrhList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisiemrh != null ? codeGarantieChoisiemrh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieMrh)) {
            return false;
        }
        GarantieChoisieMrh other = (GarantieChoisieMrh) object;
        if ((this.codeGarantieChoisiemrh == null && other.codeGarantieChoisiemrh != null) || (this.codeGarantieChoisiemrh != null && !this.codeGarantieChoisiemrh.equals(other.codeGarantieChoisiemrh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieMrh[ codeGarantieChoisiemrh=" + codeGarantieChoisiemrh + " ]";
    }
    
}
