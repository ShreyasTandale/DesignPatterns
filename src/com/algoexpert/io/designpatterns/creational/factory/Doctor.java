package com.algoexpert.io.designpatterns.creational.factory;

public class Doctor implements Profession{
    @Override
    public void print() {
        System.out.println("I am a doctor!");
    }
}
