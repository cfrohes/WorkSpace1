package com.Maven.FifthMavenProject;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
	public static SessionFactory factory;
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();		while(true) {
		System.out.println("Enter the One Choice for the Following CRUD Operation");
		System.out.println("PRESS --> 1 <-- TO  CREATE");
		System.out.println("PRESS --> 2 <-- TO  READ");
		System.out.println("PRESS --> 3 <-- TO  UPDATE");
		System.out.println("PRESS --> 4 <-- TO  DELETE");
		System.out.println("PRESS --> OTHER NUMBER  <-- TO  STOP");
		int choice = sc.nextInt();

		switch(choice) {
		case 1:createUser();
			break;
		
		case 2:readUser();
			break;
			
		case 3:updateUser();
			break;
			
		case 4:deleteUser();
			break;
		
		default:{
			System.out.println("THANK YOU FOR USING FROHES EMS");
			return;
		}
		}
		}

    }
    
    public static void createUser() {
    	System.out.println("Enter NAME|SALARY|PASSWORD|AGE ");
    	String name = sc.next();
    	int salary = sc.nextInt();
    	int password = sc.nextInt();
    	int age = sc.nextInt();
    	
    	Employee employee = new Employee(name, salary, password, age);
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	session.persist(employee);
    	transaction.commit();
    	session.close();
    }
    
    public static void readUser() {
    	System.out.println("ENTER THE EMPLOYEE ID->");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee e = (Employee) session.get(Employee.class, id);
    	if(e != null) {
    	System.out.println(e);
    	transaction.commit();
    	session.close();
    	}else {
    		System.out.println("YOU ENTERED INVALID EMPLOYEE ID..<");
    	}
    
    	
    }

    public static void updateUser() {
    	System.out.println("ENTER EMPLOYEE ID TO UPDATE..");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee e = (Employee) session.get(Employee.class, id);
    	if(e != null) {
    		System.out.println("PRESS 'A' TO UPDATE NAME");
    		System.out.println("PRESS 'B' TO UPDATE SALARY");
    		System.out.println("PRESS 'C' TO UPDATE PASSWORD");
    		System.out.println("PRESS 'D' TO UPDATE AGE");
    		
    		char choice = sc.next().charAt(0);
    		System.out.println("ENTER NEW DATA.");
    		switch(choice) {
    		case 'A':e.setName(sc.next());
    		break;
    		case 'B':e.setSalary(sc.nextInt());
    		break;
    		case 'C':e.setPassword(sc.nextInt());
    		break;
    		case 'D':e.setAge(sc.nextInt());
    		break;
    		default:{
    			e.setSalary(sc.nextInt());
    			System.out.println("YOU ENTER THE WRONG CHOICE...");
    			return;
    		}
    		}
    		
    		
    	}
    	session.merge(e);
    	transaction.commit();
    	session.close();
    	
    }

    public static void deleteUser() {
    	System.out.println("ENTER THE EMPLOYEE ID TO DELETE..");
    	int id = sc.nextInt();
    	Session session = factory.openSession();
    	Transaction transaction = session.beginTransaction();
    	Employee e = (Employee) session.get(Employee.class, id);
    	if(e != null) {
    	System.out.println(e);
    	session.remove(e);
    	
    	transaction.commit();
    	session.close();
    	} else {
    		System.out.println("YOU ENTERED INVALID EMPLOYEE ID..<");
    	}
    
	
    }
    
}
