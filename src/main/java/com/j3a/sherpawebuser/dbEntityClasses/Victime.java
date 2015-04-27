/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "victime")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Victime.findAll", query = "SELECT v FROM Victime v"),
    @NamedQuery(name = "Victime.findByNumVictime", query = "SELECT v FROM Victime v WHERE v.numVictime = :numVictime"),
    @NamedQuery(name = "Victime.findByNomVictime", query = "SELECT v FROM Victime v WHERE v.nomVictime = :nomVictime"),
    @NamedQuery(name = "Victime.findByPrenomVictime", query = "SELECT v FROM Victime v WHERE v.prenomVictime = :prenomVictime"),
    @NamedQuery(name = "Victime.findByDateNaissVictime", query = "SELECT v FROM Victime v WHERE v.dateNaissVictime = :dateNaissVictime"),
    @NamedQuery(name = "Victime.findByAdresseVictime", query = "SELECT v FROM Victime v WHERE v.adresseVictime = :adresseVictime"),
    @NamedQuery(name = "Victime.findByProfessionVictime", query = "SELECT v FROM Victime v WHERE v.professionVictime = :professionVictime"),
    @NamedQuery(name = "Victime.findByEtatVictime", query = "SELECT v FROM Victime v WHERE v.etatVictime = :etatVictime"),
    @NamedQuery(name = "Victime.findBySommePrejudice", query = "SELECT v FROM Victime v WHERE v.sommePrejudice = :sommePrejudice"),
    @NamedQuery(name = "Victime.findByEtatIndemniser", query = "SELECT v FROM Victime v WHERE v.etatIndemniser = :etatIndemniser")})
public class Victime implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "NUM_VICTIME")
    private String numVictime;
    @Size(max = 30)
    @Column(name = "NOM_VICTIME")
    private String nomVictime;
    @Size(max = 60)
    @Column(name = "PRENOM_VICTIME")
    private String prenomVictime;
    @Column(name = "DATE_NAISS_VICTIME")
    @Temporal(TemporalType.DATE)
    private Date dateNaissVictime;
    @Size(max = 100)
    @Column(name = "ADRESSE_VICTIME")
    private String adresseVictime;
    @Size(max = 30)
    @Column(name = "PROFESSION_VICTIME")
    private String professionVictime;
    @Size(max = 20)
    @Column(name = "ETAT_VICTIME")
    private String etatVictime;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "SOMME_PREJUDICE")
    private BigDecimal sommePrejudice;
    @Column(name = "ETAT_INDEMNISER")
    private Boolean etatIndemniser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numVictime")
    private List<AyantDroit> ayantDroitList;
    @OneToMany(mappedBy = "numVictime")
    private List<Prejudice> prejudiceList;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE")
    @ManyToOne(optional = false)
    private Sinistre codeSinistre;
    @JoinColumn(name = "REFERENCE_TIERS", referencedColumnName = "REFERENCE_TIERS")
    @ManyToOne
    private Recours referenceTiers;
    @OneToMany(mappedBy = "numVictime")
    private List<ReglementSinistre> reglementSinistreList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numVictime")
    private List<ActeMedical> acteMedicalList;

    public Victime() {
    }

    public Victime(String numVictime) {
        this.numVictime = numVictime;
    }

    public String getNumVictime() {
        return numVictime;
    }

    public void setNumVictime(String numVictime) {
        this.numVictime = numVictime;
    }

    public String getNomVictime() {
        return nomVictime;
    }

    public void setNomVictime(String nomVictime) {
        this.nomVictime = nomVictime;
    }

    public String getPrenomVictime() {
        return prenomVictime;
    }

    public void setPrenomVictime(String prenomVictime) {
        this.prenomVictime = prenomVictime;
    }

    public Date getDateNaissVictime() {
        return dateNaissVictime;
    }

    public void setDateNaissVictime(Date dateNaissVictime) {
        this.dateNaissVictime = dateNaissVictime;
    }

    public String getAdresseVictime() {
        return adresseVictime;
    }

    public void setAdresseVictime(String adresseVictime) {
        this.adresseVictime = adresseVictime;
    }

    public String getProfessionVictime() {
        return professionVictime;
    }

    public void setProfessionVictime(String professionVictime) {
        this.professionVictime = professionVictime;
    }

    public String getEtatVictime() {
        return etatVictime;
    }

    public void setEtatVictime(String etatVictime) {
        this.etatVictime = etatVictime;
    }

    public BigDecimal getSommePrejudice() {
        return sommePrejudice;
    }

    public void setSommePrejudice(BigDecimal sommePrejudice) {
        this.sommePrejudice = sommePrejudice;
    }

    public Boolean getEtatIndemniser() {
        return etatIndemniser;
    }

    public void setEtatIndemniser(Boolean etatIndemniser) {
        this.etatIndemniser = etatIndemniser;
    }

    @XmlTransient
    public List<AyantDroit> getAyantDroitList() {
        return ayantDroitList;
    }

    public void setAyantDroitList(List<AyantDroit> ayantDroitList) {
        this.ayantDroitList = ayantDroitList;
    }

    @XmlTransient
    public List<Prejudice> getPrejudiceList() {
        return prejudiceList;
    }

    public void setPrejudiceList(List<Prejudice> prejudiceList) {
        this.prejudiceList = prejudiceList;
    }

    public Sinistre getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(Sinistre codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public Recours getReferenceTiers() {
        return referenceTiers;
    }

    public void setReferenceTiers(Recours referenceTiers) {
        this.referenceTiers = referenceTiers;
    }

    @XmlTransient
    public List<ReglementSinistre> getReglementSinistreList() {
        return reglementSinistreList;
    }

    public void setReglementSinistreList(List<ReglementSinistre> reglementSinistreList) {
        this.reglementSinistreList = reglementSinistreList;
    }

    @XmlTransient
    public List<ActeMedical> getActeMedicalList() {
        return acteMedicalList;
    }

    public void setActeMedicalList(List<ActeMedical> acteMedicalList) {
        this.acteMedicalList = acteMedicalList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numVictime != null ? numVictime.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Victime)) {
            return false;
        }
        Victime other = (Victime) object;
        if ((this.numVictime == null && other.numVictime != null) || (this.numVictime != null && !this.numVictime.equals(other.numVictime))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Victime[ numVictime=" + numVictime + " ]";
    }
    
}
