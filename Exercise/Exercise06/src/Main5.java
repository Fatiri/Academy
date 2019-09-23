import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main5 {
    public static void main(String[] args) {
        File fileku = new File( "E:/Academy/Exercise/Exercise06/cok.txt");
        try{
            FileReader fr = new FileReader(fileku);
            boolean eof = false;
            while (!eof){
                int c = fr.read();
                if (c==-1){
                    eof = true;
                    break;
                }
                System.out.print(c==10?"+":(char)c);
            }

        }catch (FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

