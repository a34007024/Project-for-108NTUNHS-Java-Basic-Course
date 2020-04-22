package edu.NTUNHS.luckypig;

public class for_each {
    public static void main(String[] args) {
        char[] c = new char[100];
        for(char i = 0; i < 100; i++) {
            c[i] = i;
        }

        for (char charElement : c) {//for-each loop 裡面的變數是直接用來撈取陣列內的值
            System.out.print(charElement + "\t");
        }
    }

}