package com.algoexpert.io.designpatterns.creational.prototype;

public abstract class Profession implements Cloneable {

    public int id;
    public String name;

    abstract void print();

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
