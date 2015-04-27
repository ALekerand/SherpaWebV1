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
@Table(name = "vente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vente.findAll", query = "SELECT v FROM Vente v"),
    @NamedQuery(name = "Vente.findByCodePortefeilles", query = "SELECT v FROM Vente v WHERE v.codePortefeilles = :codePortefeilles"),
    @NamedQuery(name = "Vente.findByNatureVente", query = "SELECT v FROM Vente v WHERE v.natureVente = :natureVente"),
    @NamedQuery(name = "Vente.findByAcquereurVente", query = "SELECT v FROM Vente v WHERE v.acquereurVente = :acquereurVente"),
    @NamedQuery(name = "Vente.findByMontantVente", query = "SELECT v FROM Vente v WHERE v.montantVente = :montantVente")})
public class Vente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PORTEFEILLES")
    private String codePortefeilles;
    @Size(max = 20)
    @Column(name = "NATURE_VENTE")
    private String natureVente;
    @Size(max = 20)
    @Column(name = "ACQUEREUR_VENTE")
    private String acquereurVente;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTANT_VENTE")
    private BigDecimal montantVente;
    @JoinColumn(name = "CODE_PORTEFEILLES", referencedColumnName = "CODE_PORTEFEILLES", insertable = false, updatable = false)
    @OneToOne(optional = false)
    private Portefeuilles portefeuilles;
    @JoinColumn(name = "CODEEXERCICE", referencedColumnName = "CODEEXERCICE")
    @ManyToOne
    private Exercice codeexercice;

    public Vente() {
    }

    public Vente(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    public String getCodePortefeilles() {
        return codePortefeilles;
    }

    public void setCodePortefeilles(String codePortefeilles) {
        this.codePortefeilles = codePortefeilles;
    }

    public String getNatureVente() {
        return natureVente;
    }

    public void setNatureVente(String natureVente) {
        this.natureVente = natureVente;
    }

    public String getAcquereurVente() {
        return acquereurVente;
    }

    public void setAcquereurVente(String acquereurVente) {
        this.acquereurVente = acquereurVente;
    }

    public BigDecimal getMontantVente() {
        return montantVente;
    }

    public void setMontantVente(BigDecimal montantVente) {
        this.montantVente = montantVente;
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
        if (!(object instanceof Vente)) {
            return false;
        }
        Vente other = (Vente) object;
        if ((this.codePortefeilles == null && other.codePortefeilles != null) || (this.codePortefeilles != null && !this.codePortefeilles.equals(other.codePortefeilles))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Vente[ codePortefeilles=" + codePortefeilles + " ]";
    }
    
}
