package com.codeclan.movies;

import org.junit.Before;
import org.junit.Test;
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
        assertNotNull(rankings.getNumberOfItems());
    }

}
