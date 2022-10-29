public class MovieRepository {

    private Afisha[] movies = new Afisha[0]; // изнаально массив ниего не помнит - тут будет массив длинною 0



    public void add(Afisha movie){
        Afisha[] tmp = new Afisha[movies.length +1 ]; // временный массив на 1 больше
        for (int i = 0; i < movies.length ; i++){
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;

    }

    public void removeByID(int id){
        Afisha[] tmp = new Afisha[movies.length -1 ];
        int copyToIndex = 0;
        for (Afisha movie : movies){
           if(movie.getId() != id){
               tmp[copyToIndex] = movie;
               copyToIndex++;
           }
           movies = tmp;
        }

    }

    public Afisha[] getMovies(){
      return movies;
    }
}
