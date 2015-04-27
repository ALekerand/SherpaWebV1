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
@Table(name = "physique")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Physique.findAll", query = "SELECT p FROM Physique p"),
    @NamedQuery(name = "Physique.findByNumSouscripteur", query = "SELECT p FROM Physique p WHERE p.numSouscripteur = :numSouscripteur"),
    @NamedQuery(name = "Physique.findByDatePers", query = "SELECT p FROM Physique p WHERE p.datePers = :datePers"),
    @NamedQuery(name = "Physique.findByNomRaisonSociale", query = "SELECT p FROM Physique p WHERE p.nomRaisonSociale = :nomRaisonSociale"),
    @NamedQuery(name = "Physique.findByPrenomPers", query = "SELECT p FROM Physique p WHERE p.prenomPers = :prenomPers"),
    @NamedQuery(name = "Physique.findByDateNaissPers", query = "SELECT p FROM Physique p WHERE p.dateNaissPers = :dateNaissPers"),
    @NamedQuery(name = "Physique.findByLieuNaissPers", query = "SELECT p FROM Physique p WHERE p.lieuNaissPers = :lieuNaissPers"),
    @NamedQuery(name = "Physique.findBySituationMatPers", query = "SELECT p FROM Physique p WHERE p.situationMatPers = :situationMatPers"),
    @NamedQuery(name = "Physique.findByNumPiecePers", query = "SELECT p FROM Physique p WHERE p.numPiecePers = :numPiecePers"),
    @NamedQuery(name = "Physique.findByTitre", query = "SELECT p FROM Physique p WHERE p.titre = :titre"),
    @NamedQuery(name = "Physique.findByProfession", query = "SELECT p FROM Physique p WHERE p.profession = :profession"),
    @NamedQuery(name = "Physique.findByCategorieProfessionnelle", query = "SELECT p FROM Physique p WHERE p.categorieProfessionnelle = :categorieProfessionnelle"),
    @NamedQuery(name = "Physique.findByTypePiece", query = "SELECT p FROM Physique p WHERE p.typePiece = :typePiece"),
    @NamedQuery(name = "Physique.findByAdresseGeo", query = "SELECT p FROM Physique p WHERE p.adresseGeo = :adresseGeo"),
    @NamedQuery(name = "Physique.findByAdresse", query = "SELECT p FROM Physique p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "Physique.findByTelephone", query = "SELECT p FROM Physique p WHERE p.telephone = :telephone"),
    @NamedQuery(name = "Physique.findByFax", query = "SELECT p FROM Physique p WHERE p.fax = :fax"),
    @NamedQuery(name = "Physique.findByEmail", query = "SELECT p FROM Physique p WHERE p.email = :email")})
public class Physique implements Serializable {
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
    @Column(name = "PRENOM_PERS")
    private String prenomPers;
    @Column(name = "DATE_NAISS_PERS")
    @Temporal(TemporalType.DATE)
    private Date dateNaissPers;
    @Size(max = 30)
    @Column(name = "LIEU_NAISS_PERS")
    private String lieuNaissPers;
    @Size(max = 12)
    @Column(name = "SITUATION_MAT_PERS")
    private String situationMatPers;
    @Size(max = 15)
    @Column(name = "NUM_PIECE_PERS")
    private String numPiecePers;
    @Size(max = 50)
    @Column(name = "TITRE")
    private String titre;
    @Size(max = 50)
    @Column(name = "PROFESSION")
    private String profession;
    @Size(max = 50)
    @Column(name = "CATEGORIE_PROFESSIONNELLE")
    private String categorieProfessionnelle;
    @Size(max = 15)
    @Column(name = "TYPE_PIECE")
    private String typePiece;
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
    @JoinColumn(name = "CODE_SEXE", referencedColumnName = "CODE_SEXE")
    @ManyToOne(optional = false)
    private Sexe codeSexe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numSouscripteur")
    private List<Permis> permisList;

    public Physique() {
    }

    public Physique(String numSouscripteur) {
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

    public String getPrenomPers() {
        return prenomPers;
    }

    public void setPrenomPers(String prenomPers) {
        this.prenomPers = prenomPers;
    }

    public Date getDateNaissPers() {
        return dateNaissPers;
    }

    public void setDateNaissPers(Date dateNaissPers) {
        this.dateNaissPers = dateNaissPers;
    }

    public String getLieuNaissPers() {
        return lieuNaissPers;
    }

    public void setLieuNaissPers(String lieuNaissPers) {
        this.lieuNaissPers = lieuNaissPers;
    }

    public String getSituationMatPers() {
        return situationMatPers;
    }

    public void setSituationMatPers(String situationMatPers) {
        this.situationMatPers = situationMatPers;
    }

    public String getNumPiecePers() {
        return numPiecePers;
    }

    public void setNumPiecePers(String numPiecePers) {
        this.numPiecePers = numPiecePers;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getCategorieProfessionnelle() {
        return categorieProfessionnelle;
    }

    public void setCategorieProfessionnelle(String categorieProfessionnelle) {
        this.categorieProfessionnelle = categorieProfessionnelle;
    }

    public String getTypePiece() {
        return typePiece;
    }

    public void setTypePiece(String typePiece) {
        this.typePiece = typePiece;
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

    public Sexe getCodeSexe() {
        return codeSexe;
    }

    public void setCodeSexe(Sexe codeSexe) {
        this.codeSexe = codeSexe;
    }

    @XmlTransient
    public List<Permis> getPermisList() {
        return permisList;
    }

    public void setPermisList(List<Permis> permisList) {
        this.permisList = permisList;
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
        if (!(object instanceof Physique)) {
            return false;
        }
        Physique other = (Physique) object;
        if ((this.numSouscripteur == null && other.numSouscripteur != null) || (this.numSouscripteur != null && !this.numSouscripteur.equals(other.numSouscripteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Physique[ numSouscripteur=" + numSouscripteur + " ]";
    }
    
}
