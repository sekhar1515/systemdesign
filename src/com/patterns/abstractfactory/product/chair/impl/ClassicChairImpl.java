package com.patterns.abstractfactory.product.chair.impl;

import com.patterns.abstractfactory.product.chair.Chair;

public class ClassicChairImpl implements Chair {
    @Override
    public void sitOn() {
        System.out.println(" You are sitting on Classic Chair ");
    }

    @Override
    public void hasManyLegs() {
        System.out.println("Classic chair has 2 legs ");
    }
}
