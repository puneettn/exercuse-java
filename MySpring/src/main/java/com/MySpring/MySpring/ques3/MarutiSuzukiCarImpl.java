package com.MySpring.MySpring.ques3;

import org.springframework.stereotype.Component;

@Component
public class MarutiSuzukiCarImpl implements Car{

    @Override
    public void carName() {
        System.out.println("Maruti Car");
    }
}
