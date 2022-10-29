import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AfishaManagerTest {

    MovieRepository repo = new MovieRepository();
    AfishaManager manager = new AfishaManager(repo);

    Afisha movie1 = new Afisha(1,"Dune" );
    Afisha movie2 = new Afisha(2,"Nomadland" );
    Afisha movie3 = new Afisha(3,"Coco" );
    Afisha movie4 = new Afisha(4,"Interstellar" );
    Afisha movie5 = new Afisha(5,"Intouchables" );
    Afisha movie6 = new Afisha(6,"Gladiator" );
    Afisha movie7 = new Afisha(7,"Inception" );
    Afisha movie8 = new Afisha(8,"Snatch" );
    Afisha movie9 = new Afisha(9,"Titanic" );
    Afisha movie10 = new Afisha(10,"The Gentlemen" );
    Afisha movie11 = new Afisha(11,"Leon" );

    @BeforeEach
    public void setup() {
        manager.add(movie1);
        manager.add(movie2);
        manager.add(movie3);
        manager.add(movie4);
        manager.add(movie5);
        manager.add(movie6);
        manager.add(movie7);
        manager.add(movie8);
        manager.add(movie9);
        manager.add(movie10);
        manager.add(movie11);
    }





    @Test
    public void shouldFindLst10() {

        Afisha[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7, movie8, movie9, movie10, movie11};
        Afisha[] actual = manager.allMovies();

        Assertions.assertArrayEquals(expected, actual);

    }

        @Test

        public void shouldFindLst10Reverse(){

        Afisha[] expected = {movie11, movie10, movie9, movie8, movie7, movie6, movie5, movie4, movie3, movie2, movie1};
        Afisha[] actual = manager.allMoviesReverse();

            Assertions.assertArrayEquals(expected, actual);


    }

}