package com.leido.springdemo.Coaches;

import com.leido.springdemo.Fortune.FortuneService;

public class BaseballCoach implements Coach{

    private final FortuneService fortuneService;

    public BaseballCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getExercise() {
        return "Super exercise by baseball coach";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
