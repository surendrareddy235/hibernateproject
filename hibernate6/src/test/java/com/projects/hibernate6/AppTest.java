package com.projects.hibernate6;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;


public class AppTest {
  public static void main(String[]args) {
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate6.cfg.xml").build();
	  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	  
	  SessionFactory factory = meta.buildSessionFactory();
	  Session session = factory.openSession();
	  Transaction t = session.beginTransaction();
	  employee e1 = new employee();
	  e1.setName("surya");
	  
	  reg_emp e2 = new reg_emp();
	  e2.setName("anjireddy");
	  e2.setSalary(10000);
	  e2.setBonus(500);
	  
	  partime_emp e3 = new partime_emp();
	  e3.setPay_as_hours(500);
	  e3.setContract_duration("2hours");
	  
	  session.persist(e1);
	  session.persist(e2);
	  session.persist(e3);
	  
	  t.commit();
	  session.close();
	  System.out.println("uploaded successfully");
  }
}
