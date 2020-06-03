package edu.NTUNHS.luckypig;

public class Student extends Person {
    private double chineseScore;
    private double englishScore;
    private double mathScore;

    Student() {

    }

    Student(double chScore, double enScore, double mathSC) {
        this.chineseScore = chScore;
        this.englishScore = enScore;
        this.mathScore = mathSC;
    }

    public double getSum() {
        return chineseScore + englishScore + mathScore;
    }

    public double getAverage() {
        return (chineseScore + englishScore + mathScore) / 3;
    }

    public void printSum(){
        System.out.println(name + "的總分為:"+ getSum() +"分");
    }
}