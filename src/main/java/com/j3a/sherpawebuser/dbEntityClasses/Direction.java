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
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
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
@Table(name = "direction")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Direction.findAll", query = "SELECT d FROM Direction d"),
    @NamedQuery(name = "Direction.findByCodePdirect", query = "SELECT d FROM Direction d WHERE d.codePdirect = :codePdirect"),
    @NamedQuery(name = "Direction.findByNomPdirect", query = "SELECT d FROM Direction d WHERE d.nomPdirect = :nomPdirect"),
    @NamedQuery(name = "Direction.findByPrenomsPdirect", query = "SELECT d FROM Direction d WHERE d.prenomsPdirect = :prenomsPdirect"),
    @NamedQuery(name = "Direction.findByDateNaisPdirect", query = "SELECT d FROM Direction d WHERE d.dateNaisPdirect = :dateNaisPdirect"),
    @NamedQuery(name = "Direction.findByLieuNaisPdirect", query = "SELECT d FROM Direction d WHERE d.lieuNaisPdirect = :lieuNaisPdirect"),
    @NamedQuery(name = "Direction.findBySexePdirect", query = "SELECT d FROM Direction d WHERE d.sexePdirect = :sexePdirect"),
    @NamedQuery(name = "Direction.findByNationalitePdirect", query = "SELECT d FROM Direction d WHERE d.nationalitePdirect = :nationalitePdirect"),
    @NamedQuery(name = "Direction.findByQualificationPdirect", query = "SELECT d FROM Direction d WHERE d.qualificationPdirect = :qualificationPdirect"),
    @NamedQuery(name = "Direction.findByGradePdirect", query = "SELECT d FROM Direction d WHERE d.gradePdirect = :gradePdirect"),
    @NamedQuery(name = "Direction.findByContactPdirect", query = "SELECT d FROM Direction d WHERE d.contactPdirect = :contactPdirect")})
public class Direction implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PDIRECT")
    private String codePdirect;
    @Size(max = 20)
    @Column(name = "NOM_PDIRECT")
    private String nomPdirect;
    @Size(max = 30)
    @Column(name = "PRENOMS_PDIRECT")
    private String prenomsPdirect;
    @Column(name = "DATE_NAIS_PDIRECT")
    @Temporal(TemporalType.DATE)
    private Date dateNaisPdirect;
    @Size(max = 30)
    @Column(name = "LIEU_NAIS_PDIRECT")
    private String lieuNaisPdirect;
    @Size(max = 10)
    @Column(name = "SEXE_PDIRECT")
    private String sexePdirect;
    @Size(max = 20)
    @Column(name = "NATIONALITE_PDIRECT")
    private String nationalitePdirect;
    @Size(max = 50)
    @Column(name = "QUALIFICATION_PDIRECT")
    private String qualificationPdirect;
    @Size(max = 50)
    @Column(name = "GRADE_PDIRECT")
    private String gradePdirect;
    @Size(max = 50)
    @Column(name = "CONTACT_PDIRECT")
    private String contactPdirect;
    @JoinTable(name = "direction_exercice", joinColumns = {
        @JoinColumn(name = "CODE_PDIRECT", referencedColumnName = "CODE_PDIRECT")}, inverseJoinColumns = {
        @JoinColumn(name = "CODE_ETAT_CIMA", referencedColumnName = "CODE_ETAT_CIMA")})
    @ManyToMany
    private List<EtatCima> etatCimaList;

    public Direction() {
    }

    public Direction(String codePdirect) {
        this.codePdirect = codePdirect;
    }

    public String getCodePdirect() {
        return codePdirect;
    }

    public void setCodePdirect(String codePdirect) {
        this.codePdirect = codePdirect;
    }

    public String getNomPdirect() {
        return nomPdirect;
    }

    public void setNomPdirect(String nomPdirect) {
        this.nomPdirect = nomPdirect;
    }

    public String getPrenomsPdirect() {
        return prenomsPdirect;
    }

    public void setPrenomsPdirect(String prenomsPdirect) {
        this.prenomsPdirect = prenomsPdirect;
    }

    public Date getDateNaisPdirect() {
        return dateNaisPdirect;
    }

    public void setDateNaisPdirect(Date dateNaisPdirect) {
        this.dateNaisPdirect = dateNaisPdirect;
    }

    public String getLieuNaisPdirect() {
        return lieuNaisPdirect;
    }

    public void setLieuNaisPdirect(String lieuNaisPdirect) {
        this.lieuNaisPdirect = lieuNaisPdirect;
    }

    public String getSexePdirect() {
        return sexePdirect;
    }

    public void setSexePdirect(String sexePdirect) {
        this.sexePdirect = sexePdirect;
    }

    public String getNationalitePdirect() {
        return nationalitePdirect;
    }

    public void setNationalitePdirect(String nationalitePdirect) {
        this.nationalitePdirect = nationalitePdirect;
    }

    public String getQualificationPdirect() {
        return qualificationPdirect;
    }

    public void setQualificationPdirect(String qualificationPdirect) {
        this.qualificationPdirect = qualificationPdirect;
    }

    public String getGradePdirect() {
        return gradePdirect;
    }

    public void setGradePdirect(String gradePdirect) {
        this.gradePdirect = gradePdirect;
    }

    public String getContactPdirect() {
        return contactPdirect;
    }

    public void setContactPdirect(String contactPdirect) {
        this.contactPdirect = contactPdirect;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePdirect != null ? codePdirect.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Direction)) {
            return false;
        }
        Direction other = (Direction) object;
        if ((this.codePdirect == null && other.codePdirect != null) || (this.codePdirect != null && !this.codePdirect.equals(other.codePdirect))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Direction[ codePdirect=" + codePdirect + " ]";
    }
    
}
