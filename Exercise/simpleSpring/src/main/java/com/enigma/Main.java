package com.enigma;

import com.enigma.dao.StudentDao;
import com.enigma.model.Student;
import com.enigma.service.StudentService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("aplicationContext.xml");
        Student joko = new Student(13,"joko","Bogor", new Date(),"M");
        Student fitri = new Student(14,"Fitri","Jakarta", new Date(),"M");
        Student jaka = new Student(15,"jaka","Jakarta", new Date(),"M");
        Student ilham = new Student(16,"ilham","Jakarta", new Date(),"F");

        StudentDao studentDao = (StudentDao) context.getBean("studentDao");

        studentDao.save(joko);
        studentDao.save(fitri);
        studentDao.save(jaka);
        studentDao.save(ilham);

        StudentService studentService = (StudentService) context.getBean("studentService");
        System.out.println(studentService.countMale());







//        Student joko = new Student(13,"joko","Bogor", new Date(),"M");
//        Student Fitri = new Student(14,"Fitri","Jakarta", new Date(),"F");
//        Student jaka = new Student(15,"jaka","Jakarta", new Date(),"F");
//        Student ilham = new Student(16,"ilham","Jakarta", new Date(),"F");
//
//        StudentDao studentDao = new StudentDao();
//        studentDao.save(joko);
//        studentDao.save(Fitri);
//        studentDao.save(jaka);
//        studentDao.save(ilham);
//
//        StudentService studentService = new StudentService();
//        System.out.println(studentService.countMale());
//

//        System.out.println(studentDao.get(14).getName());

    }

}
