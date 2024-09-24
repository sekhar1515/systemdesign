package com.patterns.factoryPattern.prodcut.impl;

import com.patterns.factoryPattern.prodcut.Transport;

public class SeaTransport implements Transport {
    @Override
    public void wayOfTransport() {
        System.out.println(" Sea Transport ");
    }
}
