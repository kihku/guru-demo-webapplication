package guru.demo.springwebdemo.domain;

import javax.persistence.*;
import java.util.Set;
@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstname;
    private String lastname;
    @ManyToMany(mappedBy = "authors")
    private Set<Book> Books;

    public Author() {
    }

    public Author(String firstname, String lastname, Set<Book> books) {
        this.firstname = firstname;
        this.lastname = lastname;
        Books = books;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Set<Book> getBooks() {
        return Books;
    }

    public void setBooks(Set<Book> books) {
        Books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
