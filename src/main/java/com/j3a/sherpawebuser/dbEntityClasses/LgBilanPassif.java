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
@Table(name = "lg_bilan_passif")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LgBilanPassif.findAll", query = "SELECT l FROM LgBilanPassif l"),
    @NamedQuery(name = "LgBilanPassif.findByIdlgbilpassif", query = "SELECT l FROM LgBilanPassif l WHERE l.idlgbilpassif = :idlgbilpassif"),
    @NamedQuery(name = "LgBilanPassif.findByLibellelgpas", query = "SELECT l FROM LgBilanPassif l WHERE l.libellelgpas = :libellelgpas"),
    @NamedQuery(name = "LgBilanPassif.findByMtbrutanpas", query = "SELECT l FROM LgBilanPassif l WHERE l.mtbrutanpas = :mtbrutanpas"),
    @NamedQuery(name = "LgBilanPassif.findByMtampranpas", query = "SELECT l FROM LgBilanPassif l WHERE l.mtampranpas = :mtampranpas"),
    @NamedQuery(name = "LgBilanPassif.findByMtnetanpas", query = "SELECT l FROM LgBilanPassif l WHERE l.mtnetanpas = :mtnetanpas"),
    @NamedQuery(name = "LgBilanPassif.findByMtnetanprcpas", query = "SELECT l FROM LgBilanPassif l WHERE l.mtnetanprcpas = :mtnetanprcpas"),
    @NamedQuery(name = "LgBilanPassif.findByNumordrlgpass", query = "SELECT l FROM LgBilanPassif l WHERE l.numordrlgpass = :numordrlgpass")})
public class LgBilanPassif implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "IDLGBILPASSIF")
    private String idlgbilpassif;
    @Size(max = 200)
    @Column(name = "LIBELLELGPAS")
    private String libellelgpas;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MTBRUTANPAS")
    private BigDecimal mtbrutanpas;
    @Column(name = "MTAMPRANPAS")
    private BigDecimal mtampranpas;
    @Column(name = "MTNETANPAS")
    private BigDecimal mtnetanpas;
    @Column(name = "MTNETANPRCPAS")
    private BigDecimal mtnetanprcpas;
    @Column(name = "NUMORDRLGPASS")
    private Integer numordrlgpass;
    @JoinColumn(name = "IDBILAN", referencedColumnName = "IDBILAN")
    @ManyToOne
    private Feuillebilan idbilan;

    public LgBilanPassif() {
    }

    public LgBilanPassif(String idlgbilpassif) {
        this.idlgbilpassif = idlgbilpassif;
    }

    public String getIdlgbilpassif() {
        return idlgbilpassif;
    }

    public void setIdlgbilpassif(String idlgbilpassif) {
        this.idlgbilpassif = idlgbilpassif;
    }

    public String getLibellelgpas() {
        return libellelgpas;
    }

    public void setLibellelgpas(String libellelgpas) {
        this.libellelgpas = libellelgpas;
    }

    public BigDecimal getMtbrutanpas() {
        return mtbrutanpas;
    }

    public void setMtbrutanpas(BigDecimal mtbrutanpas) {
        this.mtbrutanpas = mtbrutanpas;
    }

    public BigDecimal getMtampranpas() {
        return mtampranpas;
    }

    public void setMtampranpas(BigDecimal mtampranpas) {
        this.mtampranpas = mtampranpas;
    }

    public BigDecimal getMtnetanpas() {
        return mtnetanpas;
    }

    public void setMtnetanpas(BigDecimal mtnetanpas) {
        this.mtnetanpas = mtnetanpas;
    }

    public BigDecimal getMtnetanprcpas() {
        return mtnetanprcpas;
    }

    public void setMtnetanprcpas(BigDecimal mtnetanprcpas) {
        this.mtnetanprcpas = mtnetanprcpas;
    }

    public Integer getNumordrlgpass() {
        return numordrlgpass;
    }

    public void setNumordrlgpass(Integer numordrlgpass) {
        this.numordrlgpass = numordrlgpass;
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
        hash += (idlgbilpassif != null ? idlgbilpassif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LgBilanPassif)) {
            return false;
        }
        LgBilanPassif other = (LgBilanPassif) object;
        if ((this.idlgbilpassif == null && other.idlgbilpassif != null) || (this.idlgbilpassif != null && !this.idlgbilpassif.equals(other.idlgbilpassif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.LgBilanPassif[ idlgbilpassif=" + idlgbilpassif + " ]";
    }
    
}
