/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package spring;

import springcfg.AcessoSpring;
import teste.IPessoa;
import teste.Pessoa;

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IPessoa pessoa = (Pessoa) AcessoSpring.getSpringContext().getBean("pessoa");
        if(AcessoSpring.getSpringContext() == null){
            System.out.println("Tem erro ");
        }
        System.out.println("Pessoa: " + pessoa.getNome());
    }

}
