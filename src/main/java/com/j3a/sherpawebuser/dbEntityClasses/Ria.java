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
@Table(name = "ria")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ria.findAll", query = "SELECT r FROM Ria r"),
    @NamedQuery(name = "Ria.findByCodeCria", query = "SELECT r FROM Ria r WHERE r.codeCria = :codeCria"),
    @NamedQuery(name = "Ria.findByReporExoPrDeb", query = "SELECT r FROM Ria r WHERE r.reporExoPrDeb = :reporExoPrDeb"),
    @NamedQuery(name = "Ria.findByPertesDeLExerciceDebit", query = "SELECT r FROM Ria r WHERE r.pertesDeLExerciceDebit = :pertesDeLExerciceDebit"),
    @NamedQuery(name = "Ria.findByDividendeDeb", query = "SELECT r FROM Ria r WHERE r.dividendeDeb = :dividendeDeb"),
    @NamedQuery(name = "Ria.findByTantiemDeb", query = "SELECT r FROM Ria r WHERE r.tantiemDeb = :tantiemDeb"),
    @NamedQuery(name = "Ria.findByAfectResDeb", query = "SELECT r FROM Ria r WHERE r.afectResDeb = :afectResDeb"),
    @NamedQuery(name = "Ria.findByAfectAutrResDeb", query = "SELECT r FROM Ria r WHERE r.afectAutrResDeb = :afectAutrResDeb"),
    @NamedQuery(name = "Ria.findByAutreRepartDeb", query = "SELECT r FROM Ria r WHERE r.autreRepartDeb = :autreRepartDeb"),
    @NamedQuery(name = "Ria.findByReporNvBnfDeb", query = "SELECT r FROM Ria r WHERE r.reporNvBnfDeb = :reporNvBnfDeb"),
    @NamedQuery(name = "Ria.findByTotalDeb", query = "SELECT r FROM Ria r WHERE r.totalDeb = :totalDeb"),
    @NamedQuery(name = "Ria.findByReporProvCred", query = "SELECT r FROM Ria r WHERE r.reporProvCred = :reporProvCred"),
    @NamedQuery(name = "Ria.findByBenefExoCred", query = "SELECT r FROM Ria r WHERE r.benefExoCred = :benefExoCred"),
    @NamedQuery(name = "Ria.findByPrevResCred", query = "SELECT r FROM Ria r WHERE r.prevResCred = :prevResCred"),
    @NamedQuery(name = "Ria.findByReporNvCred", query = "SELECT r FROM Ria r WHERE r.reporNvCred = :reporNvCred"),
    @NamedQuery(name = "Ria.findByTotalCred", query = "SELECT r FROM Ria r WHERE r.totalCred = :totalCred"),
    @NamedQuery(name = "Ria.findByLibelleRia", query = "SELECT r FROM Ria r WHERE r.libelleRia = :libelleRia"),
    @NamedQuery(name = "Ria.findByDateRia", query = "SELECT r FROM Ria r WHERE r.dateRia = :dateRia")})
public class Ria implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_CRIA")
    private String codeCria;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REPOR_EXO_PR_DEB")
    private BigDecimal reporExoPrDeb;
    @Column(name = "PERTES_DE_L_EXERCICE_DEBIT")
    private BigDecimal pertesDeLExerciceDebit;
    @Column(name = "DIVIDENDE_DEB")
    private BigDecimal dividendeDeb;
    @Column(name = "TANTIEM_DEB")
    private BigDecimal tantiemDeb;
    @Column(name = "AFECT_RES_DEB")
    private BigDecimal afectResDeb;
    @Column(name = "AFECT_AUTR_RES_DEB")
    private BigDecimal afectAutrResDeb;
    @Column(name = "AUTRE_REPART_DEB")
    private BigDecimal autreRepartDeb;
    @Column(name = "REPOR_NV_BNF_DEB")
    private BigDecimal reporNvBnfDeb;
    @Column(name = "TOTAL_DEB")
    private BigDecimal totalDeb;
    @Column(name = "REPOR_PROV_CRED")
    private BigDecimal reporProvCred;
    @Column(name = "BENEF_EXO_CRED")
    private BigDecimal benefExoCred;
    @Column(name = "PREV_RES_CRED")
    private BigDecimal prevResCred;
    @Column(name = "REPOR_NV_CRED")
    private BigDecimal reporNvCred;
    @Column(name = "TOTAL_CRED")
    private BigDecimal totalCred;
    @Size(max = 100)
    @Column(name = "LIBELLE_RIA")
    private String libelleRia;
    @Column(name = "DATE_RIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateRia;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public Ria() {
    }

    public Ria(String codeCria) {
        this.codeCria = codeCria;
    }

    public String getCodeCria() {
        return codeCria;
    }

    public void setCodeCria(String codeCria) {
        this.codeCria = codeCria;
    }

    public BigDecimal getReporExoPrDeb() {
        return reporExoPrDeb;
    }

    public void setReporExoPrDeb(BigDecimal reporExoPrDeb) {
        this.reporExoPrDeb = reporExoPrDeb;
    }

    public BigDecimal getPertesDeLExerciceDebit() {
        return pertesDeLExerciceDebit;
    }

    public void setPertesDeLExerciceDebit(BigDecimal pertesDeLExerciceDebit) {
        this.pertesDeLExerciceDebit = pertesDeLExerciceDebit;
    }

    public BigDecimal getDividendeDeb() {
        return dividendeDeb;
    }

    public void setDividendeDeb(BigDecimal dividendeDeb) {
        this.dividendeDeb = dividendeDeb;
    }

    public BigDecimal getTantiemDeb() {
        return tantiemDeb;
    }

    public void setTantiemDeb(BigDecimal tantiemDeb) {
        this.tantiemDeb = tantiemDeb;
    }

    public BigDecimal getAfectResDeb() {
        return afectResDeb;
    }

    public void setAfectResDeb(BigDecimal afectResDeb) {
        this.afectResDeb = afectResDeb;
    }

    public BigDecimal getAfectAutrResDeb() {
        return afectAutrResDeb;
    }

    public void setAfectAutrResDeb(BigDecimal afectAutrResDeb) {
        this.afectAutrResDeb = afectAutrResDeb;
    }

    public BigDecimal getAutreRepartDeb() {
        return autreRepartDeb;
    }

    public void setAutreRepartDeb(BigDecimal autreRepartDeb) {
        this.autreRepartDeb = autreRepartDeb;
    }

    public BigDecimal getReporNvBnfDeb() {
        return reporNvBnfDeb;
    }

    public void setReporNvBnfDeb(BigDecimal reporNvBnfDeb) {
        this.reporNvBnfDeb = reporNvBnfDeb;
    }

    public BigDecimal getTotalDeb() {
        return totalDeb;
    }

    public void setTotalDeb(BigDecimal totalDeb) {
        this.totalDeb = totalDeb;
    }

    public BigDecimal getReporProvCred() {
        return reporProvCred;
    }

    public void setReporProvCred(BigDecimal reporProvCred) {
        this.reporProvCred = reporProvCred;
    }

    public BigDecimal getBenefExoCred() {
        return benefExoCred;
    }

    public void setBenefExoCred(BigDecimal benefExoCred) {
        this.benefExoCred = benefExoCred;
    }

    public BigDecimal getPrevResCred() {
        return prevResCred;
    }

    public void setPrevResCred(BigDecimal prevResCred) {
        this.prevResCred = prevResCred;
    }

    public BigDecimal getReporNvCred() {
        return reporNvCred;
    }

    public void setReporNvCred(BigDecimal reporNvCred) {
        this.reporNvCred = reporNvCred;
    }

    public BigDecimal getTotalCred() {
        return totalCred;
    }

    public void setTotalCred(BigDecimal totalCred) {
        this.totalCred = totalCred;
    }

    public String getLibelleRia() {
        return libelleRia;
    }

    public void setLibelleRia(String libelleRia) {
        this.libelleRia = libelleRia;
    }

    public Date getDateRia() {
        return dateRia;
    }

    public void setDateRia(Date dateRia) {
        this.dateRia = dateRia;
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
        hash += (codeCria != null ? codeCria.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ria)) {
            return false;
        }
        Ria other = (Ria) object;
        if ((this.codeCria == null && other.codeCria != null) || (this.codeCria != null && !this.codeCria.equals(other.codeCria))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Ria[ codeCria=" + codeCria + " ]";
    }
    
}
