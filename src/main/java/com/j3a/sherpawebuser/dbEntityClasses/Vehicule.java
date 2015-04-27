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
@Table(name = "vehicule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vehicule.findAll", query = "SELECT v FROM Vehicule v"),
    @NamedQuery(name = "Vehicule.findByCodeVehicule", query = "SELECT v FROM Vehicule v WHERE v.codeVehicule = :codeVehicule"),
    @NamedQuery(name = "Vehicule.findByNumImmat", query = "SELECT v FROM Vehicule v WHERE v.numImmat = :numImmat"),
    @NamedQuery(name = "Vehicule.findByDateImmat", query = "SELECT v FROM Vehicule v WHERE v.dateImmat = :dateImmat"),
    @NamedQuery(name = "Vehicule.findByNumImmatPrec", query = "SELECT v FROM Vehicule v WHERE v.numImmatPrec = :numImmatPrec"),
    @NamedQuery(name = "Vehicule.findByDateImmatPrec", query = "SELECT v FROM Vehicule v WHERE v.dateImmatPrec = :dateImmatPrec"),
    @NamedQuery(name = "Vehicule.findByNbreCarte", query = "SELECT v FROM Vehicule v WHERE v.nbreCarte = :nbreCarte"),
    @NamedQuery(name = "Vehicule.findByDatePremiereCirc", query = "SELECT v FROM Vehicule v WHERE v.datePremiereCirc = :datePremiereCirc"),
    @NamedQuery(name = "Vehicule.findByStatut", query = "SELECT v FROM Vehicule v WHERE v.statut = :statut"),
    @NamedQuery(name = "Vehicule.findByGenre", query = "SELECT v FROM Vehicule v WHERE v.genre = :genre"),
    @NamedQuery(name = "Vehicule.findByMarque", query = "SELECT v FROM Vehicule v WHERE v.marque = :marque"),
    @NamedQuery(name = "Vehicule.findByEnergie", query = "SELECT v FROM Vehicule v WHERE v.energie = :energie"),
    @NamedQuery(name = "Vehicule.findByTypeVehicule", query = "SELECT v FROM Vehicule v WHERE v.typeVehicule = :typeVehicule"),
    @NamedQuery(name = "Vehicule.findByTypeCommercial", query = "SELECT v FROM Vehicule v WHERE v.typeCommercial = :typeCommercial"),
    @NamedQuery(name = "Vehicule.findByChassis", query = "SELECT v FROM Vehicule v WHERE v.chassis = :chassis"),
    @NamedQuery(name = "Vehicule.findByNumMoteur", query = "SELECT v FROM Vehicule v WHERE v.numMoteur = :numMoteur"),
    @NamedQuery(name = "Vehicule.findByGage", query = "SELECT v FROM Vehicule v WHERE v.gage = :gage"),
    @NamedQuery(name = "Vehicule.findByPoidsVide", query = "SELECT v FROM Vehicule v WHERE v.poidsVide = :poidsVide"),
    @NamedQuery(name = "Vehicule.findByChargeUtile", query = "SELECT v FROM Vehicule v WHERE v.chargeUtile = :chargeUtile"),
    @NamedQuery(name = "Vehicule.findByPuissFisc", query = "SELECT v FROM Vehicule v WHERE v.puissFisc = :puissFisc"),
    @NamedQuery(name = "Vehicule.findByPuissReelle", query = "SELECT v FROM Vehicule v WHERE v.puissReelle = :puissReelle"),
    @NamedQuery(name = "Vehicule.findByNbrePlaceCab", query = "SELECT v FROM Vehicule v WHERE v.nbrePlaceCab = :nbrePlaceCab"),
    @NamedQuery(name = "Vehicule.findByNbrePlaceHorscab", query = "SELECT v FROM Vehicule v WHERE v.nbrePlaceHorscab = :nbrePlaceHorscab"),
    @NamedQuery(name = "Vehicule.findByValNeuf", query = "SELECT v FROM Vehicule v WHERE v.valNeuf = :valNeuf"),
    @NamedQuery(name = "Vehicule.findByValVenale", query = "SELECT v FROM Vehicule v WHERE v.valVenale = :valVenale"),
    @NamedQuery(name = "Vehicule.findByCouleur", query = "SELECT v FROM Vehicule v WHERE v.couleur = :couleur"),
    @NamedQuery(name = "Vehicule.findByProtection", query = "SELECT v FROM Vehicule v WHERE v.protection = :protection"),
    @NamedQuery(name = "Vehicule.findByCarrosserie", query = "SELECT v FROM Vehicule v WHERE v.carrosserie = :carrosserie"),
    @NamedQuery(name = "Vehicule.findByRemorque", query = "SELECT v FROM Vehicule v WHERE v.remorque = :remorque"),
    @NamedQuery(name = "Vehicule.findByTypeTransporte", query = "SELECT v FROM Vehicule v WHERE v.typeTransporte = :typeTransporte"),
    @NamedQuery(name = "Vehicule.findByNbreTransporte", query = "SELECT v FROM Vehicule v WHERE v.nbreTransporte = :nbreTransporte")})
public class Vehicule implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_VEHICULE")
    private String codeVehicule;
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
    @Column(name = "DATE_PREMIERE_CIRC")
    @Temporal(TemporalType.DATE)
    private Date datePremiereCirc;
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
    @Size(max = 50)
    @Column(name = "CARROSSERIE")
    private String carrosserie;
    @Column(name = "REMORQUE")
    private Boolean remorque;
    @Size(max = 200)
    @Column(name = "TYPE_TRANSPORTE")
    private String typeTransporte;
    @Column(name = "NBRE_TRANSPORTE")
    private Short nbreTransporte;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeVehicule")
    private List<HistoProprietesVehicule> histoProprietesVehiculeList;
    @JoinColumn(name = "ID_VEHICULES_ASSURES", referencedColumnName = "ID_VEHICULES_ASSURES")
    @ManyToOne
    private VehiculesAssures idVehiculesAssures;
    @JoinColumn(name = "CODE_SOUS_CAT_VEHICULE", referencedColumnName = "CODE_SOUS_CAT_VEHICULE")
    @ManyToOne(optional = false)
    private SousCatVehicule codeSousCatVehicule;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private List<VehiculeSinistre> vehiculeSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeVehicule")
    private List<GarantieChoisie> garantieChoisieList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private List<ConduireVehicule> conduireVehiculeList;
    @OneToMany(mappedBy = "codeVehicule")
    private List<Attestation> attestationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private List<ApporteurVehicule> apporteurVehiculeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vehicule")
    private List<VehiculeZoneGeographique> vehiculeZoneGeographiqueList;
    @OneToMany(mappedBy = "codeVehicule")
    private List<HistoMouvement> histoMouvementList;

    public Vehicule() {
    }

    public Vehicule(String codeVehicule) {
        this.codeVehicule = codeVehicule;
    }

    public String getCodeVehicule() {
        return codeVehicule;
    }

    public void setCodeVehicule(String codeVehicule) {
        this.codeVehicule = codeVehicule;
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

    public Date getDatePremiereCirc() {
        return datePremiereCirc;
    }

    public void setDatePremiereCirc(Date datePremiereCirc) {
        this.datePremiereCirc = datePremiereCirc;
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

    public String getCarrosserie() {
        return carrosserie;
    }

    public void setCarrosserie(String carrosserie) {
        this.carrosserie = carrosserie;
    }

    public Boolean getRemorque() {
        return remorque;
    }

    public void setRemorque(Boolean remorque) {
        this.remorque = remorque;
    }

    public String getTypeTransporte() {
        return typeTransporte;
    }

    public void setTypeTransporte(String typeTransporte) {
        this.typeTransporte = typeTransporte;
    }

    public Short getNbreTransporte() {
        return nbreTransporte;
    }

    public void setNbreTransporte(Short nbreTransporte) {
        this.nbreTransporte = nbreTransporte;
    }

    @XmlTransient
    public List<HistoProprietesVehicule> getHistoProprietesVehiculeList() {
        return histoProprietesVehiculeList;
    }

    public void setHistoProprietesVehiculeList(List<HistoProprietesVehicule> histoProprietesVehiculeList) {
        this.histoProprietesVehiculeList = histoProprietesVehiculeList;
    }

    public VehiculesAssures getIdVehiculesAssures() {
        return idVehiculesAssures;
    }

    public void setIdVehiculesAssures(VehiculesAssures idVehiculesAssures) {
        this.idVehiculesAssures = idVehiculesAssures;
    }

    public SousCatVehicule getCodeSousCatVehicule() {
        return codeSousCatVehicule;
    }

    public void setCodeSousCatVehicule(SousCatVehicule codeSousCatVehicule) {
        this.codeSousCatVehicule = codeSousCatVehicule;
    }

    @XmlTransient
    public List<VehiculeSinistre> getVehiculeSinistreList() {
        return vehiculeSinistreList;
    }

    public void setVehiculeSinistreList(List<VehiculeSinistre> vehiculeSinistreList) {
        this.vehiculeSinistreList = vehiculeSinistreList;
    }

    @XmlTransient
    public List<GarantieChoisie> getGarantieChoisieList() {
        return garantieChoisieList;
    }

    public void setGarantieChoisieList(List<GarantieChoisie> garantieChoisieList) {
        this.garantieChoisieList = garantieChoisieList;
    }

    @XmlTransient
    public List<ConduireVehicule> getConduireVehiculeList() {
        return conduireVehiculeList;
    }

    public void setConduireVehiculeList(List<ConduireVehicule> conduireVehiculeList) {
        this.conduireVehiculeList = conduireVehiculeList;
    }

    @XmlTransient
    public List<Attestation> getAttestationList() {
        return attestationList;
    }

    public void setAttestationList(List<Attestation> attestationList) {
        this.attestationList = attestationList;
    }

    @XmlTransient
    public List<ApporteurVehicule> getApporteurVehiculeList() {
        return apporteurVehiculeList;
    }

    public void setApporteurVehiculeList(List<ApporteurVehicule> apporteurVehiculeList) {
        this.apporteurVehiculeList = apporteurVehiculeList;
    }

    @XmlTransient
    public List<VehiculeZoneGeographique> getVehiculeZoneGeographiqueList() {
        return vehiculeZoneGeographiqueList;
    }

    public void setVehiculeZoneGeographiqueList(List<VehiculeZoneGeographique> vehiculeZoneGeographiqueList) {
        this.vehiculeZoneGeographiqueList = vehiculeZoneGeographiqueList;
    }

    @XmlTransient
    public List<HistoMouvement> getHistoMouvementList() {
        return histoMouvementList;
    }

    public void setHistoMouvementList(List<HistoMouvement> histoMouvementList) {
        this.histoMouvementList = histoMouvementList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeVehicule != null ? codeVehicule.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vehicule)) {
            return false;
        }
        Vehicule other = (Vehicule) object;
        if ((this.codeVehicule == null && other.codeVehicule != null) || (this.codeVehicule != null && !this.codeVehicule.equals(other.codeVehicule))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Vehicule[ codeVehicule=" + codeVehicule + " ]";
    }
    
}
