package com.example.bookstore.Service;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Repository.BookRepository;
import com.example.bookstore.Repository.MainRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final MainRepository mainRepository;

    public BookService(@Qualifier("AnotherBook") MainRepository mainRepository) {
        this.mainRepository = mainRepository;
    }


    public List<Book> avaliableBooks(){
        return mainRepository.getAllBooks().stream()
                .filter(Book::isInStock).collect(Collectors.toList());
    }
    public List<Book> getCheaperThan(double price){
        return mainRepository.getAllBooks()
                .stream()
                .filter(book -> book.getPrice()<price).collect(Collectors.toList());
    }
}
