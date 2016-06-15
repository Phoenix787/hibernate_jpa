import entity.Detail;
import entity.Machine;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by Ксения on 14.06.2016.
 */
public class AppHibernateJpa_cache1 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("jpa_demo");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        Machine m1 = entityManager.find(Machine.class, 1);
        Machine m2 = entityManager.find(Machine.class, 1);
        System.out.println(m1 == m2);

        Detail d1 = entityManager.find(Detail.class, 1);
        Detail d2 = entityManager.find(Detail.class, 1);
        System.out.println(d1 == d2);

        entityManager.close();
        entityManagerFactory.close();



    }
}
