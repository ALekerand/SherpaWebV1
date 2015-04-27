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
@Table(name = "affilie_liste_affilie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AffilieListeAffilie.findAll", query = "SELECT a FROM AffilieListeAffilie a"),
    @NamedQuery(name = "AffilieListeAffilie.findByCodeAffilie", query = "SELECT a FROM AffilieListeAffilie a WHERE a.affilieListeAffiliePK.codeAffilie = :codeAffilie"),
    @NamedQuery(name = "AffilieListeAffilie.findByCodeListeAffilie", query = "SELECT a FROM AffilieListeAffilie a WHERE a.affilieListeAffiliePK.codeListeAffilie = :codeListeAffilie"),
    @NamedQuery(name = "AffilieListeAffilie.findByDateListeAffilie", query = "SELECT a FROM AffilieListeAffilie a WHERE a.dateListeAffilie = :dateListeAffilie")})
public class AffilieListeAffilie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AffilieListeAffiliePK affilieListeAffiliePK;
    @Column(name = "DATE_LISTE_AFFILIE")
    @Temporal(TemporalType.DATE)
    private Date dateListeAffilie;
    @JoinColumn(name = "CODE_LISTE_AFFILIE", referencedColumnName = "CODE_LISTE_AFFILIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeAffilie listeAffilie;
    @JoinColumn(name = "CODE_AFFILIE", referencedColumnName = "CODE_AFFILIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AffilieSante affilieSante;

    public AffilieListeAffilie() {
    }

    public AffilieListeAffilie(AffilieListeAffiliePK affilieListeAffiliePK) {
        this.affilieListeAffiliePK = affilieListeAffiliePK;
    }

    public AffilieListeAffilie(String codeAffilie, String codeListeAffilie) {
        this.affilieListeAffiliePK = new AffilieListeAffiliePK(codeAffilie, codeListeAffilie);
    }

    public AffilieListeAffiliePK getAffilieListeAffiliePK() {
        return affilieListeAffiliePK;
    }

    public void setAffilieListeAffiliePK(AffilieListeAffiliePK affilieListeAffiliePK) {
        this.affilieListeAffiliePK = affilieListeAffiliePK;
    }

    public Date getDateListeAffilie() {
        return dateListeAffilie;
    }

    public void setDateListeAffilie(Date dateListeAffilie) {
        this.dateListeAffilie = dateListeAffilie;
    }

    public ListeAffilie getListeAffilie() {
        return listeAffilie;
    }

    public void setListeAffilie(ListeAffilie listeAffilie) {
        this.listeAffilie = listeAffilie;
    }

    public AffilieSante getAffilieSante() {
        return affilieSante;
    }

    public void setAffilieSante(AffilieSante affilieSante) {
        this.affilieSante = affilieSante;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (affilieListeAffiliePK != null ? affilieListeAffiliePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AffilieListeAffilie)) {
            return false;
        }
        AffilieListeAffilie other = (AffilieListeAffilie) object;
        if ((this.affilieListeAffiliePK == null && other.affilieListeAffiliePK != null) || (this.affilieListeAffiliePK != null && !this.affilieListeAffiliePK.equals(other.affilieListeAffiliePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AffilieListeAffilie[ affilieListeAffiliePK=" + affilieListeAffiliePK + " ]";
    }
    
}
