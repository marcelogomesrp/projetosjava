/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package aaaaaa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *  @author marcelo
 */
// <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
// #[regen=yes,id=DCE.ED094077-7F52-55F0-C632-73FA6FBE1970]
// </editor-fold> 
public class Main {

    /**
     *  @param args the command line arguments
     */
    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.8D796180-89D2-039D-79BE-8D2362E123A2]
    // </editor-fold> 
    public static void main (String[] args) {
       Pesquisador pesquisador = new Pesquisador();
       pesquisador.setId(Long.valueOf(1000));
       pesquisador.setNome("teste");
       Main.persist(pesquisador);

    }

    // <editor-fold defaultstate="collapsed" desc=" UML Marker "> 
    // #[regen=yes,id=DCE.47597BEE-E3F1-FE55-7103-CE598FFCDE5F]
    // </editor-fold> 
    public static void persist (Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("aaaaaaPU");
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
