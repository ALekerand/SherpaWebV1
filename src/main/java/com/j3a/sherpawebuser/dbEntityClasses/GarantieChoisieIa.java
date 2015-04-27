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
@Table(name = "garantie_choisie_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieIa.findAll", query = "SELECT g FROM GarantieChoisieIa g"),
    @NamedQuery(name = "GarantieChoisieIa.findByCodeGrtieChoisieIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.codeGrtieChoisieIa = :codeGrtieChoisieIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByLibelleGarantieChoisieIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.libelleGarantieChoisieIa = :libelleGarantieChoisieIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByDateGarantieChoisieIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.dateGarantieChoisieIa = :dateGarantieChoisieIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByPrimeNetteIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.primeNetteIa = :primeNetteIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByComgesIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.comgesIa = :comgesIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByCominterIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.cominterIa = :cominterIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByComconsIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.comconsIa = :comconsIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByTaxeIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.taxeIa = :taxeIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByReductionIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.reductionIa = :reductionIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByComaperIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.comaperIa = :comaperIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByComcoassIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.comcoassIa = :comcoassIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByAccessoireIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.accessoireIa = :accessoireIa"),
    @NamedQuery(name = "GarantieChoisieIa.findByCodeAvenantIa", query = "SELECT g FROM GarantieChoisieIa g WHERE g.codeAvenantIa = :codeAvenantIa")})
public class GarantieChoisieIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE_GRTIE_CHOISIE_IA")
    private String codeGrtieChoisieIa;
    @Size(max = 50)
    @Column(name = "LIBELLE_GARANTIE_CHOISIE_IA")
    private String libelleGarantieChoisieIa;
    @Column(name = "DATE_GARANTIE_CHOISIE_IA")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisieIa;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTE_IA")
    private BigDecimal primeNetteIa;
    @Column(name = "COMGES_IA")
    private BigDecimal comgesIa;
    @Column(name = "COMINTER_IA")
    private BigDecimal cominterIa;
    @Column(name = "COMCONS_IA")
    private BigDecimal comconsIa;
    @Column(name = "TAXE_IA")
    private BigDecimal taxeIa;
    @Column(name = "REDUCTION_IA")
    private BigDecimal reductionIa;
    @Column(name = "COMAPER_IA")
    private BigDecimal comaperIa;
    @Column(name = "COMCOASS_IA")
    private BigDecimal comcoassIa;
    @Column(name = "ACCESSOIRE_IA")
    private BigDecimal accessoireIa;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_IA")
    private String codeAvenantIa;
    @JoinColumn(name = "NUM_IDENTIFICATION", referencedColumnName = "NUM_IDENTIFICATION")
    @ManyToOne
    private AssureIa numIdentification;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieIa")
    private List<GarantieGarantieChoisieIa> garantieGarantieChoisieIaList;

    public GarantieChoisieIa() {
    }

    public GarantieChoisieIa(String codeGrtieChoisieIa) {
        this.codeGrtieChoisieIa = codeGrtieChoisieIa;
    }

    public String getCodeGrtieChoisieIa() {
        return codeGrtieChoisieIa;
    }

    public void setCodeGrtieChoisieIa(String codeGrtieChoisieIa) {
        this.codeGrtieChoisieIa = codeGrtieChoisieIa;
    }

    public String getLibelleGarantieChoisieIa() {
        return libelleGarantieChoisieIa;
    }

    public void setLibelleGarantieChoisieIa(String libelleGarantieChoisieIa) {
        this.libelleGarantieChoisieIa = libelleGarantieChoisieIa;
    }

    public Date getDateGarantieChoisieIa() {
        return dateGarantieChoisieIa;
    }

    public void setDateGarantieChoisieIa(Date dateGarantieChoisieIa) {
        this.dateGarantieChoisieIa = dateGarantieChoisieIa;
    }

    public BigDecimal getPrimeNetteIa() {
        return primeNetteIa;
    }

    public void setPrimeNetteIa(BigDecimal primeNetteIa) {
        this.primeNetteIa = primeNetteIa;
    }

    public BigDecimal getComgesIa() {
        return comgesIa;
    }

    public void setComgesIa(BigDecimal comgesIa) {
        this.comgesIa = comgesIa;
    }

    public BigDecimal getCominterIa() {
        return cominterIa;
    }

    public void setCominterIa(BigDecimal cominterIa) {
        this.cominterIa = cominterIa;
    }

    public BigDecimal getComconsIa() {
        return comconsIa;
    }

    public void setComconsIa(BigDecimal comconsIa) {
        this.comconsIa = comconsIa;
    }

    public BigDecimal getTaxeIa() {
        return taxeIa;
    }

    public void setTaxeIa(BigDecimal taxeIa) {
        this.taxeIa = taxeIa;
    }

    public BigDecimal getReductionIa() {
        return reductionIa;
    }

    public void setReductionIa(BigDecimal reductionIa) {
        this.reductionIa = reductionIa;
    }

    public BigDecimal getComaperIa() {
        return comaperIa;
    }

    public void setComaperIa(BigDecimal comaperIa) {
        this.comaperIa = comaperIa;
    }

    public BigDecimal getComcoassIa() {
        return comcoassIa;
    }

    public void setComcoassIa(BigDecimal comcoassIa) {
        this.comcoassIa = comcoassIa;
    }

    public BigDecimal getAccessoireIa() {
        return accessoireIa;
    }

    public void setAccessoireIa(BigDecimal accessoireIa) {
        this.accessoireIa = accessoireIa;
    }

    public String getCodeAvenantIa() {
        return codeAvenantIa;
    }

    public void setCodeAvenantIa(String codeAvenantIa) {
        this.codeAvenantIa = codeAvenantIa;
    }

    public AssureIa getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(AssureIa numIdentification) {
        this.numIdentification = numIdentification;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieIa> getGarantieGarantieChoisieIaList() {
        return garantieGarantieChoisieIaList;
    }

    public void setGarantieGarantieChoisieIaList(List<GarantieGarantieChoisieIa> garantieGarantieChoisieIaList) {
        this.garantieGarantieChoisieIaList = garantieGarantieChoisieIaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGrtieChoisieIa != null ? codeGrtieChoisieIa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieIa)) {
            return false;
        }
        GarantieChoisieIa other = (GarantieChoisieIa) object;
        if ((this.codeGrtieChoisieIa == null && other.codeGrtieChoisieIa != null) || (this.codeGrtieChoisieIa != null && !this.codeGrtieChoisieIa.equals(other.codeGrtieChoisieIa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieIa[ codeGrtieChoisieIa=" + codeGrtieChoisieIa + " ]";
    }
    
}
