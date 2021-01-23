package org.example;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class UserDAOImpl implements UserDAO{

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("JPAlabb");

    @Override
    public void create(User u) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

    @Override
    public List<User> getByFirstName(String name) {
        List<User> list;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        list = em.createQuery("from User u where u.FirstName = :FirstName", User.class)
                .setParameter("FirstName", name).getResultList();
        em.getTransaction().commit();
        return list;
    }

    @Override
    public List<User> getByLastName(String name) {
        List<User> list;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        list = em.createQuery("from User u where u.LastName = :LastName", User.class)
                .setParameter("LastName", name).getResultList();
        em.getTransaction().commit();
        return list;
    }

    @Override
    public boolean update(String id, String FirstName){
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User u = em.find(User.class, id);
        if (u != null ) {
            u.setFirstName(FirstName);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }


    @Override
    public boolean remove(String id) {
        boolean success = false;
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        User u = em.find(User.class, id);
        if (u != null ) {
            em.remove(u);
            success = true;
        }
        em.getTransaction().commit();
        return success;
    }
}
