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
@Table(name = "histo_gestion_confiee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoGestionConfiee.findAll", query = "SELECT h FROM HistoGestionConfiee h"),
    @NamedQuery(name = "HistoGestionConfiee.findByCodeHistoGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.codeHistoGc = :codeHistoGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByDateHistoGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.dateHistoGc = :dateHistoGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoCodeGestionConfie", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoCodeGestionConfie = :histoCodeGestionConfie"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNumIdentificationGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNumIdentificationGc = :histoNumIdentificationGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNatureGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNatureGc = :histoNatureGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoDescriptionGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoDescriptionGc = :histoDescriptionGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoTerritorialiteGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoTerritorialiteGc = :histoTerritorialiteGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoTauxCouvGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoTauxCouvGc = :histoTauxCouvGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPlanfondAnnuelGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPlanfondAnnuelGc = :histoPlanfondAnnuelGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoTauxAjustGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoTauxAjustGc = :histoTauxAjustGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreChefFamille", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreChefFamille = :histoNbreChefFamille"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbrRetChefFamille", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbrRetChefFamille = :histoNbrRetChefFamille"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeChefFamille", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeChefFamille = :histoPrimeChefFamille"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeRetChefFamille", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeRetChefFamille = :histoPrimeRetChefFamille"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeTotChefFamille", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeTotChefFamille = :histoPrimeTotChefFamille"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreConjointGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreConjointGc = :histoNbreConjointGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreRetConjoint", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreRetConjoint = :histoNbreRetConjoint"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeConjoint", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeConjoint = :histoPrimeConjoint"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeRetConjoint", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeRetConjoint = :histoPrimeRetConjoint"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeTotConjoint", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeTotConjoint = :histoPrimeTotConjoint"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreEnftMaj", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreEnftMaj = :histoNbreEnftMaj"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreRetEnftMaj", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreRetEnftMaj = :histoNbreRetEnftMaj"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeEnftMaj", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeEnftMaj = :histoPrimeEnftMaj"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeRetEnftMaj", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeRetEnftMaj = :histoPrimeRetEnftMaj"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeTotEnftMaj", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeTotEnftMaj = :histoPrimeTotEnftMaj"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreEnftGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreEnftGc = :histoNbreEnftGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoNbreRetEnftGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoNbreRetEnftGc = :histoNbreRetEnftGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeEnfant", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeEnfant = :histoPrimeEnfant"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeRetEnftGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeRetEnftGc = :histoPrimeRetEnftGc"),
    @NamedQuery(name = "HistoGestionConfiee.findByHistoPrimeTotEnftGc", query = "SELECT h FROM HistoGestionConfiee h WHERE h.histoPrimeTotEnftGc = :histoPrimeTotEnftGc")})
public class HistoGestionConfiee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_HISTO_GC")
    private String codeHistoGc;
    @Column(name = "DATE_HISTO_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateHistoGc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "HISTO_CODE_GESTION_CONFIE")
    private String histoCodeGestionConfie;
    @Size(max = 20)
    @Column(name = "HISTO_NUM_IDENTIFICATION_GC")
    private String histoNumIdentificationGc;
    @Size(max = 60)
    @Column(name = "HISTO_NATURE_GC")
    private String histoNatureGc;
    @Size(max = 60)
    @Column(name = "HISTO_DESCRIPTION_GC")
    private String histoDescriptionGc;
    @Size(max = 60)
    @Column(name = "HISTO_TERRITORIALITE_GC")
    private String histoTerritorialiteGc;
    @Size(max = 80)
    @Column(name = "HISTO_TAUX_COUV_GC")
    private String histoTauxCouvGc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "HISTO_PLANFOND_ANNUEL_GC")
    private BigDecimal histoPlanfondAnnuelGc;
    @Column(name = "HISTO_TAUX_AJUST_GC")
    private Long histoTauxAjustGc;
    @Column(name = "HISTO_NBRE_CHEF_FAMILLE")
    private Integer histoNbreChefFamille;
    @Column(name = "HISTO_NBR_RET_CHEF_FAMILLE")
    private Integer histoNbrRetChefFamille;
    @Column(name = "HISTO_PRIME_CHEF_FAMILLE")
    private BigDecimal histoPrimeChefFamille;
    @Column(name = "HISTO_PRIME_RET_CHEF_FAMILLE")
    private BigDecimal histoPrimeRetChefFamille;
    @Column(name = "HISTO_PRIME_TOT_CHEF_FAMILLE")
    private BigDecimal histoPrimeTotChefFamille;
    @Column(name = "HISTO_NBRE_CONJOINT_GC")
    private Integer histoNbreConjointGc;
    @Column(name = "HISTO_NBRE_RET_CONJOINT")
    private Integer histoNbreRetConjoint;
    @Column(name = "HISTO_PRIME_CONJOINT")
    private BigDecimal histoPrimeConjoint;
    @Column(name = "HISTO_PRIME_RET_CONJOINT")
    private BigDecimal histoPrimeRetConjoint;
    @Column(name = "HISTO_PRIME_TOT_CONJOINT")
    private BigDecimal histoPrimeTotConjoint;
    @Column(name = "HISTO_NBRE_ENFT_MAJ")
    private Integer histoNbreEnftMaj;
    @Column(name = "HISTO_NBRE_RET_ENFT_MAJ")
    private Integer histoNbreRetEnftMaj;
    @Column(name = "HISTO_PRIME_ENFT_MAJ")
    private BigDecimal histoPrimeEnftMaj;
    @Column(name = "HISTO_PRIME_RET_ENFT_MAJ")
    private BigDecimal histoPrimeRetEnftMaj;
    @Column(name = "HISTO_PRIME_TOT_ENFT_MAJ")
    private BigDecimal histoPrimeTotEnftMaj;
    @Column(name = "HISTO_NBRE_ENFT_GC")
    private Integer histoNbreEnftGc;
    @Column(name = "HISTO_NBRE_RET_ENFT_GC")
    private Integer histoNbreRetEnftGc;
    @Column(name = "HISTO_PRIME_ENFANT")
    private BigDecimal histoPrimeEnfant;
    @Column(name = "HISTO_PRIME_RET_ENFT_GC")
    private BigDecimal histoPrimeRetEnftGc;
    @Column(name = "HISTO_PRIME_TOT_ENFT_GC")
    private BigDecimal histoPrimeTotEnftGc;
    @JoinColumn(name = "CODE_GESTION_CONFIE", referencedColumnName = "CODE_GESTION_CONFIE")
    @ManyToOne
    private GestionConfiee codeGestionConfie;

    public HistoGestionConfiee() {
    }

    public HistoGestionConfiee(String codeHistoGc) {
        this.codeHistoGc = codeHistoGc;
    }

    public HistoGestionConfiee(String codeHistoGc, String histoCodeGestionConfie) {
        this.codeHistoGc = codeHistoGc;
        this.histoCodeGestionConfie = histoCodeGestionConfie;
    }

    public String getCodeHistoGc() {
        return codeHistoGc;
    }

    public void setCodeHistoGc(String codeHistoGc) {
        this.codeHistoGc = codeHistoGc;
    }

    public Date getDateHistoGc() {
        return dateHistoGc;
    }

    public void setDateHistoGc(Date dateHistoGc) {
        this.dateHistoGc = dateHistoGc;
    }

    public String getHistoCodeGestionConfie() {
        return histoCodeGestionConfie;
    }

    public void setHistoCodeGestionConfie(String histoCodeGestionConfie) {
        this.histoCodeGestionConfie = histoCodeGestionConfie;
    }

    public String getHistoNumIdentificationGc() {
        return histoNumIdentificationGc;
    }

    public void setHistoNumIdentificationGc(String histoNumIdentificationGc) {
        this.histoNumIdentificationGc = histoNumIdentificationGc;
    }

    public String getHistoNatureGc() {
        return histoNatureGc;
    }

    public void setHistoNatureGc(String histoNatureGc) {
        this.histoNatureGc = histoNatureGc;
    }

    public String getHistoDescriptionGc() {
        return histoDescriptionGc;
    }

    public void setHistoDescriptionGc(String histoDescriptionGc) {
        this.histoDescriptionGc = histoDescriptionGc;
    }

    public String getHistoTerritorialiteGc() {
        return histoTerritorialiteGc;
    }

    public void setHistoTerritorialiteGc(String histoTerritorialiteGc) {
        this.histoTerritorialiteGc = histoTerritorialiteGc;
    }

    public String getHistoTauxCouvGc() {
        return histoTauxCouvGc;
    }

    public void setHistoTauxCouvGc(String histoTauxCouvGc) {
        this.histoTauxCouvGc = histoTauxCouvGc;
    }

    public BigDecimal getHistoPlanfondAnnuelGc() {
        return histoPlanfondAnnuelGc;
    }

    public void setHistoPlanfondAnnuelGc(BigDecimal histoPlanfondAnnuelGc) {
        this.histoPlanfondAnnuelGc = histoPlanfondAnnuelGc;
    }

    public Long getHistoTauxAjustGc() {
        return histoTauxAjustGc;
    }

    public void setHistoTauxAjustGc(Long histoTauxAjustGc) {
        this.histoTauxAjustGc = histoTauxAjustGc;
    }

    public Integer getHistoNbreChefFamille() {
        return histoNbreChefFamille;
    }

    public void setHistoNbreChefFamille(Integer histoNbreChefFamille) {
        this.histoNbreChefFamille = histoNbreChefFamille;
    }

    public Integer getHistoNbrRetChefFamille() {
        return histoNbrRetChefFamille;
    }

    public void setHistoNbrRetChefFamille(Integer histoNbrRetChefFamille) {
        this.histoNbrRetChefFamille = histoNbrRetChefFamille;
    }

    public BigDecimal getHistoPrimeChefFamille() {
        return histoPrimeChefFamille;
    }

    public void setHistoPrimeChefFamille(BigDecimal histoPrimeChefFamille) {
        this.histoPrimeChefFamille = histoPrimeChefFamille;
    }

    public BigDecimal getHistoPrimeRetChefFamille() {
        return histoPrimeRetChefFamille;
    }

    public void setHistoPrimeRetChefFamille(BigDecimal histoPrimeRetChefFamille) {
        this.histoPrimeRetChefFamille = histoPrimeRetChefFamille;
    }

    public BigDecimal getHistoPrimeTotChefFamille() {
        return histoPrimeTotChefFamille;
    }

    public void setHistoPrimeTotChefFamille(BigDecimal histoPrimeTotChefFamille) {
        this.histoPrimeTotChefFamille = histoPrimeTotChefFamille;
    }

    public Integer getHistoNbreConjointGc() {
        return histoNbreConjointGc;
    }

    public void setHistoNbreConjointGc(Integer histoNbreConjointGc) {
        this.histoNbreConjointGc = histoNbreConjointGc;
    }

    public Integer getHistoNbreRetConjoint() {
        return histoNbreRetConjoint;
    }

    public void setHistoNbreRetConjoint(Integer histoNbreRetConjoint) {
        this.histoNbreRetConjoint = histoNbreRetConjoint;
    }

    public BigDecimal getHistoPrimeConjoint() {
        return histoPrimeConjoint;
    }

    public void setHistoPrimeConjoint(BigDecimal histoPrimeConjoint) {
        this.histoPrimeConjoint = histoPrimeConjoint;
    }

    public BigDecimal getHistoPrimeRetConjoint() {
        return histoPrimeRetConjoint;
    }

    public void setHistoPrimeRetConjoint(BigDecimal histoPrimeRetConjoint) {
        this.histoPrimeRetConjoint = histoPrimeRetConjoint;
    }

    public BigDecimal getHistoPrimeTotConjoint() {
        return histoPrimeTotConjoint;
    }

    public void setHistoPrimeTotConjoint(BigDecimal histoPrimeTotConjoint) {
        this.histoPrimeTotConjoint = histoPrimeTotConjoint;
    }

    public Integer getHistoNbreEnftMaj() {
        return histoNbreEnftMaj;
    }

    public void setHistoNbreEnftMaj(Integer histoNbreEnftMaj) {
        this.histoNbreEnftMaj = histoNbreEnftMaj;
    }

    public Integer getHistoNbreRetEnftMaj() {
        return histoNbreRetEnftMaj;
    }

    public void setHistoNbreRetEnftMaj(Integer histoNbreRetEnftMaj) {
        this.histoNbreRetEnftMaj = histoNbreRetEnftMaj;
    }

    public BigDecimal getHistoPrimeEnftMaj() {
        return histoPrimeEnftMaj;
    }

    public void setHistoPrimeEnftMaj(BigDecimal histoPrimeEnftMaj) {
        this.histoPrimeEnftMaj = histoPrimeEnftMaj;
    }

    public BigDecimal getHistoPrimeRetEnftMaj() {
        return histoPrimeRetEnftMaj;
    }

    public void setHistoPrimeRetEnftMaj(BigDecimal histoPrimeRetEnftMaj) {
        this.histoPrimeRetEnftMaj = histoPrimeRetEnftMaj;
    }

    public BigDecimal getHistoPrimeTotEnftMaj() {
        return histoPrimeTotEnftMaj;
    }

    public void setHistoPrimeTotEnftMaj(BigDecimal histoPrimeTotEnftMaj) {
        this.histoPrimeTotEnftMaj = histoPrimeTotEnftMaj;
    }

    public Integer getHistoNbreEnftGc() {
        return histoNbreEnftGc;
    }

    public void setHistoNbreEnftGc(Integer histoNbreEnftGc) {
        this.histoNbreEnftGc = histoNbreEnftGc;
    }

    public Integer getHistoNbreRetEnftGc() {
        return histoNbreRetEnftGc;
    }

    public void setHistoNbreRetEnftGc(Integer histoNbreRetEnftGc) {
        this.histoNbreRetEnftGc = histoNbreRetEnftGc;
    }

    public BigDecimal getHistoPrimeEnfant() {
        return histoPrimeEnfant;
    }

    public void setHistoPrimeEnfant(BigDecimal histoPrimeEnfant) {
        this.histoPrimeEnfant = histoPrimeEnfant;
    }

    public BigDecimal getHistoPrimeRetEnftGc() {
        return histoPrimeRetEnftGc;
    }

    public void setHistoPrimeRetEnftGc(BigDecimal histoPrimeRetEnftGc) {
        this.histoPrimeRetEnftGc = histoPrimeRetEnftGc;
    }

    public BigDecimal getHistoPrimeTotEnftGc() {
        return histoPrimeTotEnftGc;
    }

    public void setHistoPrimeTotEnftGc(BigDecimal histoPrimeTotEnftGc) {
        this.histoPrimeTotEnftGc = histoPrimeTotEnftGc;
    }

    public GestionConfiee getCodeGestionConfie() {
        return codeGestionConfie;
    }

    public void setCodeGestionConfie(GestionConfiee codeGestionConfie) {
        this.codeGestionConfie = codeGestionConfie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeHistoGc != null ? codeHistoGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistoGestionConfiee)) {
            return false;
        }
        HistoGestionConfiee other = (HistoGestionConfiee) object;
        if ((this.codeHistoGc == null && other.codeHistoGc != null) || (this.codeHistoGc != null && !this.codeHistoGc.equals(other.codeHistoGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.HistoGestionConfiee[ codeHistoGc=" + codeHistoGc + " ]";
    }
    
}
