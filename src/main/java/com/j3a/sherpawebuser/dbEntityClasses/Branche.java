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
@Table(name = "branche")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Branche.findAll", query = "SELECT b FROM Branche b"),
    @NamedQuery(name = "Branche.findByCodeBranche", query = "SELECT b FROM Branche b WHERE b.codeBranche = :codeBranche"),
    @NamedQuery(name = "Branche.findByBranche", query = "SELECT b FROM Branche b WHERE b.branche = :branche"),
    @NamedQuery(name = "Branche.findByEtatBranche", query = "SELECT b FROM Branche b WHERE b.etatBranche = :etatBranche"),
    @NamedQuery(name = "Branche.findByAnneeDebutExploitation", query = "SELECT b FROM Branche b WHERE b.anneeDebutExploitation = :anneeDebutExploitation"),
    @NamedQuery(name = "Branche.findByReferenceAgrement", query = "SELECT b FROM Branche b WHERE b.referenceAgrement = :referenceAgrement"),
    @NamedQuery(name = "Branche.findByDateAgrement", query = "SELECT b FROM Branche b WHERE b.dateAgrement = :dateAgrement")})
public class Branche implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_BRANCHE")
    private String codeBranche;
    @Size(max = 80)
    @Column(name = "BRANCHE")
    private String branche;
    @Size(max = 10)
    @Column(name = "ETAT_BRANCHE")
    private String etatBranche;
    @Column(name = "ANNEE_DEBUT_EXPLOITATION")
    private Integer anneeDebutExploitation;
    @Size(max = 30)
    @Column(name = "REFERENCE_AGREMENT")
    private String referenceAgrement;
    @Column(name = "DATE_AGREMENT")
    @Temporal(TemporalType.DATE)
    private Date dateAgrement;
    @ManyToMany(mappedBy = "brancheList")
    private List<EtatCima> etatCimaList;

    public Branche() {
    }

    public Branche(String codeBranche) {
        this.codeBranche = codeBranche;
    }

    public String getCodeBranche() {
        return codeBranche;
    }

    public void setCodeBranche(String codeBranche) {
        this.codeBranche = codeBranche;
    }

    public String getBranche() {
        return branche;
    }

    public void setBranche(String branche) {
        this.branche = branche;
    }

    public String getEtatBranche() {
        return etatBranche;
    }

    public void setEtatBranche(String etatBranche) {
        this.etatBranche = etatBranche;
    }

    public Integer getAnneeDebutExploitation() {
        return anneeDebutExploitation;
    }

    public void setAnneeDebutExploitation(Integer anneeDebutExploitation) {
        this.anneeDebutExploitation = anneeDebutExploitation;
    }

    public String getReferenceAgrement() {
        return referenceAgrement;
    }

    public void setReferenceAgrement(String referenceAgrement) {
        this.referenceAgrement = referenceAgrement;
    }

    public Date getDateAgrement() {
        return dateAgrement;
    }

    public void setDateAgrement(Date dateAgrement) {
        this.dateAgrement = dateAgrement;
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
        hash += (codeBranche != null ? codeBranche.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Branche)) {
            return false;
        }
        Branche other = (Branche) object;
        if ((this.codeBranche == null && other.codeBranche != null) || (this.codeBranche != null && !this.codeBranche.equals(other.codeBranche))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Branche[ codeBranche=" + codeBranche + " ]";
    }
    
}
