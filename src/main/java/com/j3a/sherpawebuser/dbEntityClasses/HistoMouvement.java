/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "histo_mouvement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoMouvement.findAll", query = "SELECT h FROM HistoMouvement h"),
    @NamedQuery(name = "HistoMouvement.findByCodeHistoMouvement", query = "SELECT h FROM HistoMouvement h WHERE h.codeHistoMouvement = :codeHistoMouvement"),
    @NamedQuery(name = "HistoMouvement.findByIdAvenant", query = "SELECT h FROM HistoMouvement h WHERE h.idAvenant = :idAvenant"),
    @NamedQuery(name = "HistoMouvement.findByDateHistoMouvement", query = "SELECT h FROM HistoMouvement h WHERE h.dateHistoMouvement = :dateHistoMouvement"),
    @NamedQuery(name = "HistoMouvement.findByLibelleHistoMouvement", query = "SELECT h FROM HistoMouvement h WHERE h.libelleHistoMouvement = :libelleHistoMouvement")})
public class HistoMouvement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_HISTO_MOUVEMENT")
    private String codeHistoMouvement;
    @Size(max = 60)
    @Column(name = "ID_AVENANT")
    private String idAvenant;
    @Column(name = "DATE_HISTO_MOUVEMENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHistoMouvement;
    @Size(max = 60)
    @Column(name = "LIBELLE_HISTO_MOUVEMENT")
    private String libelleHistoMouvement;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE")
    @ManyToOne
    private Vehicule codeVehicule;

    public HistoMouvement() {
    }

    public HistoMouvement(String codeHistoMouvement) {
        this.codeHistoMouvement = codeHistoMouvement;
    }

    public String getCodeHistoMouvement() {
        return codeHistoMouvement;
    }

    public void setCodeHistoMouvement(String codeHistoMouvement) {
        this.codeHistoMouvement = codeHistoMouvement;
    }

    public String getIdAvenant() {
        return idAvenant;
    }

    public void setIdAvenant(String idAvenant) {
        this.idAvenant = idAvenant;
    }

    public Date getDateHistoMouvement() {
        return dateHistoMouvement;
    }

    public void setDateHistoMouvement(Date dateHistoMouvement) {
        this.dateHistoMouvement = dateHistoMouvement;
    }

    public String getLibelleHistoMouvement() {
        return libelleHistoMouvement;
    }

    public void setLibelleHistoMouvement(String libelleHistoMouvement) {
        this.libelleHistoMouvement = libelleHistoMouvement;
    }

    public Vehicule getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(Vehicule codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeHistoMouvement != null ? codeHistoMouvement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoMouvement)) {
            return false;
        }
        HistoMouvement other = (HistoMouvement) object;
        if ((this.codeHistoMouvement == null && other.codeHistoMouvement != null) || (this.codeHistoMouvement != null && !this.codeHistoMouvement.equals(other.codeHistoMouvement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.HistoMouvement[ codeHistoMouvement=" + codeHistoMouvement + " ]";
    }
    
}
