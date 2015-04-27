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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "actionnaire_conseil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActionnaireConseil.findAll", query = "SELECT a FROM ActionnaireConseil a"),
    @NamedQuery(name = "ActionnaireConseil.findByCodeAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.codeAc = :codeAc"),
    @NamedQuery(name = "ActionnaireConseil.findByNomAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.nomAc = :nomAc"),
    @NamedQuery(name = "ActionnaireConseil.findByPrenomsAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.prenomsAc = :prenomsAc"),
    @NamedQuery(name = "ActionnaireConseil.findByDateNaisAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.dateNaisAc = :dateNaisAc"),
    @NamedQuery(name = "ActionnaireConseil.findByLieuNaisAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.lieuNaisAc = :lieuNaisAc"),
    @NamedQuery(name = "ActionnaireConseil.findBySexeAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.sexeAc = :sexeAc"),
    @NamedQuery(name = "ActionnaireConseil.findByNationaliteAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.nationaliteAc = :nationaliteAc"),
    @NamedQuery(name = "ActionnaireConseil.findByDomicileAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.domicileAc = :domicileAc"),
    @NamedQuery(name = "ActionnaireConseil.findByNombreActions", query = "SELECT a FROM ActionnaireConseil a WHERE a.nombreActions = :nombreActions"),
    @NamedQuery(name = "ActionnaireConseil.findByValeursActions", query = "SELECT a FROM ActionnaireConseil a WHERE a.valeursActions = :valeursActions"),
    @NamedQuery(name = "ActionnaireConseil.findByGrade", query = "SELECT a FROM ActionnaireConseil a WHERE a.grade = :grade"),
    @NamedQuery(name = "ActionnaireConseil.findByTypeAc", query = "SELECT a FROM ActionnaireConseil a WHERE a.typeAc = :typeAc")})
public class ActionnaireConseil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_AC")
    private String codeAc;
    @Size(max = 20)
    @Column(name = "NOM_AC")
    private String nomAc;
    @Size(max = 50)
    @Column(name = "PRENOMS_AC")
    private String prenomsAc;
    @Column(name = "DATE_NAIS_AC")
    @Temporal(TemporalType.DATE)
    private Date dateNaisAc;
    @Size(max = 30)
    @Column(name = "LIEU_NAIS_AC")
    private String lieuNaisAc;
    @Size(max = 10)
    @Column(name = "SEXE_AC")
    private String sexeAc;
    @Size(max = 25)
    @Column(name = "NATIONALITE_AC")
    private String nationaliteAc;
    @Size(max = 100)
    @Column(name = "DOMICILE_AC")
    private String domicileAc;
    @Column(name = "NOMBRE_ACTIONS")
    private Integer nombreActions;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALEURS_ACTIONS")
    private BigDecimal valeursActions;
    @Size(max = 20)
    @Column(name = "GRADE")
    private String grade;
    @Size(max = 20)
    @Column(name = "TYPE_AC")
    private String typeAc;
    @JoinTable(name = "ac_exercice", joinColumns = {
        @JoinColumn(name = "CODE_AC", referencedColumnName = "CODE_AC")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")})
    @ManyToMany
    private List<EtatCima> etatCimaList;

    public ActionnaireConseil() {
    }

    public ActionnaireConseil(String codeAc) {
        this.codeAc = codeAc;
    }

    public String getCodeAc() {
        return codeAc;
    }

    public void setCodeAc(String codeAc) {
        this.codeAc = codeAc;
    }

    public String getNomAc() {
        return nomAc;
    }

    public void setNomAc(String nomAc) {
        this.nomAc = nomAc;
    }

    public String getPrenomsAc() {
        return prenomsAc;
    }

    public void setPrenomsAc(String prenomsAc) {
        this.prenomsAc = prenomsAc;
    }

    public Date getDateNaisAc() {
        return dateNaisAc;
    }

    public void setDateNaisAc(Date dateNaisAc) {
        this.dateNaisAc = dateNaisAc;
    }

    public String getLieuNaisAc() {
        return lieuNaisAc;
    }

    public void setLieuNaisAc(String lieuNaisAc) {
        this.lieuNaisAc = lieuNaisAc;
    }

    public String getSexeAc() {
        return sexeAc;
    }

    public void setSexeAc(String sexeAc) {
        this.sexeAc = sexeAc;
    }

    public String getNationaliteAc() {
        return nationaliteAc;
    }

    public void setNationaliteAc(String nationaliteAc) {
        this.nationaliteAc = nationaliteAc;
    }

    public String getDomicileAc() {
        return domicileAc;
    }

    public void setDomicileAc(String domicileAc) {
        this.domicileAc = domicileAc;
    }

    public Integer getNombreActions() {
        return nombreActions;
    }

    public void setNombreActions(Integer nombreActions) {
        this.nombreActions = nombreActions;
    }

    public BigDecimal getValeursActions() {
        return valeursActions;
    }

    public void setValeursActions(BigDecimal valeursActions) {
        this.valeursActions = valeursActions;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getTypeAc() {
        return typeAc;
    }

    public void setTypeAc(String typeAc) {
        this.typeAc = typeAc;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAc != null ? codeAc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActionnaireConseil)) {
            return false;
        }
        ActionnaireConseil other = (ActionnaireConseil) object;
        if ((this.codeAc == null && other.codeAc != null) || (this.codeAc != null && !this.codeAc.equals(other.codeAc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ActionnaireConseil[ codeAc=" + codeAc + " ]";
    }
    
}
