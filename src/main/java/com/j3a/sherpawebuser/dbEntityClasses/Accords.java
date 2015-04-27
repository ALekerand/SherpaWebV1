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
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "accords")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accords.findAll", query = "SELECT a FROM Accords a"),
    @NamedQuery(name = "Accords.findByCodeAccord", query = "SELECT a FROM Accords a WHERE a.codeAccord = :codeAccord"),
    @NamedQuery(name = "Accords.findByClausesAccord", query = "SELECT a FROM Accords a WHERE a.clausesAccord = :clausesAccord"),
    @NamedQuery(name = "Accords.findByRefTextAccord", query = "SELECT a FROM Accords a WHERE a.refTextAccord = :refTextAccord"),
    @NamedQuery(name = "Accords.findByNatureAccord", query = "SELECT a FROM Accords a WHERE a.natureAccord = :natureAccord")})
public class Accords implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_ACCORD")
    private String codeAccord;
    @Size(max = 255)
    @Column(name = "CLAUSES_ACCORD")
    private String clausesAccord;
    @Size(max = 255)
    @Column(name = "REF_TEXT_ACCORD")
    private String refTextAccord;
    @Size(max = 100)
    @Column(name = "NATURE_ACCORD")
    private String natureAccord;
    @ManyToMany(mappedBy = "accordsList")
    private List<EtatCima> etatCimaList;

    public Accords() {
    }

    public Accords(String codeAccord) {
        this.codeAccord = codeAccord;
    }

    public String getCodeAccord() {
        return codeAccord;
    }

    public void setCodeAccord(String codeAccord) {
        this.codeAccord = codeAccord;
    }

    public String getClausesAccord() {
        return clausesAccord;
    }

    public void setClausesAccord(String clausesAccord) {
        this.clausesAccord = clausesAccord;
    }

    public String getRefTextAccord() {
        return refTextAccord;
    }

    public void setRefTextAccord(String refTextAccord) {
        this.refTextAccord = refTextAccord;
    }

    public String getNatureAccord() {
        return natureAccord;
    }

    public void setNatureAccord(String natureAccord) {
        this.natureAccord = natureAccord;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeAccord != null ? codeAccord.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accords)) {
            return false;
        }
        Accords other = (Accords) object;
        if ((this.codeAccord == null && other.codeAccord != null) || (this.codeAccord != null && !this.codeAccord.equals(other.codeAccord))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Accords[ codeAccord=" + codeAccord + " ]";
    }
    
}
