package org.example;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien alien = context.getBean("alien",Alien.class);
        System.out.println(alien.getAge());
        alien.code();

        //Only object created when we're using by lazy-init="true" in spring.xml
        //Desktop desktop = context.getBean("com2",Desktop.class);

        System.out.println("Hello World 25Feb 2025");
        System.out.println("Ended with 167");
        
        System.out.println("Hello World 26Feb 2025");
        System.out.println("Hello World 28Feb 2025");

    }
}
