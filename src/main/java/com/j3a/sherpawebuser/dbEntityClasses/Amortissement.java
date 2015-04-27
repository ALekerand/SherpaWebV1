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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "amortissement")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Amortissement.findAll", query = "SELECT a FROM Amortissement a"),
    @NamedQuery(name = "Amortissement.findByCodeObEmp", query = "SELECT a FROM Amortissement a WHERE a.codeObEmp = :codeObEmp"),
    @NamedQuery(name = "Amortissement.findByNature", query = "SELECT a FROM Amortissement a WHERE a.nature = :nature"),
    @NamedQuery(name = "Amortissement.findByNatureAmortis", query = "SELECT a FROM Amortissement a WHERE a.natureAmortis = :natureAmortis")})
public class Amortissement implements Serializable {
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
    @Column(name = "NATURE_AMORTIS")
    private BigDecimal natureAmortis;
    @JoinColumn(name = "CODE_OB_EMP", referencedColumnName = "CODE_OB_EMP", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private ObligationEmprunt obligationEmprunt;

    public Amortissement() {
    }

    public Amortissement(String codeObEmp) {
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

    public BigDecimal getNatureAmortis() {
        return natureAmortis;
    }

    public void setNatureAmortis(BigDecimal natureAmortis) {
        this.natureAmortis = natureAmortis;
    }

    public ObligationEmprunt getObligationEmprunt() {
        return obligationEmprunt;
    }

    public void setObligationEmprunt(ObligationEmprunt obligationEmprunt) {
        this.obligationEmprunt = obligationEmprunt;
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
        if (!(object instanceof Amortissement)) {
            return false;
        }
        Amortissement other = (Amortissement) object;
        if ((this.codeObEmp == null && other.codeObEmp != null) || (this.codeObEmp != null && !this.codeObEmp.equals(other.codeObEmp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Amortissement[ codeObEmp=" + codeObEmp + " ]";
    }
    
}
