package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Movie implements Serializable{
    
    private static final long serialVersionUID = -811558805474015602L;
    public String score;
    public String popularity;
    public boolean translated;
    public boolean adult;
    public String language;
    public String originalName;
    public String name;
    public String type;
    public String id;
    public String imdbId;
    public String url;
    public String votes;
    public String rating;
    public String certification;
    public String overview;
    public String released;
    public String version;
    public String lastModifiedAt;
    public ArrayList<Image> imagesList;
    
    public String retrieveThumbnail() {
        if (imagesList!=null && !imagesList.isEmpty()) {
            for (Image movieImage : imagesList) {
                if (movieImage.size.equalsIgnoreCase(Image.SIZE_THUMB) &&
                        movieImage.type.equalsIgnoreCase(Image.TYPE_POSTER)) {
                    return movieImage.url;
                }
            }
        }
        return null;
        
    }    
    public String retrieveCoverImage() {
        if (imagesList!=null && !imagesList.isEmpty()) {
            for (Image movieImage : imagesList) {
                if (movieImage.size.equalsIgnoreCase(Image.SIZE_COVER) &&
                        movieImage.type.equalsIgnoreCase(Image.TYPE_POSTER)) {
                    return movieImage.url;
                }
            }
        }
        return null;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        String rel= " "+(released==""? ", ": " ")+released.substring(0, 4);
        builder.append(name+ rel+" рейтинг: "+rating);
        return builder.toString();
    }
}

