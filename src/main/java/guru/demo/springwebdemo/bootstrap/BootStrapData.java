package guru.demo.springwebdemo.bootstrap;

import guru.demo.springwebdemo.domain.Author;
import guru.demo.springwebdemo.domain.Book;
import guru.demo.springwebdemo.domain.Publisher;
import guru.demo.springwebdemo.repositories.AuthorRepository;
import guru.demo.springwebdemo.repositories.BookRepository;
import guru.demo.springwebdemo.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Publisher publisher = new Publisher();
        publisher.setName("Kim dong");
        publisher.setCity("HCM city");
        publisher.setState("District 1");
        publisherRepository.save(publisher);


        Author eric = new Author("Eric","Evan");
        Book introduction_to_cs = new Book("introduction to CS", "18125074");
        eric.getBooks().add(introduction_to_cs);
        introduction_to_cs.getAuthors().add(eric);
        introduction_to_cs.setPublisher(publisher);
        publisher.getBooks().add(introduction_to_cs);
        authorRepository.save(eric);
        bookRepository.save(introduction_to_cs);
        publisherRepository.save(publisher);



        System.out.println("number of books: "+ bookRepository.count());
        System.out.println("Publisher number of books " + publisher.getBooks().size());


    }
}
