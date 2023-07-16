package com.springci;
import org.springframework.beans.factory.BeanFactory;  
import org.springframework.beans.factory.xml.XmlBeanFactory;  
import org.springframework.core.io.ClassPathResource;  
import org.springframework.core.io.Resource;  
  

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) {  
		
	    Resource resource=new ClassPathResource("com/springci/ApplicationContext.xml");  
	    BeanFactory factory=new XmlBeanFactory(resource);  
	      
	    Student student=(Student)factory.getBean("studentbean");  
	    student.displayInfo();  
	}  
}
