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
@Table(name = "classe_gc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClasseGc.findAll", query = "SELECT c FROM ClasseGc c"),
    @NamedQuery(name = "ClasseGc.findByCodeClasseGc", query = "SELECT c FROM ClasseGc c WHERE c.codeClasseGc = :codeClasseGc"),
    @NamedQuery(name = "ClasseGc.findByLibelleClasseGc", query = "SELECT c FROM ClasseGc c WHERE c.libelleClasseGc = :libelleClasseGc"),
    @NamedQuery(name = "ClasseGc.findByNatureClasseGc", query = "SELECT c FROM ClasseGc c WHERE c.natureClasseGc = :natureClasseGc"),
    @NamedQuery(name = "ClasseGc.findByTarifClasseGc", query = "SELECT c FROM ClasseGc c WHERE c.tarifClasseGc = :tarifClasseGc")})
public class ClasseGc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_CLASSE_GC")
    private String codeClasseGc;
    @Size(max = 60)
    @Column(name = "LIBELLE_CLASSE_GC")
    private String libelleClasseGc;
    @Size(max = 30)
    @Column(name = "NATURE_CLASSE_GC")
    private String natureClasseGc;
    @Size(max = 60)
    @Column(name = "TARIF_CLASSE_GC")
    private String tarifClasseGc;
    @OneToMany(mappedBy = "codeClasseGc")
    private List<GestionConfiee> gestionConfieeList;

    public ClasseGc() {
    }

    public ClasseGc(String codeClasseGc) {
        this.codeClasseGc = codeClasseGc;
    }

    public String getCodeClasseGc() {
        return codeClasseGc;
    }

    public void setCodeClasseGc(String codeClasseGc) {
        this.codeClasseGc = codeClasseGc;
    }

    public String getLibelleClasseGc() {
        return libelleClasseGc;
    }

    public void setLibelleClasseGc(String libelleClasseGc) {
        this.libelleClasseGc = libelleClasseGc;
    }

    public String getNatureClasseGc() {
        return natureClasseGc;
    }

    public void setNatureClasseGc(String natureClasseGc) {
        this.natureClasseGc = natureClasseGc;
    }

    public String getTarifClasseGc() {
        return tarifClasseGc;
    }

    public void setTarifClasseGc(String tarifClasseGc) {
        this.tarifClasseGc = tarifClasseGc;
    }

    @XmlTransient
    public List<GestionConfiee> getGestionConfieeList() {
        return gestionConfieeList;
    }

    public void setGestionConfieeList(List<GestionConfiee> gestionConfieeList) {
        this.gestionConfieeList = gestionConfieeList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeClasseGc != null ? codeClasseGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ClasseGc)) {
            return false;
        }
        ClasseGc other = (ClasseGc) object;
        if ((this.codeClasseGc == null && other.codeClasseGc != null) || (this.codeClasseGc != null && !this.codeClasseGc.equals(other.codeClasseGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ClasseGc[ codeClasseGc=" + codeClasseGc + " ]";
    }
    
}
