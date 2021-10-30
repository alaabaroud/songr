package com.example.songr;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class SongModel {
    @Id
    @GeneratedValue
private int id;
    private String title;
    private double length;
    private int trackNumber;



    public SongModel(int id, String title, double length, int trackNumber) {
        this.id = id;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
