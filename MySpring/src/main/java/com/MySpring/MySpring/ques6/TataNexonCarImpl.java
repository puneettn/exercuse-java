package com.MySpring.MySpring.ques6;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TataNexonCarImpl implements Car {

    @Override
    public void carName() {
        System.out.println("Tataa Nexonn Carr");
    }
}
