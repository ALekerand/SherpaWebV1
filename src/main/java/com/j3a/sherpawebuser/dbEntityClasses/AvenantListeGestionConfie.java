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
@Table(name = "avenant_liste_gestion_confie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvenantListeGestionConfie.findAll", query = "SELECT a FROM AvenantListeGestionConfie a"),
    @NamedQuery(name = "AvenantListeGestionConfie.findByNumAvenant", query = "SELECT a FROM AvenantListeGestionConfie a WHERE a.avenantListeGestionConfiePK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvenantListeGestionConfie.findByCodeListeGestionConfie", query = "SELECT a FROM AvenantListeGestionConfie a WHERE a.avenantListeGestionConfiePK.codeListeGestionConfie = :codeListeGestionConfie"),
    @NamedQuery(name = "AvenantListeGestionConfie.findByDateAvListeGc", query = "SELECT a FROM AvenantListeGestionConfie a WHERE a.dateAvListeGc = :dateAvListeGc")})
public class AvenantListeGestionConfie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvenantListeGestionConfiePK avenantListeGestionConfiePK;
    @Column(name = "DATE_AV_LISTE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvListeGc;
    @JoinColumn(name = "CODE_LISTE_GESTION_CONFIE", referencedColumnName = "CODE_LISTE_GESTION_CONFIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeGestionConfie listeGestionConfie;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;

    public AvenantListeGestionConfie() {
    }

    public AvenantListeGestionConfie(AvenantListeGestionConfiePK avenantListeGestionConfiePK) {
        this.avenantListeGestionConfiePK = avenantListeGestionConfiePK;
    }

    public AvenantListeGestionConfie(String numAvenant, String codeListeGestionConfie) {
        this.avenantListeGestionConfiePK = new AvenantListeGestionConfiePK(numAvenant, codeListeGestionConfie);
    }

    public AvenantListeGestionConfiePK getAvenantListeGestionConfiePK() {
        return avenantListeGestionConfiePK;
    }

    public void setAvenantListeGestionConfiePK(AvenantListeGestionConfiePK avenantListeGestionConfiePK) {
        this.avenantListeGestionConfiePK = avenantListeGestionConfiePK;
    }

    public Date getDateAvListeGc() {
        return dateAvListeGc;
    }

    public void setDateAvListeGc(Date dateAvListeGc) {
        this.dateAvListeGc = dateAvListeGc;
    }

    public ListeGestionConfie getListeGestionConfie() {
        return listeGestionConfie;
    }

    public void setListeGestionConfie(ListeGestionConfie listeGestionConfie) {
        this.listeGestionConfie = listeGestionConfie;
    }

    public Avenant getAvenant() {
        return avenant;
    }

    public void setAvenant(Avenant avenant) {
        this.avenant = avenant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avenantListeGestionConfiePK != null ? avenantListeGestionConfiePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvenantListeGestionConfie)) {
            return false;
        }
        AvenantListeGestionConfie other = (AvenantListeGestionConfie) object;
        if ((this.avenantListeGestionConfiePK == null && other.avenantListeGestionConfiePK != null) || (this.avenantListeGestionConfiePK != null && !this.avenantListeGestionConfiePK.equals(other.avenantListeGestionConfiePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvenantListeGestionConfie[ avenantListeGestionConfiePK=" + avenantListeGestionConfiePK + " ]";
    }
    
}
