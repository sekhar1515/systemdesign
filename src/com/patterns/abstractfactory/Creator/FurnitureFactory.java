package com.patterns.abstractfactory.Creator;

import com.patterns.abstractfactory.product.chair.Chair;
import com.patterns.abstractfactory.product.table.Table;

public interface FurnitureFactory {
    Chair getChair();

    Table getTable();
}
