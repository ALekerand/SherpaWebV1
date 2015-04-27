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
@Table(name = "garantie_choisie_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieSante.findAll", query = "SELECT g FROM GarantieChoisieSante g"),
    @NamedQuery(name = "GarantieChoisieSante.findByCodeGarantieChoisiesante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.codeGarantieChoisiesante = :codeGarantieChoisiesante"),
    @NamedQuery(name = "GarantieChoisieSante.findByLibelleGarantieChoisiesante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.libelleGarantieChoisiesante = :libelleGarantieChoisiesante"),
    @NamedQuery(name = "GarantieChoisieSante.findByDateGarantieChoisiesante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.dateGarantieChoisiesante = :dateGarantieChoisiesante"),
    @NamedQuery(name = "GarantieChoisieSante.findByPrimeNettesante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.primeNettesante = :primeNettesante"),
    @NamedQuery(name = "GarantieChoisieSante.findByComgessante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.comgessante = :comgessante"),
    @NamedQuery(name = "GarantieChoisieSante.findByComintersante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.comintersante = :comintersante"),
    @NamedQuery(name = "GarantieChoisieSante.findByComconssante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.comconssante = :comconssante"),
    @NamedQuery(name = "GarantieChoisieSante.findByTaxesante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.taxesante = :taxesante"),
    @NamedQuery(name = "GarantieChoisieSante.findByReductionsante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.reductionsante = :reductionsante"),
    @NamedQuery(name = "GarantieChoisieSante.findByComaperSante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.comaperSante = :comaperSante"),
    @NamedQuery(name = "GarantieChoisieSante.findByComcoasssante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.comcoasssante = :comcoasssante"),
    @NamedQuery(name = "GarantieChoisieSante.findByAccessoiresante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.accessoiresante = :accessoiresante"),
    @NamedQuery(name = "GarantieChoisieSante.findByCodeAvenantSante", query = "SELECT g FROM GarantieChoisieSante g WHERE g.codeAvenantSante = :codeAvenantSante")})
public class GarantieChoisieSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GARANTIE_CHOISIESANTE")
    private String codeGarantieChoisiesante;
    @Size(max = 50)
    @Column(name = "LIBELLE_GARANTIE_CHOISIESANTE")
    private String libelleGarantieChoisiesante;
    @Column(name = "DATE_GARANTIE_CHOISIESANTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGarantieChoisiesante;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_NETTESANTE")
    private BigDecimal primeNettesante;
    @Column(name = "COMGESSANTE")
    private BigDecimal comgessante;
    @Column(name = "COMINTERSANTE")
    private BigDecimal comintersante;
    @Column(name = "COMCONSSANTE")
    private BigDecimal comconssante;
    @Column(name = "TAXESANTE")
    private BigDecimal taxesante;
    @Column(name = "REDUCTIONSANTE")
    private BigDecimal reductionsante;
    @Column(name = "COMAPER_SANTE")
    private BigDecimal comaperSante;
    @Column(name = "COMCOASSSANTE")
    private BigDecimal comcoasssante;
    @Column(name = "ACCESSOIRESANTE")
    private BigDecimal accessoiresante;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_SANTE")
    private String codeAvenantSante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieSante")
    private List<GarantieGarantieChoisieSante> garantieGarantieChoisieSanteList;
    @JoinColumn(name = "CODE_AFFILIE", referencedColumnName = "CODE_AFFILIE")
    @ManyToOne
    private AffilieSante codeAffilie;

    public GarantieChoisieSante() {
    }

    public GarantieChoisieSante(String codeGarantieChoisiesante) {
        this.codeGarantieChoisiesante = codeGarantieChoisiesante;
    }

    public String getCodeGarantieChoisiesante() {
        return codeGarantieChoisiesante;
    }

    public void setCodeGarantieChoisiesante(String codeGarantieChoisiesante) {
        this.codeGarantieChoisiesante = codeGarantieChoisiesante;
    }

    public String getLibelleGarantieChoisiesante() {
        return libelleGarantieChoisiesante;
    }

    public void setLibelleGarantieChoisiesante(String libelleGarantieChoisiesante) {
        this.libelleGarantieChoisiesante = libelleGarantieChoisiesante;
    }

    public Date getDateGarantieChoisiesante() {
        return dateGarantieChoisiesante;
    }

    public void setDateGarantieChoisiesante(Date dateGarantieChoisiesante) {
        this.dateGarantieChoisiesante = dateGarantieChoisiesante;
    }

    public BigDecimal getPrimeNettesante() {
        return primeNettesante;
    }

    public void setPrimeNettesante(BigDecimal primeNettesante) {
        this.primeNettesante = primeNettesante;
    }

    public BigDecimal getComgessante() {
        return comgessante;
    }

    public void setComgessante(BigDecimal comgessante) {
        this.comgessante = comgessante;
    }

    public BigDecimal getComintersante() {
        return comintersante;
    }

    public void setComintersante(BigDecimal comintersante) {
        this.comintersante = comintersante;
    }

    public BigDecimal getComconssante() {
        return comconssante;
    }

    public void setComconssante(BigDecimal comconssante) {
        this.comconssante = comconssante;
    }

    public BigDecimal getTaxesante() {
        return taxesante;
    }

    public void setTaxesante(BigDecimal taxesante) {
        this.taxesante = taxesante;
    }

    public BigDecimal getReductionsante() {
        return reductionsante;
    }

    public void setReductionsante(BigDecimal reductionsante) {
        this.reductionsante = reductionsante;
    }

    public BigDecimal getComaperSante() {
        return comaperSante;
    }

    public void setComaperSante(BigDecimal comaperSante) {
        this.comaperSante = comaperSante;
    }

    public BigDecimal getComcoasssante() {
        return comcoasssante;
    }

    public void setComcoasssante(BigDecimal comcoasssante) {
        this.comcoasssante = comcoasssante;
    }

    public BigDecimal getAccessoiresante() {
        return accessoiresante;
    }

    public void setAccessoiresante(BigDecimal accessoiresante) {
        this.accessoiresante = accessoiresante;
    }

    public String getCodeAvenantSante() {
        return codeAvenantSante;
    }

    public void setCodeAvenantSante(String codeAvenantSante) {
        this.codeAvenantSante = codeAvenantSante;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieSante> getGarantieGarantieChoisieSanteList() {
        return garantieGarantieChoisieSanteList;
    }

    public void setGarantieGarantieChoisieSanteList(List<GarantieGarantieChoisieSante> garantieGarantieChoisieSanteList) {
        this.garantieGarantieChoisieSanteList = garantieGarantieChoisieSanteList;
    }

    public AffilieSante getCodeAffilie() {
        return codeAffilie;
    }

    public void setCodeAffilie(AffilieSante codeAffilie) {
        this.codeAffilie = codeAffilie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisiesante != null ? codeGarantieChoisiesante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieSante)) {
            return false;
        }
        GarantieChoisieSante other = (GarantieChoisieSante) object;
        if ((this.codeGarantieChoisiesante == null && other.codeGarantieChoisiesante != null) || (this.codeGarantieChoisiesante != null && !this.codeGarantieChoisiesante.equals(other.codeGarantieChoisiesante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieSante[ codeGarantieChoisiesante=" + codeGarantieChoisiesante + " ]";
    }
    
}
