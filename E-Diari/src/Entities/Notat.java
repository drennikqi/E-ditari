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
@Table(name = "Notat")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Notat.findAll", query = "SELECT n FROM Notat n"),
    @NamedQuery(name = "Notat.findById", query = "SELECT n FROM Notat n WHERE n.id = :id"),
    @NamedQuery(name = "Notat.findByLendaID", query = "SELECT n FROM Notat n WHERE n.lendaID = :lendaID"),
    @NamedQuery(name = "Notat.findByNxenesiID", query = "SELECT n FROM Notat n WHERE n.nxenesiID = :nxenesiID"),
    @NamedQuery(name = "Notat.findByNota", query = "SELECT n FROM Notat n WHERE n.nota = :nota")})
public class Notat implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "lendaID")
    private int lendaID;
    @Basic(optional = false)
    @Column(name = "nxenesiID")
    private int nxenesiID;
    @Basic(optional = false)
    @Column(name = "nota")
    private int nota;

    public Notat() {
    }

    public Notat(Integer id) {
        this.id = id;
    }

    public Notat(Integer id, int lendaID, int nxenesiID, int nota) {
        this.id = id;
        this.lendaID = lendaID;
        this.nxenesiID = nxenesiID;
        this.nota = nota;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getLendaID() {
        return lendaID;
    }

    public void setLendaID(int lendaID) {
        this.lendaID = lendaID;
    }

    public int getNxenesiID() {
        return nxenesiID;
    }

    public void setNxenesiID(int nxenesiID) {
        this.nxenesiID = nxenesiID;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
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
        if (!(object instanceof Notat)) {
            return false;
        }
        Notat other = (Notat) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Entities.Notat[ id=" + id + " ]";
    }
    
}
