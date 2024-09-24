package com.patterns.abstractfactory.product.chair.impl;

import com.patterns.abstractfactory.product.chair.Chair;

public class ModernChairImpl implements Chair {
    @Override
    public void sitOn() {
        System.out.println("You are sitting on ModernChair ");
    }

    @Override
    public void hasManyLegs() {
        System.out.println("Modern chair has single leg ");
    }
}
