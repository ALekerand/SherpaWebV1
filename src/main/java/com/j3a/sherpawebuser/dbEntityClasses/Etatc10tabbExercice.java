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
@Table(name = "etatc10tabb_exercice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10tabbExercice.findAll", query = "SELECT e FROM Etatc10tabbExercice e"),
    @NamedQuery(name = "Etatc10tabbExercice.findByCodeexercice", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.etatc10tabbExercicePK.codeexercice = :codeexercice"),
    @NamedQuery(name = "Etatc10tabbExercice.findByCodeetatc10b", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.etatc10tabbExercicePK.codeetatc10b = :codeetatc10b"),
    @NamedQuery(name = "Etatc10tabbExercice.findByRegelement", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.regelement = :regelement"),
    @NamedQuery(name = "Etatc10tabbExercice.findByProvisions", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.provisions = :provisions"),
    @NamedQuery(name = "Etatc10tabbExercice.findByTotalbrutsinistre", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.totalbrutsinistre = :totalbrutsinistre"),
    @NamedQuery(name = "Etatc10tabbExercice.findByRecoursencaisse", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.recoursencaisse = :recoursencaisse"),
    @NamedQuery(name = "Etatc10tabbExercice.findByRecoursaencaisse", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.recoursaencaisse = :recoursaencaisse"),
    @NamedQuery(name = "Etatc10tabbExercice.findByTotalrecours", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.totalrecours = :totalrecours"),
    @NamedQuery(name = "Etatc10tabbExercice.findByTotalnetsinistre", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.totalnetsinistre = :totalnetsinistre"),
    @NamedQuery(name = "Etatc10tabbExercice.findByPrimeacquise", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.primeacquise = :primeacquise"),
    @NamedQuery(name = "Etatc10tabbExercice.findByRapportsinistreprimes", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.rapportsinistreprimes = :rapportsinistreprimes"),
    @NamedQuery(name = "Etatc10tabbExercice.findByLibelleexo", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.libelleexo = :libelleexo"),
    @NamedQuery(name = "Etatc10tabbExercice.findByVerif", query = "SELECT e FROM Etatc10tabbExercice e WHERE e.verif = :verif")})
public class Etatc10tabbExercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected Etatc10tabbExercicePK etatc10tabbExercicePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "REGELEMENT")
    private BigDecimal regelement;
    @Column(name = "PROVISIONS")
    private BigDecimal provisions;
    @Column(name = "TOTALBRUTSINISTRE")
    private BigDecimal totalbrutsinistre;
    @Column(name = "RECOURSENCAISSE")
    private BigDecimal recoursencaisse;
    @Column(name = "RECOURSAENCAISSE")
    private BigDecimal recoursaencaisse;
    @Column(name = "TOTALRECOURS")
    private BigDecimal totalrecours;
    @Column(name = "TOTALNETSINISTRE")
    private BigDecimal totalnetsinistre;
    @Column(name = "PRIMEACQUISE")
    private BigDecimal primeacquise;
    @Column(name = "RAPPORTSINISTREPRIMES")
    private BigDecimal rapportsinistreprimes;
    @Size(max = 10)
    @Column(name = "LIBELLEEXO")
    private String libelleexo;
    @Column(name = "VERIF")
    private Character verif;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exercice exercice;
    @JoinColumn(name = "CODEETATC10B", referencedColumnName = "CODEETATC10B", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etatc10TabB etatc10TabB;

    public Etatc10tabbExercice() {
    }

    public Etatc10tabbExercice(Etatc10tabbExercicePK etatc10tabbExercicePK) {
        this.etatc10tabbExercicePK = etatc10tabbExercicePK;
    }

    public Etatc10tabbExercice(int codeexercice, String codeetatc10b) {
        this.etatc10tabbExercicePK = new Etatc10tabbExercicePK(codeexercice, codeetatc10b);
    }

    public Etatc10tabbExercicePK getEtatc10tabbExercicePK() {
        return etatc10tabbExercicePK;
    }

    public void setEtatc10tabbExercicePK(Etatc10tabbExercicePK etatc10tabbExercicePK) {
        this.etatc10tabbExercicePK = etatc10tabbExercicePK;
    }

    public BigDecimal getRegelement() {
        return regelement;
    }

    public void setRegelement(BigDecimal regelement) {
        this.regelement = regelement;
    }

    public BigDecimal getProvisions() {
        return provisions;
    }

    public void setProvisions(BigDecimal provisions) {
        this.provisions = provisions;
    }

    public BigDecimal getTotalbrutsinistre() {
        return totalbrutsinistre;
    }

    public void setTotalbrutsinistre(BigDecimal totalbrutsinistre) {
        this.totalbrutsinistre = totalbrutsinistre;
    }

    public BigDecimal getRecoursencaisse() {
        return recoursencaisse;
    }

    public void setRecoursencaisse(BigDecimal recoursencaisse) {
        this.recoursencaisse = recoursencaisse;
    }

    public BigDecimal getRecoursaencaisse() {
        return recoursaencaisse;
    }

    public void setRecoursaencaisse(BigDecimal recoursaencaisse) {
        this.recoursaencaisse = recoursaencaisse;
    }

    public BigDecimal getTotalrecours() {
        return totalrecours;
    }

    public void setTotalrecours(BigDecimal totalrecours) {
        this.totalrecours = totalrecours;
    }

    public BigDecimal getTotalnetsinistre() {
        return totalnetsinistre;
    }

    public void setTotalnetsinistre(BigDecimal totalnetsinistre) {
        this.totalnetsinistre = totalnetsinistre;
    }

    public BigDecimal getPrimeacquise() {
        return primeacquise;
    }

    public void setPrimeacquise(BigDecimal primeacquise) {
        this.primeacquise = primeacquise;
    }

    public BigDecimal getRapportsinistreprimes() {
        return rapportsinistreprimes;
    }

    public void setRapportsinistreprimes(BigDecimal rapportsinistreprimes) {
        this.rapportsinistreprimes = rapportsinistreprimes;
    }

    public String getLibelleexo() {
        return libelleexo;
    }

    public void setLibelleexo(String libelleexo) {
        this.libelleexo = libelleexo;
    }

    public Character getVerif() {
        return verif;
    }

    public void setVerif(Character verif) {
        this.verif = verif;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    public Etatc10TabB getEtatc10TabB() {
        return etatc10TabB;
    }

    public void setEtatc10TabB(Etatc10TabB etatc10TabB) {
        this.etatc10TabB = etatc10TabB;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etatc10tabbExercicePK != null ? etatc10tabbExercicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10tabbExercice)) {
            return false;
        }
        Etatc10tabbExercice other = (Etatc10tabbExercice) object;
        if ((this.etatc10tabbExercicePK == null && other.etatc10tabbExercicePK != null) || (this.etatc10tabbExercicePK != null && !this.etatc10tabbExercicePK.equals(other.etatc10tabbExercicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabbExercice[ etatc10tabbExercicePK=" + etatc10tabbExercicePK + " ]";
    }
    
}
