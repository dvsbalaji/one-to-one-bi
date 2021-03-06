package com.ty.Test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestSavePersonPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Person person =  new Person() ;
		person.setName("bunny");
		person.setEmail("bunny@mail.com");
		person.setPhone(7001444676l);
		
		Pan pan = new Pan() ;
		pan.setAddress("btm layout banglore");
		pan.setPanNumber("Pky6587blr");
		
		
		pan.setPerson(person);
		person.setPan(pan);
		
		entityTransaction.begin();
		entityManager.persist(person);
		entityManager.persist(pan);
		entityTransaction.commit(); 
		
	}
}
