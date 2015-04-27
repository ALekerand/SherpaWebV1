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
import javax.persistence.Lob;
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
@Table(name = "habitation_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HabitationSinistre.findAll", query = "SELECT h FROM HabitationSinistre h"),
    @NamedQuery(name = "HabitationSinistre.findByCodeSinistre", query = "SELECT h FROM HabitationSinistre h WHERE h.habitationSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "HabitationSinistre.findByCodeHabitation", query = "SELECT h FROM HabitationSinistre h WHERE h.habitationSinistrePK.codeHabitation = :codeHabitation"),
    @NamedQuery(name = "HabitationSinistre.findByRespAssureSinistreh", query = "SELECT h FROM HabitationSinistre h WHERE h.respAssureSinistreh = :respAssureSinistreh"),
    @NamedQuery(name = "HabitationSinistre.findByDomageMatH", query = "SELECT h FROM HabitationSinistre h WHERE h.domageMatH = :domageMatH"),
    @NamedQuery(name = "HabitationSinistre.findByDomageCorpH", query = "SELECT h FROM HabitationSinistre h WHERE h.domageCorpH = :domageCorpH"),
    @NamedQuery(name = "HabitationSinistre.findByDateSinistreHabitation", query = "SELECT h FROM HabitationSinistre h WHERE h.dateSinistreHabitation = :dateSinistreHabitation")})
public class HabitationSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected HabitationSinistrePK habitationSinistrePK;
    @Lob
    @Size(max = 65535)
    @Column(name = "CIRCONSTANCES_SINISTREH")
    private String circonstancesSinistreh;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RESP_ASSURE_SINISTREH")
    private BigDecimal respAssureSinistreh;
    @Column(name = "DOMAGE_MAT_H")
    private Boolean domageMatH;
    @Column(name = "DOMAGE_CORP_H")
    private Boolean domageCorpH;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONSEQUENCES_SINISTREH")
    private String consequencesSinistreh;
    @Column(name = "DATE_SINISTRE_HABITATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreHabitation;
    @JoinColumn(name = "CODE_HABITATION", referencedColumnName = "CODE_HABITATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Habitation habitation;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public HabitationSinistre() {
    }

    public HabitationSinistre(HabitationSinistrePK habitationSinistrePK) {
        this.habitationSinistrePK = habitationSinistrePK;
    }

    public HabitationSinistre(String codeSinistre, String codeHabitation) {
        this.habitationSinistrePK = new HabitationSinistrePK(codeSinistre, codeHabitation);
    }

    public HabitationSinistrePK getHabitationSinistrePK() {
        return habitationSinistrePK;
    }

    public void setHabitationSinistrePK(HabitationSinistrePK habitationSinistrePK) {
        this.habitationSinistrePK = habitationSinistrePK;
    }

    public String getCirconstancesSinistreh() {
        return circonstancesSinistreh;
    }

    public void setCirconstancesSinistreh(String circonstancesSinistreh) {
        this.circonstancesSinistreh = circonstancesSinistreh;
    }

    public BigDecimal getRespAssureSinistreh() {
        return respAssureSinistreh;
    }

    public void setRespAssureSinistreh(BigDecimal respAssureSinistreh) {
        this.respAssureSinistreh = respAssureSinistreh;
    }

    public Boolean getDomageMatH() {
        return domageMatH;
    }

    public void setDomageMatH(Boolean domageMatH) {
        this.domageMatH = domageMatH;
    }

    public Boolean getDomageCorpH() {
        return domageCorpH;
    }

    public void setDomageCorpH(Boolean domageCorpH) {
        this.domageCorpH = domageCorpH;
    }

    public String getConsequencesSinistreh() {
        return consequencesSinistreh;
    }

    public void setConsequencesSinistreh(String consequencesSinistreh) {
        this.consequencesSinistreh = consequencesSinistreh;
    }

    public Date getDateSinistreHabitation() {
        return dateSinistreHabitation;
    }

    public void setDateSinistreHabitation(Date dateSinistreHabitation) {
        this.dateSinistreHabitation = dateSinistreHabitation;
    }

    public Habitation getHabitation() {
        return habitation;
    }

    public void setHabitation(Habitation habitation) {
        this.habitation = habitation;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (habitationSinistrePK != null ? habitationSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HabitationSinistre)) {
            return false;
        }
        HabitationSinistre other = (HabitationSinistre) object;
        if ((this.habitationSinistrePK == null && other.habitationSinistrePK != null) || (this.habitationSinistrePK != null && !this.habitationSinistrePK.equals(other.habitationSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.HabitationSinistre[ habitationSinistrePK=" + habitationSinistrePK + " ]";
    }
    
}
