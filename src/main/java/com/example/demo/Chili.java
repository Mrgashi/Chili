package com.example.demo;


public class Chili {
    private String nameOfChili;
    private int scovilleOfChili;
    private String originOfChili;
    private ColorOfChili colorOfChili;
    private Integer id;
    private String imageURL;
    private String videoURL;
    private String spicinessLevel;


    public Chili(String nameOfChili, int scovilleOfChili) {
        this.nameOfChili = nameOfChili;
        this.scovilleOfChili = scovilleOfChili;
    }

    public Chili(String nameOfChili, int scovilleOfChili, String originOfChili, ColorOfChili colorOfChili, Integer id, String imageURL, String videoURL, String spicinessLevel) {
     this (nameOfChili, scovilleOfChili);
        this.originOfChili = originOfChili;
        this.colorOfChili = colorOfChili;
        this.id = id;
        this.imageURL = imageURL;
        this.videoURL = videoURL;
        this.spicinessLevel = spicinessLevel;
    }

    public String getNameOfChili() { return nameOfChili; }

    public int getScovilleOfChili() { return scovilleOfChili; }

    public String getOriginOfChili() { return originOfChili; }

    public ColorOfChili getColorOfChili() { return colorOfChili; }

    public Integer getId() { return id; }

    public String getImageURL() { return imageURL; }

    public String getVideoURL(){return videoURL;}

    public String getSpicinessLevel() { return spicinessLevel; }
}
