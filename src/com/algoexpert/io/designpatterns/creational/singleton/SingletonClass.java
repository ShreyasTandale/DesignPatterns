package com.algoexpert.io.designpatterns.creational.singleton;

public class SingletonClass {
    private static SingletonClass singletonClassInstance = new SingletonClass();

    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return singletonClassInstance;
    }
    public void simpleMethod() {
        System.out.println("Hashcode of singleton instance = " + singletonClassInstance);
    }
}
