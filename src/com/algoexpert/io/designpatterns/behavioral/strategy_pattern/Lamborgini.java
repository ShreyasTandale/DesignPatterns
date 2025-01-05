package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

public class Lamborgini extends Vehicle{
    Lamborgini() {
        super(new SportsDriveStrategy());
    }
}
