package guru.demo.springwebdemo.repositories;

import guru.demo.springwebdemo.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher,Long> {
}
