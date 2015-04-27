/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "avenant_risque_nta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvenantRisqueNta.findAll", query = "SELECT a FROM AvenantRisqueNta a"),
    @NamedQuery(name = "AvenantRisqueNta.findByNumAvenant", query = "SELECT a FROM AvenantRisqueNta a WHERE a.avenantRisqueNtaPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvenantRisqueNta.findByCodeRisquenta", query = "SELECT a FROM AvenantRisqueNta a WHERE a.avenantRisqueNtaPK.codeRisquenta = :codeRisquenta"),
    @NamedQuery(name = "AvenantRisqueNta.findByDateAvenantRisquenta", query = "SELECT a FROM AvenantRisqueNta a WHERE a.dateAvenantRisquenta = :dateAvenantRisquenta")})
public class AvenantRisqueNta implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvenantRisqueNtaPK avenantRisqueNtaPK;
    @Column(name = "DATE_AVENANT_RISQUENTA")
    @Temporal(TemporalType.DATE)
    private Date dateAvenantRisquenta;
    @JoinColumn(name = "CODE_RISQUENTA", referencedColumnName = "CODE_RISQUENTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RisqueNta risqueNta;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;

    public AvenantRisqueNta() {
    }

    public AvenantRisqueNta(AvenantRisqueNtaPK avenantRisqueNtaPK) {
        this.avenantRisqueNtaPK = avenantRisqueNtaPK;
    }

    public AvenantRisqueNta(String numAvenant, String codeRisquenta) {
        this.avenantRisqueNtaPK = new AvenantRisqueNtaPK(numAvenant, codeRisquenta);
    }

    public AvenantRisqueNtaPK getAvenantRisqueNtaPK() {
        return avenantRisqueNtaPK;
    }

    public void setAvenantRisqueNtaPK(AvenantRisqueNtaPK avenantRisqueNtaPK) {
        this.avenantRisqueNtaPK = avenantRisqueNtaPK;
    }

    public Date getDateAvenantRisquenta() {
        return dateAvenantRisquenta;
    }

    public void setDateAvenantRisquenta(Date dateAvenantRisquenta) {
        this.dateAvenantRisquenta = dateAvenantRisquenta;
    }

    public RisqueNta getRisqueNta() {
        return risqueNta;
    }

    public void setRisqueNta(RisqueNta risqueNta) {
        this.risqueNta = risqueNta;
    }

    public Avenant getAvenant() {
        return avenant;
    }

    public void setAvenant(Avenant avenant) {
        this.avenant = avenant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avenantRisqueNtaPK != null ? avenantRisqueNtaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvenantRisqueNta)) {
            return false;
        }
        AvenantRisqueNta other = (AvenantRisqueNta) object;
        if ((this.avenantRisqueNtaPK == null && other.avenantRisqueNtaPK != null) || (this.avenantRisqueNtaPK != null && !this.avenantRisqueNtaPK.equals(other.avenantRisqueNtaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvenantRisqueNta[ avenantRisqueNtaPK=" + avenantRisqueNtaPK + " ]";
    }
    
}
