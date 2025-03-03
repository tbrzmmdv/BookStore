package com.example.bookstore.Controller;

import com.example.bookstore.Model.Book;
import com.example.bookstore.Service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

@RequestMapping("/books")
public class BookController {
    private final BookService bookService;


    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/available")
    public List<Book> avaliableBooks(){
        return bookService.avaliableBooks();
    }
    @GetMapping("/price/{maxPrice}")
    public List<Book> getBooksCheaperThan(@PathVariable double maxPrice) {
        return bookService.getCheaperThan(maxPrice);
    }
}
