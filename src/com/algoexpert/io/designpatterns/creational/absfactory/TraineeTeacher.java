package com.algoexpert.io.designpatterns.creational.absfactory;

public class TraineeTeacher implements Profession {
    @Override
    public void print() {
        System.out.println("I am a trainee teacher!");
    }
}
