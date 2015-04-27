/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "reglement_sinistre_gc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReglementSinistreGc.findAll", query = "SELECT r FROM ReglementSinistreGc r"),
    @NamedQuery(name = "ReglementSinistreGc.findByCodeReglementSinistreGc", query = "SELECT r FROM ReglementSinistreGc r WHERE r.codeReglementSinistreGc = :codeReglementSinistreGc"),
    @NamedQuery(name = "ReglementSinistreGc.findByFraisReel", query = "SELECT r FROM ReglementSinistreGc r WHERE r.fraisReel = :fraisReel"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantExclusion", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantExclusion = :montantExclusion"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantBase", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantBase = :montantBase"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantForce", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantForce = :montantForce"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantDiffere", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantDiffere = :montantDiffere"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantRemboursement", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantRemboursement = :montantRemboursement"),
    @NamedQuery(name = "ReglementSinistreGc.findByMontantReglement", query = "SELECT r FROM ReglementSinistreGc r WHERE r.montantReglement = :montantReglement")})
public class ReglementSinistreGc implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_REGLEMENT_SINISTRE_GC")
    private String codeReglementSinistreGc;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "FRAIS_REEL")
    private BigDecimal fraisReel;
    @Column(name = "MONTANT_EXCLUSION")
    private BigDecimal montantExclusion;
    @Column(name = "MONTANT_BASE")
    private BigDecimal montantBase;
    @Column(name = "MONTANT_FORCE")
    private BigDecimal montantForce;
    @Column(name = "MONTANT_DIFFERE")
    private BigDecimal montantDiffere;
    @Column(name = "MONTANT_REMBOURSEMENT")
    private BigDecimal montantRemboursement;
    @Column(name = "MONTANT_REGLEMENT")
    private BigDecimal montantReglement;
    @Lob
    @Size(max = 65535)
    @Column(name = "MOTIF_EXCLUSION")
    private String motifExclusion;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE")
    @ManyToOne
    private Sinistre codeSinistre;

    public ReglementSinistreGc() {
    }

    public ReglementSinistreGc(String codeReglementSinistreGc) {
        this.codeReglementSinistreGc = codeReglementSinistreGc;
    }

    public String getCodeReglementSinistreGc() {
        return codeReglementSinistreGc;
    }

    public void setCodeReglementSinistreGc(String codeReglementSinistreGc) {
        this.codeReglementSinistreGc = codeReglementSinistreGc;
    }

    public BigDecimal getFraisReel() {
        return fraisReel;
    }

    public void setFraisReel(BigDecimal fraisReel) {
        this.fraisReel = fraisReel;
    }

    public BigDecimal getMontantExclusion() {
        return montantExclusion;
    }

    public void setMontantExclusion(BigDecimal montantExclusion) {
        this.montantExclusion = montantExclusion;
    }

    public BigDecimal getMontantBase() {
        return montantBase;
    }

    public void setMontantBase(BigDecimal montantBase) {
        this.montantBase = montantBase;
    }

    public BigDecimal getMontantForce() {
        return montantForce;
    }

    public void setMontantForce(BigDecimal montantForce) {
        this.montantForce = montantForce;
    }

    public BigDecimal getMontantDiffere() {
        return montantDiffere;
    }

    public void setMontantDiffere(BigDecimal montantDiffere) {
        this.montantDiffere = montantDiffere;
    }

    public BigDecimal getMontantRemboursement() {
        return montantRemboursement;
    }

    public void setMontantRemboursement(BigDecimal montantRemboursement) {
        this.montantRemboursement = montantRemboursement;
    }

    public BigDecimal getMontantReglement() {
        return montantReglement;
    }

    public void setMontantReglement(BigDecimal montantReglement) {
        this.montantReglement = montantReglement;
    }

    public String getMotifExclusion() {
        return motifExclusion;
    }

    public void setMotifExclusion(String motifExclusion) {
        this.motifExclusion = motifExclusion;
    }

    public Sinistre getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(Sinistre codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeReglementSinistreGc != null ? codeReglementSinistreGc.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReglementSinistreGc)) {
            return false;
        }
        ReglementSinistreGc other = (ReglementSinistreGc) object;
        if ((this.codeReglementSinistreGc == null && other.codeReglementSinistreGc != null) || (this.codeReglementSinistreGc != null && !this.codeReglementSinistreGc.equals(other.codeReglementSinistreGc))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ReglementSinistreGc[ codeReglementSinistreGc=" + codeReglementSinistreGc + " ]";
    }
    
}
