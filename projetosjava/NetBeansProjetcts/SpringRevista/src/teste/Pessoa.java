/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package teste;

/**
 *
 * @author marcelo
 */
public class Pessoa implements IPessoa {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa() {
    }

    public Pessoa(String nome) {
        this.nome = nome;
    }

}
