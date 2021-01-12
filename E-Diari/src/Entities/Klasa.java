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
@Table(name = "Klasa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klasa.findAll", query = "SELECT k FROM Klasa k"),
    @NamedQuery(name = "Klasa.findById", query = "SELECT k FROM Klasa k WHERE k.id = :id"),
    @NamedQuery(name = "Klasa.findByNxenesiID", query = "SELECT k FROM Klasa k WHERE k.nxenesiID = :nxenesiID"),
    @NamedQuery(name = "Klasa.findByMesimdhenesiID", query = "SELECT k FROM Klasa k WHERE k.mesimdhenesiID = :mesimdhenesiID")})
public class Klasa implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nxenesiID")
    private int nxenesiID;
    @Basic(optional = false)
    @Column(name = "mesimdhenesiID")
    private int mesimdhenesiID;

    public Klasa() {
    }

    public Klasa(Integer id) {
        this.id = id;
    }

    public Klasa(Integer id, int nxenesiID, int mesimdhenesiID) {
        this.id = id;
        this.nxenesiID = nxenesiID;
        this.mesimdhenesiID = mesimdhenesiID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Klasa)) {
            return false;
        }
        Klasa other = (Klasa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Klasa[ id=" + id + " ]";
    }
    
}
