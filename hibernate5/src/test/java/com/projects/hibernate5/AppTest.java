package com.projects.hibernate5;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class AppTest {
	public static void main(String []args) {
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate5.cfg.xml").build();
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		SessionFactory factory = meta.getSessionFactoryBuilder().build();
		Session session = factory.openSession();
		
		Transaction t = session.beginTransaction();
		
		employee e1 = new employee();
		e1.setName("surya");
		
		reg_emp e2 = new reg_emp();
		e2.setName("anjireddy");
		e2.setSalary(10000);
		e2.setBonus(500);
		
		partime_emp e3 = new partime_emp();
		e3.setName("venkateswarareddy");
		e3.setPay_as_hours(400);
		e3.setContract_duration("2hours");
		
		session.persist(e1);
		session.persist(e2);
		session.persist(e3);
		
		t.commit();
		session.close();
		System.out.println("data enter successfullly");
	}
}
    
