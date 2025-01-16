package com.abc.bookservice.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

@Entity
@Table(name="author_tbl")
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)	
	private int authorId;
	private String firstName;
	private String lastName;
	private String email;
	
	@OneToMany(mappedBy = "author")
	private List<Book> booksWritten;
}
