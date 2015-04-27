/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
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
@Table(name = "type_apporteur_categorie")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TypeApporteurCategorie.findAll", query = "SELECT t FROM TypeApporteurCategorie t"),
    @NamedQuery(name = "TypeApporteurCategorie.findByIdType", query = "SELECT t FROM TypeApporteurCategorie t WHERE t.typeApporteurCategoriePK.idType = :idType"),
    @NamedQuery(name = "TypeApporteurCategorie.findByCodeCategorie", query = "SELECT t FROM TypeApporteurCategorie t WHERE t.typeApporteurCategoriePK.codeCategorie = :codeCategorie"),
    @NamedQuery(name = "TypeApporteurCategorie.findByTauxComApporteurCategorie", query = "SELECT t FROM TypeApporteurCategorie t WHERE t.tauxComApporteurCategorie = :tauxComApporteurCategorie"),
    @NamedQuery(name = "TypeApporteurCategorie.findByDateApporteurCategorie", query = "SELECT t FROM TypeApporteurCategorie t WHERE t.dateApporteurCategorie = :dateApporteurCategorie")})
public class TypeApporteurCategorie implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected TypeApporteurCategoriePK typeApporteurCategoriePK;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX_COM_APPORTEUR_CATEGORIE")
    private BigDecimal tauxComApporteurCategorie;
    @Column(name = "DATE_APPORTEUR_CATEGORIE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateApporteurCategorie;
    @JoinColumn(name = "CODE_CATEGORIE", referencedColumnName = "CODE_CATEGORIE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Categorie categorie;
    @JoinColumn(name = "ID_TYPE", referencedColumnName = "ID_TYPE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private TypeApporteur typeApporteur;

    public TypeApporteurCategorie() {
    }

    public TypeApporteurCategorie(TypeApporteurCategoriePK typeApporteurCategoriePK) {
        this.typeApporteurCategoriePK = typeApporteurCategoriePK;
    }

    public TypeApporteurCategorie(String idType, String codeCategorie) {
        this.typeApporteurCategoriePK = new TypeApporteurCategoriePK(idType, codeCategorie);
    }

    public TypeApporteurCategoriePK getTypeApporteurCategoriePK() {
        return typeApporteurCategoriePK;
    }

    public void setTypeApporteurCategoriePK(TypeApporteurCategoriePK typeApporteurCategoriePK) {
        this.typeApporteurCategoriePK = typeApporteurCategoriePK;
    }

    public BigDecimal getTauxComApporteurCategorie() {
        return tauxComApporteurCategorie;
    }

    public void setTauxComApporteurCategorie(BigDecimal tauxComApporteurCategorie) {
        this.tauxComApporteurCategorie = tauxComApporteurCategorie;
    }

    public Date getDateApporteurCategorie() {
        return dateApporteurCategorie;
    }

    public void setDateApporteurCategorie(Date dateApporteurCategorie) {
        this.dateApporteurCategorie = dateApporteurCategorie;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

    public TypeApporteur getTypeApporteur() {
        return typeApporteur;
    }

    public void setTypeApporteur(TypeApporteur typeApporteur) {
        this.typeApporteur = typeApporteur;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (typeApporteurCategoriePK != null ? typeApporteurCategoriePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeApporteurCategorie)) {
            return false;
        }
        TypeApporteurCategorie other = (TypeApporteurCategorie) object;
        if ((this.typeApporteurCategoriePK == null && other.typeApporteurCategoriePK != null) || (this.typeApporteurCategoriePK != null && !this.typeApporteurCategoriePK.equals(other.typeApporteurCategoriePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.TypeApporteurCategorie[ typeApporteurCategoriePK=" + typeApporteurCategoriePK + " ]";
    }
    
}
