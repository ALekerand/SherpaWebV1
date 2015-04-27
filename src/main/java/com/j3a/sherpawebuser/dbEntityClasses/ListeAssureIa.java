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
@Table(name = "liste_assure_ia")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeAssureIa.findAll", query = "SELECT l FROM ListeAssureIa l"),
    @NamedQuery(name = "ListeAssureIa.findByCodeListeAssureIa", query = "SELECT l FROM ListeAssureIa l WHERE l.codeListeAssureIa = :codeListeAssureIa"),
    @NamedQuery(name = "ListeAssureIa.findByLibelleListeAssureIa", query = "SELECT l FROM ListeAssureIa l WHERE l.libelleListeAssureIa = :libelleListeAssureIa")})
public class ListeAssureIa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_LISTE_ASSURE_IA")
    private String codeListeAssureIa;
    @Size(max = 50)
    @Column(name = "LIBELLE_LISTE_ASSURE_IA")
    private String libelleListeAssureIa;
    @OneToMany(mappedBy = "codeListeAssureIa")
    private List<AssureIa> assureIaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeAssureIa")
    private List<AvListeAssureIa> avListeAssureIaList;

    public ListeAssureIa() {
    }

    public ListeAssureIa(String codeListeAssureIa) {
        this.codeListeAssureIa = codeListeAssureIa;
    }

    public String getCodeListeAssureIa() {
        return codeListeAssureIa;
    }

    public void setCodeListeAssureIa(String codeListeAssureIa) {
        this.codeListeAssureIa = codeListeAssureIa;
    }

    public String getLibelleListeAssureIa() {
        return libelleListeAssureIa;
    }

    public void setLibelleListeAssureIa(String libelleListeAssureIa) {
        this.libelleListeAssureIa = libelleListeAssureIa;
    }

    @XmlTransient
    public List<AssureIa> getAssureIaList() {
        return assureIaList;
    }

    public void setAssureIaList(List<AssureIa> assureIaList) {
        this.assureIaList = assureIaList;
    }

    @XmlTransient
    public List<AvListeAssureIa> getAvListeAssureIaList() {
        return avListeAssureIaList;
    }

    public void setAvListeAssureIaList(List<AvListeAssureIa> avListeAssureIaList) {
        this.avListeAssureIaList = avListeAssureIaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeAssureIa != null ? codeListeAssureIa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeAssureIa)) {
            return false;
        }
        ListeAssureIa other = (ListeAssureIa) object;
        if ((this.codeListeAssureIa == null && other.codeListeAssureIa != null) || (this.codeListeAssureIa != null && !this.codeListeAssureIa.equals(other.codeListeAssureIa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeAssureIa[ codeListeAssureIa=" + codeListeAssureIa + " ]";
    }
    
}
