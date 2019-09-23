import com.enigma.service.FileService;

import java.io.*;

public class Main2 {

    public static void main(String[] args) throws IOException {

        try {

           File file = new File("E:/Academy/Exercise/Exercise06/cok.txt");
           FileWriter fw = new FileWriter(file, true);

           fw.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
