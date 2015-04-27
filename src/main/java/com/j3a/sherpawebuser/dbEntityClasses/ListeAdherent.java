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
@Table(name = "liste_adherent")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeAdherent.findAll", query = "SELECT l FROM ListeAdherent l"),
    @NamedQuery(name = "ListeAdherent.findByCodeListeAdherent", query = "SELECT l FROM ListeAdherent l WHERE l.codeListeAdherent = :codeListeAdherent"),
    @NamedQuery(name = "ListeAdherent.findByLibelleListeAdherent", query = "SELECT l FROM ListeAdherent l WHERE l.libelleListeAdherent = :libelleListeAdherent")})
public class ListeAdherent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_ADHERENT")
    private String codeListeAdherent;
    @Size(max = 60)
    @Column(name = "LIBELLE_LISTE_ADHERENT")
    private String libelleListeAdherent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeAdherent")
    private List<AvListeAdherent> avListeAdherentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeAdherent")
    private List<ListeAdherentSante> listeAdherentSanteList;

    public ListeAdherent() {
    }

    public ListeAdherent(String codeListeAdherent) {
        this.codeListeAdherent = codeListeAdherent;
    }

    public String getCodeListeAdherent() {
        return codeListeAdherent;
    }

    public void setCodeListeAdherent(String codeListeAdherent) {
        this.codeListeAdherent = codeListeAdherent;
    }

    public String getLibelleListeAdherent() {
        return libelleListeAdherent;
    }

    public void setLibelleListeAdherent(String libelleListeAdherent) {
        this.libelleListeAdherent = libelleListeAdherent;
    }

    @XmlTransient
    public List<AvListeAdherent> getAvListeAdherentList() {
        return avListeAdherentList;
    }

    public void setAvListeAdherentList(List<AvListeAdherent> avListeAdherentList) {
        this.avListeAdherentList = avListeAdherentList;
    }

    @XmlTransient
    public List<ListeAdherentSante> getListeAdherentSanteList() {
        return listeAdherentSanteList;
    }

    public void setListeAdherentSanteList(List<ListeAdherentSante> listeAdherentSanteList) {
        this.listeAdherentSanteList = listeAdherentSanteList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeAdherent != null ? codeListeAdherent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeAdherent)) {
            return false;
        }
        ListeAdherent other = (ListeAdherent) object;
        if ((this.codeListeAdherent == null && other.codeListeAdherent != null) || (this.codeListeAdherent != null && !this.codeListeAdherent.equals(other.codeListeAdherent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeAdherent[ codeListeAdherent=" + codeListeAdherent + " ]";
    }
    
}
