package com.codeclan.movies;

import org.junit.Before;
import org.junit.Test;

import java.util.logging.ConsoleHandler;

import static org.junit.Assert.*;

/**
 * Created by user on 13/03/2017.
 */

public class RankingsTest {

    Rankings rankings;
    Movie movie;
    Movie movie2;

    @Before
    public void before() {
        rankings = new Rankings();
        movie = new Movie("Apocalypse Now", "War", 1);
    }

    @Test
    public void testCanAddMovie(){
        rankings.addMovie(movie);
        assertEquals(1, rankings.getNumberOfItems());
    }

    @Test
    public void testFindMovieByRanking(){
        rankings.addMovie(movie);
        String searchResult = rankings.findByRanking(1);
        String expected = "Title: 'Apocalypse Now', Genre: 'War', Ranking: 1";
        assertEquals( expected, searchResult );
    }

    @Test
    public void testReplaceFinalMovie(){
        rankings = new Rankings();
        movie = new Movie("Apocalypse Now", "War", 10);
        movie2 = new Movie("Dumb & Dumber", "Comedy", 22);
        rankings.replaceMovie(10, movie2);
        String searchResult = rankings.findByRanking(10);
        String result = "Title: 'Dumb & Dumber', Genre: 'Comedy', Ranking: 10";
        assertEquals(result, searchResult);
    }

    @Test
    public void testFindMovieByTitle(){
        rankings = new Rankings();
        rankings.addMovie(movie);
        String result = rankings.findMovieByTitle("Apocalypse Now");
//        String resultToString = result.toString();
        String expected = "Title: 'Apocalypse Now', Genre: 'War', Ranking: 1";
        assertEquals(expected, result);
    }

}
