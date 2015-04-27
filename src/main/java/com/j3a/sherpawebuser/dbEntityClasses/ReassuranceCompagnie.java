/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "reassurance_compagnie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReassuranceCompagnie.findAll", query = "SELECT r FROM ReassuranceCompagnie r"),
    @NamedQuery(name = "ReassuranceCompagnie.findByCodeReassurance", query = "SELECT r FROM ReassuranceCompagnie r WHERE r.reassuranceCompagniePK.codeReassurance = :codeReassurance"),
    @NamedQuery(name = "ReassuranceCompagnie.findByCodeCompagnie", query = "SELECT r FROM ReassuranceCompagnie r WHERE r.reassuranceCompagniePK.codeCompagnie = :codeCompagnie"),
    @NamedQuery(name = "ReassuranceCompagnie.findByDateReassuranceCompagnie", query = "SELECT r FROM ReassuranceCompagnie r WHERE r.dateReassuranceCompagnie = :dateReassuranceCompagnie")})
public class ReassuranceCompagnie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReassuranceCompagniePK reassuranceCompagniePK;
    @Column(name = "DATE_REASSURANCE_COMPAGNIE")
    @Temporal(TemporalType.DATE)
    private Date dateReassuranceCompagnie;
    @JoinColumn(name = "CODE_COMPAGNIE", referencedColumnName = "CODE_COMPAGNIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compagnie compagnie;
    @JoinColumn(name = "CODE_REASSURANCE", referencedColumnName = "CODE_REASSURANCE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Reassurance reassurance;

    public ReassuranceCompagnie() {
    }

    public ReassuranceCompagnie(ReassuranceCompagniePK reassuranceCompagniePK) {
        this.reassuranceCompagniePK = reassuranceCompagniePK;
    }

    public ReassuranceCompagnie(String codeReassurance, String codeCompagnie) {
        this.reassuranceCompagniePK = new ReassuranceCompagniePK(codeReassurance, codeCompagnie);
    }

    public ReassuranceCompagniePK getReassuranceCompagniePK() {
        return reassuranceCompagniePK;
    }

    public void setReassuranceCompagniePK(ReassuranceCompagniePK reassuranceCompagniePK) {
        this.reassuranceCompagniePK = reassuranceCompagniePK;
    }

    public Date getDateReassuranceCompagnie() {
        return dateReassuranceCompagnie;
    }

    public void setDateReassuranceCompagnie(Date dateReassuranceCompagnie) {
        this.dateReassuranceCompagnie = dateReassuranceCompagnie;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Reassurance getReassurance() {
        return reassurance;
    }

    public void setReassurance(Reassurance reassurance) {
        this.reassurance = reassurance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reassuranceCompagniePK != null ? reassuranceCompagniePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReassuranceCompagnie)) {
            return false;
        }
        ReassuranceCompagnie other = (ReassuranceCompagnie) object;
        if ((this.reassuranceCompagniePK == null && other.reassuranceCompagniePK != null) || (this.reassuranceCompagniePK != null && !this.reassuranceCompagniePK.equals(other.reassuranceCompagniePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ReassuranceCompagnie[ reassuranceCompagniePK=" + reassuranceCompagniePK + " ]";
    }
    
}
