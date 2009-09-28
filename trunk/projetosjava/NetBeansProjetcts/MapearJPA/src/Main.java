
import entidade.Contato;
import entidade.Pesso;
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
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pesso p = new Pesso();
        p.setNome("teste");
        p.setContato(new Contato("teste"));
       // p.setContato_id(1);
        //Main.persist(p);

        Pesso valor = Main.find();
        System.out.println("Nome: " + valor.getNome());
        System.out.println("Contato: " + valor.getContato().getNome());
    }

    public static Pesso find() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("MapearJPAPU");
        EntityManager em = emf.createEntityManager();
        Pesso t = null;
        em.getTransaction().begin();
        try {
            //em.persist(object);
            t = em.find(Pesso.class, 1);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
        } finally {
            em.close();
        }
        return t;
    }




}
