package org.example;

public class Alien {

    private int age;
    private Computer com;

    // Default constructor required by Spring
    public Alien() {
        System.out.println("Alien Object Created (Default Constructor)");
    }

    public Alien(int age, Computer com) {
        this.age = age;
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Coding....");
        com.compile();
    }
}
