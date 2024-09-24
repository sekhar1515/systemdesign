package com.patterns.factoryPattern.creator.impl;

import com.patterns.factoryPattern.creator.Logistics;
import com.patterns.factoryPattern.prodcut.Transport;
import com.patterns.factoryPattern.prodcut.impl.SeaTransport;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new SeaTransport();
    }
}
