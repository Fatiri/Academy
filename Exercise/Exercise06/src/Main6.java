import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

            File fileku = new File("E:/Academy/Exercise/Exercise06/cok.txt");
            List<String> texts= new ArrayList<>();
            try {
                FileReader fr = new FileReader(fileku);
                BufferedReader br = new BufferedReader(fr);
                int i =0;

                while (true){
                    String txt = br.readLine();
                    texts.add(txt);
                    if(txt==null){
                        break;
                    }
                    i++;
                }
                for (String str: texts){
                    System.out.println(str);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

