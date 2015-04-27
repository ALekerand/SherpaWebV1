/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "coassurance_compagnie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CoassuranceCompagnie.findAll", query = "SELECT c FROM CoassuranceCompagnie c"),
    @NamedQuery(name = "CoassuranceCompagnie.findByCodeCoassurance", query = "SELECT c FROM CoassuranceCompagnie c WHERE c.coassuranceCompagniePK.codeCoassurance = :codeCoassurance"),
    @NamedQuery(name = "CoassuranceCompagnie.findByCodeCompagnie", query = "SELECT c FROM CoassuranceCompagnie c WHERE c.coassuranceCompagniePK.codeCompagnie = :codeCompagnie"),
    @NamedQuery(name = "CoassuranceCompagnie.findByMontantAssure", query = "SELECT c FROM CoassuranceCompagnie c WHERE c.montantAssure = :montantAssure")})
public class CoassuranceCompagnie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CoassuranceCompagniePK coassuranceCompagniePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_ASSURE")
    private BigDecimal montantAssure;
    @JoinColumn(name = "CODE_COMPAGNIE", referencedColumnName = "CODE_COMPAGNIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Compagnie compagnie;
    @JoinColumn(name = "CODE_COASSURANCE", referencedColumnName = "CODE_COASSURANCE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Coassurance coassurance;

    public CoassuranceCompagnie() {
    }

    public CoassuranceCompagnie(CoassuranceCompagniePK coassuranceCompagniePK) {
        this.coassuranceCompagniePK = coassuranceCompagniePK;
    }

    public CoassuranceCompagnie(String codeCoassurance, String codeCompagnie) {
        this.coassuranceCompagniePK = new CoassuranceCompagniePK(codeCoassurance, codeCompagnie);
    }

    public CoassuranceCompagniePK getCoassuranceCompagniePK() {
        return coassuranceCompagniePK;
    }

    public void setCoassuranceCompagniePK(CoassuranceCompagniePK coassuranceCompagniePK) {
        this.coassuranceCompagniePK = coassuranceCompagniePK;
    }

    public BigDecimal getMontantAssure() {
        return montantAssure;
    }

    public void setMontantAssure(BigDecimal montantAssure) {
        this.montantAssure = montantAssure;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Coassurance getCoassurance() {
        return coassurance;
    }

    public void setCoassurance(Coassurance coassurance) {
        this.coassurance = coassurance;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (coassuranceCompagniePK != null ? coassuranceCompagniePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CoassuranceCompagnie)) {
            return false;
        }
        CoassuranceCompagnie other = (CoassuranceCompagnie) object;
        if ((this.coassuranceCompagniePK == null && other.coassuranceCompagniePK != null) || (this.coassuranceCompagniePK != null && !this.coassuranceCompagniePK.equals(other.coassuranceCompagniePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CoassuranceCompagnie[ coassuranceCompagniePK=" + coassuranceCompagniePK + " ]";
    }
    
}
