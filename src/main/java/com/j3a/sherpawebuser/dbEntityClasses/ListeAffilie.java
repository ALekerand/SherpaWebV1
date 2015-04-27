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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "liste_affilie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeAffilie.findAll", query = "SELECT l FROM ListeAffilie l"),
    @NamedQuery(name = "ListeAffilie.findByCodeListeAffilie", query = "SELECT l FROM ListeAffilie l WHERE l.codeListeAffilie = :codeListeAffilie"),
    @NamedQuery(name = "ListeAffilie.findByLibelleListeAffilie", query = "SELECT l FROM ListeAffilie l WHERE l.libelleListeAffilie = :libelleListeAffilie")})
public class ListeAffilie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "CODE_LISTE_AFFILIE")
    private String codeListeAffilie;
    @Size(max = 60)
    @Column(name = "LIBELLE_LISTE_AFFILIE")
    private String libelleListeAffilie;
    @JoinColumn(name = "CODE_ADHERENT", referencedColumnName = "CODE_ADHERENT")
    @ManyToOne
    private AdherentsSante codeAdherent;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeAffilie")
    private List<AffilieListeAffilie> affilieListeAffilieList;

    public ListeAffilie() {
    }

    public ListeAffilie(String codeListeAffilie) {
        this.codeListeAffilie = codeListeAffilie;
    }

    public String getCodeListeAffilie() {
        return codeListeAffilie;
    }

    public void setCodeListeAffilie(String codeListeAffilie) {
        this.codeListeAffilie = codeListeAffilie;
    }

    public String getLibelleListeAffilie() {
        return libelleListeAffilie;
    }

    public void setLibelleListeAffilie(String libelleListeAffilie) {
        this.libelleListeAffilie = libelleListeAffilie;
    }

    public AdherentsSante getCodeAdherent() {
        return codeAdherent;
    }

    public void setCodeAdherent(AdherentsSante codeAdherent) {
        this.codeAdherent = codeAdherent;
    }

    @XmlTransient
    public List<AffilieListeAffilie> getAffilieListeAffilieList() {
        return affilieListeAffilieList;
    }

    public void setAffilieListeAffilieList(List<AffilieListeAffilie> affilieListeAffilieList) {
        this.affilieListeAffilieList = affilieListeAffilieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeAffilie != null ? codeListeAffilie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeAffilie)) {
            return false;
        }
        ListeAffilie other = (ListeAffilie) object;
        if ((this.codeListeAffilie == null && other.codeListeAffilie != null) || (this.codeListeAffilie != null && !this.codeListeAffilie.equals(other.codeListeAffilie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeAffilie[ codeListeAffilie=" + codeListeAffilie + " ]";
    }
    
}
