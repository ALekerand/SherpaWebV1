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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "modifi_capital")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ModifiCapital.findAll", query = "SELECT m FROM ModifiCapital m"),
    @NamedQuery(name = "ModifiCapital.findByCodeModifCap", query = "SELECT m FROM ModifiCapital m WHERE m.codeModifCap = :codeModifCap"),
    @NamedQuery(name = "ModifiCapital.findByCapitalSocialInitial", query = "SELECT m FROM ModifiCapital m WHERE m.capitalSocialInitial = :capitalSocialInitial"),
    @NamedQuery(name = "ModifiCapital.findByVersements", query = "SELECT m FROM ModifiCapital m WHERE m.versements = :versements"),
    @NamedQuery(name = "ModifiCapital.findByAppels", query = "SELECT m FROM ModifiCapital m WHERE m.appels = :appels"),
    @NamedQuery(name = "ModifiCapital.findByCapitalSocialFinExo", query = "SELECT m FROM ModifiCapital m WHERE m.capitalSocialFinExo = :capitalSocialFinExo"),
    @NamedQuery(name = "ModifiCapital.findByFondEtablissementInitial", query = "SELECT m FROM ModifiCapital m WHERE m.fondEtablissementInitial = :fondEtablissementInitial"),
    @NamedQuery(name = "ModifiCapital.findByAmortissements", query = "SELECT m FROM ModifiCapital m WHERE m.amortissements = :amortissements"),
    @NamedQuery(name = "ModifiCapital.findByFondEtablissementFinExo", query = "SELECT m FROM ModifiCapital m WHERE m.fondEtablissementFinExo = :fondEtablissementFinExo")})
public class ModifiCapital implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_MODIF_CAP")
    private String codeModifCap;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CAPITAL_SOCIAL_INITIAL")
    private BigDecimal capitalSocialInitial;
    @Column(name = "VERSEMENTS")
    private BigDecimal versements;
    @Column(name = "APPELS")
    private BigDecimal appels;
    @Column(name = "CAPITAL_SOCIAL_FIN_EXO")
    private BigDecimal capitalSocialFinExo;
    @Column(name = "FOND_ETABLISSEMENT_INITIAL")
    private BigDecimal fondEtablissementInitial;
    @Column(name = "AMORTISSEMENTS")
    private BigDecimal amortissements;
    @Column(name = "FOND_ETABLISSEMENT_FIN_EXO")
    private BigDecimal fondEtablissementFinExo;
    @ManyToMany(mappedBy = "modifiCapitalList")
    private List<EtatCima> etatCimaList;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne(optional = false)
    private Exercice codeexercice;

    public ModifiCapital() {
    }

    public ModifiCapital(String codeModifCap) {
        this.codeModifCap = codeModifCap;
    }

    public String getCodeModifCap() {
        return codeModifCap;
    }

    public void setCodeModifCap(String codeModifCap) {
        this.codeModifCap = codeModifCap;
    }

    public BigDecimal getCapitalSocialInitial() {
        return capitalSocialInitial;
    }

    public void setCapitalSocialInitial(BigDecimal capitalSocialInitial) {
        this.capitalSocialInitial = capitalSocialInitial;
    }

    public BigDecimal getVersements() {
        return versements;
    }

    public void setVersements(BigDecimal versements) {
        this.versements = versements;
    }

    public BigDecimal getAppels() {
        return appels;
    }

    public void setAppels(BigDecimal appels) {
        this.appels = appels;
    }

    public BigDecimal getCapitalSocialFinExo() {
        return capitalSocialFinExo;
    }

    public void setCapitalSocialFinExo(BigDecimal capitalSocialFinExo) {
        this.capitalSocialFinExo = capitalSocialFinExo;
    }

    public BigDecimal getFondEtablissementInitial() {
        return fondEtablissementInitial;
    }

    public void setFondEtablissementInitial(BigDecimal fondEtablissementInitial) {
        this.fondEtablissementInitial = fondEtablissementInitial;
    }

    public BigDecimal getAmortissements() {
        return amortissements;
    }

    public void setAmortissements(BigDecimal amortissements) {
        this.amortissements = amortissements;
    }

    public BigDecimal getFondEtablissementFinExo() {
        return fondEtablissementFinExo;
    }

    public void setFondEtablissementFinExo(BigDecimal fondEtablissementFinExo) {
        this.fondEtablissementFinExo = fondEtablissementFinExo;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    public Exercice getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(Exercice codeexercice) {
        this.codeexercice = codeexercice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeModifCap != null ? codeModifCap.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ModifiCapital)) {
            return false;
        }
        ModifiCapital other = (ModifiCapital) object;
        if ((this.codeModifCap == null && other.codeModifCap != null) || (this.codeModifCap != null && !this.codeModifCap.equals(other.codeModifCap))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ModifiCapital[ codeModifCap=" + codeModifCap + " ]";
    }
    
}
