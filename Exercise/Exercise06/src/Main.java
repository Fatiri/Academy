import com.enigma.service.PersonTranform;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws IOException {
        InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader bufferReader = new BufferedReader(inputStream);
        System.out.print("number of friends = ");
        String inputNumber = bufferReader.readLine();
        Integer lotsofData = Integer.parseInt(inputNumber);
        String[] arrayName = new String[lotsofData];
        String[] arrayAge = new String[lotsofData];
        String[] arrayGender = new String[lotsofData];

        int numOrder = 1;

        for (int amount=0; amount<lotsofData; amount++){
            System.out.println("Friend Data = "+numOrder++);
            System.out.print("Name = ");
            String name = bufferReader.readLine();
            System.out.print("Age = ");
            String age = bufferReader.readLine();
            System.out.print("Gender = ");
            String gender = bufferReader.readLine();

            arrayName[amount] = name;
            arrayAge[amount] = age;
            arrayGender[amount] = gender;

        }
         for (int showArray=0; showArray<lotsofData; showArray++) {
             File file = new File("E:/Academy/Exercise/Exercise06/test.txt");
             FileWriter fw = new FileWriter(file, true);
             fw.write(String.format("%1$-10s" , arrayName[showArray]) + String.format("%1$-1s", arrayAge[showArray]) + String.format("%1$-1s" ,arrayGender[showArray]) + "\n");
             fw.close();
         }

         }


    }



