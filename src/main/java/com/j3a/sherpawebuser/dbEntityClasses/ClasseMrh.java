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
@Table(name = "classe_mrh")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasseMrh.findAll", query = "SELECT c FROM ClasseMrh c"),
    @NamedQuery(name = "ClasseMrh.findByCodeClasseMrh", query = "SELECT c FROM ClasseMrh c WHERE c.codeClasseMrh = :codeClasseMrh"),
    @NamedQuery(name = "ClasseMrh.findByLibelleClasseMrh", query = "SELECT c FROM ClasseMrh c WHERE c.libelleClasseMrh = :libelleClasseMrh"),
    @NamedQuery(name = "ClasseMrh.findByNatureClasseMrh", query = "SELECT c FROM ClasseMrh c WHERE c.natureClasseMrh = :natureClasseMrh"),
    @NamedQuery(name = "ClasseMrh.findByTarifClasseMrh", query = "SELECT c FROM ClasseMrh c WHERE c.tarifClasseMrh = :tarifClasseMrh")})
public class ClasseMrh implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_CLASSE_MRH")
    private String codeClasseMrh;
    @Size(max = 100)
    @Column(name = "LIBELLE_CLASSE_MRH")
    private String libelleClasseMrh;
    @Size(max = 100)
    @Column(name = "NATURE_CLASSE_MRH")
    private String natureClasseMrh;
    @Size(max = 30)
    @Column(name = "TARIF_CLASSE_MRH")
    private String tarifClasseMrh;
    @OneToMany(mappedBy = "codeClasseMrh")
    private List<Habitation> habitationList;

    public ClasseMrh() {
    }

    public ClasseMrh(String codeClasseMrh) {
        this.codeClasseMrh = codeClasseMrh;
    }

    public String getCodeClasseMrh() {
        return codeClasseMrh;
    }

    public void setCodeClasseMrh(String codeClasseMrh) {
        this.codeClasseMrh = codeClasseMrh;
    }

    public String getLibelleClasseMrh() {
        return libelleClasseMrh;
    }

    public void setLibelleClasseMrh(String libelleClasseMrh) {
        this.libelleClasseMrh = libelleClasseMrh;
    }

    public String getNatureClasseMrh() {
        return natureClasseMrh;
    }

    public void setNatureClasseMrh(String natureClasseMrh) {
        this.natureClasseMrh = natureClasseMrh;
    }

    public String getTarifClasseMrh() {
        return tarifClasseMrh;
    }

    public void setTarifClasseMrh(String tarifClasseMrh) {
        this.tarifClasseMrh = tarifClasseMrh;
    }

    @XmlTransient
    public List<Habitation> getHabitationList() {
        return habitationList;
    }

    public void setHabitationList(List<Habitation> habitationList) {
        this.habitationList = habitationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeClasseMrh != null ? codeClasseMrh.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasseMrh)) {
            return false;
        }
        ClasseMrh other = (ClasseMrh) object;
        if ((this.codeClasseMrh == null && other.codeClasseMrh != null) || (this.codeClasseMrh != null && !this.codeClasseMrh.equals(other.codeClasseMrh))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ClasseMrh[ codeClasseMrh=" + codeClasseMrh + " ]";
    }
    
}
