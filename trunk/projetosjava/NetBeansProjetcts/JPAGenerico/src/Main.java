
import br.com.marcelo.dao.PesquisadorDao;
import br.com.marcelo.dao.imp.PesquisadorDaoImp;
import br.com.marcelo.entities.Pesquisador;
import java.util.logging.Level;
import java.util.logging.Logger;

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
        try {
            PesquisadorDao pesquisadorDao = new PesquisadorDaoImp();
            Pesquisador pesquisador = new Pesquisador();
            pesquisador.setId(Long.valueOf(33));
            pesquisador.setNome("agora sim ok!!");
            Pesquisador salvar = pesquisadorDao.salvar(pesquisador);
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
