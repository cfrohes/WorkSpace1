package com.Maven.ManyToOne;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	Department d = new Department();
    	d.setName("Tech Mahindra");
    	
    	Employee e1 = new Employee();
    	e1.setName("Chandann");
    	e1.setSalary(200000);
    	e1.setDepartment(d);
    	

    	Employee e2 = new Employee();
    	e2.setName("Xeroxx");
    	e2.setSalary(100000);
    	e2.setDepartment(d);
    	

    	Employee e3 = new Employee();
    	e3.setName("Mewwwoxc");
    	e3.setSalary(340000);
    	e3.setDepartment(d);
    	
    	List employeeList = new ArrayList();
    	employeeList.add(e1);
    	employeeList.add(e2);
    	employeeList.add(e3);
    	d.setEmployee(employeeList);
    	
    	SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction transaction  = session.beginTransaction();
    	
    	session.persist(d);
    	transaction.commit();
    	session.close();
    	factory.close();
    	
    	
    	
        
    }
}
