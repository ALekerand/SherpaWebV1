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
@Table(name = "apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Apporteur.findAll", query = "SELECT a FROM Apporteur a"),
    @NamedQuery(name = "Apporteur.findByCodeApporteur", query = "SELECT a FROM Apporteur a WHERE a.codeApporteur = :codeApporteur"),
    @NamedQuery(name = "Apporteur.findByLibelleApporteur", query = "SELECT a FROM Apporteur a WHERE a.libelleApporteur = :libelleApporteur"),
    @NamedQuery(name = "Apporteur.findByContactApporteur", query = "SELECT a FROM Apporteur a WHERE a.contactApporteur = :contactApporteur"),
    @NamedQuery(name = "Apporteur.findByAdresseApporteur", query = "SELECT a FROM Apporteur a WHERE a.adresseApporteur = :adresseApporteur"),
    @NamedQuery(name = "Apporteur.findByDateCrea", query = "SELECT a FROM Apporteur a WHERE a.dateCrea = :dateCrea")})
public class Apporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_APPORTEUR")
    private String codeApporteur;
    @Size(max = 100)
    @Column(name = "LIBELLE_APPORTEUR")
    private String libelleApporteur;
    @Size(max = 16)
    @Column(name = "CONTACT_APPORTEUR")
    private String contactApporteur;
    @Size(max = 50)
    @Column(name = "ADRESSE_APPORTEUR")
    private String adresseApporteur;
    @Column(name = "DATE_CREA")
    @Temporal(TemporalType.DATE)
    private Date dateCrea;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurAliment> apporteurAlimentList;
    @OneToMany(mappedBy = "codeApporteur")
    private List<Contrat> contratList;
    @JoinColumn(name = "ID_TYPE", referencedColumnName = "ID_TYPE")
    @ManyToOne(optional = false)
    private TypeApporteur idType;
    @JoinColumn(name = "CODE_COMPTE_APP", referencedColumnName = "CODE_COMPTE_APP")
    @ManyToOne
    private CompteApporteur codeCompteApp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurCorpsEngin> apporteurCorpsEnginList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurVehicule> apporteurVehiculeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurNta> apporteurNtaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurAdherent> apporteurAdherentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurHabitation> apporteurHabitationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurGestionConfiee> apporteurGestionConfieeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeApporteur")
    private List<AffaireApporteur> affaireApporteurList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "apporteur")
    private List<ApporteurAssure> apporteurAssureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeApporteur")
    private List<CompteApporteur> compteApporteurList;

    public Apporteur() {
    }

    public Apporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(String codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    public String getLibelleApporteur() {
        return libelleApporteur;
    }

    public void setLibelleApporteur(String libelleApporteur) {
        this.libelleApporteur = libelleApporteur;
    }

    public String getContactApporteur() {
        return contactApporteur;
    }

    public void setContactApporteur(String contactApporteur) {
        this.contactApporteur = contactApporteur;
    }

    public String getAdresseApporteur() {
        return adresseApporteur;
    }

    public void setAdresseApporteur(String adresseApporteur) {
        this.adresseApporteur = adresseApporteur;
    }

    public Date getDateCrea() {
        return dateCrea;
    }

    public void setDateCrea(Date dateCrea) {
        this.dateCrea = dateCrea;
    }

    @XmlTransient
    public List<ApporteurAliment> getApporteurAlimentList() {
        return apporteurAlimentList;
    }

    public void setApporteurAlimentList(List<ApporteurAliment> apporteurAlimentList) {
        this.apporteurAlimentList = apporteurAlimentList;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    public TypeApporteur getIdType() {
        return idType;
    }

    public void setIdType(TypeApporteur idType) {
        this.idType = idType;
    }

    public CompteApporteur getCodeCompteApp() {
        return codeCompteApp;
    }

    public void setCodeCompteApp(CompteApporteur codeCompteApp) {
        this.codeCompteApp = codeCompteApp;
    }

    @XmlTransient
    public List<ApporteurCorpsEngin> getApporteurCorpsEnginList() {
        return apporteurCorpsEnginList;
    }

    public void setApporteurCorpsEnginList(List<ApporteurCorpsEngin> apporteurCorpsEnginList) {
        this.apporteurCorpsEnginList = apporteurCorpsEnginList;
    }

    @XmlTransient
    public List<ApporteurVehicule> getApporteurVehiculeList() {
        return apporteurVehiculeList;
    }

    public void setApporteurVehiculeList(List<ApporteurVehicule> apporteurVehiculeList) {
        this.apporteurVehiculeList = apporteurVehiculeList;
    }

    @XmlTransient
    public List<ApporteurNta> getApporteurNtaList() {
        return apporteurNtaList;
    }

    public void setApporteurNtaList(List<ApporteurNta> apporteurNtaList) {
        this.apporteurNtaList = apporteurNtaList;
    }

    @XmlTransient
    public List<ApporteurAdherent> getApporteurAdherentList() {
        return apporteurAdherentList;
    }

    public void setApporteurAdherentList(List<ApporteurAdherent> apporteurAdherentList) {
        this.apporteurAdherentList = apporteurAdherentList;
    }

    @XmlTransient
    public List<ApporteurHabitation> getApporteurHabitationList() {
        return apporteurHabitationList;
    }

    public void setApporteurHabitationList(List<ApporteurHabitation> apporteurHabitationList) {
        this.apporteurHabitationList = apporteurHabitationList;
    }

    @XmlTransient
    public List<ApporteurGestionConfiee> getApporteurGestionConfieeList() {
        return apporteurGestionConfieeList;
    }

    public void setApporteurGestionConfieeList(List<ApporteurGestionConfiee> apporteurGestionConfieeList) {
        this.apporteurGestionConfieeList = apporteurGestionConfieeList;
    }

    @XmlTransient
    public List<AffaireApporteur> getAffaireApporteurList() {
        return affaireApporteurList;
    }

    public void setAffaireApporteurList(List<AffaireApporteur> affaireApporteurList) {
        this.affaireApporteurList = affaireApporteurList;
    }

    @XmlTransient
    public List<ApporteurAssure> getApporteurAssureList() {
        return apporteurAssureList;
    }

    public void setApporteurAssureList(List<ApporteurAssure> apporteurAssureList) {
        this.apporteurAssureList = apporteurAssureList;
    }

    @XmlTransient
    public List<CompteApporteur> getCompteApporteurList() {
        return compteApporteurList;
    }

    public void setCompteApporteurList(List<CompteApporteur> compteApporteurList) {
        this.compteApporteurList = compteApporteurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeApporteur != null ? codeApporteur.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Apporteur)) {
            return false;
        }
        Apporteur other = (Apporteur) object;
        if ((this.codeApporteur == null && other.codeApporteur != null) || (this.codeApporteur != null && !this.codeApporteur.equals(other.codeApporteur))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Apporteur[ codeApporteur=" + codeApporteur + " ]";
    }
    
}
