package com.algoexpert.io.designpatterns.creational.factory;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I am a teacher !");
    }
}
