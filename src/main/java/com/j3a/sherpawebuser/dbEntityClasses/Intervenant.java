/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "intervenant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Intervenant.findAll", query = "SELECT i FROM Intervenant i"),
    @NamedQuery(name = "Intervenant.findByCodeIntervenant", query = "SELECT i FROM Intervenant i WHERE i.codeIntervenant = :codeIntervenant"),
    @NamedQuery(name = "Intervenant.findByNomIntervenant", query = "SELECT i FROM Intervenant i WHERE i.nomIntervenant = :nomIntervenant"),
    @NamedQuery(name = "Intervenant.findByContactIntervenant", query = "SELECT i FROM Intervenant i WHERE i.contactIntervenant = :contactIntervenant"),
    @NamedQuery(name = "Intervenant.findByTypeIntervenant", query = "SELECT i FROM Intervenant i WHERE i.typeIntervenant = :typeIntervenant"),
    @NamedQuery(name = "Intervenant.findByAdresse", query = "SELECT i FROM Intervenant i WHERE i.adresse = :adresse"),
    @NamedQuery(name = "Intervenant.findByTelFixe", query = "SELECT i FROM Intervenant i WHERE i.telFixe = :telFixe"),
    @NamedQuery(name = "Intervenant.findByTelCell", query = "SELECT i FROM Intervenant i WHERE i.telCell = :telCell"),
    @NamedQuery(name = "Intervenant.findByEmail", query = "SELECT i FROM Intervenant i WHERE i.email = :email")})
public class Intervenant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_INTERVENANT")
    private String codeIntervenant;
    @Size(max = 60)
    @Column(name = "NOM_INTERVENANT")
    private String nomIntervenant;
    @Size(max = 14)
    @Column(name = "CONTACT_INTERVENANT")
    private String contactIntervenant;
    @Size(max = 100)
    @Column(name = "TYPE_INTERVENANT")
    private String typeIntervenant;
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
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeIntervenant")
    private List<Intervention> interventionList;

    public Intervenant() {
    }

    public Intervenant(String codeIntervenant) {
        this.codeIntervenant = codeIntervenant;
    }

    public String getCodeIntervenant() {
        return codeIntervenant;
    }

    public void setCodeIntervenant(String codeIntervenant) {
        this.codeIntervenant = codeIntervenant;
    }

    public String getNomIntervenant() {
        return nomIntervenant;
    }

    public void setNomIntervenant(String nomIntervenant) {
        this.nomIntervenant = nomIntervenant;
    }

    public String getContactIntervenant() {
        return contactIntervenant;
    }

    public void setContactIntervenant(String contactIntervenant) {
        this.contactIntervenant = contactIntervenant;
    }

    public String getTypeIntervenant() {
        return typeIntervenant;
    }

    public void setTypeIntervenant(String typeIntervenant) {
        this.typeIntervenant = typeIntervenant;
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
    public List<Intervention> getInterventionList() {
        return interventionList;
    }

    public void setInterventionList(List<Intervention> interventionList) {
        this.interventionList = interventionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeIntervenant != null ? codeIntervenant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Intervenant)) {
            return false;
        }
        Intervenant other = (Intervenant) object;
        if ((this.codeIntervenant == null && other.codeIntervenant != null) || (this.codeIntervenant != null && !this.codeIntervenant.equals(other.codeIntervenant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Intervenant[ codeIntervenant=" + codeIntervenant + " ]";
    }
    
}
