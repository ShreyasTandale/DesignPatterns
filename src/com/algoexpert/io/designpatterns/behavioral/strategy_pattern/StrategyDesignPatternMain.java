package com.algoexpert.io.designpatterns.behavioral.strategy_pattern;

/*
* When to use Strategy Design pattern?
* Ans: When both child's of the same parent are overriding same exact behavior.
* */
public class StrategyDesignPatternMain {
    public static void main(String[] args) {
        Vehicle lamborgini = new Lamborgini();
        lamborgini.driveVehicle();

        Vehicle thar = new Thar();
        thar.driveVehicle();
    }
}
