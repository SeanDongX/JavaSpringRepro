package demo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class SpringdemoApplication {

	@Autowired
	private BookRepository bookRepository;
	
    public static void main(String[] args) {
        SpringApplication.run(SpringdemoApplication.class, args);
    }
    
    @PostConstruct
    public void initData() throws Exception{
    	this.bookRepository.deleteAll();
		Book book = new Book("1");
    	book.setName("A Book");
    	book.setYear(1990);
    	book.setAuthor("Someone");
    	book.setPublisher("Publisher");
    	this.bookRepository.save(book);
    	
    	Book book2 = new Book("2");
    	book2.setName("Another Book");
    	book2.setYear(1991);
    	book2.setAuthor("Someone else");
    	book2.setPublisher("Publisher A");
    	this.bookRepository.save(book2);
    	
    }
}


