package com.ty.Test;

import javax.persistence.Embeddable;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Vehicle;

public class TestGetVehicle {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		
		Vehicle vehicle = entityManager.find(Vehicle.class, 3) ;
		
		if(vehicle != null) {
			System.out.println("vehicle name  : "+vehicle.getName());
			System.out.println("vehicle price : "+vehicle.getCost());
			System.out.println("charcy number : "+vehicle.getCharcy().getChercyNumber());
			System.out.println("vehicle type  : "+vehicle.getCharcy().getType());
		}
		
		
		
		
		
	}
}
