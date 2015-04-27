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
@Table(name = "aliment")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aliment.findAll", query = "SELECT a FROM Aliment a"),
    @NamedQuery(name = "Aliment.findByCodeAliment", query = "SELECT a FROM Aliment a WHERE a.codeAliment = :codeAliment"),
    @NamedQuery(name = "Aliment.findByNumImprimer", query = "SELECT a FROM Aliment a WHERE a.numImprimer = :numImprimer"),
    @NamedQuery(name = "Aliment.findByAvisAliment", query = "SELECT a FROM Aliment a WHERE a.avisAliment = :avisAliment"),
    @NamedQuery(name = "Aliment.findByEmissionAliment", query = "SELECT a FROM Aliment a WHERE a.emissionAliment = :emissionAliment"),
    @NamedQuery(name = "Aliment.findByPleinExpAliment", query = "SELECT a FROM Aliment a WHERE a.pleinExpAliment = :pleinExpAliment"),
    @NamedQuery(name = "Aliment.findByEngin", query = "SELECT a FROM Aliment a WHERE a.engin = :engin"),
    @NamedQuery(name = "Aliment.findByLigne", query = "SELECT a FROM Aliment a WHERE a.ligne = :ligne"),
    @NamedQuery(name = "Aliment.findByNumVoyage", query = "SELECT a FROM Aliment a WHERE a.numVoyage = :numVoyage"),
    @NamedQuery(name = "Aliment.findByAge", query = "SELECT a FROM Aliment a WHERE a.age = :age"),
    @NamedQuery(name = "Aliment.findByPavillon", query = "SELECT a FROM Aliment a WHERE a.pavillon = :pavillon"),
    @NamedQuery(name = "Aliment.findByDepart", query = "SELECT a FROM Aliment a WHERE a.depart = :depart"),
    @NamedQuery(name = "Aliment.findByDestination", query = "SELECT a FROM Aliment a WHERE a.destination = :destination"),
    @NamedQuery(name = "Aliment.findByDateEmb", query = "SELECT a FROM Aliment a WHERE a.dateEmb = :dateEmb"),
    @NamedQuery(name = "Aliment.findByLieuEmb", query = "SELECT a FROM Aliment a WHERE a.lieuEmb = :lieuEmb"),
    @NamedQuery(name = "Aliment.findByNatureMarchandise", query = "SELECT a FROM Aliment a WHERE a.natureMarchandise = :natureMarchandise"),
    @NamedQuery(name = "Aliment.findByEmballage", query = "SELECT a FROM Aliment a WHERE a.emballage = :emballage"),
    @NamedQuery(name = "Aliment.findByNombre", query = "SELECT a FROM Aliment a WHERE a.nombre = :nombre"),
    @NamedQuery(name = "Aliment.findByValeur", query = "SELECT a FROM Aliment a WHERE a.valeur = :valeur"),
    @NamedQuery(name = "Aliment.findByDevise", query = "SELECT a FROM Aliment a WHERE a.devise = :devise"),
    @NamedQuery(name = "Aliment.findByPoidsBrutMarch", query = "SELECT a FROM Aliment a WHERE a.poidsBrutMarch = :poidsBrutMarch"),
    @NamedQuery(name = "Aliment.findByPoidsNetMarch", query = "SELECT a FROM Aliment a WHERE a.poidsNetMarch = :poidsNetMarch"),
    @NamedQuery(name = "Aliment.findByMarque", query = "SELECT a FROM Aliment a WHERE a.marque = :marque"),
    @NamedQuery(name = "Aliment.findByValeurContaineur", query = "SELECT a FROM Aliment a WHERE a.valeurContaineur = :valeurContaineur"),
    @NamedQuery(name = "Aliment.findByImmatriculationEngin", query = "SELECT a FROM Aliment a WHERE a.immatriculationEngin = :immatriculationEngin"),
    @NamedQuery(name = "Aliment.findByDatePremiereCirculationEngin", query = "SELECT a FROM Aliment a WHERE a.datePremiereCirculationEngin = :datePremiereCirculationEngin")})
public class Aliment implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "CODE_ALIMENT")
    private String codeAliment;
    @Size(max = 30)
    @Column(name = "NUM_IMPRIMER")
    private String numImprimer;
    @Size(max = 14)
    @Column(name = "AVIS_ALIMENT")
    private String avisAliment;
    @Column(name = "EMISSION_ALIMENT")
    @Temporal(TemporalType.DATE)
    private Date emissionAliment;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLEIN_EXP_ALIMENT")
    private BigDecimal pleinExpAliment;
    @Size(max = 50)
    @Column(name = "ENGIN")
    private String engin;
    @Size(max = 50)
    @Column(name = "LIGNE")
    private String ligne;
    @Size(max = 10)
    @Column(name = "NUM_VOYAGE")
    private String numVoyage;
    @Column(name = "AGE")
    private Integer age;
    @Size(max = 50)
    @Column(name = "PAVILLON")
    private String pavillon;
    @Size(max = 50)
    @Column(name = "DEPART")
    private String depart;
    @Size(max = 50)
    @Column(name = "DESTINATION")
    private String destination;
    @Column(name = "DATE_EMB")
    @Temporal(TemporalType.DATE)
    private Date dateEmb;
    @Size(max = 50)
    @Column(name = "LIEU_EMB")
    private String lieuEmb;
    @Size(max = 60)
    @Column(name = "NATURE_MARCHANDISE")
    private String natureMarchandise;
    @Size(max = 30)
    @Column(name = "EMBALLAGE")
    private String emballage;
    @Column(name = "NOMBRE")
    private Integer nombre;
    @Column(name = "VALEUR")
    private BigDecimal valeur;
    @Size(max = 20)
    @Column(name = "DEVISE")
    private String devise;
    @Column(name = "POIDS_BRUT_MARCH")
    private Integer poidsBrutMarch;
    @Column(name = "POIDS_NET_MARCH")
    private Integer poidsNetMarch;
    @Size(max = 40)
    @Column(name = "MARQUE")
    private String marque;
    @Column(name = "VALEUR_CONTAINEUR")
    private BigDecimal valeurContaineur;
    @Size(max = 20)
    @Column(name = "IMMATRICULATION_ENGIN")
    private String immatriculationEngin;
    @Column(name = "DATE_PREMIERE_CIRCULATION_ENGIN")
    @Temporal(TemporalType.DATE)
    private Date datePremiereCirculationEngin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aliment")
    private List<ApporteurAliment> apporteurAlimentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "aliment")
    private List<AlimentSinistre> alimentSinistreList;
    @OneToMany(mappedBy = "codeAliment")
    private List<GarantieChoisieTransport> garantieChoisieTransportList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @JoinColumn(name = "CODE_TRAFIC", referencedColumnName = "CODE_TRAFIC")
    @ManyToOne
    private Trafic codeTrafic;

    public Aliment() {
    }

    public Aliment(String codeAliment) {
        this.codeAliment = codeAliment;
    }

    public String getCodeAliment() {
        return codeAliment;
    }

    public void setCodeAliment(String codeAliment) {
        this.codeAliment = codeAliment;
    }

    public String getNumImprimer() {
        return numImprimer;
    }

    public void setNumImprimer(String numImprimer) {
        this.numImprimer = numImprimer;
    }

    public String getAvisAliment() {
        return avisAliment;
    }

    public void setAvisAliment(String avisAliment) {
        this.avisAliment = avisAliment;
    }

    public Date getEmissionAliment() {
        return emissionAliment;
    }

    public void setEmissionAliment(Date emissionAliment) {
        this.emissionAliment = emissionAliment;
    }

    public BigDecimal getPleinExpAliment() {
        return pleinExpAliment;
    }

    public void setPleinExpAliment(BigDecimal pleinExpAliment) {
        this.pleinExpAliment = pleinExpAliment;
    }

    public String getEngin() {
        return engin;
    }

    public void setEngin(String engin) {
        this.engin = engin;
    }

    public String getLigne() {
        return ligne;
    }

    public void setLigne(String ligne) {
        this.ligne = ligne;
    }

    public String getNumVoyage() {
        return numVoyage;
    }

    public void setNumVoyage(String numVoyage) {
        this.numVoyage = numVoyage;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getPavillon() {
        return pavillon;
    }

    public void setPavillon(String pavillon) {
        this.pavillon = pavillon;
    }

    public String getDepart() {
        return depart;
    }

    public void setDepart(String depart) {
        this.depart = depart;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Date getDateEmb() {
        return dateEmb;
    }

    public void setDateEmb(Date dateEmb) {
        this.dateEmb = dateEmb;
    }

    public String getLieuEmb() {
        return lieuEmb;
    }

    public void setLieuEmb(String lieuEmb) {
        this.lieuEmb = lieuEmb;
    }

    public String getNatureMarchandise() {
        return natureMarchandise;
    }

    public void setNatureMarchandise(String natureMarchandise) {
        this.natureMarchandise = natureMarchandise;
    }

    public String getEmballage() {
        return emballage;
    }

    public void setEmballage(String emballage) {
        this.emballage = emballage;
    }

    public Integer getNombre() {
        return nombre;
    }

    public void setNombre(Integer nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getValeur() {
        return valeur;
    }

    public void setValeur(BigDecimal valeur) {
        this.valeur = valeur;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }

    public Integer getPoidsBrutMarch() {
        return poidsBrutMarch;
    }

    public void setPoidsBrutMarch(Integer poidsBrutMarch) {
        this.poidsBrutMarch = poidsBrutMarch;
    }

    public Integer getPoidsNetMarch() {
        return poidsNetMarch;
    }

    public void setPoidsNetMarch(Integer poidsNetMarch) {
        this.poidsNetMarch = poidsNetMarch;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public BigDecimal getValeurContaineur() {
        return valeurContaineur;
    }

    public void setValeurContaineur(BigDecimal valeurContaineur) {
        this.valeurContaineur = valeurContaineur;
    }

    public String getImmatriculationEngin() {
        return immatriculationEngin;
    }

    public void setImmatriculationEngin(String immatriculationEngin) {
        this.immatriculationEngin = immatriculationEngin;
    }

    public Date getDatePremiereCirculationEngin() {
        return datePremiereCirculationEngin;
    }

    public void setDatePremiereCirculationEngin(Date datePremiereCirculationEngin) {
        this.datePremiereCirculationEngin = datePremiereCirculationEngin;
    }

    @XmlTransient
    public List<ApporteurAliment> getApporteurAlimentList() {
        return apporteurAlimentList;
    }

    public void setApporteurAlimentList(List<ApporteurAliment> apporteurAlimentList) {
        this.apporteurAlimentList = apporteurAlimentList;
    }

    @XmlTransient
    public List<AlimentSinistre> getAlimentSinistreList() {
        return alimentSinistreList;
    }

    public void setAlimentSinistreList(List<AlimentSinistre> alimentSinistreList) {
        this.alimentSinistreList = alimentSinistreList;
    }

    @XmlTransient
    public List<GarantieChoisieTransport> getGarantieChoisieTransportList() {
        return garantieChoisieTransportList;
    }

    public void setGarantieChoisieTransportList(List<GarantieChoisieTransport> garantieChoisieTransportList) {
        this.garantieChoisieTransportList = garantieChoisieTransportList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    public Trafic getCodeTrafic() {
        return codeTrafic;
    }

    public void setCodeTrafic(Trafic codeTrafic) {
        this.codeTrafic = codeTrafic;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAliment != null ? codeAliment.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aliment)) {
            return false;
        }
        Aliment other = (Aliment) object;
        if ((this.codeAliment == null && other.codeAliment != null) || (this.codeAliment != null && !this.codeAliment.equals(other.codeAliment))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Aliment[ codeAliment=" + codeAliment + " ]";
    }
    
}
