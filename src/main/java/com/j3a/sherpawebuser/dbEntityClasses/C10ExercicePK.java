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
public class C10ExercicePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEEXERCICE")
    private int codeexercice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEC10BCATEGORIE")
    private String codec10bcategorie;

    public C10ExercicePK() {
    }

    public C10ExercicePK(int codeexercice, String codec10bcategorie) {
        this.codeexercice = codeexercice;
        this.codec10bcategorie = codec10bcategorie;
    }

    public int getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(int codeexercice) {
        this.codeexercice = codeexercice;
    }

    public String getCodec10bcategorie() {
        return codec10bcategorie;
    }

    public void setCodec10bcategorie(String codec10bcategorie) {
        this.codec10bcategorie = codec10bcategorie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeexercice;
        hash += (codec10bcategorie != null ? codec10bcategorie.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof C10ExercicePK)) {
            return false;
        }
        C10ExercicePK other = (C10ExercicePK) object;
        if (this.codeexercice != other.codeexercice) {
            return false;
        }
        if ((this.codec10bcategorie == null && other.codec10bcategorie != null) || (this.codec10bcategorie != null && !this.codec10bcategorie.equals(other.codec10bcategorie))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.C10ExercicePK[ codeexercice=" + codeexercice + ", codec10bcategorie=" + codec10bcategorie + " ]";
    }
    
}
