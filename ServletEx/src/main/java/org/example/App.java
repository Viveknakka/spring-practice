package org.example;

import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

/**
 * Hello world!
 *
 */
public class App 
{

    public static void main( String[] args ) throws LifecycleException {
        System.out.println( "Hello World!" );
        Tomcat tm = new Tomcat();
        tm.setPort(8082);
        Context context = tm.addContext("",null);
        Tomcat.addServlet(context,"HelloServlet",new HelloServlet());
        context.addServletMappingDecoded("/hello","HelloServlet");
        System.out.println(tm.getConnector().getPort());
        tm.start();
        tm.getServer().await();
    }
}
