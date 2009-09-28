/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaa;

import familia.Filho;
import familia.Pai;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import pp.Endereco;
import pp.Pessoa;

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aaaPU");
        EntityManager em = emf.createEntityManager();

        Pessoa pe = new Pessoa();
        pe.setNome("novo");

        em.getTransaction().begin();
        em.persist(pe);
        em.getTransaction().commit();

        Pessoa p = em.find(Pessoa.class, Long.valueOf(11));
        System.out.println("Nome: ".concat(p.getNome()));
        for(Endereco endereco:p.getEnderecos()){
            System.out.println("Endereco: ".concat(endereco.getNome()));
        }
        
        em.getTransaction().begin();
        p.setNome("nome trocado222");
        em.merge(p);
        em.getTransaction().commit();
        System.out.println("ok");
        em.close();




//        em.getTransaction().begin();
//        try {
//            Pessoa p = em.find(Pessoa.class, 4);
//            em.getTransaction().commit();
//        } catch (Exception e) {
//            e.printStackTrace();
//            em.getTransaction().rollback();
//        } finally {
//            em.close();
//        }


//        Pessoa pessoa = new Pessoa();
//        pessoa.setNome("nome3");
//        Endereco end = new Endereco();
//        end.setNome("novo end4");
//        Endereco end2 = new Endereco();
//        end2.setNome("mais um");
//        Collection<Endereco> enderecos = new ArrayList<Endereco>();
//        enderecos.add(end);
//        enderecos.add(end2);
//
//        pessoa.setEnderecos(enderecos);
//        //Main.persist(end);
//
//        Main.persist(pessoa);
//        Pai pai = new Pai();
//        pai.setId(Long.valueOf(1));
//        pai.setNome("pai");
//
//        Filho filho = new Filho();
//        filho.setId(Long.valueOf(2));
//        filho.setNome("filho 2");
//
//        List<Filho> filhos = new ArrayList<Filho>();
//        //filhos.add(filho);
//        pai.setFilhos(filhos);
//        //Main.persist(filho);
//        Main.persist(pai);

    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aaaPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
    }

}
