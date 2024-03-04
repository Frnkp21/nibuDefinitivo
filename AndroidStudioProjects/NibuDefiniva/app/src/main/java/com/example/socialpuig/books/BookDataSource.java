package com.example.socialpuig.books;

import java.util.ArrayList;
import java.util.List;

public class BookDataSource {

    public static List<Book> getBookList() {
        List<Book> books = new ArrayList<>();
        // Agrega libros a la lista
        books.add(new Book("Blue Lock", "https://static.wikia.nocookie.net/bluelock/images/7/77/JP_Volume_1.png/revision/latest?cb=20230303005748&path-prefix=es", 230));
        books.add(new Book("Dead 7", "https://algareditorial.com/30039-large_default/dead7.jpg", 281));
        books.add(new Book("Reyes Caidos", "https://marketplace.canva.com/EAFjNCKkDPI/1/0/1003w/canva-portada-de-libro-de-fantas%C3%ADa-dram%C3%A1tico-verde-Ct1fLal3ekY.jpg", 328));
        books.add(new Book("Harry Potter y la piedra filosofal", "https://img.huffingtonpost.es/files/image_720/uploads/2022/12/11/6395adbeab6e4.jpeg", 279));
        books.add(new Book("La Soledad era esto", "https://m.media-amazon.com/images/I/7183C7sB1eL._SL1500_.jpg", 224));
        // Agrega más libros según sea necesario
        return books;
    }
}
