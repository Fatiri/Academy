package com.enigma.service;

import java.util.Objects;

public class People {
    String name;
    Integer age;
    String gender;
 public void People (String name, Integer age, String gender){
     this.name = name;
     this.age = age;
     this.gender = gender;
 }

     public void setAge(Integer age) {
         this.age = age;
     }

     public String getGender() {
         return gender;
     }

     public void setName(String name) {
         this.name = name;
     }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        People people = (People) o;
        return Objects.equals(name, people.name) &&
                Objects.equals(age, people.age) &&
                Objects.equals(gender, people.gender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
