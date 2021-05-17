package com.leido.springdemo.Coaches;

import com.leido.springdemo.Fortune.FortuneService;

public class TrackCoach implements Coach{

    private final FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getExercise() {
        return "Just a five minute run";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

}
