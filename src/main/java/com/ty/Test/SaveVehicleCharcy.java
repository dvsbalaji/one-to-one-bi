package com.ty.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Charcy;
import com.ty.dto.Vehicle;

public class SaveVehicleCharcy {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Charcy charcy = new Charcy() ;
		charcy.setChercyNumber("indi1234456789ka");
		charcy.setType("rolly");
		
		Vehicle vehicle = new Vehicle() ;
		vehicle.setName("phantam");
		vehicle.setCost(199000000);
		vehicle.setCharcy(charcy);
		
		entityTransaction.begin();
		entityManager.persist(vehicle);
		entityTransaction.commit();
	}
}
