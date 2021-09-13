package com.sefakabatas.landmarkbookjava;

public class Singleton {

    //Constructor
    private LandMark sentBirdMark;
    private static Singleton singleton;

    private Singleton(){


    }
    public LandMark getSentBirdMark(){
        return sentBirdMark;
    }
    public  void setSentBirdMark(LandMark sentBirdMarkird){
        this.sentBirdMark = sentBirdMarkird;

    }
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }
            return singleton;
    }
}
