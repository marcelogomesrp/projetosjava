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
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;


/**
 *
 * @author marcelo
 */
@Entity
public class Maquina implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @SequenceGenerator(name = "gera_maquina_id", sequenceName = "maquina_sequences", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gera_maquina_id")
    private Long id;
    private String nome;
    @OneToOne
    private Processador processador;
    private int QuantidadeDeProcessador;
    @OneToOne
    private Memoria memoria;

    public int getQuantidadeDeProcessador() {
        return QuantidadeDeProcessador;
    }

    public void setQuantidadeDeProcessador(int QuantidadeDeProcessador) {
        this.QuantidadeDeProcessador = QuantidadeDeProcessador;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
