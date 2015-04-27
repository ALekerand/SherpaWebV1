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
@Table(name = "aliment_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AlimentSinistre.findAll", query = "SELECT a FROM AlimentSinistre a"),
    @NamedQuery(name = "AlimentSinistre.findByCodeSinistre", query = "SELECT a FROM AlimentSinistre a WHERE a.alimentSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "AlimentSinistre.findByCodeAliment", query = "SELECT a FROM AlimentSinistre a WHERE a.alimentSinistrePK.codeAliment = :codeAliment"),
    @NamedQuery(name = "AlimentSinistre.findByDateArriveeFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.dateArriveeFaculte = :dateArriveeFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByBnlFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.bnlFaculte = :bnlFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByRefAssureSinistreFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.refAssureSinistreFaculte = :refAssureSinistreFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByLieuConn", query = "SELECT a FROM AlimentSinistre a WHERE a.lieuConn = :lieuConn"),
    @NamedQuery(name = "AlimentSinistre.findByQteAssFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.qteAssFaculte = :qteAssFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByQtePerdueFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.qtePerdueFaculte = :qtePerdueFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByLtaFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.ltaFaculte = :ltaFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByRespTiersFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.respTiersFaculte = :respTiersFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByDateLettreVoiture", query = "SELECT a FROM AlimentSinistre a WHERE a.dateLettreVoiture = :dateLettreVoiture"),
    @NamedQuery(name = "AlimentSinistre.findByDateSinistreFaculte", query = "SELECT a FROM AlimentSinistre a WHERE a.dateSinistreFaculte = :dateSinistreFaculte"),
    @NamedQuery(name = "AlimentSinistre.findByDateConn", query = "SELECT a FROM AlimentSinistre a WHERE a.dateConn = :dateConn")})
public class AlimentSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected AlimentSinistrePK alimentSinistrePK;
    @Lob
    @Size(max = 65535)
    @Column(name = "CIRCONSTANCES_SINISTRE_FACULTE")
    private String circonstancesSinistreFaculte;
    @Lob
    @Size(max = 65535)
    @Column(name = "DOMMAGES_SINISTRE_FACULTE")
    private String dommagesSinistreFaculte;
    @Column(name = "DATE_ARRIVEE_FACULTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateArriveeFaculte;
    @Size(max = 10)
    @Column(name = "BNL_FACULTE")
    private String bnlFaculte;
    @Size(max = 20)
    @Column(name = "REF_ASSURE_SINISTRE_FACULTE")
    private String refAssureSinistreFaculte;
    @Size(max = 60)
    @Column(name = "LIEU_CONN")
    private String lieuConn;
    @Column(name = "QTE_ASS_FACULTE")
    private Integer qteAssFaculte;
    @Column(name = "QTE_PERDUE_FACULTE")
    private Integer qtePerdueFaculte;
    @Size(max = 60)
    @Column(name = "LTA_FACULTE")
    private String ltaFaculte;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RESP_TIERS_FACULTE")
    private BigDecimal respTiersFaculte;
    @Column(name = "DATE_LETTRE_VOITURE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateLettreVoiture;
    @Lob
    @Size(max = 65535)
    @Column(name = "LETTRE_VOITURE")
    private String lettreVoiture;
    @Column(name = "DATE_SINISTRE_FACULTE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreFaculte;
    @Column(name = "DATE_CONN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateConn;
    @JoinColumn(name = "CODE_ALIMENT", referencedColumnName = "CODE_ALIMENT", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Aliment aliment;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public AlimentSinistre() {
    }

    public AlimentSinistre(AlimentSinistrePK alimentSinistrePK) {
        this.alimentSinistrePK = alimentSinistrePK;
    }

    public AlimentSinistre(String codeSinistre, String codeAliment) {
        this.alimentSinistrePK = new AlimentSinistrePK(codeSinistre, codeAliment);
    }

    public AlimentSinistrePK getAlimentSinistrePK() {
        return alimentSinistrePK;
    }

    public void setAlimentSinistrePK(AlimentSinistrePK alimentSinistrePK) {
        this.alimentSinistrePK = alimentSinistrePK;
    }

    public String getCirconstancesSinistreFaculte() {
        return circonstancesSinistreFaculte;
    }

    public void setCirconstancesSinistreFaculte(String circonstancesSinistreFaculte) {
        this.circonstancesSinistreFaculte = circonstancesSinistreFaculte;
    }

    public String getDommagesSinistreFaculte() {
        return dommagesSinistreFaculte;
    }

    public void setDommagesSinistreFaculte(String dommagesSinistreFaculte) {
        this.dommagesSinistreFaculte = dommagesSinistreFaculte;
    }

    public Date getDateArriveeFaculte() {
        return dateArriveeFaculte;
    }

    public void setDateArriveeFaculte(Date dateArriveeFaculte) {
        this.dateArriveeFaculte = dateArriveeFaculte;
    }

    public String getBnlFaculte() {
        return bnlFaculte;
    }

    public void setBnlFaculte(String bnlFaculte) {
        this.bnlFaculte = bnlFaculte;
    }

    public String getRefAssureSinistreFaculte() {
        return refAssureSinistreFaculte;
    }

    public void setRefAssureSinistreFaculte(String refAssureSinistreFaculte) {
        this.refAssureSinistreFaculte = refAssureSinistreFaculte;
    }

    public String getLieuConn() {
        return lieuConn;
    }

    public void setLieuConn(String lieuConn) {
        this.lieuConn = lieuConn;
    }

    public Integer getQteAssFaculte() {
        return qteAssFaculte;
    }

    public void setQteAssFaculte(Integer qteAssFaculte) {
        this.qteAssFaculte = qteAssFaculte;
    }

    public Integer getQtePerdueFaculte() {
        return qtePerdueFaculte;
    }

    public void setQtePerdueFaculte(Integer qtePerdueFaculte) {
        this.qtePerdueFaculte = qtePerdueFaculte;
    }

    public String getLtaFaculte() {
        return ltaFaculte;
    }

    public void setLtaFaculte(String ltaFaculte) {
        this.ltaFaculte = ltaFaculte;
    }

    public BigDecimal getRespTiersFaculte() {
        return respTiersFaculte;
    }

    public void setRespTiersFaculte(BigDecimal respTiersFaculte) {
        this.respTiersFaculte = respTiersFaculte;
    }

    public Date getDateLettreVoiture() {
        return dateLettreVoiture;
    }

    public void setDateLettreVoiture(Date dateLettreVoiture) {
        this.dateLettreVoiture = dateLettreVoiture;
    }

    public String getLettreVoiture() {
        return lettreVoiture;
    }

    public void setLettreVoiture(String lettreVoiture) {
        this.lettreVoiture = lettreVoiture;
    }

    public Date getDateSinistreFaculte() {
        return dateSinistreFaculte;
    }

    public void setDateSinistreFaculte(Date dateSinistreFaculte) {
        this.dateSinistreFaculte = dateSinistreFaculte;
    }

    public Date getDateConn() {
        return dateConn;
    }

    public void setDateConn(Date dateConn) {
        this.dateConn = dateConn;
    }

    public Aliment getAliment() {
        return aliment;
    }

    public void setAliment(Aliment aliment) {
        this.aliment = aliment;
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
        hash += (alimentSinistrePK != null ? alimentSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AlimentSinistre)) {
            return false;
        }
        AlimentSinistre other = (AlimentSinistre) object;
        if ((this.alimentSinistrePK == null && other.alimentSinistrePK != null) || (this.alimentSinistrePK != null && !this.alimentSinistrePK.equals(other.alimentSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.AlimentSinistre[ alimentSinistrePK=" + alimentSinistrePK + " ]";
    }
    
}
