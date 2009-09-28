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
@Table(name = "trabGrupo", catalog = "xmeeting2009", schema = "")
@NamedQueries({@NamedQuery(name = "TrabGrupo.findAll", query = "SELECT t FROM TrabGrupo t"), @NamedQuery(name = "TrabGrupo.findById", query = "SELECT t FROM TrabGrupo t WHERE t.id = :id"), @NamedQuery(name = "TrabGrupo.findByNome", query = "SELECT t FROM TrabGrupo t WHERE t.nome = :nome")})
public class TrabGrupo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 250)
    private String nome;

    public TrabGrupo() {
    }

    public TrabGrupo(Integer id) {
        this.id = id;
    }

    public TrabGrupo(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (!(object instanceof TrabGrupo)) {
            return false;
        }
        TrabGrupo other = (TrabGrupo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.TrabGrupo[id=" + id + "]";
    }

}
