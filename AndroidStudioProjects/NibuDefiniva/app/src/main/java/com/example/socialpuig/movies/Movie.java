package com.example.socialpuig.movies;

public class Movie {
    private String title;
    private String synopsis;
    private String posterUrl;

    public Movie(String title, String synopsis, String posterUrl) {
        this.title = title;
        this.synopsis = synopsis;
        this.posterUrl = posterUrl;
    }

    // Getters y setters para acceder y establecer los atributos de la película

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }
}
