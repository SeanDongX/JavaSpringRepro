package demo;


import java.util.List;

import org.springframework.beans.factory.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HBookController {
	
	@Autowired
	private HBookRepository repository;
	
	@RequestMapping("/hbook/{id}")
    public HBook get(@PathVariable("id") int id) {
    	return this.repository.findOne(id);
    }
	
	@RequestMapping("/hbook/")
    public List<HBook> get() {
		return this.repository.findAll();
    }
	
	@RequestMapping(value = "/hbook/{id}", method = RequestMethod.POST)
    public void update(@PathVariable("id") int id, @RequestBody HBook book) throws Exception {
		HBook existingBook = this.repository.findOne(id);
		if ( existingBook!= null) {
			book.setId(id);
			this.repository.save(book);
		}
		else {
			throw new Exception();
		}
    }
	
	@RequestMapping(value = "/hbook/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") int id) {
		this.repository.delete(id);
    }
	
	@RequestMapping(value ="/hbook/", params={"authorHas"})
    public List<HBook> getByAuthorLike(@RequestParam("authorHas") String author) {
		return this.repository.findByAuthorLike(author);
    }
	
	@RequestMapping(value ="/hbook/", params={"author", "publisher"})
    public List<HBook> getByAuthorAndPublisher(@RequestParam("author") String author, @RequestParam("publisher") String publisher) {
		return this.repository.findByAuthorAndPublisher(author, publisher);
    }
}