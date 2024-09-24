package com.patterns.factoryPattern;

import com.patterns.factoryPattern.creator.Logistics;
import com.patterns.factoryPattern.creator.impl.RoadLogistics;
import com.patterns.factoryPattern.creator.impl.SeaLogistics;

public class FactoryClient {
    public static void main(String[] args) {
        Logistics logistics = new RoadLogistics();
        logistics.createTransport().wayOfTransport();

        Logistics seaLogistics = new SeaLogistics();
        seaLogistics.createTransport().wayOfTransport();
    }
}
