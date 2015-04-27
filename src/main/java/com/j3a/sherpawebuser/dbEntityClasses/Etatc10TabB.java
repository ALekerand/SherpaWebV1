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
@Table(name = "etatc10_tab_b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10TabB.findAll", query = "SELECT e FROM Etatc10TabB e"),
    @NamedQuery(name = "Etatc10TabB.findByCodeetatc10b", query = "SELECT e FROM Etatc10TabB e WHERE e.codeetatc10b = :codeetatc10b"),
    @NamedQuery(name = "Etatc10TabB.findByLibelleEtat", query = "SELECT e FROM Etatc10TabB e WHERE e.libelleEtat = :libelleEtat")})
public class Etatc10TabB implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODEETATC10B")
    private String codeetatc10b;
    @Size(max = 40)
    @Column(name = "LIBELLE_ETAT")
    private String libelleEtat;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatc10TabB")
    private List<Etatc10tabbExercice> etatc10tabbExerciceList;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne
    private CategorieCima codecategoriecima;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public Etatc10TabB() {
    }

    public Etatc10TabB(String codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    public String getCodeetatc10b() {
        return codeetatc10b;
    }

    public void setCodeetatc10b(String codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    public String getLibelleEtat() {
        return libelleEtat;
    }

    public void setLibelleEtat(String libelleEtat) {
        this.libelleEtat = libelleEtat;
    }

    @XmlTransient
    public List<Etatc10tabbExercice> getEtatc10tabbExerciceList() {
        return etatc10tabbExerciceList;
    }

    public void setEtatc10tabbExerciceList(List<Etatc10tabbExercice> etatc10tabbExerciceList) {
        this.etatc10tabbExerciceList = etatc10tabbExerciceList;
    }

    public CategorieCima getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(CategorieCima codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
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
        hash += (codeetatc10b != null ? codeetatc10b.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10TabB)) {
            return false;
        }
        Etatc10TabB other = (Etatc10TabB) object;
        if ((this.codeetatc10b == null && other.codeetatc10b != null) || (this.codeetatc10b != null && !this.codeetatc10b.equals(other.codeetatc10b))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10TabB[ codeetatc10b=" + codeetatc10b + " ]";
    }
    
}
