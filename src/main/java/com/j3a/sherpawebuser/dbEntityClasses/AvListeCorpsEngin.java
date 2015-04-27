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
@Table(name = "av_liste_corps_engin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvListeCorpsEngin.findAll", query = "SELECT a FROM AvListeCorpsEngin a"),
    @NamedQuery(name = "AvListeCorpsEngin.findByNumAvenant", query = "SELECT a FROM AvListeCorpsEngin a WHERE a.avListeCorpsEnginPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvListeCorpsEngin.findByCodeListeCorpsEngin", query = "SELECT a FROM AvListeCorpsEngin a WHERE a.avListeCorpsEnginPK.codeListeCorpsEngin = :codeListeCorpsEngin"),
    @NamedQuery(name = "AvListeCorpsEngin.findByDateAvListeCorpsEngin", query = "SELECT a FROM AvListeCorpsEngin a WHERE a.dateAvListeCorpsEngin = :dateAvListeCorpsEngin")})
public class AvListeCorpsEngin implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvListeCorpsEnginPK avListeCorpsEnginPK;
    @Column(name = "DATE_AV_LISTE_CORPS_ENGIN")
    @Temporal(TemporalType.DATE)
    private Date dateAvListeCorpsEngin;
    @JoinColumn(name = "CODE_LISTE_CORPS_ENGIN", referencedColumnName = "CODE_LISTE_CORPS_ENGIN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeCorpsEngin listeCorpsEngin;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;

    public AvListeCorpsEngin() {
    }

    public AvListeCorpsEngin(AvListeCorpsEnginPK avListeCorpsEnginPK) {
        this.avListeCorpsEnginPK = avListeCorpsEnginPK;
    }

    public AvListeCorpsEngin(String numAvenant, String codeListeCorpsEngin) {
        this.avListeCorpsEnginPK = new AvListeCorpsEnginPK(numAvenant, codeListeCorpsEngin);
    }

    public AvListeCorpsEnginPK getAvListeCorpsEnginPK() {
        return avListeCorpsEnginPK;
    }

    public void setAvListeCorpsEnginPK(AvListeCorpsEnginPK avListeCorpsEnginPK) {
        this.avListeCorpsEnginPK = avListeCorpsEnginPK;
    }

    public Date getDateAvListeCorpsEngin() {
        return dateAvListeCorpsEngin;
    }

    public void setDateAvListeCorpsEngin(Date dateAvListeCorpsEngin) {
        this.dateAvListeCorpsEngin = dateAvListeCorpsEngin;
    }

    public ListeCorpsEngin getListeCorpsEngin() {
        return listeCorpsEngin;
    }

    public void setListeCorpsEngin(ListeCorpsEngin listeCorpsEngin) {
        this.listeCorpsEngin = listeCorpsEngin;
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
        hash += (avListeCorpsEnginPK != null ? avListeCorpsEnginPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvListeCorpsEngin)) {
            return false;
        }
        AvListeCorpsEngin other = (AvListeCorpsEngin) object;
        if ((this.avListeCorpsEnginPK == null && other.avListeCorpsEnginPK != null) || (this.avListeCorpsEnginPK != null && !this.avListeCorpsEnginPK.equals(other.avListeCorpsEnginPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvListeCorpsEngin[ avListeCorpsEnginPK=" + avListeCorpsEnginPK + " ]";
    }
    
}
