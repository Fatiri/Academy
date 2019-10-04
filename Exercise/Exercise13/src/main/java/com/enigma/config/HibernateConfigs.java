package com.enigma.config;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class HibernateConfigs {

private static SessionFactory sessionFactory;

public static SessionFactory buildSessionFactory(){
   try {
       Configuration configuration = new Configuration();
       configuration.configure("Hibernate.cfg.xml");
       sessionFactory = configuration.buildSessionFactory();

   } catch (HibernateException e) {
       System.err.println("Initial Session Factory creation failed");
       e.printStackTrace();
   }
   return sessionFactory;
}
public  static SessionFactory getSessionFactory(){
if (sessionFactory==null) sessionFactory =buildSessionFactory();
return sessionFactory;
}
}
