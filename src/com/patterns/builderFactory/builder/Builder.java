package com.patterns.builderFactory.builder;

import com.patterns.builderFactory.product.House;

public interface Builder {
    void typeOfWalls();

    void typeOfGarage();

    void hasSwimminPool();

    void typeOfGarden();

    void ceiling();

    void hasBalconyView();

    House getHouse();
}
