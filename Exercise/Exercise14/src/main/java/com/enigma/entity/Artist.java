package com.enigma.entity;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Artist {
    @Id
    private Integer id;
    private String name;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date debut;
    private String bornPlace;

    @OneToMany(mappedBy = "artist")
    private List<Song> songs;

    public Artist() {
    }

    public Artist(Integer id, String name, Date debut, String bornPlace, List<Song> songs) {
        this.id = id;
        this.name = name;
        this.debut = debut;
        this.bornPlace = bornPlace;
        this.songs = songs;
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

    public Date getDebut() {
        return debut;
    }

    public void setDebut(Date debut) {
        this.debut = debut;
    }

    public String getBornPlace() {
        return bornPlace;
    }

    public void setBornPlace(String bornPlace) {
        this.bornPlace = bornPlace;
    }

    public List<Song> getSongs() {
        return songs;
    }

    public void setSongs(List<Song> songs) {
        this.songs = songs;
    }
}
