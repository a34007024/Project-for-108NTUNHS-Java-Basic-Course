package edu.NTUNHS.luckypig;

public class for_each {
    public static void main(String[] args) {
        char[] c = new char[100];
        for(char i = 0; i < 100; i++) {
            c[i] = i;
        }

        for(int j : c){//for-each loop
            System.out.println("c[" + j + "]=" + c[j]);
        };
    }

}