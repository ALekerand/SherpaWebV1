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
@Table(name = "garantie_choisie_transport_corps")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieTransportCorps.findAll", query = "SELECT g FROM GarantieChoisieTransportCorps g"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByCodeGrtieChoisieTrspCorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.codeGrtieChoisieTrspCorps = :codeGrtieChoisieTrspCorps"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByLibelleGarantieChoisieCorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.libelleGarantieChoisieCorps = :libelleGarantieChoisieCorps"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByDateGarantieChoisieCorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.dateGarantieChoisieCorps = :dateGarantieChoisieCorps"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByMontantGarantieCorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.montantGarantieCorps = :montantGarantieCorps"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByAccessoirecorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.accessoirecorps = :accessoirecorps"),
    @NamedQuery(name = "GarantieChoisieTransportCorps.findByCodeAvenantCorps", query = "SELECT g FROM GarantieChoisieTransportCorps g WHERE g.codeAvenantCorps = :codeAvenantCorps")})
public class GarantieChoisieTransportCorps implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_GRTIE_CHOISIE_TRSP_CORPS")
    private String codeGrtieChoisieTrspCorps;
    @Size(max = 50)
    @Column(name = "LIBELLE_GARANTIE_CHOISIE_CORPS")
    private String libelleGarantieChoisieCorps;
    @Column(name = "DATE_GARANTIE_CHOISIE_CORPS")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisieCorps;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_GARANTIE_CORPS")
    private BigDecimal montantGarantieCorps;
    @Column(name = "ACCESSOIRECORPS")
    private BigDecimal accessoirecorps;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_CORPS")
    private String codeAvenantCorps;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieTransportCorps")
    private List<GarantieGarantieChoisieCorps> garantieGarantieChoisieCorpsList;
    @JoinColumn(name = "CODE_ENGIN", referencedColumnName = "CODE_ENGIN")
    @ManyToOne
    private CorpsEngin codeEngin;

    public GarantieChoisieTransportCorps() {
    }

    public GarantieChoisieTransportCorps(String codeGrtieChoisieTrspCorps) {
        this.codeGrtieChoisieTrspCorps = codeGrtieChoisieTrspCorps;
    }

    public String getCodeGrtieChoisieTrspCorps() {
        return codeGrtieChoisieTrspCorps;
    }

    public void setCodeGrtieChoisieTrspCorps(String codeGrtieChoisieTrspCorps) {
        this.codeGrtieChoisieTrspCorps = codeGrtieChoisieTrspCorps;
    }

    public String getLibelleGarantieChoisieCorps() {
        return libelleGarantieChoisieCorps;
    }

    public void setLibelleGarantieChoisieCorps(String libelleGarantieChoisieCorps) {
        this.libelleGarantieChoisieCorps = libelleGarantieChoisieCorps;
    }

    public Date getDateGarantieChoisieCorps() {
        return dateGarantieChoisieCorps;
    }

    public void setDateGarantieChoisieCorps(Date dateGarantieChoisieCorps) {
        this.dateGarantieChoisieCorps = dateGarantieChoisieCorps;
    }

    public BigDecimal getMontantGarantieCorps() {
        return montantGarantieCorps;
    }

    public void setMontantGarantieCorps(BigDecimal montantGarantieCorps) {
        this.montantGarantieCorps = montantGarantieCorps;
    }

    public BigDecimal getAccessoirecorps() {
        return accessoirecorps;
    }

    public void setAccessoirecorps(BigDecimal accessoirecorps) {
        this.accessoirecorps = accessoirecorps;
    }

    public String getCodeAvenantCorps() {
        return codeAvenantCorps;
    }

    public void setCodeAvenantCorps(String codeAvenantCorps) {
        this.codeAvenantCorps = codeAvenantCorps;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieCorps> getGarantieGarantieChoisieCorpsList() {
        return garantieGarantieChoisieCorpsList;
    }

    public void setGarantieGarantieChoisieCorpsList(List<GarantieGarantieChoisieCorps> garantieGarantieChoisieCorpsList) {
        this.garantieGarantieChoisieCorpsList = garantieGarantieChoisieCorpsList;
    }

    public CorpsEngin getCodeEngin() {
        return codeEngin;
    }

    public void setCodeEngin(CorpsEngin codeEngin) {
        this.codeEngin = codeEngin;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGrtieChoisieTrspCorps != null ? codeGrtieChoisieTrspCorps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieTransportCorps)) {
            return false;
        }
        GarantieChoisieTransportCorps other = (GarantieChoisieTransportCorps) object;
        if ((this.codeGrtieChoisieTrspCorps == null && other.codeGrtieChoisieTrspCorps != null) || (this.codeGrtieChoisieTrspCorps != null && !this.codeGrtieChoisieTrspCorps.equals(other.codeGrtieChoisieTrspCorps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieTransportCorps[ codeGrtieChoisieTrspCorps=" + codeGrtieChoisieTrspCorps + " ]";
    }
    
}
