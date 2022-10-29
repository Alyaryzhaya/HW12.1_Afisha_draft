//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class MovieRepositoryTest {
//
//
//    Afisha movie1 = new Afisha(1,"Dune" );
//    Afisha movie2 = new Afisha(2,"Nomadland" );
//    Afisha movie3 = new Afisha(3,"Coco" );
//    Afisha movie4 = new Afisha(4,"Interstellar" );
//    Afisha movie5 = new Afisha(5,"Intouchables" );
//    Afisha movie6 = new Afisha(6,"Gladiator" );
//    Afisha movie7 = new Afisha(7,"Inception" );
//    Afisha movie8 = new Afisha(8,"Snatch" );
//    Afisha movie9 = new Afisha(9,"Titanic" );
//    Afisha movie10 = new Afisha(10,"The Gentlemen" );
//    Afisha movie11 = new Afisha(11,"Leon" );
//
//
//
//
//    @Test
//    public void test(){
//        MovieRepository repo = new MovieRepository();
//
//        repo.add(movie1);
//        repo.add(movie2);
//        repo.add(movie3);
//        repo.add(movie4);
//        repo.add(movie5);
//        repo.add(movie6);
//        repo.add(movie7);
//        repo.add(movie8);
//        repo.add(movie9);
//        repo.add(movie10);
//        repo.add(movie11);
//        repo.removeByID(movie9.getId());
//
//
//        Afisha[] expected = {movie1,movie2, movie3, movie4, movie5,movie6, movie7, movie8, movie10, movie11};
//        Afisha[] actual = repo.getMovies();
//
//        Assertions.assertArrayEquals(expected,actual);
//
//
//    }
//
//}