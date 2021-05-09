package com.cg.jpa.dao;

import com.cg.jpa.author.Author;

public interface Dao {
	
	public abstract void addAuthor(Author author);
	
	public abstract Author getById(int id);
	
	public abstract void UpdateAuthor(Author author);
	
	public abstract void RemoveAuthor(Author author);
}	
