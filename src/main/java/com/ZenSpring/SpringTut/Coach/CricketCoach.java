package com.ZenSpring.SpringTut.Coach;

public class CricketCoach implements Coach {

    public CricketCoach(){
        System.out.println("Created class: " + getClass().getSimpleName() );
    }
    @Override
    public String dailyWorkout() {
        return "Practice fast Bowling and fielding. and try to beat India especially Virat Kholi.";
    }
}
