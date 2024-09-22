package com.projects.hibernate11;

import java.util.HashMap;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppTest {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate11.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory factory = meta.buildSessionFactory();
    	Session session = factory.openSession();
    	
    	Transaction t = session.beginTransaction();
    	
    	HashMap<String,String> map1 = new HashMap<String,String>();
    	map1.put("java is platform","surya");
    	map1.put("java is a language","anji");
    	
    	HashMap<String,String> map2 = new HashMap<String,String>();
    	map2.put("servlet is an api","venkateswara");
    	map2.put("servlet is an interface","pavani");
    	map2.put("servlet is a language", "ramana");
    	
    	questions q1 = new questions("what is java","surya",map1);
    	questions q2 = new questions("what is servlet","anjireddy",map2);
    	
    	session.persist(q1);
    	session.persist(q2);
    	
    	t.commit();
    	System.out.println("successfull");
    	
    }
}
