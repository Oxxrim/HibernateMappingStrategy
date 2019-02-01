package com.internship.util;

import com.internship.domain.*;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

    private static SessionFactory sessionFactory = configureSessionFactory();

    private static SessionFactory configureSessionFactory() throws HibernateException {

        Configuration configuration = new Configuration();

        configuration.addAnnotatedClass(Dog.class).addAnnotatedClass(Organism.class).addAnnotatedClass(Human.class).addAnnotatedClass(Developer.class).addAnnotatedClass(Plumber.class);

        return configuration.buildSessionFactory();
    }

    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
}
