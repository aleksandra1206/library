/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Korisnik
 */
public class Member {
    private int Id;
    private String Name;
    private String LastName;
    private Date dateOfMembership;
    private List<Book> evaluatedBooks;
    private List<Librarian> recommenders;
    private List<Recommendation> theirRecommendations;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public List<Book> getEvaluatedBooks() {
        return evaluatedBooks;
    }

    public void setEvaluatedBooks(List<Book> evaluatedBooks) {
        this.evaluatedBooks = evaluatedBooks;
    }
    
    

    
    
}
