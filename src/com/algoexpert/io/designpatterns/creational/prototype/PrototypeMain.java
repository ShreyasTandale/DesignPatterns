package com.algoexpert.io.designpatterns.creational.prototype;

/*
* Prototype patterns refers to creating duplicate objects while keeping performance in mind.
* It involves creating a prototype interface which tells you to create a clone of the current object.
* This pattern is used when creating object directly is costly. For example, it requires database calls
* or requires too much of processing that will take a lot of memory.
*
* What can be done? We can cache this object and return its clone on the next request.
* */
public class PrototypeMain {
    public static void main(String[] args) throws CloneNotSupportedException {
        ProfessionCache.loadProfessionCache();
        Profession doctor = ProfessionCache.getClonedNewProfession(1);
        System.out.println(doctor);
        Profession engineer = ProfessionCache.getClonedNewProfession(2);
        System.out.println(engineer);
        Profession engineer2 = ProfessionCache.getClonedNewProfession(2);
        System.out.println(engineer2);
    }
}
