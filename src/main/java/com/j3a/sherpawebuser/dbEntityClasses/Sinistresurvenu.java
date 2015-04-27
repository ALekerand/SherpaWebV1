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
@Table(name = "sinistresurvenu")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinistresurvenu.findAll", query = "SELECT s FROM Sinistresurvenu s"),
    @NamedQuery(name = "Sinistresurvenu.findByIdsinsurv", query = "SELECT s FROM Sinistresurvenu s WHERE s.idsinsurv = :idsinsurv"),
    @NamedQuery(name = "Sinistresurvenu.findByNumsurven", query = "SELECT s FROM Sinistresurvenu s WHERE s.numsurven = :numsurven"),
    @NamedQuery(name = "Sinistresurvenu.findByDateDebut", query = "SELECT s FROM Sinistresurvenu s WHERE s.dateDebut = :dateDebut"),
    @NamedQuery(name = "Sinistresurvenu.findByDateFin", query = "SELECT s FROM Sinistresurvenu s WHERE s.dateFin = :dateFin"),
    @NamedQuery(name = "Sinistresurvenu.findByNomPeriode", query = "SELECT s FROM Sinistresurvenu s WHERE s.nomPeriode = :nomPeriode"),
    @NamedQuery(name = "Sinistresurvenu.findByMtantsinistre", query = "SELECT s FROM Sinistresurvenu s WHERE s.mtantsinistre = :mtantsinistre")})
public class Sinistresurvenu implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDSINSURV")
    private Integer idsinsurv;
    @Column(name = "NUMSURVEN")
    private Integer numsurven;
    @Column(name = "DATE_DEBUT")
    @Temporal(TemporalType.DATE)
    private Date dateDebut;
    @Column(name = "DATE_FIN")
    @Temporal(TemporalType.DATE)
    private Date dateFin;
    @Size(max = 60)
    @Column(name = "NOM_PERIODE")
    private String nomPeriode;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MTANTSINISTRE")
    private BigDecimal mtantsinistre;
    @OneToMany(mappedBy = "idsinsurv")
    private List<Paiemtsinistre> paiemtsinistreList;

    public Sinistresurvenu() {
    }

    public Sinistresurvenu(Integer idsinsurv) {
        this.idsinsurv = idsinsurv;
    }

    public Integer getIdsinsurv() {
        return idsinsurv;
    }

    public void setIdsinsurv(Integer idsinsurv) {
        this.idsinsurv = idsinsurv;
    }

    public Integer getNumsurven() {
        return numsurven;
    }

    public void setNumsurven(Integer numsurven) {
        this.numsurven = numsurven;
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public String getNomPeriode() {
        return nomPeriode;
    }

    public void setNomPeriode(String nomPeriode) {
        this.nomPeriode = nomPeriode;
    }

    public BigDecimal getMtantsinistre() {
        return mtantsinistre;
    }

    public void setMtantsinistre(BigDecimal mtantsinistre) {
        this.mtantsinistre = mtantsinistre;
    }

    @XmlTransient
    public List<Paiemtsinistre> getPaiemtsinistreList() {
        return paiemtsinistreList;
    }

    public void setPaiemtsinistreList(List<Paiemtsinistre> paiemtsinistreList) {
        this.paiemtsinistreList = paiemtsinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idsinsurv != null ? idsinsurv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sinistresurvenu)) {
            return false;
        }
        Sinistresurvenu other = (Sinistresurvenu) object;
        if ((this.idsinsurv == null && other.idsinsurv != null) || (this.idsinsurv != null && !this.idsinsurv.equals(other.idsinsurv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Sinistresurvenu[ idsinsurv=" + idsinsurv + " ]";
    }
    
}
