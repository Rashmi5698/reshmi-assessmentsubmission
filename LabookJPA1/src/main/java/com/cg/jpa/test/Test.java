package com.cg.jpa.test;

import com.cg.jpa.author.Author;
import com.cg.jpa.service.Service;
import com.cg.jpa.service.ServiceImpl;
public class Test {
	
	public static void main(String [] args) {
		
		Service service=new ServiceImpl();
		
		Author author=new Author();
		/*author.setAuthorid(106);
		author.setFirstName("Min");
		author.setMiddleName("Bts");
		author.setLastName("Yoongi");
		author.setPhno(7795441235L);
		
		service.addAuthor(author);*/
	
		
		//find
		author=service.findById(102);
		
		/*System.out.println("ID:"+author.getAuthorid());
		System.out.println("First Name:"+author.getFirstName());
		System.out.println("Last Name:"+author.getLastName());
		System.out.println("Middle Name:"+author.getMiddleName());
		System.out.println("Phno:"+author.getPhno());*/
		
		//update
		
		author.setFirstName("Jk");
		author.setLastName("Bunny");
		author.setMiddleName("bts");
		author.setPhno(7854693214L);
		
		service.UpdateAuthor(author);
		
		//service.RemoveAuthor(author);
		
		
		
		
	}

}
