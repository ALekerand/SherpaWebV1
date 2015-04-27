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
@Table(name = "profil_utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProfilUtilisateur.findAll", query = "SELECT p FROM ProfilUtilisateur p"),
    @NamedQuery(name = "ProfilUtilisateur.findByCodeUtilisateur", query = "SELECT p FROM ProfilUtilisateur p WHERE p.profilUtilisateurPK.codeUtilisateur = :codeUtilisateur"),
    @NamedQuery(name = "ProfilUtilisateur.findByCodeProfil", query = "SELECT p FROM ProfilUtilisateur p WHERE p.profilUtilisateurPK.codeProfil = :codeProfil"),
    @NamedQuery(name = "ProfilUtilisateur.findByDateProfilUtilisateur", query = "SELECT p FROM ProfilUtilisateur p WHERE p.dateProfilUtilisateur = :dateProfilUtilisateur")})
public class ProfilUtilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProfilUtilisateurPK profilUtilisateurPK;
    @Column(name = "DATE_PROFIL_UTILISATEUR")
    @Temporal(TemporalType.DATE)
    private Date dateProfilUtilisateur;
    @JoinColumn(name = "CODE_PROFIL", referencedColumnName = "CODE_PROFIL", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Profil profil;
    @JoinColumn(name = "CODE_UTILISATEUR", referencedColumnName = "CODE_UTILISATEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Utilisateur utilisateur;

    public ProfilUtilisateur() {
    }

    public ProfilUtilisateur(ProfilUtilisateurPK profilUtilisateurPK) {
        this.profilUtilisateurPK = profilUtilisateurPK;
    }

    public ProfilUtilisateur(String codeUtilisateur, String codeProfil) {
        this.profilUtilisateurPK = new ProfilUtilisateurPK(codeUtilisateur, codeProfil);
    }

    public ProfilUtilisateurPK getProfilUtilisateurPK() {
        return profilUtilisateurPK;
    }

    public void setProfilUtilisateurPK(ProfilUtilisateurPK profilUtilisateurPK) {
        this.profilUtilisateurPK = profilUtilisateurPK;
    }

    public Date getDateProfilUtilisateur() {
        return dateProfilUtilisateur;
    }

    public void setDateProfilUtilisateur(Date dateProfilUtilisateur) {
        this.dateProfilUtilisateur = dateProfilUtilisateur;
    }

    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (profilUtilisateurPK != null ? profilUtilisateurPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProfilUtilisateur)) {
            return false;
        }
        ProfilUtilisateur other = (ProfilUtilisateur) object;
        if ((this.profilUtilisateurPK == null && other.profilUtilisateurPK != null) || (this.profilUtilisateurPK != null && !this.profilUtilisateurPK.equals(other.profilUtilisateurPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ProfilUtilisateur[ profilUtilisateurPK=" + profilUtilisateurPK + " ]";
    }
    
}
