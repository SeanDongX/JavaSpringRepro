package demo;
import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Book {
	@Id
	private String id;
	private String name;
	private int year;
	private String author;
	private String publisher;
	
	public Book(@JsonProperty("id") String id){
		this.id = id;
	}
	
	public String getId()
	{
		return id;
	}
	
	public String setId(String id)
	{
		return this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getPublisher() {
		return publisher;
	}
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
}
