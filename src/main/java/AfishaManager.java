public class AfishaManager {

    private int id;
    private String movieName;
    private int maxNumber;

    // конструктор
    public AfishaManager(MovieRepository repo) {
        this.repo = repo;
    }




    public AfishaManager(maxNumber) {
        this.maxNumber =;
    }


    public AfishaManager() {
        this.maxNumber = 10;
    }

//    int limitedArray;
//    for (int i = 0; i < limit ; i++ );
//


    public int getId() {
        return id;
    }

    public int getMovieName() {
        return id;
    }


    private Afisha[] movies = new Afisha[0]; // изнаально массив ниего не помнит - тут будет массив длинною 0

    private MovieRepository repo;


    // метод добавления ильмов
    public void add(Afisha movie) {
        repo.add(movie);
    }


    // метод вывод всех ильмов в порядке добавления

    public Afisha[] allMovies() {


        Afisha[] findAll = repo.getMovies(); // массив отдал репозиторий, в прямом порядке

        return findAll;
    }


    // метод вывод всех ильмов в обратном порядке добавления
    public Afisha[] allMoviesReverse() {
        Afisha[] findAll = repo.getMovies(); // массив отдал репозиторий, в прямом порядке

        Afisha[] findLast = new Afisha[findAll.length]; // массив для обратного порядка
        for (int i = 0; i < findLast.length; i++) {
            findLast[i] = findAll[findAll.length - 1 - i];
        }
        return findLast;


    }


}

