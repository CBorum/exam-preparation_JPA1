package exam_prep_jpa2;

import exam_prep_jpa1.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


/**
 *
 * @author ChristopherBorum
 */
public class Tester {
    public static void main(String[] args) {
        EntityManagerFactory emf;
        emf = Persistence.createEntityManagerFactory("SA1PU");
        EntityManager em = emf.createEntityManager();
        
        try {
            em.getTransaction().begin();

            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
