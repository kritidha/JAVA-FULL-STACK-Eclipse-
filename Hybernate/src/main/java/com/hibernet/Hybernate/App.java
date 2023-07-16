package com.hibernet.Hybernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    
        System.out.println( "Project sarted" );
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory =cfg.buildSessionFactory();
        Student st= new Student();
        st.setId(101);
        st.setCity("Delhi");
        st.setName("Kriti");
        
        System.out.println(st);
        
        
        Address ad= new Address();
        ad.setStreet("street1");
        ad.setCity("DELHI");
        ad.setOpen(true);
        ad.setAddedDate(new Date());
        ad.setX(12323.34);
        
        FileInputStream fis= new FileInputStream("src/main/java/id image.jpeg");
        byte[] data= new byte[fis.available()];
        fis.read(data);
        ad.setImage(data);
        
       Session session= factory.openSession();
    	Transaction tx=	session.beginTransaction();
       
       session.save(st);
       session.save(ad);
       
       
       session.getTransaction().commit();
       
       session.close();
       
       System.out.println("done");
       
       }
}
