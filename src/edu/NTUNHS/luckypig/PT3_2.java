package edu.NTUNHS.luckypig;

import java.util.Scanner;

public class PT3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("是否要一次輸出三種圖形(輸入y或n):");
        String outputAll = sc.next();
        if (outputAll.equals("y")) {
            System.out.print("請輸入一個正整數(代表要印出的圖形層數):");
            int n = sc.nextInt();
            modeA(n);
            modeB(n);
            modeC(n);
        } else if (outputAll.equals("n")) {
            System.out.print("請輸入要輸出的圖形模式(a.正三角形、b.倒三角形、c.數字三角形):");
            String input = sc.next();
            System.out.print("請輸入一個正整數(代表要印出的圖形層數):");
            int n = sc.nextInt();
            if (input.equals("a")) {
                modeA(n);
            } else if (input.equals("b")) {
                modeB(n);
            } else if (input.equals("c")) {
                modeC(n);
            } else
                System.out.println("您輸入的模式或層數有誤喔!");
        } else {
            System.out.println("您的輸入有誤喔!");
        }
        sc.close();
    }

    private static void modeA(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        System.out.println("==================End=Of=ModeA==================");
    }

    private static void modeB(int n) {
        for (int i = 0; i < n; i++) {// 層數
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int h = n - i; h > 0; h--) {
                System.out.print("*");
            }
            System.out.println("");// 換行
        }
        System.out.println("==================End=Of=ModeB==================");
    }

    private static void modeC(int n) {
        int outputNumber = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(outputNumber + "\t");
                outputNumber += 1;
            }
            System.out.println("");
        }
        System.out.println("==================End=Of=ModeC==================");
    }
}