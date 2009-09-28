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
@Table(name = "trabTopico", catalog = "xmeeting2009", schema = "")
@NamedQueries({@NamedQuery(name = "TrabTopico.findAll", query = "SELECT t FROM TrabTopico t"), @NamedQuery(name = "TrabTopico.findById", query = "SELECT t FROM TrabTopico t WHERE t.id = :id"), @NamedQuery(name = "TrabTopico.findByNome", query = "SELECT t FROM TrabTopico t WHERE t.nome = :nome"), @NamedQuery(name = "TrabTopico.findByGrupoId", query = "SELECT t FROM TrabTopico t WHERE t.grupoId = :grupoId")})
public class TrabTopico implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 250)
    private String nome;
    @Basic(optional = false)
    @Column(name = "grupo_id", nullable = false)
    private int grupoId;

    public TrabTopico() {
    }

    public TrabTopico(Integer id) {
        this.id = id;
    }

    public TrabTopico(Integer id, String nome, int grupoId) {
        this.id = id;
        this.nome = nome;
        this.grupoId = grupoId;
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

    public int getGrupoId() {
        return grupoId;
    }

    public void setGrupoId(int grupoId) {
        this.grupoId = grupoId;
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
        if (!(object instanceof TrabTopico)) {
            return false;
        }
        TrabTopico other = (TrabTopico) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.TrabTopico[id=" + id + "]";
    }

}
