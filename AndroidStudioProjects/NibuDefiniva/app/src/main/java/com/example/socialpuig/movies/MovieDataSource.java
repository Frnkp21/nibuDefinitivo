package com.example.socialpuig.movies;

import java.util.ArrayList;
import java.util.List;

public class MovieDataSource {
    public static List<Movie> getMovieList() {
        List<Movie> movies = new ArrayList<>();
        // Aquí agregarías tus películas a la lista
        movies.add(new Movie("Advengers", "Cuando un enemigo inesperado surge como una gran amenaza para la seguridad mundial, Nick Fury, director de la Agencia SHIELD, decide reclutar a un equipo para salvar al mundo de un desastre casi seguro.", "https://static.wikia.nocookie.net/marvelcinematicuniverse/images/2/2b/The_Avengers_Poster.png/revision/latest?cb=20150610135853&path-prefix=es"));
        movies.add(new Movie("El Grinch", "COMO ERES TAN GAY", "https://cloud10.todocoleccion.online/cine-posters-carteles/tc/2020/11/08/11/147367318_245204031_tcimg_71DA3C7A.jpg"));
        // Agrega más películas según sea necesario
        movies.add(new Movie("Saw 1", "COMO ERES TAN GAY", "https://i.ebayimg.com/images/g/Zs8AAOSw-f5iwYkI/s-l1600.jpg"));
        movies.add(new Movie("La Bella y la Bestia", "COMO ERES TAN GAY", "https://static.posters.cz/image/750/posters/la-bella-y-la-bestia-transformation-i40491.jpg"));
        movies.add(new Movie("Spiderman 3", "COMO ERES TAN GAY", "https://m.media-amazon.com/images/I/715B63QRoTL._AC_UF894,1000_QL80_.jpg"));

        return movies;
    }
}
