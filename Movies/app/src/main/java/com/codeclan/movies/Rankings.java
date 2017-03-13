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
        Movie movieObject = rankings[ranking - 1];
        String result = movieObject.toString();
        return result;
        }

    public void replaceMovie(int ranking, Movie movie){
        movie.setRanking(ranking);
        this.addMovie(movie);
    }

    public String findMovieByTitle(String title){
        for (Movie movie : rankings){
            if (movie.getTitle() == title){
                return movie.toString();
            }
        }
        return "Not found";
    }


}
