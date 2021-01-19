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
@Table(name = "Superadmin")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Superadmin.findAll", query = "SELECT s FROM Superadmin s"),
    @NamedQuery(name = "Superadmin.findById", query = "SELECT s FROM Superadmin s WHERE s.id = :id"),
    @NamedQuery(name = "Superadmin.findByEmri", query = "SELECT s FROM Superadmin s WHERE s.emri = :emri"),
    @NamedQuery(name = "Superadmin.findByPassword", query = "SELECT s FROM Superadmin s WHERE s.password = :password"),
    @NamedQuery(name = "Superadmin.findByRoli", query = "SELECT s FROM Superadmin s WHERE s.roli = :roli")})
public class Superadmin implements Serializable {
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
    @Column(name = "roli")
    private int roli;

    public Superadmin() {
    }

    public Superadmin(Integer id) {
        this.id = id;
    }

    public Superadmin(Integer id, String emri, String password, int roli) {
        this.id = id;
        this.emri = emri;
        this.password = password;
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
        if (!(object instanceof Superadmin)) {
            return false;
        }
        Superadmin other = (Superadmin) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Superadmin[ id=" + id + " ]";
    }
    
}
