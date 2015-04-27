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
@Table(name = "gestion_confiee_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GestionConfieeSinistre.findAll", query = "SELECT g FROM GestionConfieeSinistre g"),
    @NamedQuery(name = "GestionConfieeSinistre.findByCodeGestionConfie", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.gestionConfieeSinistrePK.codeGestionConfie = :codeGestionConfie"),
    @NamedQuery(name = "GestionConfieeSinistre.findByCodeSinistre", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.gestionConfieeSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "GestionConfieeSinistre.findByNummFactureGestionnaireGc", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.nummFactureGestionnaireGc = :nummFactureGestionnaireGc"),
    @NamedQuery(name = "GestionConfieeSinistre.findByDateSinistreGc", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.dateSinistreGc = :dateSinistreGc"),
    @NamedQuery(name = "GestionConfieeSinistre.findByDateDebutSinistreGc", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.dateDebutSinistreGc = :dateDebutSinistreGc"),
    @NamedQuery(name = "GestionConfieeSinistre.findByDateFinSinistreGc", query = "SELECT g FROM GestionConfieeSinistre g WHERE g.dateFinSinistreGc = :dateFinSinistreGc")})
public class GestionConfieeSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GestionConfieeSinistrePK gestionConfieeSinistrePK;
    @Size(max = 20)
    @Column(name = "NUMM_FACTURE_GESTIONNAIRE_GC")
    private String nummFactureGestionnaireGc;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONSEQUENCES_SINISTRE_GC")
    private String consequencesSinistreGc;
    @Lob
    @Size(max = 65535)
    @Column(name = "COMMENTAIRE_SINISTRE_GC")
    private String commentaireSinistreGc;
    @Column(name = "DATE_SINISTRE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreGc;
    @Column(name = "DATE_DEBUT_SINISTRE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateDebutSinistreGc;
    @Column(name = "DATE_FIN_SINISTRE_GC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateFinSinistreGc;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;
    @JoinColumn(name = "CODE_GESTION_CONFIE", referencedColumnName = "CODE_GESTION_CONFIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private GestionConfiee gestionConfiee;

    public GestionConfieeSinistre() {
    }

    public GestionConfieeSinistre(GestionConfieeSinistrePK gestionConfieeSinistrePK) {
        this.gestionConfieeSinistrePK = gestionConfieeSinistrePK;
    }

    public GestionConfieeSinistre(String codeGestionConfie, String codeSinistre) {
        this.gestionConfieeSinistrePK = new GestionConfieeSinistrePK(codeGestionConfie, codeSinistre);
    }

    public GestionConfieeSinistrePK getGestionConfieeSinistrePK() {
        return gestionConfieeSinistrePK;
    }

    public void setGestionConfieeSinistrePK(GestionConfieeSinistrePK gestionConfieeSinistrePK) {
        this.gestionConfieeSinistrePK = gestionConfieeSinistrePK;
    }

    public String getNummFactureGestionnaireGc() {
        return nummFactureGestionnaireGc;
    }

    public void setNummFactureGestionnaireGc(String nummFactureGestionnaireGc) {
        this.nummFactureGestionnaireGc = nummFactureGestionnaireGc;
    }

    public String getConsequencesSinistreGc() {
        return consequencesSinistreGc;
    }

    public void setConsequencesSinistreGc(String consequencesSinistreGc) {
        this.consequencesSinistreGc = consequencesSinistreGc;
    }

    public String getCommentaireSinistreGc() {
        return commentaireSinistreGc;
    }

    public void setCommentaireSinistreGc(String commentaireSinistreGc) {
        this.commentaireSinistreGc = commentaireSinistreGc;
    }

    public Date getDateSinistreGc() {
        return dateSinistreGc;
    }

    public void setDateSinistreGc(Date dateSinistreGc) {
        this.dateSinistreGc = dateSinistreGc;
    }

    public Date getDateDebutSinistreGc() {
        return dateDebutSinistreGc;
    }

    public void setDateDebutSinistreGc(Date dateDebutSinistreGc) {
        this.dateDebutSinistreGc = dateDebutSinistreGc;
    }

    public Date getDateFinSinistreGc() {
        return dateFinSinistreGc;
    }

    public void setDateFinSinistreGc(Date dateFinSinistreGc) {
        this.dateFinSinistreGc = dateFinSinistreGc;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
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
        hash += (gestionConfieeSinistrePK != null ? gestionConfieeSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GestionConfieeSinistre)) {
            return false;
        }
        GestionConfieeSinistre other = (GestionConfieeSinistre) object;
        if ((this.gestionConfieeSinistrePK == null && other.gestionConfieeSinistrePK != null) || (this.gestionConfieeSinistrePK != null && !this.gestionConfieeSinistrePK.equals(other.gestionConfieeSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.GestionConfieeSinistre[ gestionConfieeSinistrePK=" + gestionConfieeSinistrePK + " ]";
    }
    
}
