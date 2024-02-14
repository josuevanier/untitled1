package org.example;

public class Dog extends Animal{
    int num;
    public void makeNoise(){
        System.out.println("Woof woof");

    }
    public Dog(String name, int age){
        super(name,age);

    }
    public Dog(){}

}
