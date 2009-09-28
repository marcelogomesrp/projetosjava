

import br.usp.fmrp.entidades.Participante;
import br.usp.fmrp.entidades.Paper;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author marcelo
 */
public class Main {

    /**
     * @param args the com mand line arguments
     */
    public static void main(String[] args) throws Exception {
        Participante participante = new Participante();
        participante.setName("teste");
        Paper paper = new Paper();
        paper.setFilename("teste");

        Main.persist(participante);


               
    }

    public static void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Xmeeting2009PU");
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
