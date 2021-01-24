/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author dreni
 */
@Entity
@Table(name = "Perdoruesit")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Perdoruesit.findAll", query = "SELECT p FROM Perdoruesit p"),
    @NamedQuery(name = "Perdoruesit.findById", query = "SELECT p FROM Perdoruesit p WHERE p.id = :id"),
    @NamedQuery(name = "Perdoruesit.findByUsername", query = "SELECT p FROM Perdoruesit p WHERE p.username = :username"),
    @NamedQuery(name = "Perdoruesit.findByPassword", query = "SELECT p FROM Perdoruesit p WHERE p.password = :password"),
    @NamedQuery(name = "Perdoruesit.findByEmri", query = "SELECT p FROM Perdoruesit p WHERE p.emri = :emri"),
    @NamedQuery(name = "Perdoruesit.findByRoli", query = "SELECT p FROM Perdoruesit p WHERE p.roli = :roli")})
public class Perdoruesit implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer id;
    @Basic(optional = false)
    @Column(name = "username")
    private String username;
    @Basic(optional = false)
    @Column(name = "password")
    private String password;
    @Basic(optional = false)
    @Column(name = "emri")
    private String emri;
    @Basic(optional = false)
    @Column(name = "roli")
    private int roli;

    public Perdoruesit() {
    }

    public Perdoruesit(Integer id) {
        this.id = id;
    }

    public Perdoruesit(Integer id, String username, String password, String emri, int roli) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.emri = emri;
        this.roli = roli;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
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
        if (!(object instanceof Perdoruesit)) {
            return false;
        }
        Perdoruesit other = (Perdoruesit) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Perdoruesit[ id=" + id + " ]";
    }
    
}
