package com.projects.hibernate11;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
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
	  StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate11.cfg.xml").build();
	  Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	  
	  SessionFactory factory = meta.buildSessionFactory();
	  Session session = factory.openSession();
	  
	  TypedQuery query =session.createQuery("from questions");
	  List<questions> list = query.getResultList();
	  
	  Iterator<questions> itr = list.iterator();
	  while(itr.hasNext()) {
		  questions q1 = itr.next();
		  System.out.println("the question no:"+q1.getid());
		  System.out.println("question is:"+q1.getqname());
		  System.out.println("answers..");
		  Map<String,String> map = q1.getanswers();
		  Set<Map.Entry<String,String>> set = map.entrySet();
		  
		  Iterator<Map.Entry<String,String>> itranswers = set.iterator();
		  while(itranswers.hasNext()) {
			  Map.Entry<String,String> entry = (Map.Entry<String,String>)itranswers.next();
			  System.out.println("answers:"+entry.getKey());
			  System.out.println("posted by:"+entry.getValue());
		  }
	  }
	  session.close();
  }
}
