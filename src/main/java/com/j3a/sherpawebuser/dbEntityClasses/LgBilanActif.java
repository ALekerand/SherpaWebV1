/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "lg_bilan_actif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LgBilanActif.findAll", query = "SELECT l FROM LgBilanActif l"),
    @NamedQuery(name = "LgBilanActif.findByIdlgbilactif", query = "SELECT l FROM LgBilanActif l WHERE l.idlgbilactif = :idlgbilactif"),
    @NamedQuery(name = "LgBilanActif.findByLibellelgact", query = "SELECT l FROM LgBilanActif l WHERE l.libellelgact = :libellelgact"),
    @NamedQuery(name = "LgBilanActif.findByMtbrutanact", query = "SELECT l FROM LgBilanActif l WHERE l.mtbrutanact = :mtbrutanact"),
    @NamedQuery(name = "LgBilanActif.findByMtampranact", query = "SELECT l FROM LgBilanActif l WHERE l.mtampranact = :mtampranact"),
    @NamedQuery(name = "LgBilanActif.findByMtnetanact", query = "SELECT l FROM LgBilanActif l WHERE l.mtnetanact = :mtnetanact"),
    @NamedQuery(name = "LgBilanActif.findByMtnetanprcact", query = "SELECT l FROM LgBilanActif l WHERE l.mtnetanprcact = :mtnetanprcact"),
    @NamedQuery(name = "LgBilanActif.findByNumordrlgact", query = "SELECT l FROM LgBilanActif l WHERE l.numordrlgact = :numordrlgact")})
public class LgBilanActif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IDLGBILACTIF")
    private String idlgbilactif;
    @Size(max = 200)
    @Column(name = "LIBELLELGACT")
    private String libellelgact;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MTBRUTANACT")
    private BigDecimal mtbrutanact;
    @Column(name = "MTAMPRANACT")
    private BigDecimal mtampranact;
    @Column(name = "MTNETANACT")
    private BigDecimal mtnetanact;
    @Column(name = "MTNETANPRCACT")
    private BigDecimal mtnetanprcact;
    @Column(name = "NUMORDRLGACT")
    private Integer numordrlgact;
    @JoinColumn(name = "IDBILAN", referencedColumnName = "IDBILAN")
    @ManyToOne
    private Feuillebilan idbilan;

    public LgBilanActif() {
    }

    public LgBilanActif(String idlgbilactif) {
        this.idlgbilactif = idlgbilactif;
    }

    public String getIdlgbilactif() {
        return idlgbilactif;
    }

    public void setIdlgbilactif(String idlgbilactif) {
        this.idlgbilactif = idlgbilactif;
    }

    public String getLibellelgact() {
        return libellelgact;
    }

    public void setLibellelgact(String libellelgact) {
        this.libellelgact = libellelgact;
    }

    public BigDecimal getMtbrutanact() {
        return mtbrutanact;
    }

    public void setMtbrutanact(BigDecimal mtbrutanact) {
        this.mtbrutanact = mtbrutanact;
    }

    public BigDecimal getMtampranact() {
        return mtampranact;
    }

    public void setMtampranact(BigDecimal mtampranact) {
        this.mtampranact = mtampranact;
    }

    public BigDecimal getMtnetanact() {
        return mtnetanact;
    }

    public void setMtnetanact(BigDecimal mtnetanact) {
        this.mtnetanact = mtnetanact;
    }

    public BigDecimal getMtnetanprcact() {
        return mtnetanprcact;
    }

    public void setMtnetanprcact(BigDecimal mtnetanprcact) {
        this.mtnetanprcact = mtnetanprcact;
    }

    public Integer getNumordrlgact() {
        return numordrlgact;
    }

    public void setNumordrlgact(Integer numordrlgact) {
        this.numordrlgact = numordrlgact;
    }

    public Feuillebilan getIdbilan() {
        return idbilan;
    }

    public void setIdbilan(Feuillebilan idbilan) {
        this.idbilan = idbilan;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlgbilactif != null ? idlgbilactif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgBilanActif)) {
            return false;
        }
        LgBilanActif other = (LgBilanActif) object;
        if ((this.idlgbilactif == null && other.idlgbilactif != null) || (this.idlgbilactif != null && !this.idlgbilactif.equals(other.idlgbilactif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.LgBilanActif[ idlgbilactif=" + idlgbilactif + " ]";
    }
    
}
