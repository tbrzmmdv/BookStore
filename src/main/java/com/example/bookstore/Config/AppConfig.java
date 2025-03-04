package com.example.bookstore.Config;

import com.example.bookstore.Repository.AnotherBookRepository;
import com.example.bookstore.Repository.BookRepository;
import com.example.bookstore.Repository.MainRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public BookRepository bookRepository(){
        return new BookRepository();
    }
    @Bean
    public AnotherBookRepository anotherBookRepository(){
        return new AnotherBookRepository();
    }

}
