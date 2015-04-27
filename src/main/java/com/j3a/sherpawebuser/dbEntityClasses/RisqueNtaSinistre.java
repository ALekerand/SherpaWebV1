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
@Table(name = "risque_nta_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RisqueNtaSinistre.findAll", query = "SELECT r FROM RisqueNtaSinistre r"),
    @NamedQuery(name = "RisqueNtaSinistre.findByCodeSinistre", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.risqueNtaSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "RisqueNtaSinistre.findByCodeRisquenta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.risqueNtaSinistrePK.codeRisquenta = :codeRisquenta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByNatureRisqueNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.natureRisqueNta = :natureRisqueNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByDomageMatNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.domageMatNta = :domageMatNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByDomageCorpNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.domageCorpNta = :domageCorpNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByRespAssureNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.respAssureNta = :respAssureNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByNbreVictimeNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.nbreVictimeNta = :nbreVictimeNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByNbreBlesseNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.nbreBlesseNta = :nbreBlesseNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByNbreDecesNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.nbreDecesNta = :nbreDecesNta"),
    @NamedQuery(name = "RisqueNtaSinistre.findByDateSinistreNta", query = "SELECT r FROM RisqueNtaSinistre r WHERE r.dateSinistreNta = :dateSinistreNta")})
public class RisqueNtaSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RisqueNtaSinistrePK risqueNtaSinistrePK;
    @Lob
    @Size(max = 65535)
    @Column(name = "CIRCONSTANCE_SINISTRE_NTA")
    private String circonstanceSinistreNta;
    @Size(max = 80)
    @Column(name = "NATURE_RISQUE_NTA")
    private String natureRisqueNta;
    @Column(name = "DOMAGE_MAT_NTA")
    private Boolean domageMatNta;
    @Column(name = "DOMAGE_CORP_NTA")
    private Boolean domageCorpNta;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RESP_ASSURE_NTA")
    private BigDecimal respAssureNta;
    @Column(name = "NBRE_VICTIME_NTA")
    private Integer nbreVictimeNta;
    @Column(name = "NBRE_BLESSE_NTA")
    private Integer nbreBlesseNta;
    @Column(name = "NBRE_DECES_NTA")
    private Integer nbreDecesNta;
    @Column(name = "DATE_SINISTRE_NTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreNta;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;
    @JoinColumn(name = "CODE_RISQUENTA", referencedColumnName = "CODE_RISQUENTA", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private RisqueNta risqueNta;

    public RisqueNtaSinistre() {
    }

    public RisqueNtaSinistre(RisqueNtaSinistrePK risqueNtaSinistrePK) {
        this.risqueNtaSinistrePK = risqueNtaSinistrePK;
    }

    public RisqueNtaSinistre(String codeSinistre, String codeRisquenta) {
        this.risqueNtaSinistrePK = new RisqueNtaSinistrePK(codeSinistre, codeRisquenta);
    }

    public RisqueNtaSinistrePK getRisqueNtaSinistrePK() {
        return risqueNtaSinistrePK;
    }

    public void setRisqueNtaSinistrePK(RisqueNtaSinistrePK risqueNtaSinistrePK) {
        this.risqueNtaSinistrePK = risqueNtaSinistrePK;
    }

    public String getCirconstanceSinistreNta() {
        return circonstanceSinistreNta;
    }

    public void setCirconstanceSinistreNta(String circonstanceSinistreNta) {
        this.circonstanceSinistreNta = circonstanceSinistreNta;
    }

    public String getNatureRisqueNta() {
        return natureRisqueNta;
    }

    public void setNatureRisqueNta(String natureRisqueNta) {
        this.natureRisqueNta = natureRisqueNta;
    }

    public Boolean getDomageMatNta() {
        return domageMatNta;
    }

    public void setDomageMatNta(Boolean domageMatNta) {
        this.domageMatNta = domageMatNta;
    }

    public Boolean getDomageCorpNta() {
        return domageCorpNta;
    }

    public void setDomageCorpNta(Boolean domageCorpNta) {
        this.domageCorpNta = domageCorpNta;
    }

    public BigDecimal getRespAssureNta() {
        return respAssureNta;
    }

    public void setRespAssureNta(BigDecimal respAssureNta) {
        this.respAssureNta = respAssureNta;
    }

    public Integer getNbreVictimeNta() {
        return nbreVictimeNta;
    }

    public void setNbreVictimeNta(Integer nbreVictimeNta) {
        this.nbreVictimeNta = nbreVictimeNta;
    }

    public Integer getNbreBlesseNta() {
        return nbreBlesseNta;
    }

    public void setNbreBlesseNta(Integer nbreBlesseNta) {
        this.nbreBlesseNta = nbreBlesseNta;
    }

    public Integer getNbreDecesNta() {
        return nbreDecesNta;
    }

    public void setNbreDecesNta(Integer nbreDecesNta) {
        this.nbreDecesNta = nbreDecesNta;
    }

    public Date getDateSinistreNta() {
        return dateSinistreNta;
    }

    public void setDateSinistreNta(Date dateSinistreNta) {
        this.dateSinistreNta = dateSinistreNta;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    public RisqueNta getRisqueNta() {
        return risqueNta;
    }

    public void setRisqueNta(RisqueNta risqueNta) {
        this.risqueNta = risqueNta;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (risqueNtaSinistrePK != null ? risqueNtaSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RisqueNtaSinistre)) {
            return false;
        }
        RisqueNtaSinistre other = (RisqueNtaSinistre) object;
        if ((this.risqueNtaSinistrePK == null && other.risqueNtaSinistrePK != null) || (this.risqueNtaSinistrePK != null && !this.risqueNtaSinistrePK.equals(other.risqueNtaSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.RisqueNtaSinistre[ risqueNtaSinistrePK=" + risqueNtaSinistrePK + " ]";
    }
    
}
