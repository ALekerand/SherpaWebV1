/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "etatc10b_categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etatc10bCategorie.findAll", query = "SELECT e FROM Etatc10bCategorie e"),
    @NamedQuery(name = "Etatc10bCategorie.findByCodec10bcategorie", query = "SELECT e FROM Etatc10bCategorie e WHERE e.codec10bcategorie = :codec10bcategorie"),
    @NamedQuery(name = "Etatc10bCategorie.findByLibelleetatc10cate", query = "SELECT e FROM Etatc10bCategorie e WHERE e.libelleetatc10cate = :libelleetatc10cate"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoA", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoA = :primesacquisesexoA"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoB", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoB = :primesacquisesexoB"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoBbis", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoBbis = :primesacquisesexoBbis"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoC", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoC = :primesacquisesexoC"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoD", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoD = :primesacquisesexoD"),
    @NamedQuery(name = "Etatc10bCategorie.findByPrimesacquisesexoE", query = "SELECT e FROM Etatc10bCategorie e WHERE e.primesacquisesexoE = :primesacquisesexoE"),
    @NamedQuery(name = "Etatc10bCategorie.findByNbrcontrats31decpres", query = "SELECT e FROM Etatc10bCategorie e WHERE e.nbrcontrats31decpres = :nbrcontrats31decpres"),
    @NamedQuery(name = "Etatc10bCategorie.findByNbrcontrats31des", query = "SELECT e FROM Etatc10bCategorie e WHERE e.nbrcontrats31des = :nbrcontrats31des")})
public class Etatc10bCategorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEC10BCATEGORIE")
    private String codec10bcategorie;
    @Size(max = 100)
    @Column(name = "LIBELLEETATC10CATE")
    private String libelleetatc10cate;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIMESACQUISESEXO_A")
    private BigDecimal primesacquisesexoA;
    @Column(name = "PRIMESACQUISESEXO_B")
    private BigDecimal primesacquisesexoB;
    @Column(name = "PRIMESACQUISESEXO_BBIS")
    private BigDecimal primesacquisesexoBbis;
    @Column(name = "PRIMESACQUISESEXO_C")
    private BigDecimal primesacquisesexoC;
    @Column(name = "PRIMESACQUISESEXO_D")
    private BigDecimal primesacquisesexoD;
    @Column(name = "PRIMESACQUISESEXO_E")
    private BigDecimal primesacquisesexoE;
    @Column(name = "NBRCONTRATS31DECPRES")
    private Integer nbrcontrats31decpres;
    @Column(name = "NBRCONTRATS31DES")
    private Integer nbrcontrats31des;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne(optional = false)
    private CategorieCima codecategoriecima;
    @JoinColumn(name = "CODEETATC10B", referencedColumnName = "CODEETATC10B")
    @ManyToOne(optional = false)
    private Etatc10b codeetatc10b;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "etatc10bCategorie")
    private List<C10Exercice> c10ExerciceList;

    public Etatc10bCategorie() {
    }

    public Etatc10bCategorie(String codec10bcategorie) {
        this.codec10bcategorie = codec10bcategorie;
    }

    public String getCodec10bcategorie() {
        return codec10bcategorie;
    }

    public void setCodec10bcategorie(String codec10bcategorie) {
        this.codec10bcategorie = codec10bcategorie;
    }

    public String getLibelleetatc10cate() {
        return libelleetatc10cate;
    }

    public void setLibelleetatc10cate(String libelleetatc10cate) {
        this.libelleetatc10cate = libelleetatc10cate;
    }

    public BigDecimal getPrimesacquisesexoA() {
        return primesacquisesexoA;
    }

    public void setPrimesacquisesexoA(BigDecimal primesacquisesexoA) {
        this.primesacquisesexoA = primesacquisesexoA;
    }

    public BigDecimal getPrimesacquisesexoB() {
        return primesacquisesexoB;
    }

    public void setPrimesacquisesexoB(BigDecimal primesacquisesexoB) {
        this.primesacquisesexoB = primesacquisesexoB;
    }

    public BigDecimal getPrimesacquisesexoBbis() {
        return primesacquisesexoBbis;
    }

    public void setPrimesacquisesexoBbis(BigDecimal primesacquisesexoBbis) {
        this.primesacquisesexoBbis = primesacquisesexoBbis;
    }

    public BigDecimal getPrimesacquisesexoC() {
        return primesacquisesexoC;
    }

    public void setPrimesacquisesexoC(BigDecimal primesacquisesexoC) {
        this.primesacquisesexoC = primesacquisesexoC;
    }

    public BigDecimal getPrimesacquisesexoD() {
        return primesacquisesexoD;
    }

    public void setPrimesacquisesexoD(BigDecimal primesacquisesexoD) {
        this.primesacquisesexoD = primesacquisesexoD;
    }

    public BigDecimal getPrimesacquisesexoE() {
        return primesacquisesexoE;
    }

    public void setPrimesacquisesexoE(BigDecimal primesacquisesexoE) {
        this.primesacquisesexoE = primesacquisesexoE;
    }

    public Integer getNbrcontrats31decpres() {
        return nbrcontrats31decpres;
    }

    public void setNbrcontrats31decpres(Integer nbrcontrats31decpres) {
        this.nbrcontrats31decpres = nbrcontrats31decpres;
    }

    public Integer getNbrcontrats31des() {
        return nbrcontrats31des;
    }

    public void setNbrcontrats31des(Integer nbrcontrats31des) {
        this.nbrcontrats31des = nbrcontrats31des;
    }

    public CategorieCima getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(CategorieCima codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    public Etatc10b getCodeetatc10b() {
        return codeetatc10b;
    }

    public void setCodeetatc10b(Etatc10b codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    @XmlTransient
    public List<C10Exercice> getC10ExerciceList() {
        return c10ExerciceList;
    }

    public void setC10ExerciceList(List<C10Exercice> c10ExerciceList) {
        this.c10ExerciceList = c10ExerciceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codec10bcategorie != null ? codec10bcategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10bCategorie)) {
            return false;
        }
        Etatc10bCategorie other = (Etatc10bCategorie) object;
        if ((this.codec10bcategorie == null && other.codec10bcategorie != null) || (this.codec10bcategorie != null && !this.codec10bcategorie.equals(other.codec10bcategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10bCategorie[ codec10bcategorie=" + codec10bcategorie + " ]";
    }
    
}
