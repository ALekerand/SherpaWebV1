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
@Table(name = "garantie_choisie_nta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieNta.findAll", query = "SELECT g FROM GarantieChoisieNta g"),
    @NamedQuery(name = "GarantieChoisieNta.findByCodeGarantieChoisienta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.codeGarantieChoisienta = :codeGarantieChoisienta"),
    @NamedQuery(name = "GarantieChoisieNta.findByLibelleGarantieChoisienta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.libelleGarantieChoisienta = :libelleGarantieChoisienta"),
    @NamedQuery(name = "GarantieChoisieNta.findByDateGarantieChoisienta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.dateGarantieChoisienta = :dateGarantieChoisienta"),
    @NamedQuery(name = "GarantieChoisieNta.findByPrimeNettenta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.primeNettenta = :primeNettenta"),
    @NamedQuery(name = "GarantieChoisieNta.findByComgesnta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.comgesnta = :comgesnta"),
    @NamedQuery(name = "GarantieChoisieNta.findByCominternta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.cominternta = :cominternta"),
    @NamedQuery(name = "GarantieChoisieNta.findByComconsnta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.comconsnta = :comconsnta"),
    @NamedQuery(name = "GarantieChoisieNta.findByTaxenta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.taxenta = :taxenta"),
    @NamedQuery(name = "GarantieChoisieNta.findByReductionnta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.reductionnta = :reductionnta"),
    @NamedQuery(name = "GarantieChoisieNta.findByComaperNta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.comaperNta = :comaperNta"),
    @NamedQuery(name = "GarantieChoisieNta.findByComcoassnta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.comcoassnta = :comcoassnta"),
    @NamedQuery(name = "GarantieChoisieNta.findByAccessoirenta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.accessoirenta = :accessoirenta"),
    @NamedQuery(name = "GarantieChoisieNta.findByCodeAvenantNta", query = "SELECT g FROM GarantieChoisieNta g WHERE g.codeAvenantNta = :codeAvenantNta")})
public class GarantieChoisieNta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIENTA")
    private String codeGarantieChoisienta;
    @Size(max = 50)
    @Column(name = "LIBELLE_GARANTIE_CHOISIENTA")
    private String libelleGarantieChoisienta;
    @Column(name = "DATE_GARANTIE_CHOISIENTA")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisienta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTENTA")
    private BigDecimal primeNettenta;
    @Column(name = "COMGESNTA")
    private BigDecimal comgesnta;
    @Column(name = "COMINTERNTA")
    private BigDecimal cominternta;
    @Column(name = "COMCONSNTA")
    private BigDecimal comconsnta;
    @Column(name = "TAXENTA")
    private BigDecimal taxenta;
    @Column(name = "REDUCTIONNTA")
    private BigDecimal reductionnta;
    @Column(name = "COMAPER_NTA")
    private BigDecimal comaperNta;
    @Column(name = "COMCOASSNTA")
    private BigDecimal comcoassnta;
    @Column(name = "ACCESSOIRENTA")
    private BigDecimal accessoirenta;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_NTA")
    private String codeAvenantNta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieNta")
    private List<GarantieGarantieChoisieNta> garantieGarantieChoisieNtaList;
    @JoinColumn(name = "CODE_RISQUENTA", referencedColumnName = "CODE_RISQUENTA")
    @ManyToOne
    private RisqueNta codeRisquenta;

    public GarantieChoisieNta() {
    }

    public GarantieChoisieNta(String codeGarantieChoisienta) {
        this.codeGarantieChoisienta = codeGarantieChoisienta;
    }

    public String getCodeGarantieChoisienta() {
        return codeGarantieChoisienta;
    }

    public void setCodeGarantieChoisienta(String codeGarantieChoisienta) {
        this.codeGarantieChoisienta = codeGarantieChoisienta;
    }

    public String getLibelleGarantieChoisienta() {
        return libelleGarantieChoisienta;
    }

    public void setLibelleGarantieChoisienta(String libelleGarantieChoisienta) {
        this.libelleGarantieChoisienta = libelleGarantieChoisienta;
    }

    public Date getDateGarantieChoisienta() {
        return dateGarantieChoisienta;
    }

    public void setDateGarantieChoisienta(Date dateGarantieChoisienta) {
        this.dateGarantieChoisienta = dateGarantieChoisienta;
    }

    public BigDecimal getPrimeNettenta() {
        return primeNettenta;
    }

    public void setPrimeNettenta(BigDecimal primeNettenta) {
        this.primeNettenta = primeNettenta;
    }

    public BigDecimal getComgesnta() {
        return comgesnta;
    }

    public void setComgesnta(BigDecimal comgesnta) {
        this.comgesnta = comgesnta;
    }

    public BigDecimal getCominternta() {
        return cominternta;
    }

    public void setCominternta(BigDecimal cominternta) {
        this.cominternta = cominternta;
    }

    public BigDecimal getComconsnta() {
        return comconsnta;
    }

    public void setComconsnta(BigDecimal comconsnta) {
        this.comconsnta = comconsnta;
    }

    public BigDecimal getTaxenta() {
        return taxenta;
    }

    public void setTaxenta(BigDecimal taxenta) {
        this.taxenta = taxenta;
    }

    public BigDecimal getReductionnta() {
        return reductionnta;
    }

    public void setReductionnta(BigDecimal reductionnta) {
        this.reductionnta = reductionnta;
    }

    public BigDecimal getComaperNta() {
        return comaperNta;
    }

    public void setComaperNta(BigDecimal comaperNta) {
        this.comaperNta = comaperNta;
    }

    public BigDecimal getComcoassnta() {
        return comcoassnta;
    }

    public void setComcoassnta(BigDecimal comcoassnta) {
        this.comcoassnta = comcoassnta;
    }

    public BigDecimal getAccessoirenta() {
        return accessoirenta;
    }

    public void setAccessoirenta(BigDecimal accessoirenta) {
        this.accessoirenta = accessoirenta;
    }

    public String getCodeAvenantNta() {
        return codeAvenantNta;
    }

    public void setCodeAvenantNta(String codeAvenantNta) {
        this.codeAvenantNta = codeAvenantNta;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieNta> getGarantieGarantieChoisieNtaList() {
        return garantieGarantieChoisieNtaList;
    }

    public void setGarantieGarantieChoisieNtaList(List<GarantieGarantieChoisieNta> garantieGarantieChoisieNtaList) {
        this.garantieGarantieChoisieNtaList = garantieGarantieChoisieNtaList;
    }

    public RisqueNta getCodeRisquenta() {
        return codeRisquenta;
    }

    public void setCodeRisquenta(RisqueNta codeRisquenta) {
        this.codeRisquenta = codeRisquenta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisienta != null ? codeGarantieChoisienta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieNta)) {
            return false;
        }
        GarantieChoisieNta other = (GarantieChoisieNta) object;
        if ((this.codeGarantieChoisienta == null && other.codeGarantieChoisienta != null) || (this.codeGarantieChoisienta != null && !this.codeGarantieChoisienta.equals(other.codeGarantieChoisienta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieNta[ codeGarantieChoisienta=" + codeGarantieChoisienta + " ]";
    }
    
}
