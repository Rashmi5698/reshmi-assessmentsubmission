package com.cg.jpa.service;

import com.cg.jpa.author.Author;

public interface Service {
	
	public abstract void addAuthor(Author author);
	
	public abstract Author findById(int id);
	
	public abstract void UpdateAuthor(Author author);
	
	public abstract void RemoveAuthor(Author author);

}
