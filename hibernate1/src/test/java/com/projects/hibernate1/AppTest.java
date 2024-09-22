package com.projects.hibernate1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class AppTest {
  public static void main(String []args) {
	  
	  student s = new student();
	  s.setRollno(102);
	  s.setName("anji");
	  s.setAddress("nudurupadu");
	  
	  Configuration con = new Configuration().configure().addAnnotatedClass(student.class);
	  
	  SessionFactory sf = con.buildSessionFactory();
	  Session session = sf.openSession();
	  
	  session.save(s);
	  session.beginTransaction().commit();
	  session.close();
	 
	  
  }
}
