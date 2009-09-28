/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package persistencia.jpa;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;
import java.util.Map;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import persistencia.DaoGenerico;





/**
 *
 * @author marcelo
 */
public class DaoGenericoJpa <T, ID extends Serializable> implements DaoGenerico<T, ID> {

	private EntityManager entityManager;

	private final Class<T> oClass;//object class


	public Class<T> getObjectClass() {
		return this.oClass;
	}

	public void setEntityManager(EntityManager em) {
		this.entityManager = em;
	}


	protected EntityManager getEntityManager() {
		if (entityManager == null)
			throw new IllegalStateException("Erro");
		return entityManager;
	}

	public DaoGenericoJpa() {
		this.oClass = (Class<T>)
		( (ParameterizedType) getClass().getGenericSuperclass() ).
		getActualTypeArguments()[0];
                this.setEntityManager(Persistence.createEntityManagerFactory("InctcCommons2PU").createEntityManager());
               // this.em = Persistence.createEntityManagerFactory("LibLgmb4PU").createEntityManager();

	}


	public T atualizar(T object) {
		//getEntityManager().merge(object);
		//return object;
        T objectAtualizar = getEntityManager().merge(object);
        getEntityManager().getTransaction().begin();
        getEntityManager().merge(objectAtualizar);
        getEntityManager().getTransaction().commit();
        return objectAtualizar;
	}


	public void excluir(T object) {
//		object = getEntityManager().merge(object);
//		getEntityManager().remove(object);
        T objectExcluir = getEntityManager().merge(object);
        getEntityManager().getTransaction().begin();
        getEntityManager().remove(objectExcluir);
        getEntityManager().getTransaction().commit();


	}


	public T pesquisarPorId(ID id) {
		return (T) getEntityManager().find(oClass, id);
	}

    public T salvar(T object) {

//        getEntityManager().getTransaction().begin();
//        getEntityManager().merge(object);
//        //getEntityManager().persist(object);
//        getEntityManager().getTransaction().commit();

       getEntityManager().getTransaction().begin();
        try {
            getEntityManager().persist(object);
            getEntityManager().getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            getEntityManager().getTransaction().rollback();
        } finally {
            //getEntityManager().close();
        }
        return object;

    }

	public List<T> todos(){
		String queryS = "SELECT obj FROM "+oClass.getSimpleName()+" obj";
		Query query = getEntityManager().createQuery(queryS);
		return query.getResultList();

	}

	public List<T> listPesqParam(String query, Map<String, Object> params){
		Query q = getEntityManager().createQuery(query);
		for(String chave : params.keySet()){
			q.setParameter(chave, params.get(chave));

		}
		return q.getResultList();
	}

	public List<T> listPesqParam(String query, Map<String, Object> params,
			int maximo, int atual){
		Query q = getEntityManager().
					createQuery(query).
					setMaxResults(maximo).
					setFirstResult(atual);

		for(String chave : params.keySet()){
			q.setParameter(chave, params.get(chave));

		}
		return q.getResultList();
	}

	public List<T> listPesq(String query){
		Query q = getEntityManager().createQuery(query);
		return q.getResultList();
	}

	public T pesqParam(String query, Map<String, Object> params){
		Query q = getEntityManager().createQuery(query);
		for(String chave : params.keySet()){
			q.setParameter(chave, params.get(chave));

		}
		try{
			return (T) q.getSingleResult();
		}catch(NoResultException nre){
			return null;
		}
	}





}

