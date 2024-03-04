package com.example.socialpuig.continueW;

public class ContinueW {
    private String title;
    private String synopsis;
    private String posterUrl;

    public ContinueW(String title, String synopsis, String posterUrl) {
        this.title = title;
        this.synopsis = synopsis;
        this.posterUrl = posterUrl;
    }

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
