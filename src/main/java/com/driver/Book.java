package com.driver;

public class Book {
    
     private int id;

     private String name;

     private String genre;
     
     private String author;

     public Book(int id, String name, String genre, String author){
          this.id = id;
          this.name = name;
          this.genre = genre;
          this.author = author;
     }
     public Book(String name, String genre, String author){
          this.id += 1;
          this.name = name;
          this.genre = genre;
          this.author = author;
     }
     public Book() {

     }

     public int getId() {
          return id;
     }

     public void setId(int id) {
          this.id = id;
     }

     public String getName() {
          return name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public String getGenre() {
          return genre;
     }

     public void setGenre(String genre) {
          this.genre = genre;
     }

     public String getAuthor() {
          return author;
     }

     public void setAuthor(String author) {
          this.author = author;
     }
}
