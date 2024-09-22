package com.projects.hibernate8;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppTest {
    public static void main(String[]args) {
    	StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate8.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory factory = meta.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction t = session.beginTransaction();
    	
    	ArrayList<String> list1=new ArrayList<String>();
    	list1.add("java is a programming langwage");
    	list1.add("java is a platform indipendent");
    	
    	ArrayList<String>list2 = new ArrayList<String>();
    	list2.add("servlet is an api");
    	list2.add("servlet is an java api");
    	
    	questions q1 = new questions();
    	q1.setqname("what is java");
    	q1.setAnswer(list1);
    	
    	questions q2 = new questions();
    	q2.setqname("what is servlet");
    	q2.setAnswer(list2);
    	
    	session.persist(q1);
    	session.persist(q2);
    	
    	t.commit();
    	session.close();
    	System.out.println("success");
    }
}
