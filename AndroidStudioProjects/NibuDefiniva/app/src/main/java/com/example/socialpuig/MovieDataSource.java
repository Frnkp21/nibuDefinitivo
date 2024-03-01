package com.example.socialpuig;

import java.util.ArrayList;
import java.util.List;

public class MovieDataSource {
    public static List<Movie> getMovieList() {
        List<Movie> movies = new ArrayList<>();
        // Aquí agregarías tus películas a la lista
        movies.add(new Movie("advengers", "COMO ERES TAN GAY", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.esquire.com%2Fes%2Factualidad%2Fcine%2Fg20427623%2Fguia-peliculas-marvel-avengers-infinity-war%2F&psig=AOvVaw0TRDQ767Op8TdeA23SL2mP&ust=1709380688503000&source=images&cd=vfe&opi=89978449&ved=0CBIQjRxqFwoTCMDkw7WB04QDFQAAAAAdAAAAABAE"));
        movies.add(new Movie("Título de la película 2", "Sinopsis de la película 2", "URL del póster de la película 2"));
        // Agrega más películas según sea necesario
        movies.add(new Movie("Título de la película 2", "Sinopsis de la película 2", "URL del póster de la película 2"));
        return movies;
    }
}
