package com.example.bookstore.Service;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    public List<Book> avaliableBooks(){
        return bookRepository.getAllBooks().stream()
                .filter(Book::isInStock).collect(Collectors.toList());
    }
    public List<Book> getCheaperThan(double price){
        return bookRepository.getAllBooks()
                .stream()
                .filter(book -> book.getPrice()<price).collect(Collectors.toList());
    }
}
