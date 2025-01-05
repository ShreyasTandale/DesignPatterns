package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Sports Drive strategy......");
    }
}
