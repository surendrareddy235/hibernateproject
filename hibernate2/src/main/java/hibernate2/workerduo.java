package hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class workerduo {
	   public static int workersdata (worker w) {
		   int i = 0;
		   StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate2.cfg.xml").build();
		   Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build(); 
		   SessionFactory factory = meta.getSessionFactoryBuilder().build();  
		   Session session = factory.openSession();  
		   Transaction t = session.beginTransaction();   
		     
		   i=(Integer)session.save(w);    
		     
		   t.commit();    
		   session.close();    
		       
		   return i;    
	   }
   }

