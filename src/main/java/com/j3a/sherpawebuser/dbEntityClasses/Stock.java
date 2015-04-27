/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "stock")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stock.findAll", query = "SELECT s FROM Stock s"),
    @NamedQuery(name = "Stock.findByIdStock", query = "SELECT s FROM Stock s WHERE s.idStock = :idStock"),
    @NamedQuery(name = "Stock.findByDatestock", query = "SELECT s FROM Stock s WHERE s.datestock = :datestock"),
    @NamedQuery(name = "Stock.findByStkinit", query = "SELECT s FROM Stock s WHERE s.stkinit = :stkinit"),
    @NamedQuery(name = "Stock.findByStkrst", query = "SELECT s FROM Stock s WHERE s.stkrst = :stkrst"),
    @NamedQuery(name = "Stock.findBySituation", query = "SELECT s FROM Stock s WHERE s.situation = :situation")})
public class Stock implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "ID_STOCK")
    private String idStock;
    @Column(name = "DATESTOCK")
    @Temporal(TemporalType.DATE)
    private Date datestock;
    @Column(name = "STKINIT")
    private BigInteger stkinit;
    @Column(name = "STKRST")
    private BigInteger stkrst;
    @Size(max = 60)
    @Column(name = "SITUATION")
    private String situation;
    @JoinColumn(name = "CODE_POINT_VENTE", referencedColumnName = "CODE_POINT_VENTE")
    @ManyToOne(optional = false)
    private PointVente codePointVente;
    @OneToMany(mappedBy = "idStock")
    private List<Attestation> attestationList;

    public Stock() {
    }

    public Stock(String idStock) {
        this.idStock = idStock;
    }

    public String getIdStock() {
        return idStock;
    }

    public void setIdStock(String idStock) {
        this.idStock = idStock;
    }

    public Date getDatestock() {
        return datestock;
    }

    public void setDatestock(Date datestock) {
        this.datestock = datestock;
    }

    public BigInteger getStkinit() {
        return stkinit;
    }

    public void setStkinit(BigInteger stkinit) {
        this.stkinit = stkinit;
    }

    public BigInteger getStkrst() {
        return stkrst;
    }

    public void setStkrst(BigInteger stkrst) {
        this.stkrst = stkrst;
    }

    public String getSituation() {
        return situation;
    }

    public void setSituation(String situation) {
        this.situation = situation;
    }

    public PointVente getCodePointVente() {
        return codePointVente;
    }

    public void setCodePointVente(PointVente codePointVente) {
        this.codePointVente = codePointVente;
    }

    @XmlTransient
    public List<Attestation> getAttestationList() {
        return attestationList;
    }

    public void setAttestationList(List<Attestation> attestationList) {
        this.attestationList = attestationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idStock != null ? idStock.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Stock)) {
            return false;
        }
        Stock other = (Stock) object;
        if ((this.idStock == null && other.idStock != null) || (this.idStock != null && !this.idStock.equals(other.idStock))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Stock[ idStock=" + idStock + " ]";
    }
    
}
