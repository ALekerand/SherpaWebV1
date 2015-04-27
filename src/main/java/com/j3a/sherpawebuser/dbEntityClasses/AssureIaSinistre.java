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
@Table(name = "assure_ia_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AssureIaSinistre.findAll", query = "SELECT a FROM AssureIaSinistre a"),
    @NamedQuery(name = "AssureIaSinistre.findByCodeSinistre", query = "SELECT a FROM AssureIaSinistre a WHERE a.assureIaSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "AssureIaSinistre.findByNumIdentification", query = "SELECT a FROM AssureIaSinistre a WHERE a.assureIaSinistrePK.numIdentification = :numIdentification"),
    @NamedQuery(name = "AssureIaSinistre.findByRespAssure", query = "SELECT a FROM AssureIaSinistre a WHERE a.respAssure = :respAssure"),
    @NamedQuery(name = "AssureIaSinistre.findByDateSinistreIa", query = "SELECT a FROM AssureIaSinistre a WHERE a.dateSinistreIa = :dateSinistreIa")})
public class AssureIaSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AssureIaSinistrePK assureIaSinistrePK;
    @Lob
    @Size(max = 65535)
    @Column(name = "CIRCONSTANCES_SINISTRE")
    private String circonstancesSinistre;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONSEQUENCES_SINISTRE")
    private String consequencesSinistre;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RESP_ASSURE")
    private BigDecimal respAssure;
    @Column(name = "DATE_SINISTRE_IA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreIa;
    @JoinColumn(name = "NUM_IDENTIFICATION", referencedColumnName = "NUM_IDENTIFICATION", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private AssureIa assureIa;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public AssureIaSinistre() {
    }

    public AssureIaSinistre(AssureIaSinistrePK assureIaSinistrePK) {
        this.assureIaSinistrePK = assureIaSinistrePK;
    }

    public AssureIaSinistre(String codeSinistre, String numIdentification) {
        this.assureIaSinistrePK = new AssureIaSinistrePK(codeSinistre, numIdentification);
    }

    public AssureIaSinistrePK getAssureIaSinistrePK() {
        return assureIaSinistrePK;
    }

    public void setAssureIaSinistrePK(AssureIaSinistrePK assureIaSinistrePK) {
        this.assureIaSinistrePK = assureIaSinistrePK;
    }

    public String getCirconstancesSinistre() {
        return circonstancesSinistre;
    }

    public void setCirconstancesSinistre(String circonstancesSinistre) {
        this.circonstancesSinistre = circonstancesSinistre;
    }

    public String getConsequencesSinistre() {
        return consequencesSinistre;
    }

    public void setConsequencesSinistre(String consequencesSinistre) {
        this.consequencesSinistre = consequencesSinistre;
    }

    public BigDecimal getRespAssure() {
        return respAssure;
    }

    public void setRespAssure(BigDecimal respAssure) {
        this.respAssure = respAssure;
    }

    public Date getDateSinistreIa() {
        return dateSinistreIa;
    }

    public void setDateSinistreIa(Date dateSinistreIa) {
        this.dateSinistreIa = dateSinistreIa;
    }

    public AssureIa getAssureIa() {
        return assureIa;
    }

    public void setAssureIa(AssureIa assureIa) {
        this.assureIa = assureIa;
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
        hash += (assureIaSinistrePK != null ? assureIaSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AssureIaSinistre)) {
            return false;
        }
        AssureIaSinistre other = (AssureIaSinistre) object;
        if ((this.assureIaSinistrePK == null && other.assureIaSinistrePK != null) || (this.assureIaSinistrePK != null && !this.assureIaSinistrePK.equals(other.assureIaSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AssureIaSinistre[ assureIaSinistrePK=" + assureIaSinistrePK + " ]";
    }
    
}
