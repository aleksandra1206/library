/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

/**
 *
 * @author Korisnik
 */
public class BookAuthor {
    private boolean hasCoauthors;
    private Book book;
    private Author author;

    public boolean isHasCoathors() {
        return hasCoauthors;
    }

    public void setHasCoathors(boolean hasCoauthors) {
        this.hasCoauthors = hasCoauthors;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public BookAuthor(boolean hasCoauthors, Book book, Author author) {
        this.hasCoauthors = hasCoauthors;
        this.book = book;
        this.author = author;
    }
    
    
    
}
