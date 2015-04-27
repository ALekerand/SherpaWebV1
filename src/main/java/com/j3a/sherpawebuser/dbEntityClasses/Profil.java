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
@Table(name = "profil")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profil.findAll", query = "SELECT p FROM Profil p"),
    @NamedQuery(name = "Profil.findByCodeProfil", query = "SELECT p FROM Profil p WHERE p.codeProfil = :codeProfil"),
    @NamedQuery(name = "Profil.findByLibelleProfil", query = "SELECT p FROM Profil p WHERE p.libelleProfil = :libelleProfil")})
public class Profil implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_PROFIL")
    private String codeProfil;
    @Size(max = 15)
    @Column(name = "LIBELLE_PROFIL")
    private String libelleProfil;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "profil")
    private List<ProfilUtilisateur> profilUtilisateurList;

    public Profil() {
    }

    public Profil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    public String getCodeProfil() {
        return codeProfil;
    }

    public void setCodeProfil(String codeProfil) {
        this.codeProfil = codeProfil;
    }

    public String getLibelleProfil() {
        return libelleProfil;
    }

    public void setLibelleProfil(String libelleProfil) {
        this.libelleProfil = libelleProfil;
    }

    @XmlTransient
    public List<ProfilUtilisateur> getProfilUtilisateurList() {
        return profilUtilisateurList;
    }

    public void setProfilUtilisateurList(List<ProfilUtilisateur> profilUtilisateurList) {
        this.profilUtilisateurList = profilUtilisateurList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProfil != null ? codeProfil.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profil)) {
            return false;
        }
        Profil other = (Profil) object;
        if ((this.codeProfil == null && other.codeProfil != null) || (this.codeProfil != null && !this.codeProfil.equals(other.codeProfil))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Profil[ codeProfil=" + codeProfil + " ]";
    }
    
}
