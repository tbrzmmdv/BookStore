package com.example.bookstore.Repository;

import com.example.bookstore.Model.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;
@Repository("AnotherBook")
@Scope("prototype")
public class AnotherBookRepository implements MainRepository {


    private final List<Book> books = Arrays.asList(
            new Book("Spring", "Craig ", 39.99, false),
            new Book("Clean ", "Robert ", 50.00, true),
            new Book("Microservices ", "Mark Heckler", 42.30, false)
    );
    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
