import java.io.FileWriter;
import java.io.IOException;

public class Main7 {

    public static void main(String[] args) throws IOException {
        try {
            FileWriter fs = new FileWriter("E:/Academy/Exercise/Exercise06/cok.txt");
            fs.write(67);
            fs.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
