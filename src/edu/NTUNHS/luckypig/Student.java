package edu.NTUNHS.luckypig;

public class Student extends Person {
    private double chineseScore;
    private double englishScore;
    private double mathScore;

    Student(String name) {
        super(name);
    }

    Student(double chScore, double enScore, double mathSC) {
        // super();//name will automatic set to "null"
        this.chineseScore = chScore;
        this.englishScore = enScore;
        this.mathScore = mathSC;
    }

    Student(String name, double chScore, double enScore, double mathSC) {
        super(name);//super()是指父類別的建構子，可以去參閱Person.java內的建構子
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

    public void printSum() {
        System.out.println(name + "的總分為:" + getSum() + "分");
    }
}