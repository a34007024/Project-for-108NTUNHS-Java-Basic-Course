package edu.NTUNHS.luckypig;

public class Person {
    private String name;
    private double height;
    private double weight;
    Person(String name){
        this.name = name;
    }
    Person(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double calBMI(){
        return weight/(height*height);
    }

    void printBMI(){
        System.out.println(name+"的BMI為:"+calBMI());
    }
}