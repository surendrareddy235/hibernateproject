package com.projects.hibernate4;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class AppTest {
   public static void main(String []args) {
       StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate4.cfg.xml").build();
       Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
       SessionFactory factory = meta.getSessionFactoryBuilder().build();
       Session session = factory.openSession();
       
       Transaction t = session.beginTransaction();
       
       employee e1 = new employee();
       e1.setName("surya");  
       
       regular_emp e2 = new regular_emp();
       e2.setName("anjireddy");
       e2.setSalary(10000);
       e2.setBonus(500);
       
       temp_emp e3 = new temp_emp();
       e3.setName("ramana");
       e3.setPay_as_hours(1000);
       e3.setContract_duration("2hours");
       
       session.persist(e1);
       session.persist(e2);
       session.persist(e3);
       
       t.commit();
       session.close();
       System.out.println("uploaded successfully");
   }
}
