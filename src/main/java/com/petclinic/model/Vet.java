package com.petclinic.model;

public class Vet extends Person {
    @Override
    public String toString() {
        return "Vet {" +
                "ID='" + getId() + '\'' +
                "firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                '}';
    }
}
