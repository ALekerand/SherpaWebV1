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
@Table(name = "personne_caution")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PersonneCaution.findAll", query = "SELECT p FROM PersonneCaution p"),
    @NamedQuery(name = "PersonneCaution.findByCodePersCaut", query = "SELECT p FROM PersonneCaution p WHERE p.codePersCaut = :codePersCaut"),
    @NamedQuery(name = "PersonneCaution.findByNomPersCaut", query = "SELECT p FROM PersonneCaution p WHERE p.nomPersCaut = :nomPersCaut"),
    @NamedQuery(name = "PersonneCaution.findByPrenomsPersCaut", query = "SELECT p FROM PersonneCaution p WHERE p.prenomsPersCaut = :prenomsPersCaut"),
    @NamedQuery(name = "PersonneCaution.findByQualificationPersCaut", query = "SELECT p FROM PersonneCaution p WHERE p.qualificationPersCaut = :qualificationPersCaut"),
    @NamedQuery(name = "PersonneCaution.findByObjetCautionPersCaut", query = "SELECT p FROM PersonneCaution p WHERE p.objetCautionPersCaut = :objetCautionPersCaut")})
public class PersonneCaution implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PERS_CAUT")
    private String codePersCaut;
    @Size(max = 20)
    @Column(name = "NOM_PERS_CAUT")
    private String nomPersCaut;
    @Size(max = 50)
    @Column(name = "PRENOMS_PERS_CAUT")
    private String prenomsPersCaut;
    @Size(max = 30)
    @Column(name = "QUALIFICATION__PERS_CAUT")
    private String qualificationPersCaut;
    @Size(max = 30)
    @Column(name = "OBJET_CAUTION_PERS_CAUT")
    private String objetCautionPersCaut;
    @ManyToMany(mappedBy = "personneCautionList")
    private List<EtatCima> etatCimaList;

    public PersonneCaution() {
    }

    public PersonneCaution(String codePersCaut) {
        this.codePersCaut = codePersCaut;
    }

    public String getCodePersCaut() {
        return codePersCaut;
    }

    public void setCodePersCaut(String codePersCaut) {
        this.codePersCaut = codePersCaut;
    }

    public String getNomPersCaut() {
        return nomPersCaut;
    }

    public void setNomPersCaut(String nomPersCaut) {
        this.nomPersCaut = nomPersCaut;
    }

    public String getPrenomsPersCaut() {
        return prenomsPersCaut;
    }

    public void setPrenomsPersCaut(String prenomsPersCaut) {
        this.prenomsPersCaut = prenomsPersCaut;
    }

    public String getQualificationPersCaut() {
        return qualificationPersCaut;
    }

    public void setQualificationPersCaut(String qualificationPersCaut) {
        this.qualificationPersCaut = qualificationPersCaut;
    }

    public String getObjetCautionPersCaut() {
        return objetCautionPersCaut;
    }

    public void setObjetCautionPersCaut(String objetCautionPersCaut) {
        this.objetCautionPersCaut = objetCautionPersCaut;
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
        hash += (codePersCaut != null ? codePersCaut.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PersonneCaution)) {
            return false;
        }
        PersonneCaution other = (PersonneCaution) object;
        if ((this.codePersCaut == null && other.codePersCaut != null) || (this.codePersCaut != null && !this.codePersCaut.equals(other.codePersCaut))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PersonneCaution[ codePersCaut=" + codePersCaut + " ]";
    }
    
}
