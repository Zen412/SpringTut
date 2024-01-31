package com.ZenSpring.SpringTut.Coach;

import org.springframework.stereotype.Component;


public class RugbyCoach implements Coach{

    public RugbyCoach(){
        System.out.println("Created class: " + getClass().getSimpleName() );
    }

    @Override
    public String dailyWorkout() {
        return "Practice scrum line up for 4 hours.";
    }
}
