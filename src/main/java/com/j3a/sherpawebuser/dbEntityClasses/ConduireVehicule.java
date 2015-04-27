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
@Table(name = "conduire_vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConduireVehicule.findAll", query = "SELECT c FROM ConduireVehicule c"),
    @NamedQuery(name = "ConduireVehicule.findByCodeVehicule", query = "SELECT c FROM ConduireVehicule c WHERE c.conduireVehiculePK.codeVehicule = :codeVehicule"),
    @NamedQuery(name = "ConduireVehicule.findByNumCond", query = "SELECT c FROM ConduireVehicule c WHERE c.conduireVehiculePK.numCond = :numCond"),
    @NamedQuery(name = "ConduireVehicule.findByDateConduite", query = "SELECT c FROM ConduireVehicule c WHERE c.dateConduite = :dateConduite")})
public class ConduireVehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConduireVehiculePK conduireVehiculePK;
    @Column(name = "DATE_CONDUITE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConduite;
    @JoinColumn(name = "NUM_COND", referencedColumnName = "NUM_COND", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Conducteur conducteur;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehicule vehicule;

    public ConduireVehicule() {
    }

    public ConduireVehicule(ConduireVehiculePK conduireVehiculePK) {
        this.conduireVehiculePK = conduireVehiculePK;
    }

    public ConduireVehicule(String codeVehicule, String numCond) {
        this.conduireVehiculePK = new ConduireVehiculePK(codeVehicule, numCond);
    }

    public ConduireVehiculePK getConduireVehiculePK() {
        return conduireVehiculePK;
    }

    public void setConduireVehiculePK(ConduireVehiculePK conduireVehiculePK) {
        this.conduireVehiculePK = conduireVehiculePK;
    }

    public Date getDateConduite() {
        return dateConduite;
    }

    public void setDateConduite(Date dateConduite) {
        this.dateConduite = dateConduite;
    }

    public Conducteur getConducteur() {
        return conducteur;
    }

    public void setConducteur(Conducteur conducteur) {
        this.conducteur = conducteur;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (conduireVehiculePK != null ? conduireVehiculePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConduireVehicule)) {
            return false;
        }
        ConduireVehicule other = (ConduireVehicule) object;
        if ((this.conduireVehiculePK == null && other.conduireVehiculePK != null) || (this.conduireVehiculePK != null && !this.conduireVehiculePK.equals(other.conduireVehiculePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ConduireVehicule[ conduireVehiculePK=" + conduireVehiculePK + " ]";
    }
    
}
