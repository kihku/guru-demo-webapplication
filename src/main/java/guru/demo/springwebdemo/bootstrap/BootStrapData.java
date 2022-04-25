package guru.demo.springwebdemo.bootstrap;

import guru.demo.springwebdemo.domain.Author;
import guru.demo.springwebdemo.domain.Book;
import guru.demo.springwebdemo.repositories.AuthorRepository;
import guru.demo.springwebdemo.repositories.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric","Evan");
        Book introduction_to_cs = new Book("introduction to CS", "18125074");
        eric.getBooks().add(introduction_to_cs);
        introduction_to_cs.getAuthors().add(eric);
        authorRepository.save(eric);
        bookRepository.save(introduction_to_cs);

        System.out.println("number of books: "+ bookRepository.count());
    }
}
