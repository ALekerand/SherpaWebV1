/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "sexe")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sexe.findAll", query = "SELECT s FROM Sexe s"),
    @NamedQuery(name = "Sexe.findByCodeSexe", query = "SELECT s FROM Sexe s WHERE s.codeSexe = :codeSexe"),
    @NamedQuery(name = "Sexe.findByLibelleSexe", query = "SELECT s FROM Sexe s WHERE s.libelleSexe = :libelleSexe")})
public class Sexe implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_SEXE")
    private Integer codeSexe;
    @Column(name = "LIBELLE_SEXE")
    private Character libelleSexe;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeSexe")
    private List<Physique> physiqueList;

    public Sexe() {
    }

    public Sexe(Integer codeSexe) {
        this.codeSexe = codeSexe;
    }

    public Integer getCodeSexe() {
        return codeSexe;
    }

    public void setCodeSexe(Integer codeSexe) {
        this.codeSexe = codeSexe;
    }

    public Character getLibelleSexe() {
        return libelleSexe;
    }

    public void setLibelleSexe(Character libelleSexe) {
        this.libelleSexe = libelleSexe;
    }

    @XmlTransient
    public List<Physique> getPhysiqueList() {
        return physiqueList;
    }

    public void setPhysiqueList(List<Physique> physiqueList) {
        this.physiqueList = physiqueList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeSexe != null ? codeSexe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sexe)) {
            return false;
        }
        Sexe other = (Sexe) object;
        if ((this.codeSexe == null && other.codeSexe != null) || (this.codeSexe != null && !this.codeSexe.equals(other.codeSexe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Sexe[ codeSexe=" + codeSexe + " ]";
    }
    
}
