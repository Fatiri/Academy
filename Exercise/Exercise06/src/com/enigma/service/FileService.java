package com.enigma.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileService {

    public void sendRead() {

        File myFile = new File("E:/Academy/Exercise/Exercise06/test.txt");

        try {
            FileReader filereader = new FileReader(myFile);

            while (true){
                int txt = filereader.read();
                if(txt==-1){
                    break;
                }

                System.out.print((char)txt);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public void getRata(){
        Set<People> arrayPerson = new HashSet<>();
        File myFile = new File("E:/Academy/Exercise/Exercise06/test.txt");



    }
}

