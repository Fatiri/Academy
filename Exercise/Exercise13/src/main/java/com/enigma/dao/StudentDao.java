package com.enigma.dao;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.springframework.stereotype.Service;


public class StudentDao {

    public static void create(Student student){

    }

    public static Integer getStudent(Integer id){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class,id);
        session.getTransaction().commit();
        session.close();
        return id;
    }
}
