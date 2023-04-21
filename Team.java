package com.homeproject.hm_lesson_1;

public class Team implements WinInfo {
    public String teamName;
    public String participantName;
    public int age;
    public double jumpHeight;

    public Team(String teamName, String participantName, int age, double jumpHeight) {
        this.teamName = teamName;
        this.participantName = participantName;
        this.age = age;
        this.jumpHeight = jumpHeight;
    }

    public void teamInfo() {
        System.out.println("Участник из команды " + teamName + " под именем " + participantName + ". Ему(ей) " + age + ". Он(а) может прыгнуть на высоту до " + jumpHeight + " м");
    }

    public boolean winInfo(Course course) {

        if (jumpHeight >= course.obstacleHeight_1 & jumpHeight >= course.obstacleHeight_2 & jumpHeight >= course.obstacleHeight_3 & jumpHeight >= course.obstacleHeight_4 & jumpHeight >= course.obstacleHeight_5) {
            System.out.println("Участник " + participantName + " из команды " + teamName + " Прошел(прошла) полосу препятствий!");
            return true;
        }
            else return  false;
    }


}
