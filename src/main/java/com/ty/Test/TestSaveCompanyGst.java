package com.ty.Test;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.dto.Company;
import com.ty.dto.Gst;

public class TestSaveCompanyGst {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas") ;
		EntityManager entityManager = entityManagerFactory.createEntityManager() ;
		EntityTransaction entityTransaction = entityManager.getTransaction() ;
		
		Company company = new Company() ;
		company.setName("tyy");
		company.setPhone(9000000000l);
		company.setWeb("tyy.com");
		
		Gst gst = new Gst() ;
		gst.setGstNumber("GST@TYYCOM");
		gst.setState("karnataka");
		gst.setCountry("india");
		
		company.setGst(gst);
		gst.setCompany(company);
		
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(gst);
		entityTransaction.commit();
		
	}
	
}
