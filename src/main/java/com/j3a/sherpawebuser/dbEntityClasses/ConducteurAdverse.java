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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "conducteur_adverse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConducteurAdverse.findAll", query = "SELECT c FROM ConducteurAdverse c"),
    @NamedQuery(name = "ConducteurAdverse.findByCodeConducteurAdverse", query = "SELECT c FROM ConducteurAdverse c WHERE c.codeConducteurAdverse = :codeConducteurAdverse"),
    @NamedQuery(name = "ConducteurAdverse.findByNom", query = "SELECT c FROM ConducteurAdverse c WHERE c.nom = :nom"),
    @NamedQuery(name = "ConducteurAdverse.findByPrenom", query = "SELECT c FROM ConducteurAdverse c WHERE c.prenom = :prenom"),
    @NamedQuery(name = "ConducteurAdverse.findByNumPermis", query = "SELECT c FROM ConducteurAdverse c WHERE c.numPermis = :numPermis"),
    @NamedQuery(name = "ConducteurAdverse.findByCategoriePermis", query = "SELECT c FROM ConducteurAdverse c WHERE c.categoriePermis = :categoriePermis"),
    @NamedQuery(name = "ConducteurAdverse.findByValiditePermis", query = "SELECT c FROM ConducteurAdverse c WHERE c.validitePermis = :validitePermis"),
    @NamedQuery(name = "ConducteurAdverse.findByImmatriculation", query = "SELECT c FROM ConducteurAdverse c WHERE c.immatriculation = :immatriculation"),
    @NamedQuery(name = "ConducteurAdverse.findByMarque", query = "SELECT c FROM ConducteurAdverse c WHERE c.marque = :marque"),
    @NamedQuery(name = "ConducteurAdverse.findByTypeDuvehicule", query = "SELECT c FROM ConducteurAdverse c WHERE c.typeDuvehicule = :typeDuvehicule"),
    @NamedQuery(name = "ConducteurAdverse.findByAdresse", query = "SELECT c FROM ConducteurAdverse c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "ConducteurAdverse.findByTelFixe", query = "SELECT c FROM ConducteurAdverse c WHERE c.telFixe = :telFixe"),
    @NamedQuery(name = "ConducteurAdverse.findByTelCell", query = "SELECT c FROM ConducteurAdverse c WHERE c.telCell = :telCell"),
    @NamedQuery(name = "ConducteurAdverse.findByEmail", query = "SELECT c FROM ConducteurAdverse c WHERE c.email = :email")})
public class ConducteurAdverse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_CONDUCTEUR_ADVERSE")
    private String codeConducteurAdverse;
    @Size(max = 30)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Size(max = 10)
    @Column(name = "NUM_PERMIS")
    private String numPermis;
    @Size(max = 5)
    @Column(name = "CATEGORIE_PERMIS")
    private String categoriePermis;
    @Column(name = "VALIDITE_PERMIS")
    @Temporal(TemporalType.DATE)
    private Date validitePermis;
    @Size(max = 15)
    @Column(name = "IMMATRICULATION")
    private String immatriculation;
    @Size(max = 40)
    @Column(name = "MARQUE")
    private String marque;
    @Size(max = 100)
    @Column(name = "TYPE_DUVEHICULE")
    private String typeDuvehicule;
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
    @OneToMany(mappedBy = "codeConducteurAdverse")
    private List<PartieAdverse> partieAdverseList;

    public ConducteurAdverse() {
    }

    public ConducteurAdverse(String codeConducteurAdverse) {
        this.codeConducteurAdverse = codeConducteurAdverse;
    }

    public String getCodeConducteurAdverse() {
        return codeConducteurAdverse;
    }

    public void setCodeConducteurAdverse(String codeConducteurAdverse) {
        this.codeConducteurAdverse = codeConducteurAdverse;
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

    public String getNumPermis() {
        return numPermis;
    }

    public void setNumPermis(String numPermis) {
        this.numPermis = numPermis;
    }

    public String getCategoriePermis() {
        return categoriePermis;
    }

    public void setCategoriePermis(String categoriePermis) {
        this.categoriePermis = categoriePermis;
    }

    public Date getValiditePermis() {
        return validitePermis;
    }

    public void setValiditePermis(Date validitePermis) {
        this.validitePermis = validitePermis;
    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getTypeDuvehicule() {
        return typeDuvehicule;
    }

    public void setTypeDuvehicule(String typeDuvehicule) {
        this.typeDuvehicule = typeDuvehicule;
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
    public List<PartieAdverse> getPartieAdverseList() {
        return partieAdverseList;
    }

    public void setPartieAdverseList(List<PartieAdverse> partieAdverseList) {
        this.partieAdverseList = partieAdverseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeConducteurAdverse != null ? codeConducteurAdverse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConducteurAdverse)) {
            return false;
        }
        ConducteurAdverse other = (ConducteurAdverse) object;
        if ((this.codeConducteurAdverse == null && other.codeConducteurAdverse != null) || (this.codeConducteurAdverse != null && !this.codeConducteurAdverse.equals(other.codeConducteurAdverse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ConducteurAdverse[ codeConducteurAdverse=" + codeConducteurAdverse + " ]";
    }
    
}
