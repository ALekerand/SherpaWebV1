/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "garantie_garantie_choisie_transport")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findAll", query = "SELECT g FROM GarantieGarantieChoisieTransport g"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByCodeGarantieChoisieTransport", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.garantieGarantieChoisieTransportPK.codeGarantieChoisieTransport = :codeGarantieChoisieTransport"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByCodeGarantie", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.garantieGarantieChoisieTransportPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByNature", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.nature = :nature"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByTaux", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.taux = :taux"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByMinimum", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.minimum = :minimum"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByMaximum", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.maximum = :maximum"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByDateGarantieChoisie", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.dateGarantieChoisie = :dateGarantieChoisie"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByMontantGarantie", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.montantGarantie = :montantGarantie"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByTauxfranchise", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.tauxfranchise = :tauxfranchise"),
    @NamedQuery(name = "GarantieGarantieChoisieTransport.findByCapitalTransport", query = "SELECT g FROM GarantieGarantieChoisieTransport g WHERE g.capitalTransport = :capitalTransport")})
public class GarantieGarantieChoisieTransport implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieGarantieChoisieTransportPK garantieGarantieChoisieTransportPK;
    @Size(max = 20)
    @Column(name = "NATURE")
    private String nature;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX")
    private BigDecimal taux;
    @Column(name = "MINIMUM")
    private BigDecimal minimum;
    @Column(name = "MAXIMUM")
    private BigDecimal maximum;
    @Column(name = "DATE_GARANTIE_CHOISIE")
    @Temporal(TemporalType.DATE)
    private Date dateGarantieChoisie;
    @Column(name = "MONTANT_GARANTIE")
    private BigDecimal montantGarantie;
    @Column(name = "TAUXFRANCHISE")
    private BigDecimal tauxfranchise;
    @Column(name = "CAPITAL_TRANSPORT")
    private BigDecimal capitalTransport;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;
    @JoinColumn(name = "CODE_GARANTIE_CHOISIE_TRANSPORT", referencedColumnName = "CODE_GARANTIE_CHOISIE_TRANSPORT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GarantieChoisieTransport garantieChoisieTransport;

    public GarantieGarantieChoisieTransport() {
    }

    public GarantieGarantieChoisieTransport(GarantieGarantieChoisieTransportPK garantieGarantieChoisieTransportPK) {
        this.garantieGarantieChoisieTransportPK = garantieGarantieChoisieTransportPK;
    }

    public GarantieGarantieChoisieTransport(String codeGarantieChoisieTransport, String codeGarantie) {
        this.garantieGarantieChoisieTransportPK = new GarantieGarantieChoisieTransportPK(codeGarantieChoisieTransport, codeGarantie);
    }

    public GarantieGarantieChoisieTransportPK getGarantieGarantieChoisieTransportPK() {
        return garantieGarantieChoisieTransportPK;
    }

    public void setGarantieGarantieChoisieTransportPK(GarantieGarantieChoisieTransportPK garantieGarantieChoisieTransportPK) {
        this.garantieGarantieChoisieTransportPK = garantieGarantieChoisieTransportPK;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public BigDecimal getMinimum() {
        return minimum;
    }

    public void setMinimum(BigDecimal minimum) {
        this.minimum = minimum;
    }

    public BigDecimal getMaximum() {
        return maximum;
    }

    public void setMaximum(BigDecimal maximum) {
        this.maximum = maximum;
    }

    public Date getDateGarantieChoisie() {
        return dateGarantieChoisie;
    }

    public void setDateGarantieChoisie(Date dateGarantieChoisie) {
        this.dateGarantieChoisie = dateGarantieChoisie;
    }

    public BigDecimal getMontantGarantie() {
        return montantGarantie;
    }

    public void setMontantGarantie(BigDecimal montantGarantie) {
        this.montantGarantie = montantGarantie;
    }

    public BigDecimal getTauxfranchise() {
        return tauxfranchise;
    }

    public void setTauxfranchise(BigDecimal tauxfranchise) {
        this.tauxfranchise = tauxfranchise;
    }

    public BigDecimal getCapitalTransport() {
        return capitalTransport;
    }

    public void setCapitalTransport(BigDecimal capitalTransport) {
        this.capitalTransport = capitalTransport;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    public GarantieChoisieTransport getGarantieChoisieTransport() {
        return garantieChoisieTransport;
    }

    public void setGarantieChoisieTransport(GarantieChoisieTransport garantieChoisieTransport) {
        this.garantieChoisieTransport = garantieChoisieTransport;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieGarantieChoisieTransportPK != null ? garantieGarantieChoisieTransportPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieGarantieChoisieTransport)) {
            return false;
        }
        GarantieGarantieChoisieTransport other = (GarantieGarantieChoisieTransport) object;
        if ((this.garantieGarantieChoisieTransportPK == null && other.garantieGarantieChoisieTransportPK != null) || (this.garantieGarantieChoisieTransportPK != null && !this.garantieGarantieChoisieTransportPK.equals(other.garantieGarantieChoisieTransportPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieGarantieChoisieTransport[ garantieGarantieChoisieTransportPK=" + garantieGarantieChoisieTransportPK + " ]";
    }
    
}
