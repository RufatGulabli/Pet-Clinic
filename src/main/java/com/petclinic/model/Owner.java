package com.petclinic.model;

public class Owner extends Person {
    @Override
    public String toString() {
        return "Owner {" +
                "ID='" + getId() + '\'' +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
