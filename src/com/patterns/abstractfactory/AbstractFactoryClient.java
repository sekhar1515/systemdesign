package com.patterns.abstractfactory;

import com.patterns.abstractfactory.Creator.FurnitureFactory;
import com.patterns.abstractfactory.Creator.impl.ClassicFactoryImpl;
import com.patterns.abstractfactory.Creator.impl.ModernFactoryImpl;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        FurnitureFactory modernFurnitureFactory = createFurniture("modern");
        modernFurnitureFactory.getChair().sitOn();
        modernFurnitureFactory.getTable().purposeOfTable();
    }

    private static FurnitureFactory createFurniture(String type) {
        if (type.contains("modern")) {
            return new ModernFactoryImpl();
        } else if (type.contains("classic")) {
            return new ClassicFactoryImpl();
        } else {
            return new ClassicFactoryImpl();
        }
    }
}
