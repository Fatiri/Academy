package com.enigma;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import com.enigma.model.Subject;
import org.hibernate.Session;
import sun.security.ssl.HandshakeInStream;

import java.util.List;

public class SubjectService {

    public void create(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
//        Subject subject = new Subject(17,"Perikanan",2);
        session.beginTransaction();
        session.getTransaction();
//        session.save(subject);
        session.getTransaction().commit();
    }

    public void getSubject(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Subject subject = session.get(Subject.class,12);
        session.getTransaction().commit();
        System.out.println(subject);

    }
    public  void getSubjects(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        List<Subject> subjects = session
                .createQuery("from com.enigma.model.Subject")
                .getResultList();

        for (Subject subject: subjects) {
            System.out.println(subject.toString());
        }

    }
    public void updateStudent(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
//        Subject subject = new Subject(2,"Ekonomi",2);
        session.beginTransaction();
//        session.update(subject);
        session.getTransaction().commit();
    }

    public void deleteSubject(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        Subject subject = new Subject();
        session.beginTransaction();
        session.delete(subject);
        session.getTransaction().commit();


    }
}
