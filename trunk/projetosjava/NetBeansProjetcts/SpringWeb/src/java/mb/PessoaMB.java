/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;


import dao.IPessoaDao;
import entidade.Pessoa;
import java.io.Serializable;
import javax.annotation.Resource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
/**
 *
 * @author marcelo
 *
 * @Component("pessoaMB")
@Scope("session")
 *
 */

@Controller("PessoaMB")
@Scope("session")
public class PessoaMB implements Serializable{
    private static final long serialVersionUID = 1L;

    private String nome;
    @Resource
    private IPessoaDao pessoaDao;

    public String getNome() {
//        this.pessoaDao = new PessoaDao();
        this.nome = pessoaDao.getNome();
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public PessoaMB() {
    }

    public PessoaMB(String nome) {
        this.nome = nome;
    }

    public String doGravar(){
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Marcelo Spring");
        pessoa.setFone("algum");
        //pessoa.setId(1);
        //this.pessoaDao.gravar(pessoa);
        System.out.println("Gravado");
        this.pessoaDao.persist(pessoa);
        return "sucesso";
    }

}
