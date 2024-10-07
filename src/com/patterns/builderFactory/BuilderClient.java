package com.patterns.builderFactory;

import com.patterns.builderFactory.builder.Builder;
import com.patterns.builderFactory.builder.impl.CastleBuilder;
import com.patterns.builderFactory.builder.impl.WoodenBuilder;
import com.patterns.builderFactory.director.HouseDirector;
import com.patterns.builderFactory.product.House;

public class BuilderClient {
    public static void main(String[] args) {

        Builder woddenBuilder = new WoodenBuilder();
        HouseDirector houseDirector = new HouseDirector(woddenBuilder);
        House house = houseDirector.constructHouse();
        System.out.println(house.toString());

        Builder castleBuilder = new CastleBuilder();
        HouseDirector houseDirectorForCastle = new HouseDirector(castleBuilder);
        House castleHouse = houseDirectorForCastle.constructHouse();
        System.out.println(castleHouse.toString());
    }
}
