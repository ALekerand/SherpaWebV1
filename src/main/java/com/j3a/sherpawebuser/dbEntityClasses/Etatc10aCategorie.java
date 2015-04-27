/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "etatc10a_categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10aCategorie.findAll", query = "SELECT e FROM Etatc10aCategorie e"),
    @NamedQuery(name = "Etatc10aCategorie.findByCodeEtatc10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.etatc10aCategoriePK.codeEtatc10a = :codeEtatc10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByCodecategoriecima", query = "SELECT e FROM Etatc10aCategorie e WHERE e.etatc10aCategoriePK.codecategoriecima = :codecategoriecima"),
    @NamedQuery(name = "Etatc10aCategorie.findByPrimeEmiseAccImpotTaxe", query = "SELECT e FROM Etatc10aCategorie e WHERE e.primeEmiseAccImpotTaxe = :primeEmiseAccImpotTaxe"),
    @NamedQuery(name = "Etatc10aCategorie.findByDotProvPrime", query = "SELECT e FROM Etatc10aCategorie e WHERE e.dotProvPrime = :dotProvPrime"),
    @NamedQuery(name = "Etatc10aCategorie.findByPrimesAcquisesC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.primesAcquisesC10a = :primesAcquisesC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByRgmtEffectueC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.rgmtEffectueC10a = :rgmtEffectueC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findBySinPayerExoEncours", query = "SELECT e FROM Etatc10aCategorie e WHERE e.sinPayerExoEncours = :sinPayerExoEncours"),
    @NamedQuery(name = "Etatc10aCategorie.findBySinPayerExoPrec", query = "SELECT e FROM Etatc10aCategorie e WHERE e.sinPayerExoPrec = :sinPayerExoPrec"),
    @NamedQuery(name = "Etatc10aCategorie.findByRecoursEncaisseC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.recoursEncaisseC10a = :recoursEncaisseC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByChargesSinistreC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.chargesSinistreC10a = :chargesSinistreC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByComissionsC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.comissionsC10a = :comissionsC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByFraisGenC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.fraisGenC10a = :fraisGenC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findBySoldeBruteExo", query = "SELECT e FROM Etatc10aCategorie e WHERE e.soldeBruteExo = :soldeBruteExo"),
    @NamedQuery(name = "Etatc10aCategorie.findBySPaC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.sPaC10a = :sPaC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByTauxComC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.tauxComC10a = :tauxComC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByTauxFraisGenC10a", query = "SELECT e FROM Etatc10aCategorie e WHERE e.tauxFraisGenC10a = :tauxFraisGenC10a"),
    @NamedQuery(name = "Etatc10aCategorie.findByTauxSoldePa", query = "SELECT e FROM Etatc10aCategorie e WHERE e.tauxSoldePa = :tauxSoldePa")})
public class Etatc10aCategorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Etatc10aCategoriePK etatc10aCategoriePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_EMISE_ACC_IMPOT_TAXE")
    private BigDecimal primeEmiseAccImpotTaxe;
    @Column(name = "DOT_PROV_PRIME")
    private BigDecimal dotProvPrime;
    @Column(name = "PRIMES_ACQUISES_C10A")
    private BigDecimal primesAcquisesC10a;
    @Column(name = "RGMT_EFFECTUE_C10A")
    private BigDecimal rgmtEffectueC10a;
    @Column(name = "SIN_PAYER_EXO_ENCOURS")
    private BigDecimal sinPayerExoEncours;
    @Column(name = "SIN_PAYER_EXO_PREC")
    private BigDecimal sinPayerExoPrec;
    @Column(name = "RECOURS_ENCAISSE_C10A")
    private BigDecimal recoursEncaisseC10a;
    @Column(name = "CHARGES_SINISTRE_C10A")
    private BigDecimal chargesSinistreC10a;
    @Column(name = "COMISSIONS_C10A")
    private BigDecimal comissionsC10a;
    @Column(name = "FRAIS_GEN_C10A")
    private BigDecimal fraisGenC10a;
    @Column(name = "SOLDE_BRUTE_EXO")
    private BigDecimal soldeBruteExo;
    @Column(name = "S_PA_C10A")
    private BigDecimal sPaC10a;
    @Column(name = "TAUX_COM_C10A")
    private BigDecimal tauxComC10a;
    @Column(name = "TAUX_FRAIS_GEN_C10A")
    private BigDecimal tauxFraisGenC10a;
    @Column(name = "TAUX_SOLDE_PA")
    private BigDecimal tauxSoldePa;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CategorieCima categorieCima;
    @JoinColumn(name = "CODE_ETATC10A", referencedColumnName = "CODE_ETATC10A", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etatc10a etatc10a;

    public Etatc10aCategorie() {
    }

    public Etatc10aCategorie(Etatc10aCategoriePK etatc10aCategoriePK) {
        this.etatc10aCategoriePK = etatc10aCategoriePK;
    }

    public Etatc10aCategorie(String codeEtatc10a, String codecategoriecima) {
        this.etatc10aCategoriePK = new Etatc10aCategoriePK(codeEtatc10a, codecategoriecima);
    }

    public Etatc10aCategoriePK getEtatc10aCategoriePK() {
        return etatc10aCategoriePK;
    }

    public void setEtatc10aCategoriePK(Etatc10aCategoriePK etatc10aCategoriePK) {
        this.etatc10aCategoriePK = etatc10aCategoriePK;
    }

    public BigDecimal getPrimeEmiseAccImpotTaxe() {
        return primeEmiseAccImpotTaxe;
    }

    public void setPrimeEmiseAccImpotTaxe(BigDecimal primeEmiseAccImpotTaxe) {
        this.primeEmiseAccImpotTaxe = primeEmiseAccImpotTaxe;
    }

    public BigDecimal getDotProvPrime() {
        return dotProvPrime;
    }

    public void setDotProvPrime(BigDecimal dotProvPrime) {
        this.dotProvPrime = dotProvPrime;
    }

    public BigDecimal getPrimesAcquisesC10a() {
        return primesAcquisesC10a;
    }

    public void setPrimesAcquisesC10a(BigDecimal primesAcquisesC10a) {
        this.primesAcquisesC10a = primesAcquisesC10a;
    }

    public BigDecimal getRgmtEffectueC10a() {
        return rgmtEffectueC10a;
    }

    public void setRgmtEffectueC10a(BigDecimal rgmtEffectueC10a) {
        this.rgmtEffectueC10a = rgmtEffectueC10a;
    }

    public BigDecimal getSinPayerExoEncours() {
        return sinPayerExoEncours;
    }

    public void setSinPayerExoEncours(BigDecimal sinPayerExoEncours) {
        this.sinPayerExoEncours = sinPayerExoEncours;
    }

    public BigDecimal getSinPayerExoPrec() {
        return sinPayerExoPrec;
    }

    public void setSinPayerExoPrec(BigDecimal sinPayerExoPrec) {
        this.sinPayerExoPrec = sinPayerExoPrec;
    }

    public BigDecimal getRecoursEncaisseC10a() {
        return recoursEncaisseC10a;
    }

    public void setRecoursEncaisseC10a(BigDecimal recoursEncaisseC10a) {
        this.recoursEncaisseC10a = recoursEncaisseC10a;
    }

    public BigDecimal getChargesSinistreC10a() {
        return chargesSinistreC10a;
    }

    public void setChargesSinistreC10a(BigDecimal chargesSinistreC10a) {
        this.chargesSinistreC10a = chargesSinistreC10a;
    }

    public BigDecimal getComissionsC10a() {
        return comissionsC10a;
    }

    public void setComissionsC10a(BigDecimal comissionsC10a) {
        this.comissionsC10a = comissionsC10a;
    }

    public BigDecimal getFraisGenC10a() {
        return fraisGenC10a;
    }

    public void setFraisGenC10a(BigDecimal fraisGenC10a) {
        this.fraisGenC10a = fraisGenC10a;
    }

    public BigDecimal getSoldeBruteExo() {
        return soldeBruteExo;
    }

    public void setSoldeBruteExo(BigDecimal soldeBruteExo) {
        this.soldeBruteExo = soldeBruteExo;
    }

    public BigDecimal getSPaC10a() {
        return sPaC10a;
    }

    public void setSPaC10a(BigDecimal sPaC10a) {
        this.sPaC10a = sPaC10a;
    }

    public BigDecimal getTauxComC10a() {
        return tauxComC10a;
    }

    public void setTauxComC10a(BigDecimal tauxComC10a) {
        this.tauxComC10a = tauxComC10a;
    }

    public BigDecimal getTauxFraisGenC10a() {
        return tauxFraisGenC10a;
    }

    public void setTauxFraisGenC10a(BigDecimal tauxFraisGenC10a) {
        this.tauxFraisGenC10a = tauxFraisGenC10a;
    }

    public BigDecimal getTauxSoldePa() {
        return tauxSoldePa;
    }

    public void setTauxSoldePa(BigDecimal tauxSoldePa) {
        this.tauxSoldePa = tauxSoldePa;
    }

    public CategorieCima getCategorieCima() {
        return categorieCima;
    }

    public void setCategorieCima(CategorieCima categorieCima) {
        this.categorieCima = categorieCima;
    }

    public Etatc10a getEtatc10a() {
        return etatc10a;
    }

    public void setEtatc10a(Etatc10a etatc10a) {
        this.etatc10a = etatc10a;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etatc10aCategoriePK != null ? etatc10aCategoriePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10aCategorie)) {
            return false;
        }
        Etatc10aCategorie other = (Etatc10aCategorie) object;
        if ((this.etatc10aCategoriePK == null && other.etatc10aCategoriePK != null) || (this.etatc10aCategoriePK != null && !this.etatc10aCategoriePK.equals(other.etatc10aCategoriePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10aCategorie[ etatc10aCategoriePK=" + etatc10aCategoriePK + " ]";
    }
    
}
