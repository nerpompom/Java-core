package com.homeproject.hm_lesson_1;

public class Course {
    public double obstacleHeight_1;
    public double obstacleHeight_2;
    public double obstacleHeight_3;
    public double obstacleHeight_4;
    public double obstacleHeight_5;

    public Course(double obstacleHeight_1, double obstacleHeight_2, double obstacleHeight_3, double obstacleHeight_4, double obstacleHeight_5) {
        this.obstacleHeight_1 = obstacleHeight_1;
        this.obstacleHeight_2 = obstacleHeight_2;
        this.obstacleHeight_3 = obstacleHeight_3;
        this.obstacleHeight_4 = obstacleHeight_4;
        this.obstacleHeight_5 = obstacleHeight_5;
    }

    public boolean doIt(Team team) {
        return team.jumpHeight >= obstacleHeight_1 & team.jumpHeight >= obstacleHeight_2 & team.jumpHeight >= obstacleHeight_3 & team.jumpHeight >= obstacleHeight_4 & team.jumpHeight >= obstacleHeight_5;
    }

}
