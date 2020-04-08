package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class PT3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入要輸出的圖形模式(a.正三角形、b.倒三角形、c.數字三角形):");
        String input = sc.next();
        System.out.print("請輸入一個正整數(代表要印出的圖形層數):");
        int n = sc.nextInt();
        sc.close();
        if (input.equals("a")) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < i + 1; j++) {
                    System.out.print("*");
                }
                System.out.println("");
            }
        } else if (input.equals("b")) {
            for (int i = n; i > 0; i--) {
                //to-do 完成倒三角形的輸出模式
            }
        } else if (input.equals("c")) {
            int outputNumber = 1;
            for(int i=0;i<n;i++){
                for (int j = 0; j < i + 1; j++) {
                    System.out.print(outputNumber + "\t");
                    outputNumber += 1;
                }
                System.out.println("");
            }
        }else System.out.println("您輸入的模式或層數有誤喔!");
    }
}