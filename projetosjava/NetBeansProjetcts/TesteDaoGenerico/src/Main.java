
import br.com.marcelo.dao.PesquisadorDao;
import br.com.marcelo.dao.imp.PesquisadorDaoImp;
import br.com.marcelo.entities.Pesquisador;

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
        pesquisador.setId(Long.valueOf(16));
        pesquisador.setFone("8888");
        PesquisadorDao pesquisadorDao = new PesquisadorDaoImp();
        pesquisadorDao.salvar(pesquisador);
        System.out.println("Pesquisador salvo com sucesso");

//        PesquisadorDao pesquisadorDao = new PesquisadorDaoImp();
//        for(Pesquisador pesquisador:pesquisadorDao.findAll()){
//            System.out.println("Pesquisador: " + pesquisador.getNome());
//        }

    }

}
