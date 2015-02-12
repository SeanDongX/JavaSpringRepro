package demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Book")
public class HBook {
	@Id
	@Column(name="id")
	@GeneratedValue
	private int id;
	private String name;
	private int year;
	private String author;
	private String publisher;
	
	public HBook() {
		
	}
	
	public HBook(@JsonProperty("id") int id) {
		this.id = id;
	}
	
	public int getId()
	{
		return id;
	}
	
	public int setId(int id)
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
