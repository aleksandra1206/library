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
public class BookGenre {
    private boolean isMainGenre;
    private Book book;
    private Genre genre;

    public boolean isIsMainGenre() {
        return isMainGenre;
    }

    public void setIsMainGenre(boolean isMainGenre) {
        this.isMainGenre = isMainGenre;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public BookGenre(boolean isMainGenre, Book book, Genre genre) {
        this.isMainGenre = isMainGenre;
        this.book = book;
        this.genre = genre;
    }
    
    
}
