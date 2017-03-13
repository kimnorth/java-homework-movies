package com.codeclan.movies;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

public class Rankings {

    ArrayList<Movie> rankings;

    public Rankings(){
        this.rankings = new ArrayList<Movie>();
    }

    public int getLength(){
        return rankings.size();
    }

    public void addMovie(Movie movie){
        this.rankings.add(movie);
    }

}
