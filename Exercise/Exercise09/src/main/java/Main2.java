import com.enigma.config.HibernateConfigs;
import com.enigma.model.Student;
import com.enigma.model.StudentSubject;
import com.enigma.model.Subject;
import org.hibernate.Session;

import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        Session session = HibernateConfigs.getSessionFactory().getCurrentSession();
        session.beginTransaction();

        Student student = session.get(Student.class, 3);
        Subject student1 = session.get(Subject.class, 2);

        List<StudentSubject> studentSubjects =student.getStudentSubjects();

        for (StudentSubject studentSub: studentSubjects) {

            System.out.println(studentSub.toString());

            System.out.println("-----------------------------------------------------------");
            List<StudentSubject> studentSubjectss =student1.getStudentSubjects();

            for (StudentSubject studentsub1: studentSubjectss) {
                System.out.println(studentsub1.toString());
                break;
            }

        }




    }
}
