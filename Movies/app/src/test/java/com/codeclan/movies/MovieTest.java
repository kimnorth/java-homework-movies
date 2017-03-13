package com.codeclan.movies;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before(){
        movie = new Movie( "Apocalypse Now", "War", 1);
    }

    @Test
    public void testCanGetName(){
        assertEquals("Apocalypse Now", movie.getTitle() );
    }

    @Test
    public void testCanGetGenre(){
        assertEquals( "War", movie.getGenre() );
    }

    @Test
    public void testCanGetRating(){
        assertEquals( 1, movie.getRanking() );
    }


}