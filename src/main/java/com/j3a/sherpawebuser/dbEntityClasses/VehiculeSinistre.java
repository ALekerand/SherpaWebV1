/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author J3A-AFRIQUE
 */
@Entity
@Table(name = "vehicule_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VehiculeSinistre.findAll", query = "SELECT v FROM VehiculeSinistre v"),
    @NamedQuery(name = "VehiculeSinistre.findByCodeSinistre", query = "SELECT v FROM VehiculeSinistre v WHERE v.vehiculeSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "VehiculeSinistre.findByCodeVehicule", query = "SELECT v FROM VehiculeSinistre v WHERE v.vehiculeSinistrePK.codeVehicule = :codeVehicule"),
    @NamedQuery(name = "VehiculeSinistre.findByLieuSinistre", query = "SELECT v FROM VehiculeSinistre v WHERE v.lieuSinistre = :lieuSinistre"),
    @NamedQuery(name = "VehiculeSinistre.findByNbreDeces", query = "SELECT v FROM VehiculeSinistre v WHERE v.nbreDeces = :nbreDeces"),
    @NamedQuery(name = "VehiculeSinistre.findByNbreBlesse", query = "SELECT v FROM VehiculeSinistre v WHERE v.nbreBlesse = :nbreBlesse"),
    @NamedQuery(name = "VehiculeSinistre.findByRcAssure", query = "SELECT v FROM VehiculeSinistre v WHERE v.rcAssure = :rcAssure"),
    @NamedQuery(name = "VehiculeSinistre.findByDomageMat", query = "SELECT v FROM VehiculeSinistre v WHERE v.domageMat = :domageMat"),
    @NamedQuery(name = "VehiculeSinistre.findByDomageCorp", query = "SELECT v FROM VehiculeSinistre v WHERE v.domageCorp = :domageCorp"),
    @NamedQuery(name = "VehiculeSinistre.findByDateSinistreAuto", query = "SELECT v FROM VehiculeSinistre v WHERE v.dateSinistreAuto = :dateSinistreAuto")})
public class VehiculeSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected VehiculeSinistrePK vehiculeSinistrePK;
    @Size(max = 60)
    @Column(name = "LIEU_SINISTRE")
    private String lieuSinistre;
    @Column(name = "NBRE_DECES")
    private Integer nbreDeces;
    @Column(name = "NBRE_BLESSE")
    private Integer nbreBlesse;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RC_ASSURE")
    private BigDecimal rcAssure;
    @Column(name = "DOMAGE_MAT")
    private Boolean domageMat;
    @Column(name = "DOMAGE_CORP")
    private Boolean domageCorp;
    @Lob
    @Size(max = 65535)
    @Column(name = "LIBELLE_DOMAGE_MAT")
    private String libelleDomageMat;
    @Lob
    @Size(max = 65535)
    @Column(name = "LIBELLE_DOMAGE_CORP")
    private String libelleDomageCorp;
    @Column(name = "DATE_SINISTRE_AUTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreAuto;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;
    @JoinColumn(name = "CODE_VEHICULE", referencedColumnName = "CODE_VEHICULE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Vehicule vehicule;

    public VehiculeSinistre() {
    }

    public VehiculeSinistre(VehiculeSinistrePK vehiculeSinistrePK) {
        this.vehiculeSinistrePK = vehiculeSinistrePK;
    }

    public VehiculeSinistre(String codeSinistre, String codeVehicule) {
        this.vehiculeSinistrePK = new VehiculeSinistrePK(codeSinistre, codeVehicule);
    }

    public VehiculeSinistrePK getVehiculeSinistrePK() {
        return vehiculeSinistrePK;
    }

    public void setVehiculeSinistrePK(VehiculeSinistrePK vehiculeSinistrePK) {
        this.vehiculeSinistrePK = vehiculeSinistrePK;
    }

    public String getLieuSinistre() {
        return lieuSinistre;
    }

    public void setLieuSinistre(String lieuSinistre) {
        this.lieuSinistre = lieuSinistre;
    }

    public Integer getNbreDeces() {
        return nbreDeces;
    }

    public void setNbreDeces(Integer nbreDeces) {
        this.nbreDeces = nbreDeces;
    }

    public Integer getNbreBlesse() {
        return nbreBlesse;
    }

    public void setNbreBlesse(Integer nbreBlesse) {
        this.nbreBlesse = nbreBlesse;
    }

    public BigDecimal getRcAssure() {
        return rcAssure;
    }

    public void setRcAssure(BigDecimal rcAssure) {
        this.rcAssure = rcAssure;
    }

    public Boolean getDomageMat() {
        return domageMat;
    }

    public void setDomageMat(Boolean domageMat) {
        this.domageMat = domageMat;
    }

    public Boolean getDomageCorp() {
        return domageCorp;
    }

    public void setDomageCorp(Boolean domageCorp) {
        this.domageCorp = domageCorp;
    }

    public String getLibelleDomageMat() {
        return libelleDomageMat;
    }

    public void setLibelleDomageMat(String libelleDomageMat) {
        this.libelleDomageMat = libelleDomageMat;
    }

    public String getLibelleDomageCorp() {
        return libelleDomageCorp;
    }

    public void setLibelleDomageCorp(String libelleDomageCorp) {
        this.libelleDomageCorp = libelleDomageCorp;
    }

    public Date getDateSinistreAuto() {
        return dateSinistreAuto;
    }

    public void setDateSinistreAuto(Date dateSinistreAuto) {
        this.dateSinistreAuto = dateSinistreAuto;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    public Vehicule getVehicule() {
        return vehicule;
    }

    public void setVehicule(Vehicule vehicule) {
        this.vehicule = vehicule;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (vehiculeSinistrePK != null ? vehiculeSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VehiculeSinistre)) {
            return false;
        }
        VehiculeSinistre other = (VehiculeSinistre) object;
        if ((this.vehiculeSinistrePK == null && other.vehiculeSinistrePK != null) || (this.vehiculeSinistrePK != null && !this.vehiculeSinistrePK.equals(other.vehiculeSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.VehiculeSinistre[ vehiculeSinistrePK=" + vehiculeSinistrePK + " ]";
    }
    
}
