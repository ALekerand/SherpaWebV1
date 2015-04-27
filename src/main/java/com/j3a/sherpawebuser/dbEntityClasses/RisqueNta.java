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
@Table(name = "risque_nta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RisqueNta.findAll", query = "SELECT r FROM RisqueNta r"),
    @NamedQuery(name = "RisqueNta.findByCodeRisquenta", query = "SELECT r FROM RisqueNta r WHERE r.codeRisquenta = :codeRisquenta"),
    @NamedQuery(name = "RisqueNta.findByLibelleRisquenta", query = "SELECT r FROM RisqueNta r WHERE r.libelleRisquenta = :libelleRisquenta")})
public class RisqueNta implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_RISQUENTA")
    private String codeRisquenta;
    @Size(max = 30)
    @Column(name = "LIBELLE_RISQUENTA")
    private String libelleRisquenta;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "risqueNta")
    private List<AvenantRisqueNta> avenantRisqueNtaList;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE")
    @ManyToOne
    private Categorie codeCategorie;
    @OneToMany(mappedBy = "codeRisquenta")
    private List<GarantieChoisieNta> garantieChoisieNtaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "risqueNta")
    private List<ApporteurNta> apporteurNtaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "risqueNta")
    private List<RisqueNtaSinistre> risqueNtaSinistreList;

    public RisqueNta() {
    }

    public RisqueNta(String codeRisquenta) {
        this.codeRisquenta = codeRisquenta;
    }

    public String getCodeRisquenta() {
        return codeRisquenta;
    }

    public void setCodeRisquenta(String codeRisquenta) {
        this.codeRisquenta = codeRisquenta;
    }

    public String getLibelleRisquenta() {
        return libelleRisquenta;
    }

    public void setLibelleRisquenta(String libelleRisquenta) {
        this.libelleRisquenta = libelleRisquenta;
    }

    @XmlTransient
    public List<AvenantRisqueNta> getAvenantRisqueNtaList() {
        return avenantRisqueNtaList;
    }

    public void setAvenantRisqueNtaList(List<AvenantRisqueNta> avenantRisqueNtaList) {
        this.avenantRisqueNtaList = avenantRisqueNtaList;
    }

    public Categorie getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(Categorie codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @XmlTransient
    public List<GarantieChoisieNta> getGarantieChoisieNtaList() {
        return garantieChoisieNtaList;
    }

    public void setGarantieChoisieNtaList(List<GarantieChoisieNta> garantieChoisieNtaList) {
        this.garantieChoisieNtaList = garantieChoisieNtaList;
    }

    @XmlTransient
    public List<ApporteurNta> getApporteurNtaList() {
        return apporteurNtaList;
    }

    public void setApporteurNtaList(List<ApporteurNta> apporteurNtaList) {
        this.apporteurNtaList = apporteurNtaList;
    }

    @XmlTransient
    public List<RisqueNtaSinistre> getRisqueNtaSinistreList() {
        return risqueNtaSinistreList;
    }

    public void setRisqueNtaSinistreList(List<RisqueNtaSinistre> risqueNtaSinistreList) {
        this.risqueNtaSinistreList = risqueNtaSinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeRisquenta != null ? codeRisquenta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisqueNta)) {
            return false;
        }
        RisqueNta other = (RisqueNta) object;
        if ((this.codeRisquenta == null && other.codeRisquenta != null) || (this.codeRisquenta != null && !this.codeRisquenta.equals(other.codeRisquenta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.RisqueNta[ codeRisquenta=" + codeRisquenta + " ]";
    }
    
}
