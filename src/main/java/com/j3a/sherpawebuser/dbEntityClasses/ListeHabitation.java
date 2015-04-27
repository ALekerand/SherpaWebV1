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
@Table(name = "liste_habitation")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeHabitation.findAll", query = "SELECT l FROM ListeHabitation l"),
    @NamedQuery(name = "ListeHabitation.findByCodeListeHabitation", query = "SELECT l FROM ListeHabitation l WHERE l.codeListeHabitation = :codeListeHabitation"),
    @NamedQuery(name = "ListeHabitation.findByLibelleListeHabitationMrh", query = "SELECT l FROM ListeHabitation l WHERE l.libelleListeHabitationMrh = :libelleListeHabitationMrh")})
public class ListeHabitation implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_HABITATION")
    private String codeListeHabitation;
    @Size(max = 50)
    @Column(name = "LIBELLE_LISTE_HABITATION_MRH")
    private String libelleListeHabitationMrh;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeHabitation")
    private List<AvListeHabitation> avListeHabitationList;
    @OneToMany(mappedBy = "codeListeHabitation")
    private List<Habitation> habitationList;

    public ListeHabitation() {
    }

    public ListeHabitation(String codeListeHabitation) {
        this.codeListeHabitation = codeListeHabitation;
    }

    public String getCodeListeHabitation() {
        return codeListeHabitation;
    }

    public void setCodeListeHabitation(String codeListeHabitation) {
        this.codeListeHabitation = codeListeHabitation;
    }

    public String getLibelleListeHabitationMrh() {
        return libelleListeHabitationMrh;
    }

    public void setLibelleListeHabitationMrh(String libelleListeHabitationMrh) {
        this.libelleListeHabitationMrh = libelleListeHabitationMrh;
    }

    @XmlTransient
    public List<AvListeHabitation> getAvListeHabitationList() {
        return avListeHabitationList;
    }

    public void setAvListeHabitationList(List<AvListeHabitation> avListeHabitationList) {
        this.avListeHabitationList = avListeHabitationList;
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
        hash += (codeListeHabitation != null ? codeListeHabitation.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeHabitation)) {
            return false;
        }
        ListeHabitation other = (ListeHabitation) object;
        if ((this.codeListeHabitation == null && other.codeListeHabitation != null) || (this.codeListeHabitation != null && !this.codeListeHabitation.equals(other.codeListeHabitation))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeHabitation[ codeListeHabitation=" + codeListeHabitation + " ]";
    }
    
}
