/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "partie_adverse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PartieAdverse.findAll", query = "SELECT p FROM PartieAdverse p"),
    @NamedQuery(name = "PartieAdverse.findByCodePartieAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.codePartieAdverse = :codePartieAdverse"),
    @NamedQuery(name = "PartieAdverse.findByAssureurPartieAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.assureurPartieAdverse = :assureurPartieAdverse"),
    @NamedQuery(name = "PartieAdverse.findByNumPolicePartieAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.numPolicePartieAdverse = :numPolicePartieAdverse"),
    @NamedQuery(name = "PartieAdverse.findByAutres", query = "SELECT p FROM PartieAdverse p WHERE p.autres = :autres"),
    @NamedQuery(name = "PartieAdverse.findByAdresse", query = "SELECT p FROM PartieAdverse p WHERE p.adresse = :adresse"),
    @NamedQuery(name = "PartieAdverse.findByNumSinistreAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.numSinistreAdverse = :numSinistreAdverse"),
    @NamedQuery(name = "PartieAdverse.findByTypeRecours", query = "SELECT p FROM PartieAdverse p WHERE p.typeRecours = :typeRecours"),
    @NamedQuery(name = "PartieAdverse.findByQualiteRecours", query = "SELECT p FROM PartieAdverse p WHERE p.qualiteRecours = :qualiteRecours"),
    @NamedQuery(name = "PartieAdverse.findByMontant", query = "SELECT p FROM PartieAdverse p WHERE p.montant = :montant"),
    @NamedQuery(name = "PartieAdverse.findByGarantie", query = "SELECT p FROM PartieAdverse p WHERE p.garantie = :garantie"),
    @NamedQuery(name = "PartieAdverse.findByNomPartieAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.nomPartieAdverse = :nomPartieAdverse"),
    @NamedQuery(name = "PartieAdverse.findByPrenomsPartieAdverse", query = "SELECT p FROM PartieAdverse p WHERE p.prenomsPartieAdverse = :prenomsPartieAdverse")})
public class PartieAdverse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "CODE_PARTIE_ADVERSE")
    private String codePartieAdverse;
    @Size(max = 20)
    @Column(name = "ASSUREUR_PARTIE_ADVERSE")
    private String assureurPartieAdverse;
    @Size(max = 40)
    @Column(name = "NUM_POLICE_PARTIE_ADVERSE")
    private String numPolicePartieAdverse;
    @Size(max = 50)
    @Column(name = "AUTRES")
    private String autres;
    @Size(max = 60)
    @Column(name = "ADRESSE")
    private String adresse;
    @Size(max = 50)
    @Column(name = "NUM_SINISTRE_ADVERSE")
    private String numSinistreAdverse;
    @Size(max = 100)
    @Column(name = "TYPE_RECOURS")
    private String typeRecours;
    @Size(max = 100)
    @Column(name = "QUALITE_RECOURS")
    private String qualiteRecours;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Size(max = 100)
    @Column(name = "GARANTIE")
    private String garantie;
    @Lob
    @Size(max = 65535)
    @Column(name = "DOMMAGES_MATERIELS")
    private String dommagesMateriels;
    @Lob
    @Size(max = 65535)
    @Column(name = "DOMMAGES_CORPORELS")
    private String dommagesCorporels;
    @Size(max = 20)
    @Column(name = "NOM_PARTIE_ADVERSE")
    private String nomPartieAdverse;
    @Size(max = 50)
    @Column(name = "PRENOMS_PARTIE_ADVERSE")
    private String prenomsPartieAdverse;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE")
    @ManyToOne(optional = false)
    private Sinistre codeSinistre;
    @JoinColumn(name = "CODE_SCTEADVERSE", referencedColumnName = "CODE_SCTEADVERSE")
    @ManyToOne
    private SocieteAdverse codeScteadverse;
    @JoinColumn(name = "CODE_CONDUCTEUR_ADVERSE", referencedColumnName = "CODE_CONDUCTEUR_ADVERSE")
    @ManyToOne
    private ConducteurAdverse codeConducteurAdverse;

    public PartieAdverse() {
    }

    public PartieAdverse(String codePartieAdverse) {
        this.codePartieAdverse = codePartieAdverse;
    }

    public String getCodePartieAdverse() {
        return codePartieAdverse;
    }

    public void setCodePartieAdverse(String codePartieAdverse) {
        this.codePartieAdverse = codePartieAdverse;
    }

    public String getAssureurPartieAdverse() {
        return assureurPartieAdverse;
    }

    public void setAssureurPartieAdverse(String assureurPartieAdverse) {
        this.assureurPartieAdverse = assureurPartieAdverse;
    }

    public String getNumPolicePartieAdverse() {
        return numPolicePartieAdverse;
    }

    public void setNumPolicePartieAdverse(String numPolicePartieAdverse) {
        this.numPolicePartieAdverse = numPolicePartieAdverse;
    }

    public String getAutres() {
        return autres;
    }

    public void setAutres(String autres) {
        this.autres = autres;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getNumSinistreAdverse() {
        return numSinistreAdverse;
    }

    public void setNumSinistreAdverse(String numSinistreAdverse) {
        this.numSinistreAdverse = numSinistreAdverse;
    }

    public String getTypeRecours() {
        return typeRecours;
    }

    public void setTypeRecours(String typeRecours) {
        this.typeRecours = typeRecours;
    }

    public String getQualiteRecours() {
        return qualiteRecours;
    }

    public void setQualiteRecours(String qualiteRecours) {
        this.qualiteRecours = qualiteRecours;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getGarantie() {
        return garantie;
    }

    public void setGarantie(String garantie) {
        this.garantie = garantie;
    }

    public String getDommagesMateriels() {
        return dommagesMateriels;
    }

    public void setDommagesMateriels(String dommagesMateriels) {
        this.dommagesMateriels = dommagesMateriels;
    }

    public String getDommagesCorporels() {
        return dommagesCorporels;
    }

    public void setDommagesCorporels(String dommagesCorporels) {
        this.dommagesCorporels = dommagesCorporels;
    }

    public String getNomPartieAdverse() {
        return nomPartieAdverse;
    }

    public void setNomPartieAdverse(String nomPartieAdverse) {
        this.nomPartieAdverse = nomPartieAdverse;
    }

    public String getPrenomsPartieAdverse() {
        return prenomsPartieAdverse;
    }

    public void setPrenomsPartieAdverse(String prenomsPartieAdverse) {
        this.prenomsPartieAdverse = prenomsPartieAdverse;
    }

    public Sinistre getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(Sinistre codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    public SocieteAdverse getCodeScteadverse() {
        return codeScteadverse;
    }

    public void setCodeScteadverse(SocieteAdverse codeScteadverse) {
        this.codeScteadverse = codeScteadverse;
    }

    public ConducteurAdverse getCodeConducteurAdverse() {
        return codeConducteurAdverse;
    }

    public void setCodeConducteurAdverse(ConducteurAdverse codeConducteurAdverse) {
        this.codeConducteurAdverse = codeConducteurAdverse;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePartieAdverse != null ? codePartieAdverse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PartieAdverse)) {
            return false;
        }
        PartieAdverse other = (PartieAdverse) object;
        if ((this.codePartieAdverse == null && other.codePartieAdverse != null) || (this.codePartieAdverse != null && !this.codePartieAdverse.equals(other.codePartieAdverse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.PartieAdverse[ codePartieAdverse=" + codePartieAdverse + " ]";
    }
    
}
