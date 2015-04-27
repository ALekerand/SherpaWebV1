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
public class Etatc10tabaExercicePK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODEETATC10")
    private String codeetatc10;
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODEEXERCICE")
    private int codeexercice;

    public Etatc10tabaExercicePK() {
    }

    public Etatc10tabaExercicePK(String codeetatc10, int codeexercice) {
        this.codeetatc10 = codeetatc10;
        this.codeexercice = codeexercice;
    }

    public String getCodeetatc10() {
        return codeetatc10;
    }

    public void setCodeetatc10(String codeetatc10) {
        this.codeetatc10 = codeetatc10;
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
        hash += (codeetatc10 != null ? codeetatc10.hashCode() : 0);
        hash += (int) codeexercice;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Etatc10tabaExercicePK)) {
            return false;
        }
        Etatc10tabaExercicePK other = (Etatc10tabaExercicePK) object;
        if ((this.codeetatc10 == null && other.codeetatc10 != null) || (this.codeetatc10 != null && !this.codeetatc10.equals(other.codeetatc10))) {
            return false;
        }
        if (this.codeexercice != other.codeexercice) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Etatc10tabaExercicePK[ codeetatc10=" + codeetatc10 + ", codeexercice=" + codeexercice + " ]";
    }
    
}
