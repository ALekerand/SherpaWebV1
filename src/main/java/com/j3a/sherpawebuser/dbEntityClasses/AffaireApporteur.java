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
import javax.persistence.CascadeType;
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
@Table(name = "affaire_apporteur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AffaireApporteur.findAll", query = "SELECT a FROM AffaireApporteur a"),
    @NamedQuery(name = "AffaireApporteur.findByCodeAffaire", query = "SELECT a FROM AffaireApporteur a WHERE a.codeAffaire = :codeAffaire"),
    @NamedQuery(name = "AffaireApporteur.findByNumeroPoliceAff", query = "SELECT a FROM AffaireApporteur a WHERE a.numeroPoliceAff = :numeroPoliceAff"),
    @NamedQuery(name = "AffaireApporteur.findByNumAvenantAff", query = "SELECT a FROM AffaireApporteur a WHERE a.numAvenantAff = :numAvenantAff"),
    @NamedQuery(name = "AffaireApporteur.findByComAff", query = "SELECT a FROM AffaireApporteur a WHERE a.comAff = :comAff"),
    @NamedQuery(name = "AffaireApporteur.findByDateAff", query = "SELECT a FROM AffaireApporteur a WHERE a.dateAff = :dateAff"),
    @NamedQuery(name = "AffaireApporteur.findByEtatReglAff", query = "SELECT a FROM AffaireApporteur a WHERE a.etatReglAff = :etatReglAff"),
    @NamedQuery(name = "AffaireApporteur.findByResteAPayerAff", query = "SELECT a FROM AffaireApporteur a WHERE a.resteAPayerAff = :resteAPayerAff"),
    @NamedQuery(name = "AffaireApporteur.findByMouvementAffApp", query = "SELECT a FROM AffaireApporteur a WHERE a.mouvementAffApp = :mouvementAffApp")})
public class AffaireApporteur implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_AFFAIRE")
    private String codeAffaire;
    @Size(max = 20)
    @Column(name = "NUMERO_POLICE_AFF")
    private String numeroPoliceAff;
    @Size(max = 25)
    @Column(name = "NUM_AVENANT_AFF")
    private String numAvenantAff;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COM_AFF")
    private BigDecimal comAff;
    @Column(name = "DATE_AFF")
    @Temporal(TemporalType.DATE)
    private Date dateAff;
    @Size(max = 15)
    @Column(name = "ETAT_REGL_AFF")
    private String etatReglAff;
    @Column(name = "RESTE_A_PAYER_AFF")
    private BigDecimal resteAPayerAff;
    @Size(max = 40)
    @Column(name = "MouvementAffApp")
    private String mouvementAffApp;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR")
    @ManyToOne(optional = false)
    private Apporteur codeApporteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeAffaire")
    private List<ReglementApporteur> reglementApporteurList;

    public AffaireApporteur() {
    }

    public AffaireApporteur(String codeAffaire) {
        this.codeAffaire = codeAffaire;
    }

    public String getCodeAffaire() {
        return codeAffaire;
    }

    public void setCodeAffaire(String codeAffaire) {
        this.codeAffaire = codeAffaire;
    }

    public String getNumeroPoliceAff() {
        return numeroPoliceAff;
    }

    public void setNumeroPoliceAff(String numeroPoliceAff) {
        this.numeroPoliceAff = numeroPoliceAff;
    }

    public String getNumAvenantAff() {
        return numAvenantAff;
    }

    public void setNumAvenantAff(String numAvenantAff) {
        this.numAvenantAff = numAvenantAff;
    }

    public BigDecimal getComAff() {
        return comAff;
    }

    public void setComAff(BigDecimal comAff) {
        this.comAff = comAff;
    }

    public Date getDateAff() {
        return dateAff;
    }

    public void setDateAff(Date dateAff) {
        this.dateAff = dateAff;
    }

    public String getEtatReglAff() {
        return etatReglAff;
    }

    public void setEtatReglAff(String etatReglAff) {
        this.etatReglAff = etatReglAff;
    }

    public BigDecimal getResteAPayerAff() {
        return resteAPayerAff;
    }

    public void setResteAPayerAff(BigDecimal resteAPayerAff) {
        this.resteAPayerAff = resteAPayerAff;
    }

    public String getMouvementAffApp() {
        return mouvementAffApp;
    }

    public void setMouvementAffApp(String mouvementAffApp) {
        this.mouvementAffApp = mouvementAffApp;
    }

    public Apporteur getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(Apporteur codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    @XmlTransient
    public List<ReglementApporteur> getReglementApporteurList() {
        return reglementApporteurList;
    }

    public void setReglementApporteurList(List<ReglementApporteur> reglementApporteurList) {
        this.reglementApporteurList = reglementApporteurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAffaire != null ? codeAffaire.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AffaireApporteur)) {
            return false;
        }
        AffaireApporteur other = (AffaireApporteur) object;
        if ((this.codeAffaire == null && other.codeAffaire != null) || (this.codeAffaire != null && !this.codeAffaire.equals(other.codeAffaire))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AffaireApporteur[ codeAffaire=" + codeAffaire + " ]";
    }
    
}
