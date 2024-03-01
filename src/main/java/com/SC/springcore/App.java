package com.SC.springcore;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.SC.Student.SD;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
         
         SD sd = (SD)applicationContext.getBean("studentBean");
         
         System.out.println(sd);
        
        
    }
    
    
    
}
