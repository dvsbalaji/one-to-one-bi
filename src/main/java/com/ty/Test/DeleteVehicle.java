package com.ty.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Charcy;


public class DeleteVehicle {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		
		
		Charcy charcy = entityManager.find(Charcy.class, 1) ;
		
		
		
		if(charcy != null) {
			entityTransaction.begin();
			entityManager.remove(charcy);
			entityTransaction.commit();
		}
		
		
	}
}
