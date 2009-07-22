/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio.entidade;

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
public class Memoria implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "gera_memoria_id", sequenceName = "memoria_sequences", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gera_memoria_id")
    private Long id;
    
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
