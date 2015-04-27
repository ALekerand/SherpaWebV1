/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "effectif_personnel")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EffectifPersonnel.findAll", query = "SELECT e FROM EffectifPersonnel e"),
    @NamedQuery(name = "EffectifPersonnel.findByCodeEffectifPersonnel", query = "SELECT e FROM EffectifPersonnel e WHERE e.codeEffectifPersonnel = :codeEffectifPersonnel"),
    @NamedQuery(name = "EffectifPersonnel.findByPersonnelDirection", query = "SELECT e FROM EffectifPersonnel e WHERE e.personnelDirection = :personnelDirection"),
    @NamedQuery(name = "EffectifPersonnel.findByAgentMaitrise", query = "SELECT e FROM EffectifPersonnel e WHERE e.agentMaitrise = :agentMaitrise"),
    @NamedQuery(name = "EffectifPersonnel.findByAgentExecution", query = "SELECT e FROM EffectifPersonnel e WHERE e.agentExecution = :agentExecution"),
    @NamedQuery(name = "EffectifPersonnel.findByAutreProdSalPays", query = "SELECT e FROM EffectifPersonnel e WHERE e.autreProdSalPays = :autreProdSalPays"),
    @NamedQuery(name = "EffectifPersonnel.findByTotalPersSalarie", query = "SELECT e FROM EffectifPersonnel e WHERE e.totalPersSalarie = :totalPersSalarie"),
    @NamedQuery(name = "EffectifPersonnel.findByAgentGeneroPays", query = "SELECT e FROM EffectifPersonnel e WHERE e.agentGeneroPays = :agentGeneroPays"),
    @NamedQuery(name = "EffectifPersonnel.findByCoutiers", query = "SELECT e FROM EffectifPersonnel e WHERE e.coutiers = :coutiers"),
    @NamedQuery(name = "EffectifPersonnel.findByTotalPersNonSalarie", query = "SELECT e FROM EffectifPersonnel e WHERE e.totalPersNonSalarie = :totalPersNonSalarie")})
public class EffectifPersonnel implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_EFFECTIF_PERSONNEL")
    private String codeEffectifPersonnel;
    @Column(name = "PERSONNEL_DIRECTION")
    private Integer personnelDirection;
    @Column(name = "AGENT_MAITRISE")
    private Integer agentMaitrise;
    @Column(name = "AGENT_EXECUTION")
    private Integer agentExecution;
    @Column(name = "AUTRE_PROD_SAL_PAYS")
    private Integer autreProdSalPays;
    @Column(name = "TOTAL_PERS_SALARIE")
    private Integer totalPersSalarie;
    @Column(name = "AGENT_GENERO_PAYS")
    private Integer agentGeneroPays;
    @Column(name = "COUTIERS")
    private Integer coutiers;
    @Column(name = "TOTAL_PERS_NON_SALARIE")
    private Integer totalPersNonSalarie;
    @JoinTable(name = "effectif_perso_etat_cima", joinColumns = {
        @JoinColumn(name = "CODE_EFFECTIF_PERSONNEL", referencedColumnName = "CODE_EFFECTIF_PERSONNEL")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")})
    @ManyToMany
    private List<EtatCima> etatCimaList;

    public EffectifPersonnel() {
    }

    public EffectifPersonnel(String codeEffectifPersonnel) {
        this.codeEffectifPersonnel = codeEffectifPersonnel;
    }

    public String getCodeEffectifPersonnel() {
        return codeEffectifPersonnel;
    }

    public void setCodeEffectifPersonnel(String codeEffectifPersonnel) {
        this.codeEffectifPersonnel = codeEffectifPersonnel;
    }

    public Integer getPersonnelDirection() {
        return personnelDirection;
    }

    public void setPersonnelDirection(Integer personnelDirection) {
        this.personnelDirection = personnelDirection;
    }

    public Integer getAgentMaitrise() {
        return agentMaitrise;
    }

    public void setAgentMaitrise(Integer agentMaitrise) {
        this.agentMaitrise = agentMaitrise;
    }

    public Integer getAgentExecution() {
        return agentExecution;
    }

    public void setAgentExecution(Integer agentExecution) {
        this.agentExecution = agentExecution;
    }

    public Integer getAutreProdSalPays() {
        return autreProdSalPays;
    }

    public void setAutreProdSalPays(Integer autreProdSalPays) {
        this.autreProdSalPays = autreProdSalPays;
    }

    public Integer getTotalPersSalarie() {
        return totalPersSalarie;
    }

    public void setTotalPersSalarie(Integer totalPersSalarie) {
        this.totalPersSalarie = totalPersSalarie;
    }

    public Integer getAgentGeneroPays() {
        return agentGeneroPays;
    }

    public void setAgentGeneroPays(Integer agentGeneroPays) {
        this.agentGeneroPays = agentGeneroPays;
    }

    public Integer getCoutiers() {
        return coutiers;
    }

    public void setCoutiers(Integer coutiers) {
        this.coutiers = coutiers;
    }

    public Integer getTotalPersNonSalarie() {
        return totalPersNonSalarie;
    }

    public void setTotalPersNonSalarie(Integer totalPersNonSalarie) {
        this.totalPersNonSalarie = totalPersNonSalarie;
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
        hash += (codeEffectifPersonnel != null ? codeEffectifPersonnel.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EffectifPersonnel)) {
            return false;
        }
        EffectifPersonnel other = (EffectifPersonnel) object;
        if ((this.codeEffectifPersonnel == null && other.codeEffectifPersonnel != null) || (this.codeEffectifPersonnel != null && !this.codeEffectifPersonnel.equals(other.codeEffectifPersonnel))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EffectifPersonnel[ codeEffectifPersonnel=" + codeEffectifPersonnel + " ]";
    }
    
}
