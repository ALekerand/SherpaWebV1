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
@Table(name = "etatc10_tab_a")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10TabA.findAll", query = "SELECT e FROM Etatc10TabA e"),
    @NamedQuery(name = "Etatc10TabA.findByCodeetatc10", query = "SELECT e FROM Etatc10TabA e WHERE e.codeetatc10 = :codeetatc10"),
    @NamedQuery(name = "Etatc10TabA.findByLibelleEtat", query = "SELECT e FROM Etatc10TabA e WHERE e.libelleEtat = :libelleEtat")})
public class Etatc10TabA implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEETATC10")
    private String codeetatc10;
    @Size(max = 40)
    @Column(name = "LIBELLE_ETAT")
    private String libelleEtat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatc10TabA")
    private List<Etatc10tabaExercice> etatc10tabaExerciceList;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne
    private CategorieCima codecategoriecima;
    @OneToMany(mappedBy = "codeetatc10")
    private List<EtatCima> etatCimaList;

    public Etatc10TabA() {
    }

    public Etatc10TabA(String codeetatc10) {
        this.codeetatc10 = codeetatc10;
    }

    public String getCodeetatc10() {
        return codeetatc10;
    }

    public void setCodeetatc10(String codeetatc10) {
        this.codeetatc10 = codeetatc10;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    @XmlTransient
    public List<Etatc10tabaExercice> getEtatc10tabaExerciceList() {
        return etatc10tabaExerciceList;
    }

    public void setEtatc10tabaExerciceList(List<Etatc10tabaExercice> etatc10tabaExerciceList) {
        this.etatc10tabaExerciceList = etatc10tabaExerciceList;
    }

    public CategorieCima getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(CategorieCima codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
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
        hash += (codeetatc10 != null ? codeetatc10.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10TabA)) {
            return false;
        }
        Etatc10TabA other = (Etatc10TabA) object;
        if ((this.codeetatc10 == null && other.codeetatc10 != null) || (this.codeetatc10 != null && !this.codeetatc10.equals(other.codeetatc10))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10TabA[ codeetatc10=" + codeetatc10 + " ]";
    }
    
}
