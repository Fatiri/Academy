package com.enigma.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Room {
    @Id
     private Integer id;
    @Column (name ="room_name")
     private String roomName;
    @Column (name = "capacity")
    private Integer capacity;
    @OneToMany (mappedBy = "classRoomId")
    private List<Student> student;


    public Room() {
    }

    public Room(Integer id, String roomName, Integer capacity, List<Student> student) {
        this.id = id;
        this.roomName = roomName;
        this.capacity = capacity;
        this.student = student;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public List<Student> getStudent() {
        return student;
    }

    public void setStudent(List<Student> student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", roomName='" + roomName + '\'' +
                ", capacity=" + capacity +

                '}';
    }
}
