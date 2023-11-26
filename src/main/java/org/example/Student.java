package org.example;

import java.time.LocalDate;

public class Student extends Person {

    private int id;
    private String name;
    private String lastname;
    private String description;
    private LocalDate birthdate;
    private String state;

    public Student(int id, String name1, String name, String lastname, String lastname1, String description, String birthdate, LocalDate birthdate1, String state) {
        super(name, lastname, birthdate);
        this.id = id;
        this.name = name1;
        this.lastname = lastname1;
        this.description = description;
        this.birthdate = birthdate1;
        this.state = state;
    }

    public Student(){
        super();
    }

    public int getId() {

        return id;
    }

    public void setId(int id) {

        this.id = id;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getLastname(){

        return lastname;
    }

    public void setLastname(){

        this.lastname = lastname;
    }

    public String getDescription() {

        return description;
    }

    public void setDescription(String description) {

        this.description = description;
    }

    public LocalDate getBirthdate1() {

        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getState() {

        return state;
    }

    public void setState(String state) {

        this.state = state;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", description='" + description + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
