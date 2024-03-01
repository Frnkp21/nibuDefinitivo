package com.example.socialpuig;

import java.util.ArrayList;
import java.util.List;

public class MovieDataSource {
    public static List<Movie> getMovieList() {
        List<Movie> movies = new ArrayList<>();
        // Aquí agregarías tus películas a la lista
        movies.add(new Movie("advengers", "COMO ERES TAN GAY", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/2/2b/The_Avengers_Poster.png/revision/latest?cb=20150610135853&path-prefix=es"));
        movies.add(new Movie("advengers", "COMO ERES TAN GAY", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/2/2b/The_Avengers_Poster.png/revision/latest?cb=20150610135853&path-prefix=es"));
        // Agrega más películas según sea necesario
        movies.add(new Movie("advengers", "COMO ERES TAN GAY", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/2/2b/The_Avengers_Poster.png/revision/latest?cb=20150610135853&path-prefix=es"));
        return movies;
    }
}
