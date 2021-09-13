package com.sefakabatas.landmarkbookjava;

import java.io.Serializable;

public class LandMark implements Serializable {
    // bird name
    String name;
    //bird country
    String country;
    //image oto id => anroid studio
    int image;
    String detail;

    //Constructor

    public LandMark(String name, String country, int image, String detail){
        this.name = name;
        this.country = country;
        this.image = image;
        this.detail =detail;
    }
}
