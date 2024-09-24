package com.patterns.abstractfactory.Creator.impl;

import com.patterns.abstractfactory.Creator.FurnitureFactory;
import com.patterns.abstractfactory.product.chair.Chair;
import com.patterns.abstractfactory.product.chair.impl.ClassicChairImpl;
import com.patterns.abstractfactory.product.table.Table;
import com.patterns.abstractfactory.product.table.impl.ClassicTableImpl;

public class ClassicFactoryImpl implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ClassicChairImpl();
    }

    @Override
    public Table getTable() {
        return new ClassicTableImpl();
    }
}
