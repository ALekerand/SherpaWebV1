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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
@Table(name = "personne")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Personne.findAll", query = "SELECT p FROM Personne p"),
    @NamedQuery(name = "Personne.findByNumSouscripteur", query = "SELECT p FROM Personne p WHERE p.numSouscripteur = :numSouscripteur"),
    @NamedQuery(name = "Personne.findByDatePers", query = "SELECT p FROM Personne p WHERE p.datePers = :datePers"),
    @NamedQuery(name = "Personne.findByNomRaisonSociale", query = "SELECT p FROM Personne p WHERE p.nomRaisonSociale = :nomRaisonSociale"),
    @NamedQuery(name = "Personne.findByAdresseGeo", query = "SELECT p FROM Personne p WHERE p.adresseGeo = :adresseGeo"),
    @NamedQuery(name = "Personne.findByAdresse", query = "SELECT p FROM Personne p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Personne.findByTelephone", query = "SELECT p FROM Personne p WHERE p.telephone = :telephone"),
    @NamedQuery(name = "Personne.findByFax", query = "SELECT p FROM Personne p WHERE p.fax = :fax"),
    @NamedQuery(name = "Personne.findByEmail", query = "SELECT p FROM Personne p WHERE p.email = :email")})
public class Personne implements Serializable {
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personne")
    private List<Etre> etreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numSouscripteur")
    private List<Contrat> contratList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numSouscripteur")
    private List<Contact> contactList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personne")
    private Physique physique;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "personne")
    private List<PersonneNationalite> personneNationaliteList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "personne")
    private Morale morale;

    public Personne() {
    }

    public Personne(String numSouscripteur) {
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

    @XmlTransient
    public List<Etre> getEtreList() {
        return etreList;
    }

    public void setEtreList(List<Etre> etreList) {
        this.etreList = etreList;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    @XmlTransient
    public List<Contact> getContactList() {
        return contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public Physique getPhysique() {
        return physique;
    }

    public void setPhysique(Physique physique) {
        this.physique = physique;
    }

    @XmlTransient
    public List<PersonneNationalite> getPersonneNationaliteList() {
        return personneNationaliteList;
    }

    public void setPersonneNationaliteList(List<PersonneNationalite> personneNationaliteList) {
        this.personneNationaliteList = personneNationaliteList;
    }

    public Morale getMorale() {
        return morale;
    }

    public void setMorale(Morale morale) {
        this.morale = morale;
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
        if (!(object instanceof Personne)) {
            return false;
        }
        Personne other = (Personne) object;
        if ((this.numSouscripteur == null && other.numSouscripteur != null) || (this.numSouscripteur != null && !this.numSouscripteur.equals(other.numSouscripteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Personne[ numSouscripteur=" + numSouscripteur + " ]";
    }
    
}
