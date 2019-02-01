package com.internship.dao;

import com.internship.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class DAOUtil {

    private static Session session;

    public static void save(Object entity){
        /*SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = null;
        Transaction transaction = null;
        try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.persist(entity);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
        } finally {
            session.close();
        }*/
        session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        session.save(entity);

        session.getTransaction().commit();

        session.close();
    }

    public static void checkResults(){
        session = HibernateUtil.getSessionFactory().openSession();

        session.getTransaction().begin();

        List organisms = session.createQuery("select bd from Organism bd").list();

        session.getTransaction().commit();

        session.close();

        for (int i = 0; i < organisms.size(); i++) {
            System.out.println(organisms.get(i));
        }
    }
}
