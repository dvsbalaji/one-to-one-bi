package com.ty.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Pan;
import com.ty.dto.Person;

public class TestGetPan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		
		
		Pan pan =  entityManager.find(Pan.class, 1) ;
		System.out.println("pan address "+pan.getAddress());
		System.out.println("pan number  "+pan.getPanNumber());
		
		Person person = pan.getPerson();
		System.out.println("person name  "+person.getName());
		System.out.println("person mail  "+person.getEmail());
		System.out.println("person phone "+person.getPhone());
	}
}
