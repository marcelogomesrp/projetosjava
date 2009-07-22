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
public class Processador implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "gera_processador_id", sequenceName = "processador_sequences", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gera_processador_id")
    private Long id;
    
    private String nome;

    public float getClock() {
        return clock;
    }

    public void setClock(float clock) {
        this.clock = clock;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    private float clock;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
