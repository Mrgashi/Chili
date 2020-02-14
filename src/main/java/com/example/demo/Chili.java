package com.example.demo;

public class Chili {
    private String nameOfChili;
    private int scovilleOfChili;
    private String originOfChili;
    private ColorOfChili colorOfChili;
    private Integer id;
    private String imageURL; // TODO add to constructor and add image url when creating in Repo

    public Chili(String nameOfChili, int scovilleOfChili, String originOfChili, ColorOfChili colorOfChili, Integer id, String imageURL) {
        this.nameOfChili = nameOfChili;
        this.scovilleOfChili = scovilleOfChili;
        this.originOfChili = originOfChili;
        this.colorOfChili = colorOfChili;
        this.id = id;
        this.imageURL = imageURL;
        /*this.imageURL = "imageURL";*/
    }

    public String getNameOfChili() {
        return nameOfChili;
    }

    public int getScovilleOfChili() {
        return scovilleOfChili;
    }

    public String getOriginOfChili() {
        return originOfChili;
    }

    public ColorOfChili getColorOfChili() {
        return colorOfChili;
    }

    public Integer getId() {
        return id;
    }

    public String getImageURL() { return imageURL; }


    @Override
    public String toString() {
        return "Chili{" +
                "nameOfChili='" + nameOfChili + '\'' +
                ", scovilleOfChili=" + scovilleOfChili +
                ", originOfChili='" + originOfChili + '\'' +
                ", colorOfChili=" + colorOfChili + '\'' +
                ", id = " + id + ", imageURL=" + imageURL +
                '}';
    }
}
