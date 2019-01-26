/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Dominika
 */
@Entity
@Table(name = "EGZEMPLARZ")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Egzemplarz.findAll", query = "SELECT e FROM Egzemplarz e")
    , @NamedQuery(name = "Egzemplarz.findByEgzemplarzId", query = "SELECT e FROM Egzemplarz e WHERE e.egzemplarzId = :egzemplarzId")
    , @NamedQuery(name = "Egzemplarz.findByStatus", query = "SELECT e FROM Egzemplarz e WHERE e.status = :status")})
public class Egzemplarz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "EGZEMPLARZ_ID")
    private Integer egzemplarzId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "FILM_ID", referencedColumnName = "FILM_ID")
    @ManyToOne(optional = false)
    private Film filmId;

    public Egzemplarz() {
    }

    public Egzemplarz(Integer egzemplarzId) {
        this.egzemplarzId = egzemplarzId;
    }

    public Egzemplarz(Integer egzemplarzId, String status) {
        this.egzemplarzId = egzemplarzId;
        this.status = status;
    }

    public Integer getEgzemplarzId() {
        return egzemplarzId;
    }

    public void setEgzemplarzId(Integer egzemplarzId) {
        this.egzemplarzId = egzemplarzId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Film getFilmId() {
        return filmId;
    }

    public void setFilmId(Film filmId) {
        this.filmId = filmId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (egzemplarzId != null ? egzemplarzId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Egzemplarz)) {
            return false;
        }
        Egzemplarz other = (Egzemplarz) object;
        if ((this.egzemplarzId == null && other.egzemplarzId != null) || (this.egzemplarzId != null && !this.egzemplarzId.equals(other.egzemplarzId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entities.Egzemplarz[ egzemplarzId=" + egzemplarzId + " ]";
    }
    
}
