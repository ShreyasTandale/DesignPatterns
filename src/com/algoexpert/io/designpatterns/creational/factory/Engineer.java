package com.algoexpert.io.designpatterns.creational.factory;

public class Engineer implements Profession {
    @Override
    public void print() {
        System.out.println("I am an Engineer!");
    }
}
