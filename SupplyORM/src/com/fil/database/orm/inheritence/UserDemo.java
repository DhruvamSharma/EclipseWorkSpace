package com.fil.database.orm.inheritence;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UserDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("SupplyORM");
		EntityManager entityManager = factory.createEntityManager();
		System.out.println("hhhh");

	}

}
