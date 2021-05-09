package com.cg.jpa.service;

import com.cg.jpa.author.Author;
import com.cg.jpa.dao.Dao;
import com.cg.jpa.dao.DaoImpl;

public class ServiceImpl implements Service {
	
	private Dao dao=new DaoImpl();
	
	public void addAuthor(Author author) {
		dao.addAuthor(author);
	}
	
	public Author findById(int id) {
		Author author=dao.getById(id);
		return author;
		
	}
	
	public void UpdateAuthor(Author author) {
		dao.UpdateAuthor(author);
	}
	
	public void RemoveAuthor(Author author) {
		dao.RemoveAuthor(author);
	}


}
