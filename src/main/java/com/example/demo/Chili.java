package com.example.demo;

import javax.persistence.*;

@Entity
public class Chili {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chiliID")
    private Integer id;
    @Column(name = "nameOfChili")
    private String nameOfChili;
    @Column(name = "scovilleOfChili")
    private int scovilleOfChili;
    @Column(name = "imageURL")
    private String imageURL;
    @Column(name = "videoURL")
    private String videoURL;
    @Column(name = "originOfChili")
    private String originOfChili;
    @Column(name = "colorOfChili")
    private ColorOfChili colorOfChili;
    @Column(name = "spicynessLevel")
    private String spicinessLevel;

    public Chili() {
    }

    public Chili(String nameOfChili, int scovilleOfChili) {
        this.nameOfChili = nameOfChili;
        this.scovilleOfChili = scovilleOfChili;
    }

    public Chili(String nameOfChili, int scovilleOfChili, String originOfChili, ColorOfChili colorOfChili, Integer id, String imageURL, String videoURL, String spicinessLevel) {
        this(nameOfChili, scovilleOfChili);
        this.originOfChili = originOfChili;
        this.colorOfChili = colorOfChili;
        this.id = id;
        this.imageURL = imageURL;
        this.videoURL = videoURL;
        this.spicinessLevel = spicinessLevel;
    }

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


    public ColorOfChili getColorOfChili() {
        return colorOfChili;
    }

    public void setColorOfChili(ColorOfChili colorOfChili) {
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
