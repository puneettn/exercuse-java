package com.MySpring.MySpring.ques4;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {

    public static void main(String[] args){
        AnnotationConfigApplicationContext app =
                new AnnotationConfigApplicationContext(Main.class);
        CarType obj =  app.getBean(CarType.class);
        obj.print();

    }

}
