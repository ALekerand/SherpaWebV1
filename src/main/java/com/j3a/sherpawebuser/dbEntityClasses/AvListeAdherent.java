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
@Table(name = "av_liste_adherent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvListeAdherent.findAll", query = "SELECT a FROM AvListeAdherent a"),
    @NamedQuery(name = "AvListeAdherent.findByNumAvenant", query = "SELECT a FROM AvListeAdherent a WHERE a.avListeAdherentPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvListeAdherent.findByCodeListeAdherent", query = "SELECT a FROM AvListeAdherent a WHERE a.avListeAdherentPK.codeListeAdherent = :codeListeAdherent"),
    @NamedQuery(name = "AvListeAdherent.findByDateAvAdherent", query = "SELECT a FROM AvListeAdherent a WHERE a.dateAvAdherent = :dateAvAdherent")})
public class AvListeAdherent implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvListeAdherentPK avListeAdherentPK;
    @Column(name = "DATE_AV_ADHERENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvAdherent;
    @JoinColumn(name = "CODE_LISTE_ADHERENT", referencedColumnName = "CODE_LISTE_ADHERENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeAdherent listeAdherent;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;

    public AvListeAdherent() {
    }

    public AvListeAdherent(AvListeAdherentPK avListeAdherentPK) {
        this.avListeAdherentPK = avListeAdherentPK;
    }

    public AvListeAdherent(String numAvenant, String codeListeAdherent) {
        this.avListeAdherentPK = new AvListeAdherentPK(numAvenant, codeListeAdherent);
    }

    public AvListeAdherentPK getAvListeAdherentPK() {
        return avListeAdherentPK;
    }

    public void setAvListeAdherentPK(AvListeAdherentPK avListeAdherentPK) {
        this.avListeAdherentPK = avListeAdherentPK;
    }

    public Date getDateAvAdherent() {
        return dateAvAdherent;
    }

    public void setDateAvAdherent(Date dateAvAdherent) {
        this.dateAvAdherent = dateAvAdherent;
    }

    public ListeAdherent getListeAdherent() {
        return listeAdherent;
    }

    public void setListeAdherent(ListeAdherent listeAdherent) {
        this.listeAdherent = listeAdherent;
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
        hash += (avListeAdherentPK != null ? avListeAdherentPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeAdherent)) {
            return false;
        }
        AvListeAdherent other = (AvListeAdherent) object;
        if ((this.avListeAdherentPK == null && other.avListeAdherentPK != null) || (this.avListeAdherentPK != null && !this.avListeAdherentPK.equals(other.avListeAdherentPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeAdherent[ avListeAdherentPK=" + avListeAdherentPK + " ]";
    }
    
}
