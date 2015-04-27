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
@Table(name = "liste_gestion_confie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeGestionConfie.findAll", query = "SELECT l FROM ListeGestionConfie l"),
    @NamedQuery(name = "ListeGestionConfie.findByCodeListeGestionConfie", query = "SELECT l FROM ListeGestionConfie l WHERE l.codeListeGestionConfie = :codeListeGestionConfie"),
    @NamedQuery(name = "ListeGestionConfie.findByLibelleListeGestionConfie", query = "SELECT l FROM ListeGestionConfie l WHERE l.libelleListeGestionConfie = :libelleListeGestionConfie")})
public class ListeGestionConfie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_GESTION_CONFIE")
    private String codeListeGestionConfie;
    @Size(max = 60)
    @Column(name = "LIBELLE_LISTE_GESTION_CONFIE")
    private String libelleListeGestionConfie;
    @OneToMany(mappedBy = "codeListeGestionConfie")
    private List<GestionConfiee> gestionConfieeList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeGestionConfie")
    private List<AvenantListeGestionConfie> avenantListeGestionConfieList;

    public ListeGestionConfie() {
    }

    public ListeGestionConfie(String codeListeGestionConfie) {
        this.codeListeGestionConfie = codeListeGestionConfie;
    }

    public String getCodeListeGestionConfie() {
        return codeListeGestionConfie;
    }

    public void setCodeListeGestionConfie(String codeListeGestionConfie) {
        this.codeListeGestionConfie = codeListeGestionConfie;
    }

    public String getLibelleListeGestionConfie() {
        return libelleListeGestionConfie;
    }

    public void setLibelleListeGestionConfie(String libelleListeGestionConfie) {
        this.libelleListeGestionConfie = libelleListeGestionConfie;
    }

    @XmlTransient
    public List<GestionConfiee> getGestionConfieeList() {
        return gestionConfieeList;
    }

    public void setGestionConfieeList(List<GestionConfiee> gestionConfieeList) {
        this.gestionConfieeList = gestionConfieeList;
    }

    @XmlTransient
    public List<AvenantListeGestionConfie> getAvenantListeGestionConfieList() {
        return avenantListeGestionConfieList;
    }

    public void setAvenantListeGestionConfieList(List<AvenantListeGestionConfie> avenantListeGestionConfieList) {
        this.avenantListeGestionConfieList = avenantListeGestionConfieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeGestionConfie != null ? codeListeGestionConfie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeGestionConfie)) {
            return false;
        }
        ListeGestionConfie other = (ListeGestionConfie) object;
        if ((this.codeListeGestionConfie == null && other.codeListeGestionConfie != null) || (this.codeListeGestionConfie != null && !this.codeListeGestionConfie.equals(other.codeListeGestionConfie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeGestionConfie[ codeListeGestionConfie=" + codeListeGestionConfie + " ]";
    }
    
}
