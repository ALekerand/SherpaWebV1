/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "etatc10taba_exercice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10tabaExercice.findAll", query = "SELECT e FROM Etatc10tabaExercice e"),
    @NamedQuery(name = "Etatc10tabaExercice.findByCodeetatc10", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.etatc10tabaExercicePK.codeetatc10 = :codeetatc10"),
    @NamedQuery(name = "Etatc10tabaExercice.findByCodeexercice", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.etatc10tabaExercicePK.codeexercice = :codeexercice"),
    @NamedQuery(name = "Etatc10tabaExercice.findByReglementexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.reglementexo = :reglementexo"),
    @NamedQuery(name = "Etatc10tabaExercice.findByProvisionexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.provisionexo = :provisionexo"),
    @NamedQuery(name = "Etatc10tabaExercice.findByTotalsinistreexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.totalsinistreexo = :totalsinistreexo"),
    @NamedQuery(name = "Etatc10tabaExercice.findByPrimeacquiseexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.primeacquiseexo = :primeacquiseexo"),
    @NamedQuery(name = "Etatc10tabaExercice.findBySinistresurprimeacquisepourcenexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.sinistresurprimeacquisepourcenexo = :sinistresurprimeacquisepourcenexo"),
    @NamedQuery(name = "Etatc10tabaExercice.findByLibelleexo", query = "SELECT e FROM Etatc10tabaExercice e WHERE e.libelleexo = :libelleexo")})
public class Etatc10tabaExercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Etatc10tabaExercicePK etatc10tabaExercicePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REGLEMENTEXO")
    private BigDecimal reglementexo;
    @Column(name = "PROVISIONEXO")
    private BigDecimal provisionexo;
    @Column(name = "TOTALSINISTREEXO")
    private BigDecimal totalsinistreexo;
    @Column(name = "PRIMEACQUISEEXO")
    private BigDecimal primeacquiseexo;
    @Column(name = "SINISTRESURPRIMEACQUISEPOURCENEXO")
    private BigDecimal sinistresurprimeacquisepourcenexo;
    @Size(max = 10)
    @Column(name = "LIBELLEEXO")
    private String libelleexo;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exercice exercice;
    @JoinColumn(name = "CODEETATC10", referencedColumnName = "CODEETATC10", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etatc10TabA etatc10TabA;

    public Etatc10tabaExercice() {
    }

    public Etatc10tabaExercice(Etatc10tabaExercicePK etatc10tabaExercicePK) {
        this.etatc10tabaExercicePK = etatc10tabaExercicePK;
    }

    public Etatc10tabaExercice(String codeetatc10, int codeexercice) {
        this.etatc10tabaExercicePK = new Etatc10tabaExercicePK(codeetatc10, codeexercice);
    }

    public Etatc10tabaExercicePK getEtatc10tabaExercicePK() {
        return etatc10tabaExercicePK;
    }

    public void setEtatc10tabaExercicePK(Etatc10tabaExercicePK etatc10tabaExercicePK) {
        this.etatc10tabaExercicePK = etatc10tabaExercicePK;
    }

    public BigDecimal getReglementexo() {
        return reglementexo;
    }

    public void setReglementexo(BigDecimal reglementexo) {
        this.reglementexo = reglementexo;
    }

    public BigDecimal getProvisionexo() {
        return provisionexo;
    }

    public void setProvisionexo(BigDecimal provisionexo) {
        this.provisionexo = provisionexo;
    }

    public BigDecimal getTotalsinistreexo() {
        return totalsinistreexo;
    }

    public void setTotalsinistreexo(BigDecimal totalsinistreexo) {
        this.totalsinistreexo = totalsinistreexo;
    }

    public BigDecimal getPrimeacquiseexo() {
        return primeacquiseexo;
    }

    public void setPrimeacquiseexo(BigDecimal primeacquiseexo) {
        this.primeacquiseexo = primeacquiseexo;
    }

    public BigDecimal getSinistresurprimeacquisepourcenexo() {
        return sinistresurprimeacquisepourcenexo;
    }

    public void setSinistresurprimeacquisepourcenexo(BigDecimal sinistresurprimeacquisepourcenexo) {
        this.sinistresurprimeacquisepourcenexo = sinistresurprimeacquisepourcenexo;
    }

    public String getLibelleexo() {
        return libelleexo;
    }

    public void setLibelleexo(String libelleexo) {
        this.libelleexo = libelleexo;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    public Etatc10TabA getEtatc10TabA() {
        return etatc10TabA;
    }

    public void setEtatc10TabA(Etatc10TabA etatc10TabA) {
        this.etatc10TabA = etatc10TabA;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etatc10tabaExercicePK != null ? etatc10tabaExercicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10tabaExercice)) {
            return false;
        }
        Etatc10tabaExercice other = (Etatc10tabaExercice) object;
        if ((this.etatc10tabaExercicePK == null && other.etatc10tabaExercicePK != null) || (this.etatc10tabaExercicePK != null && !this.etatc10tabaExercicePK.equals(other.etatc10tabaExercicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabaExercice[ etatc10tabaExercicePK=" + etatc10tabaExercicePK + " ]";
    }
    
}
