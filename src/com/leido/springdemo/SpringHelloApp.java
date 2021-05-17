package com.leido.springdemo;

import com.leido.springdemo.Coaches.Coach;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {

    public static void main(String[] args) {

        //Load XML config
        ClassPathXmlApplicationContext pathXmlApplicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //Retrieve bean from spring container
        Coach theCoach = pathXmlApplicationContext.getBean("myCoach", Coach.class);
        Coach cricket = pathXmlApplicationContext.getBean("myCricketCoach", Coach.class);

        //Call method on bean
        System.out.println(theCoach.getExercise());
        System.out.println(theCoach.getDailyFortune());
        System.out.println(cricket.getExercise());
        System.out.println(cricket.getDailyFortune());
        System.out.println(cricket);

        //close context
        pathXmlApplicationContext.close();
    }
}
