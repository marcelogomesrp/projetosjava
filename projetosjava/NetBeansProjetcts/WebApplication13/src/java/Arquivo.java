/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */

public class Arquivo {
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String mostra(){
        System.out.println("To no mostra############################################################################################################");
        this.nome = "marcelo";
        return "ok";
    }
    /** Creates a new instance of Arquivo */
    public Arquivo() {
    }

}
