package com.projects.hibernate3;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppTest {
   

public static void main(String[] args) {
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
	  Metadata Meta = new MetadataSources(ssr).getMetadataBuilder().build();
	  SessionFactory factory =Meta.getSessionFactoryBuilder().build();
	  Session session =factory.openSession();
	  Transaction t = session.beginTransaction();
	  
	  employee e1 = new employee();
	  e1.setname("surya");
	  
	  regular_employee e2 = new regular_employee();
	  e2.setname("anjireddy");
	  e2.setSalary(10000);
	  e2.setBonus(500);
	  
	  partime_employee e3 = new partime_employee();
	  e3.setname("kranthi");
	  e3.setPay_per_hour(1000);
	  e3.setContract_duration("2hours");
	  
	  session.persist(e1);
	  session.persist(e2);
	  session.persist(e3);
	  
	  t.commit();
	  session.close();
	  
	  System.out.println("uploaded successfully");
   }
}
