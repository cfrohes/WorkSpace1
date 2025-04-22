package com.Maven.OneToMany;

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
       Student student = new Student("Chandan", "chandan@gmail.fom", 98634789);
       Courses course1 = new Courses("HTML");
       Courses course2 = new Courses("JAVA");
       
       course1.setStudent(student);
       course2.setStudent(student);
       List courseList = new ArrayList();
       courseList.add(course1);
       courseList.add(course2);
       student.setCourses(courseList);
       
       SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
       Session session = factory.openSession();
       Transaction transaction  = session.beginTransaction();
       session.persist(student);
       transaction.commit();
       session.close();
       factory.close();
       
    }
}

