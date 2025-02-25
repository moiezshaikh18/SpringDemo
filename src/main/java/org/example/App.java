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

        System.out.println("Hello World");

    }
}
