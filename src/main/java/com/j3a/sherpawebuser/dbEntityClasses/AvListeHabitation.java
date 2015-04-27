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
@Table(name = "av_liste_habitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvListeHabitation.findAll", query = "SELECT a FROM AvListeHabitation a"),
    @NamedQuery(name = "AvListeHabitation.findByCodeListeHabitation", query = "SELECT a FROM AvListeHabitation a WHERE a.avListeHabitationPK.codeListeHabitation = :codeListeHabitation"),
    @NamedQuery(name = "AvListeHabitation.findByNumAvenant", query = "SELECT a FROM AvListeHabitation a WHERE a.avListeHabitationPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvListeHabitation.findByDateAvListeHabitation", query = "SELECT a FROM AvListeHabitation a WHERE a.dateAvListeHabitation = :dateAvListeHabitation")})
public class AvListeHabitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvListeHabitationPK avListeHabitationPK;
    @Column(name = "DATE_AV_LISTE_HABITATION")
    @Temporal(TemporalType.DATE)
    private Date dateAvListeHabitation;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;
    @JoinColumn(name = "CODE_LISTE_HABITATION", referencedColumnName = "CODE_LISTE_HABITATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeHabitation listeHabitation;

    public AvListeHabitation() {
    }

    public AvListeHabitation(AvListeHabitationPK avListeHabitationPK) {
        this.avListeHabitationPK = avListeHabitationPK;
    }

    public AvListeHabitation(String codeListeHabitation, String numAvenant) {
        this.avListeHabitationPK = new AvListeHabitationPK(codeListeHabitation, numAvenant);
    }

    public AvListeHabitationPK getAvListeHabitationPK() {
        return avListeHabitationPK;
    }

    public void setAvListeHabitationPK(AvListeHabitationPK avListeHabitationPK) {
        this.avListeHabitationPK = avListeHabitationPK;
    }

    public Date getDateAvListeHabitation() {
        return dateAvListeHabitation;
    }

    public void setDateAvListeHabitation(Date dateAvListeHabitation) {
        this.dateAvListeHabitation = dateAvListeHabitation;
    }

    public Avenant getAvenant() {
        return avenant;
    }

    public void setAvenant(Avenant avenant) {
        this.avenant = avenant;
    }

    public ListeHabitation getListeHabitation() {
        return listeHabitation;
    }

    public void setListeHabitation(ListeHabitation listeHabitation) {
        this.listeHabitation = listeHabitation;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (avListeHabitationPK != null ? avListeHabitationPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeHabitation)) {
            return false;
        }
        AvListeHabitation other = (AvListeHabitation) object;
        if ((this.avListeHabitationPK == null && other.avListeHabitationPK != null) || (this.avListeHabitationPK != null && !this.avListeHabitationPK.equals(other.avListeHabitationPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeHabitation[ avListeHabitationPK=" + avListeHabitationPK + " ]";
    }
    
}
