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
@Table(name = "coassurance")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coassurance.findAll", query = "SELECT c FROM Coassurance c"),
    @NamedQuery(name = "Coassurance.findByCodeCoassurance", query = "SELECT c FROM Coassurance c WHERE c.codeCoassurance = :codeCoassurance"),
    @NamedQuery(name = "Coassurance.findByMontantCoassurance", query = "SELECT c FROM Coassurance c WHERE c.montantCoassurance = :montantCoassurance"),
    @NamedQuery(name = "Coassurance.findByTypeCoassurance", query = "SELECT c FROM Coassurance c WHERE c.typeCoassurance = :typeCoassurance")})
public class Coassurance implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 16)
    @Column(name = "CODE_COASSURANCE")
    private String codeCoassurance;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_COASSURANCE")
    private BigDecimal montantCoassurance;
    @Size(max = 50)
    @Column(name = "TYPE_COASSURANCE")
    private String typeCoassurance;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "coassurance")
    private List<CoassuranceCompagnie> coassuranceCompagnieList;
    @JoinColumn(name = "NUM_POLICE", referencedColumnName = "NUM_POLICE")
    @ManyToOne(optional = false)
    private Contrat numPolice;

    public Coassurance() {
    }

    public Coassurance(String codeCoassurance) {
        this.codeCoassurance = codeCoassurance;
    }

    public String getCodeCoassurance() {
        return codeCoassurance;
    }

    public void setCodeCoassurance(String codeCoassurance) {
        this.codeCoassurance = codeCoassurance;
    }

    public BigDecimal getMontantCoassurance() {
        return montantCoassurance;
    }

    public void setMontantCoassurance(BigDecimal montantCoassurance) {
        this.montantCoassurance = montantCoassurance;
    }

    public String getTypeCoassurance() {
        return typeCoassurance;
    }

    public void setTypeCoassurance(String typeCoassurance) {
        this.typeCoassurance = typeCoassurance;
    }

    @XmlTransient
    public List<CoassuranceCompagnie> getCoassuranceCompagnieList() {
        return coassuranceCompagnieList;
    }

    public void setCoassuranceCompagnieList(List<CoassuranceCompagnie> coassuranceCompagnieList) {
        this.coassuranceCompagnieList = coassuranceCompagnieList;
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
        hash += (codeCoassurance != null ? codeCoassurance.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coassurance)) {
            return false;
        }
        Coassurance other = (Coassurance) object;
        if ((this.codeCoassurance == null && other.codeCoassurance != null) || (this.codeCoassurance != null && !this.codeCoassurance.equals(other.codeCoassurance))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Coassurance[ codeCoassurance=" + codeCoassurance + " ]";
    }
    
}
