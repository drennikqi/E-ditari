/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dreni
 */
@Entity
@Table(name = "Lenda")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Lenda.findAll", query = "SELECT l FROM Lenda l"),
    @NamedQuery(name = "Lenda.findById", query = "SELECT l FROM Lenda l WHERE l.id = :id"),
    @NamedQuery(name = "Lenda.findByEmri", query = "SELECT l FROM Lenda l WHERE l.emri = :emri"),
    @NamedQuery(name = "Lenda.findByNxenesiID", query = "SELECT l FROM Lenda l WHERE l.nxenesiID = :nxenesiID"),
    @NamedQuery(name = "Lenda.findByMesimdhenesiID", query = "SELECT l FROM Lenda l WHERE l.mesimdhenesiID = :mesimdhenesiID")})
public class Lenda implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "nxenesiID")
    private int nxenesiID;
    @Basic(optional = false)
    @Column(name = "mesimdhenesiID")
    private int mesimdhenesiID;

    public Lenda() {
    }

    public Lenda(Integer id) {
        this.id = id;
    }

    public Lenda(Integer id, String emri, int nxenesiID, int mesimdhenesiID) {
        this.id = id;
        this.emri = emri;
        this.nxenesiID = nxenesiID;
        this.mesimdhenesiID = mesimdhenesiID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getNxenesiID() {
        return nxenesiID;
    }

    public void setNxenesiID(int nxenesiID) {
        this.nxenesiID = nxenesiID;
    }

    public int getMesimdhenesiID() {
        return mesimdhenesiID;
    }

    public void setMesimdhenesiID(int mesimdhenesiID) {
        this.mesimdhenesiID = mesimdhenesiID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lenda)) {
            return false;
        }
        Lenda other = (Lenda) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Lenda[ id=" + id + " ]";
    }
    
}
