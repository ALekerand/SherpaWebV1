/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "garantie_formule_gc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GarantieFormuleGc.findAll", query = "SELECT g FROM GarantieFormuleGc g"),
    @NamedQuery(name = "GarantieFormuleGc.findByCodeGarantie", query = "SELECT g FROM GarantieFormuleGc g WHERE g.garantieFormuleGcPK.codeGarantie = :codeGarantie"),
    @NamedQuery(name = "GarantieFormuleGc.findByCodeFormuleGc", query = "SELECT g FROM GarantieFormuleGc g WHERE g.garantieFormuleGcPK.codeFormuleGc = :codeFormuleGc"),
    @NamedQuery(name = "GarantieFormuleGc.findByDateGarantieFormuleGc", query = "SELECT g FROM GarantieFormuleGc g WHERE g.dateGarantieFormuleGc = :dateGarantieFormuleGc")})
public class GarantieFormuleGc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GarantieFormuleGcPK garantieFormuleGcPK;
    @Column(name = "DATE_GARANTIE_FORMULE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGarantieFormuleGc;
    @JoinColumn(name = "CODE_FORMULE_GC", referencedColumnName = "CODE_FORMULE_GC", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private FormuleGc formuleGc;
    @JoinColumn(name = "CODE_GARANTIE", referencedColumnName = "CODE_GARANTIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Garantie garantie;

    public GarantieFormuleGc() {
    }

    public GarantieFormuleGc(GarantieFormuleGcPK garantieFormuleGcPK) {
        this.garantieFormuleGcPK = garantieFormuleGcPK;
    }

    public GarantieFormuleGc(String codeGarantie, String codeFormuleGc) {
        this.garantieFormuleGcPK = new GarantieFormuleGcPK(codeGarantie, codeFormuleGc);
    }

    public GarantieFormuleGcPK getGarantieFormuleGcPK() {
        return garantieFormuleGcPK;
    }

    public void setGarantieFormuleGcPK(GarantieFormuleGcPK garantieFormuleGcPK) {
        this.garantieFormuleGcPK = garantieFormuleGcPK;
    }

    public Date getDateGarantieFormuleGc() {
        return dateGarantieFormuleGc;
    }

    public void setDateGarantieFormuleGc(Date dateGarantieFormuleGc) {
        this.dateGarantieFormuleGc = dateGarantieFormuleGc;
    }

    public FormuleGc getFormuleGc() {
        return formuleGc;
    }

    public void setFormuleGc(FormuleGc formuleGc) {
        this.formuleGc = formuleGc;
    }

    public Garantie getGarantie() {
        return garantie;
    }

    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (garantieFormuleGcPK != null ? garantieFormuleGcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GarantieFormuleGc)) {
            return false;
        }
        GarantieFormuleGc other = (GarantieFormuleGc) object;
        if ((this.garantieFormuleGcPK == null && other.garantieFormuleGcPK != null) || (this.garantieFormuleGcPK != null && !this.garantieFormuleGcPK.equals(other.garantieFormuleGcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GarantieFormuleGc[ garantieFormuleGcPK=" + garantieFormuleGcPK + " ]";
    }
    
}
