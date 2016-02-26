package exam_prep_jpa1;

import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

/**
 *
 * @author ChristopherBorum
 */
public class Facade {

    EntityManagerFactory emf;

    public Facade(EntityManagerFactory emf) {
        this.emf = emf;
    }

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public ProjectUser createUser(String userName, String email) {
        ProjectUser pu = new ProjectUser();
        pu.setUserName(userName);
        pu.setEmail(email);
        pu.setCreated(new Date());
        return pu;
    }

    public Project createProject(String projectName, String description) {
        Project p = new Project();
        p.setName(projectName);
        p.setDescription(description);
        p.setCreated(new Date());
        return p;
    }

    public Task createTask(String name, String description, int hoursAssigned) {
        Task t = new Task();
        t.setName(name);
        t.setDescription(description);
        t.setHoursAssinged(hoursAssigned);
        t.setHoursUsed(0);
        return t;
    }

    public ProjectUser findUser(String userName) {
        Project p = new Project();
        for (ProjectUser pu : p.getProjectUsers()) {
            if (pu.getUserName().equals(userName)) {
                return pu;
            }
        }
        return null;
    }

}
