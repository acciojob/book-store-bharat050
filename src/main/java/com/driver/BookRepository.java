package com.driver;
import java.util.*;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    Map<Integer, Book> db = new HashMap<>();

    public BookRepository(){

    }

    public Book save(Book book){
        db.put(book.getId(), book);
        return book;
    }

    public Book findBookById(int id){
        Book book = db.get(id);
        return book;
    }

    public List<Book> findAll(){
        List<Book> answer = new ArrayList<>();
        for(int key: db.keySet()){
            answer.add(db.get(key));
        }
        return answer;
    }

    public void deleteBookById(int id){
        for(int key: db.keySet()){
            if(key == id) db.remove(id);
        }
    }

    public void deleteAll(){
        db.clear();
    }

    public List<Book> findBooksByAuthor(String author){
        List<Book> ans = new ArrayList<>();
        for(int key: db.keySet()){
            Book book = db.get(key);
            if(book.getAuthor().equals(author)) ans.add(book);
        }
        return ans;
    }

    public List<Book> findBooksByGenre(String genre){
        List<Book> ans = new ArrayList<>();
        for(int key: db.keySet()){
            Book book = db.get(key);
            if(book.getGenre().equals(genre)) ans.add(book);
        }
        return ans;
    }
}
