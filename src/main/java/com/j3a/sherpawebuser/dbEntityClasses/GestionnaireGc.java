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
@Table(name = "gestionnaire_gc")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GestionnaireGc.findAll", query = "SELECT g FROM GestionnaireGc g"),
    @NamedQuery(name = "GestionnaireGc.findByCodeGestionConfie", query = "SELECT g FROM GestionnaireGc g WHERE g.gestionnaireGcPK.codeGestionConfie = :codeGestionConfie"),
    @NamedQuery(name = "GestionnaireGc.findByCodeGestionnaire", query = "SELECT g FROM GestionnaireGc g WHERE g.gestionnaireGcPK.codeGestionnaire = :codeGestionnaire"),
    @NamedQuery(name = "GestionnaireGc.findByTauxComGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.tauxComGestgc = :tauxComGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByComGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.comGestgc = :comGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByTauxAccGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.tauxAccGestgc = :tauxAccGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByAccGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.accGestgc = :accGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByTauxTvaGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.tauxTvaGestgc = :tauxTvaGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByTvaGestgc", query = "SELECT g FROM GestionnaireGc g WHERE g.tvaGestgc = :tvaGestgc"),
    @NamedQuery(name = "GestionnaireGc.findByMinCgrie", query = "SELECT g FROM GestionnaireGc g WHERE g.minCgrie = :minCgrie"),
    @NamedQuery(name = "GestionnaireGc.findByDateGestionnaireGc", query = "SELECT g FROM GestionnaireGc g WHERE g.dateGestionnaireGc = :dateGestionnaireGc"),
    @NamedQuery(name = "GestionnaireGc.findByDateAvAdherent", query = "SELECT g FROM GestionnaireGc g WHERE g.dateAvAdherent = :dateAvAdherent")})
public class GestionnaireGc implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GestionnaireGcPK gestionnaireGcPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_GESTGC")
    private BigDecimal tauxComGestgc;
    @Column(name = "COM_GESTGC")
    private BigDecimal comGestgc;
    @Column(name = "TAUX_ACC_GESTGC")
    private BigDecimal tauxAccGestgc;
    @Column(name = "ACC_GESTGC")
    private BigDecimal accGestgc;
    @Column(name = "TAUX_TVA_GESTGC")
    private BigDecimal tauxTvaGestgc;
    @Column(name = "TVA_GESTGC")
    private BigDecimal tvaGestgc;
    @Column(name = "MIN_CGRIE")
    private BigDecimal minCgrie;
    @Column(name = "DATE_GESTIONNAIRE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateGestionnaireGc;
    @Column(name = "DATE_AV_ADHERENT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvAdherent;
    @JoinColumn(name = "CODE_GESTIONNAIRE", referencedColumnName = "CODE_GESTIONNAIRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Gestionnaire gestionnaire;
    @JoinColumn(name = "CODE_GESTION_CONFIE", referencedColumnName = "CODE_GESTION_CONFIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GestionConfiee gestionConfiee;

    public GestionnaireGc() {
    }

    public GestionnaireGc(GestionnaireGcPK gestionnaireGcPK) {
        this.gestionnaireGcPK = gestionnaireGcPK;
    }

    public GestionnaireGc(String codeGestionConfie, String codeGestionnaire) {
        this.gestionnaireGcPK = new GestionnaireGcPK(codeGestionConfie, codeGestionnaire);
    }

    public GestionnaireGcPK getGestionnaireGcPK() {
        return gestionnaireGcPK;
    }

    public void setGestionnaireGcPK(GestionnaireGcPK gestionnaireGcPK) {
        this.gestionnaireGcPK = gestionnaireGcPK;
    }

    public BigDecimal getTauxComGestgc() {
        return tauxComGestgc;
    }

    public void setTauxComGestgc(BigDecimal tauxComGestgc) {
        this.tauxComGestgc = tauxComGestgc;
    }

    public BigDecimal getComGestgc() {
        return comGestgc;
    }

    public void setComGestgc(BigDecimal comGestgc) {
        this.comGestgc = comGestgc;
    }

    public BigDecimal getTauxAccGestgc() {
        return tauxAccGestgc;
    }

    public void setTauxAccGestgc(BigDecimal tauxAccGestgc) {
        this.tauxAccGestgc = tauxAccGestgc;
    }

    public BigDecimal getAccGestgc() {
        return accGestgc;
    }

    public void setAccGestgc(BigDecimal accGestgc) {
        this.accGestgc = accGestgc;
    }

    public BigDecimal getTauxTvaGestgc() {
        return tauxTvaGestgc;
    }

    public void setTauxTvaGestgc(BigDecimal tauxTvaGestgc) {
        this.tauxTvaGestgc = tauxTvaGestgc;
    }

    public BigDecimal getTvaGestgc() {
        return tvaGestgc;
    }

    public void setTvaGestgc(BigDecimal tvaGestgc) {
        this.tvaGestgc = tvaGestgc;
    }

    public BigDecimal getMinCgrie() {
        return minCgrie;
    }

    public void setMinCgrie(BigDecimal minCgrie) {
        this.minCgrie = minCgrie;
    }

    public Date getDateGestionnaireGc() {
        return dateGestionnaireGc;
    }

    public void setDateGestionnaireGc(Date dateGestionnaireGc) {
        this.dateGestionnaireGc = dateGestionnaireGc;
    }

    public Date getDateAvAdherent() {
        return dateAvAdherent;
    }

    public void setDateAvAdherent(Date dateAvAdherent) {
        this.dateAvAdherent = dateAvAdherent;
    }

    public Gestionnaire getGestionnaire() {
        return gestionnaire;
    }

    public void setGestionnaire(Gestionnaire gestionnaire) {
        this.gestionnaire = gestionnaire;
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
        hash += (gestionnaireGcPK != null ? gestionnaireGcPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionnaireGc)) {
            return false;
        }
        GestionnaireGc other = (GestionnaireGc) object;
        if ((this.gestionnaireGcPK == null && other.gestionnaireGcPK != null) || (this.gestionnaireGcPK != null && !this.gestionnaireGcPK.equals(other.gestionnaireGcPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionnaireGc[ gestionnaireGcPK=" + gestionnaireGcPK + " ]";
    }
    
}
