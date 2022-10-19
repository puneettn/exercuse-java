package com.MySpring.MySpring.ques5;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MarutiSuzukiCarImpl implements Car {
    @Override
    public void carName() {
        System.out.println("Marutiii Carrrrr");
    }
}
