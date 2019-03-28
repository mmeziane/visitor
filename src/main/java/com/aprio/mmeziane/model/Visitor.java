package com.aprio.mmeziane.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name= "visitor")
public class Visitor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "firstname")
	private String firstname;
	
	@Column(name = "lasttname")
	private String lastname;
	
	
	
//	@ManyToMany(cascade=CascadeType.ALL)
//	@JoinTable(name = "visitor_book", joinColumns=@JoinColumn(name = "visitor_id"), inverseJoinColumns=@JoinColumn(name = "book_id"))
//	private Set<Book> books;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
//	public Set<Book> getBooks() {
//		return books;
//	}
//	public void setBooks(Set<Book> books) {
//		this.books = books;
//	}
	
	
	
	
	

}
