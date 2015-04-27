/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "paiemtsinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paiemtsinistre.findAll", query = "SELECT p FROM Paiemtsinistre p"),
    @NamedQuery(name = "Paiemtsinistre.findByIdpaiemtsin", query = "SELECT p FROM Paiemtsinistre p WHERE p.idpaiemtsin = :idpaiemtsin"),
    @NamedQuery(name = "Paiemtsinistre.findByNumpaiemt", query = "SELECT p FROM Paiemtsinistre p WHERE p.numpaiemt = :numpaiemt"),
    @NamedQuery(name = "Paiemtsinistre.findByDateDebut", query = "SELECT p FROM Paiemtsinistre p WHERE p.dateDebut = :dateDebut"),
    @NamedQuery(name = "Paiemtsinistre.findByDateFin", query = "SELECT p FROM Paiemtsinistre p WHERE p.dateFin = :dateFin"),
    @NamedQuery(name = "Paiemtsinistre.findByNomPeriode", query = "SELECT p FROM Paiemtsinistre p WHERE p.nomPeriode = :nomPeriode"),
    @NamedQuery(name = "Paiemtsinistre.findByMtantpaye", query = "SELECT p FROM Paiemtsinistre p WHERE p.mtantpaye = :mtantpaye")})
public class Paiemtsinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDPAIEMTSIN")
    private Integer idpaiemtsin;
    @Column(name = "NUMPAIEMT")
    private Integer numpaiemt;
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
    @Column(name = "MTANTPAYE")
    private BigDecimal mtantpaye;
    @JoinColumn(name = "IDSINSURV", referencedColumnName = "IDSINSURV")
    @ManyToOne
    private Sinistresurvenu idsinsurv;

    public Paiemtsinistre() {
    }

    public Paiemtsinistre(Integer idpaiemtsin) {
        this.idpaiemtsin = idpaiemtsin;
    }

    public Integer getIdpaiemtsin() {
        return idpaiemtsin;
    }

    public void setIdpaiemtsin(Integer idpaiemtsin) {
        this.idpaiemtsin = idpaiemtsin;
    }

    public Integer getNumpaiemt() {
        return numpaiemt;
    }

    public void setNumpaiemt(Integer numpaiemt) {
        this.numpaiemt = numpaiemt;
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

    public BigDecimal getMtantpaye() {
        return mtantpaye;
    }

    public void setMtantpaye(BigDecimal mtantpaye) {
        this.mtantpaye = mtantpaye;
    }

    public Sinistresurvenu getIdsinsurv() {
        return idsinsurv;
    }

    public void setIdsinsurv(Sinistresurvenu idsinsurv) {
        this.idsinsurv = idsinsurv;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpaiemtsin != null ? idpaiemtsin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Paiemtsinistre)) {
            return false;
        }
        Paiemtsinistre other = (Paiemtsinistre) object;
        if ((this.idpaiemtsin == null && other.idpaiemtsin != null) || (this.idpaiemtsin != null && !this.idpaiemtsin.equals(other.idpaiemtsin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Paiemtsinistre[ idpaiemtsin=" + idpaiemtsin + " ]";
    }
    
}
