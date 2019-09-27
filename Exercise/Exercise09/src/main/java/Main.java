import com.enigma.StudentService;
import com.enigma.SubjectService;
import com.enigma.config.HibernateConfigs;
import com.enigma.model.Room;
import com.enigma.model.Student;
import com.enigma.model.StudentSubject;
import com.enigma.model.Subject;
import jdk.internal.org.objectweb.asm.Handle;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.text.ParseException;
import java.util.Date;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();

//        Student student = session.get(Student.class, 2);
//        List<StudentSubject> studentSubjects = student.getStudentSubjects();
//        session.getTransaction().commit();
//
//        for (StudentSubject studentSubject: studentSubjects) {
//            System.out.println(studentSubjects.toString());
//
//        }

//
//        }
//        for (int i = 0; i < studentss.size(); i++) {
//            Subject studentSub = new Subject();
//            studentSub.getSubjectName();
//            session.getTransaction().commit();
//
//            System.out.println(studentss.toString());



       Student student = new Student();
       student.setId(15);
       student.setName("Jaka");
       student.setBirthPlace("Bogor");
       student.setBirthDate(new Date());
       student.getGender();
       session.save(student);
       Subject subject = new Subject();
       subject.setId(15);
       subject.setSubjectName("IPS");
       subject.setSks(3);
       session.save(subject);

       StudentSubject studentSubjects = new StudentSubject();
       studentSubjects.setId(1);
       studentSubjects.setStudents(student);
       studentSubjects.setSubjects(subject);

       System.out.println(studentSubjects.toString());
        session.getTransaction().commit();

        }


//
//        session.beginTransaction();
//        StudentSubject classYangDiDapat = session.get(StudentSubject.class,1);
//
//        List<StudentSubject> students = (List<StudentSubject>) classYangDiDapat.getStudent();
//        for (StudentSubject student: students) {
//            System.out.println(student.toString());
//        }
//
//        System.out.println(classYangDiDapat.toString());

//        Student studentYangDiDapat = session.get(Student.class,2);
//
//
//        studentYangDiDapat.setName("Another Mamang");
//        studentYangDiDapat.setClassRoomId(classYangDiDapat);
//        session.save(studentYangDiDapat);


        //Test untuk Main
//        StudentService studentService = new StudentService();
//        studentService.create();
//        studentService.deleteStudent();
//        studentService.getStudent();
//        studentService.getStudents();
//        studentService.updateStudent();

//        SubjectService subjectService = new SubjectService();
//        subjectService.create();
//        subjectService.deleteSubject();
//        subjectService.getSubject();
//        subjectService.getSubjects();
//        subjectService.updateStudent();


//        SessionFactory sessionFactory = HibernateConfigs.getSessionFactory();
//        Session session = sessionFactory.getCurrentSession();
//
//        session.beginTransaction();
////        List<Student> students = session
////                .createQuery("from com.enigma.model.Student")
////                .getResultList();
////
////        for (Student student: students) {
////            System.out.println(student.toString());
////        }
//        Student student = session.get(Student.class,1);
//        session.getTransaction().commit();
//        System.out.println(student.toString());


}


