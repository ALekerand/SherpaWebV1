/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "sinistre_conducteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SinistreConducteur.findAll", query = "SELECT s FROM SinistreConducteur s"),
    @NamedQuery(name = "SinistreConducteur.findByCodeConducteurSinistre", query = "SELECT s FROM SinistreConducteur s WHERE s.sinistreConducteurPK.codeConducteurSinistre = :codeConducteurSinistre"),
    @NamedQuery(name = "SinistreConducteur.findByCodeSinistre", query = "SELECT s FROM SinistreConducteur s WHERE s.sinistreConducteurPK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "SinistreConducteur.findByDateConducteurSinistre", query = "SELECT s FROM SinistreConducteur s WHERE s.dateConducteurSinistre = :dateConducteurSinistre")})
public class SinistreConducteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected SinistreConducteurPK sinistreConducteurPK;
    @Column(name = "DATE_CONDUCTEUR_SINISTRE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConducteurSinistre;
    @JoinColumn(name = "CODE_CONDUCTEUR_SINISTRE", referencedColumnName = "CODE_CONDUCTEUR_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ConducteurSinistre conducteurSinistre;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public SinistreConducteur() {
    }

    public SinistreConducteur(SinistreConducteurPK sinistreConducteurPK) {
        this.sinistreConducteurPK = sinistreConducteurPK;
    }

    public SinistreConducteur(String codeConducteurSinistre, String codeSinistre) {
        this.sinistreConducteurPK = new SinistreConducteurPK(codeConducteurSinistre, codeSinistre);
    }

    public SinistreConducteurPK getSinistreConducteurPK() {
        return sinistreConducteurPK;
    }

    public void setSinistreConducteurPK(SinistreConducteurPK sinistreConducteurPK) {
        this.sinistreConducteurPK = sinistreConducteurPK;
    }

    public Date getDateConducteurSinistre() {
        return dateConducteurSinistre;
    }

    public void setDateConducteurSinistre(Date dateConducteurSinistre) {
        this.dateConducteurSinistre = dateConducteurSinistre;
    }

    public ConducteurSinistre getConducteurSinistre() {
        return conducteurSinistre;
    }

    public void setConducteurSinistre(ConducteurSinistre conducteurSinistre) {
        this.conducteurSinistre = conducteurSinistre;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sinistreConducteurPK != null ? sinistreConducteurPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SinistreConducteur)) {
            return false;
        }
        SinistreConducteur other = (SinistreConducteur) object;
        if ((this.sinistreConducteurPK == null && other.sinistreConducteurPK != null) || (this.sinistreConducteurPK != null && !this.sinistreConducteurPK.equals(other.sinistreConducteurPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.SinistreConducteur[ sinistreConducteurPK=" + sinistreConducteurPK + " ]";
    }
    
}
