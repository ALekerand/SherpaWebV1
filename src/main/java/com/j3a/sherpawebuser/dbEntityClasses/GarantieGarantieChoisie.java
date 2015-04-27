/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "garantie_garantie_choisie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisie.findAll", query = "SELECT g FROM GarantieGarantieChoisie g"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByCodeGarantieChoisie", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.garantieGarantieChoisiePK.codeGarantieChoisie = :codeGarantieChoisie"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.garantieGarantieChoisiePK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByPrimeAnnuelle", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.primeAnnuelle = :primeAnnuelle"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByPrimeNetteProrata", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.primeNetteProrata = :primeNetteProrata"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByDateGarantieGarantieChoisie", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.dateGarantieGarantieChoisie = :dateGarantieGarantieChoisie"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByPrimeNetteAnnuelle", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.primeNetteAnnuelle = :primeNetteAnnuelle"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByMontantReduction", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.montantReduction = :montantReduction"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByBonus", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.bonus = :bonus"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByMalus", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.malus = :malus"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByReductionPermis", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.reductionPermis = :reductionPermis"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByReductionFlotte", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.reductionFlotte = :reductionFlotte"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByAutreReduction", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.autreReduction = :autreReduction"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTauxMalus", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.tauxMalus = :tauxMalus"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTauxBonus", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.tauxBonus = :tauxBonus"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTauxFlotte", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.tauxFlotte = :tauxFlotte"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTauxPermis", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.tauxPermis = :tauxPermis"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTauxAutreReduction", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.tauxAutreReduction = :tauxAutreReduction"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByAccessoireAuto", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.accessoireAuto = :accessoireAuto"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByTaxeEnrAuto", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.taxeEnrAuto = :taxeEnrAuto"),
    @NamedQuery(name = "GarantieGarantieChoisie.findByFgaAuto", query = "SELECT g FROM GarantieGarantieChoisie g WHERE g.fgaAuto = :fgaAuto")})
public class GarantieGarantieChoisie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisiePK garantieGarantieChoisiePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_ANNUELLE")
    private BigDecimal primeAnnuelle;
    @Column(name = "PRIME_NETTE_PRORATA")
    private BigDecimal primeNetteProrata;
    @Column(name = "DATE_GARANTIE_GARANTIE_CHOISIE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieGarantieChoisie;
    @Column(name = "PRIME_NETTE_ANNUELLE")
    private BigDecimal primeNetteAnnuelle;
    @Column(name = "MONTANT_REDUCTION")
    private BigDecimal montantReduction;
    @Column(name = "BONUS")
    private BigDecimal bonus;
    @Column(name = "MALUS")
    private BigDecimal malus;
    @Column(name = "REDUCTION_PERMIS")
    private BigDecimal reductionPermis;
    @Column(name = "REDUCTION_FLOTTE")
    private BigDecimal reductionFlotte;
    @Column(name = "AUTRE_REDUCTION")
    private BigDecimal autreReduction;
    @Column(name = "TAUX_MALUS")
    private BigDecimal tauxMalus;
    @Column(name = "TAUX_BONUS")
    private BigDecimal tauxBonus;
    @Column(name = "TAUX_FLOTTE")
    private BigDecimal tauxFlotte;
    @Column(name = "TAUX_PERMIS")
    private BigDecimal tauxPermis;
    @Column(name = "TAUX_AUTRE_REDUCTION")
    private BigDecimal tauxAutreReduction;
    @Column(name = "ACCESSOIRE_AUTO")
    private BigDecimal accessoireAuto;
    @Column(name = "TAXE_ENR_AUTO")
    private BigDecimal taxeEnrAuto;
    @Column(name = "FGA_AUTO")
    private BigDecimal fgaAuto;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;
    @JoinColumn(name = "CODE_GARANTIE_CHOISIE", referencedColumnName = "CODE_GARANTIE_CHOISIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisie garantieChoisie;

    public GarantieGarantieChoisie() {
    }

    public GarantieGarantieChoisie(GarantieGarantieChoisiePK garantieGarantieChoisiePK) {
        this.garantieGarantieChoisiePK = garantieGarantieChoisiePK;
    }

    public GarantieGarantieChoisie(String codeGarantieChoisie, String codeGarantie) {
        this.garantieGarantieChoisiePK = new GarantieGarantieChoisiePK(codeGarantieChoisie, codeGarantie);
    }

    public GarantieGarantieChoisiePK getGarantieGarantieChoisiePK() {
        return garantieGarantieChoisiePK;
    }

    public void setGarantieGarantieChoisiePK(GarantieGarantieChoisiePK garantieGarantieChoisiePK) {
        this.garantieGarantieChoisiePK = garantieGarantieChoisiePK;
    }

    public BigDecimal getPrimeAnnuelle() {
        return primeAnnuelle;
    }

    public void setPrimeAnnuelle(BigDecimal primeAnnuelle) {
        this.primeAnnuelle = primeAnnuelle;
    }

    public BigDecimal getPrimeNetteProrata() {
        return primeNetteProrata;
    }

    public void setPrimeNetteProrata(BigDecimal primeNetteProrata) {
        this.primeNetteProrata = primeNetteProrata;
    }

    public Date getDateGarantieGarantieChoisie() {
        return dateGarantieGarantieChoisie;
    }

    public void setDateGarantieGarantieChoisie(Date dateGarantieGarantieChoisie) {
        this.dateGarantieGarantieChoisie = dateGarantieGarantieChoisie;
    }

    public BigDecimal getPrimeNetteAnnuelle() {
        return primeNetteAnnuelle;
    }

    public void setPrimeNetteAnnuelle(BigDecimal primeNetteAnnuelle) {
        this.primeNetteAnnuelle = primeNetteAnnuelle;
    }

    public BigDecimal getMontantReduction() {
        return montantReduction;
    }

    public void setMontantReduction(BigDecimal montantReduction) {
        this.montantReduction = montantReduction;
    }

    public BigDecimal getBonus() {
        return bonus;
    }

    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal getMalus() {
        return malus;
    }

    public void setMalus(BigDecimal malus) {
        this.malus = malus;
    }

    public BigDecimal getReductionPermis() {
        return reductionPermis;
    }

    public void setReductionPermis(BigDecimal reductionPermis) {
        this.reductionPermis = reductionPermis;
    }

    public BigDecimal getReductionFlotte() {
        return reductionFlotte;
    }

    public void setReductionFlotte(BigDecimal reductionFlotte) {
        this.reductionFlotte = reductionFlotte;
    }

    public BigDecimal getAutreReduction() {
        return autreReduction;
    }

    public void setAutreReduction(BigDecimal autreReduction) {
        this.autreReduction = autreReduction;
    }

    public BigDecimal getTauxMalus() {
        return tauxMalus;
    }

    public void setTauxMalus(BigDecimal tauxMalus) {
        this.tauxMalus = tauxMalus;
    }

    public BigDecimal getTauxBonus() {
        return tauxBonus;
    }

    public void setTauxBonus(BigDecimal tauxBonus) {
        this.tauxBonus = tauxBonus;
    }

    public BigDecimal getTauxFlotte() {
        return tauxFlotte;
    }

    public void setTauxFlotte(BigDecimal tauxFlotte) {
        this.tauxFlotte = tauxFlotte;
    }

    public BigDecimal getTauxPermis() {
        return tauxPermis;
    }

    public void setTauxPermis(BigDecimal tauxPermis) {
        this.tauxPermis = tauxPermis;
    }

    public BigDecimal getTauxAutreReduction() {
        return tauxAutreReduction;
    }

    public void setTauxAutreReduction(BigDecimal tauxAutreReduction) {
        this.tauxAutreReduction = tauxAutreReduction;
    }

    public BigDecimal getAccessoireAuto() {
        return accessoireAuto;
    }

    public void setAccessoireAuto(BigDecimal accessoireAuto) {
        this.accessoireAuto = accessoireAuto;
    }

    public BigDecimal getTaxeEnrAuto() {
        return taxeEnrAuto;
    }

    public void setTaxeEnrAuto(BigDecimal taxeEnrAuto) {
        this.taxeEnrAuto = taxeEnrAuto;
    }

    public BigDecimal getFgaAuto() {
        return fgaAuto;
    }

    public void setFgaAuto(BigDecimal fgaAuto) {
        this.fgaAuto = fgaAuto;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public GarantieChoisie getGarantieChoisie() {
        return garantieChoisie;
    }

    public void setGarantieChoisie(GarantieChoisie garantieChoisie) {
        this.garantieChoisie = garantieChoisie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieGarantieChoisiePK != null ? garantieGarantieChoisiePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisie)) {
            return false;
        }
        GarantieGarantieChoisie other = (GarantieGarantieChoisie) object;
        if ((this.garantieGarantieChoisiePK == null && other.garantieGarantieChoisiePK != null) || (this.garantieGarantieChoisiePK != null && !this.garantieGarantieChoisiePK.equals(other.garantieGarantieChoisiePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisie[ garantieGarantieChoisiePK=" + garantieGarantieChoisiePK + " ]";
    }
    
}
