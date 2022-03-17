package com.simulator.calatimyrandom;

import java.util.Random;

public class CalatimyRandom {
    private double flag = 0;

    public double getFlag() {
        Random random = new Random();
        flag += random.nextDouble()*2.78 + 1.97;
        if(flag >= 100)
            flag = 0;
        return flag;
    }
}
