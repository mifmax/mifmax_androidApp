package com.example.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Person implements Serializable{
    
    private static final long serialVersionUID = -6670252891312516187L;
    public String score;
    public String popularity;
    public String name;
    public String id;
    public String biography;
    public String url;
    public String version;
    public String lastModifiedAt;
    public ArrayList<Image> imagesList;

}