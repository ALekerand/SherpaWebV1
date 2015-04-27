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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "etatc10a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10a.findAll", query = "SELECT e FROM Etatc10a e"),
    @NamedQuery(name = "Etatc10a.findByCodeEtatc10a", query = "SELECT e FROM Etatc10a e WHERE e.codeEtatc10a = :codeEtatc10a"),
    @NamedQuery(name = "Etatc10a.findByLibelleEtatc10a", query = "SELECT e FROM Etatc10a e WHERE e.libelleEtatc10a = :libelleEtatc10a")})
public class Etatc10a implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_ETATC10A")
    private String codeEtatc10a;
    @Size(max = 30)
    @Column(name = "LIBELLE_ETATC10A")
    private String libelleEtatc10a;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatc10a")
    private List<Etatc10aCategorie> etatc10aCategorieList;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public Etatc10a() {
    }

    public Etatc10a(String codeEtatc10a) {
        this.codeEtatc10a = codeEtatc10a;
    }

    public String getCodeEtatc10a() {
        return codeEtatc10a;
    }

    public void setCodeEtatc10a(String codeEtatc10a) {
        this.codeEtatc10a = codeEtatc10a;
    }

    public String getLibelleEtatc10a() {
        return libelleEtatc10a;
    }

    public void setLibelleEtatc10a(String libelleEtatc10a) {
        this.libelleEtatc10a = libelleEtatc10a;
    }

    @XmlTransient
    public List<Etatc10aCategorie> getEtatc10aCategorieList() {
        return etatc10aCategorieList;
    }

    public void setEtatc10aCategorieList(List<Etatc10aCategorie> etatc10aCategorieList) {
        this.etatc10aCategorieList = etatc10aCategorieList;
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
        hash += (codeEtatc10a != null ? codeEtatc10a.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10a)) {
            return false;
        }
        Etatc10a other = (Etatc10a) object;
        if ((this.codeEtatc10a == null && other.codeEtatc10a != null) || (this.codeEtatc10a != null && !this.codeEtatc10a.equals(other.codeEtatc10a))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10a[ codeEtatc10a=" + codeEtatc10a + " ]";
    }
    
}
