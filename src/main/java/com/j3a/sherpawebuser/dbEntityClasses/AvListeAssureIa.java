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
@Table(name = "av_liste_assure_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvListeAssureIa.findAll", query = "SELECT a FROM AvListeAssureIa a"),
    @NamedQuery(name = "AvListeAssureIa.findByCodeListeAssureIa", query = "SELECT a FROM AvListeAssureIa a WHERE a.avListeAssureIaPK.codeListeAssureIa = :codeListeAssureIa"),
    @NamedQuery(name = "AvListeAssureIa.findByNumAvenant", query = "SELECT a FROM AvListeAssureIa a WHERE a.avListeAssureIaPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvListeAssureIa.findByDateAvListeAssureIa", query = "SELECT a FROM AvListeAssureIa a WHERE a.dateAvListeAssureIa = :dateAvListeAssureIa")})
public class AvListeAssureIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvListeAssureIaPK avListeAssureIaPK;
    @Column(name = "DATE_AV_LISTE_ASSURE_IA")
    @Temporal(TemporalType.DATE)
    private Date dateAvListeAssureIa;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;
    @JoinColumn(name = "CODE_LISTE_ASSURE_IA", referencedColumnName = "CODE_LISTE_ASSURE_IA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeAssureIa listeAssureIa;

    public AvListeAssureIa() {
    }

    public AvListeAssureIa(AvListeAssureIaPK avListeAssureIaPK) {
        this.avListeAssureIaPK = avListeAssureIaPK;
    }

    public AvListeAssureIa(String codeListeAssureIa, String numAvenant) {
        this.avListeAssureIaPK = new AvListeAssureIaPK(codeListeAssureIa, numAvenant);
    }

    public AvListeAssureIaPK getAvListeAssureIaPK() {
        return avListeAssureIaPK;
    }

    public void setAvListeAssureIaPK(AvListeAssureIaPK avListeAssureIaPK) {
        this.avListeAssureIaPK = avListeAssureIaPK;
    }

    public Date getDateAvListeAssureIa() {
        return dateAvListeAssureIa;
    }

    public void setDateAvListeAssureIa(Date dateAvListeAssureIa) {
        this.dateAvListeAssureIa = dateAvListeAssureIa;
    }

    public Avenant getAvenant() {
        return avenant;
    }

    public void setAvenant(Avenant avenant) {
        this.avenant = avenant;
    }

    public ListeAssureIa getListeAssureIa() {
        return listeAssureIa;
    }

    public void setListeAssureIa(ListeAssureIa listeAssureIa) {
        this.listeAssureIa = listeAssureIa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avListeAssureIaPK != null ? avListeAssureIaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeAssureIa)) {
            return false;
        }
        AvListeAssureIa other = (AvListeAssureIa) object;
        if ((this.avListeAssureIaPK == null && other.avListeAssureIaPK != null) || (this.avListeAssureIaPK != null && !this.avListeAssureIaPK.equals(other.avListeAssureIaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeAssureIa[ avListeAssureIaPK=" + avListeAssureIaPK + " ]";
    }
    
}
