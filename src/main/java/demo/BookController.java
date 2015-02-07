package demo;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@Autowired
	private BookRepository repository;
	
	@RequestMapping("/book/{id}")
    public Book get(@PathVariable("id") String id) {
    	return this.repository.findOne(id);
    }
	
	@RequestMapping("/book/")
    public List<Book> get() {
		return this.repository.findAll();
    }
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.POST)
    public void update(@PathVariable("id") String id, @RequestBody Book book) throws Exception {
		Book existingBook = this.repository.findOne(id);
		if ( existingBook!= null)
		{
			book.setId(id);
			this.repository.save(book);
		}
		else
		{
			throw new Exception();
		}
    }
	
	@RequestMapping(value = "/book/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") String id) {
		this.repository.delete(id);
    }
	
}