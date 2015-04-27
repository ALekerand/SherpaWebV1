/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "morale")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Morale.findAll", query = "SELECT m FROM Morale m"),
    @NamedQuery(name = "Morale.findByNumSouscripteur", query = "SELECT m FROM Morale m WHERE m.numSouscripteur = :numSouscripteur"),
    @NamedQuery(name = "Morale.findByDatePers", query = "SELECT m FROM Morale m WHERE m.datePers = :datePers"),
    @NamedQuery(name = "Morale.findByNomRaisonSociale", query = "SELECT m FROM Morale m WHERE m.nomRaisonSociale = :nomRaisonSociale"),
    @NamedQuery(name = "Morale.findByDirigeant", query = "SELECT m FROM Morale m WHERE m.dirigeant = :dirigeant"),
    @NamedQuery(name = "Morale.findByNumCc", query = "SELECT m FROM Morale m WHERE m.numCc = :numCc"),
    @NamedQuery(name = "Morale.findByNumRc", query = "SELECT m FROM Morale m WHERE m.numRc = :numRc"),
    @NamedQuery(name = "Morale.findByMailDirigeant", query = "SELECT m FROM Morale m WHERE m.mailDirigeant = :mailDirigeant"),
    @NamedQuery(name = "Morale.findByAdresseGeo", query = "SELECT m FROM Morale m WHERE m.adresseGeo = :adresseGeo"),
    @NamedQuery(name = "Morale.findByAdresse", query = "SELECT m FROM Morale m WHERE m.adresse = :adresse"),
    @NamedQuery(name = "Morale.findByTelephone", query = "SELECT m FROM Morale m WHERE m.telephone = :telephone"),
    @NamedQuery(name = "Morale.findByFax", query = "SELECT m FROM Morale m WHERE m.fax = :fax"),
    @NamedQuery(name = "Morale.findByEmail", query = "SELECT m FROM Morale m WHERE m.email = :email")})
public class Morale implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "NUM_SOUSCRIPTEUR")
    private String numSouscripteur;
    @Column(name = "DATE_PERS")
    @Temporal(TemporalType.DATE)
    private Date datePers;
    @Size(max = 50)
    @Column(name = "NOM_RAISON_SOCIALE")
    private String nomRaisonSociale;
    @Size(max = 70)
    @Column(name = "DIRIGEANT")
    private String dirigeant;
    @Size(max = 16)
    @Column(name = "NUM_CC")
    private String numCc;
    @Size(max = 16)
    @Column(name = "NUM_RC")
    private String numRc;
    @Size(max = 40)
    @Column(name = "MAIL_DIRIGEANT")
    private String mailDirigeant;
    @Size(max = 75)
    @Column(name = "ADRESSE_GEO")
    private String adresseGeo;
    @Size(max = 60)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 16)
    @Column(name = "TELEPHONE")
    private String telephone;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 16)
    @Column(name = "FAX")
    private String fax;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "EMAIL")
    private String email;
    @JoinColumn(name = "NUM_SOUSCRIPTEUR", referencedColumnName = "NUM_SOUSCRIPTEUR", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Personne personne;

    public Morale() {
    }

    public Morale(String numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    public String getNumSouscripteur() {
        return numSouscripteur;
    }

    public void setNumSouscripteur(String numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    public Date getDatePers() {
        return datePers;
    }

    public void setDatePers(Date datePers) {
        this.datePers = datePers;
    }

    public String getNomRaisonSociale() {
        return nomRaisonSociale;
    }

    public void setNomRaisonSociale(String nomRaisonSociale) {
        this.nomRaisonSociale = nomRaisonSociale;
    }

    public String getDirigeant() {
        return dirigeant;
    }

    public void setDirigeant(String dirigeant) {
        this.dirigeant = dirigeant;
    }

    public String getNumCc() {
        return numCc;
    }

    public void setNumCc(String numCc) {
        this.numCc = numCc;
    }

    public String getNumRc() {
        return numRc;
    }

    public void setNumRc(String numRc) {
        this.numRc = numRc;
    }

    public String getMailDirigeant() {
        return mailDirigeant;
    }

    public void setMailDirigeant(String mailDirigeant) {
        this.mailDirigeant = mailDirigeant;
    }

    public String getAdresseGeo() {
        return adresseGeo;
    }

    public void setAdresseGeo(String adresseGeo) {
        this.adresseGeo = adresseGeo;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numSouscripteur != null ? numSouscripteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Morale)) {
            return false;
        }
        Morale other = (Morale) object;
        if ((this.numSouscripteur == null && other.numSouscripteur != null) || (this.numSouscripteur != null && !this.numSouscripteur.equals(other.numSouscripteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Morale[ numSouscripteur=" + numSouscripteur + " ]";
    }
    
}
