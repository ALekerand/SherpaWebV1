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
@Table(name = "av_trafic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AvTrafic.findAll", query = "SELECT a FROM AvTrafic a"),
    @NamedQuery(name = "AvTrafic.findByNumAvenant", query = "SELECT a FROM AvTrafic a WHERE a.avTraficPK.numAvenant = :numAvenant"),
    @NamedQuery(name = "AvTrafic.findByCodeListeTrafic", query = "SELECT a FROM AvTrafic a WHERE a.avTraficPK.codeListeTrafic = :codeListeTrafic"),
    @NamedQuery(name = "AvTrafic.findByDateAvTrafic", query = "SELECT a FROM AvTrafic a WHERE a.dateAvTrafic = :dateAvTrafic")})
public class AvTrafic implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AvTraficPK avTraficPK;
    @Column(name = "DATE_AV_TRAFIC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvTrafic;
    @JoinColumn(name = "CODE_LISTE_TRAFIC", referencedColumnName = "CODE_LISTE_TRAFIC", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeTrafic listeTrafic;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Avenant avenant;

    public AvTrafic() {
    }

    public AvTrafic(AvTraficPK avTraficPK) {
        this.avTraficPK = avTraficPK;
    }

    public AvTrafic(String numAvenant, String codeListeTrafic) {
        this.avTraficPK = new AvTraficPK(numAvenant, codeListeTrafic);
    }

    public AvTraficPK getAvTraficPK() {
        return avTraficPK;
    }

    public void setAvTraficPK(AvTraficPK avTraficPK) {
        this.avTraficPK = avTraficPK;
    }

    public Date getDateAvTrafic() {
        return dateAvTrafic;
    }

    public void setDateAvTrafic(Date dateAvTrafic) {
        this.dateAvTrafic = dateAvTrafic;
    }

    public ListeTrafic getListeTrafic() {
        return listeTrafic;
    }

    public void setListeTrafic(ListeTrafic listeTrafic) {
        this.listeTrafic = listeTrafic;
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
        hash += (avTraficPK != null ? avTraficPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AvTrafic)) {
            return false;
        }
        AvTrafic other = (AvTrafic) object;
        if ((this.avTraficPK == null && other.avTraficPK != null) || (this.avTraficPK != null && !this.avTraficPK.equals(other.avTraficPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AvTrafic[ avTraficPK=" + avTraficPK + " ]";
    }
    
}
