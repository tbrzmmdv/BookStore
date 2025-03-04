package com.example.bookstore.Repository;

import com.example.bookstore.Model.Book;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



@Repository("FirstBook")
@Scope("singleton")
public class BookRepository implements MainRepository{
    private final List<Book> books = Arrays.asList(
            new Book("Java 101", "John Doe", 29.99, true),
            new Book("Spring Boot in Action", "Craig Walls", 39.99, false),
            new Book("Effective Java", "Joshua Bloch", 45.50, true),
            new Book("Clean Code", "Robert C. Martin", 50.00, true),
            new Book("Microservices with Spring", "Mark Heckler", 42.30, false)
    );
    @Override
    public List<Book> getAllBooks() {
        return books;
    }
}
