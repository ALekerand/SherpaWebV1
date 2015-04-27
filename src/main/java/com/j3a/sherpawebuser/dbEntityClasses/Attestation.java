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
@Table(name = "attestation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Attestation.findAll", query = "SELECT a FROM Attestation a"),
    @NamedQuery(name = "Attestation.findByCodeAttestation", query = "SELECT a FROM Attestation a WHERE a.codeAttestation = :codeAttestation"),
    @NamedQuery(name = "Attestation.findByEtat", query = "SELECT a FROM Attestation a WHERE a.etat = :etat"),
    @NamedQuery(name = "Attestation.findByDebutperiode", query = "SELECT a FROM Attestation a WHERE a.debutperiode = :debutperiode"),
    @NamedQuery(name = "Attestation.findByFinperiode", query = "SELECT a FROM Attestation a WHERE a.finperiode = :finperiode"),
    @NamedQuery(name = "Attestation.findByNumaven", query = "SELECT a FROM Attestation a WHERE a.numaven = :numaven")})
public class Attestation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_ATTESTATION")
    private String codeAttestation;
    @Size(max = 50)
    @Column(name = "ETAT")
    private String etat;
    @Column(name = "DEBUTPERIODE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date debutperiode;
    @Column(name = "FINPERIODE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date finperiode;
    @Size(max = 50)
    @Column(name = "NUMAVEN")
    private String numaven;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE")
    @ManyToOne
    private Vehicule codeVehicule;
    @JoinColumn(name = "ID_STOCK", referencedColumnName = "ID_STOCK")
    @ManyToOne
    private Stock idStock;

    public Attestation() {
    }

    public Attestation(String codeAttestation) {
        this.codeAttestation = codeAttestation;
    }

    public String getCodeAttestation() {
        return codeAttestation;
    }

    public void setCodeAttestation(String codeAttestation) {
        this.codeAttestation = codeAttestation;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public Date getDebutperiode() {
        return debutperiode;
    }

    public void setDebutperiode(Date debutperiode) {
        this.debutperiode = debutperiode;
    }

    public Date getFinperiode() {
        return finperiode;
    }

    public void setFinperiode(Date finperiode) {
        this.finperiode = finperiode;
    }

    public String getNumaven() {
        return numaven;
    }

    public void setNumaven(String numaven) {
        this.numaven = numaven;
    }

    public Vehicule getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(Vehicule codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    public Stock getIdStock() {
        return idStock;
    }

    public void setIdStock(Stock idStock) {
        this.idStock = idStock;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAttestation != null ? codeAttestation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Attestation)) {
            return false;
        }
        Attestation other = (Attestation) object;
        if ((this.codeAttestation == null && other.codeAttestation != null) || (this.codeAttestation != null && !this.codeAttestation.equals(other.codeAttestation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Attestation[ codeAttestation=" + codeAttestation + " ]";
    }
    
}
