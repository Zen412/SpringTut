package com.ZenSpring.SpringTut.Coach;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
public class TennisCoach implements Coach{

    public TennisCoach(){
        System.out.println("Created class: " + getClass().getSimpleName() );
    }
    @Override
    public String dailyWorkout() {
        return "Do some Endurance training.";
    }
}
