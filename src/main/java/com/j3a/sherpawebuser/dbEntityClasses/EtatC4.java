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
@Table(name = "etat_c4")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtatC4.findAll", query = "SELECT e FROM EtatC4 e"),
    @NamedQuery(name = "EtatC4.findByCodeengagements", query = "SELECT e FROM EtatC4 e WHERE e.codeengagements = :codeengagements"),
    @NamedQuery(name = "EtatC4.findByLibelleengagementsreglementes", query = "SELECT e FROM EtatC4 e WHERE e.libelleengagementsreglementes = :libelleengagementsreglementes"),
    @NamedQuery(name = "EtatC4.findByProvisionsrisqueencours", query = "SELECT e FROM EtatC4 e WHERE e.provisionsrisqueencours = :provisionsrisqueencours"),
    @NamedQuery(name = "EtatC4.findByProvisionssinistreapayer", query = "SELECT e FROM EtatC4 e WHERE e.provisionssinistreapayer = :provisionssinistreapayer"),
    @NamedQuery(name = "EtatC4.findByProvisionsmathematiques", query = "SELECT e FROM EtatC4 e WHERE e.provisionsmathematiques = :provisionsmathematiques"),
    @NamedQuery(name = "EtatC4.findByAutresprovisionstech", query = "SELECT e FROM EtatC4 e WHERE e.autresprovisionstech = :autresprovisionstech"),
    @NamedQuery(name = "EtatC4.findByAutresengagementsregl", query = "SELECT e FROM EtatC4 e WHERE e.autresengagementsregl = :autresengagementsregl"),
    @NamedQuery(name = "EtatC4.findByTotalengagementsregl", query = "SELECT e FROM EtatC4 e WHERE e.totalengagementsregl = :totalengagementsregl"),
    @NamedQuery(name = "EtatC4.findByTotalactifsadmisrepresentation", query = "SELECT e FROM EtatC4 e WHERE e.totalactifsadmisrepresentation = :totalactifsadmisrepresentation"),
    @NamedQuery(name = "EtatC4.findByTauxcouvertureengagement", query = "SELECT e FROM EtatC4 e WHERE e.tauxcouvertureengagement = :tauxcouvertureengagement"),
    @NamedQuery(name = "EtatC4.findByDateEtatc4", query = "SELECT e FROM EtatC4 e WHERE e.dateEtatc4 = :dateEtatc4")})
public class EtatC4 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEENGAGEMENTS")
    private String codeengagements;
    @Size(max = 100)
    @Column(name = "LIBELLEENGAGEMENTSREGLEMENTES")
    private String libelleengagementsreglementes;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PROVISIONSRISQUEENCOURS")
    private BigDecimal provisionsrisqueencours;
    @Column(name = "PROVISIONSSINISTREAPAYER")
    private BigDecimal provisionssinistreapayer;
    @Column(name = "PROVISIONSMATHEMATIQUES")
    private BigDecimal provisionsmathematiques;
    @Column(name = "AUTRESPROVISIONSTECH")
    private BigDecimal autresprovisionstech;
    @Column(name = "AUTRESENGAGEMENTSREGL")
    private BigDecimal autresengagementsregl;
    @Column(name = "TOTALENGAGEMENTSREGL")
    private BigDecimal totalengagementsregl;
    @Column(name = "TOTALACTIFSADMISREPRESENTATION")
    private BigDecimal totalactifsadmisrepresentation;
    @Column(name = "TAUXCOUVERTUREENGAGEMENT")
    private BigDecimal tauxcouvertureengagement;
    @Column(name = "DATE_ETATC4")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEtatc4;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatC4")
    private List<EngagementsActifrep> engagementsActifrepList;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public EtatC4() {
    }

    public EtatC4(String codeengagements) {
        this.codeengagements = codeengagements;
    }

    public String getCodeengagements() {
        return codeengagements;
    }

    public void setCodeengagements(String codeengagements) {
        this.codeengagements = codeengagements;
    }

    public String getLibelleengagementsreglementes() {
        return libelleengagementsreglementes;
    }

    public void setLibelleengagementsreglementes(String libelleengagementsreglementes) {
        this.libelleengagementsreglementes = libelleengagementsreglementes;
    }

    public BigDecimal getProvisionsrisqueencours() {
        return provisionsrisqueencours;
    }

    public void setProvisionsrisqueencours(BigDecimal provisionsrisqueencours) {
        this.provisionsrisqueencours = provisionsrisqueencours;
    }

    public BigDecimal getProvisionssinistreapayer() {
        return provisionssinistreapayer;
    }

    public void setProvisionssinistreapayer(BigDecimal provisionssinistreapayer) {
        this.provisionssinistreapayer = provisionssinistreapayer;
    }

    public BigDecimal getProvisionsmathematiques() {
        return provisionsmathematiques;
    }

    public void setProvisionsmathematiques(BigDecimal provisionsmathematiques) {
        this.provisionsmathematiques = provisionsmathematiques;
    }

    public BigDecimal getAutresprovisionstech() {
        return autresprovisionstech;
    }

    public void setAutresprovisionstech(BigDecimal autresprovisionstech) {
        this.autresprovisionstech = autresprovisionstech;
    }

    public BigDecimal getAutresengagementsregl() {
        return autresengagementsregl;
    }

    public void setAutresengagementsregl(BigDecimal autresengagementsregl) {
        this.autresengagementsregl = autresengagementsregl;
    }

    public BigDecimal getTotalengagementsregl() {
        return totalengagementsregl;
    }

    public void setTotalengagementsregl(BigDecimal totalengagementsregl) {
        this.totalengagementsregl = totalengagementsregl;
    }

    public BigDecimal getTotalactifsadmisrepresentation() {
        return totalactifsadmisrepresentation;
    }

    public void setTotalactifsadmisrepresentation(BigDecimal totalactifsadmisrepresentation) {
        this.totalactifsadmisrepresentation = totalactifsadmisrepresentation;
    }

    public BigDecimal getTauxcouvertureengagement() {
        return tauxcouvertureengagement;
    }

    public void setTauxcouvertureengagement(BigDecimal tauxcouvertureengagement) {
        this.tauxcouvertureengagement = tauxcouvertureengagement;
    }

    public Date getDateEtatc4() {
        return dateEtatc4;
    }

    public void setDateEtatc4(Date dateEtatc4) {
        this.dateEtatc4 = dateEtatc4;
    }

    @XmlTransient
    public List<EngagementsActifrep> getEngagementsActifrepList() {
        return engagementsActifrepList;
    }

    public void setEngagementsActifrepList(List<EngagementsActifrep> engagementsActifrepList) {
        this.engagementsActifrepList = engagementsActifrepList;
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
        hash += (codeengagements != null ? codeengagements.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtatC4)) {
            return false;
        }
        EtatC4 other = (EtatC4) object;
        if ((this.codeengagements == null && other.codeengagements != null) || (this.codeengagements != null && !this.codeengagements.equals(other.codeengagements))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EtatC4[ codeengagements=" + codeengagements + " ]";
    }
    
}
