package com.projects.hibernate9;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import jakarta.persistence.TypedQuery;

public class fetch {
    public static void main(String[] args) {
    	StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
    	Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
    	
    	SessionFactory factory = meta.buildSessionFactory();
    	Session session = factory.openSession();
    	TypedQuery query= session.createQuery("from questions");
    	List<questions> list=query.getResultList();
    	
    	Iterator<questions> itr=list.iterator();
    	while(itr.hasNext()) {
    		questions q= itr.next();
    		System.out.println("questionnames"+q.getqname());
    
    List<String> list2 = q.getAnswers();
    Iterator<String> itr1 = list2.iterator();
    while (itr1.hasNext()) {
        System.out.println("answers: " + itr1.next());
    }
}
    	session.close();
}
}
