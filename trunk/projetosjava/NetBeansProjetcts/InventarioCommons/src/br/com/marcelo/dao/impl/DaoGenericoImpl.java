/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.marcelo.dao.impl;

import br.com.marcelo.util.ConnectionFactory;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author marcelo
 */
public class DaoGenericoImpl<T, ID extends Serializable> implements br.com.marcelo.dao.DaoGenerico<T, ID> {

    private EntityManager entityManager = null;
    private final Class<T> oClass;

    public DaoGenericoImpl() {
        this.oClass = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.setEntityManager(Persistence.createEntityManagerFactory("IventarioCommonsPU").createEntityManager());
    }

    public EntityManager getEntityManager() {
        if (entityManager == null) {
            ConnectionFactory connectionFactory = new ConnectionFactory();
            this.entityManager = connectionFactory.getEntityManager();
        }
        return entityManager;
    }

    private void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public T salvar(T object) throws Exception {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().persist(object);
            getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro Dao g " + e.getMessage() + "\n+++++ " + e.getCause());
            getEntityManager().getTransaction().rollback();
            //throw new IllegalStateException("Erro");
            throw new Exception("Erro ao inserir o registro");
        }
        return object;


    }

    public List<T> findAll() {
        String queryS = "SELECT obj FROM " + oClass.getSimpleName() + " obj";
        Query query = getEntityManager().createQuery(queryS);
        return query.getResultList();
    }

    public void remover(T object) throws Exception {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().remove(object);
            getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            getEntityManager().getTransaction().rollback();
            //throw new IllegalStateException("Erro");
            throw new Exception("Erro ao remover o registro");
        }

    }

    public T findById(ID id) throws Exception {
        return (T) getEntityManager().find(oClass, id);
//        T object = null;
//        getEntityManager().getTransaction().begin();
//        object = (T) getEntityManager().find(oClass, id);
//        getEntityManager().getTransaction().commit();
//        return object;
    }

    public T atualizar(T object) throws Exception {
        getEntityManager().getTransaction().begin();
        try {
            getEntityManager().merge(object);
            getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            System.out.println("Erro Dao g " + e.getMessage() + "\n+++++ " + e.getCause());
            getEntityManager().getTransaction().rollback();
            throw new Exception("Erro ao Atuazliar o registro");
        }
        return object;
    }
}
