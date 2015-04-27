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
@Table(name = "lgc1credit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lgc1credit.findAll", query = "SELECT l FROM Lgc1credit l"),
    @NamedQuery(name = "Lgc1credit.findByIdlgc1credit", query = "SELECT l FROM Lgc1credit l WHERE l.idlgc1credit = :idlgc1credit"),
    @NamedQuery(name = "Lgc1credit.findByPrimaccesscred", query = "SELECT l FROM Lgc1credit l WHERE l.primaccesscred = :primaccesscred"),
    @NamedQuery(name = "Lgc1credit.findByRappelscred", query = "SELECT l FROM Lgc1credit l WHERE l.rappelscred = :rappelscred"),
    @NamedQuery(name = "Lgc1credit.findByAddrannulcred", query = "SELECT l FROM Lgc1credit l WHERE l.addrannulcred = :addrannulcred"),
    @NamedQuery(name = "Lgc1credit.findByPrimesnettescred", query = "SELECT l FROM Lgc1credit l WHERE l.primesnettescred = :primesnettescred"),
    @NamedQuery(name = "Lgc1credit.findByProvrisqencrsm31decprcred", query = "SELECT l FROM Lgc1credit l WHERE l.provrisqencrsm31decprcred = :provrisqencrsm31decprcred"),
    @NamedQuery(name = "Lgc1credit.findByProvrisqencrsp31deccred", query = "SELECT l FROM Lgc1credit l WHERE l.provrisqencrsp31deccred = :provrisqencrsp31deccred"),
    @NamedQuery(name = "Lgc1credit.findByAutrprovprmm31decprcred", query = "SELECT l FROM Lgc1credit l WHERE l.autrprovprmm31decprcred = :autrprovprmm31decprcred"),
    @NamedQuery(name = "Lgc1credit.findByAutrprovprmp31deccred", query = "SELECT l FROM Lgc1credit l WHERE l.autrprovprmp31deccred = :autrprovprmp31deccred"),
    @NamedQuery(name = "Lgc1credit.findByProvannulm31decprcred", query = "SELECT l FROM Lgc1credit l WHERE l.provannulm31decprcred = :provannulm31decprcred"),
    @NamedQuery(name = "Lgc1credit.findByProvannulp31deccred", query = "SELECT l FROM Lgc1credit l WHERE l.provannulp31deccred = :provannulp31deccred"),
    @NamedQuery(name = "Lgc1credit.findByDotprovprmcred", query = "SELECT l FROM Lgc1credit l WHERE l.dotprovprmcred = :dotprovprmcred"),
    @NamedQuery(name = "Lgc1credit.findByProdfinnetcred", query = "SELECT l FROM Lgc1credit l WHERE l.prodfinnetcred = :prodfinnetcred"),
    @NamedQuery(name = "Lgc1credit.findByProdexcedcred", query = "SELECT l FROM Lgc1credit l WHERE l.prodexcedcred = :prodexcedcred"),
    @NamedQuery(name = "Lgc1credit.findByPartreasinprestacred", query = "SELECT l FROM Lgc1credit l WHERE l.partreasinprestacred = :partreasinprestacred"),
    @NamedQuery(name = "Lgc1credit.findByPartreasinprvpresm31decprcred", query = "SELECT l FROM Lgc1credit l WHERE l.partreasinprvpresm31decprcred = :partreasinprvpresm31decprcred"),
    @NamedQuery(name = "Lgc1credit.findByPartreasinprvpresp31deccred", query = "SELECT l FROM Lgc1credit l WHERE l.partreasinprvpresp31deccred = :partreasinprvpresp31deccred"),
    @NamedQuery(name = "Lgc1credit.findByComreasscred", query = "SELECT l FROM Lgc1credit l WHERE l.comreasscred = :comreasscred"),
    @NamedQuery(name = "Lgc1credit.findByPartreassdschrgcred", query = "SELECT l FROM Lgc1credit l WHERE l.partreassdschrgcred = :partreassdschrgcred"),
    @NamedQuery(name = "Lgc1credit.findBySoldedebiteur", query = "SELECT l FROM Lgc1credit l WHERE l.soldedebiteur = :soldedebiteur"),
    @NamedQuery(name = "Lgc1credit.findByTotalcred", query = "SELECT l FROM Lgc1credit l WHERE l.totalcred = :totalcred")})
public class Lgc1credit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "IDLGC1CREDIT")
    private String idlgc1credit;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIMACCESSCRED")
    private BigDecimal primaccesscred;
    @Column(name = "RAPPELSCRED")
    private BigDecimal rappelscred;
    @Column(name = "ADDRANNULCRED")
    private BigDecimal addrannulcred;
    @Column(name = "PRIMESNETTESCRED")
    private BigDecimal primesnettescred;
    @Column(name = "PROVRISQENCRSM31DECPRCRED")
    private BigDecimal provrisqencrsm31decprcred;
    @Column(name = "PROVRISQENCRSP31DECCRED")
    private BigDecimal provrisqencrsp31deccred;
    @Column(name = "AUTRPROVPRMM31DECPRCRED")
    private BigDecimal autrprovprmm31decprcred;
    @Column(name = "AUTRPROVPRMP31DECCRED")
    private BigDecimal autrprovprmp31deccred;
    @Column(name = "PROVANNULM31DECPRCRED")
    private BigDecimal provannulm31decprcred;
    @Column(name = "PROVANNULP31DECCRED")
    private BigDecimal provannulp31deccred;
    @Column(name = "DOTPROVPRMCRED")
    private BigDecimal dotprovprmcred;
    @Column(name = "PRODFINNETCRED")
    private BigDecimal prodfinnetcred;
    @Column(name = "PRODEXCEDCRED")
    private BigDecimal prodexcedcred;
    @Column(name = "PARTREASINPRESTACRED")
    private BigDecimal partreasinprestacred;
    @Column(name = "PARTREASINPRVPRESM31DECPRCRED")
    private BigDecimal partreasinprvpresm31decprcred;
    @Column(name = "PARTREASINPRVPRESP31DECCRED")
    private BigDecimal partreasinprvpresp31deccred;
    @Column(name = "COMREASSCRED")
    private BigDecimal comreasscred;
    @Column(name = "PARTREASSDSCHRGCRED")
    private BigDecimal partreassdschrgcred;
    @Column(name = "SOLDEDEBITEUR")
    private BigDecimal soldedebiteur;
    @Column(name = "TOTALCRED")
    private BigDecimal totalcred;
    @JoinColumn(name = "CODECATEGORIECIMA", referencedColumnName = "CODECATEGORIECIMA")
    @ManyToOne
    private CategorieCima codecategoriecima;
    @JoinColumn(name = "IDETATC1", referencedColumnName = "IDETATC1")
    @ManyToOne
    private Etatc1 idetatc1;

    public Lgc1credit() {
    }

    public Lgc1credit(String idlgc1credit) {
        this.idlgc1credit = idlgc1credit;
    }

    public String getIdlgc1credit() {
        return idlgc1credit;
    }

    public void setIdlgc1credit(String idlgc1credit) {
        this.idlgc1credit = idlgc1credit;
    }

    public BigDecimal getPrimaccesscred() {
        return primaccesscred;
    }

    public void setPrimaccesscred(BigDecimal primaccesscred) {
        this.primaccesscred = primaccesscred;
    }

    public BigDecimal getRappelscred() {
        return rappelscred;
    }

    public void setRappelscred(BigDecimal rappelscred) {
        this.rappelscred = rappelscred;
    }

    public BigDecimal getAddrannulcred() {
        return addrannulcred;
    }

    public void setAddrannulcred(BigDecimal addrannulcred) {
        this.addrannulcred = addrannulcred;
    }

    public BigDecimal getPrimesnettescred() {
        return primesnettescred;
    }

    public void setPrimesnettescred(BigDecimal primesnettescred) {
        this.primesnettescred = primesnettescred;
    }

    public BigDecimal getProvrisqencrsm31decprcred() {
        return provrisqencrsm31decprcred;
    }

    public void setProvrisqencrsm31decprcred(BigDecimal provrisqencrsm31decprcred) {
        this.provrisqencrsm31decprcred = provrisqencrsm31decprcred;
    }

    public BigDecimal getProvrisqencrsp31deccred() {
        return provrisqencrsp31deccred;
    }

    public void setProvrisqencrsp31deccred(BigDecimal provrisqencrsp31deccred) {
        this.provrisqencrsp31deccred = provrisqencrsp31deccred;
    }

    public BigDecimal getAutrprovprmm31decprcred() {
        return autrprovprmm31decprcred;
    }

    public void setAutrprovprmm31decprcred(BigDecimal autrprovprmm31decprcred) {
        this.autrprovprmm31decprcred = autrprovprmm31decprcred;
    }

    public BigDecimal getAutrprovprmp31deccred() {
        return autrprovprmp31deccred;
    }

    public void setAutrprovprmp31deccred(BigDecimal autrprovprmp31deccred) {
        this.autrprovprmp31deccred = autrprovprmp31deccred;
    }

    public BigDecimal getProvannulm31decprcred() {
        return provannulm31decprcred;
    }

    public void setProvannulm31decprcred(BigDecimal provannulm31decprcred) {
        this.provannulm31decprcred = provannulm31decprcred;
    }

    public BigDecimal getProvannulp31deccred() {
        return provannulp31deccred;
    }

    public void setProvannulp31deccred(BigDecimal provannulp31deccred) {
        this.provannulp31deccred = provannulp31deccred;
    }

    public BigDecimal getDotprovprmcred() {
        return dotprovprmcred;
    }

    public void setDotprovprmcred(BigDecimal dotprovprmcred) {
        this.dotprovprmcred = dotprovprmcred;
    }

    public BigDecimal getProdfinnetcred() {
        return prodfinnetcred;
    }

    public void setProdfinnetcred(BigDecimal prodfinnetcred) {
        this.prodfinnetcred = prodfinnetcred;
    }

    public BigDecimal getProdexcedcred() {
        return prodexcedcred;
    }

    public void setProdexcedcred(BigDecimal prodexcedcred) {
        this.prodexcedcred = prodexcedcred;
    }

    public BigDecimal getPartreasinprestacred() {
        return partreasinprestacred;
    }

    public void setPartreasinprestacred(BigDecimal partreasinprestacred) {
        this.partreasinprestacred = partreasinprestacred;
    }

    public BigDecimal getPartreasinprvpresm31decprcred() {
        return partreasinprvpresm31decprcred;
    }

    public void setPartreasinprvpresm31decprcred(BigDecimal partreasinprvpresm31decprcred) {
        this.partreasinprvpresm31decprcred = partreasinprvpresm31decprcred;
    }

    public BigDecimal getPartreasinprvpresp31deccred() {
        return partreasinprvpresp31deccred;
    }

    public void setPartreasinprvpresp31deccred(BigDecimal partreasinprvpresp31deccred) {
        this.partreasinprvpresp31deccred = partreasinprvpresp31deccred;
    }

    public BigDecimal getComreasscred() {
        return comreasscred;
    }

    public void setComreasscred(BigDecimal comreasscred) {
        this.comreasscred = comreasscred;
    }

    public BigDecimal getPartreassdschrgcred() {
        return partreassdschrgcred;
    }

    public void setPartreassdschrgcred(BigDecimal partreassdschrgcred) {
        this.partreassdschrgcred = partreassdschrgcred;
    }

    public BigDecimal getSoldedebiteur() {
        return soldedebiteur;
    }

    public void setSoldedebiteur(BigDecimal soldedebiteur) {
        this.soldedebiteur = soldedebiteur;
    }

    public BigDecimal getTotalcred() {
        return totalcred;
    }

    public void setTotalcred(BigDecimal totalcred) {
        this.totalcred = totalcred;
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
        hash += (idlgc1credit != null ? idlgc1credit.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lgc1credit)) {
            return false;
        }
        Lgc1credit other = (Lgc1credit) object;
        if ((this.idlgc1credit == null && other.idlgc1credit != null) || (this.idlgc1credit != null && !this.idlgc1credit.equals(other.idlgc1credit))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Lgc1credit[ idlgc1credit=" + idlgc1credit + " ]";
    }
    
}
