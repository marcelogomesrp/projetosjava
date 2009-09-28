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
@Table(name = "trabAutor", catalog = "xmeeting2009", schema = "")
@NamedQueries({@NamedQuery(name = "TrabAutor.findAll", query = "SELECT t FROM TrabAutor t"), @NamedQuery(name = "TrabAutor.findById", query = "SELECT t FROM TrabAutor t WHERE t.id = :id"), @NamedQuery(name = "TrabAutor.findByTrabalhoId", query = "SELECT t FROM TrabAutor t WHERE t.trabalhoId = :trabalhoId"), @NamedQuery(name = "TrabAutor.findByInstituicaoId", query = "SELECT t FROM TrabAutor t WHERE t.instituicaoId = :instituicaoId"), @NamedQuery(name = "TrabAutor.findByNome", query = "SELECT t FROM TrabAutor t WHERE t.nome = :nome"), @NamedQuery(name = "TrabAutor.findByAutoria", query = "SELECT t FROM TrabAutor t WHERE t.autoria = :autoria"), @NamedQuery(name = "TrabAutor.findByEmail", query = "SELECT t FROM TrabAutor t WHERE t.email = :email"), @NamedQuery(name = "TrabAutor.findBySobrenome", query = "SELECT t FROM TrabAutor t WHERE t.sobrenome = :sobrenome")})
public class TrabAutor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @Column(name = "trabalho_id", nullable = false)
    private int trabalhoId;
    @Basic(optional = false)
    @Column(name = "instituicao_id", nullable = false)
    private int instituicaoId;
    @Basic(optional = false)
    @Column(name = "nome", nullable = false, length = 250)
    private String nome;
    @Basic(optional = false)
    @Column(name = "autoria", nullable = false)
    private int autoria;
    @Basic(optional = false)
    @Column(name = "email", nullable = false, length = 250)
    private String email;
    @Basic(optional = false)
    @Column(name = "sobrenome", nullable = false, length = 250)
    private String sobrenome;

    public TrabAutor() {
    }

    public TrabAutor(Integer id) {
        this.id = id;
    }

    public TrabAutor(Integer id, int trabalhoId, int instituicaoId, String nome, int autoria, String email, String sobrenome) {
        this.id = id;
        this.trabalhoId = trabalhoId;
        this.instituicaoId = instituicaoId;
        this.nome = nome;
        this.autoria = autoria;
        this.email = email;
        this.sobrenome = sobrenome;
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

    public int getInstituicaoId() {
        return instituicaoId;
    }

    public void setInstituicaoId(int instituicaoId) {
        this.instituicaoId = instituicaoId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAutoria() {
        return autoria;
    }

    public void setAutoria(int autoria) {
        this.autoria = autoria;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
        if (!(object instanceof TrabAutor)) {
            return false;
        }
        TrabAutor other = (TrabAutor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.usp.fmrp.entidades.TrabAutor[id=" + id + "]";
    }

}
