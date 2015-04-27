/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "expert_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExpertSinistre.findAll", query = "SELECT e FROM ExpertSinistre e"),
    @NamedQuery(name = "ExpertSinistre.findByCodeExpertSinistre", query = "SELECT e FROM ExpertSinistre e WHERE e.codeExpertSinistre = :codeExpertSinistre"),
    @NamedQuery(name = "ExpertSinistre.findByNomExpert", query = "SELECT e FROM ExpertSinistre e WHERE e.nomExpert = :nomExpert"),
    @NamedQuery(name = "ExpertSinistre.findByAdresseExpert", query = "SELECT e FROM ExpertSinistre e WHERE e.adresseExpert = :adresseExpert"),
    @NamedQuery(name = "ExpertSinistre.findByContactExpert", query = "SELECT e FROM ExpertSinistre e WHERE e.contactExpert = :contactExpert"),
    @NamedQuery(name = "ExpertSinistre.findByMailExpert", query = "SELECT e FROM ExpertSinistre e WHERE e.mailExpert = :mailExpert")})
public class ExpertSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_EXPERT_SINISTRE")
    private String codeExpertSinistre;
    @Size(max = 70)
    @Column(name = "NOM_EXPERT")
    private String nomExpert;
    @Size(max = 60)
    @Column(name = "ADRESSE_EXPERT")
    private String adresseExpert;
    @Size(max = 20)
    @Column(name = "CONTACT_EXPERT")
    private String contactExpert;
    @Size(max = 40)
    @Column(name = "MAIL_EXPERT")
    private String mailExpert;
    @OneToMany(mappedBy = "codeExpertSinistre")
    private List<Expertise> expertiseList;

    public ExpertSinistre() {
    }

    public ExpertSinistre(String codeExpertSinistre) {
        this.codeExpertSinistre = codeExpertSinistre;
    }

    public String getCodeExpertSinistre() {
        return codeExpertSinistre;
    }

    public void setCodeExpertSinistre(String codeExpertSinistre) {
        this.codeExpertSinistre = codeExpertSinistre;
    }

    public String getNomExpert() {
        return nomExpert;
    }

    public void setNomExpert(String nomExpert) {
        this.nomExpert = nomExpert;
    }

    public String getAdresseExpert() {
        return adresseExpert;
    }

    public void setAdresseExpert(String adresseExpert) {
        this.adresseExpert = adresseExpert;
    }

    public String getContactExpert() {
        return contactExpert;
    }

    public void setContactExpert(String contactExpert) {
        this.contactExpert = contactExpert;
    }

    public String getMailExpert() {
        return mailExpert;
    }

    public void setMailExpert(String mailExpert) {
        this.mailExpert = mailExpert;
    }

    @XmlTransient
    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public void setExpertiseList(List<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeExpertSinistre != null ? codeExpertSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ExpertSinistre)) {
            return false;
        }
        ExpertSinistre other = (ExpertSinistre) object;
        if ((this.codeExpertSinistre == null && other.codeExpertSinistre != null) || (this.codeExpertSinistre != null && !this.codeExpertSinistre.equals(other.codeExpertSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ExpertSinistre[ codeExpertSinistre=" + codeExpertSinistre + " ]";
    }
    
}
