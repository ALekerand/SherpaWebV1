/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "utilisateur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Utilisateur.findAll", query = "SELECT u FROM Utilisateur u"),
    @NamedQuery(name = "Utilisateur.findByCodeUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.codeUtilisateur = :codeUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByMatricule", query = "SELECT u FROM Utilisateur u WHERE u.matricule = :matricule"),
    @NamedQuery(name = "Utilisateur.findByNomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.nomUtilisateur = :nomUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByPrenomUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.prenomUtilisateur = :prenomUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByDateCreationUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.dateCreationUtilisateur = :dateCreationUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByLoginUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.loginUtilisateur = :loginUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByMotPasse", query = "SELECT u FROM Utilisateur u WHERE u.motPasse = :motPasse"),
    @NamedQuery(name = "Utilisateur.findByMailUtilisateur", query = "SELECT u FROM Utilisateur u WHERE u.mailUtilisateur = :mailUtilisateur"),
    @NamedQuery(name = "Utilisateur.findByActivite", query = "SELECT u FROM Utilisateur u WHERE u.activite = :activite")})
public class Utilisateur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_UTILISATEUR")
    private String codeUtilisateur;
    @Size(max = 20)
    @Column(name = "MATRICULE")
    private String matricule;
    @Size(max = 25)
    @Column(name = "NOM_UTILISATEUR")
    private String nomUtilisateur;
    @Size(max = 60)
    @Column(name = "PRENOM_UTILISATEUR")
    private String prenomUtilisateur;
    @Column(name = "DATE_CREATION_UTILISATEUR")
    @Temporal(TemporalType.DATE)
    private Date dateCreationUtilisateur;
    @Size(max = 30)
    @Column(name = "LOGIN_UTILISATEUR")
    private String loginUtilisateur;
    @Size(max = 10)
    @Column(name = "MOT_PASSE")
    private String motPasse;
    @Size(max = 50)
    @Column(name = "MAIL_UTILISATEUR")
    private String mailUtilisateur;
    @Column(name = "ACTIVITE")
    private Integer activite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "utilisateur")
    private List<ProfilUtilisateur> profilUtilisateurList;
    @JoinColumn(name = "CODE_POINT_VENTE", referencedColumnName = "CODE_POINT_VENTE")
    @ManyToOne(optional = false)
    private PointVente codePointVente;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeUtilisateur")
    private List<Avenant> avenantList;

    public Utilisateur() {
    }

    public Utilisateur(String codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public String getCodeUtilisateur() {
        return codeUtilisateur;
    }

    public void setCodeUtilisateur(String codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public String getMatricule() {
        return matricule;
    }

    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }

    public String getNomUtilisateur() {
        return nomUtilisateur;
    }

    public void setNomUtilisateur(String nomUtilisateur) {
        this.nomUtilisateur = nomUtilisateur;
    }

    public String getPrenomUtilisateur() {
        return prenomUtilisateur;
    }

    public void setPrenomUtilisateur(String prenomUtilisateur) {
        this.prenomUtilisateur = prenomUtilisateur;
    }

    public Date getDateCreationUtilisateur() {
        return dateCreationUtilisateur;
    }

    public void setDateCreationUtilisateur(Date dateCreationUtilisateur) {
        this.dateCreationUtilisateur = dateCreationUtilisateur;
    }

    public String getLoginUtilisateur() {
        return loginUtilisateur;
    }

    public void setLoginUtilisateur(String loginUtilisateur) {
        this.loginUtilisateur = loginUtilisateur;
    }

    public String getMotPasse() {
        return motPasse;
    }

    public void setMotPasse(String motPasse) {
        this.motPasse = motPasse;
    }

    public String getMailUtilisateur() {
        return mailUtilisateur;
    }

    public void setMailUtilisateur(String mailUtilisateur) {
        this.mailUtilisateur = mailUtilisateur;
    }

    public Integer getActivite() {
        return activite;
    }

    public void setActivite(Integer activite) {
        this.activite = activite;
    }

    @XmlTransient
    public List<ProfilUtilisateur> getProfilUtilisateurList() {
        return profilUtilisateurList;
    }

    public void setProfilUtilisateurList(List<ProfilUtilisateur> profilUtilisateurList) {
        this.profilUtilisateurList = profilUtilisateurList;
    }

    public PointVente getCodePointVente() {
        return codePointVente;
    }

    public void setCodePointVente(PointVente codePointVente) {
        this.codePointVente = codePointVente;
    }

    @XmlTransient
    public List<Avenant> getAvenantList() {
        return avenantList;
    }

    public void setAvenantList(List<Avenant> avenantList) {
        this.avenantList = avenantList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeUtilisateur != null ? codeUtilisateur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Utilisateur)) {
            return false;
        }
        Utilisateur other = (Utilisateur) object;
        if ((this.codeUtilisateur == null && other.codeUtilisateur != null) || (this.codeUtilisateur != null && !this.codeUtilisateur.equals(other.codeUtilisateur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Utilisateur[ codeUtilisateur=" + codeUtilisateur + " ]";
    }
    
}
