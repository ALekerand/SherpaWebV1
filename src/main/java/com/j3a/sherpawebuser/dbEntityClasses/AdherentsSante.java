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
@Table(name = "adherents_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AdherentsSante.findAll", query = "SELECT a FROM AdherentsSante a"),
    @NamedQuery(name = "AdherentsSante.findByCodeAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.codeAdherent = :codeAdherent"),
    @NamedQuery(name = "AdherentsSante.findByNomAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.nomAdherent = :nomAdherent"),
    @NamedQuery(name = "AdherentsSante.findByPrenomAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.prenomAdherent = :prenomAdherent"),
    @NamedQuery(name = "AdherentsSante.findBySexeAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.sexeAdherent = :sexeAdherent"),
    @NamedQuery(name = "AdherentsSante.findByAdresseAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.adresseAdherent = :adresseAdherent"),
    @NamedQuery(name = "AdherentsSante.findByNaissAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.naissAdherent = :naissAdherent"),
    @NamedQuery(name = "AdherentsSante.findByLocalisationAdherent", query = "SELECT a FROM AdherentsSante a WHERE a.localisationAdherent = :localisationAdherent"),
    @NamedQuery(name = "AdherentsSante.findByStatutadhsante", query = "SELECT a FROM AdherentsSante a WHERE a.statutadhsante = :statutadhsante")})
public class AdherentsSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_ADHERENT")
    private String codeAdherent;
    @Size(max = 60)
    @Column(name = "NOM_ADHERENT")
    private String nomAdherent;
    @Size(max = 80)
    @Column(name = "PRENOM_ADHERENT")
    private String prenomAdherent;
    @Size(max = 9)
    @Column(name = "SEXE_ADHERENT")
    private String sexeAdherent;
    @Size(max = 80)
    @Column(name = "ADRESSE_ADHERENT")
    private String adresseAdherent;
    @Column(name = "NAISS_ADHERENT")
    @Temporal(TemporalType.DATE)
    private Date naissAdherent;
    @Size(max = 60)
    @Column(name = "LOCALISATION_ADHERENT")
    private String localisationAdherent;
    @Size(max = 20)
    @Column(name = "STATUTADHSANTE")
    private String statutadhsante;
    @OneToMany(mappedBy = "codeAdherent")
    private List<ListeAffilie> listeAffilieList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @JoinColumn(name = "CODE_COLLEGE", referencedColumnName = "CODE_COLLEGE")
    @ManyToOne(optional = false)
    private CollegeSante codeCollege;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adherentsSante")
    private List<ApporteurAdherent> apporteurAdherentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "adherentsSante")
    private List<ListeAdherentSante> listeAdherentSanteList;

    public AdherentsSante() {
    }

    public AdherentsSante(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    public String getCodeAdherent() {
        return codeAdherent;
    }

    public void setCodeAdherent(String codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    public String getNomAdherent() {
        return nomAdherent;
    }

    public void setNomAdherent(String nomAdherent) {
        this.nomAdherent = nomAdherent;
    }

    public String getPrenomAdherent() {
        return prenomAdherent;
    }

    public void setPrenomAdherent(String prenomAdherent) {
        this.prenomAdherent = prenomAdherent;
    }

    public String getSexeAdherent() {
        return sexeAdherent;
    }

    public void setSexeAdherent(String sexeAdherent) {
        this.sexeAdherent = sexeAdherent;
    }

    public String getAdresseAdherent() {
        return adresseAdherent;
    }

    public void setAdresseAdherent(String adresseAdherent) {
        this.adresseAdherent = adresseAdherent;
    }

    public Date getNaissAdherent() {
        return naissAdherent;
    }

    public void setNaissAdherent(Date naissAdherent) {
        this.naissAdherent = naissAdherent;
    }

    public String getLocalisationAdherent() {
        return localisationAdherent;
    }

    public void setLocalisationAdherent(String localisationAdherent) {
        this.localisationAdherent = localisationAdherent;
    }

    public String getStatutadhsante() {
        return statutadhsante;
    }

    public void setStatutadhsante(String statutadhsante) {
        this.statutadhsante = statutadhsante;
    }

    @XmlTransient
    public List<ListeAffilie> getListeAffilieList() {
        return listeAffilieList;
    }

    public void setListeAffilieList(List<ListeAffilie> listeAffilieList) {
        this.listeAffilieList = listeAffilieList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public CollegeSante getCodeCollege() {
        return codeCollege;
    }

    public void setCodeCollege(CollegeSante codeCollege) {
        this.codeCollege = codeCollege;
    }

    @XmlTransient
    public List<ApporteurAdherent> getApporteurAdherentList() {
        return apporteurAdherentList;
    }

    public void setApporteurAdherentList(List<ApporteurAdherent> apporteurAdherentList) {
        this.apporteurAdherentList = apporteurAdherentList;
    }

    @XmlTransient
    public List<ListeAdherentSante> getListeAdherentSanteList() {
        return listeAdherentSanteList;
    }

    public void setListeAdherentSanteList(List<ListeAdherentSante> listeAdherentSanteList) {
        this.listeAdherentSanteList = listeAdherentSanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAdherent != null ? codeAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AdherentsSante)) {
            return false;
        }
        AdherentsSante other = (AdherentsSante) object;
        if ((this.codeAdherent == null && other.codeAdherent != null) || (this.codeAdherent != null && !this.codeAdherent.equals(other.codeAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AdherentsSante[ codeAdherent=" + codeAdherent + " ]";
    }
    
}
