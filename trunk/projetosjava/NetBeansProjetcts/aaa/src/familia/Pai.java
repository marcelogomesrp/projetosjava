/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package familia;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "pai", catalog = "inventario", schema = "public")
@NamedQueries({@NamedQuery(name = "Pai.findAll", query = "SELECT p FROM Pai p"), @NamedQuery(name = "Pai.findById", query = "SELECT p FROM Pai p WHERE p.id = :id"), @NamedQuery(name = "Pai.findByNome", query = "SELECT p FROM Pai p WHERE p.nome = :nome")})
public class Pai implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "nome", length = 255)
    private String nome;
    @OneToMany
    private List<Filho> filhos;

    public List<Filho> getFilhos() {
        return filhos;
    }

    public void setFilhos(List<Filho> filhos) {
        this.filhos = filhos;
    }

    public Pai() {
    }

    public Pai(Long id) {
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
        if (!(object instanceof Pai)) {
            return false;
        }
        Pai other = (Pai) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "familia.Pai[id=" + id + "]";
    }

}
