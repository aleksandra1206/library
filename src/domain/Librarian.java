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
public class Librarian {
    private int librarianId;
    private String librarianName;
    private String librarianLastName;
    private List<Member> recommendees
            ;

    public int getLibrarianId() {
        return librarianId;
    }

    public void setLibrarianId(int librarianId) {
        this.librarianId = librarianId;
    }

    public String getLibrarianName() {
        return librarianName;
    }

    public void setLibrarianName(String librarianName) {
        this.librarianName = librarianName;
    }

    public String getLibrarianLastName() {
        return librarianLastName;
    }

    public void setLibrarianLastName(String librarianLastName) {
        this.librarianLastName = librarianLastName;
    }

    public Librarian(int librarianId, String librarianName, String librarianLastName) {
        this.librarianId = librarianId;
        this.librarianName = librarianName;
        this.librarianLastName = librarianLastName;
    }
    
    
}
