package com.example.model;

import java.io.Serializable;

public class Image implements Serializable{
    
    private static final long serialVersionUID = -5636168911755710444L;
    public static final String SIZE_ORIGINAL = "original";
    public static final String SIZE_MID = "mid";
    public static final String SIZE_COVER = "cover";
    public static final String SIZE_THUMB = "thumb";

    public static final String TYPE_PROFILE = "profile";
    public static final String TYPE_POSTER = "poster";
    
    public String type;
    public String url;
    public String size;
    public int width;
    public int height;
    
}

