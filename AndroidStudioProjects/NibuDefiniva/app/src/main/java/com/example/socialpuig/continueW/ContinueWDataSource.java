package com.example.socialpuig.continueW;

import java.util.ArrayList;
import java.util.List;

public class ContinueWDataSource {

    public static List<ContinueW> getContinueWList() {
        List<ContinueW> continueWList = new ArrayList<>();
        // Aquí puedes agregar tus elementos a la lista
        continueWList.add(new ContinueW("Smile", "Synopsis 1", "https://www.lahiguera.net/cinemania/pelicula/10302/smile-cartel-10611.jpg"));
        continueWList.add(new ContinueW("Jujutsu Kaisen", "Synopsis 2", "https://m.media-amazon.com/images/I/818DUzqnwES.jpg"));
        continueWList.add(new ContinueW("Cars 1", "Synopsis 3", "https://m.media-amazon.com/images/I/819Y8NTz0mL._AC_UF894,1000_QL80_.jpg"));
        continueWList.add(new ContinueW("Merlina", "Synopsis 3", "https://i0.wp.com/cuatrobastardos.com/wp-content/uploads/2022/09/Merlina-Poster.jpg?resize=603%2C892&ssl=1"));
        // Agrega más elementos según sea necesario
        return continueWList;
    }
}
