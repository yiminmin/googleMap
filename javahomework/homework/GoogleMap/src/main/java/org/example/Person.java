package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private String spouseFirstName;
    private String spouseLastName;

    //constructors, getters and setters

    public Person() {
    }

    public Person(String firstName, String lastName, String spouseFirstName, String spouseLastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.spouseFirstName = spouseFirstName;
        this.spouseLastName = spouseLastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSpouseFirstName() {
        return spouseFirstName;
    }

    public void setSpouseFirstName(String spouseFirstName) {
        this.spouseFirstName = spouseFirstName;
    }

    public String getSpouseLastName() {
        return spouseLastName;
    }

    public void setSpouseLastName(String spouseLastName) {
        this.spouseLastName = spouseLastName;
    }
}
