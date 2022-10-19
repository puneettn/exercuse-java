package com.MySpring.MySpring.ques6;


import org.springframework.stereotype.Component;

@Component
public class MarutiSuzukiCarImpl implements Car {
    @Override
    public void carName() {
        System.out.println("Marutiii Carrrrr");
    }
}
