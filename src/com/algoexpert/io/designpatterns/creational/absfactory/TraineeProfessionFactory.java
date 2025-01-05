package com.algoexpert.io.designpatterns.creational.absfactory;

public class TraineeProfessionFactory extends AbstractFactory {
    @Override
    Profession getProfession(String typeOfProfession) {
        if(typeOfProfession == null) return null;
        switch (typeOfProfession) {
            case "Teacher": return new TraineeTeacher();
            case "Engineer": return new TraineeEngineer();
            default: throw new RuntimeException("Invalid profession type");
        }
    }
}
