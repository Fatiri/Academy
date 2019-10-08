package com.enigma.entity;
import javax.persistence.*;
@Entity
public class Song {
    @Id
    private Integer id;

    private String tittle;

    @ManyToOne
    private Artist artist;

    public Song(Integer id, String tittle, Artist artist) {
        this.id = id;
        this.tittle = tittle;
        this.artist = artist;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public Song() {
    }
}
