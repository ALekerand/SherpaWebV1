/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "trafic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trafic.findAll", query = "SELECT t FROM Trafic t"),
    @NamedQuery(name = "Trafic.findByCodeTrafic", query = "SELECT t FROM Trafic t WHERE t.codeTrafic = :codeTrafic"),
    @NamedQuery(name = "Trafic.findByNumeroTrafic", query = "SELECT t FROM Trafic t WHERE t.numeroTrafic = :numeroTrafic"),
    @NamedQuery(name = "Trafic.findByDesignationTrafic", query = "SELECT t FROM Trafic t WHERE t.designationTrafic = :designationTrafic"),
    @NamedQuery(name = "Trafic.findByPleinExp", query = "SELECT t FROM Trafic t WHERE t.pleinExp = :pleinExp"),
    @NamedQuery(name = "Trafic.findByAccessoires", query = "SELECT t FROM Trafic t WHERE t.accessoires = :accessoires")})
public class Trafic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "CODE_TRAFIC")
    private String codeTrafic;
    @Column(name = "NUMERO_TRAFIC")
    private Integer numeroTrafic;
    @Size(max = 60)
    @Column(name = "DESIGNATION_TRAFIC")
    private String designationTrafic;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLEIN_EXP")
    private BigDecimal pleinExp;
    @Column(name = "ACCESSOIRES")
    private BigDecimal accessoires;
    @JoinColumn(name = "CODE_LISTE_TRAFIC", referencedColumnName = "CODE_LISTE_TRAFIC")
    @ManyToOne
    private ListeTrafic codeListeTrafic;
    @OneToMany(mappedBy = "codeTrafic")
    private List<Aliment> alimentList;

    public Trafic() {
    }

    public Trafic(String codeTrafic) {
        this.codeTrafic = codeTrafic;
    }

    public String getCodeTrafic() {
        return codeTrafic;
    }

    public void setCodeTrafic(String codeTrafic) {
        this.codeTrafic = codeTrafic;
    }

    public Integer getNumeroTrafic() {
        return numeroTrafic;
    }

    public void setNumeroTrafic(Integer numeroTrafic) {
        this.numeroTrafic = numeroTrafic;
    }

    public String getDesignationTrafic() {
        return designationTrafic;
    }

    public void setDesignationTrafic(String designationTrafic) {
        this.designationTrafic = designationTrafic;
    }

    public BigDecimal getPleinExp() {
        return pleinExp;
    }

    public void setPleinExp(BigDecimal pleinExp) {
        this.pleinExp = pleinExp;
    }

    public BigDecimal getAccessoires() {
        return accessoires;
    }

    public void setAccessoires(BigDecimal accessoires) {
        this.accessoires = accessoires;
    }

    public ListeTrafic getCodeListeTrafic() {
        return codeListeTrafic;
    }

    public void setCodeListeTrafic(ListeTrafic codeListeTrafic) {
        this.codeListeTrafic = codeListeTrafic;
    }

    @XmlTransient
    public List<Aliment> getAlimentList() {
        return alimentList;
    }

    public void setAlimentList(List<Aliment> alimentList) {
        this.alimentList = alimentList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeTrafic != null ? codeTrafic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trafic)) {
            return false;
        }
        Trafic other = (Trafic) object;
        if ((this.codeTrafic == null && other.codeTrafic != null) || (this.codeTrafic != null && !this.codeTrafic.equals(other.codeTrafic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Trafic[ codeTrafic=" + codeTrafic + " ]";
    }
    
}
