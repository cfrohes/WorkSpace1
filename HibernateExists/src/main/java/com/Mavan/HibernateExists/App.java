package com.Mavan.HibernateExists;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
//    	ucucbank s = new ucucbank(109, "harishandra", 49000);
//       
//    	//STEP 1 - LOADING THE CONFIGURATION.. 
//   Configuration configuration = new Configuration();
//   configuration.configure("hibernate.cfg.xml");
//   
//   //STEP 2 - BUILD THE SESSION FACTORY..
//   SessionFactory sessionFactory = configuration.buildSessionFactory();
//   
//   //STEP 3 - OPEN SESSION..
//   Session sesssion = sessionFactory.openSession();
//   
//   //STEP 4 - BEGIN TRANSACTION..
//   Transaction transaction = sesssion.beginTransaction();
//   
//   //STEP 5 - PERFORM CRUD OPERATION..
//   sesssion.persist(s);
//   
//   //STEP 6 -  COMMIT TRANSACTION..
//   transaction.commit();
//   
//   //STEP 7 - CLOSE SESSION..
//   sesssion.close();
//   
//   //STEP 8 - CLOSE SESSIONFACTORY..
//   sessionFactory.close();
    	
    	
    	
    	
    	Configuration configuration = new Configuration();
    	configuration.configure("hibernate.cfg.xml");
    	
    	SessionFactory sessionFactory = configuration.buildSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
    	Transaction transaction = session.beginTransaction();
    	
    	System.out.println("Enter the id to fetch the details..");
    	Scanner sc = new Scanner(System.in);
    	int id = sc.nextInt();
    	Student student = session.get(Student.class, id);
    	if(student != null) {
    		System.out.println(student);
    		System.out.println("DElETED>>>");
    		session.remove(student);
    	} else {
    		System.out.println("Enter the VAlid ID---->");
    	}
    	
    	transaction.commit();
    	session.close();
    	sessionFactory.close();
    	
    	sc.close();
    	
   
    }
}
