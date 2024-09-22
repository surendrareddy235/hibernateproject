package com.projects.hibernate7;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppTest {
 public static void main(String[] args) {
	 StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate7.cfg.xml").build(); 
	 Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
	 SessionFactory factory = meta.buildSessionFactory();
	 Session session = factory.openSession();
	 
	 Transaction t = session.beginTransaction();
	 
	 employee e1 = new employee();
	 e1.setname("surya");
	 
	 reg_emp e2 = new reg_emp();
	 e2.setname("anji");
	 e2.setsalary(10000);
	 e2.setbonus(500);
	 
	 partime_emp e3 = new partime_emp();
	 e3.setname("venkataswara");
	 e3.setpay_as_time(500);
	 e3.setcontract_duration("1hour");
	 
	 session.persist(e1);
	 session.persist(e2);
	 session.persist(e3);
	 
	 t.commit();
	 session.close();
 }
}
