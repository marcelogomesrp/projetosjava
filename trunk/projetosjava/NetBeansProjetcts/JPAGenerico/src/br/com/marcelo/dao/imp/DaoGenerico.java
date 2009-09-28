/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.marcelo.dao.imp;


import br.com.marcelo.util.ConnectionFactory;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;






/**
 *
 * @author marcelo
 */
public class DaoGenerico <T, ID extends Serializable> implements br.com.marcelo.dao.DaoGenerico<T,ID>{
    private EntityManager entityManager = null;
    private final Class<T> oClass;


    public DaoGenerico() {
       this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
       //this.setEntityManager(Persistence.createEntityManagerFactory("JPAGenericoPU").createEntityManager());
    }

    public EntityManager getEntityManager() {
        if(entityManager == null){
           ConnectionFactory connectionFactory = new ConnectionFactory();
           this.entityManager =  connectionFactory.getEntityManager();
        }
    return entityManager;
    }

    private  void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T salvar(T object) throws Exception {
        getEntityManager().getTransaction().begin();
        try{
            getEntityManager().persist(object);
            getEntityManager().getTransaction().commit();
        }catch(Exception e){
            getEntityManager().getTransaction().rollback();
            //throw new IllegalStateException("Erro");
            throw new Exception("Erro ao inserir o registro");
        }
        return object;


    }

    public List<T> findAll() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public void remover(T object) throws Exception{
        getEntityManager().getTransaction().begin();
        try{
            getEntityManager().remove(object);
            getEntityManager().getTransaction().commit();
        }catch(Exception e){
            getEntityManager().getTransaction().rollback();
            //throw new IllegalStateException("Erro");
            throw new Exception("Erro ao remover o registro");
        }

    }


}
