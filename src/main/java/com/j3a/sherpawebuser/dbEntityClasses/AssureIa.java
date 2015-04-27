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
@Table(name = "assure_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssureIa.findAll", query = "SELECT a FROM AssureIa a"),
    @NamedQuery(name = "AssureIa.findByNumIdentification", query = "SELECT a FROM AssureIa a WHERE a.numIdentification = :numIdentification"),
    @NamedQuery(name = "AssureIa.findByNomAssIa", query = "SELECT a FROM AssureIa a WHERE a.nomAssIa = :nomAssIa"),
    @NamedQuery(name = "AssureIa.findByPrenomAssIa", query = "SELECT a FROM AssureIa a WHERE a.prenomAssIa = :prenomAssIa"),
    @NamedQuery(name = "AssureIa.findByDatenaissAssIa", query = "SELECT a FROM AssureIa a WHERE a.datenaissAssIa = :datenaissAssIa"),
    @NamedQuery(name = "AssureIa.findByLieunaissAssIa", query = "SELECT a FROM AssureIa a WHERE a.lieunaissAssIa = :lieunaissAssIa"),
    @NamedQuery(name = "AssureIa.findByDureeIj", query = "SELECT a FROM AssureIa a WHERE a.dureeIj = :dureeIj"),
    @NamedQuery(name = "AssureIa.findByActiviteAssIa", query = "SELECT a FROM AssureIa a WHERE a.activiteAssIa = :activiteAssIa"),
    @NamedQuery(name = "AssureIa.findByProfessionAssIa", query = "SELECT a FROM AssureIa a WHERE a.professionAssIa = :professionAssIa"),
    @NamedQuery(name = "AssureIa.findByUsageAssIa", query = "SELECT a FROM AssureIa a WHERE a.usageAssIa = :usageAssIa"),
    @NamedQuery(name = "AssureIa.findBySexeAssIa", query = "SELECT a FROM AssureIa a WHERE a.sexeAssIa = :sexeAssIa"),
    @NamedQuery(name = "AssureIa.findByAdresseAssIa", query = "SELECT a FROM AssureIa a WHERE a.adresseAssIa = :adresseAssIa"),
    @NamedQuery(name = "AssureIa.findByStatutassureia", query = "SELECT a FROM AssureIa a WHERE a.statutassureia = :statutassureia")})
public class AssureIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_IDENTIFICATION")
    private String numIdentification;
    @Size(max = 20)
    @Column(name = "NOM_ASS_IA")
    private String nomAssIa;
    @Size(max = 60)
    @Column(name = "PRENOM_ASS_IA")
    private String prenomAssIa;
    @Column(name = "DATENAISS_ASS_IA")
    @Temporal(TemporalType.DATE)
    private Date datenaissAssIa;
    @Size(max = 20)
    @Column(name = "LIEUNAISS_ASS_IA")
    private String lieunaissAssIa;
    @Column(name = "DUREE_IJ")
    private Integer dureeIj;
    @Size(max = 30)
    @Column(name = "ACTIVITE_ASS_IA")
    private String activiteAssIa;
    @Size(max = 40)
    @Column(name = "PROFESSION_ASS_IA")
    private String professionAssIa;
    @Size(max = 40)
    @Column(name = "USAGE_ASS_IA")
    private String usageAssIa;
    @Size(max = 20)
    @Column(name = "SEXE_ASS_IA")
    private String sexeAssIa;
    @Size(max = 50)
    @Column(name = "ADRESSE_ASS_IA_")
    private String adresseAssIa;
    @Size(max = 40)
    @Column(name = "STATUTASSUREIA")
    private String statutassureia;
    @OneToMany(mappedBy = "numIdentification")
    private List<GarantieChoisieIa> garantieChoisieIaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assureIa")
    private List<AssureIaSinistre> assureIaSinistreList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @JoinColumn(name = "CODE_LISTE_ASSURE_IA", referencedColumnName = "CODE_LISTE_ASSURE_IA")
    @ManyToOne
    private ListeAssureIa codeListeAssureIa;
    @JoinColumn(name = "CODE_CLASSE_IA", referencedColumnName = "CODE_CLASSE_IA")
    @ManyToOne
    private ClasseIa codeClasseIa;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "assureIa")
    private List<ApporteurAssure> apporteurAssureList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numIdentification")
    private List<Beneficiaire> beneficiaireList;

    public AssureIa() {
    }

    public AssureIa(String numIdentification) {
        this.numIdentification = numIdentification;
    }

    public String getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(String numIdentification) {
        this.numIdentification = numIdentification;
    }

    public String getNomAssIa() {
        return nomAssIa;
    }

    public void setNomAssIa(String nomAssIa) {
        this.nomAssIa = nomAssIa;
    }

    public String getPrenomAssIa() {
        return prenomAssIa;
    }

    public void setPrenomAssIa(String prenomAssIa) {
        this.prenomAssIa = prenomAssIa;
    }

    public Date getDatenaissAssIa() {
        return datenaissAssIa;
    }

    public void setDatenaissAssIa(Date datenaissAssIa) {
        this.datenaissAssIa = datenaissAssIa;
    }

    public String getLieunaissAssIa() {
        return lieunaissAssIa;
    }

    public void setLieunaissAssIa(String lieunaissAssIa) {
        this.lieunaissAssIa = lieunaissAssIa;
    }

    public Integer getDureeIj() {
        return dureeIj;
    }

    public void setDureeIj(Integer dureeIj) {
        this.dureeIj = dureeIj;
    }

    public String getActiviteAssIa() {
        return activiteAssIa;
    }

    public void setActiviteAssIa(String activiteAssIa) {
        this.activiteAssIa = activiteAssIa;
    }

    public String getProfessionAssIa() {
        return professionAssIa;
    }

    public void setProfessionAssIa(String professionAssIa) {
        this.professionAssIa = professionAssIa;
    }

    public String getUsageAssIa() {
        return usageAssIa;
    }

    public void setUsageAssIa(String usageAssIa) {
        this.usageAssIa = usageAssIa;
    }

    public String getSexeAssIa() {
        return sexeAssIa;
    }

    public void setSexeAssIa(String sexeAssIa) {
        this.sexeAssIa = sexeAssIa;
    }

    public String getAdresseAssIa() {
        return adresseAssIa;
    }

    public void setAdresseAssIa(String adresseAssIa) {
        this.adresseAssIa = adresseAssIa;
    }

    public String getStatutassureia() {
        return statutassureia;
    }

    public void setStatutassureia(String statutassureia) {
        this.statutassureia = statutassureia;
    }

    @XmlTransient
    public List<GarantieChoisieIa> getGarantieChoisieIaList() {
        return garantieChoisieIaList;
    }

    public void setGarantieChoisieIaList(List<GarantieChoisieIa> garantieChoisieIaList) {
        this.garantieChoisieIaList = garantieChoisieIaList;
    }

    @XmlTransient
    public List<AssureIaSinistre> getAssureIaSinistreList() {
        return assureIaSinistreList;
    }

    public void setAssureIaSinistreList(List<AssureIaSinistre> assureIaSinistreList) {
        this.assureIaSinistreList = assureIaSinistreList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public ListeAssureIa getCodeListeAssureIa() {
        return codeListeAssureIa;
    }

    public void setCodeListeAssureIa(ListeAssureIa codeListeAssureIa) {
        this.codeListeAssureIa = codeListeAssureIa;
    }

    public ClasseIa getCodeClasseIa() {
        return codeClasseIa;
    }

    public void setCodeClasseIa(ClasseIa codeClasseIa) {
        this.codeClasseIa = codeClasseIa;
    }

    @XmlTransient
    public List<ApporteurAssure> getApporteurAssureList() {
        return apporteurAssureList;
    }

    public void setApporteurAssureList(List<ApporteurAssure> apporteurAssureList) {
        this.apporteurAssureList = apporteurAssureList;
    }

    @XmlTransient
    public List<Beneficiaire> getBeneficiaireList() {
        return beneficiaireList;
    }

    public void setBeneficiaireList(List<Beneficiaire> beneficiaireList) {
        this.beneficiaireList = beneficiaireList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numIdentification != null ? numIdentification.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssureIa)) {
            return false;
        }
        AssureIa other = (AssureIa) object;
        if ((this.numIdentification == null && other.numIdentification != null) || (this.numIdentification != null && !this.numIdentification.equals(other.numIdentification))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AssureIa[ numIdentification=" + numIdentification + " ]";
    }
    
}
