/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
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
@Table(name = "etat_cima")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EtatCima.findAll", query = "SELECT e FROM EtatCima e"),
    @NamedQuery(name = "EtatCima.findByCodeEtatCima", query = "SELECT e FROM EtatCima e WHERE e.codeEtatCima = :codeEtatCima"),
    @NamedQuery(name = "EtatCima.findByExerciceConcerne", query = "SELECT e FROM EtatCima e WHERE e.exerciceConcerne = :exerciceConcerne"),
    @NamedQuery(name = "EtatCima.findBySocieteCima", query = "SELECT e FROM EtatCima e WHERE e.societeCima = :societeCima"),
    @NamedQuery(name = "EtatCima.findByPaysCima", query = "SELECT e FROM EtatCima e WHERE e.paysCima = :paysCima"),
    @NamedQuery(name = "EtatCima.findByDateEtat", query = "SELECT e FROM EtatCima e WHERE e.dateEtat = :dateEtat")})
public class EtatCima implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_ETAT_CIMA")
    private String codeEtatCima;
    @Column(name = "EXERCICE_CONCERNE")
    private Short exerciceConcerne;
    @Size(max = 60)
    @Column(name = "SOCIETE_CIMA")
    private String societeCima;
    @Size(max = 60)
    @Column(name = "PAYS_CIMA")
    private String paysCima;
    @Column(name = "DATE_ETAT")
    @Temporal(TemporalType.DATE)
    private Date dateEtat;
    @JoinTable(name = "modifcapital_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_MODIF_CAP", referencedColumnName = "CODE_MODIF_CAP")})
    @ManyToMany
    private List<ModifiCapital> modifiCapitalList;
    @JoinTable(name = "paysaction_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_PA", referencedColumnName = "CODE_PA")})
    @ManyToMany
    private List<PaysAction> paysActionList;
    @ManyToMany(mappedBy = "etatCimaList")
    private List<Direction> directionList;
    @JoinTable(name = "personnecaut_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_PERS_CAUT", referencedColumnName = "CODE_PERS_CAUT")})
    @ManyToMany
    private List<PersonneCaution> personneCautionList;
    @JoinTable(name = "obligation_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_OB_EMP", referencedColumnName = "CODE_OB_EMP")})
    @ManyToMany
    private List<ObligationEmprunt> obligationEmpruntList;
    @ManyToMany(mappedBy = "etatCimaList")
    private List<Portefeuilles> portefeuillesList;
    @JoinTable(name = "branche_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_BRANCHE", referencedColumnName = "CODE_BRANCHE")})
    @ManyToMany
    private List<Branche> brancheList;
    @JoinTable(name = "entreprisecaution_exercice", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ENTREP_CAUT", referencedColumnName = "CODE_ENTREP_CAUT")})
    @ManyToMany
    private List<EntrepriseCaution> entrepriseCautionList;
    @JoinTable(name = "accord_cima", joinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ACCORD", referencedColumnName = "CODE_ACCORD")})
    @ManyToMany
    private List<Accords> accordsList;
    @ManyToMany(mappedBy = "etatCimaList")
    private List<EffectifPersonnel> effectifPersonnelList;
    @ManyToMany(mappedBy = "etatCimaList")
    private List<ActionnaireConseil> actionnaireConseilList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Feuillebilan> feuillebilanList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<CegCredit> cegCreditList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Etatc10b> etatc10bList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Etatc10a> etatc10aList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Cgpp> cgppList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Etatc1> etatc1List;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<CegDebit> cegDebitList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<EtatC5> etatC5List;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Etatc9> etatc9List;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<EtatC4> etatC4List;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Etatc10TabB> etatc10TabBList;
    @OneToMany(mappedBy = "codeEtatCima")
    private List<Ria> riaList;
    @JoinColumn(name = "CODEETATC10", referencedColumnName = "CODEETATC10")
    @ManyToOne
    private Etatc10TabA codeetatc10;

    public EtatCima() {
    }

    public EtatCima(String codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    public String getCodeEtatCima() {
        return codeEtatCima;
    }

    public void setCodeEtatCima(String codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    public Short getExerciceConcerne() {
        return exerciceConcerne;
    }

    public void setExerciceConcerne(Short exerciceConcerne) {
        this.exerciceConcerne = exerciceConcerne;
    }

    public String getSocieteCima() {
        return societeCima;
    }

    public void setSocieteCima(String societeCima) {
        this.societeCima = societeCima;
    }

    public String getPaysCima() {
        return paysCima;
    }

    public void setPaysCima(String paysCima) {
        this.paysCima = paysCima;
    }

    public Date getDateEtat() {
        return dateEtat;
    }

    public void setDateEtat(Date dateEtat) {
        this.dateEtat = dateEtat;
    }

    @XmlTransient
    public List<ModifiCapital> getModifiCapitalList() {
        return modifiCapitalList;
    }

    public void setModifiCapitalList(List<ModifiCapital> modifiCapitalList) {
        this.modifiCapitalList = modifiCapitalList;
    }

    @XmlTransient
    public List<PaysAction> getPaysActionList() {
        return paysActionList;
    }

    public void setPaysActionList(List<PaysAction> paysActionList) {
        this.paysActionList = paysActionList;
    }

    @XmlTransient
    public List<Direction> getDirectionList() {
        return directionList;
    }

    public void setDirectionList(List<Direction> directionList) {
        this.directionList = directionList;
    }

    @XmlTransient
    public List<PersonneCaution> getPersonneCautionList() {
        return personneCautionList;
    }

    public void setPersonneCautionList(List<PersonneCaution> personneCautionList) {
        this.personneCautionList = personneCautionList;
    }

    @XmlTransient
    public List<ObligationEmprunt> getObligationEmpruntList() {
        return obligationEmpruntList;
    }

    public void setObligationEmpruntList(List<ObligationEmprunt> obligationEmpruntList) {
        this.obligationEmpruntList = obligationEmpruntList;
    }

    @XmlTransient
    public List<Portefeuilles> getPortefeuillesList() {
        return portefeuillesList;
    }

    public void setPortefeuillesList(List<Portefeuilles> portefeuillesList) {
        this.portefeuillesList = portefeuillesList;
    }

    @XmlTransient
    public List<Branche> getBrancheList() {
        return brancheList;
    }

    public void setBrancheList(List<Branche> brancheList) {
        this.brancheList = brancheList;
    }

    @XmlTransient
    public List<EntrepriseCaution> getEntrepriseCautionList() {
        return entrepriseCautionList;
    }

    public void setEntrepriseCautionList(List<EntrepriseCaution> entrepriseCautionList) {
        this.entrepriseCautionList = entrepriseCautionList;
    }

    @XmlTransient
    public List<Accords> getAccordsList() {
        return accordsList;
    }

    public void setAccordsList(List<Accords> accordsList) {
        this.accordsList = accordsList;
    }

    @XmlTransient
    public List<EffectifPersonnel> getEffectifPersonnelList() {
        return effectifPersonnelList;
    }

    public void setEffectifPersonnelList(List<EffectifPersonnel> effectifPersonnelList) {
        this.effectifPersonnelList = effectifPersonnelList;
    }

    @XmlTransient
    public List<ActionnaireConseil> getActionnaireConseilList() {
        return actionnaireConseilList;
    }

    public void setActionnaireConseilList(List<ActionnaireConseil> actionnaireConseilList) {
        this.actionnaireConseilList = actionnaireConseilList;
    }

    @XmlTransient
    public List<Feuillebilan> getFeuillebilanList() {
        return feuillebilanList;
    }

    public void setFeuillebilanList(List<Feuillebilan> feuillebilanList) {
        this.feuillebilanList = feuillebilanList;
    }

    @XmlTransient
    public List<CegCredit> getCegCreditList() {
        return cegCreditList;
    }

    public void setCegCreditList(List<CegCredit> cegCreditList) {
        this.cegCreditList = cegCreditList;
    }

    @XmlTransient
    public List<Etatc10b> getEtatc10bList() {
        return etatc10bList;
    }

    public void setEtatc10bList(List<Etatc10b> etatc10bList) {
        this.etatc10bList = etatc10bList;
    }

    @XmlTransient
    public List<Etatc10a> getEtatc10aList() {
        return etatc10aList;
    }

    public void setEtatc10aList(List<Etatc10a> etatc10aList) {
        this.etatc10aList = etatc10aList;
    }

    @XmlTransient
    public List<Cgpp> getCgppList() {
        return cgppList;
    }

    public void setCgppList(List<Cgpp> cgppList) {
        this.cgppList = cgppList;
    }

    @XmlTransient
    public List<Etatc1> getEtatc1List() {
        return etatc1List;
    }

    public void setEtatc1List(List<Etatc1> etatc1List) {
        this.etatc1List = etatc1List;
    }

    @XmlTransient
    public List<CegDebit> getCegDebitList() {
        return cegDebitList;
    }

    public void setCegDebitList(List<CegDebit> cegDebitList) {
        this.cegDebitList = cegDebitList;
    }

    @XmlTransient
    public List<EtatC5> getEtatC5List() {
        return etatC5List;
    }

    public void setEtatC5List(List<EtatC5> etatC5List) {
        this.etatC5List = etatC5List;
    }

    @XmlTransient
    public List<Etatc9> getEtatc9List() {
        return etatc9List;
    }

    public void setEtatc9List(List<Etatc9> etatc9List) {
        this.etatc9List = etatc9List;
    }

    @XmlTransient
    public List<EtatC4> getEtatC4List() {
        return etatC4List;
    }

    public void setEtatC4List(List<EtatC4> etatC4List) {
        this.etatC4List = etatC4List;
    }

    @XmlTransient
    public List<Etatc10TabB> getEtatc10TabBList() {
        return etatc10TabBList;
    }

    public void setEtatc10TabBList(List<Etatc10TabB> etatc10TabBList) {
        this.etatc10TabBList = etatc10TabBList;
    }

    @XmlTransient
    public List<Ria> getRiaList() {
        return riaList;
    }

    public void setRiaList(List<Ria> riaList) {
        this.riaList = riaList;
    }

    public Etatc10TabA getCodeetatc10() {
        return codeetatc10;
    }

    public void setCodeetatc10(Etatc10TabA codeetatc10) {
        this.codeetatc10 = codeetatc10;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEtatCima != null ? codeEtatCima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EtatCima)) {
            return false;
        }
        EtatCima other = (EtatCima) object;
        if ((this.codeEtatCima == null && other.codeEtatCima != null) || (this.codeEtatCima != null && !this.codeEtatCima.equals(other.codeEtatCima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EtatCima[ codeEtatCima=" + codeEtatCima + " ]";
    }
    
}
