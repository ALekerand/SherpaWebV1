/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author J3A-AFRIQUE
 */
@Embeddable
public class VehiculeZoneGeographiquePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_VEHICULE")
    private String codeVehicule;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_ZONE_GEO")
    private String codeZoneGeo;

    public VehiculeZoneGeographiquePK() {
    }

    public VehiculeZoneGeographiquePK(String codeVehicule, String codeZoneGeo) {
        this.codeVehicule = codeVehicule;
        this.codeZoneGeo = codeZoneGeo;
    }

    public String getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(String codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    public String getCodeZoneGeo() {
        return codeZoneGeo;
    }

    public void setCodeZoneGeo(String codeZoneGeo) {
        this.codeZoneGeo = codeZoneGeo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeVehicule != null ? codeVehicule.hashCode() : 0);
        hash += (codeZoneGeo != null ? codeZoneGeo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculeZoneGeographiquePK)) {
            return false;
        }
        VehiculeZoneGeographiquePK other = (VehiculeZoneGeographiquePK) object;
        if ((this.codeVehicule == null && other.codeVehicule != null) || (this.codeVehicule != null && !this.codeVehicule.equals(other.codeVehicule))) {
            return false;
        }
        if ((this.codeZoneGeo == null && other.codeZoneGeo != null) || (this.codeZoneGeo != null && !this.codeZoneGeo.equals(other.codeZoneGeo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.VehiculeZoneGeographiquePK[ codeVehicule=" + codeVehicule + ", codeZoneGeo=" + codeZoneGeo + " ]";
    }
    
}
