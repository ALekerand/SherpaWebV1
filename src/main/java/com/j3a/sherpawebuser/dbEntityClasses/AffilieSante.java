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
@Table(name = "affilie_sante")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AffilieSante.findAll", query = "SELECT a FROM AffilieSante a"),
    @NamedQuery(name = "AffilieSante.findByCodeAffilie", query = "SELECT a FROM AffilieSante a WHERE a.codeAffilie = :codeAffilie"),
    @NamedQuery(name = "AffilieSante.findByNomAfflilie", query = "SELECT a FROM AffilieSante a WHERE a.nomAfflilie = :nomAfflilie"),
    @NamedQuery(name = "AffilieSante.findByPrenomAffilie", query = "SELECT a FROM AffilieSante a WHERE a.prenomAffilie = :prenomAffilie"),
    @NamedQuery(name = "AffilieSante.findByNaissAffilie", query = "SELECT a FROM AffilieSante a WHERE a.naissAffilie = :naissAffilie"),
    @NamedQuery(name = "AffilieSante.findByAdresseAffilie", query = "SELECT a FROM AffilieSante a WHERE a.adresseAffilie = :adresseAffilie"),
    @NamedQuery(name = "AffilieSante.findBySexeAffilie", query = "SELECT a FROM AffilieSante a WHERE a.sexeAffilie = :sexeAffilie"),
    @NamedQuery(name = "AffilieSante.findByLienAffilie", query = "SELECT a FROM AffilieSante a WHERE a.lienAffilie = :lienAffilie"),
    @NamedQuery(name = "AffilieSante.findByResidenceAffilie", query = "SELECT a FROM AffilieSante a WHERE a.residenceAffilie = :residenceAffilie"),
    @NamedQuery(name = "AffilieSante.findByMobileAffilie", query = "SELECT a FROM AffilieSante a WHERE a.mobileAffilie = :mobileAffilie"),
    @NamedQuery(name = "AffilieSante.findByCourrielAffilie", query = "SELECT a FROM AffilieSante a WHERE a.courrielAffilie = :courrielAffilie"),
    @NamedQuery(name = "AffilieSante.findByNatExtAffilie", query = "SELECT a FROM AffilieSante a WHERE a.natExtAffilie = :natExtAffilie"),
    @NamedQuery(name = "AffilieSante.findByFormuleAffilie", query = "SELECT a FROM AffilieSante a WHERE a.formuleAffilie = :formuleAffilie"),
    @NamedQuery(name = "AffilieSante.findByStatutaffiliesante", query = "SELECT a FROM AffilieSante a WHERE a.statutaffiliesante = :statutaffiliesante")})
public class AffilieSante implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_AFFILIE")
    private String codeAffilie;
    @Size(max = 60)
    @Column(name = "NOM_AFFLILIE")
    private String nomAfflilie;
    @Size(max = 80)
    @Column(name = "PRENOM_AFFILIE")
    private String prenomAffilie;
    @Column(name = "NAISS_AFFILIE")
    @Temporal(TemporalType.DATE)
    private Date naissAffilie;
    @Size(max = 80)
    @Column(name = "ADRESSE_AFFILIE")
    private String adresseAffilie;
    @Size(max = 9)
    @Column(name = "SEXE_AFFILIE")
    private String sexeAffilie;
    @Size(max = 60)
    @Column(name = "LIEN_AFFILIE")
    private String lienAffilie;
    @Size(max = 60)
    @Column(name = "RESIDENCE_AFFILIE")
    private String residenceAffilie;
    @Size(max = 20)
    @Column(name = "MOBILE_AFFILIE")
    private String mobileAffilie;
    @Size(max = 80)
    @Column(name = "COURRIEL_AFFILIE")
    private String courrielAffilie;
    @Size(max = 30)
    @Column(name = "NAT_EXT_AFFILIE")
    private String natExtAffilie;
    @Size(max = 80)
    @Column(name = "FORMULE_AFFILIE")
    private String formuleAffilie;
    @Size(max = 20)
    @Column(name = "STATUTAFFILIESANTE")
    private String statutaffiliesante;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "affilieSante")
    private List<AffilieListeAffilie> affilieListeAffilieList;
    @OneToMany(mappedBy = "codeAffilie")
    private List<GarantieChoisieSante> garantieChoisieSanteList;

    public AffilieSante() {
    }

    public AffilieSante(String codeAffilie) {
        this.codeAffilie = codeAffilie;
    }

    public String getCodeAffilie() {
        return codeAffilie;
    }

    public void setCodeAffilie(String codeAffilie) {
        this.codeAffilie = codeAffilie;
    }

    public String getNomAfflilie() {
        return nomAfflilie;
    }

    public void setNomAfflilie(String nomAfflilie) {
        this.nomAfflilie = nomAfflilie;
    }

    public String getPrenomAffilie() {
        return prenomAffilie;
    }

    public void setPrenomAffilie(String prenomAffilie) {
        this.prenomAffilie = prenomAffilie;
    }

    public Date getNaissAffilie() {
        return naissAffilie;
    }

    public void setNaissAffilie(Date naissAffilie) {
        this.naissAffilie = naissAffilie;
    }

    public String getAdresseAffilie() {
        return adresseAffilie;
    }

    public void setAdresseAffilie(String adresseAffilie) {
        this.adresseAffilie = adresseAffilie;
    }

    public String getSexeAffilie() {
        return sexeAffilie;
    }

    public void setSexeAffilie(String sexeAffilie) {
        this.sexeAffilie = sexeAffilie;
    }

    public String getLienAffilie() {
        return lienAffilie;
    }

    public void setLienAffilie(String lienAffilie) {
        this.lienAffilie = lienAffilie;
    }

    public String getResidenceAffilie() {
        return residenceAffilie;
    }

    public void setResidenceAffilie(String residenceAffilie) {
        this.residenceAffilie = residenceAffilie;
    }

    public String getMobileAffilie() {
        return mobileAffilie;
    }

    public void setMobileAffilie(String mobileAffilie) {
        this.mobileAffilie = mobileAffilie;
    }

    public String getCourrielAffilie() {
        return courrielAffilie;
    }

    public void setCourrielAffilie(String courrielAffilie) {
        this.courrielAffilie = courrielAffilie;
    }

    public String getNatExtAffilie() {
        return natExtAffilie;
    }

    public void setNatExtAffilie(String natExtAffilie) {
        this.natExtAffilie = natExtAffilie;
    }

    public String getFormuleAffilie() {
        return formuleAffilie;
    }

    public void setFormuleAffilie(String formuleAffilie) {
        this.formuleAffilie = formuleAffilie;
    }

    public String getStatutaffiliesante() {
        return statutaffiliesante;
    }

    public void setStatutaffiliesante(String statutaffiliesante) {
        this.statutaffiliesante = statutaffiliesante;
    }

    @XmlTransient
    public List<AffilieListeAffilie> getAffilieListeAffilieList() {
        return affilieListeAffilieList;
    }

    public void setAffilieListeAffilieList(List<AffilieListeAffilie> affilieListeAffilieList) {
        this.affilieListeAffilieList = affilieListeAffilieList;
    }

    @XmlTransient
    public List<GarantieChoisieSante> getGarantieChoisieSanteList() {
        return garantieChoisieSanteList;
    }

    public void setGarantieChoisieSanteList(List<GarantieChoisieSante> garantieChoisieSanteList) {
        this.garantieChoisieSanteList = garantieChoisieSanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAffilie != null ? codeAffilie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AffilieSante)) {
            return false;
        }
        AffilieSante other = (AffilieSante) object;
        if ((this.codeAffilie == null && other.codeAffilie != null) || (this.codeAffilie != null && !this.codeAffilie.equals(other.codeAffilie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AffilieSante[ codeAffilie=" + codeAffilie + " ]";
    }
    
}
