package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class Thar extends Vehicle {
    Thar() {
        super(new OffRoadDriveStrategy());
    }
}
