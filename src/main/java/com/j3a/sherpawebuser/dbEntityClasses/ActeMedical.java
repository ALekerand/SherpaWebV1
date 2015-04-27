/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "acte_medical")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActeMedical.findAll", query = "SELECT a FROM ActeMedical a"),
    @NamedQuery(name = "ActeMedical.findByReferenceActe", query = "SELECT a FROM ActeMedical a WHERE a.referenceActe = :referenceActe"),
    @NamedQuery(name = "ActeMedical.findByDateActeMedical", query = "SELECT a FROM ActeMedical a WHERE a.dateActeMedical = :dateActeMedical"),
    @NamedQuery(name = "ActeMedical.findByGarantieSupport", query = "SELECT a FROM ActeMedical a WHERE a.garantieSupport = :garantieSupport")})
public class ActeMedical implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "REFERENCE_ACTE")
    private String referenceActe;
    @Column(name = "DATE_ACTE_MEDICAL")
    @Temporal(TemporalType.DATE)
    private Date dateActeMedical;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONCLUSION")
    private String conclusion;
    @Size(max = 100)
    @Column(name = "GARANTIE_SUPPORT")
    private String garantieSupport;
    @JoinColumn(name = "CODE_FACTURE", referencedColumnName = "CODE_FACTURE")
    @ManyToOne(optional = false)
    private Facture codeFacture;
    @JoinColumn(name = "CODE_MEDECIN", referencedColumnName = "CODE_MEDECIN")
    @ManyToOne(optional = false)
    private Medecin codeMedecin;
    @JoinColumn(name = "NUM_VICTIME", referencedColumnName = "NUM_VICTIME")
    @ManyToOne(optional = false)
    private Victime numVictime;

    public ActeMedical() {
    }

    public ActeMedical(String referenceActe) {
        this.referenceActe = referenceActe;
    }

    public String getReferenceActe() {
        return referenceActe;
    }

    public void setReferenceActe(String referenceActe) {
        this.referenceActe = referenceActe;
    }

    public Date getDateActeMedical() {
        return dateActeMedical;
    }

    public void setDateActeMedical(Date dateActeMedical) {
        this.dateActeMedical = dateActeMedical;
    }

    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getGarantieSupport() {
        return garantieSupport;
    }

    public void setGarantieSupport(String garantieSupport) {
        this.garantieSupport = garantieSupport;
    }

    public Facture getCodeFacture() {
        return codeFacture;
    }

    public void setCodeFacture(Facture codeFacture) {
        this.codeFacture = codeFacture;
    }

    public Medecin getCodeMedecin() {
        return codeMedecin;
    }

    public void setCodeMedecin(Medecin codeMedecin) {
        this.codeMedecin = codeMedecin;
    }

    public Victime getNumVictime() {
        return numVictime;
    }

    public void setNumVictime(Victime numVictime) {
        this.numVictime = numVictime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (referenceActe != null ? referenceActe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ActeMedical)) {
            return false;
        }
        ActeMedical other = (ActeMedical) object;
        if ((this.referenceActe == null && other.referenceActe != null) || (this.referenceActe != null && !this.referenceActe.equals(other.referenceActe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ActeMedical[ referenceActe=" + referenceActe + " ]";
    }
    
}
