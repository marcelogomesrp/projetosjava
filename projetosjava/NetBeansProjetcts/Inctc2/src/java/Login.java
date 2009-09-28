
import negocio.modelo.Pesquisador;
import negocio.service.PesquisadorService;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */

public class Login {

    private Pesquisador pesquisador;
    private PesquisadorService pesquisadorService;

    /** Creates a new instance of Login */
    public Login() {
        this.pesquisador = new Pesquisador();
        this.pesquisadorService = new PesquisadorService();
    }

    /**
     * @return the pesquisador
     */
    public Pesquisador getPesquisador() {
        return pesquisador;
    }

    /**
     * @param pesquisador the pesquisador to set
     */
    public void setPesquisador(Pesquisador pesquisador) {
        this.pesquisador = pesquisador;
    }

    /**
     * @return the pesquisadorService
     */
    public PesquisadorService getPesquisadorService() {
        return pesquisadorService;
    }

    /**
     * @param pesquisadorService the pesquisadorService to set
     */
    public void setPesquisadorService(PesquisadorService pesquisadorService) {
        this.pesquisadorService = pesquisadorService;
    }




}
