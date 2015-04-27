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
@Table(name = "reassurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reassurance.findAll", query = "SELECT r FROM Reassurance r"),
    @NamedQuery(name = "Reassurance.findByCodeReassurance", query = "SELECT r FROM Reassurance r WHERE r.codeReassurance = :codeReassurance"),
    @NamedQuery(name = "Reassurance.findByMontantReassurance", query = "SELECT r FROM Reassurance r WHERE r.montantReassurance = :montantReassurance")})
public class Reassurance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_REASSURANCE")
    private String codeReassurance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_REASSURANCE")
    private BigDecimal montantReassurance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "reassurance")
    private List<ReassuranceCompagnie> reassuranceCompagnieList;
    @JoinColumn(name = "NUM_POLICE", referencedColumnName = "NUM_POLICE")
    @ManyToOne(optional = false)
    private Contrat numPolice;

    public Reassurance() {
    }

    public Reassurance(String codeReassurance) {
        this.codeReassurance = codeReassurance;
    }

    public String getCodeReassurance() {
        return codeReassurance;
    }

    public void setCodeReassurance(String codeReassurance) {
        this.codeReassurance = codeReassurance;
    }

    public BigDecimal getMontantReassurance() {
        return montantReassurance;
    }

    public void setMontantReassurance(BigDecimal montantReassurance) {
        this.montantReassurance = montantReassurance;
    }

    @XmlTransient
    public List<ReassuranceCompagnie> getReassuranceCompagnieList() {
        return reassuranceCompagnieList;
    }

    public void setReassuranceCompagnieList(List<ReassuranceCompagnie> reassuranceCompagnieList) {
        this.reassuranceCompagnieList = reassuranceCompagnieList;
    }

    public Contrat getNumPolice() {
        return numPolice;
    }

    public void setNumPolice(Contrat numPolice) {
        this.numPolice = numPolice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeReassurance != null ? codeReassurance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Reassurance)) {
            return false;
        }
        Reassurance other = (Reassurance) object;
        if ((this.codeReassurance == null && other.codeReassurance != null) || (this.codeReassurance != null && !this.codeReassurance.equals(other.codeReassurance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Reassurance[ codeReassurance=" + codeReassurance + " ]";
    }
    
}
