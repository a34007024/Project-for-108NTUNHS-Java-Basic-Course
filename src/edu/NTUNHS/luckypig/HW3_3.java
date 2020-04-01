package edu.NTUNHS.luckypig;

import java.util.*;

/**
 * HW3_3 階乘加法器
 */
public class HW3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入一個<=20的整數:");
        int inputNum = sc.nextInt();
        sc.close();
        long factorial_total = 0;
        long factorial_cache = 1;//don't use int , 20! is too big for int to store!
        for (int i = 1; i <= inputNum; i++) {
            factorial_cache = 1;//reset factorial_cache to store the next factorial value
            for(int j = 1 ; j <= i; j ++){
                factorial_cache *= j;
            }
            factorial_total += factorial_cache;
        }
        System.out.println("1! 加到" + inputNum + "!的總和為:" + factorial_total);
        System.out.println(inputNum + "!的值為:" + factorial_cache);
    }
}