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
@Table(name = "corps_engin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorpsEngin.findAll", query = "SELECT c FROM CorpsEngin c"),
    @NamedQuery(name = "CorpsEngin.findByCodeEngin", query = "SELECT c FROM CorpsEngin c WHERE c.codeEngin = :codeEngin"),
    @NamedQuery(name = "CorpsEngin.findByEmbarcation", query = "SELECT c FROM CorpsEngin c WHERE c.embarcation = :embarcation"),
    @NamedQuery(name = "CorpsEngin.findByArmateur", query = "SELECT c FROM CorpsEngin c WHERE c.armateur = :armateur"),
    @NamedQuery(name = "CorpsEngin.findByNumImmatEngin", query = "SELECT c FROM CorpsEngin c WHERE c.numImmatEngin = :numImmatEngin"),
    @NamedQuery(name = "CorpsEngin.findByDateImmatEngin", query = "SELECT c FROM CorpsEngin c WHERE c.dateImmatEngin = :dateImmatEngin"),
    @NamedQuery(name = "CorpsEngin.findByTypeEmbarcation", query = "SELECT c FROM CorpsEngin c WHERE c.typeEmbarcation = :typeEmbarcation"),
    @NamedQuery(name = "CorpsEngin.findByAnneeConstruction", query = "SELECT c FROM CorpsEngin c WHERE c.anneeConstruction = :anneeConstruction"),
    @NamedQuery(name = "CorpsEngin.findByAge", query = "SELECT c FROM CorpsEngin c WHERE c.age = :age"),
    @NamedQuery(name = "CorpsEngin.findByPavillonEngin", query = "SELECT c FROM CorpsEngin c WHERE c.pavillonEngin = :pavillonEngin"),
    @NamedQuery(name = "CorpsEngin.findByTypeCoque", query = "SELECT c FROM CorpsEngin c WHERE c.typeCoque = :typeCoque"),
    @NamedQuery(name = "CorpsEngin.findByPropulsion", query = "SELECT c FROM CorpsEngin c WHERE c.propulsion = :propulsion"),
    @NamedQuery(name = "CorpsEngin.findByJaugeBrute", query = "SELECT c FROM CorpsEngin c WHERE c.jaugeBrute = :jaugeBrute"),
    @NamedQuery(name = "CorpsEngin.findByJaugeNette", query = "SELECT c FROM CorpsEngin c WHERE c.jaugeNette = :jaugeNette"),
    @NamedQuery(name = "CorpsEngin.findByLongueurEngin", query = "SELECT c FROM CorpsEngin c WHERE c.longueurEngin = :longueurEngin"),
    @NamedQuery(name = "CorpsEngin.findByLargeurEngin", query = "SELECT c FROM CorpsEngin c WHERE c.largeurEngin = :largeurEngin"),
    @NamedQuery(name = "CorpsEngin.findByNbreMoteurEngin", query = "SELECT c FROM CorpsEngin c WHERE c.nbreMoteurEngin = :nbreMoteurEngin"),
    @NamedQuery(name = "CorpsEngin.findByMarqueMoteurEngin", query = "SELECT c FROM CorpsEngin c WHERE c.marqueMoteurEngin = :marqueMoteurEngin"),
    @NamedQuery(name = "CorpsEngin.findByValeurMoteurEngin", query = "SELECT c FROM CorpsEngin c WHERE c.valeurMoteurEngin = :valeurMoteurEngin"),
    @NamedQuery(name = "CorpsEngin.findByPuissanceEngin", query = "SELECT c FROM CorpsEngin c WHERE c.puissanceEngin = :puissanceEngin"),
    @NamedQuery(name = "CorpsEngin.findByEnergieEngin", query = "SELECT c FROM CorpsEngin c WHERE c.energieEngin = :energieEngin"),
    @NamedQuery(name = "CorpsEngin.findByCatNavigation", query = "SELECT c FROM CorpsEngin c WHERE c.catNavigation = :catNavigation"),
    @NamedQuery(name = "CorpsEngin.findByGenreEngin", query = "SELECT c FROM CorpsEngin c WHERE c.genreEngin = :genreEngin"),
    @NamedQuery(name = "CorpsEngin.findByValCoqueEngin", query = "SELECT c FROM CorpsEngin c WHERE c.valCoqueEngin = :valCoqueEngin"),
    @NamedQuery(name = "CorpsEngin.findByValeurAccessoireEngin", query = "SELECT c FROM CorpsEngin c WHERE c.valeurAccessoireEngin = :valeurAccessoireEngin"),
    @NamedQuery(name = "CorpsEngin.findByValeurNeufEngin", query = "SELECT c FROM CorpsEngin c WHERE c.valeurNeufEngin = :valeurNeufEngin"),
    @NamedQuery(name = "CorpsEngin.findByValeurVenaleEngin", query = "SELECT c FROM CorpsEngin c WHERE c.valeurVenaleEngin = :valeurVenaleEngin"),
    @NamedQuery(name = "CorpsEngin.findByFraisRetirement", query = "SELECT c FROM CorpsEngin c WHERE c.fraisRetirement = :fraisRetirement"),
    @NamedQuery(name = "CorpsEngin.findByLimiteNavigation", query = "SELECT c FROM CorpsEngin c WHERE c.limiteNavigation = :limiteNavigation"),
    @NamedQuery(name = "CorpsEngin.findBySystProtection", query = "SELECT c FROM CorpsEngin c WHERE c.systProtection = :systProtection"),
    @NamedQuery(name = "CorpsEngin.findByPortDattach", query = "SELECT c FROM CorpsEngin c WHERE c.portDattach = :portDattach"),
    @NamedQuery(name = "CorpsEngin.findByNbrePassagerEngin", query = "SELECT c FROM CorpsEngin c WHERE c.nbrePassagerEngin = :nbrePassagerEngin"),
    @NamedQuery(name = "CorpsEngin.findByNbreEquipagesEngin", query = "SELECT c FROM CorpsEngin c WHERE c.nbreEquipagesEngin = :nbreEquipagesEngin")})
public class CorpsEngin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_ENGIN")
    private String codeEngin;
    @Size(max = 60)
    @Column(name = "EMBARCATION")
    private String embarcation;
    @Size(max = 60)
    @Column(name = "ARMATEUR")
    private String armateur;
    @Size(max = 20)
    @Column(name = "NUM_IMMAT_ENGIN")
    private String numImmatEngin;
    @Column(name = "DATE_IMMAT_ENGIN")
    @Temporal(TemporalType.DATE)
    private Date dateImmatEngin;
    @Size(max = 60)
    @Column(name = "TYPE_EMBARCATION")
    private String typeEmbarcation;
    @Column(name = "ANNEE_CONSTRUCTION")
    private Integer anneeConstruction;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 60)
    @Column(name = "PAVILLON_ENGIN")
    private String pavillonEngin;
    @Size(max = 60)
    @Column(name = "TYPE_COQUE")
    private String typeCoque;
    @Size(max = 30)
    @Column(name = "PROPULSION")
    private String propulsion;
    @Column(name = "JAUGE_BRUTE")
    private Integer jaugeBrute;
    @Column(name = "JAUGE_NETTE")
    private Integer jaugeNette;
    @Column(name = "LONGUEUR_ENGIN")
    private Integer longueurEngin;
    @Column(name = "LARGEUR_ENGIN")
    private Integer largeurEngin;
    @Column(name = "NBRE_MOTEUR_ENGIN")
    private Integer nbreMoteurEngin;
    @Size(max = 60)
    @Column(name = "MARQUE_MOTEUR_ENGIN")
    private String marqueMoteurEngin;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALEUR_MOTEUR_ENGIN")
    private BigDecimal valeurMoteurEngin;
    @Column(name = "PUISSANCE_ENGIN")
    private Integer puissanceEngin;
    @Size(max = 15)
    @Column(name = "ENERGIE_ENGIN")
    private String energieEngin;
    @Size(max = 10)
    @Column(name = "CAT_NAVIGATION")
    private String catNavigation;
    @Size(max = 16)
    @Column(name = "GENRE_ENGIN")
    private String genreEngin;
    @Column(name = "VAL_COQUE_ENGIN")
    private BigDecimal valCoqueEngin;
    @Column(name = "VALEUR_ACCESSOIRE_ENGIN")
    private BigDecimal valeurAccessoireEngin;
    @Column(name = "VALEUR_NEUF_ENGIN")
    private BigDecimal valeurNeufEngin;
    @Column(name = "VALEUR_VENALE_ENGIN")
    private BigDecimal valeurVenaleEngin;
    @Column(name = "FRAIS_RETIREMENT")
    private BigDecimal fraisRetirement;
    @Size(max = 60)
    @Column(name = "LIMITE_NAVIGATION")
    private String limiteNavigation;
    @Size(max = 30)
    @Column(name = "SYST_PROTECTION")
    private String systProtection;
    @Size(max = 50)
    @Column(name = "PORT_DATTACH")
    private String portDattach;
    @Column(name = "NBRE_PASSAGER_ENGIN")
    private Integer nbrePassagerEngin;
    @Column(name = "NBRE_EQUIPAGES_ENGIN")
    private Integer nbreEquipagesEngin;
    @OneToMany(mappedBy = "codeEngin")
    private List<GarantieChoisieTransportCorps> garantieChoisieTransportCorpsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corpsEngin")
    private List<ApporteurCorpsEngin> apporteurCorpsEnginList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @JoinColumn(name = "CODE_LISTE_CORPS_ENGIN", referencedColumnName = "CODE_LISTE_CORPS_ENGIN")
    @ManyToOne
    private ListeCorpsEngin codeListeCorpsEngin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "corpsEngin")
    private List<CorpsSinistre> corpsSinistreList;

    public CorpsEngin() {
    }

    public CorpsEngin(String codeEngin) {
        this.codeEngin = codeEngin;
    }

    public String getCodeEngin() {
        return codeEngin;
    }

    public void setCodeEngin(String codeEngin) {
        this.codeEngin = codeEngin;
    }

    public String getEmbarcation() {
        return embarcation;
    }

    public void setEmbarcation(String embarcation) {
        this.embarcation = embarcation;
    }

    public String getArmateur() {
        return armateur;
    }

    public void setArmateur(String armateur) {
        this.armateur = armateur;
    }

    public String getNumImmatEngin() {
        return numImmatEngin;
    }

    public void setNumImmatEngin(String numImmatEngin) {
        this.numImmatEngin = numImmatEngin;
    }

    public Date getDateImmatEngin() {
        return dateImmatEngin;
    }

    public void setDateImmatEngin(Date dateImmatEngin) {
        this.dateImmatEngin = dateImmatEngin;
    }

    public String getTypeEmbarcation() {
        return typeEmbarcation;
    }

    public void setTypeEmbarcation(String typeEmbarcation) {
        this.typeEmbarcation = typeEmbarcation;
    }

    public Integer getAnneeConstruction() {
        return anneeConstruction;
    }

    public void setAnneeConstruction(Integer anneeConstruction) {
        this.anneeConstruction = anneeConstruction;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPavillonEngin() {
        return pavillonEngin;
    }

    public void setPavillonEngin(String pavillonEngin) {
        this.pavillonEngin = pavillonEngin;
    }

    public String getTypeCoque() {
        return typeCoque;
    }

    public void setTypeCoque(String typeCoque) {
        this.typeCoque = typeCoque;
    }

    public String getPropulsion() {
        return propulsion;
    }

    public void setPropulsion(String propulsion) {
        this.propulsion = propulsion;
    }

    public Integer getJaugeBrute() {
        return jaugeBrute;
    }

    public void setJaugeBrute(Integer jaugeBrute) {
        this.jaugeBrute = jaugeBrute;
    }

    public Integer getJaugeNette() {
        return jaugeNette;
    }

    public void setJaugeNette(Integer jaugeNette) {
        this.jaugeNette = jaugeNette;
    }

    public Integer getLongueurEngin() {
        return longueurEngin;
    }

    public void setLongueurEngin(Integer longueurEngin) {
        this.longueurEngin = longueurEngin;
    }

    public Integer getLargeurEngin() {
        return largeurEngin;
    }

    public void setLargeurEngin(Integer largeurEngin) {
        this.largeurEngin = largeurEngin;
    }

    public Integer getNbreMoteurEngin() {
        return nbreMoteurEngin;
    }

    public void setNbreMoteurEngin(Integer nbreMoteurEngin) {
        this.nbreMoteurEngin = nbreMoteurEngin;
    }

    public String getMarqueMoteurEngin() {
        return marqueMoteurEngin;
    }

    public void setMarqueMoteurEngin(String marqueMoteurEngin) {
        this.marqueMoteurEngin = marqueMoteurEngin;
    }

    public BigDecimal getValeurMoteurEngin() {
        return valeurMoteurEngin;
    }

    public void setValeurMoteurEngin(BigDecimal valeurMoteurEngin) {
        this.valeurMoteurEngin = valeurMoteurEngin;
    }

    public Integer getPuissanceEngin() {
        return puissanceEngin;
    }

    public void setPuissanceEngin(Integer puissanceEngin) {
        this.puissanceEngin = puissanceEngin;
    }

    public String getEnergieEngin() {
        return energieEngin;
    }

    public void setEnergieEngin(String energieEngin) {
        this.energieEngin = energieEngin;
    }

    public String getCatNavigation() {
        return catNavigation;
    }

    public void setCatNavigation(String catNavigation) {
        this.catNavigation = catNavigation;
    }

    public String getGenreEngin() {
        return genreEngin;
    }

    public void setGenreEngin(String genreEngin) {
        this.genreEngin = genreEngin;
    }

    public BigDecimal getValCoqueEngin() {
        return valCoqueEngin;
    }

    public void setValCoqueEngin(BigDecimal valCoqueEngin) {
        this.valCoqueEngin = valCoqueEngin;
    }

    public BigDecimal getValeurAccessoireEngin() {
        return valeurAccessoireEngin;
    }

    public void setValeurAccessoireEngin(BigDecimal valeurAccessoireEngin) {
        this.valeurAccessoireEngin = valeurAccessoireEngin;
    }

    public BigDecimal getValeurNeufEngin() {
        return valeurNeufEngin;
    }

    public void setValeurNeufEngin(BigDecimal valeurNeufEngin) {
        this.valeurNeufEngin = valeurNeufEngin;
    }

    public BigDecimal getValeurVenaleEngin() {
        return valeurVenaleEngin;
    }

    public void setValeurVenaleEngin(BigDecimal valeurVenaleEngin) {
        this.valeurVenaleEngin = valeurVenaleEngin;
    }

    public BigDecimal getFraisRetirement() {
        return fraisRetirement;
    }

    public void setFraisRetirement(BigDecimal fraisRetirement) {
        this.fraisRetirement = fraisRetirement;
    }

    public String getLimiteNavigation() {
        return limiteNavigation;
    }

    public void setLimiteNavigation(String limiteNavigation) {
        this.limiteNavigation = limiteNavigation;
    }

    public String getSystProtection() {
        return systProtection;
    }

    public void setSystProtection(String systProtection) {
        this.systProtection = systProtection;
    }

    public String getPortDattach() {
        return portDattach;
    }

    public void setPortDattach(String portDattach) {
        this.portDattach = portDattach;
    }

    public Integer getNbrePassagerEngin() {
        return nbrePassagerEngin;
    }

    public void setNbrePassagerEngin(Integer nbrePassagerEngin) {
        this.nbrePassagerEngin = nbrePassagerEngin;
    }

    public Integer getNbreEquipagesEngin() {
        return nbreEquipagesEngin;
    }

    public void setNbreEquipagesEngin(Integer nbreEquipagesEngin) {
        this.nbreEquipagesEngin = nbreEquipagesEngin;
    }

    @XmlTransient
    public List<GarantieChoisieTransportCorps> getGarantieChoisieTransportCorpsList() {
        return garantieChoisieTransportCorpsList;
    }

    public void setGarantieChoisieTransportCorpsList(List<GarantieChoisieTransportCorps> garantieChoisieTransportCorpsList) {
        this.garantieChoisieTransportCorpsList = garantieChoisieTransportCorpsList;
    }

    @XmlTransient
    public List<ApporteurCorpsEngin> getApporteurCorpsEnginList() {
        return apporteurCorpsEnginList;
    }

    public void setApporteurCorpsEnginList(List<ApporteurCorpsEngin> apporteurCorpsEnginList) {
        this.apporteurCorpsEnginList = apporteurCorpsEnginList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public ListeCorpsEngin getCodeListeCorpsEngin() {
        return codeListeCorpsEngin;
    }

    public void setCodeListeCorpsEngin(ListeCorpsEngin codeListeCorpsEngin) {
        this.codeListeCorpsEngin = codeListeCorpsEngin;
    }

    @XmlTransient
    public List<CorpsSinistre> getCorpsSinistreList() {
        return corpsSinistreList;
    }

    public void setCorpsSinistreList(List<CorpsSinistre> corpsSinistreList) {
        this.corpsSinistreList = corpsSinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEngin != null ? codeEngin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorpsEngin)) {
            return false;
        }
        CorpsEngin other = (CorpsEngin) object;
        if ((this.codeEngin == null && other.codeEngin != null) || (this.codeEngin != null && !this.codeEngin.equals(other.codeEngin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CorpsEngin[ codeEngin=" + codeEngin + " ]";
    }
    
}
