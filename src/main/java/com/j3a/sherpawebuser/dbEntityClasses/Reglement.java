/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "reglement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reglement.findAll", query = "SELECT r FROM Reglement r"),
    @NamedQuery(name = "Reglement.findByCodeReglement", query = "SELECT r FROM Reglement r WHERE r.codeReglement = :codeReglement"),
    @NamedQuery(name = "Reglement.findByMontantReglement", query = "SELECT r FROM Reglement r WHERE r.montantReglement = :montantReglement"),
    @NamedQuery(name = "Reglement.findByDateReglement", query = "SELECT r FROM Reglement r WHERE r.dateReglement = :dateReglement"),
    @NamedQuery(name = "Reglement.findByModeReglement", query = "SELECT r FROM Reglement r WHERE r.modeReglement = :modeReglement"),
    @NamedQuery(name = "Reglement.findByNumCheque", query = "SELECT r FROM Reglement r WHERE r.numCheque = :numCheque"),
    @NamedQuery(name = "Reglement.findByCpteBanque", query = "SELECT r FROM Reglement r WHERE r.cpteBanque = :cpteBanque"),
    @NamedQuery(name = "Reglement.findByNomTireur", query = "SELECT r FROM Reglement r WHERE r.nomTireur = :nomTireur"),
    @NamedQuery(name = "Reglement.findBySteBanque", query = "SELECT r FROM Reglement r WHERE r.steBanque = :steBanque")})
public class Reglement implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_REGLEMENT")
    private String codeReglement;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_REGLEMENT")
    private BigDecimal montantReglement;
    @Column(name = "DATE_REGLEMENT")
    @Temporal(TemporalType.DATE)
    private Date dateReglement;
    @Size(max = 50)
    @Column(name = "MODE_REGLEMENT")
    private String modeReglement;
    @Size(max = 50)
    @Column(name = "NUM_CHEQUE")
    private String numCheque;
    @Size(max = 30)
    @Column(name = "CPTE_BANQUE")
    private String cpteBanque;
    @Size(max = 150)
    @Column(name = "NOM_TIREUR")
    private String nomTireur;
    @Size(max = 50)
    @Column(name = "STE_BANQUE")
    private String steBanque;
    @JoinColumn(name = "CODE_QUITTANCE", referencedColumnName = "CODE_QUITTANCE")
    @ManyToOne(optional = false)
    private Quittance codeQuittance;

    public Reglement() {
    }

    public Reglement(String codeReglement) {
        this.codeReglement = codeReglement;
    }

    public String getCodeReglement() {
        return codeReglement;
    }

    public void setCodeReglement(String codeReglement) {
        this.codeReglement = codeReglement;
    }

    public BigDecimal getMontantReglement() {
        return montantReglement;
    }

    public void setMontantReglement(BigDecimal montantReglement) {
        this.montantReglement = montantReglement;
    }

    public Date getDateReglement() {
        return dateReglement;
    }

    public void setDateReglement(Date dateReglement) {
        this.dateReglement = dateReglement;
    }

    public String getModeReglement() {
        return modeReglement;
    }

    public void setModeReglement(String modeReglement) {
        this.modeReglement = modeReglement;
    }

    public String getNumCheque() {
        return numCheque;
    }

    public void setNumCheque(String numCheque) {
        this.numCheque = numCheque;
    }

    public String getCpteBanque() {
        return cpteBanque;
    }

    public void setCpteBanque(String cpteBanque) {
        this.cpteBanque = cpteBanque;
    }

    public String getNomTireur() {
        return nomTireur;
    }

    public void setNomTireur(String nomTireur) {
        this.nomTireur = nomTireur;
    }

    public String getSteBanque() {
        return steBanque;
    }

    public void setSteBanque(String steBanque) {
        this.steBanque = steBanque;
    }

    public Quittance getCodeQuittance() {
        return codeQuittance;
    }

    public void setCodeQuittance(Quittance codeQuittance) {
        this.codeQuittance = codeQuittance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeReglement != null ? codeReglement.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reglement)) {
            return false;
        }
        Reglement other = (Reglement) object;
        if ((this.codeReglement == null && other.codeReglement != null) || (this.codeReglement != null && !this.codeReglement.equals(other.codeReglement))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Reglement[ codeReglement=" + codeReglement + " ]";
    }
    
}
