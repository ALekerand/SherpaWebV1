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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "habitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Habitation.findAll", query = "SELECT h FROM Habitation h"),
    @NamedQuery(name = "Habitation.findByCodeHabitation", query = "SELECT h FROM Habitation h WHERE h.codeHabitation = :codeHabitation"),
    @NamedQuery(name = "Habitation.findByLocalisation", query = "SELECT h FROM Habitation h WHERE h.localisation = :localisation"),
    @NamedQuery(name = "Habitation.findByConstruction", query = "SELECT h FROM Habitation h WHERE h.construction = :construction"),
    @NamedQuery(name = "Habitation.findByCouverture", query = "SELECT h FROM Habitation h WHERE h.couverture = :couverture"),
    @NamedQuery(name = "Habitation.findBySerrure", query = "SELECT h FROM Habitation h WHERE h.serrure = :serrure"),
    @NamedQuery(name = "Habitation.findByVerrou", query = "SELECT h FROM Habitation h WHERE h.verrou = :verrou"),
    @NamedQuery(name = "Habitation.findByNombrePieces", query = "SELECT h FROM Habitation h WHERE h.nombrePieces = :nombrePieces"),
    @NamedQuery(name = "Habitation.findByNombrePorte", query = "SELECT h FROM Habitation h WHERE h.nombrePorte = :nombrePorte"),
    @NamedQuery(name = "Habitation.findByNombreEtage", query = "SELECT h FROM Habitation h WHERE h.nombreEtage = :nombreEtage"),
    @NamedQuery(name = "Habitation.findBySuperficie", query = "SELECT h FROM Habitation h WHERE h.superficie = :superficie"),
    @NamedQuery(name = "Habitation.findByMontantLoyer", query = "SELECT h FROM Habitation h WHERE h.montantLoyer = :montantLoyer"),
    @NamedQuery(name = "Habitation.findByTypeHabitation", query = "SELECT h FROM Habitation h WHERE h.typeHabitation = :typeHabitation"),
    @NamedQuery(name = "Habitation.findByNaturePorte", query = "SELECT h FROM Habitation h WHERE h.naturePorte = :naturePorte"),
    @NamedQuery(name = "Habitation.findByNatureFenetre", query = "SELECT h FROM Habitation h WHERE h.natureFenetre = :natureFenetre"),
    @NamedQuery(name = "Habitation.findByHabitationUsage", query = "SELECT h FROM Habitation h WHERE h.habitationUsage = :habitationUsage"),
    @NamedQuery(name = "Habitation.findByBeneficiaire", query = "SELECT h FROM Habitation h WHERE h.beneficiaire = :beneficiaire"),
    @NamedQuery(name = "Habitation.findByGardiennage", query = "SELECT h FROM Habitation h WHERE h.gardiennage = :gardiennage"),
    @NamedQuery(name = "Habitation.findByNomenclature", query = "SELECT h FROM Habitation h WHERE h.nomenclature = :nomenclature"),
    @NamedQuery(name = "Habitation.findByZone", query = "SELECT h FROM Habitation h WHERE h.zone = :zone"),
    @NamedQuery(name = "Habitation.findByValeurBatiment", query = "SELECT h FROM Habitation h WHERE h.valeurBatiment = :valeurBatiment"),
    @NamedQuery(name = "Habitation.findByValeurContenu", query = "SELECT h FROM Habitation h WHERE h.valeurContenu = :valeurContenu"),
    @NamedQuery(name = "Habitation.findByObjetPrecieux", query = "SELECT h FROM Habitation h WHERE h.objetPrecieux = :objetPrecieux"),
    @NamedQuery(name = "Habitation.findByRisqueLocatif", query = "SELECT h FROM Habitation h WHERE h.risqueLocatif = :risqueLocatif"),
    @NamedQuery(name = "Habitation.findByStatutHabitation", query = "SELECT h FROM Habitation h WHERE h.statutHabitation = :statutHabitation")})
public class Habitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_HABITATION")
    private String codeHabitation;
    @Size(max = 70)
    @Column(name = "LOCALISATION")
    private String localisation;
    @Size(max = 50)
    @Column(name = "CONSTRUCTION")
    private String construction;
    @Size(max = 50)
    @Column(name = "COUVERTURE")
    private String couverture;
    @Column(name = "SERRURE")
    private Integer serrure;
    @Column(name = "VERROU")
    private Integer verrou;
    @Column(name = "NOMBRE_PIECES")
    private Integer nombrePieces;
    @Column(name = "NOMBRE_PORTE")
    private Integer nombrePorte;
    @Column(name = "NOMBRE_ETAGE")
    private Integer nombreEtage;
    @Column(name = "SUPERFICIE")
    private Integer superficie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_LOYER")
    private BigDecimal montantLoyer;
    @Size(max = 50)
    @Column(name = "TYPE_HABITATION")
    private String typeHabitation;
    @Size(max = 50)
    @Column(name = "NATURE_PORTE")
    private String naturePorte;
    @Size(max = 50)
    @Column(name = "NATURE_FENETRE")
    private String natureFenetre;
    @Size(max = 50)
    @Column(name = "HABITATION_USAGE")
    private String habitationUsage;
    @Size(max = 50)
    @Column(name = "BENEFICIAIRE")
    private String beneficiaire;
    @Size(max = 50)
    @Column(name = "GARDIENNAGE")
    private String gardiennage;
    @Size(max = 50)
    @Column(name = "NOMENCLATURE")
    private String nomenclature;
    @Size(max = 50)
    @Column(name = "ZONE")
    private String zone;
    @Column(name = "VALEUR_BATIMENT")
    private BigDecimal valeurBatiment;
    @Column(name = "VALEUR_CONTENU")
    private BigDecimal valeurContenu;
    @Column(name = "OBJET_PRECIEUX")
    private BigDecimal objetPrecieux;
    @Column(name = "RISQUE_LOCATIF")
    private BigDecimal risqueLocatif;
    @Size(max = 30)
    @Column(name = "STATUT_HABITATION")
    private String statutHabitation;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitation")
    private List<HabitationSinistre> habitationSinistreList;
    @OneToMany(mappedBy = "codeHabitation")
    private List<GarantieChoisieMrh> garantieChoisieMrhList;
    @JoinColumn(name = "CODE_LISTE_HABITATION", referencedColumnName = "CODE_LISTE_HABITATION")
    @ManyToOne
    private ListeHabitation codeListeHabitation;
    @JoinColumn(name = "CODE_CLASSE_MRH", referencedColumnName = "CODE_CLASSE_MRH")
    @ManyToOne
    private ClasseMrh codeClasseMrh;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "habitation")
    private List<ApporteurHabitation> apporteurHabitationList;

    public Habitation() {
    }

    public Habitation(String codeHabitation) {
        this.codeHabitation = codeHabitation;
    }

    public String getCodeHabitation() {
        return codeHabitation;
    }

    public void setCodeHabitation(String codeHabitation) {
        this.codeHabitation = codeHabitation;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    public String getConstruction() {
        return construction;
    }

    public void setConstruction(String construction) {
        this.construction = construction;
    }

    public String getCouverture() {
        return couverture;
    }

    public void setCouverture(String couverture) {
        this.couverture = couverture;
    }

    public Integer getSerrure() {
        return serrure;
    }

    public void setSerrure(Integer serrure) {
        this.serrure = serrure;
    }

    public Integer getVerrou() {
        return verrou;
    }

    public void setVerrou(Integer verrou) {
        this.verrou = verrou;
    }

    public Integer getNombrePieces() {
        return nombrePieces;
    }

    public void setNombrePieces(Integer nombrePieces) {
        this.nombrePieces = nombrePieces;
    }

    public Integer getNombrePorte() {
        return nombrePorte;
    }

    public void setNombrePorte(Integer nombrePorte) {
        this.nombrePorte = nombrePorte;
    }

    public Integer getNombreEtage() {
        return nombreEtage;
    }

    public void setNombreEtage(Integer nombreEtage) {
        this.nombreEtage = nombreEtage;
    }

    public Integer getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Integer superficie) {
        this.superficie = superficie;
    }

    public BigDecimal getMontantLoyer() {
        return montantLoyer;
    }

    public void setMontantLoyer(BigDecimal montantLoyer) {
        this.montantLoyer = montantLoyer;
    }

    public String getTypeHabitation() {
        return typeHabitation;
    }

    public void setTypeHabitation(String typeHabitation) {
        this.typeHabitation = typeHabitation;
    }

    public String getNaturePorte() {
        return naturePorte;
    }

    public void setNaturePorte(String naturePorte) {
        this.naturePorte = naturePorte;
    }

    public String getNatureFenetre() {
        return natureFenetre;
    }

    public void setNatureFenetre(String natureFenetre) {
        this.natureFenetre = natureFenetre;
    }

    public String getHabitationUsage() {
        return habitationUsage;
    }

    public void setHabitationUsage(String habitationUsage) {
        this.habitationUsage = habitationUsage;
    }

    public String getBeneficiaire() {
        return beneficiaire;
    }

    public void setBeneficiaire(String beneficiaire) {
        this.beneficiaire = beneficiaire;
    }

    public String getGardiennage() {
        return gardiennage;
    }

    public void setGardiennage(String gardiennage) {
        this.gardiennage = gardiennage;
    }

    public String getNomenclature() {
        return nomenclature;
    }

    public void setNomenclature(String nomenclature) {
        this.nomenclature = nomenclature;
    }

    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    public BigDecimal getValeurBatiment() {
        return valeurBatiment;
    }

    public void setValeurBatiment(BigDecimal valeurBatiment) {
        this.valeurBatiment = valeurBatiment;
    }

    public BigDecimal getValeurContenu() {
        return valeurContenu;
    }

    public void setValeurContenu(BigDecimal valeurContenu) {
        this.valeurContenu = valeurContenu;
    }

    public BigDecimal getObjetPrecieux() {
        return objetPrecieux;
    }

    public void setObjetPrecieux(BigDecimal objetPrecieux) {
        this.objetPrecieux = objetPrecieux;
    }

    public BigDecimal getRisqueLocatif() {
        return risqueLocatif;
    }

    public void setRisqueLocatif(BigDecimal risqueLocatif) {
        this.risqueLocatif = risqueLocatif;
    }

    public String getStatutHabitation() {
        return statutHabitation;
    }

    public void setStatutHabitation(String statutHabitation) {
        this.statutHabitation = statutHabitation;
    }

    @XmlTransient
    public List<HabitationSinistre> getHabitationSinistreList() {
        return habitationSinistreList;
    }

    public void setHabitationSinistreList(List<HabitationSinistre> habitationSinistreList) {
        this.habitationSinistreList = habitationSinistreList;
    }

    @XmlTransient
    public List<GarantieChoisieMrh> getGarantieChoisieMrhList() {
        return garantieChoisieMrhList;
    }

    public void setGarantieChoisieMrhList(List<GarantieChoisieMrh> garantieChoisieMrhList) {
        this.garantieChoisieMrhList = garantieChoisieMrhList;
    }

    public ListeHabitation getCodeListeHabitation() {
        return codeListeHabitation;
    }

    public void setCodeListeHabitation(ListeHabitation codeListeHabitation) {
        this.codeListeHabitation = codeListeHabitation;
    }

    public ClasseMrh getCodeClasseMrh() {
        return codeClasseMrh;
    }

    public void setCodeClasseMrh(ClasseMrh codeClasseMrh) {
        this.codeClasseMrh = codeClasseMrh;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @XmlTransient
    public List<ApporteurHabitation> getApporteurHabitationList() {
        return apporteurHabitationList;
    }

    public void setApporteurHabitationList(List<ApporteurHabitation> apporteurHabitationList) {
        this.apporteurHabitationList = apporteurHabitationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeHabitation != null ? codeHabitation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Habitation)) {
            return false;
        }
        Habitation other = (Habitation) object;
        if ((this.codeHabitation == null && other.codeHabitation != null) || (this.codeHabitation != null && !this.codeHabitation.equals(other.codeHabitation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Habitation[ codeHabitation=" + codeHabitation + " ]";
    }
    
}
