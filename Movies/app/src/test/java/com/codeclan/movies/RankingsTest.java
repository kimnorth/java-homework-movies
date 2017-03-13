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

}
