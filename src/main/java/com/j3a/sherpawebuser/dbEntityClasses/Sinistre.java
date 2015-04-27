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
@Table(name = "sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sinistre.findAll", query = "SELECT s FROM Sinistre s"),
    @NamedQuery(name = "Sinistre.findByCodeSinistre", query = "SELECT s FROM Sinistre s WHERE s.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "Sinistre.findByDateSurvenance", query = "SELECT s FROM Sinistre s WHERE s.dateSurvenance = :dateSurvenance"),
    @NamedQuery(name = "Sinistre.findByCirconstance", query = "SELECT s FROM Sinistre s WHERE s.circonstance = :circonstance"),
    @NamedQuery(name = "Sinistre.findByDateDeclaration", query = "SELECT s FROM Sinistre s WHERE s.dateDeclaration = :dateDeclaration"),
    @NamedQuery(name = "Sinistre.findByDateEvaluation", query = "SELECT s FROM Sinistre s WHERE s.dateEvaluation = :dateEvaluation"),
    @NamedQuery(name = "Sinistre.findByEvaluationBrute", query = "SELECT s FROM Sinistre s WHERE s.evaluationBrute = :evaluationBrute"),
    @NamedQuery(name = "Sinistre.findByEvaluationNette", query = "SELECT s FROM Sinistre s WHERE s.evaluationNette = :evaluationNette"),
    @NamedQuery(name = "Sinistre.findByPositionDossier", query = "SELECT s FROM Sinistre s WHERE s.positionDossier = :positionDossier"),
    @NamedQuery(name = "Sinistre.findByCodeAvenantSinistre", query = "SELECT s FROM Sinistre s WHERE s.codeAvenantSinistre = :codeAvenantSinistre")})
public class Sinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_SINISTRE")
    private String codeSinistre;
    @Column(name = "DATE_SURVENANCE")
    @Temporal(TemporalType.DATE)
    private Date dateSurvenance;
    @Size(max = 60)
    @Column(name = "CIRCONSTANCE")
    private String circonstance;
    @Column(name = "DATE_DECLARATION")
    @Temporal(TemporalType.DATE)
    private Date dateDeclaration;
    @Column(name = "DATE_EVALUATION")
    @Temporal(TemporalType.DATE)
    private Date dateEvaluation;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EVALUATION_BRUTE")
    private BigDecimal evaluationBrute;
    @Column(name = "EVALUATION_NETTE")
    private BigDecimal evaluationNette;
    @Size(max = 60)
    @Column(name = "POSITION_DOSSIER")
    private String positionDossier;
    @Size(max = 30)
    @Column(name = "CODE_AVENANT_SINISTRE")
    private String codeAvenantSinistre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<HabitationSinistre> habitationSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<GestionConfieeSinistre> gestionConfieeSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<VehiculeSinistre> vehiculeSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<AssureIaSinistre> assureIaSinistreList;
    @OneToMany(mappedBy = "codeSinistre")
    private List<Intervention> interventionList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<AlimentSinistre> alimentSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSinistre")
    private List<Expertise> expertiseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSinistre")
    private List<PartieAdverse> partieAdverseList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<SinistreConducteur> sinistreConducteurList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSinistre")
    private List<Victime> victimeList;
    @JoinColumn(name = "NUM_POLICE", referencedColumnName = "NUM_POLICE")
    @ManyToOne(optional = false)
    private Contrat numPolice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<GarantieSinistre> garantieSinistreList;
    @OneToMany(mappedBy = "codeSinistre")
    private List<ReglementSinistreGc> reglementSinistreGcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<CorpsSinistre> corpsSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "sinistre")
    private List<RisqueNtaSinistre> risqueNtaSinistreList;

    public Sinistre() {
    }

    public Sinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public String getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(String codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public Date getDateSurvenance() {
        return dateSurvenance;
    }

    public void setDateSurvenance(Date dateSurvenance) {
        this.dateSurvenance = dateSurvenance;
    }

    public String getCirconstance() {
        return circonstance;
    }

    public void setCirconstance(String circonstance) {
        this.circonstance = circonstance;
    }

    public Date getDateDeclaration() {
        return dateDeclaration;
    }

    public void setDateDeclaration(Date dateDeclaration) {
        this.dateDeclaration = dateDeclaration;
    }

    public Date getDateEvaluation() {
        return dateEvaluation;
    }

    public void setDateEvaluation(Date dateEvaluation) {
        this.dateEvaluation = dateEvaluation;
    }

    public BigDecimal getEvaluationBrute() {
        return evaluationBrute;
    }

    public void setEvaluationBrute(BigDecimal evaluationBrute) {
        this.evaluationBrute = evaluationBrute;
    }

    public BigDecimal getEvaluationNette() {
        return evaluationNette;
    }

    public void setEvaluationNette(BigDecimal evaluationNette) {
        this.evaluationNette = evaluationNette;
    }

    public String getPositionDossier() {
        return positionDossier;
    }

    public void setPositionDossier(String positionDossier) {
        this.positionDossier = positionDossier;
    }

    public String getCodeAvenantSinistre() {
        return codeAvenantSinistre;
    }

    public void setCodeAvenantSinistre(String codeAvenantSinistre) {
        this.codeAvenantSinistre = codeAvenantSinistre;
    }

    @XmlTransient
    public List<HabitationSinistre> getHabitationSinistreList() {
        return habitationSinistreList;
    }

    public void setHabitationSinistreList(List<HabitationSinistre> habitationSinistreList) {
        this.habitationSinistreList = habitationSinistreList;
    }

    @XmlTransient
    public List<GestionConfieeSinistre> getGestionConfieeSinistreList() {
        return gestionConfieeSinistreList;
    }

    public void setGestionConfieeSinistreList(List<GestionConfieeSinistre> gestionConfieeSinistreList) {
        this.gestionConfieeSinistreList = gestionConfieeSinistreList;
    }

    @XmlTransient
    public List<VehiculeSinistre> getVehiculeSinistreList() {
        return vehiculeSinistreList;
    }

    public void setVehiculeSinistreList(List<VehiculeSinistre> vehiculeSinistreList) {
        this.vehiculeSinistreList = vehiculeSinistreList;
    }

    @XmlTransient
    public List<AssureIaSinistre> getAssureIaSinistreList() {
        return assureIaSinistreList;
    }

    public void setAssureIaSinistreList(List<AssureIaSinistre> assureIaSinistreList) {
        this.assureIaSinistreList = assureIaSinistreList;
    }

    @XmlTransient
    public List<Intervention> getInterventionList() {
        return interventionList;
    }

    public void setInterventionList(List<Intervention> interventionList) {
        this.interventionList = interventionList;
    }

    @XmlTransient
    public List<AlimentSinistre> getAlimentSinistreList() {
        return alimentSinistreList;
    }

    public void setAlimentSinistreList(List<AlimentSinistre> alimentSinistreList) {
        this.alimentSinistreList = alimentSinistreList;
    }

    @XmlTransient
    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public void setExpertiseList(List<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }

    @XmlTransient
    public List<PartieAdverse> getPartieAdverseList() {
        return partieAdverseList;
    }

    public void setPartieAdverseList(List<PartieAdverse> partieAdverseList) {
        this.partieAdverseList = partieAdverseList;
    }

    @XmlTransient
    public List<SinistreConducteur> getSinistreConducteurList() {
        return sinistreConducteurList;
    }

    public void setSinistreConducteurList(List<SinistreConducteur> sinistreConducteurList) {
        this.sinistreConducteurList = sinistreConducteurList;
    }

    @XmlTransient
    public List<Victime> getVictimeList() {
        return victimeList;
    }

    public void setVictimeList(List<Victime> victimeList) {
        this.victimeList = victimeList;
    }

    public Contrat getNumPolice() {
        return numPolice;
    }

    public void setNumPolice(Contrat numPolice) {
        this.numPolice = numPolice;
    }

    @XmlTransient
    public List<GarantieSinistre> getGarantieSinistreList() {
        return garantieSinistreList;
    }

    public void setGarantieSinistreList(List<GarantieSinistre> garantieSinistreList) {
        this.garantieSinistreList = garantieSinistreList;
    }

    @XmlTransient
    public List<ReglementSinistreGc> getReglementSinistreGcList() {
        return reglementSinistreGcList;
    }

    public void setReglementSinistreGcList(List<ReglementSinistreGc> reglementSinistreGcList) {
        this.reglementSinistreGcList = reglementSinistreGcList;
    }

    @XmlTransient
    public List<CorpsSinistre> getCorpsSinistreList() {
        return corpsSinistreList;
    }

    public void setCorpsSinistreList(List<CorpsSinistre> corpsSinistreList) {
        this.corpsSinistreList = corpsSinistreList;
    }

    @XmlTransient
    public List<RisqueNtaSinistre> getRisqueNtaSinistreList() {
        return risqueNtaSinistreList;
    }

    public void setRisqueNtaSinistreList(List<RisqueNtaSinistre> risqueNtaSinistreList) {
        this.risqueNtaSinistreList = risqueNtaSinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSinistre != null ? codeSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sinistre)) {
            return false;
        }
        Sinistre other = (Sinistre) object;
        if ((this.codeSinistre == null && other.codeSinistre != null) || (this.codeSinistre != null && !this.codeSinistre.equals(other.codeSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Sinistre[ codeSinistre=" + codeSinistre + " ]";
    }
    
}
