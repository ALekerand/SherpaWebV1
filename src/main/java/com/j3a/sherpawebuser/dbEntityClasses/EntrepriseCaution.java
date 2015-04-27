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
@Table(name = "entreprise_caution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EntrepriseCaution.findAll", query = "SELECT e FROM EntrepriseCaution e"),
    @NamedQuery(name = "EntrepriseCaution.findByCodeEntrepCaut", query = "SELECT e FROM EntrepriseCaution e WHERE e.codeEntrepCaut = :codeEntrepCaut"),
    @NamedQuery(name = "EntrepriseCaution.findByNomsEntrepCaut", query = "SELECT e FROM EntrepriseCaution e WHERE e.nomsEntrepCaut = :nomsEntrepCaut"),
    @NamedQuery(name = "EntrepriseCaution.findByPrenomsEntrepCaut", query = "SELECT e FROM EntrepriseCaution e WHERE e.prenomsEntrepCaut = :prenomsEntrepCaut"),
    @NamedQuery(name = "EntrepriseCaution.findByQualificationEntrepCaut", query = "SELECT e FROM EntrepriseCaution e WHERE e.qualificationEntrepCaut = :qualificationEntrepCaut"),
    @NamedQuery(name = "EntrepriseCaution.findByObjetEntrepCaut", query = "SELECT e FROM EntrepriseCaution e WHERE e.objetEntrepCaut = :objetEntrepCaut")})
public class EntrepriseCaution implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_ENTREP_CAUT")
    private String codeEntrepCaut;
    @Size(max = 20)
    @Column(name = "NOMS_ENTREP_CAUT")
    private String nomsEntrepCaut;
    @Size(max = 50)
    @Column(name = "PRENOMS_ENTREP_CAUT")
    private String prenomsEntrepCaut;
    @Size(max = 30)
    @Column(name = "QUALIFICATION_ENTREP_CAUT")
    private String qualificationEntrepCaut;
    @Size(max = 20)
    @Column(name = "OBJET_ENTREP_CAUT")
    private String objetEntrepCaut;
    @ManyToMany(mappedBy = "entrepriseCautionList")
    private List<EtatCima> etatCimaList;

    public EntrepriseCaution() {
    }

    public EntrepriseCaution(String codeEntrepCaut) {
        this.codeEntrepCaut = codeEntrepCaut;
    }

    public String getCodeEntrepCaut() {
        return codeEntrepCaut;
    }

    public void setCodeEntrepCaut(String codeEntrepCaut) {
        this.codeEntrepCaut = codeEntrepCaut;
    }

    public String getNomsEntrepCaut() {
        return nomsEntrepCaut;
    }

    public void setNomsEntrepCaut(String nomsEntrepCaut) {
        this.nomsEntrepCaut = nomsEntrepCaut;
    }

    public String getPrenomsEntrepCaut() {
        return prenomsEntrepCaut;
    }

    public void setPrenomsEntrepCaut(String prenomsEntrepCaut) {
        this.prenomsEntrepCaut = prenomsEntrepCaut;
    }

    public String getQualificationEntrepCaut() {
        return qualificationEntrepCaut;
    }

    public void setQualificationEntrepCaut(String qualificationEntrepCaut) {
        this.qualificationEntrepCaut = qualificationEntrepCaut;
    }

    public String getObjetEntrepCaut() {
        return objetEntrepCaut;
    }

    public void setObjetEntrepCaut(String objetEntrepCaut) {
        this.objetEntrepCaut = objetEntrepCaut;
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
        hash += (codeEntrepCaut != null ? codeEntrepCaut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EntrepriseCaution)) {
            return false;
        }
        EntrepriseCaution other = (EntrepriseCaution) object;
        if ((this.codeEntrepCaut == null && other.codeEntrepCaut != null) || (this.codeEntrepCaut != null && !this.codeEntrepCaut.equals(other.codeEntrepCaut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EntrepriseCaution[ codeEntrepCaut=" + codeEntrepCaut + " ]";
    }
    
}
