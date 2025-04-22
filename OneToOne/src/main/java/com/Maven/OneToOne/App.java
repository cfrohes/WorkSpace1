package com.Maven.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	static  SessionFactory factory;
    public static void main(String[] args) {
    	//STEP 1 - LOADING THE CONFIGURATION.. 
   Configuration configuration = new Configuration();
   configuration.configure("hibernate.cfg.xml");
   
   //STEP 2 - BUILD THE SESSION FACTORY..
   SessionFactory sessionFactory = configuration.buildSessionFactory();
   
   //STEP 3 - OPEN SESSION..
   Session sesssion = sessionFactory.openSession();
   
   //STEP 4 - BEGIN TRANSACTION..
   Transaction transaction = sesssion.beginTransaction();
   
   address a = new address("Bangalore", 230786);
   student s = new student("Chandan", 90, a);
   //STEP 5 - PERFORM CRUD OPERATION..
   sesssion.persist(s);
   
   //STEP 6 -  COMMIT TRANSACTION..
   transaction.commit();
   
   //STEP 7 - CLOSE SESSION..
   sesssion.close();
   
   //STEP 8 - CLOSE SESSIONFACTORY..
   sessionFactory.close();
    	

}
}
