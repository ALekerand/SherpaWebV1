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
@Table(name = "classe_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasseIa.findAll", query = "SELECT c FROM ClasseIa c"),
    @NamedQuery(name = "ClasseIa.findByCodeClasseIa", query = "SELECT c FROM ClasseIa c WHERE c.codeClasseIa = :codeClasseIa"),
    @NamedQuery(name = "ClasseIa.findByLibelleClasseIa", query = "SELECT c FROM ClasseIa c WHERE c.libelleClasseIa = :libelleClasseIa"),
    @NamedQuery(name = "ClasseIa.findByNatureClasseIa", query = "SELECT c FROM ClasseIa c WHERE c.natureClasseIa = :natureClasseIa"),
    @NamedQuery(name = "ClasseIa.findByTarifClasseIa", query = "SELECT c FROM ClasseIa c WHERE c.tarifClasseIa = :tarifClasseIa")})
public class ClasseIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "CODE_CLASSE_IA")
    private String codeClasseIa;
    @Size(max = 100)
    @Column(name = "LIBELLE_CLASSE_IA")
    private String libelleClasseIa;
    @Size(max = 100)
    @Column(name = "NATURE_CLASSE_IA")
    private String natureClasseIa;
    @Size(max = 50)
    @Column(name = "TARIF_CLASSE_IA")
    private String tarifClasseIa;
    @OneToMany(mappedBy = "codeClasseIa")
    private List<AssureIa> assureIaList;

    public ClasseIa() {
    }

    public ClasseIa(String codeClasseIa) {
        this.codeClasseIa = codeClasseIa;
    }

    public String getCodeClasseIa() {
        return codeClasseIa;
    }

    public void setCodeClasseIa(String codeClasseIa) {
        this.codeClasseIa = codeClasseIa;
    }

    public String getLibelleClasseIa() {
        return libelleClasseIa;
    }

    public void setLibelleClasseIa(String libelleClasseIa) {
        this.libelleClasseIa = libelleClasseIa;
    }

    public String getNatureClasseIa() {
        return natureClasseIa;
    }

    public void setNatureClasseIa(String natureClasseIa) {
        this.natureClasseIa = natureClasseIa;
    }

    public String getTarifClasseIa() {
        return tarifClasseIa;
    }

    public void setTarifClasseIa(String tarifClasseIa) {
        this.tarifClasseIa = tarifClasseIa;
    }

    @XmlTransient
    public List<AssureIa> getAssureIaList() {
        return assureIaList;
    }

    public void setAssureIaList(List<AssureIa> assureIaList) {
        this.assureIaList = assureIaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeClasseIa != null ? codeClasseIa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasseIa)) {
            return false;
        }
        ClasseIa other = (ClasseIa) object;
        if ((this.codeClasseIa == null && other.codeClasseIa != null) || (this.codeClasseIa != null && !this.codeClasseIa.equals(other.codeClasseIa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ClasseIa[ codeClasseIa=" + codeClasseIa + " ]";
    }
    
}
