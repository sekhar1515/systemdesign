package com.patterns.builderFactory.director;

import com.patterns.builderFactory.builder.Builder;
import com.patterns.builderFactory.product.House;

public class HouseDirector {
    private Builder builder;

    public HouseDirector(Builder builder) {
        this.builder = builder;
    }

    public House constructHouse() {
        builder.ceiling();
        builder.hasBalconyView();
        builder.hasSwimminPool();
        builder.typeOfGarage();
        builder.typeOfGarden();
        builder.typeOfWalls();
        return builder.getHouse();
    }
}
