package com.leido.springdemo.Coaches;

import com.leido.springdemo.Fortune.FortuneService;

public class CricketCoach implements Coach{

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;

    public CricketCoach() {
        System.out.println("Created coach cricket");
    }

    @Override
    public String getExercise() {
        return "Practice fast bowling for 15 min";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "fortuneService=" + fortuneService +
                ", emailAddress='" + emailAddress + '\'' +
                ", team='" + team + '\'' +
                '}';
    }
}
