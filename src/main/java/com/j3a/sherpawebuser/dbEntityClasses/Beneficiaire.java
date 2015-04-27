/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "beneficiaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Beneficiaire.findAll", query = "SELECT b FROM Beneficiaire b"),
    @NamedQuery(name = "Beneficiaire.findByCodeBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.codeBeneficiaire = :codeBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByNomBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.nomBeneficiaire = :nomBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByPrenomBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.prenomBeneficiaire = :prenomBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByDatenaissBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.datenaissBeneficiaire = :datenaissBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByLieunaissBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.lieunaissBeneficiaire = :lieunaissBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByAdresseBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.adresseBeneficiaire = :adresseBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByTelBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.telBeneficiaire = :telBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByMailBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.mailBeneficiaire = :mailBeneficiaire"),
    @NamedQuery(name = "Beneficiaire.findByPartBeneficiaire", query = "SELECT b FROM Beneficiaire b WHERE b.partBeneficiaire = :partBeneficiaire")})
public class Beneficiaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_BENEFICIAIRE")
    private String codeBeneficiaire;
    @Size(max = 20)
    @Column(name = "NOM_BENEFICIAIRE")
    private String nomBeneficiaire;
    @Size(max = 60)
    @Column(name = "PRENOM_BENEFICIAIRE")
    private String prenomBeneficiaire;
    @Column(name = "DATENAISS_BENEFICIAIRE")
    @Temporal(TemporalType.DATE)
    private Date datenaissBeneficiaire;
    @Size(max = 20)
    @Column(name = "LIEUNAISS_BENEFICIAIRE")
    private String lieunaissBeneficiaire;
    @Size(max = 60)
    @Column(name = "ADRESSE_BENEFICIAIRE")
    private String adresseBeneficiaire;
    @Size(max = 20)
    @Column(name = "TEL_BENEFICIAIRE")
    private String telBeneficiaire;
    @Size(max = 60)
    @Column(name = "MAIL_BENEFICIAIRE")
    private String mailBeneficiaire;
    @Column(name = "PART_BENEFICIAIRE")
    private Integer partBeneficiaire;
    @JoinColumn(name = "NUM_IDENTIFICATION", referencedColumnName = "NUM_IDENTIFICATION")
    @ManyToOne(optional = false)
    private AssureIa numIdentification;

    public Beneficiaire() {
    }

    public Beneficiaire(String codeBeneficiaire) {
        this.codeBeneficiaire = codeBeneficiaire;
    }

    public String getCodeBeneficiaire() {
        return codeBeneficiaire;
    }

    public void setCodeBeneficiaire(String codeBeneficiaire) {
        this.codeBeneficiaire = codeBeneficiaire;
    }

    public String getNomBeneficiaire() {
        return nomBeneficiaire;
    }

    public void setNomBeneficiaire(String nomBeneficiaire) {
        this.nomBeneficiaire = nomBeneficiaire;
    }

    public String getPrenomBeneficiaire() {
        return prenomBeneficiaire;
    }

    public void setPrenomBeneficiaire(String prenomBeneficiaire) {
        this.prenomBeneficiaire = prenomBeneficiaire;
    }

    public Date getDatenaissBeneficiaire() {
        return datenaissBeneficiaire;
    }

    public void setDatenaissBeneficiaire(Date datenaissBeneficiaire) {
        this.datenaissBeneficiaire = datenaissBeneficiaire;
    }

    public String getLieunaissBeneficiaire() {
        return lieunaissBeneficiaire;
    }

    public void setLieunaissBeneficiaire(String lieunaissBeneficiaire) {
        this.lieunaissBeneficiaire = lieunaissBeneficiaire;
    }

    public String getAdresseBeneficiaire() {
        return adresseBeneficiaire;
    }

    public void setAdresseBeneficiaire(String adresseBeneficiaire) {
        this.adresseBeneficiaire = adresseBeneficiaire;
    }

    public String getTelBeneficiaire() {
        return telBeneficiaire;
    }

    public void setTelBeneficiaire(String telBeneficiaire) {
        this.telBeneficiaire = telBeneficiaire;
    }

    public String getMailBeneficiaire() {
        return mailBeneficiaire;
    }

    public void setMailBeneficiaire(String mailBeneficiaire) {
        this.mailBeneficiaire = mailBeneficiaire;
    }

    public Integer getPartBeneficiaire() {
        return partBeneficiaire;
    }

    public void setPartBeneficiaire(Integer partBeneficiaire) {
        this.partBeneficiaire = partBeneficiaire;
    }

    public AssureIa getNumIdentification() {
        return numIdentification;
    }

    public void setNumIdentification(AssureIa numIdentification) {
        this.numIdentification = numIdentification;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeBeneficiaire != null ? codeBeneficiaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Beneficiaire)) {
            return false;
        }
        Beneficiaire other = (Beneficiaire) object;
        if ((this.codeBeneficiaire == null && other.codeBeneficiaire != null) || (this.codeBeneficiaire != null && !this.codeBeneficiaire.equals(other.codeBeneficiaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Beneficiaire[ codeBeneficiaire=" + codeBeneficiaire + " ]";
    }
    
}
