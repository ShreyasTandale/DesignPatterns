package com.algoexpert.io.designpatterns.creational.builder;

public class FloodResistantBuilder implements Builder {

    private Home floodResistantHome = new Home();
    @Override
    public void buildFloors() {
        this.floodResistantHome.floors = "10 feet above ground level floor";
    }

    @Override
    public void buildWalls() {
        this.floodResistantHome.walls = "Water resistant walls";
    }

    @Override
    public void buildTerrace() {
        this.floodResistantHome.terrace = "Water leakage resistant terrace";
    }

    @Override
    public Home getComplexHomeObject() {
        return this.floodResistantHome;
    }
}
