/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "reglement_apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementApporteur.findAll", query = "SELECT r FROM ReglementApporteur r"),
    @NamedQuery(name = "ReglementApporteur.findByCodeReglementApp", query = "SELECT r FROM ReglementApporteur r WHERE r.codeReglementApp = :codeReglementApp"),
    @NamedQuery(name = "ReglementApporteur.findByDateReglementApp", query = "SELECT r FROM ReglementApporteur r WHERE r.dateReglementApp = :dateReglementApp"),
    @NamedQuery(name = "ReglementApporteur.findByMontantReglementApp", query = "SELECT r FROM ReglementApporteur r WHERE r.montantReglementApp = :montantReglementApp"),
    @NamedQuery(name = "ReglementApporteur.findByTypeReglement", query = "SELECT r FROM ReglementApporteur r WHERE r.typeReglement = :typeReglement")})
public class ReglementApporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_REGLEMENT_APP")
    private String codeReglementApp;
    @Column(name = "DATE_REGLEMENT_APP")
    @Temporal(TemporalType.DATE)
    private Date dateReglementApp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_REGLEMENT_APP")
    private BigDecimal montantReglementApp;
    @Size(max = 60)
    @Column(name = "TYPE_REGLEMENT")
    private String typeReglement;
    @JoinColumn(name = "CODE_AFFAIRE", referencedColumnName = "CODE_AFFAIRE")
    @ManyToOne(optional = false)
    private AffaireApporteur codeAffaire;
    @JoinColumn(name = "CODE_COMPTE_APP", referencedColumnName = "CODE_COMPTE_APP")
    @ManyToOne
    private CompteApporteur codeCompteApp;

    public ReglementApporteur() {
    }

    public ReglementApporteur(String codeReglementApp) {
        this.codeReglementApp = codeReglementApp;
    }

    public String getCodeReglementApp() {
        return codeReglementApp;
    }

    public void setCodeReglementApp(String codeReglementApp) {
        this.codeReglementApp = codeReglementApp;
    }

    public Date getDateReglementApp() {
        return dateReglementApp;
    }

    public void setDateReglementApp(Date dateReglementApp) {
        this.dateReglementApp = dateReglementApp;
    }

    public BigDecimal getMontantReglementApp() {
        return montantReglementApp;
    }

    public void setMontantReglementApp(BigDecimal montantReglementApp) {
        this.montantReglementApp = montantReglementApp;
    }

    public String getTypeReglement() {
        return typeReglement;
    }

    public void setTypeReglement(String typeReglement) {
        this.typeReglement = typeReglement;
    }

    public AffaireApporteur getCodeAffaire() {
        return codeAffaire;
    }

    public void setCodeAffaire(AffaireApporteur codeAffaire) {
        this.codeAffaire = codeAffaire;
    }

    public CompteApporteur getCodeCompteApp() {
        return codeCompteApp;
    }

    public void setCodeCompteApp(CompteApporteur codeCompteApp) {
        this.codeCompteApp = codeCompteApp;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeReglementApp != null ? codeReglementApp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementApporteur)) {
            return false;
        }
        ReglementApporteur other = (ReglementApporteur) object;
        if ((this.codeReglementApp == null && other.codeReglementApp != null) || (this.codeReglementApp != null && !this.codeReglementApp.equals(other.codeReglementApp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ReglementApporteur[ codeReglementApp=" + codeReglementApp + " ]";
    }
    
}
