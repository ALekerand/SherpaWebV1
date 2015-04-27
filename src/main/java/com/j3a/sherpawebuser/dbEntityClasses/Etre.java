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
@Table(name = "etre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Etre.findAll", query = "SELECT e FROM Etre e"),
    @NamedQuery(name = "Etre.findByNumSouscripteur", query = "SELECT e FROM Etre e WHERE e.etrePK.numSouscripteur = :numSouscripteur"),
    @NamedQuery(name = "Etre.findByCodeTypePers", query = "SELECT e FROM Etre e WHERE e.etrePK.codeTypePers = :codeTypePers"),
    @NamedQuery(name = "Etre.findByDatePers", query = "SELECT e FROM Etre e WHERE e.datePers = :datePers")})
public class Etre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected EtrePK etrePK;
    @Column(name = "DATE_PERS")
    @Temporal(TemporalType.DATE)
    private Date datePers;
    @JoinColumn(name = "CODE_TYPE_PERS", referencedColumnName = "CODE_TYPE_PERS", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TypePersonne typePersonne;
    @JoinColumn(name = "NUM_SOUSCRIPTEUR", referencedColumnName = "NUM_SOUSCRIPTEUR", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personne personne;

    public Etre() {
    }

    public Etre(EtrePK etrePK) {
        this.etrePK = etrePK;
    }

    public Etre(String numSouscripteur, int codeTypePers) {
        this.etrePK = new EtrePK(numSouscripteur, codeTypePers);
    }

    public EtrePK getEtrePK() {
        return etrePK;
    }

    public void setEtrePK(EtrePK etrePK) {
        this.etrePK = etrePK;
    }

    public Date getDatePers() {
        return datePers;
    }

    public void setDatePers(Date datePers) {
        this.datePers = datePers;
    }

    public TypePersonne getTypePersonne() {
        return typePersonne;
    }

    public void setTypePersonne(TypePersonne typePersonne) {
        this.typePersonne = typePersonne;
    }

    public Personne getPersonne() {
        return personne;
    }

    public void setPersonne(Personne personne) {
        this.personne = personne;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (etrePK != null ? etrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etre)) {
            return false;
        }
        Etre other = (Etre) object;
        if ((this.etrePK == null && other.etrePK != null) || (this.etrePK != null && !this.etrePK.equals(other.etrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etre[ etrePK=" + etrePK + " ]";
    }
    
}
