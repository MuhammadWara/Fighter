package com.example.initalizing_app;

public class Characters {

    public Characters(String name, String disc, Integer image, String orign, String stage, Integer gif, String voiceactor) {
        Name = name;
        Disc = disc;
        Image = image;
        this.orign = orign;
        this.stage = stage;
        this.gif = gif;
        this.voiceactor = voiceactor;
    }

    private String Name;
    private String Disc;
    private Integer Image;
    private String orign;
    private String stage;
    private Integer gif;
    private String voiceactor;

    public String getName() {
        return Name;
    }

    public String getDisc() {
        return Disc;
    }

    public Integer getImage() {
        return Image;
    }

    public String getOrign() {
        return orign;
    }

    public String getStage() {
        return stage;
    }

    public Integer getGif() {
        return gif;
    }

    public String getVoiceactor() {
        return voiceactor;
    }


}


