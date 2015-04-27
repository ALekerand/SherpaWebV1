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
@Table(name = "quittance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Quittance.findAll", query = "SELECT q FROM Quittance q"),
    @NamedQuery(name = "Quittance.findByCodeQuittance", query = "SELECT q FROM Quittance q WHERE q.codeQuittance = :codeQuittance"),
    @NamedQuery(name = "Quittance.findByEtatQuittance", query = "SELECT q FROM Quittance q WHERE q.etatQuittance = :etatQuittance"),
    @NamedQuery(name = "Quittance.findByPrimeCedee", query = "SELECT q FROM Quittance q WHERE q.primeCedee = :primeCedee"),
    @NamedQuery(name = "Quittance.findByAccessoire", query = "SELECT q FROM Quittance q WHERE q.accessoire = :accessoire"),
    @NamedQuery(name = "Quittance.findByTaxes", query = "SELECT q FROM Quittance q WHERE q.taxes = :taxes"),
    @NamedQuery(name = "Quittance.findByNetAPayer", query = "SELECT q FROM Quittance q WHERE q.netAPayer = :netAPayer"),
    @NamedQuery(name = "Quittance.findByFga", query = "SELECT q FROM Quittance q WHERE q.fga = :fga"),
    @NamedQuery(name = "Quittance.findByDateQuittance", query = "SELECT q FROM Quittance q WHERE q.dateQuittance = :dateQuittance"),
    @NamedQuery(name = "Quittance.findByPrimeNette", query = "SELECT q FROM Quittance q WHERE q.primeNette = :primeNette"),
    @NamedQuery(name = "Quittance.findByAccCnie", query = "SELECT q FROM Quittance q WHERE q.accCnie = :accCnie"),
    @NamedQuery(name = "Quittance.findByAccIntrerm", query = "SELECT q FROM Quittance q WHERE q.accIntrerm = :accIntrerm"),
    @NamedQuery(name = "Quittance.findByAccGestionnaire", query = "SELECT q FROM Quittance q WHERE q.accGestionnaire = :accGestionnaire"),
    @NamedQuery(name = "Quittance.findByComInterm", query = "SELECT q FROM Quittance q WHERE q.comInterm = :comInterm"),
    @NamedQuery(name = "Quittance.findByComConseil", query = "SELECT q FROM Quittance q WHERE q.comConseil = :comConseil"),
    @NamedQuery(name = "Quittance.findByComGestionnaire", query = "SELECT q FROM Quittance q WHERE q.comGestionnaire = :comGestionnaire"),
    @NamedQuery(name = "Quittance.findByComAperition", query = "SELECT q FROM Quittance q WHERE q.comAperition = :comAperition"),
    @NamedQuery(name = "Quittance.findByCommision", query = "SELECT q FROM Quittance q WHERE q.commision = :commision"),
    @NamedQuery(name = "Quittance.findByPrimeExoEncours", query = "SELECT q FROM Quittance q WHERE q.primeExoEncours = :primeExoEncours"),
    @NamedQuery(name = "Quittance.findByPrimeReport", query = "SELECT q FROM Quittance q WHERE q.primeReport = :primeReport"),
    @NamedQuery(name = "Quittance.findByPrec", query = "SELECT q FROM Quittance q WHERE q.prec = :prec"),
    @NamedQuery(name = "Quittance.findByPrimeTotale", query = "SELECT q FROM Quittance q WHERE q.primeTotale = :primeTotale")})
public class Quittance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_QUITTANCE")
    private String codeQuittance;
    @Size(max = 15)
    @Column(name = "ETAT_QUITTANCE")
    private String etatQuittance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_CEDEE")
    private BigDecimal primeCedee;
    @Column(name = "ACCESSOIRE")
    private BigDecimal accessoire;
    @Column(name = "TAXES")
    private BigDecimal taxes;
    @Column(name = "NET_A_PAYER")
    private BigDecimal netAPayer;
    @Column(name = "FGA")
    private BigDecimal fga;
    @Column(name = "DATE_QUITTANCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateQuittance;
    @Column(name = "PRIME_NETTE")
    private BigDecimal primeNette;
    @Column(name = "ACC_CNIE")
    private BigDecimal accCnie;
    @Column(name = "ACC_INTRERM")
    private BigDecimal accIntrerm;
    @Column(name = "ACC_GESTIONNAIRE")
    private BigDecimal accGestionnaire;
    @Column(name = "COM_INTERM")
    private BigDecimal comInterm;
    @Column(name = "COM_CONSEIL")
    private BigDecimal comConseil;
    @Column(name = "COM_GESTIONNAIRE")
    private BigDecimal comGestionnaire;
    @Column(name = "COM_APERITION")
    private BigDecimal comAperition;
    @Column(name = "COMMISION")
    private BigDecimal commision;
    @Column(name = "PRIME_EXO_ENCOURS")
    private BigDecimal primeExoEncours;
    @Column(name = "PRIME_REPORT")
    private BigDecimal primeReport;
    @Column(name = "PREC")
    private BigDecimal prec;
    @Column(name = "PRIME_TOTALE")
    private BigDecimal primeTotale;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeQuittance")
    private List<Reglement> reglementList;
    @JoinColumn(name = "NUM_AVENANT", referencedColumnName = "NUM_AVENANT")
    @ManyToOne(optional = false)
    private Avenant numAvenant;

    public Quittance() {
    }

    public Quittance(String codeQuittance) {
        this.codeQuittance = codeQuittance;
    }

    public String getCodeQuittance() {
        return codeQuittance;
    }

    public void setCodeQuittance(String codeQuittance) {
        this.codeQuittance = codeQuittance;
    }

    public String getEtatQuittance() {
        return etatQuittance;
    }

    public void setEtatQuittance(String etatQuittance) {
        this.etatQuittance = etatQuittance;
    }

    public BigDecimal getPrimeCedee() {
        return primeCedee;
    }

    public void setPrimeCedee(BigDecimal primeCedee) {
        this.primeCedee = primeCedee;
    }

    public BigDecimal getAccessoire() {
        return accessoire;
    }

    public void setAccessoire(BigDecimal accessoire) {
        this.accessoire = accessoire;
    }

    public BigDecimal getTaxes() {
        return taxes;
    }

    public void setTaxes(BigDecimal taxes) {
        this.taxes = taxes;
    }

    public BigDecimal getNetAPayer() {
        return netAPayer;
    }

    public void setNetAPayer(BigDecimal netAPayer) {
        this.netAPayer = netAPayer;
    }

    public BigDecimal getFga() {
        return fga;
    }

    public void setFga(BigDecimal fga) {
        this.fga = fga;
    }

    public Date getDateQuittance() {
        return dateQuittance;
    }

    public void setDateQuittance(Date dateQuittance) {
        this.dateQuittance = dateQuittance;
    }

    public BigDecimal getPrimeNette() {
        return primeNette;
    }

    public void setPrimeNette(BigDecimal primeNette) {
        this.primeNette = primeNette;
    }

    public BigDecimal getAccCnie() {
        return accCnie;
    }

    public void setAccCnie(BigDecimal accCnie) {
        this.accCnie = accCnie;
    }

    public BigDecimal getAccIntrerm() {
        return accIntrerm;
    }

    public void setAccIntrerm(BigDecimal accIntrerm) {
        this.accIntrerm = accIntrerm;
    }

    public BigDecimal getAccGestionnaire() {
        return accGestionnaire;
    }

    public void setAccGestionnaire(BigDecimal accGestionnaire) {
        this.accGestionnaire = accGestionnaire;
    }

    public BigDecimal getComInterm() {
        return comInterm;
    }

    public void setComInterm(BigDecimal comInterm) {
        this.comInterm = comInterm;
    }

    public BigDecimal getComConseil() {
        return comConseil;
    }

    public void setComConseil(BigDecimal comConseil) {
        this.comConseil = comConseil;
    }

    public BigDecimal getComGestionnaire() {
        return comGestionnaire;
    }

    public void setComGestionnaire(BigDecimal comGestionnaire) {
        this.comGestionnaire = comGestionnaire;
    }

    public BigDecimal getComAperition() {
        return comAperition;
    }

    public void setComAperition(BigDecimal comAperition) {
        this.comAperition = comAperition;
    }

    public BigDecimal getCommision() {
        return commision;
    }

    public void setCommision(BigDecimal commision) {
        this.commision = commision;
    }

    public BigDecimal getPrimeExoEncours() {
        return primeExoEncours;
    }

    public void setPrimeExoEncours(BigDecimal primeExoEncours) {
        this.primeExoEncours = primeExoEncours;
    }

    public BigDecimal getPrimeReport() {
        return primeReport;
    }

    public void setPrimeReport(BigDecimal primeReport) {
        this.primeReport = primeReport;
    }

    public BigDecimal getPrec() {
        return prec;
    }

    public void setPrec(BigDecimal prec) {
        this.prec = prec;
    }

    public BigDecimal getPrimeTotale() {
        return primeTotale;
    }

    public void setPrimeTotale(BigDecimal primeTotale) {
        this.primeTotale = primeTotale;
    }

    @XmlTransient
    public List<Reglement> getReglementList() {
        return reglementList;
    }

    public void setReglementList(List<Reglement> reglementList) {
        this.reglementList = reglementList;
    }

    public Avenant getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(Avenant numAvenant) {
        this.numAvenant = numAvenant;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeQuittance != null ? codeQuittance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quittance)) {
            return false;
        }
        Quittance other = (Quittance) object;
        if ((this.codeQuittance == null && other.codeQuittance != null) || (this.codeQuittance != null && !this.codeQuittance.equals(other.codeQuittance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Quittance[ codeQuittance=" + codeQuittance + " ]";
    }
    
}
