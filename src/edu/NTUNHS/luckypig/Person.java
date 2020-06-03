package edu.NTUNHS.luckypig;

public class Person {
    protected String name;//protected 表示自己和繼承的子類別可以存取
    private double height;
    private double weight;
    Person(){
        name = "null";
    }
    Person(String name){
        this.name = name;
    }
    Person(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    double BMI(){
        return weight/(height*height);
    }

    void printBMI(){
        System.out.println(name+"的BMI為:"+BMI());
    }

    String getName(){
        return name;
    }
}