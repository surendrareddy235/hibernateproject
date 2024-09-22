package com.projects.hibernate10;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import jakarta.persistence.TypedQuery;

public class fetch {
  public static void main(String[] args) {
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate10.cfg.xml").build();
	  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	  
	  SessionFactory factory = meta.buildSessionFactory();
	  Session session = factory.openSession();
	  
	  	TypedQuery query = session.createQuery("from questions");
	  	List<questions> list1 = query.getResultList();
	  	Iterator<questions> itr = list1.iterator();
	  	while(itr.hasNext()) {
	  		questions q = itr.next();
	  		System.out.println("question is:"+q.getQname());
	  		
	  		Set<String> set1=q.getAnswers();
	  		Iterator<String> itr1 = set1.iterator();
	  		while(itr1.hasNext()) {
	  			System.out.println("answers are:"+itr1.next());
	  		}
	  	}
	  	session.close();
	  	System.out.println("successfull");
  }
}
