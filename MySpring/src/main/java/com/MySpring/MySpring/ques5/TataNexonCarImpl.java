package com.MySpring.MySpring.ques5;

import org.springframework.stereotype.Component;

@Component
public class TataNexonCarImpl implements Car {

    @Override
    public void carName() {
        System.out.println("Tataa Nexonn Carr");
    }
}
