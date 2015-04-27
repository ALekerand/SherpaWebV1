/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "expertise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expertise.findAll", query = "SELECT e FROM Expertise e"),
    @NamedQuery(name = "Expertise.findByRefExpertise", query = "SELECT e FROM Expertise e WHERE e.refExpertise = :refExpertise"),
    @NamedQuery(name = "Expertise.findByTypeExpertise", query = "SELECT e FROM Expertise e WHERE e.typeExpertise = :typeExpertise"),
    @NamedQuery(name = "Expertise.findByGarantiesConcernees", query = "SELECT e FROM Expertise e WHERE e.garantiesConcernees = :garantiesConcernees")})
public class Expertise implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "REF_EXPERTISE")
    private String refExpertise;
    @Lob
    @Size(max = 65535)
    @Column(name = "CONCLUSION_EXPERTISE")
    private String conclusionExpertise;
    @Lob
    @Size(max = 65535)
    @Column(name = "COMMENTAIRE_EXPERTISE")
    private String commentaireExpertise;
    @Size(max = 60)
    @Column(name = "TYPE_EXPERTISE")
    private String typeExpertise;
    @Size(max = 100)
    @Column(name = "GARANTIES_CONCERNEES")
    private String garantiesConcernees;
    @JoinColumn(name = "CODE_FACTURE", referencedColumnName = "CODE_FACTURE")
    @ManyToOne
    private Facture codeFacture;
    @JoinColumn(name = "CODE_EXPERT_SINISTRE", referencedColumnName = "CODE_EXPERT_SINISTRE")
    @ManyToOne
    private ExpertSinistre codeExpertSinistre;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE")
    @ManyToOne(optional = false)
    private Sinistre codeSinistre;

    public Expertise() {
    }

    public Expertise(String refExpertise) {
        this.refExpertise = refExpertise;
    }

    public String getRefExpertise() {
        return refExpertise;
    }

    public void setRefExpertise(String refExpertise) {
        this.refExpertise = refExpertise;
    }

    public String getConclusionExpertise() {
        return conclusionExpertise;
    }

    public void setConclusionExpertise(String conclusionExpertise) {
        this.conclusionExpertise = conclusionExpertise;
    }

    public String getCommentaireExpertise() {
        return commentaireExpertise;
    }

    public void setCommentaireExpertise(String commentaireExpertise) {
        this.commentaireExpertise = commentaireExpertise;
    }

    public String getTypeExpertise() {
        return typeExpertise;
    }

    public void setTypeExpertise(String typeExpertise) {
        this.typeExpertise = typeExpertise;
    }

    public String getGarantiesConcernees() {
        return garantiesConcernees;
    }

    public void setGarantiesConcernees(String garantiesConcernees) {
        this.garantiesConcernees = garantiesConcernees;
    }

    public Facture getCodeFacture() {
        return codeFacture;
    }

    public void setCodeFacture(Facture codeFacture) {
        this.codeFacture = codeFacture;
    }

    public ExpertSinistre getCodeExpertSinistre() {
        return codeExpertSinistre;
    }

    public void setCodeExpertSinistre(ExpertSinistre codeExpertSinistre) {
        this.codeExpertSinistre = codeExpertSinistre;
    }

    public Sinistre getCodeSinistre() {
        return codeSinistre;
    }

    public void setCodeSinistre(Sinistre codeSinistre) {
        this.codeSinistre = codeSinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (refExpertise != null ? refExpertise.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Expertise)) {
            return false;
        }
        Expertise other = (Expertise) object;
        if ((this.refExpertise == null && other.refExpertise != null) || (this.refExpertise != null && !this.refExpertise.equals(other.refExpertise))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Expertise[ refExpertise=" + refExpertise + " ]";
    }
    
}
