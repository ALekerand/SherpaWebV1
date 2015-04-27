/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "vehicules_assures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehiculesAssures.findAll", query = "SELECT v FROM VehiculesAssures v"),
    @NamedQuery(name = "VehiculesAssures.findByIdVehiculesAssures", query = "SELECT v FROM VehiculesAssures v WHERE v.idVehiculesAssures = :idVehiculesAssures"),
    @NamedQuery(name = "VehiculesAssures.findByDateVehiculesAssures", query = "SELECT v FROM VehiculesAssures v WHERE v.dateVehiculesAssures = :dateVehiculesAssures")})
public class VehiculesAssures implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "ID_VEHICULES_ASSURES")
    private String idVehiculesAssures;
    @Column(name = "DATE_VEHICULES_ASSURES")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateVehiculesAssures;
    @OneToMany(mappedBy = "idVehiculesAssures")
    private List<Vehicule> vehiculeList;
    @OneToMany(mappedBy = "idVehiculesAssures")
    private List<Avenant> avenantList;

    public VehiculesAssures() {
    }

    public VehiculesAssures(String idVehiculesAssures) {
        this.idVehiculesAssures = idVehiculesAssures;
    }

    public String getIdVehiculesAssures() {
        return idVehiculesAssures;
    }

    public void setIdVehiculesAssures(String idVehiculesAssures) {
        this.idVehiculesAssures = idVehiculesAssures;
    }

    public Date getDateVehiculesAssures() {
        return dateVehiculesAssures;
    }

    public void setDateVehiculesAssures(Date dateVehiculesAssures) {
        this.dateVehiculesAssures = dateVehiculesAssures;
    }

    @XmlTransient
    public List<Vehicule> getVehiculeList() {
        return vehiculeList;
    }

    public void setVehiculeList(List<Vehicule> vehiculeList) {
        this.vehiculeList = vehiculeList;
    }

    @XmlTransient
    public List<Avenant> getAvenantList() {
        return avenantList;
    }

    public void setAvenantList(List<Avenant> avenantList) {
        this.avenantList = avenantList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVehiculesAssures != null ? idVehiculesAssures.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculesAssures)) {
            return false;
        }
        VehiculesAssures other = (VehiculesAssures) object;
        if ((this.idVehiculesAssures == null && other.idVehiculesAssures != null) || (this.idVehiculesAssures != null && !this.idVehiculesAssures.equals(other.idVehiculesAssures))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.VehiculesAssures[ idVehiculesAssures=" + idVehiculesAssures + " ]";
    }
    
}
