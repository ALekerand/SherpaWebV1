/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "compte_apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CompteApporteur.findAll", query = "SELECT c FROM CompteApporteur c"),
    @NamedQuery(name = "CompteApporteur.findByCodeCompteApp", query = "SELECT c FROM CompteApporteur c WHERE c.codeCompteApp = :codeCompteApp"),
    @NamedQuery(name = "CompteApporteur.findByDateCreationCompte", query = "SELECT c FROM CompteApporteur c WHERE c.dateCreationCompte = :dateCreationCompte"),
    @NamedQuery(name = "CompteApporteur.findByTotalComApp", query = "SELECT c FROM CompteApporteur c WHERE c.totalComApp = :totalComApp"),
    @NamedQuery(name = "CompteApporteur.findByTotalComPaye", query = "SELECT c FROM CompteApporteur c WHERE c.totalComPaye = :totalComPaye"),
    @NamedQuery(name = "CompteApporteur.findByResteComPaye", query = "SELECT c FROM CompteApporteur c WHERE c.resteComPaye = :resteComPaye")})
public class CompteApporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_COMPTE_APP")
    private String codeCompteApp;
    @Column(name = "DATE_CREATION_COMPTE")
    @Temporal(TemporalType.DATE)
    private Date dateCreationCompte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_COM_APP")
    private BigDecimal totalComApp;
    @Column(name = "TOTAL_COM_PAYE")
    private BigDecimal totalComPaye;
    @Column(name = "RESTE_COM_PAYE")
    private BigDecimal resteComPaye;
    @OneToMany(mappedBy = "codeCompteApp")
    private List<Apporteur> apporteurList;
    @OneToMany(mappedBy = "codeCompteApp")
    private List<ReglementApporteur> reglementApporteurList;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR")
    @ManyToOne(optional = false)
    private Apporteur codeApporteur;

    public CompteApporteur() {
    }

    public CompteApporteur(String codeCompteApp) {
        this.codeCompteApp = codeCompteApp;
    }

    public String getCodeCompteApp() {
        return codeCompteApp;
    }

    public void setCodeCompteApp(String codeCompteApp) {
        this.codeCompteApp = codeCompteApp;
    }

    public Date getDateCreationCompte() {
        return dateCreationCompte;
    }

    public void setDateCreationCompte(Date dateCreationCompte) {
        this.dateCreationCompte = dateCreationCompte;
    }

    public BigDecimal getTotalComApp() {
        return totalComApp;
    }

    public void setTotalComApp(BigDecimal totalComApp) {
        this.totalComApp = totalComApp;
    }

    public BigDecimal getTotalComPaye() {
        return totalComPaye;
    }

    public void setTotalComPaye(BigDecimal totalComPaye) {
        this.totalComPaye = totalComPaye;
    }

    public BigDecimal getResteComPaye() {
        return resteComPaye;
    }

    public void setResteComPaye(BigDecimal resteComPaye) {
        this.resteComPaye = resteComPaye;
    }

    @XmlTransient
    public List<Apporteur> getApporteurList() {
        return apporteurList;
    }

    public void setApporteurList(List<Apporteur> apporteurList) {
        this.apporteurList = apporteurList;
    }

    @XmlTransient
    public List<ReglementApporteur> getReglementApporteurList() {
        return reglementApporteurList;
    }

    public void setReglementApporteurList(List<ReglementApporteur> reglementApporteurList) {
        this.reglementApporteurList = reglementApporteurList;
    }

    public Apporteur getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(Apporteur codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCompteApp != null ? codeCompteApp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompteApporteur)) {
            return false;
        }
        CompteApporteur other = (CompteApporteur) object;
        if ((this.codeCompteApp == null && other.codeCompteApp != null) || (this.codeCompteApp != null && !this.codeCompteApp.equals(other.codeCompteApp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CompteApporteur[ codeCompteApp=" + codeCompteApp + " ]";
    }
    
}
