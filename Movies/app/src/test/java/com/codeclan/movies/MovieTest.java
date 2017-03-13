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

    @Test
    public void testCanSetName(){
        movie = new Movie("Apocalypse Now", "War", 1);
        movie.setTitle("Dumb & Dumber");
        assertEquals("Dumb & Dumber", movie.getTitle() );
    }

    @Test
    public void testCanSetGenre(){
        movie = new Movie("Apocalypse Now", "War", 1);
        movie.setGenre("Comedy");
        assertEquals( "Comedy", movie.getGenre() );
    }

    @Test
    public void testCanSetRating(){
        movie = new Movie("Apocalypse Now", "War", 1);
        movie.setRanking(2);
        assertEquals( 2, movie.getRanking() );
    }

    @Test
    public void testToString(){
        String result = "Title: 'Apocalypse Now', Genre: 'War', Ranking: 1";
        assertEquals(result, movie.toString());
    }


}