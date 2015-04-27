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
@Table(name = "etatc10b")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10b.findAll", query = "SELECT e FROM Etatc10b e"),
    @NamedQuery(name = "Etatc10b.findByCodeetatc10b", query = "SELECT e FROM Etatc10b e WHERE e.codeetatc10b = :codeetatc10b"),
    @NamedQuery(name = "Etatc10b.findByDateetatc10b", query = "SELECT e FROM Etatc10b e WHERE e.dateetatc10b = :dateetatc10b")})
public class Etatc10b implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEETATC10B")
    private String codeetatc10b;
    @Column(name = "DATEETATC10B")
    @Temporal(TemporalType.DATE)
    private Date dateetatc10b;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeetatc10b")
    private List<Etatc10bCategorie> etatc10bCategorieList;

    public Etatc10b() {
    }

    public Etatc10b(String codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    public String getCodeetatc10b() {
        return codeetatc10b;
    }

    public void setCodeetatc10b(String codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    public Date getDateetatc10b() {
        return dateetatc10b;
    }

    public void setDateetatc10b(Date dateetatc10b) {
        this.dateetatc10b = dateetatc10b;
    }

    public EtatCima getCodeEtatCima() {
        return codeEtatCima;
    }

    public void setCodeEtatCima(EtatCima codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    @XmlTransient
    public List<Etatc10bCategorie> getEtatc10bCategorieList() {
        return etatc10bCategorieList;
    }

    public void setEtatc10bCategorieList(List<Etatc10bCategorie> etatc10bCategorieList) {
        this.etatc10bCategorieList = etatc10bCategorieList;
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
        if (!(object instanceof Etatc10b)) {
            return false;
        }
        Etatc10b other = (Etatc10b) object;
        if ((this.codeetatc10b == null && other.codeetatc10b != null) || (this.codeetatc10b != null && !this.codeetatc10b.equals(other.codeetatc10b))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10b[ codeetatc10b=" + codeetatc10b + " ]";
    }
    
}
