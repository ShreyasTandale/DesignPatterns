package com.algoexpert.io.designpatterns.creational.factory;

public class ProfesssionFactory {
    public Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null) return null;
        switch (typeOfProfession) {
            case "Doctor": return new Doctor();
            case "Teacher": return new Teacher();
            case "Engineer": return new Engineer();
            default: throw new RuntimeException("Profession type invalid!");
        }
    }
}
