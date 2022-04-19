package com.simulator.main;

import com.simulator.birth.IndividualBorn;
import com.simulator.thingsmanager.ThingManager;


import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        IndividualBorn Person = new IndividualBorn();
        ThingManager thingsmanager = new ThingManager();
        thingsmanager.NationalityStart(Person);
    }
}

