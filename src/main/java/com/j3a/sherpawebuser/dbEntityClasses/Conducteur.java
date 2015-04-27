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
import javax.persistence.CascadeType;
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
@Table(name = "conducteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Conducteur.findAll", query = "SELECT c FROM Conducteur c"),
    @NamedQuery(name = "Conducteur.findByNumCond", query = "SELECT c FROM Conducteur c WHERE c.numCond = :numCond"),
    @NamedQuery(name = "Conducteur.findByNonCond", query = "SELECT c FROM Conducteur c WHERE c.nonCond = :nonCond"),
    @NamedQuery(name = "Conducteur.findByPrenomsCond", query = "SELECT c FROM Conducteur c WHERE c.prenomsCond = :prenomsCond"),
    @NamedQuery(name = "Conducteur.findByDateNaissCond", query = "SELECT c FROM Conducteur c WHERE c.dateNaissCond = :dateNaissCond"),
    @NamedQuery(name = "Conducteur.findByLieuNaisCond", query = "SELECT c FROM Conducteur c WHERE c.lieuNaisCond = :lieuNaisCond"),
    @NamedQuery(name = "Conducteur.findByTyppermiscond", query = "SELECT c FROM Conducteur c WHERE c.typpermiscond = :typpermiscond"),
    @NamedQuery(name = "Conducteur.findByNumpermiscond", query = "SELECT c FROM Conducteur c WHERE c.numpermiscond = :numpermiscond"),
    @NamedQuery(name = "Conducteur.findByDureepermiscond", query = "SELECT c FROM Conducteur c WHERE c.dureepermiscond = :dureepermiscond"),
    @NamedQuery(name = "Conducteur.findByCategsocioprocond", query = "SELECT c FROM Conducteur c WHERE c.categsocioprocond = :categsocioprocond"),
    @NamedQuery(name = "Conducteur.findByTypcatsocprocond", query = "SELECT c FROM Conducteur c WHERE c.typcatsocprocond = :typcatsocprocond")})
public class Conducteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_COND")
    private String numCond;
    @Size(max = 15)
    @Column(name = "NON_COND")
    private String nonCond;
    @Size(max = 25)
    @Column(name = "PRENOMS_COND")
    private String prenomsCond;
    @Column(name = "DATE_NAISS_COND")
    @Temporal(TemporalType.DATE)
    private Date dateNaissCond;
    @Size(max = 15)
    @Column(name = "LIEU_NAIS_COND")
    private String lieuNaisCond;
    @Size(max = 15)
    @Column(name = "TYPPERMISCOND")
    private String typpermiscond;
    @Size(max = 25)
    @Column(name = "NUMPERMISCOND")
    private String numpermiscond;
    @Column(name = "DUREEPERMISCOND")
    private Short dureepermiscond;
    @Size(max = 25)
    @Column(name = "CATEGSOCIOPROCOND")
    private String categsocioprocond;
    @Size(max = 25)
    @Column(name = "TYPCATSOCPROCOND")
    private String typcatsocprocond;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conducteur")
    private List<ConduireVehicule> conduireVehiculeList;

    public Conducteur() {
    }

    public Conducteur(String numCond) {
        this.numCond = numCond;
    }

    public String getNumCond() {
        return numCond;
    }

    public void setNumCond(String numCond) {
        this.numCond = numCond;
    }

    public String getNonCond() {
        return nonCond;
    }

    public void setNonCond(String nonCond) {
        this.nonCond = nonCond;
    }

    public String getPrenomsCond() {
        return prenomsCond;
    }

    public void setPrenomsCond(String prenomsCond) {
        this.prenomsCond = prenomsCond;
    }

    public Date getDateNaissCond() {
        return dateNaissCond;
    }

    public void setDateNaissCond(Date dateNaissCond) {
        this.dateNaissCond = dateNaissCond;
    }

    public String getLieuNaisCond() {
        return lieuNaisCond;
    }

    public void setLieuNaisCond(String lieuNaisCond) {
        this.lieuNaisCond = lieuNaisCond;
    }

    public String getTyppermiscond() {
        return typpermiscond;
    }

    public void setTyppermiscond(String typpermiscond) {
        this.typpermiscond = typpermiscond;
    }

    public String getNumpermiscond() {
        return numpermiscond;
    }

    public void setNumpermiscond(String numpermiscond) {
        this.numpermiscond = numpermiscond;
    }

    public Short getDureepermiscond() {
        return dureepermiscond;
    }

    public void setDureepermiscond(Short dureepermiscond) {
        this.dureepermiscond = dureepermiscond;
    }

    public String getCategsocioprocond() {
        return categsocioprocond;
    }

    public void setCategsocioprocond(String categsocioprocond) {
        this.categsocioprocond = categsocioprocond;
    }

    public String getTypcatsocprocond() {
        return typcatsocprocond;
    }

    public void setTypcatsocprocond(String typcatsocprocond) {
        this.typcatsocprocond = typcatsocprocond;
    }

    @XmlTransient
    public List<ConduireVehicule> getConduireVehiculeList() {
        return conduireVehiculeList;
    }

    public void setConduireVehiculeList(List<ConduireVehicule> conduireVehiculeList) {
        this.conduireVehiculeList = conduireVehiculeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numCond != null ? numCond.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Conducteur)) {
            return false;
        }
        Conducteur other = (Conducteur) object;
        if ((this.numCond == null && other.numCond != null) || (this.numCond != null && !this.numCond.equals(other.numCond))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Conducteur[ numCond=" + numCond + " ]";
    }
    
}
