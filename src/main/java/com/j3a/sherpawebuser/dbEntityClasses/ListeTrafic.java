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
import javax.persistence.CascadeType;
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
@Table(name = "liste_trafic")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListeTrafic.findAll", query = "SELECT l FROM ListeTrafic l"),
    @NamedQuery(name = "ListeTrafic.findByCodeListeTrafic", query = "SELECT l FROM ListeTrafic l WHERE l.codeListeTrafic = :codeListeTrafic"),
    @NamedQuery(name = "ListeTrafic.findByCadence", query = "SELECT l FROM ListeTrafic l WHERE l.cadence = :cadence"),
    @NamedQuery(name = "ListeTrafic.findByRessortie", query = "SELECT l FROM ListeTrafic l WHERE l.ressortie = :ressortie"),
    @NamedQuery(name = "ListeTrafic.findByPleinExped", query = "SELECT l FROM ListeTrafic l WHERE l.pleinExped = :pleinExped"),
    @NamedQuery(name = "ListeTrafic.findByReductionListeTrafic", query = "SELECT l FROM ListeTrafic l WHERE l.reductionListeTrafic = :reductionListeTrafic")})
public class ListeTrafic implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 27)
    @Column(name = "CODE_LISTE_TRAFIC")
    private String codeListeTrafic;
    @Size(max = 20)
    @Column(name = "CADENCE")
    private String cadence;
    @Size(max = 20)
    @Column(name = "RESSORTIE")
    private String ressortie;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PLEIN_EXPED")
    private BigDecimal pleinExped;
    @Column(name = "REDUCTION_LISTE_TRAFIC")
    private Integer reductionListeTrafic;
    @OneToMany(mappedBy = "codeListeTrafic")
    private List<Trafic> traficList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "listeTrafic")
    private List<AvTrafic> avTraficList;

    public ListeTrafic() {
    }

    public ListeTrafic(String codeListeTrafic) {
        this.codeListeTrafic = codeListeTrafic;
    }

    public String getCodeListeTrafic() {
        return codeListeTrafic;
    }

    public void setCodeListeTrafic(String codeListeTrafic) {
        this.codeListeTrafic = codeListeTrafic;
    }

    public String getCadence() {
        return cadence;
    }

    public void setCadence(String cadence) {
        this.cadence = cadence;
    }

    public String getRessortie() {
        return ressortie;
    }

    public void setRessortie(String ressortie) {
        this.ressortie = ressortie;
    }

    public BigDecimal getPleinExped() {
        return pleinExped;
    }

    public void setPleinExped(BigDecimal pleinExped) {
        this.pleinExped = pleinExped;
    }

    public Integer getReductionListeTrafic() {
        return reductionListeTrafic;
    }

    public void setReductionListeTrafic(Integer reductionListeTrafic) {
        this.reductionListeTrafic = reductionListeTrafic;
    }

    @XmlTransient
    public List<Trafic> getTraficList() {
        return traficList;
    }

    public void setTraficList(List<Trafic> traficList) {
        this.traficList = traficList;
    }

    @XmlTransient
    public List<AvTrafic> getAvTraficList() {
        return avTraficList;
    }

    public void setAvTraficList(List<AvTrafic> avTraficList) {
        this.avTraficList = avTraficList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codeListeTrafic != null ? codeListeTrafic.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListeTrafic)) {
            return false;
        }
        ListeTrafic other = (ListeTrafic) object;
        if ((this.codeListeTrafic == null && other.codeListeTrafic != null) || (this.codeListeTrafic != null && !this.codeListeTrafic.equals(other.codeListeTrafic))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.ListeTrafic[ codeListeTrafic=" + codeListeTrafic + " ]";
    }

}
