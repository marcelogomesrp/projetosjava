/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package entidade;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author marcelo
 */
@Entity
public class Pesso implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String nome;
    @JoinColumn(name = "contato_id", referencedColumnName = "id")
    //@OneToOne(mappedBy="Contato",cascade=CascadeType.ALL)
    //@OneToOne
    @OneToOne(cascade=CascadeType.ALL)
    private Contato contato;

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    

    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        if (!(object instanceof Pesso)) {
            return false;
        }
        Pesso other = (Pesso) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidade.Pesso[id=" + id + "]";
    }

    public Pesso() {
    }

    public Pesso(String nome, Contato contato) {
        this.nome = nome;
        this.contato = contato;
    }

    public Pesso(Integer id, String nome, Contato contato) {
        this.id = id;
        this.nome = nome;
        this.contato = contato;
    }


    

}
