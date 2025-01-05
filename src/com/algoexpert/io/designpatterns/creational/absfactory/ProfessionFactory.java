package com.algoexpert.io.designpatterns.creational.absfactory;


public class ProfessionFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
       if(typeOfProfession == null) return null;
       switch (typeOfProfession) {
           case "Teacher": return new Teacher();
           case "Engineer": return new Engineer();
           default: throw new RuntimeException("Invalid profession type");
       }
    }
}
