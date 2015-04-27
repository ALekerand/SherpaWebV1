/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "avenant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Avenant.findAll", query = "SELECT a FROM Avenant a"),
    @NamedQuery(name = "Avenant.findByNumAvenant", query = "SELECT a FROM Avenant a WHERE a.numAvenant = :numAvenant"),
    @NamedQuery(name = "Avenant.findByDateAvenant", query = "SELECT a FROM Avenant a WHERE a.dateAvenant = :dateAvenant"),
    @NamedQuery(name = "Avenant.findByEffet", query = "SELECT a FROM Avenant a WHERE a.effet = :effet"),
    @NamedQuery(name = "Avenant.findByDateEmission", query = "SELECT a FROM Avenant a WHERE a.dateEmission = :dateEmission"),
    @NamedQuery(name = "Avenant.findByEcheance", query = "SELECT a FROM Avenant a WHERE a.echeance = :echeance"),
    @NamedQuery(name = "Avenant.findByDuree", query = "SELECT a FROM Avenant a WHERE a.duree = :duree"),
    @NamedQuery(name = "Avenant.findByResiliation", query = "SELECT a FROM Avenant a WHERE a.resiliation = :resiliation"),
    @NamedQuery(name = "Avenant.findByObservation", query = "SELECT a FROM Avenant a WHERE a.observation = :observation"),
    @NamedQuery(name = "Avenant.findByEnvoyerMail", query = "SELECT a FROM Avenant a WHERE a.envoyerMail = :envoyerMail"),
    @NamedQuery(name = "Avenant.findByMouvement", query = "SELECT a FROM Avenant a WHERE a.mouvement = :mouvement")})
public class Avenant implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "NUM_AVENANT")
    private String numAvenant;
    @Column(name = "DATE_AVENANT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateAvenant;
    @Column(name = "EFFET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date effet;
    @Column(name = "DATE_EMISSION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateEmission;
    @Column(name = "ECHEANCE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date echeance;
    @Column(name = "DUREE")
    private Short duree;
    @Column(name = "RESILIATION")
    @Temporal(TemporalType.TIMESTAMP)
    private Date resiliation;
    @Size(max = 50)
    @Column(name = "OBSERVATION")
    private String observation;
    @Column(name = "ENVOYER_MAIL")
    private Short envoyerMail;
    @Size(max = 50)
    @Column(name = "MOUVEMENT")
    private String mouvement;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvenantRisqueNta> avenantRisqueNtaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvListeCorpsEngin> avListeCorpsEnginList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvListeHabitation> avListeHabitationList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvenantListeGestionConfie> avenantListeGestionConfieList;
    @JoinColumn(name = "ID_VEHICULES_ASSURES", referencedColumnName = "ID_VEHICULES_ASSURES")
    @ManyToOne
    private VehiculesAssures idVehiculesAssures;
    @JoinColumn(name = "NUM_POLICE", referencedColumnName = "NUM_POLICE")
    @ManyToOne(optional = false)
    private Contrat numPolice;
    @JoinColumn(name = "CODE_UTILISATEUR", referencedColumnName = "CODE_UTILISATEUR")
    @ManyToOne(optional = false)
    private Utilisateur codeUtilisateur;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne
    private Exercice codeexercice;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvListeAssureIa> avListeAssureIaList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvTrafic> avTraficList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "avenant")
    private List<AvListeAdherent> avListeAdherentList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numAvenant")
    private List<Quittance> quittanceList;

    public Avenant() {
    }

    public Avenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public String getNumAvenant() {
        return numAvenant;
    }

    public void setNumAvenant(String numAvenant) {
        this.numAvenant = numAvenant;
    }

    public Date getDateAvenant() {
        return dateAvenant;
    }

    public void setDateAvenant(Date dateAvenant) {
        this.dateAvenant = dateAvenant;
    }

    public Date getEffet() {
        return effet;
    }

    public void setEffet(Date effet) {
        this.effet = effet;
    }

    public Date getDateEmission() {
        return dateEmission;
    }

    public void setDateEmission(Date dateEmission) {
        this.dateEmission = dateEmission;
    }

    public Date getEcheance() {
        return echeance;
    }

    public void setEcheance(Date echeance) {
        this.echeance = echeance;
    }

    public Short getDuree() {
        return duree;
    }

    public void setDuree(Short duree) {
        this.duree = duree;
    }

    public Date getResiliation() {
        return resiliation;
    }

    public void setResiliation(Date resiliation) {
        this.resiliation = resiliation;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }

    public Short getEnvoyerMail() {
        return envoyerMail;
    }

    public void setEnvoyerMail(Short envoyerMail) {
        this.envoyerMail = envoyerMail;
    }

    public String getMouvement() {
        return mouvement;
    }

    public void setMouvement(String mouvement) {
        this.mouvement = mouvement;
    }

    @XmlTransient
    public List<AvenantRisqueNta> getAvenantRisqueNtaList() {
        return avenantRisqueNtaList;
    }

    public void setAvenantRisqueNtaList(List<AvenantRisqueNta> avenantRisqueNtaList) {
        this.avenantRisqueNtaList = avenantRisqueNtaList;
    }

    @XmlTransient
    public List<AvListeCorpsEngin> getAvListeCorpsEnginList() {
        return avListeCorpsEnginList;
    }

    public void setAvListeCorpsEnginList(List<AvListeCorpsEngin> avListeCorpsEnginList) {
        this.avListeCorpsEnginList = avListeCorpsEnginList;
    }

    @XmlTransient
    public List<AvListeHabitation> getAvListeHabitationList() {
        return avListeHabitationList;
    }

    public void setAvListeHabitationList(List<AvListeHabitation> avListeHabitationList) {
        this.avListeHabitationList = avListeHabitationList;
    }

    @XmlTransient
    public List<AvenantListeGestionConfie> getAvenantListeGestionConfieList() {
        return avenantListeGestionConfieList;
    }

    public void setAvenantListeGestionConfieList(List<AvenantListeGestionConfie> avenantListeGestionConfieList) {
        this.avenantListeGestionConfieList = avenantListeGestionConfieList;
    }

    public VehiculesAssures getIdVehiculesAssures() {
        return idVehiculesAssures;
    }

    public void setIdVehiculesAssures(VehiculesAssures idVehiculesAssures) {
        this.idVehiculesAssures = idVehiculesAssures;
    }

    public Contrat getNumPolice() {
        return numPolice;
    }

    public void setNumPolice(Contrat numPolice) {
        this.numPolice = numPolice;
    }

    public Utilisateur getCodeUtilisateur() {
        return codeUtilisateur;
    }

    public void setCodeUtilisateur(Utilisateur codeUtilisateur) {
        this.codeUtilisateur = codeUtilisateur;
    }

    public Exercice getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(Exercice codeexercice) {
        this.codeexercice = codeexercice;
    }

    @XmlTransient
    public List<AvListeAssureIa> getAvListeAssureIaList() {
        return avListeAssureIaList;
    }

    public void setAvListeAssureIaList(List<AvListeAssureIa> avListeAssureIaList) {
        this.avListeAssureIaList = avListeAssureIaList;
    }

    @XmlTransient
    public List<AvTrafic> getAvTraficList() {
        return avTraficList;
    }

    public void setAvTraficList(List<AvTrafic> avTraficList) {
        this.avTraficList = avTraficList;
    }

    @XmlTransient
    public List<AvListeAdherent> getAvListeAdherentList() {
        return avListeAdherentList;
    }

    public void setAvListeAdherentList(List<AvListeAdherent> avListeAdherentList) {
        this.avListeAdherentList = avListeAdherentList;
    }

    @XmlTransient
    public List<Quittance> getQuittanceList() {
        return quittanceList;
    }

    public void setQuittanceList(List<Quittance> quittanceList) {
        this.quittanceList = quittanceList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numAvenant != null ? numAvenant.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Avenant)) {
            return false;
        }
        Avenant other = (Avenant) object;
        if ((this.numAvenant == null && other.numAvenant != null) || (this.numAvenant != null && !this.numAvenant.equals(other.numAvenant))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Avenant[ numAvenant=" + numAvenant + " ]";
    }
    
}
