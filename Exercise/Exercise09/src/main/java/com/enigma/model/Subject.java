package com.enigma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table (name = "subject")
public class Subject {
    @Id
    @Column (name = "id")
    private Integer id;
    @Column (name = "subject_name")
    private  String subjectName;
    @Column (name ="sks")
    private  Integer sks;
    @OneToMany (mappedBy = "subjects")
    private List<StudentSubject> studentSubjects;


    public Subject() {
    }

    public Subject(Integer id, String subjectName, Integer sks, List<StudentSubject> studentSubjects) {
        this.id = id;
        this.subjectName = subjectName;
        this.sks = sks;
        this.studentSubjects = studentSubjects;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Integer getSks() {
        return sks;
    }

    public void setSks(Integer sks) {
        this.sks = sks;
    }

    public List<StudentSubject> getStudentSubjects() {
        return studentSubjects;
    }

    public void setStudentSubjects(List<StudentSubject> studentSubjects) {
        this.studentSubjects = studentSubjects;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                ", sks=" + sks +
//                ", studentSubjects=" + studentSubjects +
                '}';
    }
}
