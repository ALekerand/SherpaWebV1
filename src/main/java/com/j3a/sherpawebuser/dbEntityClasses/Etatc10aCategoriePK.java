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
public class Etatc10aCategoriePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODE_ETATC10A")
    private String codeEtatc10a;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODECATEGORIECIMA")
    private String codecategoriecima;

    public Etatc10aCategoriePK() {
    }

    public Etatc10aCategoriePK(String codeEtatc10a, String codecategoriecima) {
        this.codeEtatc10a = codeEtatc10a;
        this.codecategoriecima = codecategoriecima;
    }

    public String getCodeEtatc10a() {
        return codeEtatc10a;
    }

    public void setCodeEtatc10a(String codeEtatc10a) {
        this.codeEtatc10a = codeEtatc10a;
    }

    public String getCodecategoriecima() {
        return codecategoriecima;
    }

    public void setCodecategoriecima(String codecategoriecima) {
        this.codecategoriecima = codecategoriecima;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeEtatc10a != null ? codeEtatc10a.hashCode() : 0);
        hash += (codecategoriecima != null ? codecategoriecima.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10aCategoriePK)) {
            return false;
        }
        Etatc10aCategoriePK other = (Etatc10aCategoriePK) object;
        if ((this.codeEtatc10a == null && other.codeEtatc10a != null) || (this.codeEtatc10a != null && !this.codeEtatc10a.equals(other.codeEtatc10a))) {
            return false;
        }
        if ((this.codecategoriecima == null && other.codecategoriecima != null) || (this.codecategoriecima != null && !this.codecategoriecima.equals(other.codecategoriecima))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10aCategoriePK[ codeEtatc10a=" + codeEtatc10a + ", codecategoriecima=" + codecategoriecima + " ]";
    }
    
}
