package com.example.socialpuig.books;

public class Book {
    private String title;
    private String posterUrl;
    private int pageCount;

    public Book(String title, String posterUrl, int pageCount) {
        this.title = title;
        this.posterUrl = posterUrl;
        this.pageCount = pageCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPosterUrl() {
        return posterUrl;
    }

    public void setPosterUrl(String posterUrl) {
        this.posterUrl = posterUrl;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
}
