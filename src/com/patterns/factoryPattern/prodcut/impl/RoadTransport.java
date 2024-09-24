package com.patterns.factoryPattern.prodcut.impl;

import com.patterns.factoryPattern.prodcut.Transport;

public class RoadTransport implements Transport {

    @Override
    public void wayOfTransport() {
        System.out.println("Road Transport ");
    }
}
