/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "ceg_debit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CegDebit.findAll", query = "SELECT c FROM CegDebit c"),
    @NamedQuery(name = "CegDebit.findByCodeCegDebit", query = "SELECT c FROM CegDebit c WHERE c.codeCegDebit = :codeCegDebit"),
    @NamedQuery(name = "CegDebit.findByPrestFraisPayeOpBruteDebitExpre", query = "SELECT c FROM CegDebit c WHERE c.prestFraisPayeOpBruteDebitExpre = :prestFraisPayeOpBruteDebitExpre"),
    @NamedQuery(name = "CegDebit.findByPrestFraisPayeCessRetro", query = "SELECT c FROM CegDebit c WHERE c.prestFraisPayeCessRetro = :prestFraisPayeCessRetro"),
    @NamedQuery(name = "CegDebit.findByPrestFraisPayeOpNettes", query = "SELECT c FROM CegDebit c WHERE c.prestFraisPayeOpNettes = :prestFraisPayeOpNettes"),
    @NamedQuery(name = "CegDebit.findByProvSinistreClotureEncoursOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.provSinistreClotureEncoursOpBruttes = :provSinistreClotureEncoursOpBruttes"),
    @NamedQuery(name = "CegDebit.findByProvSinistreClotureEncoursCessRetro", query = "SELECT c FROM CegDebit c WHERE c.provSinistreClotureEncoursCessRetro = :provSinistreClotureEncoursCessRetro"),
    @NamedQuery(name = "CegDebit.findByProvSinistreClotureEncoursOpNettes", query = "SELECT c FROM CegDebit c WHERE c.provSinistreClotureEncoursOpNettes = :provSinistreClotureEncoursOpNettes"),
    @NamedQuery(name = "CegDebit.findByProvSinistreOuverturePrecedentOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.provSinistreOuverturePrecedentOpBruttes = :provSinistreOuverturePrecedentOpBruttes"),
    @NamedQuery(name = "CegDebit.findByProvSinistreOuverturePrecedentCessRetro", query = "SELECT c FROM CegDebit c WHERE c.provSinistreOuverturePrecedentCessRetro = :provSinistreOuverturePrecedentCessRetro"),
    @NamedQuery(name = "CegDebit.findByProvSinistreOuverturePrecedentOpNettes", query = "SELECT c FROM CegDebit c WHERE c.provSinistreOuverturePrecedentOpNettes = :provSinistreOuverturePrecedentOpNettes"),
    @NamedQuery(name = "CegDebit.findByPrestFraisExerciceOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.prestFraisExerciceOpBruttes = :prestFraisExerciceOpBruttes"),
    @NamedQuery(name = "CegDebit.findByPrestFraisExerciceRetroCess", query = "SELECT c FROM CegDebit c WHERE c.prestFraisExerciceRetroCess = :prestFraisExerciceRetroCess"),
    @NamedQuery(name = "CegDebit.findByPrestFraisExerciceOpNettes", query = "SELECT c FROM CegDebit c WHERE c.prestFraisExerciceOpNettes = :prestFraisExerciceOpNettes"),
    @NamedQuery(name = "CegDebit.findByChargeComOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.chargeComOpBruttes = :chargeComOpBruttes"),
    @NamedQuery(name = "CegDebit.findByChargeComCessRetro", query = "SELECT c FROM CegDebit c WHERE c.chargeComCessRetro = :chargeComCessRetro"),
    @NamedQuery(name = "CegDebit.findByChargeComOpNettes", query = "SELECT c FROM CegDebit c WHERE c.chargeComOpNettes = :chargeComOpNettes"),
    @NamedQuery(name = "CegDebit.findByFraisPersOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.fraisPersOpBruttes = :fraisPersOpBruttes"),
    @NamedQuery(name = "CegDebit.findByImpotsTaxesOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.impotsTaxesOpBruttes = :impotsTaxesOpBruttes"),
    @NamedQuery(name = "CegDebit.findByTravFournServOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.travFournServOpBruttes = :travFournServOpBruttes"),
    @NamedQuery(name = "CegDebit.findByTransportDeplOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.transportDeplOpBruttes = :transportDeplOpBruttes"),
    @NamedQuery(name = "CegDebit.findByFraisDiversOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.fraisDiversOpBruttes = :fraisDiversOpBruttes"),
    @NamedQuery(name = "CegDebit.findByDotAmort", query = "SELECT c FROM CegDebit c WHERE c.dotAmort = :dotAmort"),
    @NamedQuery(name = "CegDebit.findByDotProv", query = "SELECT c FROM CegDebit c WHERE c.dotProv = :dotProv"),
    @NamedQuery(name = "CegDebit.findByTotalAutresChargesOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.totalAutresChargesOpBruttes = :totalAutresChargesOpBruttes"),
    @NamedQuery(name = "CegDebit.findByTotalComChargesOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.totalComChargesOpBruttes = :totalComChargesOpBruttes"),
    @NamedQuery(name = "CegDebit.findByTotalComChargesCessRetro", query = "SELECT c FROM CegDebit c WHERE c.totalComChargesCessRetro = :totalComChargesCessRetro"),
    @NamedQuery(name = "CegDebit.findByTotalComChargesOpNettes", query = "SELECT c FROM CegDebit c WHERE c.totalComChargesOpNettes = :totalComChargesOpNettes"),
    @NamedQuery(name = "CegDebit.findByFraisFinancierTitresOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.fraisFinancierTitresOpBruttes = :fraisFinancierTitresOpBruttes"),
    @NamedQuery(name = "CegDebit.findByFraisFinancierImmblePlcmtOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.fraisFinancierImmblePlcmtOpBruttes = :fraisFinancierImmblePlcmtOpBruttes"),
    @NamedQuery(name = "CegDebit.findByAutresFraisFinancierOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.autresFraisFinancierOpBruttes = :autresFraisFinancierOpBruttes"),
    @NamedQuery(name = "CegDebit.findByDotAmortiValeurPlcmtOpBruttes", query = "SELECT c FROM CegDebit c WHERE c.dotAmortiValeurPlcmtOpBruttes = :dotAmortiValeurPlcmtOpBruttes"),
    @NamedQuery(name = "CegDebit.findByTotalPlcmt", query = "SELECT c FROM CegDebit c WHERE c.totalPlcmt = :totalPlcmt"),
    @NamedQuery(name = "CegDebit.findBySoldeCrediteur", query = "SELECT c FROM CegDebit c WHERE c.soldeCrediteur = :soldeCrediteur"),
    @NamedQuery(name = "CegDebit.findByTotalDeb", query = "SELECT c FROM CegDebit c WHERE c.totalDeb = :totalDeb")})
public class CegDebit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_CEG_DEBIT")
    private String codeCegDebit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PREST_FRAIS_PAYE_OP_BRUTE_DEBIT_EXPRE")
    private BigDecimal prestFraisPayeOpBruteDebitExpre;
    @Column(name = "PREST_FRAIS_PAYE_CESS_RETRO")
    private BigDecimal prestFraisPayeCessRetro;
    @Column(name = "PREST_FRAIS_PAYE_OP_NETTES")
    private BigDecimal prestFraisPayeOpNettes;
    @Column(name = "PROV_SINISTRE_CLOTURE_ENCOURS_OP_BRUTTES")
    private BigDecimal provSinistreClotureEncoursOpBruttes;
    @Column(name = "PROV_SINISTRE_CLOTURE_ENCOURS_CESS_RETRO")
    private BigDecimal provSinistreClotureEncoursCessRetro;
    @Column(name = "PROV_SINISTRE_CLOTURE_ENCOURS_OP_NETTES")
    private BigDecimal provSinistreClotureEncoursOpNettes;
    @Column(name = "PROV_SINISTRE_OUVERTURE_PRECEDENT_OP_BRUTTES")
    private BigDecimal provSinistreOuverturePrecedentOpBruttes;
    @Column(name = "PROV_SINISTRE_OUVERTURE_PRECEDENT_CESS_RETRO")
    private BigDecimal provSinistreOuverturePrecedentCessRetro;
    @Column(name = "PROV_SINISTRE_OUVERTURE_PRECEDENT_OP_NETTES")
    private BigDecimal provSinistreOuverturePrecedentOpNettes;
    @Column(name = "PREST_FRAIS_EXERCICE_OP_BRUTTES")
    private BigDecimal prestFraisExerciceOpBruttes;
    @Column(name = "PREST_FRAIS_EXERCICE_RETRO_CESS")
    private BigDecimal prestFraisExerciceRetroCess;
    @Column(name = "PREST_FRAIS_EXERCICE_OP_NETTES")
    private BigDecimal prestFraisExerciceOpNettes;
    @Column(name = "CHARGE_COM_OP_BRUTTES")
    private BigDecimal chargeComOpBruttes;
    @Column(name = "CHARGE_COM_CESS_RETRO")
    private BigDecimal chargeComCessRetro;
    @Column(name = "CHARGE_COM_OP_NETTES")
    private BigDecimal chargeComOpNettes;
    @Column(name = "FRAIS_PERS_OP_BRUTTES")
    private BigDecimal fraisPersOpBruttes;
    @Column(name = "IMPOTS_TAXES_OP_BRUTTES")
    private BigDecimal impotsTaxesOpBruttes;
    @Column(name = "TRAV_FOURN_SERV_OP_BRUTTES")
    private BigDecimal travFournServOpBruttes;
    @Column(name = "TRANSPORT_DEPL_OP_BRUTTES")
    private BigDecimal transportDeplOpBruttes;
    @Column(name = "FRAIS_DIVERS_OP_BRUTTES")
    private BigDecimal fraisDiversOpBruttes;
    @Column(name = "DOT_AMORT")
    private BigDecimal dotAmort;
    @Column(name = "DOT_PROV")
    private BigDecimal dotProv;
    @Column(name = "TOTAL_AUTRES_CHARGES_OP_BRUTTES")
    private BigDecimal totalAutresChargesOpBruttes;
    @Column(name = "TOTAL_COM_CHARGES_OP_BRUTTES")
    private BigDecimal totalComChargesOpBruttes;
    @Column(name = "TOTAL_COM_CHARGES_CESS_RETRO")
    private BigDecimal totalComChargesCessRetro;
    @Column(name = "TOTAL_COM_CHARGES_OP_NETTES")
    private BigDecimal totalComChargesOpNettes;
    @Column(name = "FRAIS_FINANCIER_TITRES_OP_BRUTTES")
    private BigDecimal fraisFinancierTitresOpBruttes;
    @Column(name = "FRAIS_FINANCIER_IMMBLE_PLCMT_OP_BRUTTES")
    private BigDecimal fraisFinancierImmblePlcmtOpBruttes;
    @Column(name = "AUTRES_FRAIS_FINANCIER_OP_BRUTTES")
    private BigDecimal autresFraisFinancierOpBruttes;
    @Column(name = "DOT_AMORTI_VALEUR_PLCMT_OP_BRUTTES")
    private BigDecimal dotAmortiValeurPlcmtOpBruttes;
    @Column(name = "TOTAL_PLCMT")
    private BigDecimal totalPlcmt;
    @Column(name = "SOLDE_CREDITEUR")
    private BigDecimal soldeCrediteur;
    @Column(name = "TOTAL_DEB")
    private BigDecimal totalDeb;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public CegDebit() {
    }

    public CegDebit(String codeCegDebit) {
        this.codeCegDebit = codeCegDebit;
    }

    public String getCodeCegDebit() {
        return codeCegDebit;
    }

    public void setCodeCegDebit(String codeCegDebit) {
        this.codeCegDebit = codeCegDebit;
    }

    public BigDecimal getPrestFraisPayeOpBruteDebitExpre() {
        return prestFraisPayeOpBruteDebitExpre;
    }

    public void setPrestFraisPayeOpBruteDebitExpre(BigDecimal prestFraisPayeOpBruteDebitExpre) {
        this.prestFraisPayeOpBruteDebitExpre = prestFraisPayeOpBruteDebitExpre;
    }

    public BigDecimal getPrestFraisPayeCessRetro() {
        return prestFraisPayeCessRetro;
    }

    public void setPrestFraisPayeCessRetro(BigDecimal prestFraisPayeCessRetro) {
        this.prestFraisPayeCessRetro = prestFraisPayeCessRetro;
    }

    public BigDecimal getPrestFraisPayeOpNettes() {
        return prestFraisPayeOpNettes;
    }

    public void setPrestFraisPayeOpNettes(BigDecimal prestFraisPayeOpNettes) {
        this.prestFraisPayeOpNettes = prestFraisPayeOpNettes;
    }

    public BigDecimal getProvSinistreClotureEncoursOpBruttes() {
        return provSinistreClotureEncoursOpBruttes;
    }

    public void setProvSinistreClotureEncoursOpBruttes(BigDecimal provSinistreClotureEncoursOpBruttes) {
        this.provSinistreClotureEncoursOpBruttes = provSinistreClotureEncoursOpBruttes;
    }

    public BigDecimal getProvSinistreClotureEncoursCessRetro() {
        return provSinistreClotureEncoursCessRetro;
    }

    public void setProvSinistreClotureEncoursCessRetro(BigDecimal provSinistreClotureEncoursCessRetro) {
        this.provSinistreClotureEncoursCessRetro = provSinistreClotureEncoursCessRetro;
    }

    public BigDecimal getProvSinistreClotureEncoursOpNettes() {
        return provSinistreClotureEncoursOpNettes;
    }

    public void setProvSinistreClotureEncoursOpNettes(BigDecimal provSinistreClotureEncoursOpNettes) {
        this.provSinistreClotureEncoursOpNettes = provSinistreClotureEncoursOpNettes;
    }

    public BigDecimal getProvSinistreOuverturePrecedentOpBruttes() {
        return provSinistreOuverturePrecedentOpBruttes;
    }

    public void setProvSinistreOuverturePrecedentOpBruttes(BigDecimal provSinistreOuverturePrecedentOpBruttes) {
        this.provSinistreOuverturePrecedentOpBruttes = provSinistreOuverturePrecedentOpBruttes;
    }

    public BigDecimal getProvSinistreOuverturePrecedentCessRetro() {
        return provSinistreOuverturePrecedentCessRetro;
    }

    public void setProvSinistreOuverturePrecedentCessRetro(BigDecimal provSinistreOuverturePrecedentCessRetro) {
        this.provSinistreOuverturePrecedentCessRetro = provSinistreOuverturePrecedentCessRetro;
    }

    public BigDecimal getProvSinistreOuverturePrecedentOpNettes() {
        return provSinistreOuverturePrecedentOpNettes;
    }

    public void setProvSinistreOuverturePrecedentOpNettes(BigDecimal provSinistreOuverturePrecedentOpNettes) {
        this.provSinistreOuverturePrecedentOpNettes = provSinistreOuverturePrecedentOpNettes;
    }

    public BigDecimal getPrestFraisExerciceOpBruttes() {
        return prestFraisExerciceOpBruttes;
    }

    public void setPrestFraisExerciceOpBruttes(BigDecimal prestFraisExerciceOpBruttes) {
        this.prestFraisExerciceOpBruttes = prestFraisExerciceOpBruttes;
    }

    public BigDecimal getPrestFraisExerciceRetroCess() {
        return prestFraisExerciceRetroCess;
    }

    public void setPrestFraisExerciceRetroCess(BigDecimal prestFraisExerciceRetroCess) {
        this.prestFraisExerciceRetroCess = prestFraisExerciceRetroCess;
    }

    public BigDecimal getPrestFraisExerciceOpNettes() {
        return prestFraisExerciceOpNettes;
    }

    public void setPrestFraisExerciceOpNettes(BigDecimal prestFraisExerciceOpNettes) {
        this.prestFraisExerciceOpNettes = prestFraisExerciceOpNettes;
    }

    public BigDecimal getChargeComOpBruttes() {
        return chargeComOpBruttes;
    }

    public void setChargeComOpBruttes(BigDecimal chargeComOpBruttes) {
        this.chargeComOpBruttes = chargeComOpBruttes;
    }

    public BigDecimal getChargeComCessRetro() {
        return chargeComCessRetro;
    }

    public void setChargeComCessRetro(BigDecimal chargeComCessRetro) {
        this.chargeComCessRetro = chargeComCessRetro;
    }

    public BigDecimal getChargeComOpNettes() {
        return chargeComOpNettes;
    }

    public void setChargeComOpNettes(BigDecimal chargeComOpNettes) {
        this.chargeComOpNettes = chargeComOpNettes;
    }

    public BigDecimal getFraisPersOpBruttes() {
        return fraisPersOpBruttes;
    }

    public void setFraisPersOpBruttes(BigDecimal fraisPersOpBruttes) {
        this.fraisPersOpBruttes = fraisPersOpBruttes;
    }

    public BigDecimal getImpotsTaxesOpBruttes() {
        return impotsTaxesOpBruttes;
    }

    public void setImpotsTaxesOpBruttes(BigDecimal impotsTaxesOpBruttes) {
        this.impotsTaxesOpBruttes = impotsTaxesOpBruttes;
    }

    public BigDecimal getTravFournServOpBruttes() {
        return travFournServOpBruttes;
    }

    public void setTravFournServOpBruttes(BigDecimal travFournServOpBruttes) {
        this.travFournServOpBruttes = travFournServOpBruttes;
    }

    public BigDecimal getTransportDeplOpBruttes() {
        return transportDeplOpBruttes;
    }

    public void setTransportDeplOpBruttes(BigDecimal transportDeplOpBruttes) {
        this.transportDeplOpBruttes = transportDeplOpBruttes;
    }

    public BigDecimal getFraisDiversOpBruttes() {
        return fraisDiversOpBruttes;
    }

    public void setFraisDiversOpBruttes(BigDecimal fraisDiversOpBruttes) {
        this.fraisDiversOpBruttes = fraisDiversOpBruttes;
    }

    public BigDecimal getDotAmort() {
        return dotAmort;
    }

    public void setDotAmort(BigDecimal dotAmort) {
        this.dotAmort = dotAmort;
    }

    public BigDecimal getDotProv() {
        return dotProv;
    }

    public void setDotProv(BigDecimal dotProv) {
        this.dotProv = dotProv;
    }

    public BigDecimal getTotalAutresChargesOpBruttes() {
        return totalAutresChargesOpBruttes;
    }

    public void setTotalAutresChargesOpBruttes(BigDecimal totalAutresChargesOpBruttes) {
        this.totalAutresChargesOpBruttes = totalAutresChargesOpBruttes;
    }

    public BigDecimal getTotalComChargesOpBruttes() {
        return totalComChargesOpBruttes;
    }

    public void setTotalComChargesOpBruttes(BigDecimal totalComChargesOpBruttes) {
        this.totalComChargesOpBruttes = totalComChargesOpBruttes;
    }

    public BigDecimal getTotalComChargesCessRetro() {
        return totalComChargesCessRetro;
    }

    public void setTotalComChargesCessRetro(BigDecimal totalComChargesCessRetro) {
        this.totalComChargesCessRetro = totalComChargesCessRetro;
    }

    public BigDecimal getTotalComChargesOpNettes() {
        return totalComChargesOpNettes;
    }

    public void setTotalComChargesOpNettes(BigDecimal totalComChargesOpNettes) {
        this.totalComChargesOpNettes = totalComChargesOpNettes;
    }

    public BigDecimal getFraisFinancierTitresOpBruttes() {
        return fraisFinancierTitresOpBruttes;
    }

    public void setFraisFinancierTitresOpBruttes(BigDecimal fraisFinancierTitresOpBruttes) {
        this.fraisFinancierTitresOpBruttes = fraisFinancierTitresOpBruttes;
    }

    public BigDecimal getFraisFinancierImmblePlcmtOpBruttes() {
        return fraisFinancierImmblePlcmtOpBruttes;
    }

    public void setFraisFinancierImmblePlcmtOpBruttes(BigDecimal fraisFinancierImmblePlcmtOpBruttes) {
        this.fraisFinancierImmblePlcmtOpBruttes = fraisFinancierImmblePlcmtOpBruttes;
    }

    public BigDecimal getAutresFraisFinancierOpBruttes() {
        return autresFraisFinancierOpBruttes;
    }

    public void setAutresFraisFinancierOpBruttes(BigDecimal autresFraisFinancierOpBruttes) {
        this.autresFraisFinancierOpBruttes = autresFraisFinancierOpBruttes;
    }

    public BigDecimal getDotAmortiValeurPlcmtOpBruttes() {
        return dotAmortiValeurPlcmtOpBruttes;
    }

    public void setDotAmortiValeurPlcmtOpBruttes(BigDecimal dotAmortiValeurPlcmtOpBruttes) {
        this.dotAmortiValeurPlcmtOpBruttes = dotAmortiValeurPlcmtOpBruttes;
    }

    public BigDecimal getTotalPlcmt() {
        return totalPlcmt;
    }

    public void setTotalPlcmt(BigDecimal totalPlcmt) {
        this.totalPlcmt = totalPlcmt;
    }

    public BigDecimal getSoldeCrediteur() {
        return soldeCrediteur;
    }

    public void setSoldeCrediteur(BigDecimal soldeCrediteur) {
        this.soldeCrediteur = soldeCrediteur;
    }

    public BigDecimal getTotalDeb() {
        return totalDeb;
    }

    public void setTotalDeb(BigDecimal totalDeb) {
        this.totalDeb = totalDeb;
    }

    public EtatCima getCodeEtatCima() {
        return codeEtatCima;
    }

    public void setCodeEtatCima(EtatCima codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCegDebit != null ? codeCegDebit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CegDebit)) {
            return false;
        }
        CegDebit other = (CegDebit) object;
        if ((this.codeCegDebit == null && other.codeCegDebit != null) || (this.codeCegDebit != null && !this.codeCegDebit.equals(other.codeCegDebit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CegDebit[ codeCegDebit=" + codeCegDebit + " ]";
    }
    
}
