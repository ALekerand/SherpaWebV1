/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "prejudice")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prejudice.findAll", query = "SELECT p FROM Prejudice p"),
    @NamedQuery(name = "Prejudice.findByCodePrejudice", query = "SELECT p FROM Prejudice p WHERE p.codePrejudice = :codePrejudice"),
    @NamedQuery(name = "Prejudice.findByLibellePrejudice", query = "SELECT p FROM Prejudice p WHERE p.libellePrejudice = :libellePrejudice"),
    @NamedQuery(name = "Prejudice.findByDatePrejudice", query = "SELECT p FROM Prejudice p WHERE p.datePrejudice = :datePrejudice"),
    @NamedQuery(name = "Prejudice.findByTaux", query = "SELECT p FROM Prejudice p WHERE p.taux = :taux"),
    @NamedQuery(name = "Prejudice.findByMontantReel", query = "SELECT p FROM Prejudice p WHERE p.montantReel = :montantReel"),
    @NamedQuery(name = "Prejudice.findByMontantMaximum", query = "SELECT p FROM Prejudice p WHERE p.montantMaximum = :montantMaximum"),
    @NamedQuery(name = "Prejudice.findByTypePrejudice", query = "SELECT p FROM Prejudice p WHERE p.typePrejudice = :typePrejudice"),
    @NamedQuery(name = "Prejudice.findByRente", query = "SELECT p FROM Prejudice p WHERE p.rente = :rente")})
public class Prejudice implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "CODE_PREJUDICE")
    private String codePrejudice;
    @Size(max = 50)
    @Column(name = "LIBELLE_PREJUDICE")
    private String libellePrejudice;
    @Column(name = "DATE_PREJUDICE")
    @Temporal(TemporalType.DATE)
    private Date datePrejudice;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TAUX")
    private BigDecimal taux;
    @Column(name = "MONTANT_REEL")
    private BigDecimal montantReel;
    @Column(name = "MONTANT_MAXIMUM")
    private BigDecimal montantMaximum;
    @Size(max = 100)
    @Column(name = "TYPE_PREJUDICE")
    private String typePrejudice;
    @Column(name = "RENTE")
    private BigDecimal rente;
    @JoinColumn(name = "CODE_AYANT_DROIT", referencedColumnName = "CODE_AYANT_DROIT")
    @ManyToOne
    private AyantDroit codeAyantDroit;
    @JoinColumn(name = "NUM_VICTIME", referencedColumnName = "NUM_VICTIME")
    @ManyToOne
    private Victime numVictime;

    public Prejudice() {
    }

    public Prejudice(String codePrejudice) {
        this.codePrejudice = codePrejudice;
    }

    public String getCodePrejudice() {
        return codePrejudice;
    }

    public void setCodePrejudice(String codePrejudice) {
        this.codePrejudice = codePrejudice;
    }

    public String getLibellePrejudice() {
        return libellePrejudice;
    }

    public void setLibellePrejudice(String libellePrejudice) {
        this.libellePrejudice = libellePrejudice;
    }

    public Date getDatePrejudice() {
        return datePrejudice;
    }

    public void setDatePrejudice(Date datePrejudice) {
        this.datePrejudice = datePrejudice;
    }

    public BigDecimal getTaux() {
        return taux;
    }

    public void setTaux(BigDecimal taux) {
        this.taux = taux;
    }

    public BigDecimal getMontantReel() {
        return montantReel;
    }

    public void setMontantReel(BigDecimal montantReel) {
        this.montantReel = montantReel;
    }

    public BigDecimal getMontantMaximum() {
        return montantMaximum;
    }

    public void setMontantMaximum(BigDecimal montantMaximum) {
        this.montantMaximum = montantMaximum;
    }

    public String getTypePrejudice() {
        return typePrejudice;
    }

    public void setTypePrejudice(String typePrejudice) {
        this.typePrejudice = typePrejudice;
    }

    public BigDecimal getRente() {
        return rente;
    }

    public void setRente(BigDecimal rente) {
        this.rente = rente;
    }

    public AyantDroit getCodeAyantDroit() {
        return codeAyantDroit;
    }

    public void setCodeAyantDroit(AyantDroit codeAyantDroit) {
        this.codeAyantDroit = codeAyantDroit;
    }

    public Victime getNumVictime() {
        return numVictime;
    }

    public void setNumVictime(Victime numVictime) {
        this.numVictime = numVictime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codePrejudice != null ? codePrejudice.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Prejudice)) {
            return false;
        }
        Prejudice other = (Prejudice) object;
        if ((this.codePrejudice == null && other.codePrejudice != null) || (this.codePrejudice != null && !this.codePrejudice.equals(other.codePrejudice))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.Prejudice[ codePrejudice=" + codePrejudice + " ]";
    }
    
}
