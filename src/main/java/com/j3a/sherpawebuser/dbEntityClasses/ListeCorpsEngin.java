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
@Table(name = "liste_corps_engin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeCorpsEngin.findAll", query = "SELECT l FROM ListeCorpsEngin l"),
    @NamedQuery(name = "ListeCorpsEngin.findByCodeListeCorpsEngin", query = "SELECT l FROM ListeCorpsEngin l WHERE l.codeListeCorpsEngin = :codeListeCorpsEngin"),
    @NamedQuery(name = "ListeCorpsEngin.findByLibelleListeCorpsEngin", query = "SELECT l FROM ListeCorpsEngin l WHERE l.libelleListeCorpsEngin = :libelleListeCorpsEngin")})
public class ListeCorpsEngin implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_CORPS_ENGIN")
    private String codeListeCorpsEngin;
    @Size(max = 50)
    @Column(name = "LIBELLE_LISTE_CORPS_ENGIN")
    private String libelleListeCorpsEngin;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeCorpsEngin")
    private List<AvListeCorpsEngin> avListeCorpsEnginList;
    @OneToMany(mappedBy = "codeListeCorpsEngin")
    private List<CorpsEngin> corpsEnginList;

    public ListeCorpsEngin() {
    }

    public ListeCorpsEngin(String codeListeCorpsEngin) {
        this.codeListeCorpsEngin = codeListeCorpsEngin;
    }

    public String getCodeListeCorpsEngin() {
        return codeListeCorpsEngin;
    }

    public void setCodeListeCorpsEngin(String codeListeCorpsEngin) {
        this.codeListeCorpsEngin = codeListeCorpsEngin;
    }

    public String getLibelleListeCorpsEngin() {
        return libelleListeCorpsEngin;
    }

    public void setLibelleListeCorpsEngin(String libelleListeCorpsEngin) {
        this.libelleListeCorpsEngin = libelleListeCorpsEngin;
    }

    @XmlTransient
    public List<AvListeCorpsEngin> getAvListeCorpsEnginList() {
        return avListeCorpsEnginList;
    }

    public void setAvListeCorpsEnginList(List<AvListeCorpsEngin> avListeCorpsEnginList) {
        this.avListeCorpsEnginList = avListeCorpsEnginList;
    }

    @XmlTransient
    public List<CorpsEngin> getCorpsEnginList() {
        return corpsEnginList;
    }

    public void setCorpsEnginList(List<CorpsEngin> corpsEnginList) {
        this.corpsEnginList = corpsEnginList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeCorpsEngin != null ? codeListeCorpsEngin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeCorpsEngin)) {
            return false;
        }
        ListeCorpsEngin other = (ListeCorpsEngin) object;
        if ((this.codeListeCorpsEngin == null && other.codeListeCorpsEngin != null) || (this.codeListeCorpsEngin != null && !this.codeListeCorpsEngin.equals(other.codeListeCorpsEngin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeCorpsEngin[ codeListeCorpsEngin=" + codeListeCorpsEngin + " ]";
    }
    
}
