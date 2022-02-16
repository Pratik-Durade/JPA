package com.mondee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {

	public static void main(String[] args) {
	// 	System.out.println("Hello World...");
		
		Student s1=new Student();
		s1.setSid(5);
		s1.setSname("Rohit");
		s1.setTech("Java");
		
		
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu"); // persistence-unit name
		EntityManager em= emf.createEntityManager();
		
		
		em.getTransaction().begin();;
		em.persist(s1);
		System.out.println(s1);
		
		em.getTransaction().commit();
		
//		Student s=em.find(Student.class,1);
//		System.out.println(s);
		
	}

}
