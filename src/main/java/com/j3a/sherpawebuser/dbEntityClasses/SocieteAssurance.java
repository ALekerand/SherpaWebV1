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
@Table(name = "societe_assurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SocieteAssurance.findAll", query = "SELECT s FROM SocieteAssurance s"),
    @NamedQuery(name = "SocieteAssurance.findByCodeSocieteAssurance", query = "SELECT s FROM SocieteAssurance s WHERE s.codeSocieteAssurance = :codeSocieteAssurance"),
    @NamedQuery(name = "SocieteAssurance.findByAbrege", query = "SELECT s FROM SocieteAssurance s WHERE s.abrege = :abrege"),
    @NamedQuery(name = "SocieteAssurance.findByNomSocieteAssurance", query = "SELECT s FROM SocieteAssurance s WHERE s.nomSocieteAssurance = :nomSocieteAssurance"),
    @NamedQuery(name = "SocieteAssurance.findByAdressePostale", query = "SELECT s FROM SocieteAssurance s WHERE s.adressePostale = :adressePostale"),
    @NamedQuery(name = "SocieteAssurance.findByDeviseUtilise", query = "SELECT s FROM SocieteAssurance s WHERE s.deviseUtilise = :deviseUtilise"),
    @NamedQuery(name = "SocieteAssurance.findByModPass", query = "SELECT s FROM SocieteAssurance s WHERE s.modPass = :modPass"),
    @NamedQuery(name = "SocieteAssurance.findByMailSocieteAssurancePublic", query = "SELECT s FROM SocieteAssurance s WHERE s.mailSocieteAssurancePublic = :mailSocieteAssurancePublic"),
    @NamedQuery(name = "SocieteAssurance.findByDateConstitution", query = "SELECT s FROM SocieteAssurance s WHERE s.dateConstitution = :dateConstitution"),
    @NamedQuery(name = "SocieteAssurance.findByReferenceStattut", query = "SELECT s FROM SocieteAssurance s WHERE s.referenceStattut = :referenceStattut"),
    @NamedQuery(name = "SocieteAssurance.findByModifiStatut", query = "SELECT s FROM SocieteAssurance s WHERE s.modifiStatut = :modifiStatut"),
    @NamedQuery(name = "SocieteAssurance.findByPays", query = "SELECT s FROM SocieteAssurance s WHERE s.pays = :pays")})
public class SocieteAssurance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_SOCIETE_ASSURANCE")
    private String codeSocieteAssurance;
    @Size(max = 10)
    @Column(name = "ABREGE")
    private String abrege;
    @Size(max = 50)
    @Column(name = "NOM_SOCIETE_ASSURANCE")
    private String nomSocieteAssurance;
    @Size(max = 25)
    @Column(name = "ADRESSE_POSTALE")
    private String adressePostale;
    @Size(max = 10)
    @Column(name = "DEVISE_UTILISE")
    private String deviseUtilise;
    @Size(max = 10)
    @Column(name = "MOD_PASS")
    private String modPass;
    @Size(max = 60)
    @Column(name = "MAIL_SOCIETE_ASSURANCE_PUBLIC")
    private String mailSocieteAssurancePublic;
    @Column(name = "DATE_CONSTITUTION")
    @Temporal(TemporalType.DATE)
    private Date dateConstitution;
    @Size(max = 25)
    @Column(name = "REFERENCE_STATTUT")
    private String referenceStattut;
    @Column(name = "MODIFI_STATUT")
    private Boolean modifiStatut;
    @Size(max = 60)
    @Column(name = "PAYS")
    private String pays;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSocieteAssurance")
    private List<Contrat> contratList;

    public SocieteAssurance() {
    }

    public SocieteAssurance(String codeSocieteAssurance) {
        this.codeSocieteAssurance = codeSocieteAssurance;
    }

    public String getCodeSocieteAssurance() {
        return codeSocieteAssurance;
    }

    public void setCodeSocieteAssurance(String codeSocieteAssurance) {
        this.codeSocieteAssurance = codeSocieteAssurance;
    }

    public String getAbrege() {
        return abrege;
    }

    public void setAbrege(String abrege) {
        this.abrege = abrege;
    }

    public String getNomSocieteAssurance() {
        return nomSocieteAssurance;
    }

    public void setNomSocieteAssurance(String nomSocieteAssurance) {
        this.nomSocieteAssurance = nomSocieteAssurance;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public String getDeviseUtilise() {
        return deviseUtilise;
    }

    public void setDeviseUtilise(String deviseUtilise) {
        this.deviseUtilise = deviseUtilise;
    }

    public String getModPass() {
        return modPass;
    }

    public void setModPass(String modPass) {
        this.modPass = modPass;
    }

    public String getMailSocieteAssurancePublic() {
        return mailSocieteAssurancePublic;
    }

    public void setMailSocieteAssurancePublic(String mailSocieteAssurancePublic) {
        this.mailSocieteAssurancePublic = mailSocieteAssurancePublic;
    }

    public Date getDateConstitution() {
        return dateConstitution;
    }

    public void setDateConstitution(Date dateConstitution) {
        this.dateConstitution = dateConstitution;
    }

    public String getReferenceStattut() {
        return referenceStattut;
    }

    public void setReferenceStattut(String referenceStattut) {
        this.referenceStattut = referenceStattut;
    }

    public Boolean getModifiStatut() {
        return modifiStatut;
    }

    public void setModifiStatut(Boolean modifiStatut) {
        this.modifiStatut = modifiStatut;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSocieteAssurance != null ? codeSocieteAssurance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocieteAssurance)) {
            return false;
        }
        SocieteAssurance other = (SocieteAssurance) object;
        if ((this.codeSocieteAssurance == null && other.codeSocieteAssurance != null) || (this.codeSocieteAssurance != null && !this.codeSocieteAssurance.equals(other.codeSocieteAssurance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.SocieteAssurance[ codeSocieteAssurance=" + codeSocieteAssurance + " ]";
    }
    
}
