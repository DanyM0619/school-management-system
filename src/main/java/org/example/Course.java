package org.example;

public class Course {

    private int id;
    private String name;
    private String description;
    private int numberCredits;
    private String version;

    public Course(int id, String name, String description, int numberCredits, String version) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.numberCredits = numberCredits;
        this.version = version;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumberCredits() {
        return numberCredits;
    }

    public void setNumberCredits(int numberCredits) {
        this.numberCredits = numberCredits;
    }

    public String getVersion(){
        return version;
    }

    public void setVersion(String version){
        this.version = version;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", numberCredits=" + numberCredits +
                '}';
    }
}
