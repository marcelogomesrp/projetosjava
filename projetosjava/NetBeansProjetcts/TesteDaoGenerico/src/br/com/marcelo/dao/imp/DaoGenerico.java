/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.dao.imp;

import br.com.marcelo.dao.util.ConnectionFactory;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;



/**
 *
 * @author marcelo
 */
@Transactional(readOnly=true, propagation=Propagation.REQUIRED)
public class DaoGenerico <T, ID extends Serializable> implements br.com.marcelo.dao.DaoGenerico<T,ID>{

    private EntityManager entityManager;
    private final Class<T> oClass;
    private ConnectionFactory connectionFactory;
    
    
    @SuppressWarnings("unchecked")
    
    public void setEntityManager(EntityManager em){
        this.entityManager = em;
    }

    protected EntityManager getEntityManager(){
        if(entityManager == null){
           this.entityManager =  this.connectionFactory.getEntityManager();
        }
        return entityManager;
    }

    @Override    
    public T salvar(T object) {
        //ConnectionFactory connectionFactory = new ConnectionFactory();
        //EntityManager entityManager = connectionFactory.getEntityManager();
        this.getEntityManager().getTransaction().begin();
        this.getEntityManager().persist(object);
        this.getEntityManager().getTransaction().commit();
        return object;




//        ConnectionFactory connectionFactory = new ConnectionFactory();
//        EntityManager entityManager = connectionFactory.getEntityManager();
//        entityManager.getTransaction().begin();
//        entityManager.persist(object);
//        entityManager.getTransaction().commit();
//        return object;

//        getEntityManager().getTransaction().begin();
//        try{
//            getEntityManager().persist(object);
//            getEntityManager().getTransaction().commit();
//        }catch(Exception e){
//            getEntityManager().getTransaction().rollback();
//            throw new IllegalStateException("Erro");
//        }
//        return object;
    }

    @Override
    public List<T> findAll(){
        return getEntityManager().createNamedQuery("Pesquisador.findAll").getResultList();
    }

    public DaoGenerico() {
        this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
         this.setEntityManager(Persistence.createEntityManagerFactory("TesteDaoGenericoPU").createEntityManager());
    }

    /**
     * @return the oClass
     */
    public Class<T> getoClass() {
        return oClass;
    }

    public void remover(T object) {
        getEntityManager().getTransaction().begin();
        try{
            getEntityManager().remove(object);
            getEntityManager().getTransaction().commit();
        }catch(Exception e){
            getEntityManager().getTransaction().rollback();
            throw new IllegalStateException("Erro");
        }
    }

    /**
     * @return the connectionFactory
     */
    public ConnectionFactory getConnectionFactory() {
        if(connectionFactory == null){
            this.connectionFactory = new ConnectionFactory();
        }
        return connectionFactory;
    }

    /**
     * @param connectionFactory the connectionFactory to set
     */
    public void setConnectionFactory(ConnectionFactory connectionFactory) {
        this.connectionFactory = connectionFactory;
    }



}
