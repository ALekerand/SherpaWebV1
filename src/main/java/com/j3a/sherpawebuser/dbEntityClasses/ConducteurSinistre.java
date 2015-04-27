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
@Table(name = "conducteur_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConducteurSinistre.findAll", query = "SELECT c FROM ConducteurSinistre c"),
    @NamedQuery(name = "ConducteurSinistre.findByCodeConducteurSinistre", query = "SELECT c FROM ConducteurSinistre c WHERE c.codeConducteurSinistre = :codeConducteurSinistre"),
    @NamedQuery(name = "ConducteurSinistre.findByNomCondSinistre", query = "SELECT c FROM ConducteurSinistre c WHERE c.nomCondSinistre = :nomCondSinistre"),
    @NamedQuery(name = "ConducteurSinistre.findByPrenomCondSinistre", query = "SELECT c FROM ConducteurSinistre c WHERE c.prenomCondSinistre = :prenomCondSinistre"),
    @NamedQuery(name = "ConducteurSinistre.findByDateNaissCondSinistre", query = "SELECT c FROM ConducteurSinistre c WHERE c.dateNaissCondSinistre = :dateNaissCondSinistre"),
    @NamedQuery(name = "ConducteurSinistre.findByNumPermis", query = "SELECT c FROM ConducteurSinistre c WHERE c.numPermis = :numPermis"),
    @NamedQuery(name = "ConducteurSinistre.findByCategoriePermis", query = "SELECT c FROM ConducteurSinistre c WHERE c.categoriePermis = :categoriePermis"),
    @NamedQuery(name = "ConducteurSinistre.findByAdresse", query = "SELECT c FROM ConducteurSinistre c WHERE c.adresse = :adresse"),
    @NamedQuery(name = "ConducteurSinistre.findByTelFixe", query = "SELECT c FROM ConducteurSinistre c WHERE c.telFixe = :telFixe"),
    @NamedQuery(name = "ConducteurSinistre.findByTelCell", query = "SELECT c FROM ConducteurSinistre c WHERE c.telCell = :telCell"),
    @NamedQuery(name = "ConducteurSinistre.findByEmail", query = "SELECT c FROM ConducteurSinistre c WHERE c.email = :email")})
public class ConducteurSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_CONDUCTEUR_SINISTRE")
    private String codeConducteurSinistre;
    @Size(max = 20)
    @Column(name = "NOM_COND_SINISTRE")
    private String nomCondSinistre;
    @Size(max = 60)
    @Column(name = "PRENOM_COND_SINISTRE")
    private String prenomCondSinistre;
    @Column(name = "DATE_NAISS_COND_SINISTRE")
    @Temporal(TemporalType.DATE)
    private Date dateNaissCondSinistre;
    @Size(max = 10)
    @Column(name = "NUM_PERMIS")
    private String numPermis;
    @Size(max = 5)
    @Column(name = "CATEGORIE_PERMIS")
    private String categoriePermis;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "conducteurSinistre")
    private List<SinistreConducteur> sinistreConducteurList;

    public ConducteurSinistre() {
    }

    public ConducteurSinistre(String codeConducteurSinistre) {
        this.codeConducteurSinistre = codeConducteurSinistre;
    }

    public String getCodeConducteurSinistre() {
        return codeConducteurSinistre;
    }

    public void setCodeConducteurSinistre(String codeConducteurSinistre) {
        this.codeConducteurSinistre = codeConducteurSinistre;
    }

    public String getNomCondSinistre() {
        return nomCondSinistre;
    }

    public void setNomCondSinistre(String nomCondSinistre) {
        this.nomCondSinistre = nomCondSinistre;
    }

    public String getPrenomCondSinistre() {
        return prenomCondSinistre;
    }

    public void setPrenomCondSinistre(String prenomCondSinistre) {
        this.prenomCondSinistre = prenomCondSinistre;
    }

    public Date getDateNaissCondSinistre() {
        return dateNaissCondSinistre;
    }

    public void setDateNaissCondSinistre(Date dateNaissCondSinistre) {
        this.dateNaissCondSinistre = dateNaissCondSinistre;
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
    public List<SinistreConducteur> getSinistreConducteurList() {
        return sinistreConducteurList;
    }

    public void setSinistreConducteurList(List<SinistreConducteur> sinistreConducteurList) {
        this.sinistreConducteurList = sinistreConducteurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeConducteurSinistre != null ? codeConducteurSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConducteurSinistre)) {
            return false;
        }
        ConducteurSinistre other = (ConducteurSinistre) object;
        if ((this.codeConducteurSinistre == null && other.codeConducteurSinistre != null) || (this.codeConducteurSinistre != null && !this.codeConducteurSinistre.equals(other.codeConducteurSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ConducteurSinistre[ codeConducteurSinistre=" + codeConducteurSinistre + " ]";
    }
    
}
