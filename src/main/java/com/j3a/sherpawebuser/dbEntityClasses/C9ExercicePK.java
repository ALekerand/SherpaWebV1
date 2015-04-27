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
public class C9ExercicePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEC9CATEGORIE")
    private String codec9categorie;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEEXERCICE")
    private int codeexercice;

    public C9ExercicePK() {
    }

    public C9ExercicePK(String codec9categorie, int codeexercice) {
        this.codec9categorie = codec9categorie;
        this.codeexercice = codeexercice;
    }

    public String getCodec9categorie() {
        return codec9categorie;
    }

    public void setCodec9categorie(String codec9categorie) {
        this.codec9categorie = codec9categorie;
    }

    public int getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(int codeexercice) {
        this.codeexercice = codeexercice;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codec9categorie != null ? codec9categorie.hashCode() : 0);
        hash += (int) codeexercice;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof C9ExercicePK)) {
            return false;
        }
        C9ExercicePK other = (C9ExercicePK) object;
        if ((this.codec9categorie == null && other.codec9categorie != null) || (this.codec9categorie != null && !this.codec9categorie.equals(other.codec9categorie))) {
            return false;
        }
        if (this.codeexercice != other.codeexercice) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.C9ExercicePK[ codec9categorie=" + codec9categorie + ", codeexercice=" + codeexercice + " ]";
    }
    
}
