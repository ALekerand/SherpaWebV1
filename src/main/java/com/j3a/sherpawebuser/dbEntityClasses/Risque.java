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
@Table(name = "risque")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Risque.findAll", query = "SELECT r FROM Risque r"),
    @NamedQuery(name = "Risque.findByCodeRisque", query = "SELECT r FROM Risque r WHERE r.codeRisque = :codeRisque"),
    @NamedQuery(name = "Risque.findByLibelleRisque", query = "SELECT r FROM Risque r WHERE r.libelleRisque = :libelleRisque")})
public class Risque implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_RISQUE")
    private String codeRisque;
    @Size(max = 50)
    @Column(name = "LIBELLE_RISQUE")
    private String libelleRisque;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeRisque")
    private List<Contrat> contratList;
    @OneToMany(mappedBy = "codeRisque")
    private List<Categorie> categorieList;
    @OneToMany(mappedBy = "codeRisque")
    private List<Garantie> garantieList;

    public Risque() {
    }

    public Risque(String codeRisque) {
        this.codeRisque = codeRisque;
    }

    public String getCodeRisque() {
        return codeRisque;
    }

    public void setCodeRisque(String codeRisque) {
        this.codeRisque = codeRisque;
    }

    public String getLibelleRisque() {
        return libelleRisque;
    }

    public void setLibelleRisque(String libelleRisque) {
        this.libelleRisque = libelleRisque;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    @XmlTransient
    public List<Categorie> getCategorieList() {
        return categorieList;
    }

    public void setCategorieList(List<Categorie> categorieList) {
        this.categorieList = categorieList;
    }

    @XmlTransient
    public List<Garantie> getGarantieList() {
        return garantieList;
    }

    public void setGarantieList(List<Garantie> garantieList) {
        this.garantieList = garantieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeRisque != null ? codeRisque.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Risque)) {
            return false;
        }
        Risque other = (Risque) object;
        if ((this.codeRisque == null && other.codeRisque != null) || (this.codeRisque != null && !this.codeRisque.equals(other.codeRisque))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Risque[ codeRisque=" + codeRisque + " ]";
    }
    
}
