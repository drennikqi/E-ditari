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
@Table(name = "Nxenesi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Nxenesi.findAll", query = "SELECT n FROM Nxenesi n"),
    @NamedQuery(name = "Nxenesi.findById", query = "SELECT n FROM Nxenesi n WHERE n.id = :id"),
    @NamedQuery(name = "Nxenesi.findByEmri", query = "SELECT n FROM Nxenesi n WHERE n.emri = :emri"),
    @NamedQuery(name = "Nxenesi.findByPassword", query = "SELECT n FROM Nxenesi n WHERE n.password = :password"),
    @NamedQuery(name = "Nxenesi.findByDitelindja", query = "SELECT n FROM Nxenesi n WHERE n.ditelindja = :ditelindja"),
    @NamedQuery(name = "Nxenesi.findByNotatID", query = "SELECT n FROM Nxenesi n WHERE n.notatID = :notatID"),
    @NamedQuery(name = "Nxenesi.findByMungesaID", query = "SELECT n FROM Nxenesi n WHERE n.mungesaID = :mungesaID")})
public class Nxenesi implements Serializable {
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
    @Column(name = "notatID")
    private int notatID;
    @Basic(optional = false)
    @Column(name = "mungesaID")
    private int mungesaID;

    public Nxenesi() {
    }

    public Nxenesi(Integer id) {
        this.id = id;
    }

    public Nxenesi(Integer id, String emri, String password, Date ditelindja, int notatID, int mungesaID) {
        this.id = id;
        this.emri = emri;
        this.password = password;
        this.ditelindja = ditelindja;
        this.notatID = notatID;
        this.mungesaID = mungesaID;
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

    public int getNotatID() {
        return notatID;
    }

    public void setNotatID(int notatID) {
        this.notatID = notatID;
    }

    public int getMungesaID() {
        return mungesaID;
    }

    public void setMungesaID(int mungesaID) {
        this.mungesaID = mungesaID;
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
        if (!(object instanceof Nxenesi)) {
            return false;
        }
        Nxenesi other = (Nxenesi) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Nxenesi[ id=" + id + " ]";
    }
    
}
