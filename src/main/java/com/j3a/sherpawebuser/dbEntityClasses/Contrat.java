/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "contrat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Contrat.findAll", query = "SELECT c FROM Contrat c"),
    @NamedQuery(name = "Contrat.findByNumPolice", query = "SELECT c FROM Contrat c WHERE c.numPolice = :numPolice"),
    @NamedQuery(name = "Contrat.findByMentionParticuliere", query = "SELECT c FROM Contrat c WHERE c.mentionParticuliere = :mentionParticuliere"),
    @NamedQuery(name = "Contrat.findByRemplace", query = "SELECT c FROM Contrat c WHERE c.remplace = :remplace"),
    @NamedQuery(name = "Contrat.findByReference", query = "SELECT c FROM Contrat c WHERE c.reference = :reference"),
    @NamedQuery(name = "Contrat.findByCommission", query = "SELECT c FROM Contrat c WHERE c.commission = :commission"),
    @NamedQuery(name = "Contrat.findByBareme", query = "SELECT c FROM Contrat c WHERE c.bareme = :bareme"),
    @NamedQuery(name = "Contrat.findByModeReconduction", query = "SELECT c FROM Contrat c WHERE c.modeReconduction = :modeReconduction"),
    @NamedQuery(name = "Contrat.findByTypeContrat", query = "SELECT c FROM Contrat c WHERE c.typeContrat = :typeContrat")})
public class Contrat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NUM_POLICE")
    private String numPolice;
    @Size(max = 70)
    @Column(name = "MENTION_PARTICULIERE")
    private String mentionParticuliere;
    @Size(max = 16)
    @Column(name = "REMPLACE")
    private String remplace;
    @Size(max = 16)
    @Column(name = "REFERENCE")
    private String reference;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "COMMISSION")
    private BigDecimal commission;
    @Size(max = 30)
    @Column(name = "BAREME")
    private String bareme;
    @Size(max = 50)
    @Column(name = "MODE_RECONDUCTION")
    private String modeReconduction;
    @Size(max = 50)
    @Column(name = "TYPE_CONTRAT")
    private String typeContrat;
    @JoinColumn(name = "NUM_SOUSCRIPTEUR", referencedColumnName = "NUM_SOUSCRIPTEUR")
    @ManyToOne(optional = false)
    private Personne numSouscripteur;
    @JoinColumn(name = "CODE_POINT_VENTE", referencedColumnName = "CODE_POINT_VENTE")
    @ManyToOne(optional = false)
    private PointVente codePointVente;
    @JoinColumn(name = "CODE_RISQUE", referencedColumnName = "CODE_RISQUE")
    @ManyToOne(optional = false)
    private Risque codeRisque;
    @JoinColumn(name = "CODE_SOCIETE_ASSURANCE", referencedColumnName = "CODE_SOCIETE_ASSURANCE")
    @ManyToOne(optional = false)
    private SocieteAssurance codeSocieteAssurance;
    @JoinColumn(name = "CODE_APPORTEUR", referencedColumnName = "CODE_APPORTEUR")
    @ManyToOne
    private Apporteur codeApporteur;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numPolice")
    private List<Coassurance> coassuranceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numPolice")
    private List<Reassurance> reassuranceList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numPolice")
    private List<Avenant> avenantList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "numPolice")
    private List<Sinistre> sinistreList;

    public Contrat() {
    }

    public Contrat(String numPolice) {
        this.numPolice = numPolice;
    }

    public String getNumPolice() {
        return numPolice;
    }

    public void setNumPolice(String numPolice) {
        this.numPolice = numPolice;
    }

    public String getMentionParticuliere() {
        return mentionParticuliere;
    }

    public void setMentionParticuliere(String mentionParticuliere) {
        this.mentionParticuliere = mentionParticuliere;
    }

    public String getRemplace() {
        return remplace;
    }

    public void setRemplace(String remplace) {
        this.remplace = remplace;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getBareme() {
        return bareme;
    }

    public void setBareme(String bareme) {
        this.bareme = bareme;
    }

    public String getModeReconduction() {
        return modeReconduction;
    }

    public void setModeReconduction(String modeReconduction) {
        this.modeReconduction = modeReconduction;
    }

    public String getTypeContrat() {
        return typeContrat;
    }

    public void setTypeContrat(String typeContrat) {
        this.typeContrat = typeContrat;
    }

    public Personne getNumSouscripteur() {
        return numSouscripteur;
    }

    public void setNumSouscripteur(Personne numSouscripteur) {
        this.numSouscripteur = numSouscripteur;
    }

    public PointVente getCodePointVente() {
        return codePointVente;
    }

    public void setCodePointVente(PointVente codePointVente) {
        this.codePointVente = codePointVente;
    }

    public Risque getCodeRisque() {
        return codeRisque;
    }

    public void setCodeRisque(Risque codeRisque) {
        this.codeRisque = codeRisque;
    }

    public SocieteAssurance getCodeSocieteAssurance() {
        return codeSocieteAssurance;
    }

    public void setCodeSocieteAssurance(SocieteAssurance codeSocieteAssurance) {
        this.codeSocieteAssurance = codeSocieteAssurance;
    }

    public Apporteur getCodeApporteur() {
        return codeApporteur;
    }

    public void setCodeApporteur(Apporteur codeApporteur) {
        this.codeApporteur = codeApporteur;
    }

    @XmlTransient
    public List<Coassurance> getCoassuranceList() {
        return coassuranceList;
    }

    public void setCoassuranceList(List<Coassurance> coassuranceList) {
        this.coassuranceList = coassuranceList;
    }

    @XmlTransient
    public List<Reassurance> getReassuranceList() {
        return reassuranceList;
    }

    public void setReassuranceList(List<Reassurance> reassuranceList) {
        this.reassuranceList = reassuranceList;
    }

    @XmlTransient
    public List<Avenant> getAvenantList() {
        return avenantList;
    }

    public void setAvenantList(List<Avenant> avenantList) {
        this.avenantList = avenantList;
    }

    @XmlTransient
    public List<Sinistre> getSinistreList() {
        return sinistreList;
    }

    public void setSinistreList(List<Sinistre> sinistreList) {
        this.sinistreList = sinistreList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (numPolice != null ? numPolice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Contrat)) {
            return false;
        }
        Contrat other = (Contrat) object;
        if ((this.numPolice == null && other.numPolice != null) || (this.numPolice != null && !this.numPolice.equals(other.numPolice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Contrat[ numPolice=" + numPolice + " ]";
    }
    
}
