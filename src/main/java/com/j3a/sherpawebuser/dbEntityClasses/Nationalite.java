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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "nationalite")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nationalite.findAll", query = "SELECT n FROM Nationalite n"),
    @NamedQuery(name = "Nationalite.findByCodeNationalite", query = "SELECT n FROM Nationalite n WHERE n.codeNationalite = :codeNationalite"),
    @NamedQuery(name = "Nationalite.findByLibelleNationalite", query = "SELECT n FROM Nationalite n WHERE n.libelleNationalite = :libelleNationalite")})
public class Nationalite implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODE_NATIONALITE")
    private Integer codeNationalite;
    @Size(max = 20)
    @Column(name = "LIBELLE_NATIONALITE")
    private String libelleNationalite;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "nationalite")
    private List<PersonneNationalite> personneNationaliteList;

    public Nationalite() {
    }

    public Nationalite(Integer codeNationalite) {
        this.codeNationalite = codeNationalite;
    }

    public Integer getCodeNationalite() {
        return codeNationalite;
    }

    public void setCodeNationalite(Integer codeNationalite) {
        this.codeNationalite = codeNationalite;
    }

    public String getLibelleNationalite() {
        return libelleNationalite;
    }

    public void setLibelleNationalite(String libelleNationalite) {
        this.libelleNationalite = libelleNationalite;
    }

    @XmlTransient
    public List<PersonneNationalite> getPersonneNationaliteList() {
        return personneNationaliteList;
    }

    public void setPersonneNationaliteList(List<PersonneNationalite> personneNationaliteList) {
        this.personneNationaliteList = personneNationaliteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeNationalite != null ? codeNationalite.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Nationalite)) {
            return false;
        }
        Nationalite other = (Nationalite) object;
        if ((this.codeNationalite == null && other.codeNationalite != null) || (this.codeNationalite != null && !this.codeNationalite.equals(other.codeNationalite))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Nationalite[ codeNationalite=" + codeNationalite + " ]";
    }
    
}
