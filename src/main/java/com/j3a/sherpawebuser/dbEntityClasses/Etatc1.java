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
@Table(name = "etatc1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc1.findAll", query = "SELECT e FROM Etatc1 e"),
    @NamedQuery(name = "Etatc1.findByIdetatc1", query = "SELECT e FROM Etatc1 e WHERE e.idetatc1 = :idetatc1"),
    @NamedQuery(name = "Etatc1.findByLibelle", query = "SELECT e FROM Etatc1 e WHERE e.libelle = :libelle"),
    @NamedQuery(name = "Etatc1.findByAnnee", query = "SELECT e FROM Etatc1 e WHERE e.annee = :annee")})
public class Etatc1 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "IDETATC1")
    private String idetatc1;
    @Size(max = 75)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "ANNEE")
    private Short annee;
    @OneToMany(mappedBy = "idetatc1")
    private List<Lgc1credit> lgc1creditList;
    @OneToMany(mappedBy = "idetatc1")
    private List<Lgc1debit> lgc1debitList;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;

    public Etatc1() {
    }

    public Etatc1(String idetatc1) {
        this.idetatc1 = idetatc1;
    }

    public String getIdetatc1() {
        return idetatc1;
    }

    public void setIdetatc1(String idetatc1) {
        this.idetatc1 = idetatc1;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Short getAnnee() {
        return annee;
    }

    public void setAnnee(Short annee) {
        this.annee = annee;
    }

    @XmlTransient
    public List<Lgc1credit> getLgc1creditList() {
        return lgc1creditList;
    }

    public void setLgc1creditList(List<Lgc1credit> lgc1creditList) {
        this.lgc1creditList = lgc1creditList;
    }

    @XmlTransient
    public List<Lgc1debit> getLgc1debitList() {
        return lgc1debitList;
    }

    public void setLgc1debitList(List<Lgc1debit> lgc1debitList) {
        this.lgc1debitList = lgc1debitList;
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
        hash += (idetatc1 != null ? idetatc1.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc1)) {
            return false;
        }
        Etatc1 other = (Etatc1) object;
        if ((this.idetatc1 == null && other.idetatc1 != null) || (this.idetatc1 != null && !this.idetatc1.equals(other.idetatc1))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc1[ idetatc1=" + idetatc1 + " ]";
    }
    
}
