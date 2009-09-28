/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package familia;

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
@Table(name = "filho", catalog = "inventario", schema = "public")
@NamedQueries({@NamedQuery(name = "Filho.findAll", query = "SELECT f FROM Filho f"), @NamedQuery(name = "Filho.findById", query = "SELECT f FROM Filho f WHERE f.id = :id"), @NamedQuery(name = "Filho.findByNome", query = "SELECT f FROM Filho f WHERE f.nome = :nome")})
public class Filho implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nome", length = 255)
    private String nome;

    public Filho() {
    }

    public Filho(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        if (!(object instanceof Filho)) {
            return false;
        }
        Filho other = (Filho) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "familia.Filho[id=" + id + "]";
    }

}
