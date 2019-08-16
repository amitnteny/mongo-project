package com.practice.mongoProject.domain;

public enum AnimalType {
    DOG("DOG"),
    CAT("CAT");

    private String value;

    AnimalType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    AnimalType getAnimalForString(String animal) {
        for (AnimalType a: AnimalType.values()) {
            if(a.value.equals(animal)){
                return a;
            }
        }
        throw new IllegalArgumentException();
    }
}
