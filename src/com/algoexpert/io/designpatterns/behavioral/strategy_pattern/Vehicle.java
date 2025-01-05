package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class Vehicle {

    private DriveStrategy strategy;
    Vehicle(DriveStrategy strategy) {
        this.strategy = strategy;
    }

    public void driveVehicle() {
        strategy.drive();
    }
}
