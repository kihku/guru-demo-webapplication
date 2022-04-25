package guru.demo.springwebdemo.repositories;

import guru.demo.springwebdemo.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
