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
@Table(name = "gestion_confiee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GestionConfiee.findAll", query = "SELECT g FROM GestionConfiee g"),
    @NamedQuery(name = "GestionConfiee.findByCodeGestionConfie", query = "SELECT g FROM GestionConfiee g WHERE g.codeGestionConfie = :codeGestionConfie"),
    @NamedQuery(name = "GestionConfiee.findByNumIdentificationGc", query = "SELECT g FROM GestionConfiee g WHERE g.numIdentificationGc = :numIdentificationGc"),
    @NamedQuery(name = "GestionConfiee.findByNatureGc", query = "SELECT g FROM GestionConfiee g WHERE g.natureGc = :natureGc"),
    @NamedQuery(name = "GestionConfiee.findByDescriptionGc", query = "SELECT g FROM GestionConfiee g WHERE g.descriptionGc = :descriptionGc"),
    @NamedQuery(name = "GestionConfiee.findByTerritorialiteGc", query = "SELECT g FROM GestionConfiee g WHERE g.territorialiteGc = :territorialiteGc"),
    @NamedQuery(name = "GestionConfiee.findByTauxCouvGc", query = "SELECT g FROM GestionConfiee g WHERE g.tauxCouvGc = :tauxCouvGc"),
    @NamedQuery(name = "GestionConfiee.findByPlanfondAnnuelGc", query = "SELECT g FROM GestionConfiee g WHERE g.planfondAnnuelGc = :planfondAnnuelGc"),
    @NamedQuery(name = "GestionConfiee.findByTauxAjustGc", query = "SELECT g FROM GestionConfiee g WHERE g.tauxAjustGc = :tauxAjustGc"),
    @NamedQuery(name = "GestionConfiee.findByNbreChefFamille", query = "SELECT g FROM GestionConfiee g WHERE g.nbreChefFamille = :nbreChefFamille"),
    @NamedQuery(name = "GestionConfiee.findByNbrRetChefFamille", query = "SELECT g FROM GestionConfiee g WHERE g.nbrRetChefFamille = :nbrRetChefFamille"),
    @NamedQuery(name = "GestionConfiee.findByPrimeChefFamille", query = "SELECT g FROM GestionConfiee g WHERE g.primeChefFamille = :primeChefFamille"),
    @NamedQuery(name = "GestionConfiee.findByPrimeRetChefFamille", query = "SELECT g FROM GestionConfiee g WHERE g.primeRetChefFamille = :primeRetChefFamille"),
    @NamedQuery(name = "GestionConfiee.findByPrimeTotChefFamille", query = "SELECT g FROM GestionConfiee g WHERE g.primeTotChefFamille = :primeTotChefFamille"),
    @NamedQuery(name = "GestionConfiee.findByNbreConjointGc", query = "SELECT g FROM GestionConfiee g WHERE g.nbreConjointGc = :nbreConjointGc"),
    @NamedQuery(name = "GestionConfiee.findByNbreRetConjoint", query = "SELECT g FROM GestionConfiee g WHERE g.nbreRetConjoint = :nbreRetConjoint"),
    @NamedQuery(name = "GestionConfiee.findByPrimeConjoint", query = "SELECT g FROM GestionConfiee g WHERE g.primeConjoint = :primeConjoint"),
    @NamedQuery(name = "GestionConfiee.findByPrimeRetConjoint", query = "SELECT g FROM GestionConfiee g WHERE g.primeRetConjoint = :primeRetConjoint"),
    @NamedQuery(name = "GestionConfiee.findByPrimeTotConjoint", query = "SELECT g FROM GestionConfiee g WHERE g.primeTotConjoint = :primeTotConjoint"),
    @NamedQuery(name = "GestionConfiee.findByNbreEnftMaj", query = "SELECT g FROM GestionConfiee g WHERE g.nbreEnftMaj = :nbreEnftMaj"),
    @NamedQuery(name = "GestionConfiee.findByNbreRetEnftMaj", query = "SELECT g FROM GestionConfiee g WHERE g.nbreRetEnftMaj = :nbreRetEnftMaj"),
    @NamedQuery(name = "GestionConfiee.findByPrimeEnftMaj", query = "SELECT g FROM GestionConfiee g WHERE g.primeEnftMaj = :primeEnftMaj"),
    @NamedQuery(name = "GestionConfiee.findByPrimeRetEnftMaj", query = "SELECT g FROM GestionConfiee g WHERE g.primeRetEnftMaj = :primeRetEnftMaj"),
    @NamedQuery(name = "GestionConfiee.findByPrimeTotEnftMaj", query = "SELECT g FROM GestionConfiee g WHERE g.primeTotEnftMaj = :primeTotEnftMaj"),
    @NamedQuery(name = "GestionConfiee.findByNbreEnftGc", query = "SELECT g FROM GestionConfiee g WHERE g.nbreEnftGc = :nbreEnftGc"),
    @NamedQuery(name = "GestionConfiee.findByNbreRetEnftGc", query = "SELECT g FROM GestionConfiee g WHERE g.nbreRetEnftGc = :nbreRetEnftGc"),
    @NamedQuery(name = "GestionConfiee.findByPrimeEnfant", query = "SELECT g FROM GestionConfiee g WHERE g.primeEnfant = :primeEnfant"),
    @NamedQuery(name = "GestionConfiee.findByPrimeRetEnftGc", query = "SELECT g FROM GestionConfiee g WHERE g.primeRetEnftGc = :primeRetEnftGc"),
    @NamedQuery(name = "GestionConfiee.findBySurprimeGc", query = "SELECT g FROM GestionConfiee g WHERE g.surprimeGc = :surprimeGc"),
    @NamedQuery(name = "GestionConfiee.findByPrimeTotEnftGc", query = "SELECT g FROM GestionConfiee g WHERE g.primeTotEnftGc = :primeTotEnftGc"),
    @NamedQuery(name = "GestionConfiee.findByPrimeTotaleGc", query = "SELECT g FROM GestionConfiee g WHERE g.primeTotaleGc = :primeTotaleGc")})
public class GestionConfiee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_GESTION_CONFIE")
    private String codeGestionConfie;
    @Column(name = "NUM_IDENTIFICATION_GC")
    private Integer numIdentificationGc;
    @Size(max = 60)
    @Column(name = "NATURE_GC")
    private String natureGc;
    @Size(max = 60)
    @Column(name = "DESCRIPTION_GC")
    private String descriptionGc;
    @Size(max = 60)
    @Column(name = "TERRITORIALITE_GC")
    private String territorialiteGc;
    @Size(max = 80)
    @Column(name = "TAUX_COUV_GC")
    private String tauxCouvGc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLANFOND_ANNUEL_GC")
    private BigDecimal planfondAnnuelGc;
    @Column(name = "TAUX_AJUST_GC")
    private Long tauxAjustGc;
    @Column(name = "NBRE_CHEF_FAMILLE")
    private Integer nbreChefFamille;
    @Column(name = "NBR_RET_CHEF_FAMILLE")
    private Integer nbrRetChefFamille;
    @Column(name = "PRIME_CHEF_FAMILLE")
    private BigDecimal primeChefFamille;
    @Column(name = "PRIME_RET_CHEF_FAMILLE")
    private BigDecimal primeRetChefFamille;
    @Column(name = "PRIME_TOT_CHEF_FAMILLE")
    private BigDecimal primeTotChefFamille;
    @Column(name = "NBRE_CONJOINT_GC")
    private Integer nbreConjointGc;
    @Column(name = "NBRE_RET_CONJOINT")
    private Integer nbreRetConjoint;
    @Column(name = "PRIME_CONJOINT")
    private BigDecimal primeConjoint;
    @Column(name = "PRIME_RET_CONJOINT")
    private BigDecimal primeRetConjoint;
    @Column(name = "PRIME_TOT_CONJOINT")
    private BigDecimal primeTotConjoint;
    @Column(name = "NBRE_ENFT_MAJ")
    private Integer nbreEnftMaj;
    @Column(name = "NBRE_RET_ENFT_MAJ")
    private Integer nbreRetEnftMaj;
    @Column(name = "PRIME_ENFT_MAJ")
    private BigDecimal primeEnftMaj;
    @Column(name = "PRIME_RET_ENFT_MAJ")
    private BigDecimal primeRetEnftMaj;
    @Column(name = "PRIME_TOT_ENFT_MAJ")
    private BigDecimal primeTotEnftMaj;
    @Column(name = "NBRE_ENFT_GC")
    private Integer nbreEnftGc;
    @Column(name = "NBRE_RET_ENFT_GC")
    private Integer nbreRetEnftGc;
    @Column(name = "PRIME_ENFANT")
    private BigDecimal primeEnfant;
    @Column(name = "PRIME_RET_ENFT_GC")
    private BigDecimal primeRetEnftGc;
    @Column(name = "SURPRIME_GC")
    private BigDecimal surprimeGc;
    @Column(name = "PRIME_TOT_ENFT_GC")
    private BigDecimal primeTotEnftGc;
    @Column(name = "PRIME_TOTALE_GC")
    private BigDecimal primeTotaleGc;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionConfiee")
    private List<GestionnaireGc> gestionnaireGcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionConfiee")
    private List<GestionConfieeSinistre> gestionConfieeSinistreList;
    @JoinColumn(name = "CODE_LISTE_GESTION_CONFIE", referencedColumnName = "CODE_LISTE_GESTION_CONFIE")
    @ManyToOne
    private ListeGestionConfie codeListeGestionConfie;
    @JoinColumn(name = "CODE_COLLEGE", referencedColumnName = "CODE_COLLEGE")
    @ManyToOne
    private CollegeSante codeCollege;
    @JoinColumn(name = "CODE_CLASSE_GC", referencedColumnName = "CODE_CLASSE_GC")
    @ManyToOne
    private ClasseGc codeClasseGc;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @OneToMany(mappedBy = "codeGestionConfie")
    private List<HistoGestionConfiee> histoGestionConfieeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionConfiee")
    private List<GestionConfieFormule> gestionConfieFormuleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "gestionConfiee")
    private List<ApporteurGestionConfiee> apporteurGestionConfieeList;

    public GestionConfiee() {
    }

    public GestionConfiee(String codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
    }

    public String getCodeGestionConfie() {
        return codeGestionConfie;
    }

    public void setCodeGestionConfie(String codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
    }

    public Integer getNumIdentificationGc() {
        return numIdentificationGc;
    }

    public void setNumIdentificationGc(Integer numIdentificationGc) {
        this.numIdentificationGc = numIdentificationGc;
    }

    public String getNatureGc() {
        return natureGc;
    }

    public void setNatureGc(String natureGc) {
        this.natureGc = natureGc;
    }

    public String getDescriptionGc() {
        return descriptionGc;
    }

    public void setDescriptionGc(String descriptionGc) {
        this.descriptionGc = descriptionGc;
    }

    public String getTerritorialiteGc() {
        return territorialiteGc;
    }

    public void setTerritorialiteGc(String territorialiteGc) {
        this.territorialiteGc = territorialiteGc;
    }

    public String getTauxCouvGc() {
        return tauxCouvGc;
    }

    public void setTauxCouvGc(String tauxCouvGc) {
        this.tauxCouvGc = tauxCouvGc;
    }

    public BigDecimal getPlanfondAnnuelGc() {
        return planfondAnnuelGc;
    }

    public void setPlanfondAnnuelGc(BigDecimal planfondAnnuelGc) {
        this.planfondAnnuelGc = planfondAnnuelGc;
    }

    public Long getTauxAjustGc() {
        return tauxAjustGc;
    }

    public void setTauxAjustGc(Long tauxAjustGc) {
        this.tauxAjustGc = tauxAjustGc;
    }

    public Integer getNbreChefFamille() {
        return nbreChefFamille;
    }

    public void setNbreChefFamille(Integer nbreChefFamille) {
        this.nbreChefFamille = nbreChefFamille;
    }

    public Integer getNbrRetChefFamille() {
        return nbrRetChefFamille;
    }

    public void setNbrRetChefFamille(Integer nbrRetChefFamille) {
        this.nbrRetChefFamille = nbrRetChefFamille;
    }

    public BigDecimal getPrimeChefFamille() {
        return primeChefFamille;
    }

    public void setPrimeChefFamille(BigDecimal primeChefFamille) {
        this.primeChefFamille = primeChefFamille;
    }

    public BigDecimal getPrimeRetChefFamille() {
        return primeRetChefFamille;
    }

    public void setPrimeRetChefFamille(BigDecimal primeRetChefFamille) {
        this.primeRetChefFamille = primeRetChefFamille;
    }

    public BigDecimal getPrimeTotChefFamille() {
        return primeTotChefFamille;
    }

    public void setPrimeTotChefFamille(BigDecimal primeTotChefFamille) {
        this.primeTotChefFamille = primeTotChefFamille;
    }

    public Integer getNbreConjointGc() {
        return nbreConjointGc;
    }

    public void setNbreConjointGc(Integer nbreConjointGc) {
        this.nbreConjointGc = nbreConjointGc;
    }

    public Integer getNbreRetConjoint() {
        return nbreRetConjoint;
    }

    public void setNbreRetConjoint(Integer nbreRetConjoint) {
        this.nbreRetConjoint = nbreRetConjoint;
    }

    public BigDecimal getPrimeConjoint() {
        return primeConjoint;
    }

    public void setPrimeConjoint(BigDecimal primeConjoint) {
        this.primeConjoint = primeConjoint;
    }

    public BigDecimal getPrimeRetConjoint() {
        return primeRetConjoint;
    }

    public void setPrimeRetConjoint(BigDecimal primeRetConjoint) {
        this.primeRetConjoint = primeRetConjoint;
    }

    public BigDecimal getPrimeTotConjoint() {
        return primeTotConjoint;
    }

    public void setPrimeTotConjoint(BigDecimal primeTotConjoint) {
        this.primeTotConjoint = primeTotConjoint;
    }

    public Integer getNbreEnftMaj() {
        return nbreEnftMaj;
    }

    public void setNbreEnftMaj(Integer nbreEnftMaj) {
        this.nbreEnftMaj = nbreEnftMaj;
    }

    public Integer getNbreRetEnftMaj() {
        return nbreRetEnftMaj;
    }

    public void setNbreRetEnftMaj(Integer nbreRetEnftMaj) {
        this.nbreRetEnftMaj = nbreRetEnftMaj;
    }

    public BigDecimal getPrimeEnftMaj() {
        return primeEnftMaj;
    }

    public void setPrimeEnftMaj(BigDecimal primeEnftMaj) {
        this.primeEnftMaj = primeEnftMaj;
    }

    public BigDecimal getPrimeRetEnftMaj() {
        return primeRetEnftMaj;
    }

    public void setPrimeRetEnftMaj(BigDecimal primeRetEnftMaj) {
        this.primeRetEnftMaj = primeRetEnftMaj;
    }

    public BigDecimal getPrimeTotEnftMaj() {
        return primeTotEnftMaj;
    }

    public void setPrimeTotEnftMaj(BigDecimal primeTotEnftMaj) {
        this.primeTotEnftMaj = primeTotEnftMaj;
    }

    public Integer getNbreEnftGc() {
        return nbreEnftGc;
    }

    public void setNbreEnftGc(Integer nbreEnftGc) {
        this.nbreEnftGc = nbreEnftGc;
    }

    public Integer getNbreRetEnftGc() {
        return nbreRetEnftGc;
    }

    public void setNbreRetEnftGc(Integer nbreRetEnftGc) {
        this.nbreRetEnftGc = nbreRetEnftGc;
    }

    public BigDecimal getPrimeEnfant() {
        return primeEnfant;
    }

    public void setPrimeEnfant(BigDecimal primeEnfant) {
        this.primeEnfant = primeEnfant;
    }

    public BigDecimal getPrimeRetEnftGc() {
        return primeRetEnftGc;
    }

    public void setPrimeRetEnftGc(BigDecimal primeRetEnftGc) {
        this.primeRetEnftGc = primeRetEnftGc;
    }

    public BigDecimal getSurprimeGc() {
        return surprimeGc;
    }

    public void setSurprimeGc(BigDecimal surprimeGc) {
        this.surprimeGc = surprimeGc;
    }

    public BigDecimal getPrimeTotEnftGc() {
        return primeTotEnftGc;
    }

    public void setPrimeTotEnftGc(BigDecimal primeTotEnftGc) {
        this.primeTotEnftGc = primeTotEnftGc;
    }

    public BigDecimal getPrimeTotaleGc() {
        return primeTotaleGc;
    }

    public void setPrimeTotaleGc(BigDecimal primeTotaleGc) {
        this.primeTotaleGc = primeTotaleGc;
    }

    @XmlTransient
    public List<GestionnaireGc> getGestionnaireGcList() {
        return gestionnaireGcList;
    }

    public void setGestionnaireGcList(List<GestionnaireGc> gestionnaireGcList) {
        this.gestionnaireGcList = gestionnaireGcList;
    }

    @XmlTransient
    public List<GestionConfieeSinistre> getGestionConfieeSinistreList() {
        return gestionConfieeSinistreList;
    }

    public void setGestionConfieeSinistreList(List<GestionConfieeSinistre> gestionConfieeSinistreList) {
        this.gestionConfieeSinistreList = gestionConfieeSinistreList;
    }

    public ListeGestionConfie getCodeListeGestionConfie() {
        return codeListeGestionConfie;
    }

    public void setCodeListeGestionConfie(ListeGestionConfie codeListeGestionConfie) {
        this.codeListeGestionConfie = codeListeGestionConfie;
    }

    public CollegeSante getCodeCollege() {
        return codeCollege;
    }

    public void setCodeCollege(CollegeSante codeCollege) {
        this.codeCollege = codeCollege;
    }

    public ClasseGc getCodeClasseGc() {
        return codeClasseGc;
    }

    public void setCodeClasseGc(ClasseGc codeClasseGc) {
        this.codeClasseGc = codeClasseGc;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @XmlTransient
    public List<HistoGestionConfiee> getHistoGestionConfieeList() {
        return histoGestionConfieeList;
    }

    public void setHistoGestionConfieeList(List<HistoGestionConfiee> histoGestionConfieeList) {
        this.histoGestionConfieeList = histoGestionConfieeList;
    }

    @XmlTransient
    public List<GestionConfieFormule> getGestionConfieFormuleList() {
        return gestionConfieFormuleList;
    }

    public void setGestionConfieFormuleList(List<GestionConfieFormule> gestionConfieFormuleList) {
        this.gestionConfieFormuleList = gestionConfieFormuleList;
    }

    @XmlTransient
    public List<ApporteurGestionConfiee> getApporteurGestionConfieeList() {
        return apporteurGestionConfieeList;
    }

    public void setApporteurGestionConfieeList(List<ApporteurGestionConfiee> apporteurGestionConfieeList) {
        this.apporteurGestionConfieeList = apporteurGestionConfieeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGestionConfie != null ? codeGestionConfie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionConfiee)) {
            return false;
        }
        GestionConfiee other = (GestionConfiee) object;
        if ((this.codeGestionConfie == null && other.codeGestionConfie != null) || (this.codeGestionConfie != null && !this.codeGestionConfie.equals(other.codeGestionConfie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionConfiee[ codeGestionConfie=" + codeGestionConfie + " ]";
    }
    
}
