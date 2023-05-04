package com.homeproject.hw_lesson_5;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Participant participant = new Participant();

        
        participant.setName(new String[]{"Ivan"});
        //participant.setPoints(120);

        System.out.println(participant);


        participant.load("file.csv");

       System.out.println(Arrays.toString(participant.getName()));
        System.out.println(Arrays.toString(participant.getPoints()));

        participant.save("file.csv");


    }
}
