package com.homeproject.hw_lesson_2;

import java.io.FileNotFoundException;

public class Main {
    public static void main (String[] args) {

        String[][] strArray = new String[4][3];
        strArray[0][0] = "1";
        strArray[0][1] = "2";
        strArray[0][2] = "3";
        strArray[0][3] = "4";
        strArray[1][0] = "5";
        strArray[1][1] = "6";
        strArray[1][2] = "7";
        strArray[1][3] = "8";
        strArray[2][0] = "9";
        strArray[2][1] = "10";
        strArray[2][2] = "11";
        strArray[2][3] = "12";


        CountMe countMe = new CountMe();

        try {
            countMe.arraySize(strArray);
        }
        catch (MyArraySizeException e) {
            e.printStackTrace();
        }

        try {
            countMe.arraySymbol(strArray);
        }
        catch (MyArrayDataException e) {
            e.printStackTrace();
        }

    }
}
