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
@Table(name = "engagements_actifrep")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EngagementsActifrep.findAll", query = "SELECT e FROM EngagementsActifrep e"),
    @NamedQuery(name = "EngagementsActifrep.findByCodeengagements", query = "SELECT e FROM EngagementsActifrep e WHERE e.engagementsActifrepPK.codeengagements = :codeengagements"),
    @NamedQuery(name = "EngagementsActifrep.findByCodeactifrep", query = "SELECT e FROM EngagementsActifrep e WHERE e.engagementsActifrepPK.codeactifrep = :codeactifrep"),
    @NamedQuery(name = "EngagementsActifrep.findByPrixachatourevient", query = "SELECT e FROM EngagementsActifrep e WHERE e.prixachatourevient = :prixachatourevient"),
    @NamedQuery(name = "EngagementsActifrep.findByValeurrealisation", query = "SELECT e FROM EngagementsActifrep e WHERE e.valeurrealisation = :valeurrealisation"),
    @NamedQuery(name = "EngagementsActifrep.findByValeurcouverture", query = "SELECT e FROM EngagementsActifrep e WHERE e.valeurcouverture = :valeurcouverture")})
public class EngagementsActifrep implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EngagementsActifrepPK engagementsActifrepPK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PRIXACHATOUREVIENT")
    private BigDecimal prixachatourevient;
    @Column(name = "VALEURREALISATION")
    private BigDecimal valeurrealisation;
    @Column(name = "VALEURCOUVERTURE")
    private BigDecimal valeurcouverture;
    @JoinColumn(name = "CODEACTIFREP", referencedColumnName = "CODEACTIFREP", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private ActifsRepresentatifs actifsRepresentatifs;
    @JoinColumn(name = "CODEENGAGEMENTS", referencedColumnName = "CODEENGAGEMENTS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private EtatC4 etatC4;

    public EngagementsActifrep() {
    }

    public EngagementsActifrep(EngagementsActifrepPK engagementsActifrepPK) {
        this.engagementsActifrepPK = engagementsActifrepPK;
    }

    public EngagementsActifrep(String codeengagements, String codeactifrep) {
        this.engagementsActifrepPK = new EngagementsActifrepPK(codeengagements, codeactifrep);
    }

    public EngagementsActifrepPK getEngagementsActifrepPK() {
        return engagementsActifrepPK;
    }

    public void setEngagementsActifrepPK(EngagementsActifrepPK engagementsActifrepPK) {
        this.engagementsActifrepPK = engagementsActifrepPK;
    }

    public BigDecimal getPrixachatourevient() {
        return prixachatourevient;
    }

    public void setPrixachatourevient(BigDecimal prixachatourevient) {
        this.prixachatourevient = prixachatourevient;
    }

    public BigDecimal getValeurrealisation() {
        return valeurrealisation;
    }

    public void setValeurrealisation(BigDecimal valeurrealisation) {
        this.valeurrealisation = valeurrealisation;
    }

    public BigDecimal getValeurcouverture() {
        return valeurcouverture;
    }

    public void setValeurcouverture(BigDecimal valeurcouverture) {
        this.valeurcouverture = valeurcouverture;
    }

    public ActifsRepresentatifs getActifsRepresentatifs() {
        return actifsRepresentatifs;
    }

    public void setActifsRepresentatifs(ActifsRepresentatifs actifsRepresentatifs) {
        this.actifsRepresentatifs = actifsRepresentatifs;
    }

    public EtatC4 getEtatC4() {
        return etatC4;
    }

    public void setEtatC4(EtatC4 etatC4) {
        this.etatC4 = etatC4;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (engagementsActifrepPK != null ? engagementsActifrepPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EngagementsActifrep)) {
            return false;
        }
        EngagementsActifrep other = (EngagementsActifrep) object;
        if ((this.engagementsActifrepPK == null && other.engagementsActifrepPK != null) || (this.engagementsActifrepPK != null && !this.engagementsActifrepPK.equals(other.engagementsActifrepPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.EngagementsActifrep[ engagementsActifrepPK=" + engagementsActifrepPK + " ]";
    }
    
}
