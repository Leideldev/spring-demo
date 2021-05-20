package com.leido.springdemo.Fortune;

public class NeutralFortuneService implements FortuneService{

    private final String[] fortunes = {"Something here","Something else in 2nd fortune","algo xddxdx"};

    @Override
    public String getFortune() {
        int random = (int) (Math.random() * 3);
        return fortunes[random];
    }
}
