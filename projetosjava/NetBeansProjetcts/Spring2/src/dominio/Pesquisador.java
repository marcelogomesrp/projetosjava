/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dominio;

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
@Table(name = "pesquisador")
@NamedQueries({@NamedQuery(name = "Pesquisador.findAll", query = "SELECT p FROM Pesquisador p"), @NamedQuery(name = "Pesquisador.findById", query = "SELECT p FROM Pesquisador p WHERE p.id = :id"), @NamedQuery(name = "Pesquisador.findByEmail", query = "SELECT p FROM Pesquisador p WHERE p.email = :email"), @NamedQuery(name = "Pesquisador.findByFone", query = "SELECT p FROM Pesquisador p WHERE p.fone = :fone"), @NamedQuery(name = "Pesquisador.findByNome", query = "SELECT p FROM Pesquisador p WHERE p.nome = :nome"), @NamedQuery(name = "Pesquisador.findBySenha", query = "SELECT p FROM Pesquisador p WHERE p.senha = :senha")})
public class Pesquisador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "email")
    private String email;
    @Column(name = "fone")
    private String fone;
    @Column(name = "nome")
    private String nome;
    @Column(name = "senha")
    private String senha;

    public Pesquisador() {
    }

    public Pesquisador(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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
        if (!(object instanceof Pesquisador)) {
            return false;
        }
        Pesquisador other = (Pesquisador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dominio.Pesquisador[id=" + id + "]";
    }

}
