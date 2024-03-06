package com.example.socialpuig.series;

import java.util.ArrayList;
import java.util.List;

public class SeriesDataSource {
    public static List<Series> getSeriesList() {
        List<Series> seriesList = new ArrayList<>();

        // Agregar algunas series de ejemplo
        seriesList.add(new Series("Breaking Bad", "Un profesor de química con cáncer se convierte en un fabricante de metanfetaminas para asegurar el futuro de su familia.", "https://i.ebayimg.com/images/g/eKEAAOxyOMdS4U2W/s-l1200.jpg"));
        seriesList.add(new Series("Stranger Things", "Un grupo de niños en un pequeño pueblo descubre un mundo de criaturas extrañas y fuerzas sobrenaturales.", "https://m.media-amazon.com/images/I/71at-HOvB9L._AC_UF894,1000_QL80_.jpg"));
        seriesList.add(new Series("Game of Thrones", "Las familias nobles luchan por el control del Trono de Hierro en el continente de Poniente.", "https://m.media-amazon.com/images/I/81IXojwauiL._AC_UF1000,1000_QL80_.jpg"));
        seriesList.add(new Series("The Crown", "La serie sigue la vida de la Reina Isabel II desde su boda en 1947 hasta la actualidad.", "https://m.media-amazon.com/images/I/61WskqtbL9L._AC_UF894,1000_QL80_.jpg"));
        seriesList.add(new Series("Friends", "La vida de seis amigos en Nueva York mientras atraviesan las alegrías y tristezas de la vida.", "https://img.posterstore.com/zoom/wb0074-8friends-milkshake50x70.jpg"));

        return seriesList;
    }
}

