package com.demo.mine;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	@SuppressWarnings("resource")
		ApplicationContext context= new ClassPathXmlApplicationContext("java/spring.xml");
    	Allien a=context.getBean(Allien.class);
    	a.code();
    }
}
