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
@Table(name = "cgpp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cgpp.findAll", query = "SELECT c FROM Cgpp c"),
    @NamedQuery(name = "Cgpp.findByCodeCgpp", query = "SELECT c FROM Cgpp c WHERE c.codeCgpp = :codeCgpp"),
    @NamedQuery(name = "Cgpp.findByDotProvDepDeb", query = "SELECT c FROM Cgpp c WHERE c.dotProvDepDeb = :dotProvDepDeb"),
    @NamedQuery(name = "Cgpp.findByPerteExoAntDeb", query = "SELECT c FROM Cgpp c WHERE c.perteExoAntDeb = :perteExoAntDeb"),
    @NamedQuery(name = "Cgpp.findByPertExptExoDeb", query = "SELECT c FROM Cgpp c WHERE c.pertExptExoDeb = :pertExptExoDeb"),
    @NamedQuery(name = "Cgpp.findByMoinValCsEDeb", query = "SELECT c FROM Cgpp c WHERE c.moinValCsEDeb = :moinValCsEDeb"),
    @NamedQuery(name = "Cgpp.findByAutrePerteDeb", query = "SELECT c FROM Cgpp c WHERE c.autrePerteDeb = :autrePerteDeb"),
    @NamedQuery(name = "Cgpp.findByImfDeb", query = "SELECT c FROM Cgpp c WHERE c.imfDeb = :imfDeb"),
    @NamedQuery(name = "Cgpp.findByBenefNetDeb", query = "SELECT c FROM Cgpp c WHERE c.benefNetDeb = :benefNetDeb"),
    @NamedQuery(name = "Cgpp.findByTotalDeb", query = "SELECT c FROM Cgpp c WHERE c.totalDeb = :totalDeb"),
    @NamedQuery(name = "Cgpp.findByBenfExplCred", query = "SELECT c FROM Cgpp c WHERE c.benfExplCred = :benfExplCred"),
    @NamedQuery(name = "Cgpp.findByProfiExoAntCred", query = "SELECT c FROM Cgpp c WHERE c.profiExoAntCred = :profiExoAntCred"),
    @NamedQuery(name = "Cgpp.findByRepProvAntCred", query = "SELECT c FROM Cgpp c WHERE c.repProvAntCred = :repProvAntCred"),
    @NamedQuery(name = "Cgpp.findByProfitExoCred", query = "SELECT c FROM Cgpp c WHERE c.profitExoCred = :profitExoCred"),
    @NamedQuery(name = "Cgpp.findByPlusValEltCred", query = "SELECT c FROM Cgpp c WHERE c.plusValEltCred = :plusValEltCred"),
    @NamedQuery(name = "Cgpp.findByPertNetCred", query = "SELECT c FROM Cgpp c WHERE c.pertNetCred = :pertNetCred"),
    @NamedQuery(name = "Cgpp.findByTotalCred", query = "SELECT c FROM Cgpp c WHERE c.totalCred = :totalCred"),
    @NamedQuery(name = "Cgpp.findByLibelleCgpp", query = "SELECT c FROM Cgpp c WHERE c.libelleCgpp = :libelleCgpp"),
    @NamedQuery(name = "Cgpp.findByPertDeploitDeb", query = "SELECT c FROM Cgpp c WHERE c.pertDeploitDeb = :pertDeploitDeb"),
    @NamedQuery(name = "Cgpp.findByDateCgpp", query = "SELECT c FROM Cgpp c WHERE c.dateCgpp = :dateCgpp")})
public class Cgpp implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_CGPP")
    private String codeCgpp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DOT_PROV_DEP_DEB")
    private BigDecimal dotProvDepDeb;
    @Column(name = "PERTE_EXO_ANT_DEB")
    private BigDecimal perteExoAntDeb;
    @Column(name = "PERT_EXPT_EXO_DEB")
    private BigDecimal pertExptExoDeb;
    @Column(name = "MOIN_VAL_CS_E_DEB")
    private BigDecimal moinValCsEDeb;
    @Column(name = "AUTRE_PERTE_DEB")
    private BigDecimal autrePerteDeb;
    @Column(name = "IMF_DEB")
    private BigDecimal imfDeb;
    @Column(name = "BENEF_NET_DEB")
    private BigDecimal benefNetDeb;
    @Column(name = "TOTAL_DEB")
    private BigDecimal totalDeb;
    @Column(name = "BENF_EXPL_CRED")
    private BigDecimal benfExplCred;
    @Column(name = "PROFI_EXO_ANT_CRED")
    private BigDecimal profiExoAntCred;
    @Column(name = "REP_PROV_ANT_CRED")
    private BigDecimal repProvAntCred;
    @Column(name = "PROFIT_EXO_CRED")
    private BigDecimal profitExoCred;
    @Column(name = "PLUS_VAL_ELT_CRED")
    private BigDecimal plusValEltCred;
    @Column(name = "PERT_NET_CRED")
    private BigDecimal pertNetCred;
    @Column(name = "TOTAL_CRED")
    private BigDecimal totalCred;
    @Size(max = 100)
    @Column(name = "LIBELLE_CGPP")
    private String libelleCgpp;
    @Column(name = "PERT_DEPLOIT_DEB")
    private BigDecimal pertDeploitDeb;
    @Column(name = "DATE_CGPP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCgpp;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public Cgpp() {
    }

    public Cgpp(String codeCgpp) {
        this.codeCgpp = codeCgpp;
    }

    public String getCodeCgpp() {
        return codeCgpp;
    }

    public void setCodeCgpp(String codeCgpp) {
        this.codeCgpp = codeCgpp;
    }

    public BigDecimal getDotProvDepDeb() {
        return dotProvDepDeb;
    }

    public void setDotProvDepDeb(BigDecimal dotProvDepDeb) {
        this.dotProvDepDeb = dotProvDepDeb;
    }

    public BigDecimal getPerteExoAntDeb() {
        return perteExoAntDeb;
    }

    public void setPerteExoAntDeb(BigDecimal perteExoAntDeb) {
        this.perteExoAntDeb = perteExoAntDeb;
    }

    public BigDecimal getPertExptExoDeb() {
        return pertExptExoDeb;
    }

    public void setPertExptExoDeb(BigDecimal pertExptExoDeb) {
        this.pertExptExoDeb = pertExptExoDeb;
    }

    public BigDecimal getMoinValCsEDeb() {
        return moinValCsEDeb;
    }

    public void setMoinValCsEDeb(BigDecimal moinValCsEDeb) {
        this.moinValCsEDeb = moinValCsEDeb;
    }

    public BigDecimal getAutrePerteDeb() {
        return autrePerteDeb;
    }

    public void setAutrePerteDeb(BigDecimal autrePerteDeb) {
        this.autrePerteDeb = autrePerteDeb;
    }

    public BigDecimal getImfDeb() {
        return imfDeb;
    }

    public void setImfDeb(BigDecimal imfDeb) {
        this.imfDeb = imfDeb;
    }

    public BigDecimal getBenefNetDeb() {
        return benefNetDeb;
    }

    public void setBenefNetDeb(BigDecimal benefNetDeb) {
        this.benefNetDeb = benefNetDeb;
    }

    public BigDecimal getTotalDeb() {
        return totalDeb;
    }

    public void setTotalDeb(BigDecimal totalDeb) {
        this.totalDeb = totalDeb;
    }

    public BigDecimal getBenfExplCred() {
        return benfExplCred;
    }

    public void setBenfExplCred(BigDecimal benfExplCred) {
        this.benfExplCred = benfExplCred;
    }

    public BigDecimal getProfiExoAntCred() {
        return profiExoAntCred;
    }

    public void setProfiExoAntCred(BigDecimal profiExoAntCred) {
        this.profiExoAntCred = profiExoAntCred;
    }

    public BigDecimal getRepProvAntCred() {
        return repProvAntCred;
    }

    public void setRepProvAntCred(BigDecimal repProvAntCred) {
        this.repProvAntCred = repProvAntCred;
    }

    public BigDecimal getProfitExoCred() {
        return profitExoCred;
    }

    public void setProfitExoCred(BigDecimal profitExoCred) {
        this.profitExoCred = profitExoCred;
    }

    public BigDecimal getPlusValEltCred() {
        return plusValEltCred;
    }

    public void setPlusValEltCred(BigDecimal plusValEltCred) {
        this.plusValEltCred = plusValEltCred;
    }

    public BigDecimal getPertNetCred() {
        return pertNetCred;
    }

    public void setPertNetCred(BigDecimal pertNetCred) {
        this.pertNetCred = pertNetCred;
    }

    public BigDecimal getTotalCred() {
        return totalCred;
    }

    public void setTotalCred(BigDecimal totalCred) {
        this.totalCred = totalCred;
    }

    public String getLibelleCgpp() {
        return libelleCgpp;
    }

    public void setLibelleCgpp(String libelleCgpp) {
        this.libelleCgpp = libelleCgpp;
    }

    public BigDecimal getPertDeploitDeb() {
        return pertDeploitDeb;
    }

    public void setPertDeploitDeb(BigDecimal pertDeploitDeb) {
        this.pertDeploitDeb = pertDeploitDeb;
    }

    public Date getDateCgpp() {
        return dateCgpp;
    }

    public void setDateCgpp(Date dateCgpp) {
        this.dateCgpp = dateCgpp;
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
        hash += (codeCgpp != null ? codeCgpp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cgpp)) {
            return false;
        }
        Cgpp other = (Cgpp) object;
        if ((this.codeCgpp == null && other.codeCgpp != null) || (this.codeCgpp != null && !this.codeCgpp.equals(other.codeCgpp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Cgpp[ codeCgpp=" + codeCgpp + " ]";
    }
    
}
