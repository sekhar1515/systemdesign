package com.patterns.builderFactory.product;

public class House {
    String typeOfWalls;

    String typeOfGarage;
    boolean hasSwimminPool;

    String typeOfGarden;

    String ceiling;

    boolean hasBalconyView;

    public void setTypeOfWalls(String typeOfWalls) {
        this.typeOfWalls = typeOfWalls;
    }

    public void setTypeOfGarage(String typeOfGarage) {
        this.typeOfGarage = typeOfGarage;
    }

    public void setHasSwimminPool(boolean hasSwimminPool) {
        this.hasSwimminPool = hasSwimminPool;
    }

    public void setTypeOfGarden(String typeOfGarden) {
        this.typeOfGarden = typeOfGarden;
    }

    public void setCeiling(String ceiling) {
        this.ceiling = ceiling;
    }

    public void setHasBalconyView(boolean hasBalconyView) {
        this.hasBalconyView = hasBalconyView;
    }

    @Override
    public String toString() {
        return "House{" +
                "typeOfWalls='" + typeOfWalls + '\'' +
                ", typeOfGarage='" + typeOfGarage + '\'' +
                ", hasSwimminPool=" + hasSwimminPool +
                ", typeOfGarden='" + typeOfGarden + '\'' +
                ", ceiling='" + ceiling + '\'' +
                ", hasBalconyView=" + hasBalconyView +
                '}';
    }
}
