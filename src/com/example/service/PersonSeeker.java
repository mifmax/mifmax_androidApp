package com.example.service;

import java.util.ArrayList;

import android.util.Log;

import com.example.model.Person;

public class PersonSeeker extends GenericSeeker<Person> {
        
    private static final String PEOPLE_SEARCH_PATH = "Person.search/";
    
    public ArrayList<Person> find(String query) {
        ArrayList<Person> moviesList = retrieveMoviesList(query);
        return moviesList;
    }
    
    public ArrayList<Person> find(String query, int maxResults) {
        ArrayList<Person> moviesList = retrieveMoviesList(query);
        return retrieveFirstResults(moviesList, maxResults);
    }
    
    private ArrayList<Person> retrieveMoviesList(String query) {
        String url = constructSearchUrl(query);
        String response = httpRetriever.retrieve(url);
        Log.d(getClass().getSimpleName(), response);
        return xmlParser.parsePeopleResponse(response);
    }

    @Override
    public String retrieveSearchMethodPath() {
        return PEOPLE_SEARCH_PATH;
    }

}
