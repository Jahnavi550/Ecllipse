package Hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class TestEmployee {

public static void main(String[] args) {
// TODO Auto-generated method stub
//creating configuration object
		SessionFactory sessionFactory = new Configuration().configure("hib.cfg.xml").buildSessionFactory();
        Session session = sessionFactory.openSession();  
         Transaction t = session.beginTransaction();  
           
          Employee e1=new Employee();    
             e1.setId(4);    
             e1.setFirstName("janu");    
             e1.setLastName("mj");    
         
        session.save(e1);  
        t.commit();  
        System.out.println("successfully saved");    
        sessionFactory.close();  
         session.close();    
}

}