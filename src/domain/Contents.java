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
public class Contents {
    private Probability likeability;
    private Recommendation recommendation;
    private Book book;

    public Probability getLikeability() {
        return likeability;
    }

    public void setLikeability(Probability likeability) {
        this.likeability = likeability;
    }

    public Recommendation getRecommendation() {
        return recommendation;
    }

    public void setRecommendation(Recommendation recommendation) {
        this.recommendation = recommendation;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Contents(Probability likeability, Recommendation recommendation, Book book) {
        this.likeability = likeability;
        this.recommendation = recommendation;
        this.book = book;
    }
    
    
    
}
