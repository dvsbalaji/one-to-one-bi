package com.ty.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class TestGetGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		
		Gst gst = entityManager.find(Gst.class, 1);
		System.out.println("gst numbet  : " + gst.getGstNumber());
		System.out.println("gst state  : " + gst.getState());
		System.out.println("gst country  : " + gst.getCountry());
		
		Company company = gst.getCompany() ;
		System.out.println("company name " + company.getName());
		System.out.println("company web " + company.getWeb());
		System.out.println("company phone " + company.getPhone());

		
	}
}
