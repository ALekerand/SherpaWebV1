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
@Table(name = "etat_c5")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtatC5.findAll", query = "SELECT e FROM EtatC5 e"),
    @NamedQuery(name = "EtatC5.findByCodeEtatc5", query = "SELECT e FROM EtatC5 e WHERE e.codeEtatc5 = :codeEtatc5"),
    @NamedQuery(name = "EtatC5.findByLibelleEtatc5", query = "SELECT e FROM EtatC5 e WHERE e.libelleEtatc5 = :libelleEtatc5"),
    @NamedQuery(name = "EtatC5.findBySoutotalvaleurArticle", query = "SELECT e FROM EtatC5 e WHERE e.soutotalvaleurArticle = :soutotalvaleurArticle"),
    @NamedQuery(name = "EtatC5.findBySoutotalvaleurPar", query = "SELECT e FROM EtatC5 e WHERE e.soutotalvaleurPar = :soutotalvaleurPar"),
    @NamedQuery(name = "EtatC5.findBySoutotalvaleurRealisation", query = "SELECT e FROM EtatC5 e WHERE e.soutotalvaleurRealisation = :soutotalvaleurRealisation"),
    @NamedQuery(name = "EtatC5.findBySoutotalCouverture", query = "SELECT e FROM EtatC5 e WHERE e.soutotalCouverture = :soutotalCouverture"),
    @NamedQuery(name = "EtatC5.findBySoutotalOrganisme1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalOrganisme1 = :soutotalOrganisme1"),
    @NamedQuery(name = "EtatC5.findBySoutotalOrganisme2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalOrganisme2 = :soutotalOrganisme2"),
    @NamedQuery(name = "EtatC5.findBySoutotalOrganisme3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalOrganisme3 = :soutotalOrganisme3"),
    @NamedQuery(name = "EtatC5.findBySoutotalOrganisme4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalOrganisme4 = :soutotalOrganisme4"),
    @NamedQuery(name = "EtatC5.findBySoustotalFinanciere1", query = "SELECT e FROM EtatC5 e WHERE e.soustotalFinanciere1 = :soustotalFinanciere1"),
    @NamedQuery(name = "EtatC5.findBySoustotalFinanciere2", query = "SELECT e FROM EtatC5 e WHERE e.soustotalFinanciere2 = :soustotalFinanciere2"),
    @NamedQuery(name = "EtatC5.findBySoustotalFinanciere3", query = "SELECT e FROM EtatC5 e WHERE e.soustotalFinanciere3 = :soustotalFinanciere3"),
    @NamedQuery(name = "EtatC5.findBySoustotalFinanciere4", query = "SELECT e FROM EtatC5 e WHERE e.soustotalFinanciere4 = :soustotalFinanciere4"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutreobligation1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutreobligation1 = :soutotalAutreobligation1"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutreobligation2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutreobligation2 = :soutotalAutreobligation2"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutreobligation3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutreobligation3 = :soutotalAutreobligation3"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutreobligation4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutreobligation4 = :soutotalAutreobligation4"),
    @NamedQuery(name = "EtatC5.findBySoutotalAction1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAction1 = :soutotalAction1"),
    @NamedQuery(name = "EtatC5.findBySoutotalAction2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAction2 = :soutotalAction2"),
    @NamedQuery(name = "EtatC5.findBySoutotalAction3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAction3 = :soutotalAction3"),
    @NamedQuery(name = "EtatC5.findBySoutotalAction4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAction4 = :soutotalAction4"),
    @NamedQuery(name = "EtatC5.findBySoutotalAssurance1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAssurance1 = :soutotalAssurance1"),
    @NamedQuery(name = "EtatC5.findBySoutotalAssurance2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAssurance2 = :soutotalAssurance2"),
    @NamedQuery(name = "EtatC5.findBySoutotalAssurance3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAssurance3 = :soutotalAssurance3"),
    @NamedQuery(name = "EtatC5.findBySoutotalAssurance4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAssurance4 = :soutotalAssurance4"),
    @NamedQuery(name = "EtatC5.findBySoutotalCommercial1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalCommercial1 = :soutotalCommercial1"),
    @NamedQuery(name = "EtatC5.findBySoutotalCommercial2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalCommercial2 = :soutotalCommercial2"),
    @NamedQuery(name = "EtatC5.findBySoutotalCommercial3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalCommercial3 = :soutotalCommercial3"),
    @NamedQuery(name = "EtatC5.findBySoutotalCommercial4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalCommercial4 = :soutotalCommercial4"),
    @NamedQuery(name = "EtatC5.findBySoutotalInvestissement1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalInvestissement1 = :soutotalInvestissement1"),
    @NamedQuery(name = "EtatC5.findBySoutotalInvestissement2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalInvestissement2 = :soutotalInvestissement2"),
    @NamedQuery(name = "EtatC5.findBySoutotalInvestissement3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalInvestissement3 = :soutotalInvestissement3"),
    @NamedQuery(name = "EtatC5.findBySoutotalInvestissement4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalInvestissement4 = :soutotalInvestissement4"),
    @NamedQuery(name = "EtatC5.findBySoutotalImobilier1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalImobilier1 = :soutotalImobilier1"),
    @NamedQuery(name = "EtatC5.findBySoutotalImobilier2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalImobilier2 = :soutotalImobilier2"),
    @NamedQuery(name = "EtatC5.findBySoutotalImobilier3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalImobilier3 = :soutotalImobilier3"),
    @NamedQuery(name = "EtatC5.findBySoutotalImobilier4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalImobilier4 = :soutotalImobilier4"),
    @NamedQuery(name = "EtatC5.findBySoutotalGarantie1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalGarantie1 = :soutotalGarantie1"),
    @NamedQuery(name = "EtatC5.findBySoutotalGarantie2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalGarantie2 = :soutotalGarantie2"),
    @NamedQuery(name = "EtatC5.findBySoutotalGarantie3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalGarantie3 = :soutotalGarantie3"),
    @NamedQuery(name = "EtatC5.findBySoutotalGarantie4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalGarantie4 = :soutotalGarantie4"),
    @NamedQuery(name = "EtatC5.findBySoutotalHypo1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalHypo1 = :soutotalHypo1"),
    @NamedQuery(name = "EtatC5.findBySoutotalHypo2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalHypo2 = :soutotalHypo2"),
    @NamedQuery(name = "EtatC5.findBySoutotalHypo3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalHypo3 = :soutotalHypo3"),
    @NamedQuery(name = "EtatC5.findBySoutotalHypo4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalHypo4 = :soutotalHypo4"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutrepret1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutrepret1 = :soutotalAutrepret1"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutrepret2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutrepret2 = :soutotalAutrepret2"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutrepret3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutrepret3 = :soutotalAutrepret3"),
    @NamedQuery(name = "EtatC5.findBySoutotalAutrepret4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalAutrepret4 = :soutotalAutrepret4"),
    @NamedQuery(name = "EtatC5.findBySoutotalDepotbanq1", query = "SELECT e FROM EtatC5 e WHERE e.soutotalDepotbanq1 = :soutotalDepotbanq1"),
    @NamedQuery(name = "EtatC5.findBySoutotalDepotbanq2", query = "SELECT e FROM EtatC5 e WHERE e.soutotalDepotbanq2 = :soutotalDepotbanq2"),
    @NamedQuery(name = "EtatC5.findBySoutotalDepotbanq3", query = "SELECT e FROM EtatC5 e WHERE e.soutotalDepotbanq3 = :soutotalDepotbanq3"),
    @NamedQuery(name = "EtatC5.findBySoutotalDepotbanq4", query = "SELECT e FROM EtatC5 e WHERE e.soutotalDepotbanq4 = :soutotalDepotbanq4"),
    @NamedQuery(name = "EtatC5.findByTotalvaleur1", query = "SELECT e FROM EtatC5 e WHERE e.totalvaleur1 = :totalvaleur1"),
    @NamedQuery(name = "EtatC5.findByTotalvaleur2", query = "SELECT e FROM EtatC5 e WHERE e.totalvaleur2 = :totalvaleur2"),
    @NamedQuery(name = "EtatC5.findByTotalvaleur3", query = "SELECT e FROM EtatC5 e WHERE e.totalvaleur3 = :totalvaleur3"),
    @NamedQuery(name = "EtatC5.findByTotalvaleur4", query = "SELECT e FROM EtatC5 e WHERE e.totalvaleur4 = :totalvaleur4"),
    @NamedQuery(name = "EtatC5.findByDateEtatc5", query = "SELECT e FROM EtatC5 e WHERE e.dateEtatc5 = :dateEtatc5")})
public class EtatC5 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_ETATC5")
    private String codeEtatc5;
    @Size(max = 100)
    @Column(name = "LIBELLE_ETATC5")
    private String libelleEtatc5;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOUTOTALVALEUR_ARTICLE")
    private BigDecimal soutotalvaleurArticle;
    @Column(name = "SOUTOTALVALEUR_PAR")
    private BigDecimal soutotalvaleurPar;
    @Column(name = "SOUTOTALVALEUR_REALISATION")
    private BigDecimal soutotalvaleurRealisation;
    @Column(name = "SOUTOTAL_COUVERTURE")
    private BigDecimal soutotalCouverture;
    @Column(name = "SOUTOTAL_ORGANISME1")
    private BigDecimal soutotalOrganisme1;
    @Column(name = "SOUTOTAL_ORGANISME2")
    private BigDecimal soutotalOrganisme2;
    @Column(name = "SOUTOTAL_ORGANISME3")
    private BigDecimal soutotalOrganisme3;
    @Column(name = "SOUTOTAL_ORGANISME4")
    private BigDecimal soutotalOrganisme4;
    @Column(name = "SOUSTOTAL_FINANCIERE1")
    private BigDecimal soustotalFinanciere1;
    @Column(name = "SOUSTOTAL_FINANCIERE2")
    private BigDecimal soustotalFinanciere2;
    @Column(name = "SOUSTOTAL_FINANCIERE3")
    private BigDecimal soustotalFinanciere3;
    @Column(name = "SOUSTOTAL_FINANCIERE4")
    private BigDecimal soustotalFinanciere4;
    @Column(name = "SOUTOTAL_AUTREOBLIGATION1")
    private BigDecimal soutotalAutreobligation1;
    @Column(name = "SOUTOTAL_AUTREOBLIGATION2")
    private BigDecimal soutotalAutreobligation2;
    @Column(name = "SOUTOTAL_AUTREOBLIGATION3")
    private BigDecimal soutotalAutreobligation3;
    @Column(name = "SOUTOTAL_AUTREOBLIGATION4")
    private BigDecimal soutotalAutreobligation4;
    @Column(name = "SOUTOTAL_ACTION1")
    private BigDecimal soutotalAction1;
    @Column(name = "SOUTOTAL_ACTION2")
    private BigDecimal soutotalAction2;
    @Column(name = "SOUTOTAL_ACTION3")
    private BigDecimal soutotalAction3;
    @Column(name = "SOUTOTAL_ACTION4")
    private BigDecimal soutotalAction4;
    @Column(name = "SOUTOTAL_ASSURANCE1")
    private BigDecimal soutotalAssurance1;
    @Column(name = "SOUTOTAL_ASSURANCE2")
    private BigDecimal soutotalAssurance2;
    @Column(name = "SOUTOTAL_ASSURANCE3")
    private BigDecimal soutotalAssurance3;
    @Column(name = "SOUTOTAL_ASSURANCE4")
    private BigDecimal soutotalAssurance4;
    @Column(name = "SOUTOTAL_COMMERCIAL1")
    private BigDecimal soutotalCommercial1;
    @Column(name = "SOUTOTAL_COMMERCIAL2")
    private BigDecimal soutotalCommercial2;
    @Column(name = "SOUTOTAL_COMMERCIAL3")
    private BigDecimal soutotalCommercial3;
    @Column(name = "SOUTOTAL_COMMERCIAL4")
    private BigDecimal soutotalCommercial4;
    @Column(name = "SOUTOTAL_INVESTISSEMENT1")
    private BigDecimal soutotalInvestissement1;
    @Column(name = "SOUTOTAL_INVESTISSEMENT2")
    private BigDecimal soutotalInvestissement2;
    @Column(name = "SOUTOTAL_INVESTISSEMENT3")
    private BigDecimal soutotalInvestissement3;
    @Column(name = "SOUTOTAL_INVESTISSEMENT4")
    private BigDecimal soutotalInvestissement4;
    @Column(name = "SOUTOTAL_IMOBILIER1")
    private BigDecimal soutotalImobilier1;
    @Column(name = "SOUTOTAL_IMOBILIER2")
    private BigDecimal soutotalImobilier2;
    @Column(name = "SOUTOTAL_IMOBILIER3")
    private BigDecimal soutotalImobilier3;
    @Column(name = "SOUTOTAL_IMOBILIER4")
    private BigDecimal soutotalImobilier4;
    @Column(name = "SOUTOTAL_GARANTIE1")
    private BigDecimal soutotalGarantie1;
    @Column(name = "SOUTOTAL_GARANTIE2")
    private BigDecimal soutotalGarantie2;
    @Column(name = "SOUTOTAL_GARANTIE3")
    private BigDecimal soutotalGarantie3;
    @Column(name = "SOUTOTAL_GARANTIE4")
    private BigDecimal soutotalGarantie4;
    @Column(name = "SOUTOTAL_HYPO1")
    private BigDecimal soutotalHypo1;
    @Column(name = "SOUTOTAL_HYPO2")
    private BigDecimal soutotalHypo2;
    @Column(name = "SOUTOTAL_HYPO3")
    private BigDecimal soutotalHypo3;
    @Column(name = "SOUTOTAL_HYPO4")
    private BigDecimal soutotalHypo4;
    @Column(name = "SOUTOTAL_AUTREPRET1")
    private BigDecimal soutotalAutrepret1;
    @Column(name = "SOUTOTAL_AUTREPRET2")
    private BigDecimal soutotalAutrepret2;
    @Column(name = "SOUTOTAL_AUTREPRET3")
    private BigDecimal soutotalAutrepret3;
    @Column(name = "SOUTOTAL_AUTREPRET4")
    private BigDecimal soutotalAutrepret4;
    @Column(name = "SOUTOTAL_DEPOTBANQ1")
    private BigDecimal soutotalDepotbanq1;
    @Column(name = "SOUTOTAL_DEPOTBANQ2")
    private BigDecimal soutotalDepotbanq2;
    @Column(name = "SOUTOTAL_DEPOTBANQ3")
    private BigDecimal soutotalDepotbanq3;
    @Column(name = "SOUTOTAL_DEPOTBANQ4")
    private BigDecimal soutotalDepotbanq4;
    @Column(name = "TOTALVALEUR1")
    private BigDecimal totalvaleur1;
    @Column(name = "TOTALVALEUR2")
    private BigDecimal totalvaleur2;
    @Column(name = "TOTALVALEUR3")
    private BigDecimal totalvaleur3;
    @Column(name = "TOTALVALEUR4")
    private BigDecimal totalvaleur4;
    @Column(name = "DATE_ETATC5")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEtatc5;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public EtatC5() {
    }

    public EtatC5(String codeEtatc5) {
        this.codeEtatc5 = codeEtatc5;
    }

    public String getCodeEtatc5() {
        return codeEtatc5;
    }

    public void setCodeEtatc5(String codeEtatc5) {
        this.codeEtatc5 = codeEtatc5;
    }

    public String getLibelleEtatc5() {
        return libelleEtatc5;
    }

    public void setLibelleEtatc5(String libelleEtatc5) {
        this.libelleEtatc5 = libelleEtatc5;
    }

    public BigDecimal getSoutotalvaleurArticle() {
        return soutotalvaleurArticle;
    }

    public void setSoutotalvaleurArticle(BigDecimal soutotalvaleurArticle) {
        this.soutotalvaleurArticle = soutotalvaleurArticle;
    }

    public BigDecimal getSoutotalvaleurPar() {
        return soutotalvaleurPar;
    }

    public void setSoutotalvaleurPar(BigDecimal soutotalvaleurPar) {
        this.soutotalvaleurPar = soutotalvaleurPar;
    }

    public BigDecimal getSoutotalvaleurRealisation() {
        return soutotalvaleurRealisation;
    }

    public void setSoutotalvaleurRealisation(BigDecimal soutotalvaleurRealisation) {
        this.soutotalvaleurRealisation = soutotalvaleurRealisation;
    }

    public BigDecimal getSoutotalCouverture() {
        return soutotalCouverture;
    }

    public void setSoutotalCouverture(BigDecimal soutotalCouverture) {
        this.soutotalCouverture = soutotalCouverture;
    }

    public BigDecimal getSoutotalOrganisme1() {
        return soutotalOrganisme1;
    }

    public void setSoutotalOrganisme1(BigDecimal soutotalOrganisme1) {
        this.soutotalOrganisme1 = soutotalOrganisme1;
    }

    public BigDecimal getSoutotalOrganisme2() {
        return soutotalOrganisme2;
    }

    public void setSoutotalOrganisme2(BigDecimal soutotalOrganisme2) {
        this.soutotalOrganisme2 = soutotalOrganisme2;
    }

    public BigDecimal getSoutotalOrganisme3() {
        return soutotalOrganisme3;
    }

    public void setSoutotalOrganisme3(BigDecimal soutotalOrganisme3) {
        this.soutotalOrganisme3 = soutotalOrganisme3;
    }

    public BigDecimal getSoutotalOrganisme4() {
        return soutotalOrganisme4;
    }

    public void setSoutotalOrganisme4(BigDecimal soutotalOrganisme4) {
        this.soutotalOrganisme4 = soutotalOrganisme4;
    }

    public BigDecimal getSoustotalFinanciere1() {
        return soustotalFinanciere1;
    }

    public void setSoustotalFinanciere1(BigDecimal soustotalFinanciere1) {
        this.soustotalFinanciere1 = soustotalFinanciere1;
    }

    public BigDecimal getSoustotalFinanciere2() {
        return soustotalFinanciere2;
    }

    public void setSoustotalFinanciere2(BigDecimal soustotalFinanciere2) {
        this.soustotalFinanciere2 = soustotalFinanciere2;
    }

    public BigDecimal getSoustotalFinanciere3() {
        return soustotalFinanciere3;
    }

    public void setSoustotalFinanciere3(BigDecimal soustotalFinanciere3) {
        this.soustotalFinanciere3 = soustotalFinanciere3;
    }

    public BigDecimal getSoustotalFinanciere4() {
        return soustotalFinanciere4;
    }

    public void setSoustotalFinanciere4(BigDecimal soustotalFinanciere4) {
        this.soustotalFinanciere4 = soustotalFinanciere4;
    }

    public BigDecimal getSoutotalAutreobligation1() {
        return soutotalAutreobligation1;
    }

    public void setSoutotalAutreobligation1(BigDecimal soutotalAutreobligation1) {
        this.soutotalAutreobligation1 = soutotalAutreobligation1;
    }

    public BigDecimal getSoutotalAutreobligation2() {
        return soutotalAutreobligation2;
    }

    public void setSoutotalAutreobligation2(BigDecimal soutotalAutreobligation2) {
        this.soutotalAutreobligation2 = soutotalAutreobligation2;
    }

    public BigDecimal getSoutotalAutreobligation3() {
        return soutotalAutreobligation3;
    }

    public void setSoutotalAutreobligation3(BigDecimal soutotalAutreobligation3) {
        this.soutotalAutreobligation3 = soutotalAutreobligation3;
    }

    public BigDecimal getSoutotalAutreobligation4() {
        return soutotalAutreobligation4;
    }

    public void setSoutotalAutreobligation4(BigDecimal soutotalAutreobligation4) {
        this.soutotalAutreobligation4 = soutotalAutreobligation4;
    }

    public BigDecimal getSoutotalAction1() {
        return soutotalAction1;
    }

    public void setSoutotalAction1(BigDecimal soutotalAction1) {
        this.soutotalAction1 = soutotalAction1;
    }

    public BigDecimal getSoutotalAction2() {
        return soutotalAction2;
    }

    public void setSoutotalAction2(BigDecimal soutotalAction2) {
        this.soutotalAction2 = soutotalAction2;
    }

    public BigDecimal getSoutotalAction3() {
        return soutotalAction3;
    }

    public void setSoutotalAction3(BigDecimal soutotalAction3) {
        this.soutotalAction3 = soutotalAction3;
    }

    public BigDecimal getSoutotalAction4() {
        return soutotalAction4;
    }

    public void setSoutotalAction4(BigDecimal soutotalAction4) {
        this.soutotalAction4 = soutotalAction4;
    }

    public BigDecimal getSoutotalAssurance1() {
        return soutotalAssurance1;
    }

    public void setSoutotalAssurance1(BigDecimal soutotalAssurance1) {
        this.soutotalAssurance1 = soutotalAssurance1;
    }

    public BigDecimal getSoutotalAssurance2() {
        return soutotalAssurance2;
    }

    public void setSoutotalAssurance2(BigDecimal soutotalAssurance2) {
        this.soutotalAssurance2 = soutotalAssurance2;
    }

    public BigDecimal getSoutotalAssurance3() {
        return soutotalAssurance3;
    }

    public void setSoutotalAssurance3(BigDecimal soutotalAssurance3) {
        this.soutotalAssurance3 = soutotalAssurance3;
    }

    public BigDecimal getSoutotalAssurance4() {
        return soutotalAssurance4;
    }

    public void setSoutotalAssurance4(BigDecimal soutotalAssurance4) {
        this.soutotalAssurance4 = soutotalAssurance4;
    }

    public BigDecimal getSoutotalCommercial1() {
        return soutotalCommercial1;
    }

    public void setSoutotalCommercial1(BigDecimal soutotalCommercial1) {
        this.soutotalCommercial1 = soutotalCommercial1;
    }

    public BigDecimal getSoutotalCommercial2() {
        return soutotalCommercial2;
    }

    public void setSoutotalCommercial2(BigDecimal soutotalCommercial2) {
        this.soutotalCommercial2 = soutotalCommercial2;
    }

    public BigDecimal getSoutotalCommercial3() {
        return soutotalCommercial3;
    }

    public void setSoutotalCommercial3(BigDecimal soutotalCommercial3) {
        this.soutotalCommercial3 = soutotalCommercial3;
    }

    public BigDecimal getSoutotalCommercial4() {
        return soutotalCommercial4;
    }

    public void setSoutotalCommercial4(BigDecimal soutotalCommercial4) {
        this.soutotalCommercial4 = soutotalCommercial4;
    }

    public BigDecimal getSoutotalInvestissement1() {
        return soutotalInvestissement1;
    }

    public void setSoutotalInvestissement1(BigDecimal soutotalInvestissement1) {
        this.soutotalInvestissement1 = soutotalInvestissement1;
    }

    public BigDecimal getSoutotalInvestissement2() {
        return soutotalInvestissement2;
    }

    public void setSoutotalInvestissement2(BigDecimal soutotalInvestissement2) {
        this.soutotalInvestissement2 = soutotalInvestissement2;
    }

    public BigDecimal getSoutotalInvestissement3() {
        return soutotalInvestissement3;
    }

    public void setSoutotalInvestissement3(BigDecimal soutotalInvestissement3) {
        this.soutotalInvestissement3 = soutotalInvestissement3;
    }

    public BigDecimal getSoutotalInvestissement4() {
        return soutotalInvestissement4;
    }

    public void setSoutotalInvestissement4(BigDecimal soutotalInvestissement4) {
        this.soutotalInvestissement4 = soutotalInvestissement4;
    }

    public BigDecimal getSoutotalImobilier1() {
        return soutotalImobilier1;
    }

    public void setSoutotalImobilier1(BigDecimal soutotalImobilier1) {
        this.soutotalImobilier1 = soutotalImobilier1;
    }

    public BigDecimal getSoutotalImobilier2() {
        return soutotalImobilier2;
    }

    public void setSoutotalImobilier2(BigDecimal soutotalImobilier2) {
        this.soutotalImobilier2 = soutotalImobilier2;
    }

    public BigDecimal getSoutotalImobilier3() {
        return soutotalImobilier3;
    }

    public void setSoutotalImobilier3(BigDecimal soutotalImobilier3) {
        this.soutotalImobilier3 = soutotalImobilier3;
    }

    public BigDecimal getSoutotalImobilier4() {
        return soutotalImobilier4;
    }

    public void setSoutotalImobilier4(BigDecimal soutotalImobilier4) {
        this.soutotalImobilier4 = soutotalImobilier4;
    }

    public BigDecimal getSoutotalGarantie1() {
        return soutotalGarantie1;
    }

    public void setSoutotalGarantie1(BigDecimal soutotalGarantie1) {
        this.soutotalGarantie1 = soutotalGarantie1;
    }

    public BigDecimal getSoutotalGarantie2() {
        return soutotalGarantie2;
    }

    public void setSoutotalGarantie2(BigDecimal soutotalGarantie2) {
        this.soutotalGarantie2 = soutotalGarantie2;
    }

    public BigDecimal getSoutotalGarantie3() {
        return soutotalGarantie3;
    }

    public void setSoutotalGarantie3(BigDecimal soutotalGarantie3) {
        this.soutotalGarantie3 = soutotalGarantie3;
    }

    public BigDecimal getSoutotalGarantie4() {
        return soutotalGarantie4;
    }

    public void setSoutotalGarantie4(BigDecimal soutotalGarantie4) {
        this.soutotalGarantie4 = soutotalGarantie4;
    }

    public BigDecimal getSoutotalHypo1() {
        return soutotalHypo1;
    }

    public void setSoutotalHypo1(BigDecimal soutotalHypo1) {
        this.soutotalHypo1 = soutotalHypo1;
    }

    public BigDecimal getSoutotalHypo2() {
        return soutotalHypo2;
    }

    public void setSoutotalHypo2(BigDecimal soutotalHypo2) {
        this.soutotalHypo2 = soutotalHypo2;
    }

    public BigDecimal getSoutotalHypo3() {
        return soutotalHypo3;
    }

    public void setSoutotalHypo3(BigDecimal soutotalHypo3) {
        this.soutotalHypo3 = soutotalHypo3;
    }

    public BigDecimal getSoutotalHypo4() {
        return soutotalHypo4;
    }

    public void setSoutotalHypo4(BigDecimal soutotalHypo4) {
        this.soutotalHypo4 = soutotalHypo4;
    }

    public BigDecimal getSoutotalAutrepret1() {
        return soutotalAutrepret1;
    }

    public void setSoutotalAutrepret1(BigDecimal soutotalAutrepret1) {
        this.soutotalAutrepret1 = soutotalAutrepret1;
    }

    public BigDecimal getSoutotalAutrepret2() {
        return soutotalAutrepret2;
    }

    public void setSoutotalAutrepret2(BigDecimal soutotalAutrepret2) {
        this.soutotalAutrepret2 = soutotalAutrepret2;
    }

    public BigDecimal getSoutotalAutrepret3() {
        return soutotalAutrepret3;
    }

    public void setSoutotalAutrepret3(BigDecimal soutotalAutrepret3) {
        this.soutotalAutrepret3 = soutotalAutrepret3;
    }

    public BigDecimal getSoutotalAutrepret4() {
        return soutotalAutrepret4;
    }

    public void setSoutotalAutrepret4(BigDecimal soutotalAutrepret4) {
        this.soutotalAutrepret4 = soutotalAutrepret4;
    }

    public BigDecimal getSoutotalDepotbanq1() {
        return soutotalDepotbanq1;
    }

    public void setSoutotalDepotbanq1(BigDecimal soutotalDepotbanq1) {
        this.soutotalDepotbanq1 = soutotalDepotbanq1;
    }

    public BigDecimal getSoutotalDepotbanq2() {
        return soutotalDepotbanq2;
    }

    public void setSoutotalDepotbanq2(BigDecimal soutotalDepotbanq2) {
        this.soutotalDepotbanq2 = soutotalDepotbanq2;
    }

    public BigDecimal getSoutotalDepotbanq3() {
        return soutotalDepotbanq3;
    }

    public void setSoutotalDepotbanq3(BigDecimal soutotalDepotbanq3) {
        this.soutotalDepotbanq3 = soutotalDepotbanq3;
    }

    public BigDecimal getSoutotalDepotbanq4() {
        return soutotalDepotbanq4;
    }

    public void setSoutotalDepotbanq4(BigDecimal soutotalDepotbanq4) {
        this.soutotalDepotbanq4 = soutotalDepotbanq4;
    }

    public BigDecimal getTotalvaleur1() {
        return totalvaleur1;
    }

    public void setTotalvaleur1(BigDecimal totalvaleur1) {
        this.totalvaleur1 = totalvaleur1;
    }

    public BigDecimal getTotalvaleur2() {
        return totalvaleur2;
    }

    public void setTotalvaleur2(BigDecimal totalvaleur2) {
        this.totalvaleur2 = totalvaleur2;
    }

    public BigDecimal getTotalvaleur3() {
        return totalvaleur3;
    }

    public void setTotalvaleur3(BigDecimal totalvaleur3) {
        this.totalvaleur3 = totalvaleur3;
    }

    public BigDecimal getTotalvaleur4() {
        return totalvaleur4;
    }

    public void setTotalvaleur4(BigDecimal totalvaleur4) {
        this.totalvaleur4 = totalvaleur4;
    }

    public Date getDateEtatc5() {
        return dateEtatc5;
    }

    public void setDateEtatc5(Date dateEtatc5) {
        this.dateEtatc5 = dateEtatc5;
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
        hash += (codeEtatc5 != null ? codeEtatc5.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtatC5)) {
            return false;
        }
        EtatC5 other = (EtatC5) object;
        if ((this.codeEtatc5 == null && other.codeEtatc5 != null) || (this.codeEtatc5 != null && !this.codeEtatc5.equals(other.codeEtatc5))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EtatC5[ codeEtatc5=" + codeEtatc5 + " ]";
    }
    
}
