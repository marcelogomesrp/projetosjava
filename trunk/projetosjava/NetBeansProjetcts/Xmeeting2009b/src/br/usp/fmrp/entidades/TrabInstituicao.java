/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.usp.fmrp.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author marcelo
 */
@Entity
@Table(name = "trabInstituicao")
@NamedQueries({@NamedQuery(name = "TrabInstituicao.findAll", query = "SELECT t FROM TrabInstituicao t"), @NamedQuery(name = "TrabInstituicao.findById", query = "SELECT t FROM TrabInstituicao t WHERE t.id = :id"), @NamedQuery(name = "TrabInstituicao.findByTrabalhoId", query = "SELECT t FROM TrabInstituicao t WHERE t.trabalhoId = :trabalhoId"), @NamedQuery(name = "TrabInstituicao.findByNome", query = "SELECT t FROM TrabInstituicao t WHERE t.nome = :nome")})
public class TrabInstituicao implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "trabalho_id")
    private int trabalhoId;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;

    public TrabInstituicao() {
    }

    public TrabInstituicao(Integer id) {
        this.id = id;
    }

    public TrabInstituicao(Integer id, int trabalhoId, String nome) {
        this.id = id;
        this.trabalhoId = trabalhoId;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getTrabalhoId() {
        return trabalhoId;
    }

    public void setTrabalhoId(int trabalhoId) {
        this.trabalhoId = trabalhoId;
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
        if (!(object instanceof TrabInstituicao)) {
            return false;
        }
        TrabInstituicao other = (TrabInstituicao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.TrabInstituicao[id=" + id + "]";
    }

}
