package com.algoexpert.io.designpatterns.creational.builder;

public class EarthquakeResistantBuilder implements Builder {

    private Home earthquakeResistantHome = new Home();
    @Override
    public void buildFloors() {
        this.earthquakeResistantHome.floors = "Wooden floor";
    }

    @Override
    public void buildWalls() {
        this.earthquakeResistantHome.walls = "Wooden walls";
    }

    @Override
    public void buildTerrace() {
        this.earthquakeResistantHome.terrace = "Wooden terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.earthquakeResistantHome;
    }
}
