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
import javax.persistence.Lob;
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
@Table(name = "garantie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Garantie.findAll", query = "SELECT g FROM Garantie g"),
    @NamedQuery(name = "Garantie.findByCodeGarantie", query = "SELECT g FROM Garantie g WHERE g.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "Garantie.findByLibelleGarantie", query = "SELECT g FROM Garantie g WHERE g.libelleGarantie = :libelleGarantie"),
    @NamedQuery(name = "Garantie.findByCategorieGarantie", query = "SELECT g FROM Garantie g WHERE g.categorieGarantie = :categorieGarantie")})
public class Garantie implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "CODE_GARANTIE")
    private String codeGarantie;
    @Size(max = 100)
    @Column(name = "LIBELLE_GARANTIE")
    private String libelleGarantie;
    @Lob
    @Size(max = 65535)
    @Column(name = "CAPITAL_GARANTIE")
    private String capitalGarantie;
    @Lob
    @Size(max = 65535)
    @Column(name = "FRANCHISE")
    private String franchise;
    @Size(max = 20)
    @Column(name = "CATEGORIE_GARANTIE")
    private String categorieGarantie;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieTransport> garantieGarantieChoisieTransportList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieFormuleGc> garantieFormuleGcList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieSante> garantieGarantieChoisieSanteList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieCorps> garantieGarantieChoisieCorpsList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieIa> garantieGarantieChoisieIaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieNta> garantieGarantieChoisieNtaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieSinistre> garantieSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantie")
    private List<GarantieGarantieChoisie> garantieGarantieChoisieList;
    @JoinColumn(name = "CODE_RISQUE", referencedColumnName = "CODE_RISQUE")
    @ManyToOne
    private Risque codeRisque;

    public Garantie() {
    }

    public Garantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getCodeGarantie() {
        return codeGarantie;
    }

    public void setCodeGarantie(String codeGarantie) {
        this.codeGarantie = codeGarantie;
    }

    public String getLibelleGarantie() {
        return libelleGarantie;
    }

    public void setLibelleGarantie(String libelleGarantie) {
        this.libelleGarantie = libelleGarantie;
    }

    public String getCapitalGarantie() {
        return capitalGarantie;
    }

    public void setCapitalGarantie(String capitalGarantie) {
        this.capitalGarantie = capitalGarantie;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getCategorieGarantie() {
        return categorieGarantie;
    }

    public void setCategorieGarantie(String categorieGarantie) {
        this.categorieGarantie = categorieGarantie;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieTransport> getGarantieGarantieChoisieTransportList() {
        return garantieGarantieChoisieTransportList;
    }

    public void setGarantieGarantieChoisieTransportList(List<GarantieGarantieChoisieTransport> garantieGarantieChoisieTransportList) {
        this.garantieGarantieChoisieTransportList = garantieGarantieChoisieTransportList;
    }

    @XmlTransient
    public List<GarantieFormuleGc> getGarantieFormuleGcList() {
        return garantieFormuleGcList;
    }

    public void setGarantieFormuleGcList(List<GarantieFormuleGc> garantieFormuleGcList) {
        this.garantieFormuleGcList = garantieFormuleGcList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieSante> getGarantieGarantieChoisieSanteList() {
        return garantieGarantieChoisieSanteList;
    }

    public void setGarantieGarantieChoisieSanteList(List<GarantieGarantieChoisieSante> garantieGarantieChoisieSanteList) {
        this.garantieGarantieChoisieSanteList = garantieGarantieChoisieSanteList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieCorps> getGarantieGarantieChoisieCorpsList() {
        return garantieGarantieChoisieCorpsList;
    }

    public void setGarantieGarantieChoisieCorpsList(List<GarantieGarantieChoisieCorps> garantieGarantieChoisieCorpsList) {
        this.garantieGarantieChoisieCorpsList = garantieGarantieChoisieCorpsList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieIa> getGarantieGarantieChoisieIaList() {
        return garantieGarantieChoisieIaList;
    }

    public void setGarantieGarantieChoisieIaList(List<GarantieGarantieChoisieIa> garantieGarantieChoisieIaList) {
        this.garantieGarantieChoisieIaList = garantieGarantieChoisieIaList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieNta> getGarantieGarantieChoisieNtaList() {
        return garantieGarantieChoisieNtaList;
    }

    public void setGarantieGarantieChoisieNtaList(List<GarantieGarantieChoisieNta> garantieGarantieChoisieNtaList) {
        this.garantieGarantieChoisieNtaList = garantieGarantieChoisieNtaList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieMrh> getGarantieGarantieChoisieMrhList() {
        return garantieGarantieChoisieMrhList;
    }

    public void setGarantieGarantieChoisieMrhList(List<GarantieGarantieChoisieMrh> garantieGarantieChoisieMrhList) {
        this.garantieGarantieChoisieMrhList = garantieGarantieChoisieMrhList;
    }

    @XmlTransient
    public List<GarantieSinistre> getGarantieSinistreList() {
        return garantieSinistreList;
    }

    public void setGarantieSinistreList(List<GarantieSinistre> garantieSinistreList) {
        this.garantieSinistreList = garantieSinistreList;
    }

    @XmlTransient
    public List<GarantieGarantieChoisie> getGarantieGarantieChoisieList() {
        return garantieGarantieChoisieList;
    }

    public void setGarantieGarantieChoisieList(List<GarantieGarantieChoisie> garantieGarantieChoisieList) {
        this.garantieGarantieChoisieList = garantieGarantieChoisieList;
    }

    public Risque getCodeRisque() {
        return codeRisque;
    }

    public void setCodeRisque(Risque codeRisque) {
        this.codeRisque = codeRisque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantie != null ? codeGarantie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Garantie)) {
            return false;
        }
        Garantie other = (Garantie) object;
        if ((this.codeGarantie == null && other.codeGarantie != null) || (this.codeGarantie != null && !this.codeGarantie.equals(other.codeGarantie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Garantie[ codeGarantie=" + codeGarantie + " ]";
    }
    
}
