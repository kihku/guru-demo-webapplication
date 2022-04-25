package guru.demo.springwebdemo.repositories;

import guru.demo.springwebdemo.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
