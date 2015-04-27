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
@Table(name = "ceg_credit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CegCredit.findAll", query = "SELECT c FROM CegCredit c"),
    @NamedQuery(name = "CegCredit.findByCodeCegCredit", query = "SELECT c FROM CegCredit c WHERE c.codeCegCredit = :codeCegCredit"),
    @NamedQuery(name = "CegCredit.findByPrimeAccNetAnnulOpBruttes", query = "SELECT c FROM CegCredit c WHERE c.primeAccNetAnnulOpBruttes = :primeAccNetAnnulOpBruttes"),
    @NamedQuery(name = "CegCredit.findByPrimeAccNetAnnulCessRetro", query = "SELECT c FROM CegCredit c WHERE c.primeAccNetAnnulCessRetro = :primeAccNetAnnulCessRetro"),
    @NamedQuery(name = "CegCredit.findByPrimeAccNetAnnulOpNettes", query = "SELECT c FROM CegCredit c WHERE c.primeAccNetAnnulOpNettes = :primeAccNetAnnulOpNettes"),
    @NamedQuery(name = "CegCredit.findByProvPrimeOuverturePrecedentOpBruttes", query = "SELECT c FROM CegCredit c WHERE c.provPrimeOuverturePrecedentOpBruttes = :provPrimeOuverturePrecedentOpBruttes"),
    @NamedQuery(name = "CegCredit.findByProvPrimeOuverturePrecedentCessRetro", query = "SELECT c FROM CegCredit c WHERE c.provPrimeOuverturePrecedentCessRetro = :provPrimeOuverturePrecedentCessRetro"),
    @NamedQuery(name = "CegCredit.findByProvPrimeOuverturePrecedentOpNettes", query = "SELECT c FROM CegCredit c WHERE c.provPrimeOuverturePrecedentOpNettes = :provPrimeOuverturePrecedentOpNettes"),
    @NamedQuery(name = "CegCredit.findByProvPrimeClotureEncoursOpBruttes", query = "SELECT c FROM CegCredit c WHERE c.provPrimeClotureEncoursOpBruttes = :provPrimeClotureEncoursOpBruttes"),
    @NamedQuery(name = "CegCredit.findByProvPrimeClotureEncoursCessRetro", query = "SELECT c FROM CegCredit c WHERE c.provPrimeClotureEncoursCessRetro = :provPrimeClotureEncoursCessRetro"),
    @NamedQuery(name = "CegCredit.findByProvPrimeClotureEncoursOpNettes", query = "SELECT c FROM CegCredit c WHERE c.provPrimeClotureEncoursOpNettes = :provPrimeClotureEncoursOpNettes"),
    @NamedQuery(name = "CegCredit.findByPrimeExoOpBruttes", query = "SELECT c FROM CegCredit c WHERE c.primeExoOpBruttes = :primeExoOpBruttes"),
    @NamedQuery(name = "CegCredit.findByPrimeExoCessRetro", query = "SELECT c FROM CegCredit c WHERE c.primeExoCessRetro = :primeExoCessRetro"),
    @NamedQuery(name = "CegCredit.findByPrimeExoOpNettes", query = "SELECT c FROM CegCredit c WHERE c.primeExoOpNettes = :primeExoOpNettes"),
    @NamedQuery(name = "CegCredit.findByPduitFinanciersTitres", query = "SELECT c FROM CegCredit c WHERE c.pduitFinanciersTitres = :pduitFinanciersTitres"),
    @NamedQuery(name = "CegCredit.findByPduitsFinanciersAutres", query = "SELECT c FROM CegCredit c WHERE c.pduitsFinanciersAutres = :pduitsFinanciersAutres"),
    @NamedQuery(name = "CegCredit.findByTotalPduitsPlcmt", query = "SELECT c FROM CegCredit c WHERE c.totalPduitsPlcmt = :totalPduitsPlcmt"),
    @NamedQuery(name = "CegCredit.findByTransfertCharges", query = "SELECT c FROM CegCredit c WHERE c.transfertCharges = :transfertCharges"),
    @NamedQuery(name = "CegCredit.findByComRecuCoass", query = "SELECT c FROM CegCredit c WHERE c.comRecuCoass = :comRecuCoass"),
    @NamedQuery(name = "CegCredit.findByPduitsAcc", query = "SELECT c FROM CegCredit c WHERE c.pduitsAcc = :pduitsAcc"),
    @NamedQuery(name = "CegCredit.findByTotalAutresPduits", query = "SELECT c FROM CegCredit c WHERE c.totalAutresPduits = :totalAutresPduits"),
    @NamedQuery(name = "CegCredit.findByChargesNonImputables", query = "SELECT c FROM CegCredit c WHERE c.chargesNonImputables = :chargesNonImputables"),
    @NamedQuery(name = "CegCredit.findBySoldeDebiteur", query = "SELECT c FROM CegCredit c WHERE c.soldeDebiteur = :soldeDebiteur"),
    @NamedQuery(name = "CegCredit.findByTotalCred", query = "SELECT c FROM CegCredit c WHERE c.totalCred = :totalCred")})
public class CegCredit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_CEG_CREDIT")
    private String codeCegCredit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_ACC_NET_ANNUL_OP_BRUTTES")
    private BigDecimal primeAccNetAnnulOpBruttes;
    @Column(name = "PRIME_ACC_NET_ANNUL_CESS_RETRO")
    private BigDecimal primeAccNetAnnulCessRetro;
    @Column(name = "PRIME_ACC_NET_ANNUL_OP_NETTES")
    private BigDecimal primeAccNetAnnulOpNettes;
    @Column(name = "PROV_PRIME_OUVERTURE_PRECEDENT_OP_BRUTTES")
    private BigDecimal provPrimeOuverturePrecedentOpBruttes;
    @Column(name = "PROV_PRIME_OUVERTURE_PRECEDENT_CESS_RETRO")
    private BigDecimal provPrimeOuverturePrecedentCessRetro;
    @Column(name = "PROV_PRIME_OUVERTURE_PRECEDENT_OP_NETTES")
    private BigDecimal provPrimeOuverturePrecedentOpNettes;
    @Column(name = "PROV_PRIME_CLOTURE_ENCOURS_OP_BRUTTES")
    private BigDecimal provPrimeClotureEncoursOpBruttes;
    @Column(name = "PROV_PRIME_CLOTURE_ENCOURS_CESS_RETRO")
    private BigDecimal provPrimeClotureEncoursCessRetro;
    @Column(name = "PROV_PRIME_CLOTURE_ENCOURS_OP_NETTES")
    private BigDecimal provPrimeClotureEncoursOpNettes;
    @Column(name = "PRIME_EXO_OP_BRUTTES")
    private BigDecimal primeExoOpBruttes;
    @Column(name = "PRIME_EXO_CESS_RETRO")
    private BigDecimal primeExoCessRetro;
    @Column(name = "PRIME_EXO_OP_NETTES")
    private BigDecimal primeExoOpNettes;
    @Column(name = "PDUIT_FINANCIERS_TITRES")
    private BigDecimal pduitFinanciersTitres;
    @Column(name = "PDUITS_FINANCIERS_AUTRES")
    private BigDecimal pduitsFinanciersAutres;
    @Column(name = "TOTAL_PDUITS_PLCMT")
    private BigDecimal totalPduitsPlcmt;
    @Column(name = "TRANSFERT_CHARGES")
    private BigDecimal transfertCharges;
    @Column(name = "COM_RECU_COASS")
    private BigDecimal comRecuCoass;
    @Column(name = "PDUITS_ACC")
    private BigDecimal pduitsAcc;
    @Column(name = "TOTAL_AUTRES_PDUITS")
    private BigDecimal totalAutresPduits;
    @Column(name = "CHARGES_NON_IMPUTABLES")
    private BigDecimal chargesNonImputables;
    @Column(name = "SOLDE_DEBITEUR")
    private BigDecimal soldeDebiteur;
    @Column(name = "TOTAL_CRED")
    private BigDecimal totalCred;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public CegCredit() {
    }

    public CegCredit(String codeCegCredit) {
        this.codeCegCredit = codeCegCredit;
    }

    public String getCodeCegCredit() {
        return codeCegCredit;
    }

    public void setCodeCegCredit(String codeCegCredit) {
        this.codeCegCredit = codeCegCredit;
    }

    public BigDecimal getPrimeAccNetAnnulOpBruttes() {
        return primeAccNetAnnulOpBruttes;
    }

    public void setPrimeAccNetAnnulOpBruttes(BigDecimal primeAccNetAnnulOpBruttes) {
        this.primeAccNetAnnulOpBruttes = primeAccNetAnnulOpBruttes;
    }

    public BigDecimal getPrimeAccNetAnnulCessRetro() {
        return primeAccNetAnnulCessRetro;
    }

    public void setPrimeAccNetAnnulCessRetro(BigDecimal primeAccNetAnnulCessRetro) {
        this.primeAccNetAnnulCessRetro = primeAccNetAnnulCessRetro;
    }

    public BigDecimal getPrimeAccNetAnnulOpNettes() {
        return primeAccNetAnnulOpNettes;
    }

    public void setPrimeAccNetAnnulOpNettes(BigDecimal primeAccNetAnnulOpNettes) {
        this.primeAccNetAnnulOpNettes = primeAccNetAnnulOpNettes;
    }

    public BigDecimal getProvPrimeOuverturePrecedentOpBruttes() {
        return provPrimeOuverturePrecedentOpBruttes;
    }

    public void setProvPrimeOuverturePrecedentOpBruttes(BigDecimal provPrimeOuverturePrecedentOpBruttes) {
        this.provPrimeOuverturePrecedentOpBruttes = provPrimeOuverturePrecedentOpBruttes;
    }

    public BigDecimal getProvPrimeOuverturePrecedentCessRetro() {
        return provPrimeOuverturePrecedentCessRetro;
    }

    public void setProvPrimeOuverturePrecedentCessRetro(BigDecimal provPrimeOuverturePrecedentCessRetro) {
        this.provPrimeOuverturePrecedentCessRetro = provPrimeOuverturePrecedentCessRetro;
    }

    public BigDecimal getProvPrimeOuverturePrecedentOpNettes() {
        return provPrimeOuverturePrecedentOpNettes;
    }

    public void setProvPrimeOuverturePrecedentOpNettes(BigDecimal provPrimeOuverturePrecedentOpNettes) {
        this.provPrimeOuverturePrecedentOpNettes = provPrimeOuverturePrecedentOpNettes;
    }

    public BigDecimal getProvPrimeClotureEncoursOpBruttes() {
        return provPrimeClotureEncoursOpBruttes;
    }

    public void setProvPrimeClotureEncoursOpBruttes(BigDecimal provPrimeClotureEncoursOpBruttes) {
        this.provPrimeClotureEncoursOpBruttes = provPrimeClotureEncoursOpBruttes;
    }

    public BigDecimal getProvPrimeClotureEncoursCessRetro() {
        return provPrimeClotureEncoursCessRetro;
    }

    public void setProvPrimeClotureEncoursCessRetro(BigDecimal provPrimeClotureEncoursCessRetro) {
        this.provPrimeClotureEncoursCessRetro = provPrimeClotureEncoursCessRetro;
    }

    public BigDecimal getProvPrimeClotureEncoursOpNettes() {
        return provPrimeClotureEncoursOpNettes;
    }

    public void setProvPrimeClotureEncoursOpNettes(BigDecimal provPrimeClotureEncoursOpNettes) {
        this.provPrimeClotureEncoursOpNettes = provPrimeClotureEncoursOpNettes;
    }

    public BigDecimal getPrimeExoOpBruttes() {
        return primeExoOpBruttes;
    }

    public void setPrimeExoOpBruttes(BigDecimal primeExoOpBruttes) {
        this.primeExoOpBruttes = primeExoOpBruttes;
    }

    public BigDecimal getPrimeExoCessRetro() {
        return primeExoCessRetro;
    }

    public void setPrimeExoCessRetro(BigDecimal primeExoCessRetro) {
        this.primeExoCessRetro = primeExoCessRetro;
    }

    public BigDecimal getPrimeExoOpNettes() {
        return primeExoOpNettes;
    }

    public void setPrimeExoOpNettes(BigDecimal primeExoOpNettes) {
        this.primeExoOpNettes = primeExoOpNettes;
    }

    public BigDecimal getPduitFinanciersTitres() {
        return pduitFinanciersTitres;
    }

    public void setPduitFinanciersTitres(BigDecimal pduitFinanciersTitres) {
        this.pduitFinanciersTitres = pduitFinanciersTitres;
    }

    public BigDecimal getPduitsFinanciersAutres() {
        return pduitsFinanciersAutres;
    }

    public void setPduitsFinanciersAutres(BigDecimal pduitsFinanciersAutres) {
        this.pduitsFinanciersAutres = pduitsFinanciersAutres;
    }

    public BigDecimal getTotalPduitsPlcmt() {
        return totalPduitsPlcmt;
    }

    public void setTotalPduitsPlcmt(BigDecimal totalPduitsPlcmt) {
        this.totalPduitsPlcmt = totalPduitsPlcmt;
    }

    public BigDecimal getTransfertCharges() {
        return transfertCharges;
    }

    public void setTransfertCharges(BigDecimal transfertCharges) {
        this.transfertCharges = transfertCharges;
    }

    public BigDecimal getComRecuCoass() {
        return comRecuCoass;
    }

    public void setComRecuCoass(BigDecimal comRecuCoass) {
        this.comRecuCoass = comRecuCoass;
    }

    public BigDecimal getPduitsAcc() {
        return pduitsAcc;
    }

    public void setPduitsAcc(BigDecimal pduitsAcc) {
        this.pduitsAcc = pduitsAcc;
    }

    public BigDecimal getTotalAutresPduits() {
        return totalAutresPduits;
    }

    public void setTotalAutresPduits(BigDecimal totalAutresPduits) {
        this.totalAutresPduits = totalAutresPduits;
    }

    public BigDecimal getChargesNonImputables() {
        return chargesNonImputables;
    }

    public void setChargesNonImputables(BigDecimal chargesNonImputables) {
        this.chargesNonImputables = chargesNonImputables;
    }

    public BigDecimal getSoldeDebiteur() {
        return soldeDebiteur;
    }

    public void setSoldeDebiteur(BigDecimal soldeDebiteur) {
        this.soldeDebiteur = soldeDebiteur;
    }

    public BigDecimal getTotalCred() {
        return totalCred;
    }

    public void setTotalCred(BigDecimal totalCred) {
        this.totalCred = totalCred;
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
        hash += (codeCegCredit != null ? codeCegCredit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CegCredit)) {
            return false;
        }
        CegCredit other = (CegCredit) object;
        if ((this.codeCegCredit == null && other.codeCegCredit != null) || (this.codeCegCredit != null && !this.codeCegCredit.equals(other.codeCegCredit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CegCredit[ codeCegCredit=" + codeCegCredit + " ]";
    }
    
}
