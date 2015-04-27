/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.j3a.sherpawebuser.dbEntityClasses;

import java.io.Serializable;
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
@Table(name = "corps_sinistre")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CorpsSinistre.findAll", query = "SELECT c FROM CorpsSinistre c"),
    @NamedQuery(name = "CorpsSinistre.findByCodeSinistre", query = "SELECT c FROM CorpsSinistre c WHERE c.corpsSinistrePK.codeSinistre = :codeSinistre"),
    @NamedQuery(name = "CorpsSinistre.findByCodeEngin", query = "SELECT c FROM CorpsSinistre c WHERE c.corpsSinistrePK.codeEngin = :codeEngin"),
    @NamedQuery(name = "CorpsSinistre.findByRefAssureCorps", query = "SELECT c FROM CorpsSinistre c WHERE c.refAssureCorps = :refAssureCorps"),
    @NamedQuery(name = "CorpsSinistre.findByNumPvSinistreCorps", query = "SELECT c FROM CorpsSinistre c WHERE c.numPvSinistreCorps = :numPvSinistreCorps"),
    @NamedQuery(name = "CorpsSinistre.findByDateSinistreCorps", query = "SELECT c FROM CorpsSinistre c WHERE c.dateSinistreCorps = :dateSinistreCorps")})
public class CorpsSinistre implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CorpsSinistrePK corpsSinistrePK;
    @Lob
    @Size(max = 65535)
    @Column(name = "CIRCONSTANCES_SINISTRE_CORPS")
    private String circonstancesSinistreCorps;
    @Lob
    @Size(max = 65535)
    @Column(name = "DOMMAGES_SINISTRE_CORPS")
    private String dommagesSinistreCorps;
    @Size(max = 20)
    @Column(name = "REF_ASSURE_CORPS")
    private String refAssureCorps;
    @Size(max = 20)
    @Column(name = "NUM_PV_SINISTRE_CORPS")
    private String numPvSinistreCorps;
    @Column(name = "DATE_SINISTRE_CORPS")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateSinistreCorps;
    @JoinColumn(name = "CODE_ENGIN", referencedColumnName = "CODE_ENGIN", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private CorpsEngin corpsEngin;
    @JoinColumn(name = "CODE_SINISTRE", referencedColumnName = "CODE_SINISTRE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Sinistre sinistre;

    public CorpsSinistre() {
    }

    public CorpsSinistre(CorpsSinistrePK corpsSinistrePK) {
        this.corpsSinistrePK = corpsSinistrePK;
    }

    public CorpsSinistre(String codeSinistre, String codeEngin) {
        this.corpsSinistrePK = new CorpsSinistrePK(codeSinistre, codeEngin);
    }

    public CorpsSinistrePK getCorpsSinistrePK() {
        return corpsSinistrePK;
    }

    public void setCorpsSinistrePK(CorpsSinistrePK corpsSinistrePK) {
        this.corpsSinistrePK = corpsSinistrePK;
    }

    public String getCirconstancesSinistreCorps() {
        return circonstancesSinistreCorps;
    }

    public void setCirconstancesSinistreCorps(String circonstancesSinistreCorps) {
        this.circonstancesSinistreCorps = circonstancesSinistreCorps;
    }

    public String getDommagesSinistreCorps() {
        return dommagesSinistreCorps;
    }

    public void setDommagesSinistreCorps(String dommagesSinistreCorps) {
        this.dommagesSinistreCorps = dommagesSinistreCorps;
    }

    public String getRefAssureCorps() {
        return refAssureCorps;
    }

    public void setRefAssureCorps(String refAssureCorps) {
        this.refAssureCorps = refAssureCorps;
    }

    public String getNumPvSinistreCorps() {
        return numPvSinistreCorps;
    }

    public void setNumPvSinistreCorps(String numPvSinistreCorps) {
        this.numPvSinistreCorps = numPvSinistreCorps;
    }

    public Date getDateSinistreCorps() {
        return dateSinistreCorps;
    }

    public void setDateSinistreCorps(Date dateSinistreCorps) {
        this.dateSinistreCorps = dateSinistreCorps;
    }

    public CorpsEngin getCorpsEngin() {
        return corpsEngin;
    }

    public void setCorpsEngin(CorpsEngin corpsEngin) {
        this.corpsEngin = corpsEngin;
    }

    public Sinistre getSinistre() {
        return sinistre;
    }

    public void setSinistre(Sinistre sinistre) {
        this.sinistre = sinistre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (corpsSinistrePK != null ? corpsSinistrePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CorpsSinistre)) {
            return false;
        }
        CorpsSinistre other = (CorpsSinistre) object;
        if ((this.corpsSinistrePK == null && other.corpsSinistrePK != null) || (this.corpsSinistrePK != null && !this.corpsSinistrePK.equals(other.corpsSinistrePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.j3a.sherpawebuser.dbEntityClasses.CorpsSinistre[ corpsSinistrePK=" + corpsSinistrePK + " ]";
    }
    
}
