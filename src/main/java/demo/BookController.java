package demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	
	@RequestMapping("/book/{id}")
    public Book get(@PathVariable("id") int id) {
    	Book book = new Book();
    	book.Id = id;
    	book.Name = "A Book";
    	book.Year = 1990;
    	book.Author = "Someone";
    	
    	return book;
    }
	
}
