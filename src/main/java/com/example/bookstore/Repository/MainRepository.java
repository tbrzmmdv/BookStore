package com.example.bookstore.Repository;

import com.example.bookstore.Model.Book;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MainRepository {

     List<Book> getAllBooks();

}
