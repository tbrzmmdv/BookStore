package com.example.bookstore.Config;

import com.example.bookstore.Repository.BookRepository;
import com.example.bookstore.Repository.MainRepository;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    BookRepository bookRepository=new BookRepository();

}
