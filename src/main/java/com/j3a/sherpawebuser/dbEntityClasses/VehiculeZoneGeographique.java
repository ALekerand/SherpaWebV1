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
@Table(name = "vehicule_zone_geographique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehiculeZoneGeographique.findAll", query = "SELECT v FROM VehiculeZoneGeographique v"),
    @NamedQuery(name = "VehiculeZoneGeographique.findByCodeVehicule", query = "SELECT v FROM VehiculeZoneGeographique v WHERE v.vehiculeZoneGeographiquePK.codeVehicule = :codeVehicule"),
    @NamedQuery(name = "VehiculeZoneGeographique.findByCodeZoneGeo", query = "SELECT v FROM VehiculeZoneGeographique v WHERE v.vehiculeZoneGeographiquePK.codeZoneGeo = :codeZoneGeo"),
    @NamedQuery(name = "VehiculeZoneGeographique.findByDateRouler", query = "SELECT v FROM VehiculeZoneGeographique v WHERE v.dateRouler = :dateRouler")})
public class VehiculeZoneGeographique implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VehiculeZoneGeographiquePK vehiculeZoneGeographiquePK;
    @Column(name = "DATE_ROULER")
    @Temporal(TemporalType.DATE)
    private Date dateRouler;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehicule vehicule;
    @JoinColumn(name = "CODE_ZONE_GEO", referencedColumnName = "CODE_ZONE_GEO", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ZoneGeographique zoneGeographique;

    public VehiculeZoneGeographique() {
    }

    public VehiculeZoneGeographique(VehiculeZoneGeographiquePK vehiculeZoneGeographiquePK) {
        this.vehiculeZoneGeographiquePK = vehiculeZoneGeographiquePK;
    }

    public VehiculeZoneGeographique(String codeVehicule, String codeZoneGeo) {
        this.vehiculeZoneGeographiquePK = new VehiculeZoneGeographiquePK(codeVehicule, codeZoneGeo);
    }

    public VehiculeZoneGeographiquePK getVehiculeZoneGeographiquePK() {
        return vehiculeZoneGeographiquePK;
    }

    public void setVehiculeZoneGeographiquePK(VehiculeZoneGeographiquePK vehiculeZoneGeographiquePK) {
        this.vehiculeZoneGeographiquePK = vehiculeZoneGeographiquePK;
    }

    public Date getDateRouler() {
        return dateRouler;
    }

    public void setDateRouler(Date dateRouler) {
        this.dateRouler = dateRouler;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    public ZoneGeographique getZoneGeographique() {
        return zoneGeographique;
    }

    public void setZoneGeographique(ZoneGeographique zoneGeographique) {
        this.zoneGeographique = zoneGeographique;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiculeZoneGeographiquePK != null ? vehiculeZoneGeographiquePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculeZoneGeographique)) {
            return false;
        }
        VehiculeZoneGeographique other = (VehiculeZoneGeographique) object;
        if ((this.vehiculeZoneGeographiquePK == null && other.vehiculeZoneGeographiquePK != null) || (this.vehiculeZoneGeographiquePK != null && !this.vehiculeZoneGeographiquePK.equals(other.vehiculeZoneGeographiquePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.VehiculeZoneGeographique[ vehiculeZoneGeographiquePK=" + vehiculeZoneGeographiquePK + " ]";
    }
    
}
