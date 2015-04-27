/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "point_vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PointVente.findAll", query = "SELECT p FROM PointVente p"),
    @NamedQuery(name = "PointVente.findByCodePointVente", query = "SELECT p FROM PointVente p WHERE p.codePointVente = :codePointVente"),
    @NamedQuery(name = "PointVente.findByLibellePointVente", query = "SELECT p FROM PointVente p WHERE p.libellePointVente = :libellePointVente"),
    @NamedQuery(name = "PointVente.findByAdressePointVente", query = "SELECT p FROM PointVente p WHERE p.adressePointVente = :adressePointVente"),
    @NamedQuery(name = "PointVente.findByTelFixePointVente", query = "SELECT p FROM PointVente p WHERE p.telFixePointVente = :telFixePointVente"),
    @NamedQuery(name = "PointVente.findByTelFaxPointVente", query = "SELECT p FROM PointVente p WHERE p.telFaxPointVente = :telFaxPointVente"),
    @NamedQuery(name = "PointVente.findByLatitude", query = "SELECT p FROM PointVente p WHERE p.latitude = :latitude"),
    @NamedQuery(name = "PointVente.findByLongitude", query = "SELECT p FROM PointVente p WHERE p.longitude = :longitude")})
public class PointVente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_POINT_VENTE")
    private String codePointVente;
    @Size(max = 20)
    @Column(name = "LIBELLE_POINT_VENTE")
    private String libellePointVente;
    @Size(max = 60)
    @Column(name = "ADRESSE_POINT_VENTE")
    private String adressePointVente;
    @Size(max = 14)
    @Column(name = "TEL_FIXE_POINT_VENTE")
    private String telFixePointVente;
    @Size(max = 14)
    @Column(name = "TEL_FAX_POINT_VENTE")
    private String telFaxPointVente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "LATITUDE")
    private BigDecimal latitude;
    @Column(name = "LONGITUDE")
    private BigDecimal longitude;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePointVente")
    private List<Stock> stockList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePointVente")
    private List<Utilisateur> utilisateurList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codePointVente")
    private List<Contrat> contratList;
    @JoinColumn(name = "CODE_VILLE", referencedColumnName = "CODE_VILLE")
    @ManyToOne(optional = false)
    private Ville codeVille;
    @JoinColumn(name = "CODE_TYPE_POINT_VENTE", referencedColumnName = "CODE_TYPE_POINT_VENTE")
    @ManyToOne(optional = false)
    private TypePointVente codeTypePointVente;

    public PointVente() {
    }

    public PointVente(String codePointVente) {
        this.codePointVente = codePointVente;
    }

    public String getCodePointVente() {
        return codePointVente;
    }

    public void setCodePointVente(String codePointVente) {
        this.codePointVente = codePointVente;
    }

    public String getLibellePointVente() {
        return libellePointVente;
    }

    public void setLibellePointVente(String libellePointVente) {
        this.libellePointVente = libellePointVente;
    }

    public String getAdressePointVente() {
        return adressePointVente;
    }

    public void setAdressePointVente(String adressePointVente) {
        this.adressePointVente = adressePointVente;
    }

    public String getTelFixePointVente() {
        return telFixePointVente;
    }

    public void setTelFixePointVente(String telFixePointVente) {
        this.telFixePointVente = telFixePointVente;
    }

    public String getTelFaxPointVente() {
        return telFaxPointVente;
    }

    public void setTelFaxPointVente(String telFaxPointVente) {
        this.telFaxPointVente = telFaxPointVente;
    }

    public BigDecimal getLatitude() {
        return latitude;
    }

    public void setLatitude(BigDecimal latitude) {
        this.latitude = latitude;
    }

    public BigDecimal getLongitude() {
        return longitude;
    }

    public void setLongitude(BigDecimal longitude) {
        this.longitude = longitude;
    }

    @XmlTransient
    public List<Stock> getStockList() {
        return stockList;
    }

    public void setStockList(List<Stock> stockList) {
        this.stockList = stockList;
    }

    @XmlTransient
    public List<Utilisateur> getUtilisateurList() {
        return utilisateurList;
    }

    public void setUtilisateurList(List<Utilisateur> utilisateurList) {
        this.utilisateurList = utilisateurList;
    }

    @XmlTransient
    public List<Contrat> getContratList() {
        return contratList;
    }

    public void setContratList(List<Contrat> contratList) {
        this.contratList = contratList;
    }

    public Ville getCodeVille() {
        return codeVille;
    }

    public void setCodeVille(Ville codeVille) {
        this.codeVille = codeVille;
    }

    public TypePointVente getCodeTypePointVente() {
        return codeTypePointVente;
    }

    public void setCodeTypePointVente(TypePointVente codeTypePointVente) {
        this.codeTypePointVente = codeTypePointVente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePointVente != null ? codePointVente.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PointVente)) {
            return false;
        }
        PointVente other = (PointVente) object;
        if ((this.codePointVente == null && other.codePointVente != null) || (this.codePointVente != null && !this.codePointVente.equals(other.codePointVente))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PointVente[ codePointVente=" + codePointVente + " ]";
    }
    
}
