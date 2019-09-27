package com.enigma.model;

import javax.persistence.*;

@Entity
@Table (name = "student_subject")
public class StudentSubject {

    @Id
    private Integer id;
    @ManyToOne
    @JoinColumn (name = "student_id" )
    private Student students;
    @ManyToOne
    @JoinColumn (name = "subject_id")
    private Subject subjects;

    public StudentSubject() {
    }

    public StudentSubject(Integer id, Student students, Subject subjects) {
        this.id = id;
        this.students = students;
        this.subjects = subjects;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudents() {
        return students;
    }

    public void setStudents(Student students) {
        this.students = students;
    }

    public Subject getSubjects() {
        return subjects;
    }

    public void setSubjects(Subject subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "StudentSubject{" +
                "id=" + id +
                ", students=" + students.getName() +
                ", subjects=" + subjects +
                '}';
    }
}
