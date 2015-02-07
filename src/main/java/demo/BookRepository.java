package demo;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface BookRepository extends MongoRepository<Book, String> {

    public List<Book> findByPublisher(String publisher);
    
}
