package com.enigm.util;

public class StringUtil {

    public static String getLeftPadZero(int number, int padding){
       return String.format("%"+padding+"d",number).replaceAll(" ","0");
    }



}
