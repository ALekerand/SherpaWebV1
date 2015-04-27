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
@Table(name = "gestionnaire")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Gestionnaire.findAll", query = "SELECT g FROM Gestionnaire g"),
    @NamedQuery(name = "Gestionnaire.findByCodeGestionnaire", query = "SELECT g FROM Gestionnaire g WHERE g.codeGestionnaire = :codeGestionnaire"),
    @NamedQuery(name = "Gestionnaire.findByRaisonSocialGestionnaire", query = "SELECT g FROM Gestionnaire g WHERE g.raisonSocialGestionnaire = :raisonSocialGestionnaire"),
    @NamedQuery(name = "Gestionnaire.findByContactGestgc", query = "SELECT g FROM Gestionnaire g WHERE g.contactGestgc = :contactGestgc"),
    @NamedQuery(name = "Gestionnaire.findByAdresseGestgc", query = "SELECT g FROM Gestionnaire g WHERE g.adresseGestgc = :adresseGestgc"),
    @NamedQuery(name = "Gestionnaire.findByTauxComGestionnaireGc", query = "SELECT g FROM Gestionnaire g WHERE g.tauxComGestionnaireGc = :tauxComGestionnaireGc"),
    @NamedQuery(name = "Gestionnaire.findByTauxAccGestionnairegc", query = "SELECT g FROM Gestionnaire g WHERE g.tauxAccGestionnairegc = :tauxAccGestionnairegc")})
public class Gestionnaire implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_GESTIONNAIRE")
    private String codeGestionnaire;
    @Size(max = 60)
    @Column(name = "RAISON_SOCIAL_GESTIONNAIRE")
    private String raisonSocialGestionnaire;
    @Size(max = 20)
    @Column(name = "CONTACT_GESTGC")
    private String contactGestgc;
    @Size(max = 80)
    @Column(name = "ADRESSE_GESTGC")
    private String adresseGestgc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_GESTIONNAIRE_GC")
    private BigDecimal tauxComGestionnaireGc;
    @Column(name = "TAUX_ACC_GESTIONNAIREGC")
    private BigDecimal tauxAccGestionnairegc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionnaire")
    private List<GestionnaireGc> gestionnaireGcList;

    public Gestionnaire() {
    }

    public Gestionnaire(String codeGestionnaire) {
        this.codeGestionnaire = codeGestionnaire;
    }

    public String getCodeGestionnaire() {
        return codeGestionnaire;
    }

    public void setCodeGestionnaire(String codeGestionnaire) {
        this.codeGestionnaire = codeGestionnaire;
    }

    public String getRaisonSocialGestionnaire() {
        return raisonSocialGestionnaire;
    }

    public void setRaisonSocialGestionnaire(String raisonSocialGestionnaire) {
        this.raisonSocialGestionnaire = raisonSocialGestionnaire;
    }

    public String getContactGestgc() {
        return contactGestgc;
    }

    public void setContactGestgc(String contactGestgc) {
        this.contactGestgc = contactGestgc;
    }

    public String getAdresseGestgc() {
        return adresseGestgc;
    }

    public void setAdresseGestgc(String adresseGestgc) {
        this.adresseGestgc = adresseGestgc;
    }

    public BigDecimal getTauxComGestionnaireGc() {
        return tauxComGestionnaireGc;
    }

    public void setTauxComGestionnaireGc(BigDecimal tauxComGestionnaireGc) {
        this.tauxComGestionnaireGc = tauxComGestionnaireGc;
    }

    public BigDecimal getTauxAccGestionnairegc() {
        return tauxAccGestionnairegc;
    }

    public void setTauxAccGestionnairegc(BigDecimal tauxAccGestionnairegc) {
        this.tauxAccGestionnairegc = tauxAccGestionnairegc;
    }

    @XmlTransient
    public List<GestionnaireGc> getGestionnaireGcList() {
        return gestionnaireGcList;
    }

    public void setGestionnaireGcList(List<GestionnaireGc> gestionnaireGcList) {
        this.gestionnaireGcList = gestionnaireGcList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGestionnaire != null ? codeGestionnaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Gestionnaire)) {
            return false;
        }
        Gestionnaire other = (Gestionnaire) object;
        if ((this.codeGestionnaire == null && other.codeGestionnaire != null) || (this.codeGestionnaire != null && !this.codeGestionnaire.equals(other.codeGestionnaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Gestionnaire[ codeGestionnaire=" + codeGestionnaire + " ]";
    }
    
}
