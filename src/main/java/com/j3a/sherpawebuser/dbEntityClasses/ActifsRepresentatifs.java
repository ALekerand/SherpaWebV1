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
@Table(name = "actifs_representatifs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActifsRepresentatifs.findAll", query = "SELECT a FROM ActifsRepresentatifs a"),
    @NamedQuery(name = "ActifsRepresentatifs.findByCodeactifrep", query = "SELECT a FROM ActifsRepresentatifs a WHERE a.codeactifrep = :codeactifrep"),
    @NamedQuery(name = "ActifsRepresentatifs.findByLibelleactifsrepr", query = "SELECT a FROM ActifsRepresentatifs a WHERE a.libelleactifsrepr = :libelleactifsrepr"),
    @NamedQuery(name = "ActifsRepresentatifs.findByNumarticle", query = "SELECT a FROM ActifsRepresentatifs a WHERE a.numarticle = :numarticle")})
public class ActifsRepresentatifs implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEACTIFREP")
    private String codeactifrep;
    @Size(max = 250)
    @Column(name = "LIBELLEACTIFSREPR")
    private String libelleactifsrepr;
    @Size(max = 50)
    @Column(name = "NUMARTICLE")
    private String numarticle;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "actifsRepresentatifs")
    private List<EngagementsActifrep> engagementsActifrepList;

    public ActifsRepresentatifs() {
    }

    public ActifsRepresentatifs(String codeactifrep) {
        this.codeactifrep = codeactifrep;
    }

    public String getCodeactifrep() {
        return codeactifrep;
    }

    public void setCodeactifrep(String codeactifrep) {
        this.codeactifrep = codeactifrep;
    }

    public String getLibelleactifsrepr() {
        return libelleactifsrepr;
    }

    public void setLibelleactifsrepr(String libelleactifsrepr) {
        this.libelleactifsrepr = libelleactifsrepr;
    }

    public String getNumarticle() {
        return numarticle;
    }

    public void setNumarticle(String numarticle) {
        this.numarticle = numarticle;
    }

    @XmlTransient
    public List<EngagementsActifrep> getEngagementsActifrepList() {
        return engagementsActifrepList;
    }

    public void setEngagementsActifrepList(List<EngagementsActifrep> engagementsActifrepList) {
        this.engagementsActifrepList = engagementsActifrepList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeactifrep != null ? codeactifrep.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActifsRepresentatifs)) {
            return false;
        }
        ActifsRepresentatifs other = (ActifsRepresentatifs) object;
        if ((this.codeactifrep == null && other.codeactifrep != null) || (this.codeactifrep != null && !this.codeactifrep.equals(other.codeactifrep))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ActifsRepresentatifs[ codeactifrep=" + codeactifrep + " ]";
    }
    
}
