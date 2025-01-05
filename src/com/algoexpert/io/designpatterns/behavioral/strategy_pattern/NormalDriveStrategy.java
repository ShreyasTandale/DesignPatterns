package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Norma drive strategy......");
    }
}
