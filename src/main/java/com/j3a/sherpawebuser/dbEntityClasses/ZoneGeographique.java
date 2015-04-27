/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "zone_geographique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ZoneGeographique.findAll", query = "SELECT z FROM ZoneGeographique z"),
    @NamedQuery(name = "ZoneGeographique.findByCodeZoneGeo", query = "SELECT z FROM ZoneGeographique z WHERE z.codeZoneGeo = :codeZoneGeo"),
    @NamedQuery(name = "ZoneGeographique.findByLibelleZoneGeo", query = "SELECT z FROM ZoneGeographique z WHERE z.libelleZoneGeo = :libelleZoneGeo")})
public class ZoneGeographique implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_ZONE_GEO")
    private String codeZoneGeo;
    @Size(max = 50)
    @Column(name = "LIBELLE_ZONE_GEO")
    private String libelleZoneGeo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeZoneGeo")
    private List<Ville> villeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "zoneGeographique")
    private List<VehiculeZoneGeographique> vehiculeZoneGeographiqueList;

    public ZoneGeographique() {
    }

    public ZoneGeographique(String codeZoneGeo) {
        this.codeZoneGeo = codeZoneGeo;
    }

    public String getCodeZoneGeo() {
        return codeZoneGeo;
    }

    public void setCodeZoneGeo(String codeZoneGeo) {
        this.codeZoneGeo = codeZoneGeo;
    }

    public String getLibelleZoneGeo() {
        return libelleZoneGeo;
    }

    public void setLibelleZoneGeo(String libelleZoneGeo) {
        this.libelleZoneGeo = libelleZoneGeo;
    }

    @XmlTransient
    public List<Ville> getVilleList() {
        return villeList;
    }

    public void setVilleList(List<Ville> villeList) {
        this.villeList = villeList;
    }

    @XmlTransient
    public List<VehiculeZoneGeographique> getVehiculeZoneGeographiqueList() {
        return vehiculeZoneGeographiqueList;
    }

    public void setVehiculeZoneGeographiqueList(List<VehiculeZoneGeographique> vehiculeZoneGeographiqueList) {
        this.vehiculeZoneGeographiqueList = vehiculeZoneGeographiqueList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeZoneGeo != null ? codeZoneGeo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ZoneGeographique)) {
            return false;
        }
        ZoneGeographique other = (ZoneGeographique) object;
        if ((this.codeZoneGeo == null && other.codeZoneGeo != null) || (this.codeZoneGeo != null && !this.codeZoneGeo.equals(other.codeZoneGeo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ZoneGeographique[ codeZoneGeo=" + codeZoneGeo + " ]";
    }
    
}
