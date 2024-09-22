package com.projects.hibernate10;



import java.util.HashSet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppTest {
	public static void main(String[] args) {
		
  StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().configure("hibernate10.cfg.xml").build();
  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
  
  SessionFactory factory = meta.buildSessionFactory();
  Session session = factory.openSession();
  
   Transaction t = session.beginTransaction();
   
   HashSet<String> set1= new HashSet<String>();
   set1.add("java is a platform");
   set1.add("java is a language");
   
   HashSet<String> set2= new HashSet<String>();
   set2.add("servlet is an api");
   set2.add("servlet is an application");
   
   questions q = new questions();
   q.setQname("what is java");
   q.setAnswers(set1);
   
   questions q1= new questions();
   q1.setQname("what is servlet");
   q1.setAnswers(set2);
   
   session.persist(q);
   session.persist(q1);
   
   t.commit();
   session.close();
   System.out.println("successfull");
}
}