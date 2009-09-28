
import dao.PesquisadorDAO;
import dominio.Pesquisador;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesquisador pesquisador = new Pesquisador();
        pesquisador.setId(Long.valueOf(15));
        pesquisador.setNome("spring");
        PesquisadorDAO pesquisadorDAO = new PesquisadorDAO();
        pesquisadorDAO.salvar(pesquisador);
        System.out.println("Fim");
    }

}
