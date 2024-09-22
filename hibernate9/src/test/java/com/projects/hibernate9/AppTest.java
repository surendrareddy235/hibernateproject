package com.projects.hibernate9;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppTest {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate9.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory factory=meta.buildSessionFactory();
    	Session session = factory.openSession();
    	Transaction t = session.beginTransaction();
    	
    	ArrayList<String> list1 = new ArrayList<String>();
    	list1.add("java is a language");
    	list1.add("java is a platform");
    	
    	ArrayList<String> list2 = new ArrayList<String>();
    	list2.add("servlet is an api");
    	list2.add("servlet is a lannguage");
    	
    	questions q1= new questions();
    	q1.setqname("what is java");
    	q1.setAnswers(list1);
    	
    	questions q2= new questions();
    	q2.setqname("what is servlet");
    	q2.setAnswers(list2);
    	
    	session.persist(q1);
    	session.persist(q2);
    	
    	t.commit();
    	session.close();
    	System.out.println("successfulll");
    }
}

