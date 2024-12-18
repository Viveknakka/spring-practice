package com.demo.mine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.mine.config.AppConfig;

/**
 * Hello world!
 *
 */

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
//    	Desktop d=context.getBean(Desktop.class);
//    	d.compile();
    	
//    	Laptop l = (Laptop)context.getBean("laptop1");
//    	l.compile();
//    	Laptop l2= context.getBean("laptop2",Laptop.class);
//    	l2.compile();
//    	Desktop d=context.getBean("abc",Desktop.class);
//    	d.compile();
//    	Desktop d1=context.getBean("d1",Desktop.class);
//    	d1.compile();
    	
    	Desktop d1=context.getBean("desktop",Desktop.class);
    	
    	
    	
    	Allien a=context.getBean("allien",Allien.class);
    	a.code();
    	Desktop d=context.getBean("desktop",Desktop.class);
    	
    	
    	
    	
        //System.out.println( "Hello World!" );
//    	@SuppressWarnings("resource")
//		ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
//        Allien a = (Allien)context.getBean("allien1");
//        a.code();
//       // a.setAge(21);
//        System.out.println("age:"+a.getAge());
//        Laptop l = context.getBean(Laptop.class);
//        l.showName();
    }
}
