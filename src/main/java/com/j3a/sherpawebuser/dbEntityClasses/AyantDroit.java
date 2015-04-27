/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ayant_droit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AyantDroit.findAll", query = "SELECT a FROM AyantDroit a"),
    @NamedQuery(name = "AyantDroit.findByCodeAyantDroit", query = "SELECT a FROM AyantDroit a WHERE a.codeAyantDroit = :codeAyantDroit"),
    @NamedQuery(name = "AyantDroit.findByNom", query = "SELECT a FROM AyantDroit a WHERE a.nom = :nom"),
    @NamedQuery(name = "AyantDroit.findByPrenom", query = "SELECT a FROM AyantDroit a WHERE a.prenom = :prenom"),
    @NamedQuery(name = "AyantDroit.findByAge", query = "SELECT a FROM AyantDroit a WHERE a.age = :age"),
    @NamedQuery(name = "AyantDroit.findBySexe", query = "SELECT a FROM AyantDroit a WHERE a.sexe = :sexe"),
    @NamedQuery(name = "AyantDroit.findByMontantPrejudice", query = "SELECT a FROM AyantDroit a WHERE a.montantPrejudice = :montantPrejudice"),
    @NamedQuery(name = "AyantDroit.findByEtatIndemniser", query = "SELECT a FROM AyantDroit a WHERE a.etatIndemniser = :etatIndemniser"),
    @NamedQuery(name = "AyantDroit.findByTypeAyantDroit", query = "SELECT a FROM AyantDroit a WHERE a.typeAyantDroit = :typeAyantDroit"),
    @NamedQuery(name = "AyantDroit.findByAdresseAyantDroit", query = "SELECT a FROM AyantDroit a WHERE a.adresseAyantDroit = :adresseAyantDroit"),
    @NamedQuery(name = "AyantDroit.findByContactAyantDroit", query = "SELECT a FROM AyantDroit a WHERE a.contactAyantDroit = :contactAyantDroit")})
public class AyantDroit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_AYANT_DROIT")
    private String codeAyantDroit;
    @Size(max = 30)
    @Column(name = "NOM")
    private String nom;
    @Size(max = 100)
    @Column(name = "PRENOM")
    private String prenom;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 2)
    @Column(name = "SEXE")
    private String sexe;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_PREJUDICE")
    private BigDecimal montantPrejudice;
    @Column(name = "ETAT_INDEMNISER")
    private Boolean etatIndemniser;
    @Size(max = 100)
    @Column(name = "TYPE_AYANT_DROIT")
    private String typeAyantDroit;
    @Size(max = 100)
    @Column(name = "ADRESSE_AYANT_DROIT")
    private String adresseAyantDroit;
    @Size(max = 30)
    @Column(name = "CONTACT_AYANT_DROIT")
    private String contactAyantDroit;
    @JoinColumn(name = "NUM_VICTIME", referencedColumnName = "NUM_VICTIME")
    @ManyToOne(optional = false)
    private Victime numVictime;
    @OneToMany(mappedBy = "codeAyantDroit")
    private List<Prejudice> prejudiceList;
    @OneToMany(mappedBy = "codeAyantDroit")
    private List<ReglementSinistre> reglementSinistreList;

    public AyantDroit() {
    }

    public AyantDroit(String codeAyantDroit) {
        this.codeAyantDroit = codeAyantDroit;
    }

    public String getCodeAyantDroit() {
        return codeAyantDroit;
    }

    public void setCodeAyantDroit(String codeAyantDroit) {
        this.codeAyantDroit = codeAyantDroit;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public BigDecimal getMontantPrejudice() {
        return montantPrejudice;
    }

    public void setMontantPrejudice(BigDecimal montantPrejudice) {
        this.montantPrejudice = montantPrejudice;
    }

    public Boolean getEtatIndemniser() {
        return etatIndemniser;
    }

    public void setEtatIndemniser(Boolean etatIndemniser) {
        this.etatIndemniser = etatIndemniser;
    }

    public String getTypeAyantDroit() {
        return typeAyantDroit;
    }

    public void setTypeAyantDroit(String typeAyantDroit) {
        this.typeAyantDroit = typeAyantDroit;
    }

    public String getAdresseAyantDroit() {
        return adresseAyantDroit;
    }

    public void setAdresseAyantDroit(String adresseAyantDroit) {
        this.adresseAyantDroit = adresseAyantDroit;
    }

    public String getContactAyantDroit() {
        return contactAyantDroit;
    }

    public void setContactAyantDroit(String contactAyantDroit) {
        this.contactAyantDroit = contactAyantDroit;
    }

    public Victime getNumVictime() {
        return numVictime;
    }

    public void setNumVictime(Victime numVictime) {
        this.numVictime = numVictime;
    }

    @XmlTransient
    public List<Prejudice> getPrejudiceList() {
        return prejudiceList;
    }

    public void setPrejudiceList(List<Prejudice> prejudiceList) {
        this.prejudiceList = prejudiceList;
    }

    @XmlTransient
    public List<ReglementSinistre> getReglementSinistreList() {
        return reglementSinistreList;
    }

    public void setReglementSinistreList(List<ReglementSinistre> reglementSinistreList) {
        this.reglementSinistreList = reglementSinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAyantDroit != null ? codeAyantDroit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AyantDroit)) {
            return false;
        }
        AyantDroit other = (AyantDroit) object;
        if ((this.codeAyantDroit == null && other.codeAyantDroit != null) || (this.codeAyantDroit != null && !this.codeAyantDroit.equals(other.codeAyantDroit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AyantDroit[ codeAyantDroit=" + codeAyantDroit + " ]";
    }
    
}
