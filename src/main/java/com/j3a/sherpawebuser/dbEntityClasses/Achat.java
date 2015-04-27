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
import javax.persistence.ManyToOne;
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
@Table(name = "achat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Achat.findAll", query = "SELECT a FROM Achat a"),
    @NamedQuery(name = "Achat.findByCodePortefeilles", query = "SELECT a FROM Achat a WHERE a.codePortefeilles = :codePortefeilles"),
    @NamedQuery(name = "Achat.findByNatureAchat", query = "SELECT a FROM Achat a WHERE a.natureAchat = :natureAchat"),
    @NamedQuery(name = "Achat.findByCedantAchat", query = "SELECT a FROM Achat a WHERE a.cedantAchat = :cedantAchat")})
public class Achat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PORTEFEILLES")
    private String codePortefeilles;
    @Size(max = 20)
    @Column(name = "NATURE_ACHAT")
    private String natureAchat;
    @Size(max = 20)
    @Column(name = "CEDANT_ACHAT")
    private String cedantAchat;
    @JoinColumn(name = "CODE_PORTEFEILLES", referencedColumnName = "CODE_PORTEFEILLES", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Portefeuilles portefeuilles;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne
    private Exercice codeexercice;

    public Achat() {
    }

    public Achat(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    public String getCodePortefeilles() {
        return codePortefeilles;
    }

    public void setCodePortefeilles(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    public String getNatureAchat() {
        return natureAchat;
    }

    public void setNatureAchat(String natureAchat) {
        this.natureAchat = natureAchat;
    }

    public String getCedantAchat() {
        return cedantAchat;
    }

    public void setCedantAchat(String cedantAchat) {
        this.cedantAchat = cedantAchat;
    }

    public Portefeuilles getPortefeuilles() {
        return portefeuilles;
    }

    public void setPortefeuilles(Portefeuilles portefeuilles) {
        this.portefeuilles = portefeuilles;
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
        hash += (codePortefeilles != null ? codePortefeilles.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Achat)) {
            return false;
        }
        Achat other = (Achat) object;
        if ((this.codePortefeilles == null && other.codePortefeilles != null) || (this.codePortefeilles != null && !this.codePortefeilles.equals(other.codePortefeilles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Achat[ codePortefeilles=" + codePortefeilles + " ]";
    }
    
}
