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
@Table(name = "etatc9")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc9.findAll", query = "SELECT e FROM Etatc9 e"),
    @NamedQuery(name = "Etatc9.findByCodeetatc9", query = "SELECT e FROM Etatc9 e WHERE e.codeetatc9 = :codeetatc9"),
    @NamedQuery(name = "Etatc9.findByDateetatc9", query = "SELECT e FROM Etatc9 e WHERE e.dateetatc9 = :dateetatc9")})
public class Etatc9 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEETATC9")
    private String codeetatc9;
    @Column(name = "DATEETATC9")
    @Temporal(TemporalType.DATE)
    private Date dateetatc9;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeetatc9")
    private List<Etatc9Categorie> etatc9CategorieList;

    public Etatc9() {
    }

    public Etatc9(String codeetatc9) {
        this.codeetatc9 = codeetatc9;
    }

    public String getCodeetatc9() {
        return codeetatc9;
    }

    public void setCodeetatc9(String codeetatc9) {
        this.codeetatc9 = codeetatc9;
    }

    public Date getDateetatc9() {
        return dateetatc9;
    }

    public void setDateetatc9(Date dateetatc9) {
        this.dateetatc9 = dateetatc9;
    }

    public EtatCima getCodeEtatCima() {
        return codeEtatCima;
    }

    public void setCodeEtatCima(EtatCima codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    @XmlTransient
    public List<Etatc9Categorie> getEtatc9CategorieList() {
        return etatc9CategorieList;
    }

    public void setEtatc9CategorieList(List<Etatc9Categorie> etatc9CategorieList) {
        this.etatc9CategorieList = etatc9CategorieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeetatc9 != null ? codeetatc9.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc9)) {
            return false;
        }
        Etatc9 other = (Etatc9) object;
        if ((this.codeetatc9 == null && other.codeetatc9 != null) || (this.codeetatc9 != null && !this.codeetatc9.equals(other.codeetatc9))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc9[ codeetatc9=" + codeetatc9 + " ]";
    }
    
}
