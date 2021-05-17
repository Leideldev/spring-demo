package com.leido.springdemo.Fortune;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "You'll be happy";
    }
}
