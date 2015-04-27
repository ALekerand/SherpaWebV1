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
@Table(name = "permis")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Permis.findAll", query = "SELECT p FROM Permis p"),
    @NamedQuery(name = "Permis.findByIdPermis", query = "SELECT p FROM Permis p WHERE p.idPermis = :idPermis"),
    @NamedQuery(name = "Permis.findByNumeroPermis", query = "SELECT p FROM Permis p WHERE p.numeroPermis = :numeroPermis"),
    @NamedQuery(name = "Permis.findByDatePermis", query = "SELECT p FROM Permis p WHERE p.datePermis = :datePermis"),
    @NamedQuery(name = "Permis.findByDureePermis", query = "SELECT p FROM Permis p WHERE p.dureePermis = :dureePermis"),
    @NamedQuery(name = "Permis.findByTypePermis", query = "SELECT p FROM Permis p WHERE p.typePermis = :typePermis")})
public class Permis implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "ID_PERMIS")
    private String idPermis;
    @Size(max = 30)
    @Column(name = "NUMERO_PERMIS")
    private String numeroPermis;
    @Column(name = "DATE_PERMIS")
    @Temporal(TemporalType.DATE)
    private Date datePermis;
    @Column(name = "DUREE_PERMIS")
    private Short dureePermis;
    @Size(max = 10)
    @Column(name = "TYPE_PERMIS")
    private String typePermis;
    @JoinColumn(name = "NUM_SOUSCRIPTEUR", referencedColumnName = "NUM_SOUSCRIPTEUR")
    @ManyToOne(optional = false)
    private Physique numSouscripteur;

    public Permis() {
    }

    public Permis(String idPermis) {
        this.idPermis = idPermis;
    }

    public String getIdPermis() {
        return idPermis;
    }

    public void setIdPermis(String idPermis) {
        this.idPermis = idPermis;
    }

    public String getNumeroPermis() {
        return numeroPermis;
    }

    public void setNumeroPermis(String numeroPermis) {
        this.numeroPermis = numeroPermis;
    }

    public Date getDatePermis() {
        return datePermis;
    }

    public void setDatePermis(Date datePermis) {
        this.datePermis = datePermis;
    }

    public Short getDureePermis() {
        return dureePermis;
    }

    public void setDureePermis(Short dureePermis) {
        this.dureePermis = dureePermis;
    }

    public String getTypePermis() {
        return typePermis;
    }

    public void setTypePermis(String typePermis) {
        this.typePermis = typePermis;
    }

    public Physique getNumSouscripteur() {
        return numSouscripteur;
    }

    public void setNumSouscripteur(Physique numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPermis != null ? idPermis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Permis)) {
            return false;
        }
        Permis other = (Permis) object;
        if ((this.idPermis == null && other.idPermis != null) || (this.idPermis != null && !this.idPermis.equals(other.idPermis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Permis[ idPermis=" + idPermis + " ]";
    }
    
}
