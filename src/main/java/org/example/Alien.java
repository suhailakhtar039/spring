package org.example;

public class Alien {

    private int age;
    private Laptop lap;
    public Alien(){
        System.out.println("Object Created");
    }

    public Alien(int age) {
        System.out.println("Para constructor called");
        this.age = age;
    }

    public void code(){
        System.out.println("Coding..");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }
}
