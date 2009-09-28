/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package helloworld;

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
@Table(name = "computador")
@NamedQueries({@NamedQuery(name = "Computador.findAll", query = "SELECT c FROM Computador c"), @NamedQuery(name = "Computador.findById", query = "SELECT c FROM Computador c WHERE c.id = :id"), @NamedQuery(name = "Computador.findByIp", query = "SELECT c FROM Computador c WHERE c.ip = :ip"), @NamedQuery(name = "Computador.findByNome", query = "SELECT c FROM Computador c WHERE c.nome = :nome"), @NamedQuery(name = "Computador.findByQuantidadedememoria", query = "SELECT c FROM Computador c WHERE c.quantidadedememoria = :quantidadedememoria"), @NamedQuery(name = "Computador.findBySo", query = "SELECT c FROM Computador c WHERE c.so = :so")})
public class Computador implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Column(name = "ip")
    private String ip;
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "quantidadedememoria")
    private int quantidadedememoria;
    @Column(name = "so")
    private String so;

    public Computador() {
    }

    public Computador(Long id) {
        this.id = id;
    }

    public Computador(Long id, int quantidadedememoria) {
        this.id = id;
        this.quantidadedememoria = quantidadedememoria;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidadedememoria() {
        return quantidadedememoria;
    }

    public void setQuantidadedememoria(int quantidadedememoria) {
        this.quantidadedememoria = quantidadedememoria;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
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
        if (!(object instanceof Computador)) {
            return false;
        }
        Computador other = (Computador) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "helloworld.Computador[id=" + id + "]";
    }

}
