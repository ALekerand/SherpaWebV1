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
@Table(name = "feuillebilan")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Feuillebilan.findAll", query = "SELECT f FROM Feuillebilan f"),
    @NamedQuery(name = "Feuillebilan.findByIdbilan", query = "SELECT f FROM Feuillebilan f WHERE f.idbilan = :idbilan"),
    @NamedQuery(name = "Feuillebilan.findByLibelle", query = "SELECT f FROM Feuillebilan f WHERE f.libelle = :libelle"),
    @NamedQuery(name = "Feuillebilan.findByAnnee", query = "SELECT f FROM Feuillebilan f WHERE f.annee = :annee")})
public class Feuillebilan implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IDBILAN")
    private String idbilan;
    @Size(max = 75)
    @Column(name = "LIBELLE")
    private String libelle;
    @Column(name = "ANNEE")
    private Short annee;
    @OneToMany(mappedBy = "idbilan")
    private List<LgBilanActif> lgBilanActifList;
    @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")
    @ManyToOne
    private EtatCima codeEtatCima;
    @OneToMany(mappedBy = "idbilan")
    private List<LgBilanPassif> lgBilanPassifList;

    public Feuillebilan() {
    }

    public Feuillebilan(String idbilan) {
        this.idbilan = idbilan;
    }

    public String getIdbilan() {
        return idbilan;
    }

    public void setIdbilan(String idbilan) {
        this.idbilan = idbilan;
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
    public List<LgBilanActif> getLgBilanActifList() {
        return lgBilanActifList;
    }

    public void setLgBilanActifList(List<LgBilanActif> lgBilanActifList) {
        this.lgBilanActifList = lgBilanActifList;
    }

    public EtatCima getCodeEtatCima() {
        return codeEtatCima;
    }

    public void setCodeEtatCima(EtatCima codeEtatCima) {
        this.codeEtatCima = codeEtatCima;
    }

    @XmlTransient
    public List<LgBilanPassif> getLgBilanPassifList() {
        return lgBilanPassifList;
    }

    public void setLgBilanPassifList(List<LgBilanPassif> lgBilanPassifList) {
        this.lgBilanPassifList = lgBilanPassifList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idbilan != null ? idbilan.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Feuillebilan)) {
            return false;
        }
        Feuillebilan other = (Feuillebilan) object;
        if ((this.idbilan == null && other.idbilan != null) || (this.idbilan != null && !this.idbilan.equals(other.idbilan))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Feuillebilan[ idbilan=" + idbilan + " ]";
    }
    
}
