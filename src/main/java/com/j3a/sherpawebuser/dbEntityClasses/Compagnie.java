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
@Table(name = "compagnie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Compagnie.findAll", query = "SELECT c FROM Compagnie c"),
    @NamedQuery(name = "Compagnie.findByCodeCompagnie", query = "SELECT c FROM Compagnie c WHERE c.codeCompagnie = :codeCompagnie"),
    @NamedQuery(name = "Compagnie.findByRaisonSocialCompagnie", query = "SELECT c FROM Compagnie c WHERE c.raisonSocialCompagnie = :raisonSocialCompagnie")})
public class Compagnie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_COMPAGNIE")
    private String codeCompagnie;
    @Size(max = 40)
    @Column(name = "RAISON_SOCIAL_COMPAGNIE")
    private String raisonSocialCompagnie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compagnie")
    private List<CoassuranceCompagnie> coassuranceCompagnieList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "compagnie")
    private List<ReassuranceCompagnie> reassuranceCompagnieList;

    public Compagnie() {
    }

    public Compagnie(String codeCompagnie) {
        this.codeCompagnie = codeCompagnie;
    }

    public String getCodeCompagnie() {
        return codeCompagnie;
    }

    public void setCodeCompagnie(String codeCompagnie) {
        this.codeCompagnie = codeCompagnie;
    }

    public String getRaisonSocialCompagnie() {
        return raisonSocialCompagnie;
    }

    public void setRaisonSocialCompagnie(String raisonSocialCompagnie) {
        this.raisonSocialCompagnie = raisonSocialCompagnie;
    }

    @XmlTransient
    public List<CoassuranceCompagnie> getCoassuranceCompagnieList() {
        return coassuranceCompagnieList;
    }

    public void setCoassuranceCompagnieList(List<CoassuranceCompagnie> coassuranceCompagnieList) {
        this.coassuranceCompagnieList = coassuranceCompagnieList;
    }

    @XmlTransient
    public List<ReassuranceCompagnie> getReassuranceCompagnieList() {
        return reassuranceCompagnieList;
    }

    public void setReassuranceCompagnieList(List<ReassuranceCompagnie> reassuranceCompagnieList) {
        this.reassuranceCompagnieList = reassuranceCompagnieList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeCompagnie != null ? codeCompagnie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Compagnie)) {
            return false;
        }
        Compagnie other = (Compagnie) object;
        if ((this.codeCompagnie == null && other.codeCompagnie != null) || (this.codeCompagnie != null && !this.codeCompagnie.equals(other.codeCompagnie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Compagnie[ codeCompagnie=" + codeCompagnie + " ]";
    }
    
}
