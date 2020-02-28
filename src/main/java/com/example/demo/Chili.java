package com.example.demo;

import javax.persistence.*;

@Entity
public class Chili {
    @SuppressWarnings("JpaDataSourceORMInspection")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String nameOfChili;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private int scovilleOfChili;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String imageURL;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String videoURL;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String originOfChili;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String colorOfChili;
    @SuppressWarnings("JpaDataSourceORMInspection")
    private String spicinessLevel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameOfChili() {
        return nameOfChili;
    }

    public void setNameOfChili(String nameOfChili) {
        this.nameOfChili = nameOfChili;
    }

    public int getScovilleOfChili() {
        return scovilleOfChili;
    }

    public void setScovilleOfChili(int scovilleOfChili) {
        this.scovilleOfChili = scovilleOfChili;
    }

    public String getOriginOfChili() {
        return originOfChili;
    }

    public void setOriginOfChili(String originOfChili) {
        this.originOfChili = originOfChili;
    }

    public String getColorOfChili() {
        return colorOfChili;
    }

    public void setColorOfChili(String colorOfChili) {
        this.colorOfChili = colorOfChili;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public String getVideoURL() {
        return videoURL;
    }

    public void setVideoURL(String videoURL) {
        this.videoURL = videoURL;
    }

    public String getSpicinessLevel() {
        return spicinessLevel;
    }

    public void setSpicinessLevel(String spicinessLevel) {
        this.spicinessLevel = spicinessLevel;
    }
}
