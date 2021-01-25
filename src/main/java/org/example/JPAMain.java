package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class JPAMain {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAlabb");

        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User u = em.find(User.class, "530720-7675");
        u.setFirstName("Adam");
        System.out.println(u);
        em.getTransaction().commit();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        User uu = new User("880930-0472", "Philip", "Mattsson");
        em.persist(uu);
        System.out.println("philipid = " + uu.getID());
        List<User> list = em.createQuery("from User ", User.class).getResultList();
        System.out.println(list);
        em.getTransaction().commit();

        em = emf.createEntityManager();
		em.getTransaction().begin();
		list = em.createQuery("from User u where u.FirstName = :FirstName", User.class)
                .setParameter("FirstName", "Philip")
                .getResultList();
		for (User uuu : list) {
			em.remove(uuu);
		}
		em.getTransaction().commit();

        em.close();
        emf.close();
    }
}