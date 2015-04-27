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
@Table(name = "lgc1debit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lgc1debit.findAll", query = "SELECT l FROM Lgc1debit l"),
    @NamedQuery(name = "Lgc1debit.findByIdlgc1debit", query = "SELECT l FROM Lgc1debit l WHERE l.idlgc1debit = :idlgc1debit"),
    @NamedQuery(name = "Lgc1debit.findBySinistresPayes", query = "SELECT l FROM Lgc1debit l WHERE l.sinistresPayes = :sinistresPayes"),
    @NamedQuery(name = "Lgc1debit.findByFraisaccessoires", query = "SELECT l FROM Lgc1debit l WHERE l.fraisaccessoires = :fraisaccessoires"),
    @NamedQuery(name = "Lgc1debit.findByParticipexceddeb", query = "SELECT l FROM Lgc1debit l WHERE l.participexceddeb = :participexceddeb"),
    @NamedQuery(name = "Lgc1debit.findByAdedrrecrsdeb", query = "SELECT l FROM Lgc1debit l WHERE l.adedrrecrsdeb = :adedrrecrsdeb"),
    @NamedQuery(name = "Lgc1debit.findByArrapcstitutiondeb", query = "SELECT l FROM Lgc1debit l WHERE l.arrapcstitutiondeb = :arrapcstitutiondeb"),
    @NamedQuery(name = "Lgc1debit.findByPrestaaccpaiddeb", query = "SELECT l FROM Lgc1debit l WHERE l.prestaaccpaiddeb = :prestaaccpaiddeb"),
    @NamedQuery(name = "Lgc1debit.findByProvsinm31decprdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provsinm31decprdeb = :provsinm31decprdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvsinp31decdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provsinp31decdeb = :provsinp31decdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvexdm31decprdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provexdm31decprdeb = :provexdm31decprdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvexdp31decdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provexdp31decdeb = :provexdp31decdeb"),
    @NamedQuery(name = "Lgc1debit.findByPrevrcrsm31decprdeb", query = "SELECT l FROM Lgc1debit l WHERE l.prevrcrsm31decprdeb = :prevrcrsm31decprdeb"),
    @NamedQuery(name = "Lgc1debit.findByPrevrcrsp31decdeb", query = "SELECT l FROM Lgc1debit l WHERE l.prevrcrsp31decdeb = :prevrcrsp31decdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvmathm31decprdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provmathm31decprdeb = :provmathm31decprdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvmathp31decdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provmathp31decdeb = :provmathp31decdeb"),
    @NamedQuery(name = "Lgc1debit.findByDotprovpresfraisdeb", query = "SELECT l FROM Lgc1debit l WHERE l.dotprovpresfraisdeb = :dotprovpresfraisdeb"),
    @NamedQuery(name = "Lgc1debit.findByCommissionsdeb", query = "SELECT l FROM Lgc1debit l WHERE l.commissionsdeb = :commissionsdeb"),
    @NamedQuery(name = "Lgc1debit.findByAutreschargesdeb", query = "SELECT l FROM Lgc1debit l WHERE l.autreschargesdeb = :autreschargesdeb"),
    @NamedQuery(name = "Lgc1debit.findByPrimceddeb", query = "SELECT l FROM Lgc1debit l WHERE l.primceddeb = :primceddeb"),
    @NamedQuery(name = "Lgc1debit.findByProvprmreasm31decprdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provprmreasm31decprdeb = :provprmreasm31decprdeb"),
    @NamedQuery(name = "Lgc1debit.findByProvprmreasp31decdeb", query = "SELECT l FROM Lgc1debit l WHERE l.provprmreasp31decdeb = :provprmreasp31decdeb"),
    @NamedQuery(name = "Lgc1debit.findByPrmacquireasdeb", query = "SELECT l FROM Lgc1debit l WHERE l.prmacquireasdeb = :prmacquireasdeb"),
    @NamedQuery(name = "Lgc1debit.findBySoldcrediteur", query = "SELECT l FROM Lgc1debit l WHERE l.soldcrediteur = :soldcrediteur"),
    @NamedQuery(name = "Lgc1debit.findByTotaldeb", query = "SELECT l FROM Lgc1debit l WHERE l.totaldeb = :totaldeb")})
public class Lgc1debit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "IDLGC1DEBIT")
    private String idlgc1debit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SINISTRES_PAYES")
    private BigDecimal sinistresPayes;
    @Column(name = "FRAISACCESSOIRES")
    private BigDecimal fraisaccessoires;
    @Column(name = "PARTICIPEXCEDDEB")
    private BigDecimal participexceddeb;
    @Column(name = "ADEDRRECRSDEB")
    private BigDecimal adedrrecrsdeb;
    @Column(name = "ARRAPCSTITUTIONDEB")
    private BigDecimal arrapcstitutiondeb;
    @Column(name = "PRESTAACCPAIDDEB")
    private BigDecimal prestaaccpaiddeb;
    @Column(name = "PROVSINM31DECPRDEB")
    private BigDecimal provsinm31decprdeb;
    @Column(name = "PROVSINP31DECDEB")
    private BigDecimal provsinp31decdeb;
    @Column(name = "PROVEXDM31DECPRDEB")
    private BigDecimal provexdm31decprdeb;
    @Column(name = "PROVEXDP31DECDEB")
    private BigDecimal provexdp31decdeb;
    @Column(name = "PREVRCRSM31DECPRDEB")
    private BigDecimal prevrcrsm31decprdeb;
    @Column(name = "PREVRCRSP31DECDEB")
    private BigDecimal prevrcrsp31decdeb;
    @Column(name = "PROVMATHM31DECPRDEB")
    private BigDecimal provmathm31decprdeb;
    @Column(name = "PROVMATHP31DECDEB")
    private BigDecimal provmathp31decdeb;
    @Column(name = "DOTPROVPRESFRAISDEB")
    private BigDecimal dotprovpresfraisdeb;
    @Column(name = "COMMISSIONSDEB")
    private BigDecimal commissionsdeb;
    @Column(name = "AUTRESCHARGESDEB")
    private BigDecimal autreschargesdeb;
    @Column(name = "PRIMCEDDEB")
    private BigDecimal primceddeb;
    @Column(name = "PROVPRMREASM31DECPRDEB")
    private BigDecimal provprmreasm31decprdeb;
    @Column(name = "PROVPRMREASP31DECDEB")
    private BigDecimal provprmreasp31decdeb;
    @Column(name = "PRMACQUIREASDEB")
    private BigDecimal prmacquireasdeb;
    @Column(name = "SOLDCREDITEUR")
    private BigDecimal soldcrediteur;
    @Column(name = "TOTALDEB")
    private BigDecimal totaldeb;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne
    private CategorieCima codecategoriecima;
    @JoinColumn(name = "IDETATC1", referencedColumnName = "IDETATC1")
    @ManyToOne
    private Etatc1 idetatc1;

    public Lgc1debit() {
    }

    public Lgc1debit(String idlgc1debit) {
        this.idlgc1debit = idlgc1debit;
    }

    public String getIdlgc1debit() {
        return idlgc1debit;
    }

    public void setIdlgc1debit(String idlgc1debit) {
        this.idlgc1debit = idlgc1debit;
    }

    public BigDecimal getSinistresPayes() {
        return sinistresPayes;
    }

    public void setSinistresPayes(BigDecimal sinistresPayes) {
        this.sinistresPayes = sinistresPayes;
    }

    public BigDecimal getFraisaccessoires() {
        return fraisaccessoires;
    }

    public void setFraisaccessoires(BigDecimal fraisaccessoires) {
        this.fraisaccessoires = fraisaccessoires;
    }

    public BigDecimal getParticipexceddeb() {
        return participexceddeb;
    }

    public void setParticipexceddeb(BigDecimal participexceddeb) {
        this.participexceddeb = participexceddeb;
    }

    public BigDecimal getAdedrrecrsdeb() {
        return adedrrecrsdeb;
    }

    public void setAdedrrecrsdeb(BigDecimal adedrrecrsdeb) {
        this.adedrrecrsdeb = adedrrecrsdeb;
    }

    public BigDecimal getArrapcstitutiondeb() {
        return arrapcstitutiondeb;
    }

    public void setArrapcstitutiondeb(BigDecimal arrapcstitutiondeb) {
        this.arrapcstitutiondeb = arrapcstitutiondeb;
    }

    public BigDecimal getPrestaaccpaiddeb() {
        return prestaaccpaiddeb;
    }

    public void setPrestaaccpaiddeb(BigDecimal prestaaccpaiddeb) {
        this.prestaaccpaiddeb = prestaaccpaiddeb;
    }

    public BigDecimal getProvsinm31decprdeb() {
        return provsinm31decprdeb;
    }

    public void setProvsinm31decprdeb(BigDecimal provsinm31decprdeb) {
        this.provsinm31decprdeb = provsinm31decprdeb;
    }

    public BigDecimal getProvsinp31decdeb() {
        return provsinp31decdeb;
    }

    public void setProvsinp31decdeb(BigDecimal provsinp31decdeb) {
        this.provsinp31decdeb = provsinp31decdeb;
    }

    public BigDecimal getProvexdm31decprdeb() {
        return provexdm31decprdeb;
    }

    public void setProvexdm31decprdeb(BigDecimal provexdm31decprdeb) {
        this.provexdm31decprdeb = provexdm31decprdeb;
    }

    public BigDecimal getProvexdp31decdeb() {
        return provexdp31decdeb;
    }

    public void setProvexdp31decdeb(BigDecimal provexdp31decdeb) {
        this.provexdp31decdeb = provexdp31decdeb;
    }

    public BigDecimal getPrevrcrsm31decprdeb() {
        return prevrcrsm31decprdeb;
    }

    public void setPrevrcrsm31decprdeb(BigDecimal prevrcrsm31decprdeb) {
        this.prevrcrsm31decprdeb = prevrcrsm31decprdeb;
    }

    public BigDecimal getPrevrcrsp31decdeb() {
        return prevrcrsp31decdeb;
    }

    public void setPrevrcrsp31decdeb(BigDecimal prevrcrsp31decdeb) {
        this.prevrcrsp31decdeb = prevrcrsp31decdeb;
    }

    public BigDecimal getProvmathm31decprdeb() {
        return provmathm31decprdeb;
    }

    public void setProvmathm31decprdeb(BigDecimal provmathm31decprdeb) {
        this.provmathm31decprdeb = provmathm31decprdeb;
    }

    public BigDecimal getProvmathp31decdeb() {
        return provmathp31decdeb;
    }

    public void setProvmathp31decdeb(BigDecimal provmathp31decdeb) {
        this.provmathp31decdeb = provmathp31decdeb;
    }

    public BigDecimal getDotprovpresfraisdeb() {
        return dotprovpresfraisdeb;
    }

    public void setDotprovpresfraisdeb(BigDecimal dotprovpresfraisdeb) {
        this.dotprovpresfraisdeb = dotprovpresfraisdeb;
    }

    public BigDecimal getCommissionsdeb() {
        return commissionsdeb;
    }

    public void setCommissionsdeb(BigDecimal commissionsdeb) {
        this.commissionsdeb = commissionsdeb;
    }

    public BigDecimal getAutreschargesdeb() {
        return autreschargesdeb;
    }

    public void setAutreschargesdeb(BigDecimal autreschargesdeb) {
        this.autreschargesdeb = autreschargesdeb;
    }

    public BigDecimal getPrimceddeb() {
        return primceddeb;
    }

    public void setPrimceddeb(BigDecimal primceddeb) {
        this.primceddeb = primceddeb;
    }

    public BigDecimal getProvprmreasm31decprdeb() {
        return provprmreasm31decprdeb;
    }

    public void setProvprmreasm31decprdeb(BigDecimal provprmreasm31decprdeb) {
        this.provprmreasm31decprdeb = provprmreasm31decprdeb;
    }

    public BigDecimal getProvprmreasp31decdeb() {
        return provprmreasp31decdeb;
    }

    public void setProvprmreasp31decdeb(BigDecimal provprmreasp31decdeb) {
        this.provprmreasp31decdeb = provprmreasp31decdeb;
    }

    public BigDecimal getPrmacquireasdeb() {
        return prmacquireasdeb;
    }

    public void setPrmacquireasdeb(BigDecimal prmacquireasdeb) {
        this.prmacquireasdeb = prmacquireasdeb;
    }

    public BigDecimal getSoldcrediteur() {
        return soldcrediteur;
    }

    public void setSoldcrediteur(BigDecimal soldcrediteur) {
        this.soldcrediteur = soldcrediteur;
    }

    public BigDecimal getTotaldeb() {
        return totaldeb;
    }

    public void setTotaldeb(BigDecimal totaldeb) {
        this.totaldeb = totaldeb;
    }

    public CategorieCima getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(CategorieCima codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    public Etatc1 getIdetatc1() {
        return idetatc1;
    }

    public void setIdetatc1(Etatc1 idetatc1) {
        this.idetatc1 = idetatc1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlgc1debit != null ? idlgc1debit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lgc1debit)) {
            return false;
        }
        Lgc1debit other = (Lgc1debit) object;
        if ((this.idlgc1debit == null && other.idlgc1debit != null) || (this.idlgc1debit != null && !this.idlgc1debit.equals(other.idlgc1debit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Lgc1debit[ idlgc1debit=" + idlgc1debit + " ]";
    }
    
}
