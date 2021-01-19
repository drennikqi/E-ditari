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
@Table(name = "Drejtori")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Drejtori.findAll", query = "SELECT d FROM Drejtori d"),
    @NamedQuery(name = "Drejtori.findById", query = "SELECT d FROM Drejtori d WHERE d.id = :id"),
    @NamedQuery(name = "Drejtori.findByEmri", query = "SELECT d FROM Drejtori d WHERE d.emri = :emri"),
    @NamedQuery(name = "Drejtori.findByPassword", query = "SELECT d FROM Drejtori d WHERE d.password = :password"),
    @NamedQuery(name = "Drejtori.findByDitelindja", query = "SELECT d FROM Drejtori d WHERE d.ditelindja = :ditelindja"),
    @NamedQuery(name = "Drejtori.findByRoli", query = "SELECT d FROM Drejtori d WHERE d.roli = :roli")})
public class Drejtori implements Serializable {
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
    @Column(name = "roli")
    private int roli;

    public Drejtori() {
    }

    public Drejtori(Integer id) {
        this.id = id;
    }

    public Drejtori(Integer id, String emri, String password, Date ditelindja, int roli) {
        this.id = id;
        this.emri = emri;
        this.password = password;
        this.ditelindja = ditelindja;
        this.roli = roli;
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

    public int getRoli() {
        return roli;
    }

    public void setRoli(int roli) {
        this.roli = roli;
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
        if (!(object instanceof Drejtori)) {
            return false;
        }
        Drejtori other = (Drejtori) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Drejtori[ id=" + id + " ]";
    }
    
}
