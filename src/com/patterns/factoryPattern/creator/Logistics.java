package com.patterns.factoryPattern.creator;

import com.patterns.factoryPattern.prodcut.Transport;

public abstract class Logistics {
    public abstract Transport createTransport();

    public void planDelivery(){
        Transport transport = createTransport();
        transport.wayOfTransport();
    }
}
