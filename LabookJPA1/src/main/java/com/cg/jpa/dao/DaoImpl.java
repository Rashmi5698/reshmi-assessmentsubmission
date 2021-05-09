package com.cg.jpa.dao;

import javax.persistence.Persistence;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityManager;
import com.cg.jpa.author.Author;


public class DaoImpl implements Dao{
	EntityManagerFactory factory;
	EntityManager em;
	//create table and add
	public void addAuthor(Author author) {

		factory=Persistence.createEntityManagerFactory("postgres");
	 em=factory.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(author);
		em.getTransaction().commit();
		
	}
	
	//find by id read
	public Author getById(int id) {
		factory=Persistence.createEntityManagerFactory("postgres");
		em=factory.createEntityManager();
		Author au=em.find(Author.class,id);
		
		Author author=new Author();
		//author.setAuthorid(au.getAuthorid());
		author.setFirstName(au.getFirstName());
		author.setMiddleName(au.getMiddleName());
		author.setLastName(au.getLastName());
		author.setPhno(au.getPhno());
		author.setAuthorid(au.getAuthorid());
		return author;		
	}
	
	public void UpdateAuthor(Author author) {
	Author auth=em.find(Author.class,author.getAuthorid());
	em.getTransaction().begin();
		if(auth!=null) {
			
			
			auth.setFirstName(author.getFirstName());
			auth.setMiddleName(author.getMiddleName());
			auth.setLastName(author.getLastName());
			auth.setPhno(author.getPhno());
			
			em.getTransaction().commit();
		}
		
	}
	
	public void RemoveAuthor(Author author) {
	Author auth=em.find(Author.class, author.getAuthorid());
	em.getTransaction().begin();
	if(auth!=null) {
		em.remove(auth);
		em.getTransaction().commit();
		
	}
	}
	
	
			
		
	
}
