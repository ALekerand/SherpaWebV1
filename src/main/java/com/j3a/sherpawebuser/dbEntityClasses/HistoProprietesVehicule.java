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
@Table(name = "histo_proprietes_vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoProprietesVehicule.findAll", query = "SELECT h FROM HistoProprietesVehicule h"),
    @NamedQuery(name = "HistoProprietesVehicule.findByCodeHistoVehicule", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.codeHistoVehicule = :codeHistoVehicule"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNumImmat", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.numImmat = :numImmat"),
    @NamedQuery(name = "HistoProprietesVehicule.findByDateImmat", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.dateImmat = :dateImmat"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNumImmatPrec", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.numImmatPrec = :numImmatPrec"),
    @NamedQuery(name = "HistoProprietesVehicule.findByDateImmatPrec", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.dateImmatPrec = :dateImmatPrec"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNbreCarte", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.nbreCarte = :nbreCarte"),
    @NamedQuery(name = "HistoProprietesVehicule.findByStatut", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.statut = :statut"),
    @NamedQuery(name = "HistoProprietesVehicule.findByGenre", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.genre = :genre"),
    @NamedQuery(name = "HistoProprietesVehicule.findByMarque", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.marque = :marque"),
    @NamedQuery(name = "HistoProprietesVehicule.findByEnergie", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.energie = :energie"),
    @NamedQuery(name = "HistoProprietesVehicule.findByTypeVehicule", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.typeVehicule = :typeVehicule"),
    @NamedQuery(name = "HistoProprietesVehicule.findByTypeCommercial", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.typeCommercial = :typeCommercial"),
    @NamedQuery(name = "HistoProprietesVehicule.findByChassis", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.chassis = :chassis"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNumMoteur", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.numMoteur = :numMoteur"),
    @NamedQuery(name = "HistoProprietesVehicule.findByGage", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.gage = :gage"),
    @NamedQuery(name = "HistoProprietesVehicule.findByPoidsVide", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.poidsVide = :poidsVide"),
    @NamedQuery(name = "HistoProprietesVehicule.findByChargeUtile", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.chargeUtile = :chargeUtile"),
    @NamedQuery(name = "HistoProprietesVehicule.findByPuissFisc", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.puissFisc = :puissFisc"),
    @NamedQuery(name = "HistoProprietesVehicule.findByPuissReelle", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.puissReelle = :puissReelle"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNbrePlaceCab", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.nbrePlaceCab = :nbrePlaceCab"),
    @NamedQuery(name = "HistoProprietesVehicule.findByNbrePlaceHorscab", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.nbrePlaceHorscab = :nbrePlaceHorscab"),
    @NamedQuery(name = "HistoProprietesVehicule.findByValNeuf", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.valNeuf = :valNeuf"),
    @NamedQuery(name = "HistoProprietesVehicule.findByValVenale", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.valVenale = :valVenale"),
    @NamedQuery(name = "HistoProprietesVehicule.findByCouleur", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.couleur = :couleur"),
    @NamedQuery(name = "HistoProprietesVehicule.findByProtection", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.protection = :protection"),
    @NamedQuery(name = "HistoProprietesVehicule.findByDateHisto", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.dateHisto = :dateHisto"),
    @NamedQuery(name = "HistoProprietesVehicule.findByAvenantId", query = "SELECT h FROM HistoProprietesVehicule h WHERE h.avenantId = :avenantId")})
public class HistoProprietesVehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_HISTO_VEHICULE")
    private String codeHistoVehicule;
    @Size(max = 16)
    @Column(name = "NUM_IMMAT")
    private String numImmat;
    @Column(name = "DATE_IMMAT")
    @Temporal(TemporalType.DATE)
    private Date dateImmat;
    @Size(max = 16)
    @Column(name = "NUM_IMMAT_PREC")
    private String numImmatPrec;
    @Column(name = "DATE_IMMAT_PREC")
    @Temporal(TemporalType.DATE)
    private Date dateImmatPrec;
    @Column(name = "NBRE_CARTE")
    private Short nbreCarte;
    @Size(max = 40)
    @Column(name = "STATUT")
    private String statut;
    @Size(max = 20)
    @Column(name = "GENRE")
    private String genre;
    @Size(max = 40)
    @Column(name = "MARQUE")
    private String marque;
    @Size(max = 20)
    @Column(name = "ENERGIE")
    private String energie;
    @Size(max = 100)
    @Column(name = "TYPE_VEHICULE")
    private String typeVehicule;
    @Size(max = 20)
    @Column(name = "TYPE_COMMERCIAL")
    private String typeCommercial;
    @Size(max = 16)
    @Column(name = "CHASSIS")
    private String chassis;
    @Size(max = 16)
    @Column(name = "NUM_MOTEUR")
    private String numMoteur;
    @Size(max = 20)
    @Column(name = "GAGE")
    private String gage;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "POIDS_VIDE")
    private BigDecimal poidsVide;
    @Column(name = "CHARGE_UTILE")
    private BigDecimal chargeUtile;
    @Column(name = "PUISS_FISC")
    private BigDecimal puissFisc;
    @Column(name = "PUISS_REELLE")
    private BigDecimal puissReelle;
    @Column(name = "NBRE_PLACE_CAB")
    private Short nbrePlaceCab;
    @Column(name = "NBRE_PLACE_HORSCAB")
    private Short nbrePlaceHorscab;
    @Column(name = "VAL_NEUF")
    private BigDecimal valNeuf;
    @Column(name = "VAL_VENALE")
    private BigDecimal valVenale;
    @Size(max = 20)
    @Column(name = "COULEUR")
    private String couleur;
    @Size(max = 20)
    @Column(name = "PROTECTION")
    private String protection;
    @Column(name = "DATE_HISTO")
    @Temporal(TemporalType.DATE)
    private Date dateHisto;
    @Size(max = 60)
    @Column(name = "AVENANT_ID")
    private String avenantId;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE")
    @ManyToOne(optional = false)
    private Vehicule codeVehicule;

    public HistoProprietesVehicule() {
    }

    public HistoProprietesVehicule(String codeHistoVehicule) {
        this.codeHistoVehicule = codeHistoVehicule;
    }

    public String getCodeHistoVehicule() {
        return codeHistoVehicule;
    }

    public void setCodeHistoVehicule(String codeHistoVehicule) {
        this.codeHistoVehicule = codeHistoVehicule;
    }

    public String getNumImmat() {
        return numImmat;
    }

    public void setNumImmat(String numImmat) {
        this.numImmat = numImmat;
    }

    public Date getDateImmat() {
        return dateImmat;
    }

    public void setDateImmat(Date dateImmat) {
        this.dateImmat = dateImmat;
    }

    public String getNumImmatPrec() {
        return numImmatPrec;
    }

    public void setNumImmatPrec(String numImmatPrec) {
        this.numImmatPrec = numImmatPrec;
    }

    public Date getDateImmatPrec() {
        return dateImmatPrec;
    }

    public void setDateImmatPrec(Date dateImmatPrec) {
        this.dateImmatPrec = dateImmatPrec;
    }

    public Short getNbreCarte() {
        return nbreCarte;
    }

    public void setNbreCarte(Short nbreCarte) {
        this.nbreCarte = nbreCarte;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getEnergie() {
        return energie;
    }

    public void setEnergie(String energie) {
        this.energie = energie;
    }

    public String getTypeVehicule() {
        return typeVehicule;
    }

    public void setTypeVehicule(String typeVehicule) {
        this.typeVehicule = typeVehicule;
    }

    public String getTypeCommercial() {
        return typeCommercial;
    }

    public void setTypeCommercial(String typeCommercial) {
        this.typeCommercial = typeCommercial;
    }

    public String getChassis() {
        return chassis;
    }

    public void setChassis(String chassis) {
        this.chassis = chassis;
    }

    public String getNumMoteur() {
        return numMoteur;
    }

    public void setNumMoteur(String numMoteur) {
        this.numMoteur = numMoteur;
    }

    public String getGage() {
        return gage;
    }

    public void setGage(String gage) {
        this.gage = gage;
    }

    public BigDecimal getPoidsVide() {
        return poidsVide;
    }

    public void setPoidsVide(BigDecimal poidsVide) {
        this.poidsVide = poidsVide;
    }

    public BigDecimal getChargeUtile() {
        return chargeUtile;
    }

    public void setChargeUtile(BigDecimal chargeUtile) {
        this.chargeUtile = chargeUtile;
    }

    public BigDecimal getPuissFisc() {
        return puissFisc;
    }

    public void setPuissFisc(BigDecimal puissFisc) {
        this.puissFisc = puissFisc;
    }

    public BigDecimal getPuissReelle() {
        return puissReelle;
    }

    public void setPuissReelle(BigDecimal puissReelle) {
        this.puissReelle = puissReelle;
    }

    public Short getNbrePlaceCab() {
        return nbrePlaceCab;
    }

    public void setNbrePlaceCab(Short nbrePlaceCab) {
        this.nbrePlaceCab = nbrePlaceCab;
    }

    public Short getNbrePlaceHorscab() {
        return nbrePlaceHorscab;
    }

    public void setNbrePlaceHorscab(Short nbrePlaceHorscab) {
        this.nbrePlaceHorscab = nbrePlaceHorscab;
    }

    public BigDecimal getValNeuf() {
        return valNeuf;
    }

    public void setValNeuf(BigDecimal valNeuf) {
        this.valNeuf = valNeuf;
    }

    public BigDecimal getValVenale() {
        return valVenale;
    }

    public void setValVenale(BigDecimal valVenale) {
        this.valVenale = valVenale;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public String getProtection() {
        return protection;
    }

    public void setProtection(String protection) {
        this.protection = protection;
    }

    public Date getDateHisto() {
        return dateHisto;
    }

    public void setDateHisto(Date dateHisto) {
        this.dateHisto = dateHisto;
    }

    public String getAvenantId() {
        return avenantId;
    }

    public void setAvenantId(String avenantId) {
        this.avenantId = avenantId;
    }

    public Vehicule getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(Vehicule codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeHistoVehicule != null ? codeHistoVehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoProprietesVehicule)) {
            return false;
        }
        HistoProprietesVehicule other = (HistoProprietesVehicule) object;
        if ((this.codeHistoVehicule == null && other.codeHistoVehicule != null) || (this.codeHistoVehicule != null && !this.codeHistoVehicule.equals(other.codeHistoVehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.HistoProprietesVehicule[ codeHistoVehicule=" + codeHistoVehicule + " ]";
    }
    
}
