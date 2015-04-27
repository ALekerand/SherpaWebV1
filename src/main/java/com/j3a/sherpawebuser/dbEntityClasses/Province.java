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
@Table(name = "province")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Province.findAll", query = "SELECT p FROM Province p"),
    @NamedQuery(name = "Province.findByCodeProvince", query = "SELECT p FROM Province p WHERE p.codeProvince = :codeProvince"),
    @NamedQuery(name = "Province.findByLibelleProvince", query = "SELECT p FROM Province p WHERE p.libelleProvince = :libelleProvince")})
public class Province implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_PROVINCE")
    private String codeProvince;
    @Size(max = 50)
    @Column(name = "LIBELLE_PROVINCE")
    private String libelleProvince;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codeProvince")
    private List<Ville> villeList;
    @JoinColumn(name = "CODE_PAYS", referencedColumnName = "CODE_PAYS")
    @ManyToOne(optional = false)
    private Pays codePays;

    public Province() {
    }

    public Province(String codeProvince) {
        this.codeProvince = codeProvince;
    }

    public String getCodeProvince() {
        return codeProvince;
    }

    public void setCodeProvince(String codeProvince) {
        this.codeProvince = codeProvince;
    }

    public String getLibelleProvince() {
        return libelleProvince;
    }

    public void setLibelleProvince(String libelleProvince) {
        this.libelleProvince = libelleProvince;
    }

    @XmlTransient
    public List<Ville> getVilleList() {
        return villeList;
    }

    public void setVilleList(List<Ville> villeList) {
        this.villeList = villeList;
    }

    public Pays getCodePays() {
        return codePays;
    }

    public void setCodePays(Pays codePays) {
        this.codePays = codePays;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeProvince != null ? codeProvince.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Province)) {
            return false;
        }
        Province other = (Province) object;
        if ((this.codeProvince == null && other.codeProvince != null) || (this.codeProvince != null && !this.codeProvince.equals(other.codeProvince))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Province[ codeProvince=" + codeProvince + " ]";
    }
    
}
