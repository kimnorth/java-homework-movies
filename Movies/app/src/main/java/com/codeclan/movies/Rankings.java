package com.codeclan.movies;

import java.util.ArrayList;

/**
 * Created by user on 13/03/2017.
 */

public class Rankings {

    Movie[] rankings;

    public Rankings(){
        this.rankings = new Movie[10];
    }

    public int getNumberOfItems(){
        int count = 0;
        for (Movie movie : rankings){
            if (movie != null) {
                count++;
            }
        }
        return count;
    }

    public void addMovie(Movie movie){
        int index = movie.getRanking();
        this.rankings[index - 1] = movie;
    }

    public String findByRanking(int ranking){
        Movie movieObject = rankings[ranking];
        String result = movieObject.toString();
        return result;
        }


}
