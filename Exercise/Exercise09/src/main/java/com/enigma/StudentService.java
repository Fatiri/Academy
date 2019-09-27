package com.enigma;

import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import org.hibernate.Session;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentService {

    public void create() throws ParseException {
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
        Date date = dateFormat.parse("1992-19-10");
//        Student student = new Student(1,"joko","Bogor",date,"L");
//        session.save(student);
        session.getTransaction().commit();

         }

      public void getStudent(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
          Student student = session.get(Student.class,1);
        session.getTransaction().commit();
         System.out.println(student.toString());

      }
      public  void getStudents(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
                  List<Student> students = session
                .createQuery("from com.enigma.model.Student")
                .getResultList();

        for (Student student: students) {
            System.out.println(student.toString());
        }
      }
      public void updateStudent() throws ParseException {
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
          session.beginTransaction();
          SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-dd-MM");
          Date date = dateFormat.parse("1992-19-10");
          Student student = session.get(Student.class,1);

             session.update(student);
             session.getTransaction().commit();
      }

    public void deleteStudent(){
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Student student = session.get(Student.class,1);
        session.delete(student);
        session.getTransaction().commit();


    }


}
