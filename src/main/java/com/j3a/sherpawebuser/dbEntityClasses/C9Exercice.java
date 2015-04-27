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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "c9_exercice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "C9Exercice.findAll", query = "SELECT c FROM C9Exercice c"),
    @NamedQuery(name = "C9Exercice.findByCodec9categorie", query = "SELECT c FROM C9Exercice c WHERE c.c9ExercicePK.codec9categorie = :codec9categorie"),
    @NamedQuery(name = "C9Exercice.findByCodeexercice", query = "SELECT c FROM C9Exercice c WHERE c.c9ExercicePK.codeexercice = :codeexercice"),
    @NamedQuery(name = "C9Exercice.findByEmissionc9", query = "SELECT c FROM C9Exercice c WHERE c.emissionc9 = :emissionc9"),
    @NamedQuery(name = "C9Exercice.findByAnnulationc9", query = "SELECT c FROM C9Exercice c WHERE c.annulationc9 = :annulationc9"),
    @NamedQuery(name = "C9Exercice.findByEncaissementc9", query = "SELECT c FROM C9Exercice c WHERE c.encaissementc9 = :encaissementc9"),
    @NamedQuery(name = "C9Exercice.findByArrierec9", query = "SELECT c FROM C9Exercice c WHERE c.arrierec9 = :arrierec9")})
public class C9Exercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected C9ExercicePK c9ExercicePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "EMISSIONC9")
    private BigDecimal emissionc9;
    @Column(name = "ANNULATIONC9")
    private BigDecimal annulationc9;
    @Column(name = "ENCAISSEMENTC9")
    private BigDecimal encaissementc9;
    @Column(name = "ARRIEREC9")
    private BigDecimal arrierec9;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exercice exercice;
    @JoinColumn(name = "CODEC9CATEGORIE", referencedColumnName = "CODEC9CATEGORIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etatc9Categorie etatc9Categorie;

    public C9Exercice() {
    }

    public C9Exercice(C9ExercicePK c9ExercicePK) {
        this.c9ExercicePK = c9ExercicePK;
    }

    public C9Exercice(String codec9categorie, int codeexercice) {
        this.c9ExercicePK = new C9ExercicePK(codec9categorie, codeexercice);
    }

    public C9ExercicePK getC9ExercicePK() {
        return c9ExercicePK;
    }

    public void setC9ExercicePK(C9ExercicePK c9ExercicePK) {
        this.c9ExercicePK = c9ExercicePK;
    }

    public BigDecimal getEmissionc9() {
        return emissionc9;
    }

    public void setEmissionc9(BigDecimal emissionc9) {
        this.emissionc9 = emissionc9;
    }

    public BigDecimal getAnnulationc9() {
        return annulationc9;
    }

    public void setAnnulationc9(BigDecimal annulationc9) {
        this.annulationc9 = annulationc9;
    }

    public BigDecimal getEncaissementc9() {
        return encaissementc9;
    }

    public void setEncaissementc9(BigDecimal encaissementc9) {
        this.encaissementc9 = encaissementc9;
    }

    public BigDecimal getArrierec9() {
        return arrierec9;
    }

    public void setArrierec9(BigDecimal arrierec9) {
        this.arrierec9 = arrierec9;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    public Etatc9Categorie getEtatc9Categorie() {
        return etatc9Categorie;
    }

    public void setEtatc9Categorie(Etatc9Categorie etatc9Categorie) {
        this.etatc9Categorie = etatc9Categorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (c9ExercicePK != null ? c9ExercicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof C9Exercice)) {
            return false;
        }
        C9Exercice other = (C9Exercice) object;
        if ((this.c9ExercicePK == null && other.c9ExercicePK != null) || (this.c9ExercicePK != null && !this.c9ExercicePK.equals(other.c9ExercicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.C9Exercice[ c9ExercicePK=" + c9ExercicePK + " ]";
    }
    
}
