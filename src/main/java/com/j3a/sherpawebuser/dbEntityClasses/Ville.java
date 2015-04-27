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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ville")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ville.findAll", query = "SELECT v FROM Ville v"),
    @NamedQuery(name = "Ville.findByCodeVille", query = "SELECT v FROM Ville v WHERE v.codeVille = :codeVille"),
    @NamedQuery(name = "Ville.findByLibelleVille", query = "SELECT v FROM Ville v WHERE v.libelleVille = :libelleVille")})
public class Ville implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_VILLE")
    private String codeVille;
    @Size(max = 35)
    @Column(name = "LIBELLE_VILLE")
    private String libelleVille;
    @JoinColumn(name = "CODE_PROVINCE", referencedColumnName = "CODE_PROVINCE")
    @ManyToOne(optional = false)
    private Province codeProvince;
    @JoinColumn(name = "CODE_ZONE_GEO", referencedColumnName = "CODE_ZONE_GEO")
    @ManyToOne(optional = false)
    private ZoneGeographique codeZoneGeo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeVille")
    private List<PointVente> pointVenteList;

    public Ville() {
    }

    public Ville(String codeVille) {
        this.codeVille = codeVille;
    }

    public String getCodeVille() {
        return codeVille;
    }

    public void setCodeVille(String codeVille) {
        this.codeVille = codeVille;
    }

    public String getLibelleVille() {
        return libelleVille;
    }

    public void setLibelleVille(String libelleVille) {
        this.libelleVille = libelleVille;
    }

    public Province getCodeProvince() {
        return codeProvince;
    }

    public void setCodeProvince(Province codeProvince) {
        this.codeProvince = codeProvince;
    }

    public ZoneGeographique getCodeZoneGeo() {
        return codeZoneGeo;
    }

    public void setCodeZoneGeo(ZoneGeographique codeZoneGeo) {
        this.codeZoneGeo = codeZoneGeo;
    }

    @XmlTransient
    public List<PointVente> getPointVenteList() {
        return pointVenteList;
    }

    public void setPointVenteList(List<PointVente> pointVenteList) {
        this.pointVenteList = pointVenteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeVille != null ? codeVille.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ville)) {
            return false;
        }
        Ville other = (Ville) object;
        if ((this.codeVille == null && other.codeVille != null) || (this.codeVille != null && !this.codeVille.equals(other.codeVille))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Ville[ codeVille=" + codeVille + " ]";
    }
    
}
