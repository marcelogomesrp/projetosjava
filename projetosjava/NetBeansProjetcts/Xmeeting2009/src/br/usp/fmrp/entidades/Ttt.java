/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "ttt", catalog = "xmeeting", schema = "public")
@NamedQueries({@NamedQuery(name = "Ttt.findAll", query = "SELECT t FROM Ttt t"), @NamedQuery(name = "Ttt.findByAa", query = "SELECT t FROM Ttt t WHERE t.aa = :aa")})
public class Ttt implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "aa", nullable = false)
    private Integer aa;

    public Ttt() {
    }

    public Ttt(Integer aa) {
        this.aa = aa;
    }

    public Integer getAa() {
        return aa;
    }

    public void setAa(Integer aa) {
        this.aa = aa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (aa != null ? aa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Ttt)) {
            return false;
        }
        Ttt other = (Ttt) object;
        if ((this.aa == null && other.aa != null) || (this.aa != null && !this.aa.equals(other.aa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.Ttt[aa=" + aa + "]";
    }

}
