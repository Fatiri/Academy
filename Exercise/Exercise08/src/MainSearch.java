import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;

public class MainSearch {
    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(" Input untuk mencari = ");
        String searchStudents = bufferedReader.readLine();

        List<Student> students = StudentService.searchStudent(searchStudents);
        System.out.println(students.toString());
              {

        }

        }
    }




