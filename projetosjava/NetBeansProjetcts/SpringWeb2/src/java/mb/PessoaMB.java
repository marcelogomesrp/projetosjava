/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package mb;

import modelo.Pessoa;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
//import net.java.dev.springannotation.annotation.Bean;
//import net.java.dev.springannotation.annotation.ManagedBean;
//import net.java.dev.springannotation.annotation.Out;
//import net.java.dev.springannotation.annotation.Scope;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author marcelo
 */
//@ManagedBean
//@Bean(name = "pessoaMB", scope = Scope.REQUEST)
@Controller("pessoaMB")
@Scope("request")
@Repository
@Transactional
public class PessoaMB {
    @PersistenceContext
    private EntityManager entityManager;

    private Pessoa pessoa;

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    
    public String doGravar(){
        this.pessoa = new Pessoa();
        this.pessoa.setNome("teste spring");
        this.pessoa.setFone("5555");
//        this.em.persist(pessoa);
        this.entityManager.flush();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pessoa salva com sucesso"));
        return "sucesso";
    }

    

    public PessoaMB() {
        this.pessoa = new Pessoa();
        this.pessoa.setNome("marcelo ok");
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public String doSalvar() {
        this.pessoa = new Pessoa();
        this.pessoa.setNome("marcelo ok");
        this.pessoa.setFone("555");
        this.pessoa.setId(500L);
        getEntityManager().clear();
        getEntityManager().persist(this.pessoa);
        getEntityManager().flush();
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Pessoa salva com muito sucesso"));
        return "ok";
        }



}
