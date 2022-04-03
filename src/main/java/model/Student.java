package model;

import java.util.List;

public class Student {
    private int id;
    private String firstname ;
    private String lastName;
    private String address;
    private List<Classes> classesList;

    public Student() {
    }

    public Student(String firstname, String lastName, String address, List<Classes> classesList) {
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.classesList = classesList;
    }

    public Student(int id, String firstname, String lastName, String address, List<Classes> classesList) {
        this.id = id;
        this.firstname = firstname;
        this.lastName = lastName;
        this.address = address;
        this.classesList = classesList;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Classes> getClassesList() {
        return classesList;
    }

    public void setClassesList(List<Classes> classesList) {
        this.classesList = classesList;
    }
}
