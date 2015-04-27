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
@Table(name = "reglement_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementSinistre.findAll", query = "SELECT r FROM ReglementSinistre r"),
    @NamedQuery(name = "ReglementSinistre.findByCodeReglementSinistre", query = "SELECT r FROM ReglementSinistre r WHERE r.codeReglementSinistre = :codeReglementSinistre"),
    @NamedQuery(name = "ReglementSinistre.findByMontantReglement", query = "SELECT r FROM ReglementSinistre r WHERE r.montantReglement = :montantReglement"),
    @NamedQuery(name = "ReglementSinistre.findByDateReglement", query = "SELECT r FROM ReglementSinistre r WHERE r.dateReglement = :dateReglement"),
    @NamedQuery(name = "ReglementSinistre.findByModeReglement", query = "SELECT r FROM ReglementSinistre r WHERE r.modeReglement = :modeReglement"),
    @NamedQuery(name = "ReglementSinistre.findByNumCheque", query = "SELECT r FROM ReglementSinistre r WHERE r.numCheque = :numCheque"),
    @NamedQuery(name = "ReglementSinistre.findByCpteBanqueRegltSinistre", query = "SELECT r FROM ReglementSinistre r WHERE r.cpteBanqueRegltSinistre = :cpteBanqueRegltSinistre"),
    @NamedQuery(name = "ReglementSinistre.findByNomTireurRegltSinistre", query = "SELECT r FROM ReglementSinistre r WHERE r.nomTireurRegltSinistre = :nomTireurRegltSinistre"),
    @NamedQuery(name = "ReglementSinistre.findBySteBanqueRegltSinistre", query = "SELECT r FROM ReglementSinistre r WHERE r.steBanqueRegltSinistre = :steBanqueRegltSinistre")})
public class ReglementSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CODE_REGLEMENT_SINISTRE")
    private String codeReglementSinistre;
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
    @Size(max = 20)
    @Column(name = "CPTE_BANQUE_REGLT_SINISTRE")
    private String cpteBanqueRegltSinistre;
    @Size(max = 150)
    @Column(name = "NOM_TIREUR_REGLT_SINISTRE")
    private String nomTireurRegltSinistre;
    @Size(max = 60)
    @Column(name = "STE_BANQUE_REGLT_SINISTRE")
    private String steBanqueRegltSinistre;
    @JoinColumn(name = "CODE_AYANT_DROIT", referencedColumnName = "CODE_AYANT_DROIT")
    @ManyToOne
    private AyantDroit codeAyantDroit;
    @JoinColumn(name = "NUM_VICTIME", referencedColumnName = "NUM_VICTIME")
    @ManyToOne
    private Victime numVictime;
    @JoinColumn(name = "CODE_FACTURE", referencedColumnName = "CODE_FACTURE")
    @ManyToOne
    private Facture codeFacture;
    @JoinColumn(name = "REF_INTERVENTION", referencedColumnName = "REF_INTERVENTION")
    @ManyToOne
    private Intervention refIntervention;

    public ReglementSinistre() {
    }

    public ReglementSinistre(String codeReglementSinistre) {
        this.codeReglementSinistre = codeReglementSinistre;
    }

    public String getCodeReglementSinistre() {
        return codeReglementSinistre;
    }

    public void setCodeReglementSinistre(String codeReglementSinistre) {
        this.codeReglementSinistre = codeReglementSinistre;
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

    public String getCpteBanqueRegltSinistre() {
        return cpteBanqueRegltSinistre;
    }

    public void setCpteBanqueRegltSinistre(String cpteBanqueRegltSinistre) {
        this.cpteBanqueRegltSinistre = cpteBanqueRegltSinistre;
    }

    public String getNomTireurRegltSinistre() {
        return nomTireurRegltSinistre;
    }

    public void setNomTireurRegltSinistre(String nomTireurRegltSinistre) {
        this.nomTireurRegltSinistre = nomTireurRegltSinistre;
    }

    public String getSteBanqueRegltSinistre() {
        return steBanqueRegltSinistre;
    }

    public void setSteBanqueRegltSinistre(String steBanqueRegltSinistre) {
        this.steBanqueRegltSinistre = steBanqueRegltSinistre;
    }

    public AyantDroit getCodeAyantDroit() {
        return codeAyantDroit;
    }

    public void setCodeAyantDroit(AyantDroit codeAyantDroit) {
        this.codeAyantDroit = codeAyantDroit;
    }

    public Victime getNumVictime() {
        return numVictime;
    }

    public void setNumVictime(Victime numVictime) {
        this.numVictime = numVictime;
    }

    public Facture getCodeFacture() {
        return codeFacture;
    }

    public void setCodeFacture(Facture codeFacture) {
        this.codeFacture = codeFacture;
    }

    public Intervention getRefIntervention() {
        return refIntervention;
    }

    public void setRefIntervention(Intervention refIntervention) {
        this.refIntervention = refIntervention;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeReglementSinistre != null ? codeReglementSinistre.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementSinistre)) {
            return false;
        }
        ReglementSinistre other = (ReglementSinistre) object;
        if ((this.codeReglementSinistre == null && other.codeReglementSinistre != null) || (this.codeReglementSinistre != null && !this.codeReglementSinistre.equals(other.codeReglementSinistre))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ReglementSinistre[ codeReglementSinistre=" + codeReglementSinistre + " ]";
    }
    
}
