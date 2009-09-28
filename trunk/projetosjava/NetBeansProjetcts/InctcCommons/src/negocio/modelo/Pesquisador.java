/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


/**
 *
 * @author marcelo
 */
@Entity
public class Pesquisador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name="gera_pesquisador_id", sequenceName="pesquisador_sequences", allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="gera_pesquisador_id")
    private Long id;
    private String nome;
    private String fone;
    private String email;
    private String senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        return "negocio.modelo.Pesquisador[id=" + id + "]";
    }

}
