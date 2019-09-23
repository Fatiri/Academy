import com.enigma.model.Student;
import com.enigma.service.StudentService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException, SQLException {
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Number of Students =");
        Integer jumlahStudent = Integer.parseInt(bufferReader.readLine());
        int a =1;
        for (int i = 0; i < jumlahStudent ; i++) {
                System.out.println("Student ="+ a++);
                System.out.print("ID = ");
                Integer id = Integer.parseInt(bufferReader.readLine());
                System.out.print("Name = ");
                String name = bufferReader.readLine();
                System.out.print("Birth Place = ");
                String birthPlace = bufferReader.readLine();
                System.out.print("Birth Date = ");
                String birthDate = bufferReader.readLine();
                System.out.print("Gender = ");
                String gender = bufferReader.readLine();
                Student insertStudent = new Student(id,name,birthPlace,birthDate,gender);
                StudentService.create(insertStudent);

        }

        System.out.print("Ingin Melihat Semua Data y/n= ");
        String nameall = bufferReader.readLine();

        if (nameall.equals("y")){
            List<Student> students = StudentService.getAll();

            for (Student studentss : students) {
                System.out.println(studentss.toString());
            }
        }else{
            System.out.println("Bababaiiiiiiiiiiiiiii");
        }


    }
}
