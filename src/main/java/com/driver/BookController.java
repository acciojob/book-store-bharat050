package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {
    @Autowired
    BookService bookService;

    // One example controller, make the rest by yourself
    @PostMapping("/create-book")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        Book newbook = bookService.createBook(book);
        return new ResponseEntity<>(newbook, HttpStatus.CREATED);
    }

    @GetMapping("/get-book-by-id/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable("id") String id){
        Book newBook = bookService.findBookById(id);
        return new ResponseEntity<>(newBook, HttpStatus.FOUND);
    }

    @GetMapping("/get-all-books")
    public ResponseEntity getAllBooks(){
        List<Book> list = bookService.findAllBooks();
        return new ResponseEntity<>(list, HttpStatus.FOUND);
    }

    @GetMapping("/get-books-by-author")
    public ResponseEntity getBookByAuthor(@RequestParam String author){
        List<Book> list = bookService.findBooksByAuthor(author);
        return new ResponseEntity<>(list, HttpStatus.FOUND);
    }
    @GetMapping("/get-books-by-genre")
    public ResponseEntity getBooksByGenre(@RequestParam String genre){
        List<Book> list = bookService.findBooksByGenre(genre);
        return new ResponseEntity<>(list, HttpStatus.FOUND);
    }
    @DeleteMapping("/delete-book-by-id/{id}")
    public ResponseEntity deleteBookById(@PathVariable("id") String id){
        bookService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
    @DeleteMapping("/delete-all-books")
    public ResponseEntity deleteAllBooks(){
        bookService.deleteAllBooks();
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
