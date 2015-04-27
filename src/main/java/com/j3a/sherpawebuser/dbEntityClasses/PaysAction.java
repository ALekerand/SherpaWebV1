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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "pays_action")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PaysAction.findAll", query = "SELECT p FROM PaysAction p"),
    @NamedQuery(name = "PaysAction.findByCodePa", query = "SELECT p FROM PaysAction p WHERE p.codePa = :codePa"),
    @NamedQuery(name = "PaysAction.findByPaysPa", query = "SELECT p FROM PaysAction p WHERE p.paysPa = :paysPa"),
    @NamedQuery(name = "PaysAction.findByBranchePa", query = "SELECT p FROM PaysAction p WHERE p.branchePa = :branchePa"),
    @NamedQuery(name = "PaysAction.findByAnneeDebutExploitPa", query = "SELECT p FROM PaysAction p WHERE p.anneeDebutExploitPa = :anneeDebutExploitPa"),
    @NamedQuery(name = "PaysAction.findByReferenceAgremementPa", query = "SELECT p FROM PaysAction p WHERE p.referenceAgremementPa = :referenceAgremementPa")})
public class PaysAction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PA")
    private String codePa;
    @Size(max = 20)
    @Column(name = "PAYS_PA")
    private String paysPa;
    @Size(max = 20)
    @Column(name = "BRANCHE_PA")
    private String branchePa;
    @Column(name = "ANNEE_DEBUT_EXPLOIT_PA")
    @Temporal(TemporalType.DATE)
    private Date anneeDebutExploitPa;
    @Size(max = 30)
    @Column(name = "REFERENCE_AGREMEMENT_PA")
    private String referenceAgremementPa;
    @ManyToMany(mappedBy = "paysActionList")
    private List<EtatCima> etatCimaList;

    public PaysAction() {
    }

    public PaysAction(String codePa) {
        this.codePa = codePa;
    }

    public String getCodePa() {
        return codePa;
    }

    public void setCodePa(String codePa) {
        this.codePa = codePa;
    }

    public String getPaysPa() {
        return paysPa;
    }

    public void setPaysPa(String paysPa) {
        this.paysPa = paysPa;
    }

    public String getBranchePa() {
        return branchePa;
    }

    public void setBranchePa(String branchePa) {
        this.branchePa = branchePa;
    }

    public Date getAnneeDebutExploitPa() {
        return anneeDebutExploitPa;
    }

    public void setAnneeDebutExploitPa(Date anneeDebutExploitPa) {
        this.anneeDebutExploitPa = anneeDebutExploitPa;
    }

    public String getReferenceAgremementPa() {
        return referenceAgremementPa;
    }

    public void setReferenceAgremementPa(String referenceAgremementPa) {
        this.referenceAgremementPa = referenceAgremementPa;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePa != null ? codePa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PaysAction)) {
            return false;
        }
        PaysAction other = (PaysAction) object;
        if ((this.codePa == null && other.codePa != null) || (this.codePa != null && !this.codePa.equals(other.codePa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PaysAction[ codePa=" + codePa + " ]";
    }
    
}
