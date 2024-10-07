package com.patterns.builderFactory.builder.impl;

import com.patterns.builderFactory.builder.Builder;
import com.patterns.builderFactory.product.House;

public class CastleBuilder implements Builder {

    private House house;

    public CastleBuilder() {
        this.house = new House();
    }

    @Override
    public void typeOfWalls() {
        house.setTypeOfWalls("Castle Walls ");
    }

    @Override
    public void typeOfGarage() {
        house.setTypeOfGarage("Castle doesn't require a Garage we can park in the castle");
    }

    @Override
    public void hasSwimminPool() {
        house.setHasSwimminPool(true);
    }

    @Override
    public void typeOfGarden() {
        house.setTypeOfGarden("Having garden full of neem trees ");
    }

    @Override
    public void ceiling() {
        house.setCeiling(" High Rise ceiling ");
    }

    @Override
    public void hasBalconyView() {
        house.setHasBalconyView(true);
    }

    @Override
    public House getHouse() {
        return house;
    }
}
