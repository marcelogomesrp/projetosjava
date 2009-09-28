/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import entidade.Pessoa;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author marcelo
 */
//@Service("pessoaDao")
@Transactional(readOnly = true, propagation = Propagation.REQUIRED)
public class PessoaDao implements IPessoaDao, Serializable  {

@PersistenceContext
private EntityManager entityManager;

    
    private String nome;

    public String getNome() {
        this.nome = "Okkkkkkkkkkkkkkkkkkkk";
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void gravar(Pessoa pessoa){
        this.entityManager.clear();
        this.entityManager.persist(pessoa);
        //this.entityManager.getTransaction().begin();
       // this.entityManager.persist(pessoa);
        //this.entityManager.getTransaction().commit();
    }

    public EntityManager getEntityManager() {
        return entityManager;
    }

    @SuppressWarnings("unchecked")
    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void persist(Object object) {
        try {
           // entityManager.getTransaction().begin();
            entityManager.persist(object);
            //entityManager.getTransaction().commit();
        } catch (Exception e) {
            Logger.getLogger(getClass().getName()).log(Level.SEVERE, "exception caught", e);
            entityManager.getTransaction().rollback();
        } finally {
            entityManager.close();
        }
    }





    
    

}
