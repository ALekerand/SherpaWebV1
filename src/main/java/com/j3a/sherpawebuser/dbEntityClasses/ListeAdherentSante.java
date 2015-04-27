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
@Table(name = "liste_adherent_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeAdherentSante.findAll", query = "SELECT l FROM ListeAdherentSante l"),
    @NamedQuery(name = "ListeAdherentSante.findByCodeListeAdherent", query = "SELECT l FROM ListeAdherentSante l WHERE l.listeAdherentSantePK.codeListeAdherent = :codeListeAdherent"),
    @NamedQuery(name = "ListeAdherentSante.findByCodeAdherent", query = "SELECT l FROM ListeAdherentSante l WHERE l.listeAdherentSantePK.codeAdherent = :codeAdherent"),
    @NamedQuery(name = "ListeAdherentSante.findByDateLas", query = "SELECT l FROM ListeAdherentSante l WHERE l.dateLas = :dateLas")})
public class ListeAdherentSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ListeAdherentSantePK listeAdherentSantePK;
    @Column(name = "DATE_LAS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLas;
    @JoinColumn(name = "CODE_ADHERENT", referencedColumnName = "CODE_ADHERENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AdherentsSante adherentsSante;
    @JoinColumn(name = "CODE_LISTE_ADHERENT", referencedColumnName = "CODE_LISTE_ADHERENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ListeAdherent listeAdherent;

    public ListeAdherentSante() {
    }

    public ListeAdherentSante(ListeAdherentSantePK listeAdherentSantePK) {
        this.listeAdherentSantePK = listeAdherentSantePK;
    }

    public ListeAdherentSante(String codeListeAdherent, String codeAdherent) {
        this.listeAdherentSantePK = new ListeAdherentSantePK(codeListeAdherent, codeAdherent);
    }

    public ListeAdherentSantePK getListeAdherentSantePK() {
        return listeAdherentSantePK;
    }

    public void setListeAdherentSantePK(ListeAdherentSantePK listeAdherentSantePK) {
        this.listeAdherentSantePK = listeAdherentSantePK;
    }

    public Date getDateLas() {
        return dateLas;
    }

    public void setDateLas(Date dateLas) {
        this.dateLas = dateLas;
    }

    public AdherentsSante getAdherentsSante() {
        return adherentsSante;
    }

    public void setAdherentsSante(AdherentsSante adherentsSante) {
        this.adherentsSante = adherentsSante;
    }

    public ListeAdherent getListeAdherent() {
        return listeAdherent;
    }

    public void setListeAdherent(ListeAdherent listeAdherent) {
        this.listeAdherent = listeAdherent;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listeAdherentSantePK != null ? listeAdherentSantePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeAdherentSante)) {
            return false;
        }
        ListeAdherentSante other = (ListeAdherentSante) object;
        if ((this.listeAdherentSantePK == null && other.listeAdherentSantePK != null) || (this.listeAdherentSantePK != null && !this.listeAdherentSantePK.equals(other.listeAdherentSantePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeAdherentSante[ listeAdherentSantePK=" + listeAdherentSantePK + " ]";
    }
    
}
