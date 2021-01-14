/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dreni
 */
@Entity
@Table(name = "Prindi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Prindi.findAll", query = "SELECT p FROM Prindi p"),
    @NamedQuery(name = "Prindi.findById", query = "SELECT p FROM Prindi p WHERE p.id = :id"),
    @NamedQuery(name = "Prindi.findByEmri", query = "SELECT p FROM Prindi p WHERE p.emri = :emri"),
    @NamedQuery(name = "Prindi.findByPassword", query = "SELECT p FROM Prindi p WHERE p.password = :password"),
    @NamedQuery(name = "Prindi.findByDitelindja", query = "SELECT p FROM Prindi p WHERE p.ditelindja = :ditelindja"),
    @NamedQuery(name = "Prindi.findByNxenesiID", query = "SELECT p FROM Prindi p WHERE p.nxenesiID = :nxenesiID")})
public class Prindi implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "ditelindja")
    @Temporal(TemporalType.DATE)
    private Date ditelindja;
    @Basic(optional = false)
    @Column(name = "nxenesiID")
    private int nxenesiID;

    public Prindi() {
    }

    public Prindi(Integer id) {
        this.id = id;
    }

    public Prindi(Integer id, String emri, String password, Date ditelindja, int nxenesiID) {
        this.id = id;
        this.emri = emri;
        this.password = password;
        this.ditelindja = ditelindja;
        this.nxenesiID = nxenesiID;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDitelindja() {
        return ditelindja;
    }

    public void setDitelindja(Date ditelindja) {
        this.ditelindja = ditelindja;
    }

    public int getNxenesiID() {
        return nxenesiID;
    }

    public void setNxenesiID(int nxenesiID) {
        this.nxenesiID = nxenesiID;
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
        if (!(object instanceof Prindi)) {
            return false;
        }
        Prindi other = (Prindi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Prindi[ id=" + id + " ]";
    }
    
}
