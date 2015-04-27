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
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "gestion_confie_formule")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GestionConfieFormule.findAll", query = "SELECT g FROM GestionConfieFormule g"),
    @NamedQuery(name = "GestionConfieFormule.findByCodeGestionConfie", query = "SELECT g FROM GestionConfieFormule g WHERE g.gestionConfieFormulePK.codeGestionConfie = :codeGestionConfie"),
    @NamedQuery(name = "GestionConfieFormule.findByCodeFormuleGc", query = "SELECT g FROM GestionConfieFormule g WHERE g.gestionConfieFormulePK.codeFormuleGc = :codeFormuleGc"),
    @NamedQuery(name = "GestionConfieFormule.findByDateFormule", query = "SELECT g FROM GestionConfieFormule g WHERE g.dateFormule = :dateFormule"),
    @NamedQuery(name = "GestionConfieFormule.findByPrimeFormuleGc", query = "SELECT g FROM GestionConfieFormule g WHERE g.primeFormuleGc = :primeFormuleGc")})
public class GestionConfieFormule implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GestionConfieFormulePK gestionConfieFormulePK;
    @Column(name = "DATE_FORMULE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFormule;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIME_FORMULE_GC")
    private BigDecimal primeFormuleGc;
    @JoinColumn(name = "CODE_FORMULE_GC", referencedColumnName = "CODE_FORMULE_GC", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FormuleGc formuleGc;
    @JoinColumn(name = "CODE_GESTION_CONFIE", referencedColumnName = "CODE_GESTION_CONFIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GestionConfiee gestionConfiee;

    public GestionConfieFormule() {
    }

    public GestionConfieFormule(GestionConfieFormulePK gestionConfieFormulePK) {
        this.gestionConfieFormulePK = gestionConfieFormulePK;
    }

    public GestionConfieFormule(String codeGestionConfie, String codeFormuleGc) {
        this.gestionConfieFormulePK = new GestionConfieFormulePK(codeGestionConfie, codeFormuleGc);
    }

    public GestionConfieFormulePK getGestionConfieFormulePK() {
        return gestionConfieFormulePK;
    }

    public void setGestionConfieFormulePK(GestionConfieFormulePK gestionConfieFormulePK) {
        this.gestionConfieFormulePK = gestionConfieFormulePK;
    }

    public Date getDateFormule() {
        return dateFormule;
    }

    public void setDateFormule(Date dateFormule) {
        this.dateFormule = dateFormule;
    }

    public BigDecimal getPrimeFormuleGc() {
        return primeFormuleGc;
    }

    public void setPrimeFormuleGc(BigDecimal primeFormuleGc) {
        this.primeFormuleGc = primeFormuleGc;
    }

    public FormuleGc getFormuleGc() {
        return formuleGc;
    }

    public void setFormuleGc(FormuleGc formuleGc) {
        this.formuleGc = formuleGc;
    }

    public GestionConfiee getGestionConfiee() {
        return gestionConfiee;
    }

    public void setGestionConfiee(GestionConfiee gestionConfiee) {
        this.gestionConfiee = gestionConfiee;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (gestionConfieFormulePK != null ? gestionConfieFormulePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionConfieFormule)) {
            return false;
        }
        GestionConfieFormule other = (GestionConfieFormule) object;
        if ((this.gestionConfieFormulePK == null && other.gestionConfieFormulePK != null) || (this.gestionConfieFormulePK != null && !this.gestionConfieFormulePK.equals(other.gestionConfieFormulePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionConfieFormule[ gestionConfieFormulePK=" + gestionConfieFormulePK + " ]";
    }
    
}
