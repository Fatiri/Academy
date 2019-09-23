package com.enigma.model;

public class Student {

    private Integer id;
    private  String name;
    private String birthPlace;
    private String birthDate;
    private  String gender;
    public Student(Integer id, String name, String birthPlace, String birthDate, String gender) {
        this.id = id;
        this.name = name;
        this.birthPlace = birthPlace;
        this.birthDate = birthDate;
        this.gender = gender;
    }







    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthDate=" + birthDate +
                ", gender='" + gender + '\'' +
                '}';
    }
}
