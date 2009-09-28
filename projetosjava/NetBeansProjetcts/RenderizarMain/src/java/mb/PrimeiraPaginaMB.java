/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

/**
 *
 * @author marcelo
 */

public class PrimeiraPaginaMB {

    private String pg;
    private String valor;
    private Integer contador;
    private String tempo;

    public String getTempo() {
        this.contador++;
        //Thread.currentThread().sleep(10);
        this.tempo = "Total do tempo = ".concat(String.valueOf(this.contador));

        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    

    public String getValor() {        
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    

    /** Creates a new instance of PrimeirPaginaMB */
    public PrimeiraPaginaMB() {
        this.contador = 0;
        this.pg = "./valor1.xhtml";
    }

    public String doPrimeiraPagina(){
        this.pg = "./valor1.xhtml";
        return "sucesso";
    }

    public String doSegundaPagina(){
        this.pg = "./valor2.xhtml";
        return "sucesso";
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }




}
