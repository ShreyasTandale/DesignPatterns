package com.algoexpert.io.designpatterns.creational.singleton;

/*
    This pattern involves a single class which is responsible for creating an object while making sure that only single object gets created.

* */
public class SingletonMain {
    public static void main(String[] args) {
        SingletonClass singletonClass1 = SingletonClass.getInstance();
        singletonClass1.simpleMethod();
        SingletonClass singletonClass2 = SingletonClass.getInstance();
        singletonClass2.simpleMethod();

    }
}
