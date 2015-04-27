/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author J3A-AFRIQUE
 */
@Embeddable
public class TypeApporteurCategoriePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ID_TYPE")
    private String idType;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "CODE_CATEGORIE")
    private String codeCategorie;

    public TypeApporteurCategoriePK() {
    }

    public TypeApporteurCategoriePK(String idType, String codeCategorie) {
        this.idType = idType;
        this.codeCategorie = codeCategorie;
    }

    public String getIdType() {
        return idType;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public String getCodeCategorie() {
        return codeCategorie;
    }

    public void setCodeCategorie(String codeCategorie) {
        this.codeCategorie = codeCategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idType != null ? idType.hashCode() : 0);
        hash += (codeCategorie != null ? codeCategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TypeApporteurCategoriePK)) {
            return false;
        }
        TypeApporteurCategoriePK other = (TypeApporteurCategoriePK) object;
        if ((this.idType == null && other.idType != null) || (this.idType != null && !this.idType.equals(other.idType))) {
            return false;
        }
        if ((this.codeCategorie == null && other.codeCategorie != null) || (this.codeCategorie != null && !this.codeCategorie.equals(other.codeCategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.TypeApporteurCategoriePK[ idType=" + idType + ", codeCategorie=" + codeCategorie + " ]";
    }
    
}
