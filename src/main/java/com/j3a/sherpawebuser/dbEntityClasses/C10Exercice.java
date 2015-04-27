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
@Table(name = "c10_exercice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "C10Exercice.findAll", query = "SELECT c FROM C10Exercice c"),
    @NamedQuery(name = "C10Exercice.findByCodeexercice", query = "SELECT c FROM C10Exercice c WHERE c.c10ExercicePK.codeexercice = :codeexercice"),
    @NamedQuery(name = "C10Exercice.findByCodec10bcategorie", query = "SELECT c FROM C10Exercice c WHERE c.c10ExercicePK.codec10bcategorie = :codec10bcategorie"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitresterminesprec", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitresterminesprec = :nbrsinitresterminesprec"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitresreouvert", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitresreouvert = :nbrsinitresreouvert"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitrestermines", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitrestermines = :nbrsinitrestermines"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitresrestantapayer", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitresrestantapayer = :nbrsinitresrestantapayer"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitrestotal", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitrestotal = :nbrsinitrestotal"),
    @NamedQuery(name = "C10Exercice.findByNbrsinitresdeclaresexoecoule", query = "SELECT c FROM C10Exercice c WHERE c.nbrsinitresdeclaresexoecoule = :nbrsinitresdeclaresexoecoule"),
    @NamedQuery(name = "C10Exercice.findBySinistrespaiementexo", query = "SELECT c FROM C10Exercice c WHERE c.sinistrespaiementexo = :sinistrespaiementexo"),
    @NamedQuery(name = "C10Exercice.findBySinistresprovisions31dec", query = "SELECT c FROM C10Exercice c WHERE c.sinistresprovisions31dec = :sinistresprovisions31dec"),
    @NamedQuery(name = "C10Exercice.findBySinistrestotal", query = "SELECT c FROM C10Exercice c WHERE c.sinistrestotal = :sinistrestotal"),
    @NamedQuery(name = "C10Exercice.findBySinistresprovisions31decprec", query = "SELECT c FROM C10Exercice c WHERE c.sinistresprovisions31decprec = :sinistresprovisions31decprec"),
    @NamedQuery(name = "C10Exercice.findByRecoursencaisses", query = "SELECT c FROM C10Exercice c WHERE c.recoursencaisses = :recoursencaisses"),
    @NamedQuery(name = "C10Exercice.findByEstimationrecoursaencaisses", query = "SELECT c FROM C10Exercice c WHERE c.estimationrecoursaencaisses = :estimationrecoursaencaisses"),
    @NamedQuery(name = "C10Exercice.findByRecourstotal", query = "SELECT c FROM C10Exercice c WHERE c.recourstotal = :recourstotal"),
    @NamedQuery(name = "C10Exercice.findByReportestimation31decprecrecours", query = "SELECT c FROM C10Exercice c WHERE c.reportestimation31decprecrecours = :reportestimation31decprecrecours"),
    @NamedQuery(name = "C10Exercice.findByPaiementcumulesexoanterieurs", query = "SELECT c FROM C10Exercice c WHERE c.paiementcumulesexoanterieurs = :paiementcumulesexoanterieurs"),
    @NamedQuery(name = "C10Exercice.findByPaiementscumulestotal", query = "SELECT c FROM C10Exercice c WHERE c.paiementscumulestotal = :paiementscumulestotal"),
    @NamedQuery(name = "C10Exercice.findByCumulrecoursencaisses", query = "SELECT c FROM C10Exercice c WHERE c.cumulrecoursencaisses = :cumulrecoursencaisses"),
    @NamedQuery(name = "C10Exercice.findByChargenetterecours", query = "SELECT c FROM C10Exercice c WHERE c.chargenetterecours = :chargenetterecours"),
    @NamedQuery(name = "C10Exercice.findByCoutmoyennetrecours", query = "SELECT c FROM C10Exercice c WHERE c.coutmoyennetrecours = :coutmoyennetrecours"),
    @NamedQuery(name = "C10Exercice.findByPrimesacquises", query = "SELECT c FROM C10Exercice c WHERE c.primesacquises = :primesacquises"),
    @NamedQuery(name = "C10Exercice.findByRapportsinistresnetsderecoursauxprimes", query = "SELECT c FROM C10Exercice c WHERE c.rapportsinistresnetsderecoursauxprimes = :rapportsinistresnetsderecoursauxprimes")})
public class C10Exercice implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected C10ExercicePK c10ExercicePK;
    @Column(name = "NBRSINITRESTERMINESPREC")
    private Integer nbrsinitresterminesprec;
    @Column(name = "NBRSINITRESREOUVERT")
    private Integer nbrsinitresreouvert;
    @Column(name = "NBRSINITRESTERMINES")
    private Integer nbrsinitrestermines;
    @Column(name = "NBRSINITRESRESTANTAPAYER")
    private Integer nbrsinitresrestantapayer;
    @Column(name = "NBRSINITRESTOTAL")
    private Integer nbrsinitrestotal;
    @Column(name = "NBRSINITRESDECLARESEXOECOULE")
    private Integer nbrsinitresdeclaresexoecoule;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SINISTRESPAIEMENTEXO")
    private BigDecimal sinistrespaiementexo;
    @Column(name = "SINISTRESPROVISIONS31DEC")
    private BigDecimal sinistresprovisions31dec;
    @Column(name = "SINISTRESTOTAL")
    private BigDecimal sinistrestotal;
    @Column(name = "SINISTRESPROVISIONS31DECPREC")
    private BigDecimal sinistresprovisions31decprec;
    @Column(name = "RECOURSENCAISSES")
    private BigDecimal recoursencaisses;
    @Column(name = "ESTIMATIONRECOURSAENCAISSES")
    private BigDecimal estimationrecoursaencaisses;
    @Column(name = "RECOURSTOTAL")
    private BigDecimal recourstotal;
    @Column(name = "REPORTESTIMATION31DECPRECRECOURS")
    private BigDecimal reportestimation31decprecrecours;
    @Column(name = "PAIEMENTCUMULESEXOANTERIEURS")
    private BigDecimal paiementcumulesexoanterieurs;
    @Column(name = "PAIEMENTSCUMULESTOTAL")
    private BigDecimal paiementscumulestotal;
    @Column(name = "CUMULRECOURSENCAISSES")
    private BigDecimal cumulrecoursencaisses;
    @Column(name = "CHARGENETTERECOURS")
    private BigDecimal chargenetterecours;
    @Column(name = "COUTMOYENNETRECOURS")
    private BigDecimal coutmoyennetrecours;
    @Column(name = "PRIMESACQUISES")
    private BigDecimal primesacquises;
    @Column(name = "RAPPORTSINISTRESNETSDERECOURSAUXPRIMES")
    private BigDecimal rapportsinistresnetsderecoursauxprimes;
    @JoinColumn(name = "CODEC10BCATEGORIE", referencedColumnName = "CODEC10BCATEGORIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Etatc10bCategorie etatc10bCategorie;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Exercice exercice;

    public C10Exercice() {
    }

    public C10Exercice(C10ExercicePK c10ExercicePK) {
        this.c10ExercicePK = c10ExercicePK;
    }

    public C10Exercice(int codeexercice, String codec10bcategorie) {
        this.c10ExercicePK = new C10ExercicePK(codeexercice, codec10bcategorie);
    }

    public C10ExercicePK getC10ExercicePK() {
        return c10ExercicePK;
    }

    public void setC10ExercicePK(C10ExercicePK c10ExercicePK) {
        this.c10ExercicePK = c10ExercicePK;
    }

    public Integer getNbrsinitresterminesprec() {
        return nbrsinitresterminesprec;
    }

    public void setNbrsinitresterminesprec(Integer nbrsinitresterminesprec) {
        this.nbrsinitresterminesprec = nbrsinitresterminesprec;
    }

    public Integer getNbrsinitresreouvert() {
        return nbrsinitresreouvert;
    }

    public void setNbrsinitresreouvert(Integer nbrsinitresreouvert) {
        this.nbrsinitresreouvert = nbrsinitresreouvert;
    }

    public Integer getNbrsinitrestermines() {
        return nbrsinitrestermines;
    }

    public void setNbrsinitrestermines(Integer nbrsinitrestermines) {
        this.nbrsinitrestermines = nbrsinitrestermines;
    }

    public Integer getNbrsinitresrestantapayer() {
        return nbrsinitresrestantapayer;
    }

    public void setNbrsinitresrestantapayer(Integer nbrsinitresrestantapayer) {
        this.nbrsinitresrestantapayer = nbrsinitresrestantapayer;
    }

    public Integer getNbrsinitrestotal() {
        return nbrsinitrestotal;
    }

    public void setNbrsinitrestotal(Integer nbrsinitrestotal) {
        this.nbrsinitrestotal = nbrsinitrestotal;
    }

    public Integer getNbrsinitresdeclaresexoecoule() {
        return nbrsinitresdeclaresexoecoule;
    }

    public void setNbrsinitresdeclaresexoecoule(Integer nbrsinitresdeclaresexoecoule) {
        this.nbrsinitresdeclaresexoecoule = nbrsinitresdeclaresexoecoule;
    }

    public BigDecimal getSinistrespaiementexo() {
        return sinistrespaiementexo;
    }

    public void setSinistrespaiementexo(BigDecimal sinistrespaiementexo) {
        this.sinistrespaiementexo = sinistrespaiementexo;
    }

    public BigDecimal getSinistresprovisions31dec() {
        return sinistresprovisions31dec;
    }

    public void setSinistresprovisions31dec(BigDecimal sinistresprovisions31dec) {
        this.sinistresprovisions31dec = sinistresprovisions31dec;
    }

    public BigDecimal getSinistrestotal() {
        return sinistrestotal;
    }

    public void setSinistrestotal(BigDecimal sinistrestotal) {
        this.sinistrestotal = sinistrestotal;
    }

    public BigDecimal getSinistresprovisions31decprec() {
        return sinistresprovisions31decprec;
    }

    public void setSinistresprovisions31decprec(BigDecimal sinistresprovisions31decprec) {
        this.sinistresprovisions31decprec = sinistresprovisions31decprec;
    }

    public BigDecimal getRecoursencaisses() {
        return recoursencaisses;
    }

    public void setRecoursencaisses(BigDecimal recoursencaisses) {
        this.recoursencaisses = recoursencaisses;
    }

    public BigDecimal getEstimationrecoursaencaisses() {
        return estimationrecoursaencaisses;
    }

    public void setEstimationrecoursaencaisses(BigDecimal estimationrecoursaencaisses) {
        this.estimationrecoursaencaisses = estimationrecoursaencaisses;
    }

    public BigDecimal getRecourstotal() {
        return recourstotal;
    }

    public void setRecourstotal(BigDecimal recourstotal) {
        this.recourstotal = recourstotal;
    }

    public BigDecimal getReportestimation31decprecrecours() {
        return reportestimation31decprecrecours;
    }

    public void setReportestimation31decprecrecours(BigDecimal reportestimation31decprecrecours) {
        this.reportestimation31decprecrecours = reportestimation31decprecrecours;
    }

    public BigDecimal getPaiementcumulesexoanterieurs() {
        return paiementcumulesexoanterieurs;
    }

    public void setPaiementcumulesexoanterieurs(BigDecimal paiementcumulesexoanterieurs) {
        this.paiementcumulesexoanterieurs = paiementcumulesexoanterieurs;
    }

    public BigDecimal getPaiementscumulestotal() {
        return paiementscumulestotal;
    }

    public void setPaiementscumulestotal(BigDecimal paiementscumulestotal) {
        this.paiementscumulestotal = paiementscumulestotal;
    }

    public BigDecimal getCumulrecoursencaisses() {
        return cumulrecoursencaisses;
    }

    public void setCumulrecoursencaisses(BigDecimal cumulrecoursencaisses) {
        this.cumulrecoursencaisses = cumulrecoursencaisses;
    }

    public BigDecimal getChargenetterecours() {
        return chargenetterecours;
    }

    public void setChargenetterecours(BigDecimal chargenetterecours) {
        this.chargenetterecours = chargenetterecours;
    }

    public BigDecimal getCoutmoyennetrecours() {
        return coutmoyennetrecours;
    }

    public void setCoutmoyennetrecours(BigDecimal coutmoyennetrecours) {
        this.coutmoyennetrecours = coutmoyennetrecours;
    }

    public BigDecimal getPrimesacquises() {
        return primesacquises;
    }

    public void setPrimesacquises(BigDecimal primesacquises) {
        this.primesacquises = primesacquises;
    }

    public BigDecimal getRapportsinistresnetsderecoursauxprimes() {
        return rapportsinistresnetsderecoursauxprimes;
    }

    public void setRapportsinistresnetsderecoursauxprimes(BigDecimal rapportsinistresnetsderecoursauxprimes) {
        this.rapportsinistresnetsderecoursauxprimes = rapportsinistresnetsderecoursauxprimes;
    }

    public Etatc10bCategorie getEtatc10bCategorie() {
        return etatc10bCategorie;
    }

    public void setEtatc10bCategorie(Etatc10bCategorie etatc10bCategorie) {
        this.etatc10bCategorie = etatc10bCategorie;
    }

    public Exercice getExercice() {
        return exercice;
    }

    public void setExercice(Exercice exercice) {
        this.exercice = exercice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (c10ExercicePK != null ? c10ExercicePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof C10Exercice)) {
            return false;
        }
        C10Exercice other = (C10Exercice) object;
        if ((this.c10ExercicePK == null && other.c10ExercicePK != null) || (this.c10ExercicePK != null && !this.c10ExercicePK.equals(other.c10ExercicePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.C10Exercice[ c10ExercicePK=" + c10ExercicePK + " ]";
    }
    
}
