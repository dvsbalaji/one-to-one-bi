package com.ty.dto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestRemovePan {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Pan pan = entityManager.find(Pan.class, 1) ;
		entityTransaction.begin();
		entityManager.remove(pan.getPerson());
		entityManager.remove(pan);
		entityTransaction.commit();
		
	}
}
