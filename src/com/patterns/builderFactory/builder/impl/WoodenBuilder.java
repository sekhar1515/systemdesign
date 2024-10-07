package com.patterns.builderFactory.builder.impl;

import com.patterns.builderFactory.builder.Builder;
import com.patterns.builderFactory.product.House;

public class WoodenBuilder implements Builder {
    private House house;

    public WoodenBuilder() {
        this.house = new House();
    }

    @Override
    public void typeOfWalls() {
        house.setTypeOfWalls("WoodenWalls for the house");
    }

    @Override
    public void typeOfGarage() {
        house.setTypeOfGarage("having a Garage for 4 Car parking ");
    }

    @Override
    public void hasSwimminPool() {
        house.setHasSwimminPool(false);
    }

    @Override
    public void typeOfGarden() {
        house.setTypeOfGarden("Garden full of coconut trees");
    }

    @Override
    public void ceiling() {
        house.setCeiling("Wooden ceiling with wooden flooring");
    }

    @Override
    public void hasBalconyView() {
        house.setHasBalconyView(false);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
