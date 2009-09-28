/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package commons.dao;

/**
 *
 * @author marcelo
 */
public class DataAccessException  extends Throwable {

	private static final long serialVersionUID = 1L;

	public DataAccessException() {

		super();
	}

	public DataAccessException(String message) {

		super(message);
	}

	public DataAccessException(String message, Throwable cause) {

		super(message, cause);
	}

	public DataAccessException(Throwable e) {

		super(e);
	}

	@SuppressWarnings("unchecked")
	public DataAccessException(Exception e, Class entidade, String metodo) {

		super("Ocorreu um erro não tratado na camada de dados. Detalhes: ".concat(getDetalhes(entidade, metodo)), e);
	}

	@SuppressWarnings("unchecked")
	private static String getDetalhes(Class entidade, String metodo) {

		StringBuilder detalhes = new StringBuilder();

		detalhes.append("Entidade: '".concat(entidade.getName()).concat("'\n "));
		detalhes.append("Metodo: '".concat(metodo).concat("'\n "));

		return detalhes.toString();
	}
}