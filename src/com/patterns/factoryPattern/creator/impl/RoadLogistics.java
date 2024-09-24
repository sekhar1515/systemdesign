package com.patterns.factoryPattern.creator.impl;

import com.patterns.factoryPattern.creator.Logistics;
import com.patterns.factoryPattern.prodcut.Transport;
import com.patterns.factoryPattern.prodcut.impl.RoadTransport;

public class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new RoadTransport();
    }
}
