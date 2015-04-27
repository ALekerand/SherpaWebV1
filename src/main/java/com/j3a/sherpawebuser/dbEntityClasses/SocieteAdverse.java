/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "societe_adverse")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SocieteAdverse.findAll", query = "SELECT s FROM SocieteAdverse s"),
    @NamedQuery(name = "SocieteAdverse.findByCodeScteadverse", query = "SELECT s FROM SocieteAdverse s WHERE s.codeScteadverse = :codeScteadverse"),
    @NamedQuery(name = "SocieteAdverse.findByRaisonsocialScteadverse", query = "SELECT s FROM SocieteAdverse s WHERE s.raisonsocialScteadverse = :raisonsocialScteadverse"),
    @NamedQuery(name = "SocieteAdverse.findByAdresseScteadverse", query = "SELECT s FROM SocieteAdverse s WHERE s.adresseScteadverse = :adresseScteadverse"),
    @NamedQuery(name = "SocieteAdverse.findByTelephoneScteadverse", query = "SELECT s FROM SocieteAdverse s WHERE s.telephoneScteadverse = :telephoneScteadverse"),
    @NamedQuery(name = "SocieteAdverse.findByFaxSteadverse", query = "SELECT s FROM SocieteAdverse s WHERE s.faxSteadverse = :faxSteadverse")})
public class SocieteAdverse implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_SCTEADVERSE")
    private String codeScteadverse;
    @Size(max = 30)
    @Column(name = "RAISONSOCIAL_SCTEADVERSE")
    private String raisonsocialScteadverse;
    @Size(max = 25)
    @Column(name = "ADRESSE_SCTEADVERSE")
    private String adresseScteadverse;
    @Size(max = 25)
    @Column(name = "TELEPHONE_SCTEADVERSE")
    private String telephoneScteadverse;
    @Size(max = 20)
    @Column(name = "FAX_STEADVERSE")
    private String faxSteadverse;
    @OneToMany(mappedBy = "codeScteadverse")
    private List<PartieAdverse> partieAdverseList;

    public SocieteAdverse() {
    }

    public SocieteAdverse(String codeScteadverse) {
        this.codeScteadverse = codeScteadverse;
    }

    public String getCodeScteadverse() {
        return codeScteadverse;
    }

    public void setCodeScteadverse(String codeScteadverse) {
        this.codeScteadverse = codeScteadverse;
    }

    public String getRaisonsocialScteadverse() {
        return raisonsocialScteadverse;
    }

    public void setRaisonsocialScteadverse(String raisonsocialScteadverse) {
        this.raisonsocialScteadverse = raisonsocialScteadverse;
    }

    public String getAdresseScteadverse() {
        return adresseScteadverse;
    }

    public void setAdresseScteadverse(String adresseScteadverse) {
        this.adresseScteadverse = adresseScteadverse;
    }

    public String getTelephoneScteadverse() {
        return telephoneScteadverse;
    }

    public void setTelephoneScteadverse(String telephoneScteadverse) {
        this.telephoneScteadverse = telephoneScteadverse;
    }

    public String getFaxSteadverse() {
        return faxSteadverse;
    }

    public void setFaxSteadverse(String faxSteadverse) {
        this.faxSteadverse = faxSteadverse;
    }

    @XmlTransient
    public List<PartieAdverse> getPartieAdverseList() {
        return partieAdverseList;
    }

    public void setPartieAdverseList(List<PartieAdverse> partieAdverseList) {
        this.partieAdverseList = partieAdverseList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeScteadverse != null ? codeScteadverse.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SocieteAdverse)) {
            return false;
        }
        SocieteAdverse other = (SocieteAdverse) object;
        if ((this.codeScteadverse == null && other.codeScteadverse != null) || (this.codeScteadverse != null && !this.codeScteadverse.equals(other.codeScteadverse))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.SocieteAdverse[ codeScteadverse=" + codeScteadverse + " ]";
    }
    
}
