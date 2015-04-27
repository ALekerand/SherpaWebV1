/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "medecin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Medecin.findAll", query = "SELECT m FROM Medecin m"),
    @NamedQuery(name = "Medecin.findByCodeMedecin", query = "SELECT m FROM Medecin m WHERE m.codeMedecin = :codeMedecin"),
    @NamedQuery(name = "Medecin.findByRaisonSociale", query = "SELECT m FROM Medecin m WHERE m.raisonSociale = :raisonSociale"),
    @NamedQuery(name = "Medecin.findByNom", query = "SELECT m FROM Medecin m WHERE m.nom = :nom"),
    @NamedQuery(name = "Medecin.findByPrenom", query = "SELECT m FROM Medecin m WHERE m.prenom = :prenom"),
    @NamedQuery(name = "Medecin.findByAdresse", query = "SELECT m FROM Medecin m WHERE m.adresse = :adresse"),
    @NamedQuery(name = "Medecin.findByTelFixe", query = "SELECT m FROM Medecin m WHERE m.telFixe = :telFixe"),
    @NamedQuery(name = "Medecin.findByTelCell", query = "SELECT m FROM Medecin m WHERE m.telCell = :telCell"),
    @NamedQuery(name = "Medecin.findByEmail", query = "SELECT m FROM Medecin m WHERE m.email = :email")})
public class Medecin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_MEDECIN")
    private String codeMedecin;
    @Size(max = 50)
    @Column(name = "RAISON_SOCIALE")
    private String raisonSociale;
    @Size(max = 30)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 60)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 15)
    @Column(name = "TEL_FIXE")
    private String telFixe;
    @Size(max = 15)
    @Column(name = "TEL_CELL")
    private String telCell;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Size(max = 60)
    @Column(name = "EMAIL")
    private String email;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeMedecin")
    private List<ActeMedical> acteMedicalList;

    public Medecin() {
    }

    public Medecin(String codeMedecin) {
        this.codeMedecin = codeMedecin;
    }

    public String getCodeMedecin() {
        return codeMedecin;
    }

    public void setCodeMedecin(String codeMedecin) {
        this.codeMedecin = codeMedecin;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelFixe() {
        return telFixe;
    }

    public void setTelFixe(String telFixe) {
        this.telFixe = telFixe;
    }

    public String getTelCell() {
        return telCell;
    }

    public void setTelCell(String telCell) {
        this.telCell = telCell;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @XmlTransient
    public List<ActeMedical> getActeMedicalList() {
        return acteMedicalList;
    }

    public void setActeMedicalList(List<ActeMedical> acteMedicalList) {
        this.acteMedicalList = acteMedicalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeMedecin != null ? codeMedecin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Medecin)) {
            return false;
        }
        Medecin other = (Medecin) object;
        if ((this.codeMedecin == null && other.codeMedecin != null) || (this.codeMedecin != null && !this.codeMedecin.equals(other.codeMedecin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Medecin[ codeMedecin=" + codeMedecin + " ]";
    }
    
}
