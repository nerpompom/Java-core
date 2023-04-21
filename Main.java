package com.homeproject.hm_lesson_1;

public class Main {

    public static void main(String[] args){
        
        Team[] participantArray = new Team[4];

        participantArray[0] = new Team ("Star", "Ivan", 20, 0.5);
        participantArray[1] = new Team("Star", "Irina",18,0.6);
        participantArray[2] = new Team("Star", "Oleg", 25, 0.9);
        participantArray[3] = new Team("Star", "Olga", 31, 0.7);

        participantArray[0].teamInfo();
        participantArray[1].teamInfo();
        participantArray[2].teamInfo();
        participantArray[3].teamInfo();

        Course course = new Course(0.4, 0.5, 0.6, 0.7, 0.8);

        System.out.println(course.doIt(participantArray[0]));
        System.out.println(course.doIt(participantArray[1]));
        System.out.println(course.doIt(participantArray[2]));
        System.out.println(course.doIt(participantArray[3]));

        participantArray[0].winInfo(course);
        participantArray[1].winInfo(course);
        participantArray[2].winInfo(course);
        participantArray[3].winInfo(course);



    }
}
