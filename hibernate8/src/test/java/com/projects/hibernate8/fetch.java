package com.projects.hibernate8;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import jakarta.persistence.TypedQuery;

public class fetch {
  public static void main(String[] args) {
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate8.cfg.xml").build();
	  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	  
	  SessionFactory factory = meta.buildSessionFactory();
	  Session session = factory.openSession();
	  
	  TypedQuery query = session.createQuery("from questions");
	  List<questions> list = query.getResultList(); 
	  
	  Iterator<questions> itr = list.iterator();
	  while (itr.hasNext()) {
		  questions q = itr.next();
		  System.out.println("question name" + q.getqname());
	  
	  List<String> list3 = q.getAnswer(); 
	  Iterator<String> itr3 = list3.iterator();
	  while(itr3.hasNext()) {
		  System.out.println(itr3.next());
	  }
	 }
	  session.close();
	  System.out.println("success");
  }
}
