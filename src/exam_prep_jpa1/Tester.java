package exam_prep_jpa1;

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
        emf = Persistence.createEntityManagerFactory("JPA1PU");
        Facade f = new Facade(emf);
        EntityManager em = f.getEntityManager();
        
        try {
            em.getTransaction().begin();
            em.persist(f.createUser("TestUserName", "TestUserEmail"));
            em.persist(f.createProject("TestProjectName", "TestProjectDesc"));
            em.persist(f.createTask("TestTaskName", "TestTaskDesc", 123));
            em.getTransaction().commit();
        } finally {
            em.close();
        }
    }
}
