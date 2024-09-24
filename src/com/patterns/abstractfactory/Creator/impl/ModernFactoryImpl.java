package com.patterns.abstractfactory.Creator.impl;

import com.patterns.abstractfactory.Creator.FurnitureFactory;
import com.patterns.abstractfactory.product.chair.Chair;
import com.patterns.abstractfactory.product.chair.impl.ModernChairImpl;
import com.patterns.abstractfactory.product.table.Table;
import com.patterns.abstractfactory.product.table.impl.ModernTableImpl;

public class ModernFactoryImpl implements FurnitureFactory {
    @Override
    public Chair getChair() {
        return new ModernChairImpl();
    }

    @Override
    public Table getTable() {
        return new ModernTableImpl();
    }
}
