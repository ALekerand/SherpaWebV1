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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "obligation_emprunt")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ObligationEmprunt.findAll", query = "SELECT o FROM ObligationEmprunt o"),
    @NamedQuery(name = "ObligationEmprunt.findByCodeObEmp", query = "SELECT o FROM ObligationEmprunt o WHERE o.codeObEmp = :codeObEmp"),
    @NamedQuery(name = "ObligationEmprunt.findByNature", query = "SELECT o FROM ObligationEmprunt o WHERE o.nature = :nature"),
    @NamedQuery(name = "ObligationEmprunt.findByMontant", query = "SELECT o FROM ObligationEmprunt o WHERE o.montant = :montant"),
    @NamedQuery(name = "ObligationEmprunt.findByType", query = "SELECT o FROM ObligationEmprunt o WHERE o.type = :type")})
public class ObligationEmprunt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_OB_EMP")
    private String codeObEmp;
    @Size(max = 30)
    @Column(name = "NATURE")
    private String nature;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT")
    private BigDecimal montant;
    @Size(max = 30)
    @Column(name = "TYPE")
    private String type;
    @ManyToMany(mappedBy = "obligationEmpruntList")
    private List<EtatCima> etatCimaList;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "obligationEmprunt")
    private Amortissement amortissement;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "obligationEmprunt")
    private Remboursement remboursement;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "obligationEmprunt")
    private Emission emission;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne(optional = false)
    private Exercice codeexercice;

    public ObligationEmprunt() {
    }

    public ObligationEmprunt(String codeObEmp) {
        this.codeObEmp = codeObEmp;
    }

    public String getCodeObEmp() {
        return codeObEmp;
    }

    public void setCodeObEmp(String codeObEmp) {
        this.codeObEmp = codeObEmp;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public BigDecimal getMontant() {
        return montant;
    }

    public void setMontant(BigDecimal montant) {
        this.montant = montant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @XmlTransient
    public List<EtatCima> getEtatCimaList() {
        return etatCimaList;
    }

    public void setEtatCimaList(List<EtatCima> etatCimaList) {
        this.etatCimaList = etatCimaList;
    }

    public Amortissement getAmortissement() {
        return amortissement;
    }

    public void setAmortissement(Amortissement amortissement) {
        this.amortissement = amortissement;
    }

    public Remboursement getRemboursement() {
        return remboursement;
    }

    public void setRemboursement(Remboursement remboursement) {
        this.remboursement = remboursement;
    }

    public Emission getEmission() {
        return emission;
    }

    public void setEmission(Emission emission) {
        this.emission = emission;
    }

    public Exercice getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(Exercice codeexercice) {
        this.codeexercice = codeexercice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeObEmp != null ? codeObEmp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ObligationEmprunt)) {
            return false;
        }
        ObligationEmprunt other = (ObligationEmprunt) object;
        if ((this.codeObEmp == null && other.codeObEmp != null) || (this.codeObEmp != null && !this.codeObEmp.equals(other.codeObEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ObligationEmprunt[ codeObEmp=" + codeObEmp + " ]";
    }
    
}
