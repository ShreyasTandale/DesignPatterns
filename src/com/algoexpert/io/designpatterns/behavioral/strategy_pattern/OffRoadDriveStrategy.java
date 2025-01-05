package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class OffRoadDriveStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("Off Roading drive strategy.......");
    }
}
