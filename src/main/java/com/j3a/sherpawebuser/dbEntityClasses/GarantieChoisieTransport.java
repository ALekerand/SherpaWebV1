/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
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
@Table(name = "garantie_choisie_transport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieChoisieTransport.findAll", query = "SELECT g FROM GarantieChoisieTransport g"),
    @NamedQuery(name = "GarantieChoisieTransport.findByCodeGarantieChoisieTransport", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.codeGarantieChoisieTransport = :codeGarantieChoisieTransport"),
    @NamedQuery(name = "GarantieChoisieTransport.findByLibelleGarantieChosie", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.libelleGarantieChosie = :libelleGarantieChosie"),
    @NamedQuery(name = "GarantieChoisieTransport.findByDateGarantieChoisie", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.dateGarantieChoisie = :dateGarantieChoisie"),
    @NamedQuery(name = "GarantieChoisieTransport.findByMontantGaranties", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.montantGaranties = :montantGaranties"),
    @NamedQuery(name = "GarantieChoisieTransport.findByAccessoiretrsp", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.accessoiretrsp = :accessoiretrsp"),
    @NamedQuery(name = "GarantieChoisieTransport.findByCodeAvenantTransport", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.codeAvenantTransport = :codeAvenantTransport"),
    @NamedQuery(name = "GarantieChoisieTransport.findByCodeAvenantTrsp", query = "SELECT g FROM GarantieChoisieTransport g WHERE g.codeAvenantTrsp = :codeAvenantTrsp")})
public class GarantieChoisieTransport implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_GARANTIE_CHOISIE_TRANSPORT")
    private String codeGarantieChoisieTransport;
    @Size(max = 70)
    @Column(name = "LIBELLE_GARANTIE_CHOSIE")
    private String libelleGarantieChosie;
    @Column(name = "DATE_GARANTIE_CHOISIE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_GARANTIES")
    private BigDecimal montantGaranties;
    @Column(name = "ACCESSOIRETRSP")
    private BigDecimal accessoiretrsp;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_TRANSPORT")
    private String codeAvenantTransport;
    @Size(max = 28)
    @Column(name = "CODE_AVENANT_TRSP")
    private String codeAvenantTrsp;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "garantieChoisieTransport")
    private List<GarantieGarantieChoisieTransport> garantieGarantieChoisieTransportList;
    @JoinColumn(name = "CODE_ALIMENT", referencedColumnName = "CODE_ALIMENT")
    @ManyToOne
    private Aliment codeAliment;

    public GarantieChoisieTransport() {
    }

    public GarantieChoisieTransport(String codeGarantieChoisieTransport) {
        this.codeGarantieChoisieTransport = codeGarantieChoisieTransport;
    }

    public String getCodeGarantieChoisieTransport() {
        return codeGarantieChoisieTransport;
    }

    public void setCodeGarantieChoisieTransport(String codeGarantieChoisieTransport) {
        this.codeGarantieChoisieTransport = codeGarantieChoisieTransport;
    }

    public String getLibelleGarantieChosie() {
        return libelleGarantieChosie;
    }

    public void setLibelleGarantieChosie(String libelleGarantieChosie) {
        this.libelleGarantieChosie = libelleGarantieChosie;
    }

    public Date getDateGarantieChoisie() {
        return dateGarantieChoisie;
    }

    public void setDateGarantieChoisie(Date dateGarantieChoisie) {
        this.dateGarantieChoisie = dateGarantieChoisie;
    }

    public BigDecimal getMontantGaranties() {
        return montantGaranties;
    }

    public void setMontantGaranties(BigDecimal montantGaranties) {
        this.montantGaranties = montantGaranties;
    }

    public BigDecimal getAccessoiretrsp() {
        return accessoiretrsp;
    }

    public void setAccessoiretrsp(BigDecimal accessoiretrsp) {
        this.accessoiretrsp = accessoiretrsp;
    }

    public String getCodeAvenantTransport() {
        return codeAvenantTransport;
    }

    public void setCodeAvenantTransport(String codeAvenantTransport) {
        this.codeAvenantTransport = codeAvenantTransport;
    }

    public String getCodeAvenantTrsp() {
        return codeAvenantTrsp;
    }

    public void setCodeAvenantTrsp(String codeAvenantTrsp) {
        this.codeAvenantTrsp = codeAvenantTrsp;
    }

    @XmlTransient
    public List<GarantieGarantieChoisieTransport> getGarantieGarantieChoisieTransportList() {
        return garantieGarantieChoisieTransportList;
    }

    public void setGarantieGarantieChoisieTransportList(List<GarantieGarantieChoisieTransport> garantieGarantieChoisieTransportList) {
        this.garantieGarantieChoisieTransportList = garantieGarantieChoisieTransportList;
    }

    public Aliment getCodeAliment() {
        return codeAliment;
    }

    public void setCodeAliment(Aliment codeAliment) {
        this.codeAliment = codeAliment;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeGarantieChoisieTransport != null ? codeGarantieChoisieTransport.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieChoisieTransport)) {
            return false;
        }
        GarantieChoisieTransport other = (GarantieChoisieTransport) object;
        if ((this.codeGarantieChoisieTransport == null && other.codeGarantieChoisieTransport != null) || (this.codeGarantieChoisieTransport != null && !this.codeGarantieChoisieTransport.equals(other.codeGarantieChoisieTransport))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieChoisieTransport[ codeGarantieChoisieTransport=" + codeGarantieChoisieTransport + " ]";
    }
    
}
