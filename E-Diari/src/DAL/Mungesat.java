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
@Table(name = "Mungesat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mungesat.findAll", query = "SELECT m FROM Mungesat m"),
    @NamedQuery(name = "Mungesat.findById", query = "SELECT m FROM Mungesat m WHERE m.id = :id"),
    @NamedQuery(name = "Mungesat.findByArsyeshme", query = "SELECT m FROM Mungesat m WHERE m.arsyeshme = :arsyeshme"),
    @NamedQuery(name = "Mungesat.findByPaarsyeshme", query = "SELECT m FROM Mungesat m WHERE m.paarsyeshme = :paarsyeshme"),
    @NamedQuery(name = "Mungesat.findByNxenesiID", query = "SELECT m FROM Mungesat m WHERE m.nxenesiID = :nxenesiID")})
public class Mungesat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    
    @GeneratedValue(generator = "InvSeq")
    @SequenceGenerator(name = "InvSeq" , sequenceName = "INV_SEQ", allocationSize = 1)
    
    private Integer id;
    @Basic(optional = false)
    @Column(name = "arsyeshme")
    private int arsyeshme;
    @Basic(optional = false)
    @Column(name = "paarsyeshme")
    private int paarsyeshme;
    @Basic(optional = false)
    @Column(name = "nxenesiID")
    private int nxenesiID;

    public Mungesat() {
    }

    public Mungesat(Integer id) {
        this.id = id;
    }

    public Mungesat(Integer id, int arsyeshme, int paarsyeshme, int nxenesiID) {
        this.id = id;
        this.arsyeshme = arsyeshme;
        this.paarsyeshme = paarsyeshme;
        this.nxenesiID = nxenesiID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getArsyeshme() {
        return arsyeshme;
    }

    public void setArsyeshme(int arsyeshme) {
        this.arsyeshme = arsyeshme;
    }

    public int getPaarsyeshme() {
        return paarsyeshme;
    }

    public void setPaarsyeshme(int paarsyeshme) {
        this.paarsyeshme = paarsyeshme;
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
        if (!(object instanceof Mungesat)) {
            return false;
        }
        Mungesat other = (Mungesat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Mungesat[ id=" + id + " ]";
    }
    
}
