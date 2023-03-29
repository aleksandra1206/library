/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Book {
    private int id;
    private String title;
    private String description;
    private List<Genre> genres;
    private List<Author> authors;
    private List<Member> evaluators;
    private List<Recommendation> inRecommendations;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Genre> getGenres() {
        return genres;
    }

    public void setGenres(List<Genre> genres) {
        this.genres = genres;
    }

    public List<Author> getAuthors() {
        return authors;
    }

    public void setAuthors(List<Author> authors) {
        this.authors = authors;
    }

    public List<Member> getEvaluators() {
        return evaluators;
    }

    public void setEvaluators(List<Member> evaluators) {
        this.evaluators = evaluators;
    }

    public Book(int id, String title, String description, List<Genre> genres, List<Author> authors, List<Member> evaluators, List<Recommendation> inRecommendations) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.genres = genres;
        this.authors = authors;
        this.evaluators = evaluators;
        this.inRecommendations = inRecommendations;
    }

    
    
    
    
    
}
