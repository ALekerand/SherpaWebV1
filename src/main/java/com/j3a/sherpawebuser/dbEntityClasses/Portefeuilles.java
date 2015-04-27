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
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "portefeuilles")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Portefeuilles.findAll", query = "SELECT p FROM Portefeuilles p"),
    @NamedQuery(name = "Portefeuilles.findByCodePortefeilles", query = "SELECT p FROM Portefeuilles p WHERE p.codePortefeilles = :codePortefeilles")})
public class Portefeuilles implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PORTEFEILLES")
    private String codePortefeilles;
    @JoinTable(name = "poertefeil_exercice", joinColumns = {
        @JoinColumn(name = "CODE_PORTEFEILLES", referencedColumnName = "CODE_PORTEFEILLES")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")})
    @ManyToMany
    private List<EtatCima> etatCimaList;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne(optional = false)
    private Exercice codeexercice;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "portefeuilles")
    private Achat achat;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "portefeuilles")
    private Vente vente;

    public Portefeuilles() {
    }

    public Portefeuilles(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    public String getCodePortefeilles() {
        return codePortefeilles;
    }

    public void setCodePortefeilles(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    public Exercice getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(Exercice codeexercice) {
        this.codeexercice = codeexercice;
    }

    public Achat getAchat() {
        return achat;
    }

    public void setAchat(Achat achat) {
        this.achat = achat;
    }

    public Vente getVente() {
        return vente;
    }

    public void setVente(Vente vente) {
        this.vente = vente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePortefeilles != null ? codePortefeilles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Portefeuilles)) {
            return false;
        }
        Portefeuilles other = (Portefeuilles) object;
        if ((this.codePortefeilles == null && other.codePortefeilles != null) || (this.codePortefeilles != null && !this.codePortefeilles.equals(other.codePortefeilles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Portefeuilles[ codePortefeilles=" + codePortefeilles + " ]";
    }
    
}
