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
public class Etatc10tabbExercicePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEEXERCICE")
    private int codeexercice;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "CODEETATC10B")
    private String codeetatc10b;

    public Etatc10tabbExercicePK() {
    }

    public Etatc10tabbExercicePK(int codeexercice, String codeetatc10b) {
        this.codeexercice = codeexercice;
        this.codeetatc10b = codeetatc10b;
    }

    public int getCodeexercice() {
        return codeexercice;
    }

    public void setCodeexercice(int codeexercice) {
        this.codeexercice = codeexercice;
    }

    public String getCodeetatc10b() {
        return codeetatc10b;
    }

    public void setCodeetatc10b(String codeetatc10b) {
        this.codeetatc10b = codeetatc10b;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codeexercice;
        hash += (codeetatc10b != null ? codeetatc10b.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10tabbExercicePK)) {
            return false;
        }
        Etatc10tabbExercicePK other = (Etatc10tabbExercicePK) object;
        if (this.codeexercice != other.codeexercice) {
            return false;
        }
        if ((this.codeetatc10b == null && other.codeetatc10b != null) || (this.codeetatc10b != null && !this.codeetatc10b.equals(other.codeetatc10b))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabbExercicePK[ codeexercice=" + codeexercice + ", codeetatc10b=" + codeetatc10b + " ]";
    }
    
}
