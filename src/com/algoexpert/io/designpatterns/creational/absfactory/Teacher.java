package com.algoexpert.io.designpatterns.creational.absfactory;

public class Teacher implements Profession {
    @Override
    public void print() {
        System.out.println("I am a Teacher");
    }
}
